package defpackage;

import ru.rt.ebs.cryptosdk.core.common.di.ICommonComponent;
import ru.rt.ebs.cryptosdk.core.common.entities.models.ISdkDispatchers;
import ru.rt.ebs.cryptosdk.core.verification.esia.di.IEsiaComponent;
import ru.rt.ebs.cryptosdk.core.verificationFlow.controllers.IVerificationFlowController;
import ru.rt.ebs.cryptosdk.core.verificationFlow.di.IVerificationFlowComponent;
import ru.rt.ebs.cryptosdk.presentation.error.failedVerifcation.b;

/* loaded from: classes4.dex */
public final class ms31 extends is31 {
    public final IVerificationFlowComponent c;
    public final IEsiaComponent w;
    public final jnc x;
    public final ICommonComponent y;

    public ms31(IVerificationFlowComponent iVerificationFlowComponent, IEsiaComponent iEsiaComponent, jnc jncVar, ICommonComponent iCommonComponent) {
        this.c = iVerificationFlowComponent;
        this.w = iEsiaComponent;
        this.x = jncVar;
        this.y = iCommonComponent;
    }

    @Override // defpackage.is31, defpackage.hs31
    public final yr31 create(Class cls) {
        bhb0 bhb0Var;
        cm31 cm31Var;
        if (cls.isAssignableFrom(wjn.class)) {
            return new wjn(this.c.getVerificationFlowController());
        }
        if (cls.isAssignableFrom(p6f0.class)) {
            return new p6f0(this.c.getVerificationFlowController());
        }
        if (cls.isAssignableFrom(ebo.class)) {
            return new ebo(this.c.getVerificationFlowController(), this.w.getEsiaController());
        }
        if (cls.isAssignableFrom(yn31.class)) {
            IVerificationFlowController verificationFlowController = this.c.getVerificationFlowController();
            jnc jncVar = this.x;
            ISdkDispatchers sdkDispatchers = this.y.getSdkDispatchers();
            synchronized (jncVar) {
                cm31Var = new cm31(sdkDispatchers);
            }
            return new yn31(verificationFlowController, cm31Var);
        }
        if (cls.isAssignableFrom(oib0.class)) {
            IVerificationFlowController verificationFlowController2 = this.c.getVerificationFlowController();
            synchronized (this.x) {
                bhb0Var = new bhb0();
            }
            return new oib0(verificationFlowController2, bhb0Var);
        }
        if (cls.isAssignableFrom(x8p.class)) {
            IVerificationFlowController verificationFlowController3 = this.c.getVerificationFlowController();
            x8p x8pVar = new x8p(verificationFlowController3);
            tje.N(ds31.a(x8pVar), null, null, new b(verificationFlowController3, null), 3);
            return x8pVar;
        }
        if (cls.isAssignableFrom(jz5.class)) {
            return new jz5(this.c.getVerificationFlowController());
        }
        if (cls.isAssignableFrom(wf.class)) {
            return new wf(this.c.getVerificationFlowController());
        }
        if (cls.isAssignableFrom(e831.class)) {
            return new e831(this.c.getVerificationFlowController());
        }
        if (cls.isAssignableFrom(n731.class)) {
            return new n731(this.c.getVerificationFlowController());
        }
        if (cls.isAssignableFrom(dc60.class)) {
            return new dc60(this.c.getVerificationFlowController());
        }
        ny61.g("Unknown ViewModel class");
        return null;
    }
}
