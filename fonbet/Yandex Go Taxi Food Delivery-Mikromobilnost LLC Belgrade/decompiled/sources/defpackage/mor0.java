package defpackage;

import android.text.Editable;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class mor0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ nor0 b;

    public /* synthetic */ mor0(nor0 nor0Var, int i) {
        this.a = i;
        this.b = nor0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        nor0 nor0Var = this.b;
        switch (i) {
            case 0:
                kor0 kor0Var = nor0Var.c;
                oor0 oor0Var = kor0Var.D;
                oor0Var.b = ((Editable) obj).toString();
                oor0Var.c = true;
                oor0Var.g = "";
                oor0Var.d = kor0Var.C.g;
                kor0Var.Lg();
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    kor0 kor0Var2 = nor0Var.c;
                    kor0Var2.z.M(kor0Var2.B.b, kor0Var2.D, SharedPaymentAnalytics$Button.ACCOUNT_NAME);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
