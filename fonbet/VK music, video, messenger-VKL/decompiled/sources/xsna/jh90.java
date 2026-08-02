package xsna;

import android.opengl.GLES20;
import android.os.Looper;
import com.vk.media.pipeline.gl.GlException;
import com.vk.media.pipeline.model.item.VideoItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import xsna.dkt0;

/* compiled from: ParallelPreparingDecodersController.kt */
/* loaded from: classes3.dex */
public final class jh90 extends qq6 {
    public final xmt0 g;
    public final int h;
    public final AtomicInteger i;
    public final ExecutorService j;
    public final ConcurrentHashMap<Pair<Integer, VideoItem>, Future<m8l>> k;
    public volatile Pair<Integer, ? extends VideoItem> l;
    public int m;
    public List<? extends c7s0> n;
    public ArrayList o;

    public jh90(csp cspVar, Looper looper, b0u b0uVar, int i, xmt0 xmt0Var, lzf lzfVar) {
        super(cspVar, looper, b0uVar, i, lzfVar, null);
        int i2;
        this.g = xmt0Var;
        wwf0 wwf0Var = wwf0.c;
        f100 f100Var = cspVar.d;
        int i3 = 0;
        try {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            wwf0.o(wwf0Var, null, 3);
            i2 = iArr[0];
        } catch (Throwable th) {
            if (f100Var != null) {
                f100Var.a("ParallelPreparingDecodersController", th);
            }
        }
        if (i2 == 0) {
            throw new GlException("Wrong texId=0, egl context?");
        }
        i3 = i2;
        this.h = i3;
        this.i = new AtomicInteger();
        this.j = asu0.B(3, new ThreadFactory() { // from class: xsna.ih90
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "decoder-preparing-thread-" + jh90.this.i.getAndIncrement());
            }
        });
        this.k = new ConcurrentHashMap<>();
    }

    @Override // xsna.qq6
    public final klt0 a(int i, VideoItem videoItem) {
        this.m = i;
        Pair<Integer, ? extends VideoItem> pair = new Pair<>(Integer.valueOf(i), videoItem);
        g(pair);
        Future<m8l> remove = this.k.remove(pair);
        this.l = pair;
        m8l m8lVar = remove.get();
        n6t0 n6t0Var = m8lVar.a;
        xmt0 xmt0Var = this.g;
        n6t0Var.b = xmt0Var;
        l8l l8lVar = m8lVar.f;
        if (l8lVar != null) {
            xmt0Var.d(l8lVar);
        }
        this.l = null;
        return m8lVar.g;
    }

    @Override // xsna.qq6
    public final void d(List<? extends c7s0> list) {
        this.n = list;
        List<? extends c7s0> list2 = list;
        ArrayList<Pair> arrayList = new ArrayList(c5g.u(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            arrayList.add(new Pair(Integer.valueOf(i), ((c7s0) obj).getLayout().b));
            i = i2;
        }
        this.o = arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            VideoItem videoItem = (VideoItem) pair.j();
            int intValue = ((Number) pair.i()).intValue();
            Object obj2 = linkedHashMap.get(videoItem);
            if (obj2 == null) {
                obj2 = new TreeSet();
                linkedHashMap.put(videoItem, obj2);
            }
            ((Set) obj2).add(Integer.valueOf(intValue));
        }
        ConcurrentHashMap<Pair<Integer, VideoItem>, Future<m8l>> concurrentHashMap = this.k;
        for (Pair<Integer, VideoItem> pair2 : concurrentHashMap.keySet()) {
            Future<m8l> remove = concurrentHashMap.remove(pair2);
            if (remove != null) {
                VideoItem j = pair2.j();
                Set set = (Set) linkedHashMap.get(j);
                if (set != null) {
                    Integer num = (Integer) j5g.Z(set);
                    if (num != null) {
                        set.remove(num);
                        Pair<Integer, VideoItem> pair3 = new Pair<>(num, j);
                        Future<m8l> remove2 = concurrentHashMap.remove(pair3);
                        if (remove2 != null) {
                            h(remove2);
                        }
                        concurrentHashMap.put(pair3, remove);
                    } else {
                        linkedHashMap.remove(j);
                    }
                }
                h(remove);
            }
        }
        int min = Math.min(this.m, list.size() - 1);
        this.m = min;
        g(new Pair<>(Integer.valueOf(min), list.get(this.m).getLayout().b));
    }

    @Override // xsna.qq6
    public final void e() {
        f(false);
        ConcurrentHashMap<Pair<Integer, VideoItem>, Future<m8l>> concurrentHashMap = this.k;
        Iterator<T> it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            h((Future) it.next());
        }
        concurrentHashMap.clear();
        this.j.shutdown();
        f100 f100Var = this.a.d;
        GLES20.glDeleteTextures(1, new int[]{this.h}, 0);
        GlException r = wwf0.r();
        if (r != null && f100Var != null) {
            f100Var.a("ParallelPreparingDecodersController", r);
        } else if (r != null) {
            throw r;
        }
    }

    public final void g(Pair<Integer, ? extends VideoItem> pair) {
        ConcurrentHashMap<Pair<Integer, VideoItem>, Future<m8l>> concurrentHashMap;
        ArrayList arrayList = this.o;
        if (arrayList == null) {
            arrayList = null;
        }
        final int indexOf = arrayList.indexOf(pair);
        List H0 = j5g.H0(arrayList, indexOf);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = H0.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            concurrentHashMap = this.k;
            if (!hasNext) {
                break;
            }
            Future<m8l> remove = concurrentHashMap.remove((Pair) it.next());
            if (remove != null) {
                arrayList2.add(remove);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            h((Future) it2.next());
        }
        int i = indexOf + 5;
        int min = Math.min(i, arrayList.size());
        while (indexOf < min) {
            if (!concurrentHashMap.containsKey(arrayList.get(indexOf))) {
                final Pair<Integer, VideoItem> pair2 = (Pair) arrayList.get(indexOf);
                concurrentHashMap.put(pair2, this.j.submit(new Callable() { // from class: xsna.hh90
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
                    
                        java.lang.Thread.currentThread().interrupt();
                        r2.b(false);
                     */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object call() {
                        jh90 jh90Var = jh90.this;
                        Pair pair3 = pair2;
                        int i2 = indexOf;
                        n6t0 c = jh90Var.c((VideoItem) pair3.j(), jh90Var.d, jh90Var.g, jh90Var.h);
                        csp cspVar = jh90Var.a;
                        List<? extends c7s0> list = jh90Var.n;
                        if (list == null) {
                            list = null;
                        }
                        c7s0 c7s0Var = list.get(i2);
                        m8l m8lVar = new m8l(cspVar, c7s0Var, c, pair3, new hvz(jh90Var, 20));
                        klt0 klt0Var = m8lVar.g;
                        dkt0.a aVar = m8lVar.d;
                        try {
                            aVar.e.seekTo(c7s0Var.getLayout().b.O0());
                            boolean z = false;
                            while (!m8lVar.e && !z && !epx.f(((jh90) m8lVar.c.c).l, m8lVar.b)) {
                                aVar.a();
                                klt0Var.a(aVar.f, aVar.e);
                                z = Thread.interrupted();
                            }
                            return m8lVar;
                        } catch (Throwable th) {
                            klt0Var.b(false);
                            throw th;
                        }
                    }
                }));
            }
            indexOf++;
        }
        int size = arrayList.size();
        while (i < size) {
            Future<m8l> remove2 = concurrentHashMap.remove(arrayList.get(i));
            if (remove2 != null) {
                h(remove2);
            }
            i++;
        }
    }

    public final void h(Future<m8l> future) {
        if (future.cancel(true)) {
            return;
        }
        try {
            future.get().g.b(false);
        } catch (Throwable th) {
            f100 f100Var = this.a.d;
            if (f100Var != null) {
                f100Var.a("ParallelPreparingDecodersController", th);
            }
        }
    }
}
