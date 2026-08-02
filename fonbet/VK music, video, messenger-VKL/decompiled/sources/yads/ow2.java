package yads;

import com.monetization.ads.nativeads.CustomizableMediaView;
import xsna.epx;
import xsna.qcy;
import xsna.wq70;

/* loaded from: classes10.dex */
public final class ow2 extends wq70 {
    public final /* synthetic */ pw2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow2(lw2 lw2Var, pw2 pw2Var) {
        super(lw2Var);
        this.a = pw2Var;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy qcyVar, Object obj, Object obj2) {
        to1 to1Var = (to1) obj2;
        to1 to1Var2 = (to1) obj;
        if (epx.f(to1Var, to1Var2)) {
            return;
        }
        mn2 mn2Var = this.a.g;
        qcy[] qcyVarArr = pw2.j;
        qcy qcyVar2 = qcyVarArr[0];
        CustomizableMediaView customizableMediaView = (CustomizableMediaView) mn2Var.a.get();
        if (customizableMediaView == null) {
            return;
        }
        mn2 mn2Var2 = this.a.h;
        qcy qcyVar3 = qcyVarArr[1];
        po1 po1Var = (po1) mn2Var2.a.get();
        if (po1Var == null) {
            return;
        }
        to1Var2.a(customizableMediaView);
        customizableMediaView.post(new nw2(to1Var, customizableMediaView, po1Var));
    }
}
