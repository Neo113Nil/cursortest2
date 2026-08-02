package defpackage;

import android.os.Looper;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.ChatSearchObservable$requestSearch$$inlined$suspendDisposable$1$1;
import com.yandex.messaging.profile.ProfileHolder$subscribe$$inlined$suspendDisposable$1$1;
import com.yandex.messaging.profile.d;

/* loaded from: classes15.dex */
public final class pf4 implements e1k {
    public final /* synthetic */ int a = 3;
    public final Object b;
    public final /* synthetic */ Object c;

    public pf4(qf4 qf4Var, of4 of4Var) {
        this.c = qf4Var;
        z83.g(null, qf4Var.a, Looper.myLooper());
        this.b = of4Var;
        qf4Var.b.b(of4Var);
        of4Var.a(qf4Var.f);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                qf4 qf4Var = (qf4) obj;
                z83.g(null, qf4Var.a, Looper.myLooper());
                qf4Var.b.d((of4) obj2);
                break;
            case 1:
                ((pzt0) obj2).a(null);
                break;
            case 2:
                ((pzt0) obj2).a(null);
                break;
            default:
                q3f0 q3f0Var = (q3f0) obj;
                q3f0Var.getClass();
                tje.e();
                q3f0Var.c.d((ebz0) obj2);
                break;
        }
    }

    public pf4(ike ikeVar, o9b o9bVar, ChatRequest chatRequest, String str, n9b n9bVar) {
        this.c = chatRequest;
        this.b = tje.N(ikeVar, null, null, new ChatSearchObservable$requestSearch$$inlined$suspendDisposable$1$1(null, o9bVar, chatRequest, str, n9bVar), 3);
    }

    public pf4(ike ikeVar, d dVar, tls tlsVar) {
        this.c = tlsVar;
        this.b = tje.N(ikeVar, null, null, new ProfileHolder$subscribe$$inlined$suspendDisposable$1$1(tlsVar, dVar, null), 3);
    }

    public pf4(ebz0 ebz0Var, q3f0 q3f0Var) {
        this.b = ebz0Var;
        this.c = q3f0Var;
    }
}
