package xsna;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Lambda;

/* compiled from: TaskThreadHelper.kt */
/* loaded from: classes9.dex */
public final class f7o0 {
    public static final bpn0 a = new bpn0(a.i);
    public static final bpn0 b = new bpn0(b.i);

    /* compiled from: TaskThreadHelper.kt */
    public static final class a extends Lambda implements gzs<ExecutorService> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final ExecutorService invoke() {
            return Executors.newFixedThreadPool(1);
        }
    }

    /* compiled from: TaskThreadHelper.kt */
    public static final class b extends Lambda implements gzs<Handler> {
        public static final b i = new b(0);

        @Override // xsna.gzs
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }
}
