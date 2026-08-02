package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.lc20;

/* compiled from: MessageViewsListAdapter.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class kc20 extends FunctionReferenceImpl implements wzs<hfz, hfz, Boolean> {
    @Override // xsna.wzs
    public final Boolean invoke(hfz hfzVar, hfz hfzVar2) {
        hfz hfzVar3 = hfzVar;
        hfz hfzVar4 = hfzVar2;
        ((lc20.a) this.receiver).getClass();
        yc20 yc20Var = hfzVar3 instanceof yc20 ? (yc20) hfzVar3 : null;
        boolean z = false;
        if (yc20Var != null) {
            yc20 yc20Var2 = hfzVar4 instanceof yc20 ? (yc20) hfzVar4 : null;
            if (yc20Var2 != null) {
                z = epx.f(yc20Var.b, yc20Var2.b);
            }
        }
        return Boolean.valueOf(z);
    }
}
