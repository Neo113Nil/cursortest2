package xsna;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;

/* compiled from: MusicOfflineCacheProviderImpl.kt */
/* loaded from: classes.dex */
public final class sp40 implements qp40 {
    public static final a k = new a();
    public static final LinkedHashMap l = new LinkedHashMap();
    public final Context a;
    public final k850 b;
    public volatile boolean f;
    public volatile boolean g;
    public final bpn0 c = new bpn0(new apf(this, 5));
    public final bpn0 d = new bpn0(new bpf(this, 2));
    public final bpn0 e = new bpn0(new j55(8));
    public final bpn0 h = new bpn0(new s0f(this, 4));
    public final bpn0 i = new bpn0(new an(this, 5));
    public final b j = new b();

    /* compiled from: MusicOfflineCacheProviderImpl.kt */
    public static final class a {
    }

    /* compiled from: MusicOfflineCacheProviderImpl.kt */
    public static final class b extends h370 {
        public b() {
            super(0);
        }

        @Override // androidx.media3.datasource.cache.b
        public final void onCacheInitialized() {
            boolean z;
            boolean z2;
            sp40 sp40Var = sp40.this;
            try {
                ((androidx.media3.datasource.cache.c) sp40Var.i.getValue()).j();
                z2 = true;
            } catch (Throwable th) {
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                StringBuilder sb = new StringBuilder("Music private cache initialization failed can_write:");
                try {
                    z = ((File) sp40.this.e.getValue()).canWrite();
                } catch (SecurityException unused) {
                    z = false;
                }
                sb.append(z);
                bVar.q(new IllegalStateException(sb.toString(), th));
                z2 = false;
            }
            sp40Var.f = z2;
        }
    }

    public sp40(Context context, k850 k850Var) {
        this.a = context;
        this.b = k850Var;
    }

    @Override // xsna.qp40
    public final boolean a() {
        return this.f && this.g;
    }

    @Override // xsna.qp40
    public final mu70 getCache() {
        return (mu70) this.c.getValue();
    }
}
