package defpackage;

import android.text.Editable;
import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class n3j0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3j0 b;

    public /* synthetic */ n3j0(o3j0 o3j0Var, int i) {
        this.a = i;
        this.b = o3j0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        o3j0 o3j0Var = this.b;
        switch (i) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    l3j0 l3j0Var = o3j0Var.c;
                    l3j0Var.z.G(l3j0Var.D, SharedPaymentAnalytics$Button.EMAIL_ADDRESS);
                    break;
                }
                break;
            default:
                l3j0 l3j0Var2 = o3j0Var.c;
                p3j0 p3j0Var = l3j0Var2.D;
                p3j0Var.d = ((Editable) obj).toString();
                p3j0Var.e = "";
                p3j0Var.g = l3j0Var2.C.e;
                p3j0Var.j = true;
                l3j0Var2.Ng();
                break;
        }
        return zy11Var;
    }
}
