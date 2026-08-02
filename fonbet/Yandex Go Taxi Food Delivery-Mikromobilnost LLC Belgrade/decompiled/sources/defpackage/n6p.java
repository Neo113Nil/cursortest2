package defpackage;

import com.yandex.fintechsdk.core.analytics.impl.internal.a;
import java.util.List;

/* loaded from: classes12.dex */
public final class n6p {
    public final j6p a;
    public final wm50 b;
    public final sh5 c;
    public final z22 d;

    public n6p(j6p j6pVar, wm50 wm50Var, sh5 sh5Var, z22 z22Var) {
        this.a = j6pVar;
        this.b = wm50Var;
        this.c = sh5Var;
        this.d = z22Var;
    }

    public final void a(Throwable th) {
        String th2 = th.toString();
        j6p j6pVar = this.a;
        List list = j6pVar.c;
        if (list != null) {
            bia1.j(this.c, list, th2);
        }
        vm50 vm50Var = j6pVar.e;
        if (vm50Var != null) {
            this.b.dispatch(vm50Var);
        }
        ((a) this.d).a(new l6p(j6pVar, "ft_request_action_failure", th2));
    }
}
