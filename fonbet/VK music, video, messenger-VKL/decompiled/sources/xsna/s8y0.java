package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;
import xsna.bvy0;

/* compiled from: DI.kt */
/* loaded from: classes.dex */
public final class s8y0 {
    public static volatile s8y0 h;
    public final Context a;
    public final bpn0 b = new bpn0(new c());
    public final bpn0 c = new bpn0(new b());
    public final Handler d = new Handler(Looper.getMainLooper());
    public final int e = Math.max(3, Runtime.getRuntime().availableProcessors());
    public final bpn0 f = new bpn0(new a());
    public boolean g;

    /* compiled from: DI.kt */
    public static final class a extends Lambda implements gzs<ThreadPoolExecutor> {
        public a() {
            super(0);
        }

        @Override // xsna.gzs
        public final ThreadPoolExecutor invoke() {
            int i = s8y0.this.e;
            return new ThreadPoolExecutor(i, i << 1, 10L, TimeUnit.SECONDS, new SynchronousQueue());
        }
    }

    /* compiled from: DI.kt */
    public static final class b extends Lambda implements gzs<sey0> {
        public b() {
            super(0);
        }

        @Override // xsna.gzs
        public final sey0 invoke() {
            return new sey0(s8y0.this.a);
        }
    }

    /* compiled from: DI.kt */
    public static final class c extends Lambda implements gzs<bvy0> {
        public c() {
            super(0);
        }

        @Override // xsna.gzs
        public final bvy0 invoke() {
            return bvy0.a.a(s8y0.this.a);
        }
    }

    /* compiled from: DI.kt */
    public static final class d {
        public static s8y0 a() {
            s8y0 s8y0Var = s8y0.h;
            if (s8y0Var != null) {
                return s8y0Var;
            }
            throw new IllegalStateException("DI is not initialized!");
        }
    }

    public s8y0(Context context) {
        this.a = context;
    }
}
