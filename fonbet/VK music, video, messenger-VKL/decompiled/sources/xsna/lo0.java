package xsna;

import androidx.compose.runtime.a;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: AddToMyKidsCollectionButton.kt */
/* loaded from: classes3.dex */
public final class lo0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final int i, androidx.compose.runtime.a aVar, final izs izsVar, final izs izsVar2, q630 q630Var, final boolean z, final boolean z2) {
        int i2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1401081282);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar2) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= M.l(z2) ? 16384 : 8192;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1401081282, i3, -1, "com.vk.music.stickyplayer.presentation.components.AddToMyKidsCollectionButton (AddToMyKidsCollectionButton.kt:26)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = io.reactivex.rxjava3.internal.operators.mixed.j.d(z, M);
            }
            wh50 wh50Var = (wh50) x;
            wh50Var.setValue(Boolean.valueOf(z));
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(txj0.q(aVar2, 44), ((Boolean) wh50Var.getValue()).booleanValue() ? "deleteTrackKidsCollectionButton" : "addTrackKidsCollectionButton");
            float f = 28;
            boolean z3 = !((Boolean) wh50Var2.getValue()).booleanValue();
            boolean z4 = ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object x3 = M.x();
            if (z4 || x3 == c0012a) {
                x3 = new ho0(izsVar2, wh50Var, z);
                M.R(x3);
            }
            nzu0.e(z3r0.d(0, 1, M, (gzs) x3), E, f, null, z3, null, null, kai.c(245407731, new io0(izsVar, z2, wh50Var, wh50Var2), M), M, 100663680, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
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
            s.d = new wzs() { // from class: xsna.jo0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    lo0.a(ne7.I(i | 1), (androidx.compose.runtime.a) obj, izsVar, izsVar2, q630Var2, z, z2);
                    return s3q0.a;
                }
            };
        }
    }
}
