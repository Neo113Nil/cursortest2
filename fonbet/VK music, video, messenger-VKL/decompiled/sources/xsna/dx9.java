package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.topbar.d;
import com.vkontakte.android.R;
import xsna.f7p0;

/* compiled from: Cart.kt */
/* loaded from: classes18.dex */
public final class dx9 {
    public static final d.b.a a(int i, gzs<s3q0> gzsVar, izs<? super tgi0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i2, int i3) {
        izs<? super tgi0, s3q0> izsVar2;
        f7p0.c cVar;
        int i4 = i3 & 4;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (i4 != 0) {
            Object x = aVar.x();
            if (x == c0012a) {
                x = new sc(5);
                aVar.R(x);
            }
            izsVar2 = (izs) x;
        } else {
            izsVar2 = izsVar;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1261691885, i2, -1, "com.vk.ecomm.design.compose.topbar.cartExtraTopBarIcon (Cart.kt:50)");
        }
        qzu0.a.getClass();
        lg90 m1 = qzu0.m1(aVar);
        boolean J = aVar.J(gzsVar);
        Object x2 = aVar.x();
        if (J || x2 == c0012a) {
            x2 = new ax9(0, gzsVar);
            aVar.R(x2);
        }
        gzs gzsVar2 = (gzs) x2;
        if (i > 0) {
            aVar.K(1804449733);
            cVar = f7p0.c.a.a(i, null, null, null, aVar, 24576, 14);
            aVar.j();
        } else {
            aVar.K(1804533185);
            aVar.j();
            cVar = null;
        }
        d.b.a a = d.b.a.C0757a.a(m1, null, gzsVar2, cVar, null, c(i, i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, aVar, gzsVar, izsVar2), aVar, 12582968, 80);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }

    public static final d.c.C0760d b(int i, gzs<s3q0> gzsVar, izs<? super tgi0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i2, int i3) {
        izs<? super tgi0, s3q0> izsVar2;
        f7p0.c cVar;
        int i4 = i3 & 4;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (i4 != 0) {
            Object x = aVar.x();
            if (x == c0012a) {
                x = new ur0(3);
                aVar.R(x);
            }
            izsVar2 = (izs) x;
        } else {
            izsVar2 = izsVar;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1873944248, i2, -1, "com.vk.ecomm.design.compose.topbar.cartMainTopBarIcon (Cart.kt:26)");
        }
        qzu0.a.getClass();
        lg90 m1 = qzu0.m1(aVar);
        boolean J = aVar.J(gzsVar);
        Object x2 = aVar.x();
        if (J || x2 == c0012a) {
            x2 = new s5(gzsVar, 14);
            aVar.R(x2);
        }
        gzs gzsVar2 = (gzs) x2;
        if (i > 0) {
            aVar.K(-687869750);
            cVar = f7p0.c.a.a(i, null, null, null, aVar, 24576, 14);
            aVar.j();
        } else {
            aVar.K(-687786298);
            aVar.j();
            cVar = null;
        }
        d.c.C0760d a = d.c.C0760d.a.a(m1, null, gzsVar2, cVar, null, c(i, i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, aVar, gzsVar, izsVar2), aVar, 1572920, 16);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }

    public static final com.vk.core.compose.component.semantics.a c(int i, int i2, androidx.compose.runtime.a aVar, gzs gzsVar, izs izsVar) {
        String a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(630830623, i2, -1, "com.vk.ecomm.design.compose.topbar.cartSemanticsConfiguration (Cart.kt:72)");
        }
        if (i > 0) {
            aVar.K(-1701539085);
            a = d370.F(R.plurals.ecomm_top_bar_cart_with_counter, i, new Object[]{Integer.valueOf(i)}, aVar, 0);
            aVar.j();
        } else {
            a = zq.a(aVar, -1701392920, R.string.ecomm_top_bar_cart, aVar, 0);
        }
        String str = a;
        String N = d370.N(R.string.ecomm_top_bar_cart_action, 0, aVar);
        SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
        boolean J = aVar.J(str) | ((((i2 & 896) ^ 384) > 256 && aVar.J(izsVar)) || (i2 & 384) == 256) | aVar.J(N) | aVar.J(gzsVar);
        Object x = aVar.x();
        if (J || x == a.C0011a.a) {
            bx9 bx9Var = new bx9(izsVar, str, N, gzsVar, 0);
            aVar.R(bx9Var);
            x = bx9Var;
        }
        com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(mode, (izs) x, 2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a2;
    }
}
