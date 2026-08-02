package xsna;

import com.ironsource.X2;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import xsna.q630;

/* compiled from: SimpleButton.kt */
/* loaded from: classes18.dex */
public final class mpj0 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final int i, final int i2, androidx.compose.runtime.a aVar, final String str, final gzs gzsVar, q630 q630Var) {
        int i3;
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-444058141);
        if ((i & 6) == 0) {
            i3 = (M.J(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= M.y(gzsVar) ? 256 : 128;
            }
            if (M.t(i3 & 1, (i3 & 147) == 146)) {
                aVar2 = M;
                aVar2.h();
                q630Var3 = q630Var2;
            } else {
                q630 q630Var4 = i4 != 0 ? q630.a.a : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-444058141, i3, -1, "com.vk.design.demo.presentation.components.SimpleButton (SimpleButton.kt:12)");
                }
                int i5 = i3;
                q630 q630Var5 = q630Var4;
                aVar2 = M;
                bhu0.e(gzsVar, ButtonSize.Small, ButtonStyle.Outline, ButtonAppearance.Accent, s200.D(q630Var4, 4), null, false, false, null, null, null, str, null, null, null, null, false, null, null, null, aVar2, ((i5 >> 6) & 14) | X2.b.f, (i5 << 6) & 896, 0, 4190176);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var5;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.lpj0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        mpj0.a(ne7.I(i | 1), i2, (androidx.compose.runtime.a) obj, str, gzsVar, q630Var3);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if ((i & 384) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 147) == 146)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
