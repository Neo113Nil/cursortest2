package xsna;

import android.os.Parcel;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.video.ui.upload.impl.settings.presentation.compose.screen.SettingsScreenKt$AttachedClipsOnboarding$statDelegate$1$1;
import com.vkontakte.android.R;
import xsna.e8v0;
import xsna.q0j0;
import xsna.q630;

/* compiled from: SettingsScreen.kt */
/* loaded from: classes7.dex */
public final class n3j0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, final izs izsVar, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(524767344);
        int i2 = (M.y(izsVar) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(524767344, i2, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.screen.AttachedClipsOnboarding (SettingsScreen.kt:269)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new VkOnboardingStat$Delegate() { // from class: com.vk.video.ui.upload.impl.settings.presentation.compose.screen.SettingsScreenKt$AttachedClipsOnboarding$statDelegate$1$1
                    @Override // com.vk.onboarding.api.stat.VkOnboardingStat$Delegate
                    public final void d4(e8v0 e8v0Var) {
                        izsVar.invoke(new q0j0.b.C3543b(e8v0Var));
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i3) {
                    }
                };
                M.R(x);
            }
            SettingsScreenKt$AttachedClipsOnboarding$statDelegate$1$1 settingsScreenKt$AttachedClipsOnboarding$statDelegate$1$1 = (SettingsScreenKt$AttachedClipsOnboarding$statDelegate$1$1) x;
            String N = d370.N(R.string.setting_attached_clips_onboarding, 0, M);
            VkOnboarding$TintColor vkOnboarding$TintColor = VkOnboarding$TintColor.Azure;
            VkOnboarding$HighlighterMarkerType vkOnboarding$HighlighterMarkerType = VkOnboarding$HighlighterMarkerType.Type4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().d;
            boolean z = false;
            l5g l5gVar = new l5g(j);
            if ((i2 & 14) == 4) {
                z = true;
            }
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new f74(izsVar, 4);
                M.R(x2);
            }
            q630Var2 = q630Var;
            o7v0.d(N, q630Var2, vkOnboarding$TintColor, vkOnboarding$HighlighterMarkerType, l5gVar, (gzs) x2, settingsScreenKt$AttachedClipsOnboarding$statDelegate$1$1, M, (i2 & 112) | 100666752, 160);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qm7(izsVar, q630Var2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final int i, final int i2, androidx.compose.runtime.a aVar, final String str, q630 q630Var) {
        final q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(-969910325);
        int i3 = (M.J(str) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 32 : 16;
            if (M.t(i3 & 1, (i3 & 19) == 18)) {
                aVar2 = M;
                aVar2.h();
            } else {
                q630 q630Var3 = i4 != 0 ? q630.a.a : q630Var2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-969910325, i3, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.screen.SectionTitle (SettingsScreen.kt:255)");
                }
                float f = 16;
                q630 G = s200.G(q630Var3, f, 18, f, 12);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j = ylu0Var.getText().p;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                int i5 = i3 & 14;
                q630 q630Var4 = q630Var3;
                aVar2 = M;
                yqv0.c(str, G, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var.o0, aVar2, i5, 0, 8184);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var2 = q630Var4;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.l3j0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        n3j0.b(ne7.I(i | 1), i2, (androidx.compose.runtime.a) obj, str, q630Var2);
                        return s3q0.a;
                    }
                };
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

    public static final void c(o3j0 o3j0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1016950162);
        if ((i & 6) == 0) {
            i2 = i | (M.J(o3j0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1016950162, i3, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.screen.SettingsScreen (SettingsScreen.kt:49)");
            }
            q630.a aVar2 = q630.a.a;
            q630 d = txj0.d(aVar2, 1.0f);
            jai c = kai.c(990040601, new ms7(izsVar, 1), M);
            jai c2 = kai.c(1595815383, new hp7(9, o3j0Var, izsVar), M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phv0.b(d, c, null, c2, null, 0, ylu0Var.getBackground().g, 0L, kai.c(-86058514, new j150(2, o3j0Var, izsVar), M), M, 805309488, 372);
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
            s.d = new m3j0(o3j0Var, izsVar, q630Var2, i, 0);
        }
    }

    public static final void d(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1832455951);
        int i2 = (M.y(izsVar) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1832455951, i2, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.screen.SmartCrop (SettingsScreen.kt:203)");
            }
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(txj0.f(aVar2, 1.0f), "ScreenTags.SMART_CROP");
            com.vk.core.compose.component.cell.content.k0 a = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.setting_smart_crop_title, 0, M), null, null, 1, null, null, M, 12610560, 102), Cell$Middle.c.b.b(d370.N(R.string.setting_smart_crop_subtitle, 0, M), 2, null, null, null, M, 12583344, 120), null, null, M, 196608, 28);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new j6e0(8);
                M.R(x);
            }
            com.vk.core.compose.component.cell.content.u0 a2 = o.b.a.a(null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), 0L, false, M, 196608, 27);
            boolean z = (i2 & 14) == 4;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new f3(izsVar, 10);
                M.R(x2);
            }
            wiu0.b(E, false, null, a, a2, (gzs) x2, null, M, 0, 70);
            M = M;
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
            s.d = new l6(izsVar, q630Var2, i, 7);
        }
    }

    public static final void e(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(335761937);
        int i2 = (M.y(izsVar) ? 4 : 2) | i | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(335761937, i2, -1, "com.vk.video.ui.upload.impl.settings.presentation.compose.screen.Toolbar (SettingsScreen.kt:233)");
            }
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.toolbar_settings_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14);
            String N = d370.N(R.string.toolbar_settings_icon_back_talkback, 0, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new tuq(29);
                M.R(x);
            }
            com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
            boolean z = (i2 & 14) == 4;
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new t2(izsVar, 2);
                M.R(x2);
            }
            TopBar$Before.e a3 = e.a.a((gzs) x2, N, null, null, a2, M, 196608, 12);
            q630Var2 = q630.a.a;
            muv0.h(a, q630Var2, null, null, a3, null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 48, 0, 8172);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ps7(izsVar, q630Var2, i);
        }
    }
}
