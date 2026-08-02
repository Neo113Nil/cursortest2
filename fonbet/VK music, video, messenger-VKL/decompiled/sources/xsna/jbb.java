package xsna;

import com.vk.dto.common.id.UserId;
import java.util.concurrent.Callable;

/* compiled from: ChannelRemoveMessagesNotificationsHandler.kt */
/* loaded from: classes.dex */
public final class jbb {
    public final jp9 a;
    public final b25 b;
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();

    public jbb(jp9 jp9Var, b25 b25Var) {
        this.a = jp9Var;
        this.b = b25Var;
    }

    public final void a(final int i, final long j, final boolean z) {
        io.reactivex.rxjava3.internal.operators.completable.m mVar = new io.reactivex.rxjava3.internal.operators.completable.m(new Callable() { // from class: xsna.ibb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                jbb jbbVar = jbb.this;
                jp9 jp9Var = jbbVar.a;
                UserId c = jbbVar.b.c();
                if (!fkq0.c(c)) {
                    c = null;
                }
                jp9Var.b(j, i, c != null ? Long.valueOf(c.b) : null, z);
                return s3q0.a;
            }
        });
        asu0.a.getClass();
        io.reactivex.rxjava3.internal.operators.completable.y q = mVar.q(asu0.t());
        int i2 = kwg0.a;
        this.c.b(io.reactivex.rxjava3.kotlin.c.d(q, new vv0(7), new nu2("ChannelRemoveMessagesNotificationsHandler", 2)));
    }
}
