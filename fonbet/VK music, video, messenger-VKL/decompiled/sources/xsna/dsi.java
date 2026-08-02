package xsna;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.typing.ComposingType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: ComposingManagerImpl.java */
/* loaded from: classes.dex */
public final class dsi implements csi {
    public static final long h = TimeUnit.SECONDS.toMillis(6);
    public static final String i = csi.class.getSimpleName();

    @NonNull
    public final w2w a;

    @NonNull
    public final Handler d = new Handler(Looper.getMainLooper());

    @NonNull
    public final Map<krp, Object> e = Collections.synchronizedMap(new HashMap());

    @NonNull
    public final vvb0 f = new vvb0(20);
    public volatile boolean g = false;

    @NonNull
    public final Object b = new Object();

    @NonNull
    public final HashMap c = new HashMap();

    /* compiled from: ComposingManagerImpl.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public final /* synthetic */ long b;
        public final /* synthetic */ vh30 c;

        public a(long j, vh30 vh30Var) {
            this.b = j;
            this.c = vh30Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (dsi.this.b) {
                dsi.this.f(this.b, this.c);
            }
        }
    }

    public dsi(@NonNull w2w w2wVar) {
        this.a = w2wVar;
    }

    @Override // xsna.csi
    public final LinkedHashMap a() {
        LinkedHashMap linkedHashMap;
        synchronized (this.b) {
            HashMap hashMap = this.c;
            g54 g54Var = new g54(17);
            linkedHashMap = new LinkedHashMap(on00.e(hashMap.size()));
            for (Object obj : hashMap.entrySet()) {
                linkedHashMap.put(((Map.Entry) obj).getKey(), g54Var.invoke(obj));
            }
        }
        return linkedHashMap;
    }

    @Override // xsna.csi
    public final ArrayList<vh30> b(long j) {
        ArrayList<vh30> arrayList;
        synchronized (this.b) {
            try {
                arrayList = this.c.containsKey(Long.valueOf(j)) ? new ArrayList<>((Collection) this.c.get(Long.valueOf(j))) : new ArrayList<>(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    @Override // xsna.csi
    public final void c(@NonNull Map<Long, ? extends Set<Long>> map) {
        synchronized (this.b) {
            try {
                for (Map.Entry<Long, ? extends Set<Long>> entry : map.entrySet()) {
                    long longValue = entry.getKey().longValue();
                    Iterator<Long> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        long longValue2 = it.next().longValue();
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        f(longValue, new vh30(Peer.a.b(longValue2), ComposingType.TEXT));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.csi
    public final void d(Map<Long, ? extends Set<Long>> map, ComposingType composingType) {
        synchronized (this.b) {
            try {
                for (Map.Entry<Long, ? extends Set<Long>> entry : map.entrySet()) {
                    long longValue = entry.getKey().longValue();
                    Iterator<Long> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        long longValue2 = it.next().longValue();
                        if (longValue2 != this.a.H0().b) {
                            Serializer.c<Peer> cVar = Peer.CREATOR;
                            e(longValue, new vh30(Peer.a.b(longValue2), composingType));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(long j, vh30 vh30Var) {
        if (this.g) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("ComposingManager is already shuted down"));
            return;
        }
        krp krpVar = new krp(j, vh30Var);
        Map<krp, Object> map = this.e;
        Object obj = map.get(krpVar);
        if (obj != null) {
            this.d.removeCallbacksAndMessages(obj);
            map.remove(krpVar);
            this.f.a(obj);
        }
        Set set = (Set) this.c.get(Long.valueOf(j));
        if (set == null) {
            set = new HashSet();
            this.c.put(Long.valueOf(j), set);
        }
        boolean z = set.contains(vh30Var) || set.add(vh30Var);
        a aVar = new a(j, vh30Var);
        Object c = this.f.c();
        if (c == null) {
            c = new Object();
        }
        this.d.postAtTime(aVar, c, SystemClock.uptimeMillis() + h);
        this.e.put(krpVar, c);
        if (z) {
            this.a.e1(this, new nc80(i, j, vh30Var));
        }
    }

    public final void f(long j, vh30 vh30Var) {
        krp krpVar = new krp(j, vh30Var);
        Map<krp, Object> map = this.e;
        Object obj = map.get(krpVar);
        if (obj != null) {
            this.d.removeCallbacksAndMessages(obj);
            map.remove(krpVar);
            this.f.a(obj);
        }
        Set set = (Set) this.c.get(Long.valueOf(j));
        if (set != null ? set.remove(vh30Var) : false) {
            this.a.e1(this, new oc80(i, j, vh30Var));
        }
    }
}
