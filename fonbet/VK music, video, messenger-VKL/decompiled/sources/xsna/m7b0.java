package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.video.playlist.playlistscreen.ui.view.PlaylistButtonsStyle;

/* compiled from: PlaylistButtonWithIcon.kt */
/* loaded from: classes6.dex */
public final class m7b0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0076  */
    /* JADX WARN: Type inference failed for: r0v15, types: [xsna.lgu0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final lg90 lg90Var, final q630 q630Var, final gzs<s3q0> gzsVar, String str, String str2, final PlaylistButtonsStyle playlistButtonsStyle, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        String str3;
        int i4;
        String str4;
        androidx.compose.runtime.a aVar2;
        final String str5;
        final String str6;
        androidx.compose.runtime.f s;
        ButtonSize buttonSize;
        mgu0 mgu0Var;
        androidx.compose.runtime.a M = aVar.M(1739424272);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(gzsVar) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            str3 = str;
            i3 |= M.J(str3) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                str4 = str2;
                i3 |= M.J(str4) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    i3 |= M.o(playlistButtonsStyle == null ? -1 : playlistButtonsStyle.ordinal()) ? 131072 : 65536;
                }
                if (M.t(i3 & 1, (74899 & i3) != 74898)) {
                    str5 = i5 != 0 ? "" : str3;
                    String str7 = i4 != 0 ? null : str4;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1739424272, i3, -1, "com.vk.video.playlist.playlistscreen.ui.view.PlaylistButtonWithIcon (PlaylistButtonWithIcon.kt:35)");
                    }
                    bn20 z = hr80.z();
                    ButtonSize buttonSize2 = ButtonSize.Medium;
                    r5j0 x = z.x(6, M);
                    bn20 z2 = hr80.z();
                    ButtonStyle buttonStyle = ButtonStyle.Secondary;
                    s890 value = z2.c(buttonSize2, buttonStyle, false, M, 438, 0).getValue();
                    if (playlistButtonsStyle == PlaylistButtonsStyle.Lego) {
                        M.K(408748308);
                        ?? b = hr80.z().b(buttonStyle, playlistButtonsStyle.h(), M, 6);
                        M.j();
                        mgu0Var = b;
                        buttonSize = buttonSize2;
                    } else {
                        M.K(408851755);
                        bn20 z3 = hr80.z();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        iyk0 iyk0Var = rrv0.a;
                        ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getBackground().m;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var2.getIcon().b;
                        z3.getClass();
                        buttonSize = buttonSize2;
                        mgu0 a = op8.a(j, 0L, j2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, M, 0, 0, 1018);
                        M = M;
                        M.j();
                        mgu0Var = a;
                    }
                    int i6 = i3;
                    aVar2 = M;
                    bhu0.f(gzsVar, q630Var, false, null, null, null, hr80.z().y(buttonSize, M, 6), null, x, mgu0Var, value, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, kai.c(1839699225, new j3o(playlistButtonsStyle, lg90Var, str7, str5, 1), M), aVar2, ((i6 >> 6) & 14) | (i6 & 112), 1572864, 63676);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    str6 = str7;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    str5 = str3;
                    str6 = str4;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.l7b0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            m7b0.a(lg90.this, q630Var, gzsVar, str5, str6, playlistButtonsStyle, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            str4 = str2;
            if ((196608 & i) == 0) {
            }
            if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        str3 = str;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        str4 = str2;
        if ((196608 & i) == 0) {
        }
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }
}
