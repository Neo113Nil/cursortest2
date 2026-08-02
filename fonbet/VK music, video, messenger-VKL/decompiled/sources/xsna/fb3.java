package xsna;

import com.vk.api.sdk.auth.AccountProfileType;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ls;
import xsna.usi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class fb3 implements izs {
    public final /* synthetic */ int b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                nb3.d.getClass();
                o6r0 c = q6r0.c();
                for (ls lsVar : (List) obj) {
                    if (!(lsVar instanceof ls.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c.l(((ls.a) lsVar).a());
                    s3q0 s3q0Var = s3q0.a;
                }
                c.f();
                return s3q0.a;
            default:
                usi0 usi0Var = (usi0) obj;
                if (!(usi0Var instanceof usi0.a)) {
                    return null;
                }
                usi0.a aVar = (usi0.a) usi0Var;
                return new usi0.a(new vj(aVar.a().e(), aVar.a().d(), aVar.a().c()), new fhq0(aVar.c().b(), AccountProfileType.NORMAL), aVar.d);
        }
    }
}
