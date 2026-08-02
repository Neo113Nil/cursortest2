package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.presentation.model.DonutLevel;
import com.vk.newsfeed.posting.privacy_picker.model.PrivacyPostType;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: PrivacyBottomSheetEntryPointCell.kt */
/* loaded from: classes4.dex */
public final class ncd0 {
    public static final void a(final boolean z, final PrivacyPostType privacyPostType, final ActionsAvailabilityState.Availability availability, final izs izsVar, final String str, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        String b;
        androidx.compose.runtime.a M = aVar.M(-2038007315);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(privacyPostType) : M.y(privacyPostType) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? M.J(availability) : M.y(availability) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(str) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2038007315, i2, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.PrivacyBottomSheetEntryPointCell (PrivacyBottomSheetEntryPointCell.kt:26)");
            }
            String N = d370.N(R.string.privacy_settings_menu_description, 0, M);
            int i3 = i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            String b2 = b(z, privacyPostType, M, i3);
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 896) == 256 || ((i2 & 512) != 0 && M.y(availability)));
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new com.vk.movika.sdk.base.ui.r(14, izsVar, availability);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(263399584, i3, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.getSubtitleContentDescription (PrivacyBottomSheetEntryPointCell.kt:58)");
            }
            if (epx.f(privacyPostType, PrivacyPostType.AllUsers.b)) {
                b = zq.a(M, 31951369, R.string.privacy_settings_visible_all_content_description, M, 0);
            } else {
                M.K(32044617);
                b = b(z, privacyPostType, M, i3);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f = availability instanceof ActionsAvailabilityState.Availability.Available ? 1.0f : 0.64f;
            q630 q630Var = q630.a.a;
            if (str != null) {
                q630Var = ahn.E(q630Var, str);
            }
            q630 a = o19.a(q630Var, f);
            SemanticsConfiguration.Mode mode = SemanticsConfiguration.Mode.ClearAndSet;
            boolean J = M.J(b);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                x2 = new zw(b, 7);
                M.R(x2);
            }
            aVar2 = M;
            qoc0.a(null, N, a, b2, null, null, null, com.vk.core.compose.component.semantics.b.a(mode, (izs) x2, 2), gzsVar, null, 1, 0, aVar2, 6, 6, 2672);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.mcd0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ncd0.a(z, privacyPostType, availability, izsVar, str, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final String b(boolean z, PrivacyPostType privacyPostType, androidx.compose.runtime.a aVar, int i) {
        String O;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1368998141, i, -1, "com.vk.newsfeed.posting.impl.presentation.base.view.steps.getSubtitle (PrivacyBottomSheetEntryPointCell.kt:66)");
        }
        if (epx.f(privacyPostType, PrivacyPostType.AllUsers.b)) {
            aVar.K(1347227326);
            O = z ? zq.a(aVar, -1185612243, R.string.privacy_settings_visible_all_users, aVar, 0) : zq.a(aVar, -1185519181, R.string.privacy_settings_visible_all, aVar, 0);
            aVar.j();
        } else if (epx.f(privacyPostType, PrivacyPostType.FriendsOnly.b)) {
            O = zq.a(aVar, 1347234683, R.string.privacy_settings_visible_friends, aVar, 0);
        } else if (epx.f(privacyPostType, PrivacyPostType.BestFriends.b)) {
            O = zq.a(aVar, 1347237952, R.string.privacy_settings_visible_best_friends, aVar, 0);
        } else if (epx.f(privacyPostType, PrivacyPostType.AllDonuts.b)) {
            O = zq.a(aVar, 1347241302, R.string.privacy_settings_all_donuts, aVar, 0);
        } else {
            if (!(privacyPostType instanceof PrivacyPostType.SingleDonutLevel)) {
                throw alb0.c(1347225977, aVar);
            }
            aVar.K(-1185083569);
            DonutLevel donutLevel = ((PrivacyPostType.SingleDonutLevel) privacyPostType).b;
            if (donutLevel == null) {
                aVar.K(-1185063234);
                aVar.j();
                O = null;
            } else {
                aVar.K(-1185063233);
                O = d370.O(R.string.privacy_settings_donut_level_and_higher, new Object[]{donutLevel.c}, aVar);
                aVar.j();
            }
            if (O == null) {
                O = zq.a(aVar, 1347248818, R.string.privacy_settings_donut_level, aVar, 0);
            } else {
                aVar.K(1347244819);
                aVar.j();
            }
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return O;
    }
}
