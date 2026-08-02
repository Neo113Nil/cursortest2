package xsna;

import android.content.Context;
import android.text.Annotation;
import android.text.SpannableStringBuilder;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import xsna.cri;
import xsna.dt1;
import xsna.dw20;
import xsna.kpv;
import xsna.phw;
import xsna.q630;
import xsna.us2;

/* compiled from: StoryViewBestFriendsModal.kt */
/* loaded from: classes6.dex */
public final class clm0 extends dw20.b {
    public final String e;
    public final String f;
    public final ww g;
    public final cty h;

    public clm0(l7s l7sVar, String str, String str2, ww wwVar, cty ctyVar) {
        super(l7sVar, null);
        this.e = str;
        this.f = str2;
        this.g = wwVar;
        this.h = ctyVar;
    }

    public final void S0(gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1697485440);
        if ((i & 6) == 0) {
            i2 = i | (M.y(gzsVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1697485440, i2, -1, "com.vk.story.viewer.impl.presentation.stories.view.StoryViewBestFriendsModal.Builder.ActionButton (StoryViewBestFriendsModal.kt:175)");
            }
            aVar2 = M;
            bhu0.e(gzsVar, ButtonSize.Large, ButtonStyle.Secondary, ButtonAppearance.Accent, txj0.f(q630.a.a, 1.0f), null, false, false, null, null, null, d370.N(R.string.story_best_friends_modal_button, 0, M), null, null, null, null, false, null, null, null, aVar2, (i2 & 14) | 28080, 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new w78(this, gzsVar, i, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T0(zkm0 zkm0Var, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-518896151);
        int i2 = i | (M.y(zkm0Var) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-518896151, i2, -1, "com.vk.story.viewer.impl.presentation.stories.view.StoryViewBestFriendsModal.Builder.BottomSheetContent (StoryViewBestFriendsModal.kt:96)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            int i3 = i2 & 896;
            W0(((Boolean) wh50Var.getValue()).booleanValue(), zkm0Var, M, ((i2 << 3) & 112) | i3);
            q630.a aVar2 = q630.a.a;
            q630 D = s200.D(txj0.f(aVar2, 1.0f), 8);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new a2k(4, wh50Var);
                M.R(x2);
            }
            U0((gzs) x2, M, 54 | i3);
            q630 D3 = s200.D(aVar2, 16);
            boolean z = (i2 & 112) == 32;
            Object x3 = M.x();
            if (z || x3 == c0012a) {
                x3 = new i5(20, gzsVar, wh50Var);
                M.R(x3);
            }
            V0(i3 | 6, M, (gzs) x3, D3);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bqg(i, 5, this, zkm0Var, gzsVar);
        }
    }

    public final void U0(gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1299587005);
        if (M.t(i & 1, (i & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1299587005, i, -1, "com.vk.story.viewer.impl.presentation.stories.view.StoryViewBestFriendsModal.Builder.CloseButton (StoryViewBestFriendsModal.kt:187)");
            }
            dt1.a.getClass();
            q630 D = s200.D(ra8.a.b(q630.a.a, dt1.a.d), 16);
            lg90 a = pg90.a(R.drawable.vk_icon_dismiss_24, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            nzu0.c(gzsVar, a, d370.N(R.string.close, 0, M), D, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ylu0Var.getIcon().l, false, null, false, null, null, M, 70, 2000);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n85(this, gzsVar, i, 10);
        }
    }

    public final void V0(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(-2143341756);
        int i2 = (M.y(gzsVar) ? 32 : 16) | i | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2143341756, i2, -1, "com.vk.story.viewer.impl.presentation.stories.view.StoryViewBestFriendsModal.Builder.ContentColumn (StoryViewBestFriendsModal.kt:130)");
            }
            float f = 8;
            q630 H = s200.H(txj0.f(q630Var, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            int i3 = (i2 >> 6) & 14;
            Z0(i3, M);
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.h(aVar3, 16), M, 6);
            Y0(i3, M);
            f9t.e(txj0.h(aVar3, f), M, 6);
            X0(i3, M);
            f9t.e(txj0.h(aVar3, 32), M, 6);
            S0(gzsVar, M, (i2 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vy7(i, 8, this, q630Var, gzsVar);
        }
    }

    public final void W0(final boolean z, final zkm0 zkm0Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(1657861090);
        int i2 = (M.l(z) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= M.y(zkm0Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1657861090, i2, -1, "com.vk.story.viewer.impl.presentation.stories.view.StoryViewBestFriendsModal.Builder.HandleCloseLogic (StoryViewBestFriendsModal.kt:120)");
            }
            Boolean valueOf = Boolean.valueOf(z);
            int i3 = i2 & 14;
            boolean z2 = (i3 == 4) | ((i2 & 112) == 32);
            Object x = M.x();
            if (z2 || x == a.C0011a.a) {
                x = new blm0(z, zkm0Var, null);
                M.R(x);
            }
            bap.g(valueOf, (wzs) x, M, i3);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.alm0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    clm0.this.W0(z, zkm0Var, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void X0(int i, androidx.compose.runtime.a aVar) {
        long j;
        androidx.compose.runtime.a M = aVar.M(-685016485);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-685016485, i, -1, "com.vk.story.viewer.impl.presentation.stories.view.StoryViewBestFriendsModal.Builder.PrivacyText (StoryViewBestFriendsModal.kt:210)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = context.getText(R.string.story_best_friends_modal_text);
                M.R(x);
            }
            CharSequence charSequence = (CharSequence) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var.getText().l;
            StringBuilder sb = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            Annotation[] annotationArr = (Annotation[]) spannableStringBuilder.getSpans(0, charSequence.length(), Annotation.class);
            sb.append(charSequence.toString());
            int length = annotationArr.length;
            int i3 = 0;
            while (i3 < length) {
                Annotation annotation = annotationArr[i3];
                if (epx.f(annotation.getValue(), "privacy")) {
                    j = j2;
                    arrayList.add(new us2.b.a(spannableStringBuilder.getSpanStart(annotation), spannableStringBuilder.getSpanEnd(annotation), 8, new hik0(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534)));
                } else {
                    j = j2;
                }
                i3++;
                j2 = j;
            }
            String sb2 = sb.toString();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                arrayList2.add(((us2.b.a) arrayList.get(i4)).a(sb.length()));
            }
            us2 us2Var = new us2(sb2, arrayList2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.e0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.d(us2Var, null, ylu0Var2.getText().r, 3, null, 0, false, 0, null, null, frv0Var, M, 0, 0, 8122);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new l440(this, i, 2);
        }
    }

    public final void Y0(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-978040565);
        if ((i & 6) == 0) {
            i2 = (M.y(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-978040565, i2, -1, "com.vk.story.viewer.impl.presentation.stories.view.StoryViewBestFriendsModal.Builder.TitleText (StoryViewBestFriendsModal.kt:161)");
            }
            String str = this.f;
            if (str == null) {
                str = "";
            }
            String O = d370.O(R.string.story_best_friends_modal_title, new Object[]{str}, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(O, txj0.f(q630.a.a, 1.0f), j, null, null, 0, 3, null, 0, false, 0, 0, null, wuv0Var.C, aVar2, 48, 0, 8120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new v9q(this, i, 5);
        }
    }

    public final void Z0(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-212866192);
        if ((i & 6) == 0) {
            i2 = (M.y(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-212866192, i2, -1, "com.vk.story.viewer.impl.presentation.stories.view.StoryViewBestFriendsModal.Builder.UserAvatar (StoryViewBestFriendsModal.kt:148)");
            }
            float f = 32;
            ldu0.b(phw.a.a(fwu0.l(this.e, null, null, null, M, 0, 62), null, null, null, null, M, 196616, 30), 72, null, kpv.a.a(pg90.a(R.drawable.vk_icon_favorite_circle_fill_green_32, 0, M), l5g.k, byc0.b(f, f), null, false, null, null, M, 100663736, 248), null, false, null, null, null, M, 48, 500);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zs3(this, i, 1);
        }
    }
}
