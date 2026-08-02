package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.mjf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class nz7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ nz7(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.o oVar = (com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.o) this.c;
                yw90 yw90Var = (yw90) this.e;
                View view = (View) this.f;
                z37 z37Var = (z37) this.g;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1034409918, intValue, -1, "com.vk.ecomm.onlinebooking.impl.main.presentation.BookingStartScreen.<anonymous>.<anonymous> (BookingStartScreen.kt:100)");
                    }
                    boolean J = aVar.J(z37Var);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new com.vk.movika.sdk.base.logic.interactor.d(z37Var, 17);
                        aVar.R(x);
                    }
                    vz7.e(oVar, this.d, yw90Var, view, (izs) x, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                f64 f64Var = (f64) this.c;
                f64 f64Var2 = (f64) this.d;
                f64 f64Var3 = (f64) this.e;
                f64 f64Var4 = (f64) this.f;
                f64 f64Var5 = (f64) this.g;
                qk50 qk50Var = (qk50) obj;
                mjf mjfVar = (mjf) obj2;
                if (mjfVar instanceof mjf.d) {
                    return qk50Var.b(mjfVar, f64Var);
                }
                if (mjfVar instanceof mjf.c) {
                    return qk50Var.b(mjfVar, f64Var2);
                }
                if (mjfVar instanceof mjf.a) {
                    return qk50Var.b(mjfVar, f64Var3);
                }
                if (mjfVar instanceof mjf.e) {
                    return qk50Var.b(mjfVar, f64Var4);
                }
                if (mjfVar instanceof mjf.b) {
                    return qk50Var.b(mjfVar, f64Var5);
                }
                throw new NoWhenBranchMatchedException();
        }
    }
}
