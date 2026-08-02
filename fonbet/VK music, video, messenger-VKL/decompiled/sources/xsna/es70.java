package xsna;

import com.vk.ecomm.verifiedseller.impl.screens.obtainverification.model.ObtainVerificationScreenContent;
import kotlin.NoWhenBranchMatchedException;
import xsna.bs70;
import xsna.ds70;

/* compiled from: ObtainVerificationReducer.kt */
/* loaded from: classes18.dex */
public final class es70 extends dm50<qs70, ds70, bs70> {
    @Override // xsna.dm50
    public final bs70 c(bs70 bs70Var, ds70 ds70Var) {
        bs70 bs70Var2 = bs70Var;
        ds70 ds70Var2 = ds70Var;
        if (ds70Var2 instanceof ds70.a) {
            return new bs70.a(((ds70.a) ds70Var2).b);
        }
        if (ds70Var2 instanceof ds70.e) {
            return new bs70.c(((ds70.e) ds70Var2).b, null, ObtainVerificationScreenContent.CurrentModalType.NONE, false);
        }
        if (ds70Var2 instanceof ds70.f) {
            return bs70Var2 instanceof bs70.c ? bs70.c.a((bs70.c) bs70Var2, ((ds70.f) ds70Var2).b, null, null, false, 6) : bs70Var2;
        }
        if (ds70Var2 instanceof ds70.d) {
            return bs70Var2 instanceof bs70.c ? bs70.c.a((bs70.c) bs70Var2, null, ((ds70.d) ds70Var2).b, ObtainVerificationScreenContent.CurrentModalType.UNLINK, false, 1) : bs70Var2;
        }
        if (ds70Var2 instanceof ds70.c) {
            return bs70Var2 instanceof bs70.c ? bs70.c.a((bs70.c) bs70Var2, null, null, ((ds70.c) ds70Var2).b, false, 3) : bs70Var2;
        }
        if (ds70Var2 instanceof ds70.b) {
            return bs70.b.b;
        }
        if (ds70Var2 instanceof ds70.g) {
            return bs70Var2 instanceof bs70.c ? bs70.c.a((bs70.c) bs70Var2, null, null, null, ((ds70.g) ds70Var2).b, 7) : bs70Var2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.dm50
    public final qs70 d() {
        return new qs70(e(new dn20(this, 10)));
    }

    @Override // xsna.dm50
    public final void h(bs70 bs70Var, qs70 qs70Var) {
        f(qs70Var.a, bs70Var);
    }
}
