package xsna;

import com.vk.auth.api.models.AuthResult;
import java.util.Iterator;
import java.util.List;
import xsna.p4g;
import xsna.pzx;
import xsna.q55;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class cdd implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ cdd(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                vhk0.c((String) obj);
                break;
            case 1:
                ((ndn) obj).o.b(null);
                break;
            case 2:
                ((kzx) obj).T(new pzx.e(false));
                break;
            case 3:
                ((mcs0) obj).l = false;
                break;
            case 4:
                uut0 uut0Var = (uut0) obj;
                if (uut0Var.g) {
                    uut0Var.g = false;
                    uut0Var.i.removeCallbacksAndMessages(null);
                    break;
                }
                break;
            default:
                AuthResult authResult = (AuthResult) obj;
                q55 q55Var = q55.a;
                List y0 = j5g.y0(q55.b);
                q55.b bVar = new q55.b(par0.a);
                p4g.a aVar = p4g.a;
                Iterator it = y0.iterator();
                while (it.hasNext()) {
                    try {
                        ((s25) it.next()).n(authResult);
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        bVar.invoke(th);
                    }
                }
                break;
        }
    }
}
