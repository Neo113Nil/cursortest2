package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.input.InputSelect$State;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.xbo0;

/* compiled from: BookingEditMultiLineInput.kt */
/* loaded from: classes18.dex */
public final class gp7 {
    public final mtk0 a;
    public final mtk0 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;
    public final bd8 g;
    public final wh50 h;
    public final fp7 i;
    public final q630 j;
    public final q630 k;
    public final q630 l;
    public final q630 m;

    public gp7(f1m f1mVar, izs izsVar, f1m f1mVar2, rgy rgyVar, lg90 lg90Var, com.vk.core.compose.component.semantics.a aVar) {
        this.a = f1mVar;
        this.b = f1mVar2;
        this.c = androidx.compose.runtime.k.b(izsVar);
        this.d = androidx.compose.runtime.k.b(rgyVar);
        this.e = androidx.compose.runtime.k.b(lg90Var);
        this.f = androidx.compose.runtime.k.b(aVar);
        bd8 bd8Var = new bd8();
        this.g = bd8Var;
        this.h = androidx.compose.runtime.k.b(null);
        fp7 fp7Var = new fp7();
        fp7Var.a = -1;
        this.i = fp7Var;
        float f = 16;
        q630.a aVar2 = q630.a.a;
        this.j = com.vk.core.compose.component.semantics.b.b(fvr.u(fo50.s(egi.o(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2), new s6(this, 11)), bd8Var), new t6(this, 11)), aVar);
        this.k = s200.H(aVar2, f, 8, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
        float f2 = 48;
        this.l = s200.H(txj0.s(aVar2, f2, f2), 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
        this.m = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11);
    }

    public final void a(int i, androidx.compose.runtime.a aVar, String str, q630 q630Var, boolean z) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1282396030);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.l(z) ? 32 : 16) | 384 | (M.J(this) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1282396030, i2, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditMultiLineInputImpl.MutableContent (BookingEditMultiLineInput.kt:139)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bap.j(EmptyCoroutineContext.b, M);
                M.R(x);
            }
            yvj yvjVar = (yvj) x;
            final String str2 = (String) this.b.getValue();
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            InputSelect$State.Companion.getClass();
            InputSelect$State inputSelect$State = str2 != null ? InputSelect$State.Error : InputSelect$State.Default;
            rgy rgyVar = (rgy) ((zak0) this.d).getValue();
            lg90 lg90Var = (lg90) ((zak0) this.e).getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            xbo0.a a2 = xbo0.a.C3992a.a(lg90Var, ylu0Var.getIcon().l, str, M, ((i2 << 6) & 896) | 24584, 8);
            String str3 = (String) this.a.getValue();
            int i3 = i2 & 7168;
            boolean z2 = i3 == 2048;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new tl0(this, 14);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            boolean y = (i3 == 2048) | M.y(yvjVar);
            Object x3 = M.x();
            if (y || x3 == c0012a) {
                x3 = new bp7(0, this, yvjVar);
                M.R(x3);
            }
            hqv0.c(str3, izsVar, this.j, str, inputSelect$State, 0, 0, z, false, 0L, 0L, null, rgyVar, null, null, null, (izs) x3, a2, M, ((i2 << 9) & 7168) | ((i2 << 18) & 29360128), 847712);
            mm2.b(r9g.a, str2 != null, null, null, null, null, kai.c(1062755276, new yzs() { // from class: xsna.cp7
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1062755276, intValue, -1, "com.vk.ecomm.onlinebooking.impl.edit.ui.BookingEditMultiLineInputImpl.MutableContent.<anonymous>.<anonymous> (BookingEditMultiLineInput.kt:171)");
                    }
                    q630 q630Var3 = gp7.this.k;
                    String str4 = str2;
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar4.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str4, q630Var3, ylu0Var2.getText().k, null, null, 0, 0, null, 0, false, 0, 0, null, null, aVar4, 0, 0, 16376);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), M, 1572870, 30);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new dp7(this, str, z, q630Var2, i);
        }
    }
}
