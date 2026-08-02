package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupLogoResultStatus;
import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;

/* loaded from: classes3.dex */
public final /* synthetic */ class az3 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ rk11 b;

    public /* synthetic */ az3(rk11 rk11Var, int i) {
        this.a = i;
        this.b = rk11Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        aa4 aa4Var;
        aa4 aa4Var2;
        int i = this.a;
        String str = null;
        str = null;
        rk11 rk11Var = this.b;
        switch (i) {
            case 0:
                wy3 wy3Var = (wy3) obj;
                ba4 ba4Var = wy3Var.i;
                Text.Constant g = d.g((ba4Var == null || (aa4Var2 = ba4Var.e) == null) ? null : aa4Var2.a);
                ba4 ba4Var2 = wy3Var.i;
                if (ba4Var2 != null && (aa4Var = ba4Var2.e) != null) {
                    str = aa4Var.b;
                }
                Text.Constant g2 = d.g(str);
                ty3 ty3Var = (ty3) rk11Var.a;
                return wy3.a(wy3Var, null, g, g2, ty3Var.b, null, ty3Var.c, AutoTopupLogoResultStatus.PROCESSING, false, null, null, 1297);
            default:
                kk01 kk01Var = (kk01) obj;
                ResultStatus resultStatus = ResultStatus.FAILED;
                Object obj2 = rk11Var.a;
                String str2 = ((nh01) obj2).b;
                Text.Constant i2 = str2 != null ? g8e.i(Text.Companion, str2) : null;
                String str3 = ((nh01) obj2).c;
                return kk01.a(kk01Var, null, resultStatus, null, null, i2, str3 != null ? g8e.i(Text.Companion, str3) : null, null, null, null, null, null, 8075);
        }
    }
}
