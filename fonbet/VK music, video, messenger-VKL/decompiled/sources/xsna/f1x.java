package xsna;

import com.vk.api.sdk.exceptions.ApiErrorViewType;
import xsna.bzp0;

/* compiled from: InputApiErrorStrategy.kt */
/* loaded from: classes15.dex */
public final class f1x extends z46 {
    public final jr1 d;
    public final String e;

    public f1x(wz2 wz2Var, jr1 jr1Var, String str) {
        super(wz2Var, 2);
        this.d = jr1Var;
        this.e = str;
    }

    @Override // xsna.z46
    public final ApiErrorViewType P(ehg ehgVar, g1x g1xVar) {
        if (g1xVar != null) {
            wz2 wz2Var = (wz2) this.c;
            if (g1xVar.a(wz2Var instanceof cfv0 ? new bzp0.c(((cfv0) wz2Var).c, wz2Var) : wz2Var instanceof fp70 ? new bzp0.c(((fp70) wz2Var).d, wz2Var) : new bzp0.c(this.e, wz2Var))) {
                return ApiErrorViewType.INPUT;
            }
        }
        return this.d.P(ehgVar, g1xVar);
    }
}
