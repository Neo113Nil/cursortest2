package xsna;

import android.content.Context;
import android.os.Parcel;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.video.ui.upload.impl.publish.presentation.publish.compose.settingadvanced.SettingAdvancedKt$Chevron$statDelegate$1$1;
import com.vkontakte.android.R;
import xsna.e8v0;
import xsna.gbe0;

/* compiled from: SettingAdvanced.kt */
/* loaded from: classes7.dex */
public final class rzi0 {
    public static final void a(szi0 szi0Var, final izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-262365271);
        if ((i & 6) == 0) {
            i2 = (M.J(szi0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-262365271, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.settingadvanced.Chevron (SettingAdvanced.kt:64)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            boolean z = szi0Var.b;
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z2 || x == obj) {
                x = new xv80(izsVar, 1);
                M.R(x);
            }
            buv0 z3 = rdi.z(z, (izs) x, null, M, 0, 4);
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = new VkOnboardingStat$Delegate() { // from class: com.vk.video.ui.upload.impl.publish.presentation.publish.compose.settingadvanced.SettingAdvancedKt$Chevron$statDelegate$1$1
                    @Override // com.vk.onboarding.api.stat.VkOnboardingStat$Delegate
                    public final void d4(e8v0 e8v0Var) {
                        izsVar.invoke(new gbe0(e8v0Var));
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i4) {
                    }
                };
                M.R(x2);
            }
            SettingAdvancedKt$Chevron$statDelegate$1$1 settingAdvancedKt$Chevron$statDelegate$1$1 = (SettingAdvancedKt$Chevron$statDelegate$1$1) x2;
            Boolean valueOf = Boolean.valueOf(szi0Var.b);
            boolean y = M.y(z3) | ((i2 & 14) == 4);
            Object x3 = M.x();
            if (y || x3 == obj) {
                x3 = new pzi0(z3, szi0Var, null);
                M.R(x3);
            }
            bap.g(valueOf, (wzs) x3, M, 0);
            String obj2 = szi0Var.a.a(context).toString();
            VkOnboarding$TintColor vkOnboarding$TintColor = VkOnboarding$TintColor.Azure;
            VkTooltip$BalloonPosition vkTooltip$BalloonPosition = VkTooltip$BalloonPosition.TopLeft;
            VkTooltip$BalloonTilt vkTooltip$BalloonTilt = VkTooltip$BalloonTilt.Right;
            boolean z4 = i3 == 32;
            Object x4 = M.x();
            if (z4 || x4 == obj) {
                x4 = new h8k(izsVar, 1);
                M.R(x4);
            }
            gzs gzsVar = (gzs) x4;
            boolean y2 = M.y(z3);
            Object x5 = M.x();
            if (y2 || x5 == obj) {
                x5 = new dac0(z3, 9);
                M.R(x5);
            }
            o9v0.a(obj2, z3, q630Var, null, null, vkOnboarding$TintColor, vkTooltip$BalloonPosition, vkTooltip$BalloonTilt, gzsVar, (gzs) x5, null, null, null, false, settingAdvancedKt$Chevron$statDelegate$1$1, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, zq70.c, M, (i2 & 896) | 14352384, 805330944, 506904);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hg8(i, 2, szi0Var, izsVar, q630Var);
        }
    }

    public static final void b(szi0 szi0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1318123584);
        int i2 = i | (M.J(szi0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1318123584, i2, -1, "com.vk.video.ui.upload.impl.publish.presentation.publish.compose.settingadvanced.SettingAdvanced (SettingAdvanced.kt:33)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            com.vk.core.compose.component.cell.content.k0 a = Cell$Middle.a.a(Cell$Middle.d.b.a(d370.N(R.string.setting_advanced_title, 0, M), null, null, 1, null, null, M, 12610560, 102), null, null, null, M, 196608, 30);
            qzi0 qzi0Var = new qzi0(szi0Var, izsVar);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new w77(izsVar, 4);
                M.R(x);
            }
            wiu0.b(f, false, null, a, qzi0Var, (gzs) x, null, M, 0, 70);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ax(i, 7, szi0Var, izsVar, q630Var);
        }
    }
}
