package xsna;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;

/* compiled from: VisitorTracker.kt */
/* loaded from: classes6.dex */
public final class w5u0 {
    public final long a;
    public final String b;
    public final stg0 c;
    public io.reactivex.rxjava3.disposables.c d;
    public long e;
    public long f;

    /* compiled from: VisitorTracker.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xgx0) this.receiver).getClass();
            xgx0.d(th);
            return s3q0.a;
        }
    }

    public w5u0(long j, String str, stg0 stg0Var) {
        this.a = j;
        this.b = str;
        this.c = stg0Var;
    }

    public final io.reactivex.rxjava3.disposables.c a(long j) {
        io.reactivex.rxjava3.disposables.c subscribe = io.reactivex.rxjava3.core.q.P(j, 60000L, TimeUnit.MILLISECONDS).subscribe(new u0o0(new vlc0(this, 28), 8), new epq0(new a(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 4));
        this.d = subscribe;
        return subscribe;
    }
}
