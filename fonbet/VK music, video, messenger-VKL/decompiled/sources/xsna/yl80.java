package xsna;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.e;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;
import xsna.ewo0;
import xsna.kr10;
import xsna.xu1;

/* compiled from: OneVideoLoadControl.java */
/* loaded from: classes8.dex */
public final class yl80 implements androidx.media3.exoplayer.e {
    public static final com.google.common.collect.g n = ImmutableList.t(X3.i.b, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT, "data", "android.resource", RawResourceDataSource.RAW_RESOURCE_SCHEME, "asset");
    public final ewo0.c a;
    public final ewo0.b b;
    public final z9l c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final boolean i;
    public final ImmutableMap<String, Integer> j;
    public final ConcurrentHashMap<x1b0, c> k;
    public long l;
    public final Supplier<zl80> m;

    /* compiled from: OneVideoLoadControl.java */
    public static class a {
        public final HashMap<String, Integer> a;

        @Nullable
        public z9l b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final boolean h;
        public boolean i;
        public Supplier<zl80> j;

        public a() {
            HashMap<String, Integer> hashMap = new HashMap<>();
            this.a = hashMap;
            hashMap.put(x1b0.d.a, 144179200);
            this.c = 1000;
            this.d = 50000;
            this.e = 1000;
            this.f = 1000;
            this.g = -1;
            this.h = true;
            this.j = new xl80();
        }
    }

    /* compiled from: OneVideoLoadControl.java */
    @SuppressLint({"RestrictedApi"})
    public final class b implements xu1 {
        public final HashMap<vu1, x1b0> a = new HashMap<>();
        public final x1b0 b;

        public b(x1b0 x1b0Var) {
            this.b = x1b0Var;
        }

        @Override // xsna.xu1
        public final synchronized void a(vu1 vu1Var) {
            yl80.this.c.a(vu1Var);
            c(vu1Var);
        }

        @Override // xsna.xu1
        public final synchronized vu1 allocate() {
            vu1 allocate;
            allocate = yl80.this.c.allocate();
            this.a.put(allocate, this.b);
            c cVar = yl80.this.k.get(this.b);
            if (cVar != null) {
                synchronized (cVar) {
                    cVar.d++;
                }
            }
            return allocate;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [xsna.xu1$a] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v4, types: [androidx.media3.exoplayer.source.o$a] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        @Override // xsna.xu1
        public final synchronized void b(@Nullable xu1.a aVar) {
            yl80.this.c.b(aVar);
            while (aVar != 0) {
                vu1 vu1Var = aVar.c;
                vu1Var.getClass();
                c(vu1Var);
                aVar = aVar.d;
                if (aVar == 0 || aVar.c == null) {
                    aVar = 0;
                }
            }
        }

        public final void c(vu1 vu1Var) {
            x1b0 remove = this.a.remove(vu1Var);
            remove.getClass();
            c cVar = yl80.this.k.get(remove);
            if (cVar != null) {
                synchronized (cVar) {
                    cVar.d--;
                }
            }
        }

        @Override // xsna.xu1
        public final synchronized int getIndividualAllocationLength() {
            return yl80.this.c.b;
        }

        @Override // xsna.xu1
        public final synchronized void trim() {
            yl80.this.c.trim();
        }
    }

    /* compiled from: OneVideoLoadControl.java */
    public static class c {
        public int a = 1;
        public boolean b;
        public int c;
        public int d;
    }

    public yl80(z9l z9lVar, int i, int i2, int i3, int i4, int i5, boolean z, HashMap hashMap, Supplier supplier) {
        i(i3, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        i(i4, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        i(i, i3, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        i(i, i4, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        i(i2, i, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        i(((zl80) supplier.get()).c, 0, "backBufferDurationMs", "0");
        this.a = new ewo0.c();
        this.b = new ewo0.b();
        this.c = z9lVar;
        this.d = y2r0.S(i);
        this.e = y2r0.S(i2);
        this.f = y2r0.S(i3);
        this.g = y2r0.S(i4);
        this.h = i5;
        this.i = z;
        this.k = new ConcurrentHashMap<>();
        this.j = ImmutableMap.a(hashMap);
        this.l = -1L;
        this.m = supplier;
    }

    public static void i(int i, int i2, String str, String str2) {
        fxc0.r(i >= i2, "%s cannot be less than %s", str, str2);
    }

    @Override // androidx.media3.exoplayer.e
    public final boolean a(e.a aVar) {
        int i;
        Supplier<zl80> supplier = this.m;
        x1b0 x1b0Var = aVar.a;
        long j = aVar.d;
        c cVar = this.k.get(x1b0Var);
        cVar.getClass();
        c cVar2 = this.k.get(x1b0Var);
        cVar2.getClass();
        synchronized (cVar2) {
            i = cVar2.d;
        }
        int i2 = i * this.c.b;
        c cVar3 = this.k.get(x1b0Var);
        cVar3.getClass();
        boolean z = i2 >= cVar3.c;
        if (x1b0Var.equals(x1b0.d)) {
            return !z;
        }
        boolean j2 = j(aVar);
        long S = j2 ? this.d : y2r0.S(supplier.get().a);
        long S2 = j2 ? this.e : y2r0.S(supplier.get().b);
        float f = aVar.e;
        if (f > 1.0f) {
            S = Math.min(y2r0.D(S, f), S2);
        }
        if (j < Math.max(S, 500000L)) {
            boolean z2 = (j2 ? this.i : this.m.get().e) || !z;
            cVar.b = z2;
            if (!z2 && j < 500000) {
                ahn.F("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j >= S2 || z) {
            cVar.b = false;
        }
        return cVar.b;
    }

    @Override // androidx.media3.exoplayer.e
    public final boolean b() {
        Iterator<c> it = this.k.values().iterator();
        while (it.hasNext()) {
            if (it.next().b) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.media3.exoplayer.e
    public final void c(e.a aVar, d7q[] d7qVarArr) {
        x1b0 x1b0Var = aVar.a;
        Integer num = this.j.get(x1b0Var.a);
        int intValue = (num == null || num.intValue() == -1) ? this.h : num.intValue();
        c cVar = this.k.get(x1b0Var);
        cVar.getClass();
        if (intValue == -1) {
            boolean j = j(aVar);
            int length = d7qVarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = C.DEFAULT_VIDEO_BUFFER_SIZE;
                if (i < length) {
                    d7q d7qVar = d7qVarArr[i];
                    if (d7qVar != null) {
                        switch (d7qVar.getTrackGroup().c) {
                            case -2:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = j ? 19660800 : 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            case 4:
                                i3 = 26214400;
                                i2 += i3;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i++;
                } else {
                    intValue = y2r0.j(i2, C.DEFAULT_VIDEO_BUFFER_SIZE, 210239488);
                }
            }
        }
        cVar.c = intValue;
        k();
    }

    @Override // androidx.media3.exoplayer.e
    public final void d(x1b0 x1b0Var) {
        ConcurrentHashMap<x1b0, c> concurrentHashMap = this.k;
        c cVar = concurrentHashMap.get(x1b0Var);
        if (cVar != null) {
            int i = cVar.a - 1;
            cVar.a = i;
            if (i == 0) {
                concurrentHashMap.remove(x1b0Var);
                k();
            }
        }
    }

    @Override // androidx.media3.exoplayer.e
    public final xu1 e(x1b0 x1b0Var) {
        return new b(x1b0Var);
    }

    @Override // androidx.media3.exoplayer.e
    public final boolean f(e.a aVar) {
        int i;
        Supplier<zl80> supplier = this.m;
        boolean j = j(aVar);
        x1b0 x1b0Var = aVar.a;
        long G = y2r0.G(aVar.d, aVar.e);
        long S = aVar.f ? j ? this.g : y2r0.S(supplier.get().d) : j ? this.f : y2r0.S(supplier.get().c);
        long j2 = aVar.g;
        if (j2 != C.TIME_UNSET) {
            S = Math.min(j2 / 2, S);
        }
        if (S <= 0 || G >= S) {
            return true;
        }
        if (j ? this.i : this.m.get().e) {
            return false;
        }
        c cVar = this.k.get(x1b0Var);
        cVar.getClass();
        synchronized (cVar) {
            i = cVar.d;
        }
        int i2 = i * this.c.b;
        c cVar2 = this.k.get(x1b0Var);
        cVar2.getClass();
        return i2 >= cVar2.c;
    }

    @Override // androidx.media3.exoplayer.e
    public final void g(x1b0 x1b0Var) {
        long id = Thread.currentThread().getId();
        long j = this.l;
        fxc0.A(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.l = id;
        ConcurrentHashMap<x1b0, c> concurrentHashMap = this.k;
        c cVar = concurrentHashMap.get(x1b0Var);
        if (cVar == null) {
            concurrentHashMap.put(x1b0Var, new c());
        } else {
            cVar.a++;
        }
        c cVar2 = concurrentHashMap.get(x1b0Var);
        cVar2.getClass();
        Integer num = this.j.get(x1b0Var.a);
        int intValue = (num == null || num.intValue() == -1) ? this.h : num.intValue();
        if (intValue == -1) {
            intValue = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        cVar2.c = intValue;
        cVar2.b = false;
    }

    @Override // androidx.media3.exoplayer.e
    public final long getBackBufferDurationUs() {
        return y2r0.S(this.m.get().f);
    }

    @Override // androidx.media3.exoplayer.e
    public final void h(x1b0 x1b0Var) {
        ConcurrentHashMap<x1b0, c> concurrentHashMap = this.k;
        c cVar = concurrentHashMap.get(x1b0Var);
        if (cVar != null) {
            int i = cVar.a - 1;
            cVar.a = i;
            if (i == 0) {
                concurrentHashMap.remove(x1b0Var);
                k();
            }
        }
        if (concurrentHashMap.isEmpty()) {
            this.l = -1L;
        }
    }

    public final boolean j(e.a aVar) {
        ewo0 ewo0Var = aVar.b;
        kr10.f fVar = ewo0Var.m(ewo0Var.g(aVar.c.a, this.b).c, this.a, 0L).c.b;
        if (fVar == null) {
            return false;
        }
        String scheme = fVar.a.getScheme();
        return TextUtils.isEmpty(scheme) || n.contains(scheme);
    }

    public final void k() {
        z9l z9lVar = this.c;
        ConcurrentHashMap<x1b0, c> concurrentHashMap = this.k;
        int i = 0;
        if (concurrentHashMap.isEmpty()) {
            synchronized (z9lVar) {
                if (z9lVar.a) {
                    z9lVar.c(0);
                }
            }
        } else {
            Iterator<c> it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                i += it.next().c;
            }
            z9lVar.c(i);
        }
    }

    @Override // androidx.media3.exoplayer.e
    public final boolean retainBackBufferFromKeyframe() {
        return false;
    }
}
