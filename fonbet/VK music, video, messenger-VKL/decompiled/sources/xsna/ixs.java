package xsna;

import com.vk.api.sdk.exceptions.ApiErrorViewType;
import xsna.bzp0;

/* compiled from: FullscreenApiErrorStrategy.kt */
/* loaded from: classes15.dex */
public final class ixs extends z46 {
    public final String d;
    public final String e;

    public ixs(String str, String str2, wz2 wz2Var) {
        super(wz2Var, 2);
        this.d = str;
        this.e = str2;
    }

    @Override // xsna.z46
    public final ApiErrorViewType P(ehg ehgVar, g1x g1xVar) {
        wz2 wz2Var = (wz2) this.c;
        boolean z = wz2Var instanceof cfv0;
        String str = this.d;
        ehgVar.c(z ? new bzp0.b(((cfv0) wz2Var).c, str, wz2Var) : wz2Var instanceof fp70 ? new bzp0.b(((fp70) wz2Var).d, str, wz2Var) : new bzp0.b(this.e, str, wz2Var));
        return ApiErrorViewType.FULLSCREEN;
    }
}
