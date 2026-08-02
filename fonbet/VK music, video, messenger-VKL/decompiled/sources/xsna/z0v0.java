package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.input.InputSelect$State;
import xsna.q630;

/* compiled from: VkInputSelect.kt */
/* loaded from: classes17.dex */
public final class z0v0 {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final s2x s2xVar, q630 q630Var, InputSelect$State inputSelect$State, boolean z, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        boolean z2;
        final q630 q630Var2;
        final InputSelect$State inputSelect$State2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-2059254251);
        if ((i & 6) == 0) {
            i3 = (M.J(s2xVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= M.o(inputSelect$State == null ? -1 : inputSelect$State.ordinal()) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= M.l(z2) ? 2048 : 1024;
            if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
                M.h();
                q630Var2 = q630Var;
                inputSelect$State2 = inputSelect$State;
            } else {
                q630 q630Var3 = i4 != 0 ? q630.a.a : q630Var;
                InputSelect$State inputSelect$State3 = i5 != 0 ? InputSelect$State.Default : inputSelect$State;
                if (i6 != 0) {
                    z2 = true;
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-2059254251, i3, -1, "com.vk.core.compose.component.input.VkInputSelect (VkInputSelect.kt:47)");
                }
                ((zak0) s2xVar.a).setValue(Boolean.valueOf(z2));
                ((zak0) s2xVar.b).setValue(inputSelect$State3);
                q630 f = txj0.f(q630Var3, 1.0f);
                s1v.k();
                s2xVar.a(txj0.j(on20.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, f), M, (i3 << 3) & 112);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var2 = q630Var3;
                inputSelect$State2 = inputSelect$State3;
            }
            final boolean z3 = z2;
            s = M.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.y0v0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        z0v0.a(s2x.this, q630Var2, inputSelect$State2, z3, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        z2 = z;
        if (M.t(i3 & 1, (i3 & 1171) == 1170)) {
        }
        final boolean z32 = z2;
        s = M.s();
        if (s == null) {
        }
    }
}
