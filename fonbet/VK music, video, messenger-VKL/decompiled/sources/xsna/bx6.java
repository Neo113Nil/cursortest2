package xsna;

import androidx.credentials.provider.Action;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import java.util.List;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class bx6 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bx6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Action convertToJetpackResponse$lambda$9;
        switch (this.a) {
            case 0:
                convertToJetpackResponse$lambda$9 = BeginGetCredentialUtil.Companion.convertToJetpackResponse$lambda$9((izs) this.b, obj);
                return convertToJetpackResponse$lambda$9;
            default:
                fkh0 fkh0Var = (fkh0) this.b;
                q8x q8xVar = (q8x) obj;
                ln5 ln5Var = fkh0Var.e;
                List<lqf0> list = fkh0Var.c;
                fkh0Var.h.apply(q8xVar);
                return new dkh0(ln5Var, q8xVar, list, bj20.a);
        }
    }
}
