package xsna;

import androidx.compose.runtime.a;
import xsna.vzi0;

/* compiled from: MviComposeExtensions.kt */
/* loaded from: classes3.dex */
public final class jk50 {
    public static final wh50 a(yzt0 yzt0Var, androidx.compose.runtime.a aVar, int i, int i2) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(442910031, i, -1, "com.vk.mvi.compose.asNullableState (MviComposeExtensions.kt:46)");
        }
        Object x = aVar.x();
        Object obj = a.C0011a.a;
        if (x == obj) {
            Object a = yzt0Var.a();
            if (a == null) {
                a = null;
            }
            x = androidx.compose.runtime.k.b(a);
            aVar.R(x);
        }
        wh50 wh50Var = (wh50) x;
        boolean z = yzt0Var.a() == null;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1264005467, 6, -1, "com.vk.mvi.compose.observeNullable (MviComposeExtensions.kt:169)");
        }
        aVar.K(766495580);
        Object x2 = aVar.x();
        if (x2 == obj) {
            x2 = new kvi();
            aVar.R(x2);
        }
        Object obj2 = (kvi) x2;
        Object x3 = aVar.x();
        if (x3 == obj) {
            x3 = io.reactivex.rxjava3.internal.operators.mixed.j.d(z, aVar);
        }
        wh50 wh50Var2 = (wh50) x3;
        boolean y = aVar.y(yzt0Var) | aVar.y(obj2) | aVar.J(wh50Var);
        Object x4 = aVar.x();
        if (y || x4 == obj) {
            Object fk50Var = new fk50(yzt0Var, obj2, wh50Var, wh50Var2, 0);
            aVar.R(fk50Var);
            x4 = fk50Var;
        }
        bap.c(obj2, (izs) x4, aVar, 0);
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return wh50Var;
    }

    public static final wh50 b(wj50 wj50Var, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2107480466, 48, -1, "com.vk.mvi.compose.asState (MviComposeExtensions.kt:78)");
        }
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x == c0012a) {
            x = androidx.compose.runtime.k.b(vzi0.b.a);
            aVar.R(x);
        }
        wh50 wh50Var = (wh50) x;
        Object x2 = aVar.x();
        if (x2 == c0012a) {
            x2 = new kvi();
            aVar.R(x2);
        }
        kvi kviVar = (kvi) x2;
        boolean y = aVar.y(wj50Var) | aVar.y(kviVar);
        Object x3 = aVar.x();
        if (y || x3 == c0012a) {
            x3 = new tv7(wj50Var, kviVar, wh50Var, 2);
            aVar.R(x3);
        }
        bap.c(kviVar, (izs) x3, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return wh50Var;
    }

    public static final wh50 c(yzt0 yzt0Var, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2065881982, 0, -1, "com.vk.mvi.compose.asState (MviComposeExtensions.kt:22)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            Object a = yzt0Var.a();
            if (a == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            x = androidx.compose.runtime.k.b(a);
            aVar.R(x);
        }
        wh50 wh50Var = (wh50) x;
        e(wh50Var, yzt0Var, false, aVar, 390);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return wh50Var;
    }

    public static final wh50 d(yzt0 yzt0Var, Object obj, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2094786480, i, -1, "com.vk.mvi.compose.asState (MviComposeExtensions.kt:34)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            Object a = yzt0Var.a();
            if (a != null) {
                obj = a;
            }
            x = androidx.compose.runtime.k.b(obj);
            aVar.R(x);
        }
        wh50 wh50Var = (wh50) x;
        e(wh50Var, yzt0Var, yzt0Var.a() == null, aVar, 6);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return wh50Var;
    }

    public static final void e(wh50 wh50Var, yzt0 yzt0Var, boolean z, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-225947420, i, -1, "com.vk.mvi.compose.observe (MviComposeExtensions.kt:150)");
        }
        aVar.K(1907865791);
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x == c0012a) {
            x = new kvi();
            aVar.R(x);
        }
        kvi kviVar = (kvi) x;
        Object x2 = aVar.x();
        if (x2 == c0012a) {
            x2 = io.reactivex.rxjava3.internal.operators.mixed.j.d(z, aVar);
        }
        wh50 wh50Var2 = (wh50) x2;
        boolean y = aVar.y(yzt0Var) | aVar.y(kviVar) | aVar.J(wh50Var);
        Object x3 = aVar.x();
        if (y || x3 == c0012a) {
            r3e r3eVar = new r3e(yzt0Var, kviVar, wh50Var, wh50Var2, 4);
            aVar.R(r3eVar);
            x3 = r3eVar;
        }
        bap.c(kviVar, (izs) x3, aVar, 0);
        aVar.j();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }
}
