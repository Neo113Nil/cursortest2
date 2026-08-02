package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;

/* loaded from: classes9.dex */
public final /* synthetic */ class g4z implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ j7b0 b;

    public /* synthetic */ g4z(j7b0 j7b0Var, int i) {
        this.a = i;
        this.b = j7b0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean z;
        String str;
        String str2;
        int i = this.a;
        j7b0 j7b0Var = this.b;
        w3j0 w3j0Var = (w3j0) obj;
        switch (i) {
            case 0:
                np40 np40Var = j7b0Var.g;
                z = np40Var != null && np40Var.b;
                str = z ? "multiclass" : null;
                if (str == null || evu0.J(str)) {
                    str = j7b0Var.b;
                }
                w3j0Var.d(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
                np40 np40Var2 = j7b0Var.g;
                str2 = z ? np40Var2 != null ? np40Var2.c : null : null;
                if (str2 == null || evu0.J(str2)) {
                    str2 = j7b0Var.h;
                }
                w3j0Var.a.put("vertical", str2);
                break;
            default:
                np40 np40Var3 = j7b0Var.g;
                z = np40Var3 != null && np40Var3.b;
                str = z ? "multiclass" : null;
                if (str == null || evu0.J(str)) {
                    str = j7b0Var.b;
                }
                w3j0Var.d(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
                str2 = z ? np40Var3 != null ? np40Var3.c : null : null;
                if (str2 == null || evu0.J(str2)) {
                    str2 = j7b0Var.h;
                }
                w3j0Var.a.put("vertical", str2);
                break;
        }
        return w3j0Var;
    }
}
