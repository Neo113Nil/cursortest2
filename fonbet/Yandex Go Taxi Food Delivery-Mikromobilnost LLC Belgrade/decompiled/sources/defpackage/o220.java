package defpackage;

import com.yandex.messenger.websdk.api.UserUnreadCounters;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes5.dex */
public final class o220 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ n0 b;

    public /* synthetic */ o220(n0 n0Var, int i) {
        this.a = i;
        this.b = n0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        n0 n0Var = this.b;
        switch (i) {
            case 0:
                jgz jgzVar = jgz.a;
                jgz.c((Throwable) obj);
                n0Var.g(0);
                break;
            default:
                Integer num = ((UserUnreadCounters) obj).c;
                if (num != null) {
                    n0Var.g(Integer.valueOf(num.intValue()));
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
