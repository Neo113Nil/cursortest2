package xsna;

import xsna.q630;

/* compiled from: AudioBookFooter.kt */
/* loaded from: classes3.dex */
public final class rg4 {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, int i2, androidx.compose.runtime.a aVar, String str, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(1496212643);
        int i3 = i | (M.J(str) ? 4 : 2);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            if (M.t(i3 & 1, (i3 & 19) == 18)) {
                aVar2 = M;
                aVar2.h();
                q630Var3 = q630Var2;
            } else {
                q630 q630Var4 = i4 != 0 ? q630.a.a : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1496212643, i3, -1, "com.vk.music.playlist.display.audiobook.presentation.FooterTextView (AudioBookFooter.kt:73)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.c0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                int i5 = (i3 & 14) | 100663296 | (i3 & 112);
                q630 q630Var5 = q630Var4;
                aVar2 = M;
                yqv0.c(str, q630Var5, ylu0Var.getText().p, null, null, 0, 5, null, 2, false, 0, 2, null, frv0Var, aVar2, i5, 48, 5816);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var5;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new qg4(str, q630Var3, i, i2, 0);
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        if (M.t(i3 & 1, (i3 & 19) == 18)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
