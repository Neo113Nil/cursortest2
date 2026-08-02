package xsna;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageButton;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: MessagePopupDialog.kt */
/* loaded from: classes4.dex */
public final class ua20 extends jmu0 {
    public static final /* synthetic */ int k1 = 0;
    public PostingUserMessage.PopupDialog h1;
    public PostingAction i1;
    public izs<? super PostingAction, s3q0> j1 = new per(11);

    /* compiled from: MessagePopupDialog.kt */
    public static final class a extends kmu0 {
        public final PostingUserMessage.PopupDialog h;
        public final PostingAction i;
        public final PostingFragment.d j;

        public a(Context context, PostingUserMessage.PopupDialog popupDialog, PostingAction postingAction, PostingFragment.d dVar) {
            super(context, new ta20());
            this.h = popupDialog;
            this.i = postingAction;
            this.j = dVar;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            ua20 ua20Var = new ua20();
            ua20Var.h1 = this.h;
            ua20Var.i1 = this.i;
            ua20Var.j1 = this.j;
            return ua20Var;
        }
    }

    /* compiled from: MessagePopupDialog.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((ua20) this.receiver).hide();
            return s3q0.a;
        }
    }

    public static String eo(PostingUserMessageText postingUserMessageText, androidx.compose.runtime.a aVar, int i) {
        String N;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(928014941, i, -1, "com.vk.newsfeed.posting.impl.presentation.base.fragment.MessagePopupDialog.getString (MessagePopupDialog.kt:134)");
        }
        if (postingUserMessageText instanceof PostingUserMessageText.StringText) {
            aVar.K(-1530835199);
            aVar.j();
            N = ((PostingUserMessageText.StringText) postingUserMessageText).b;
        } else {
            if (!(postingUserMessageText instanceof PostingUserMessageText.ResText)) {
                throw alb0.c(-1530837048, aVar);
            }
            aVar.K(-1530833582);
            N = d370.N(((PostingUserMessageText.ResText) postingUserMessageText).b, 0, aVar);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return N;
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        ColorFilter porterDuffColorFilter;
        int i2;
        int i3;
        a.C0011a.C0012a c0012a;
        ua20 ua20Var;
        int i4;
        aVar.K(832193138);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(832193138, 8, -1, "com.vk.newsfeed.posting.impl.presentation.base.fragment.MessagePopupDialog.ThemedContent (MessagePopupDialog.kt:50)");
        }
        PostingUserMessage.PopupDialog popupDialog = this.h1;
        if (popupDialog == null) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
            return;
        }
        PostingUserMessageIcon postingUserMessageIcon = popupDialog.b;
        jgh0 x = p490.x(aVar);
        q630.a aVar2 = q630.a.a;
        q630 E = ahn.E(p490.D(aVar2, x, 14), "PostingPopupDialog");
        dt1.a.getClass();
        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, aVar, 48);
        int hashCode = Long.hashCode(n34.n(aVar));
        sy90 D = aVar.D();
        q630 c = qri.c(aVar, E);
        cri.h7.getClass();
        LayoutNode.a aVar3 = cri.a.b;
        if (aVar.N() == null) {
            n34.r();
            throw null;
        }
        aVar.H();
        if (aVar.L()) {
            aVar.I(aVar3);
        } else {
            aVar.f();
        }
        k9q0.w(aVar, a2, cri.a.f);
        k9q0.w(aVar, D, cri.a.e);
        k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
        k9q0.t(aVar, cri.a.h);
        k9q0.w(aVar, c, cri.a.d);
        float f = 8;
        f9t.e(txj0.h(aVar2, f), aVar, 6);
        q630 q = txj0.q(aVar2, 56);
        lg90 a3 = pg90.a(postingUserMessageIcon.b, 0, aVar);
        long c2 = f870.c(e3m.f(postingUserMessageIcon.c, (Context) aVar.r(AndroidCompositionLocals_androidKt.b)));
        if (Build.VERSION.SDK_INT >= 29) {
            se7.b();
            porterDuffColorFilter = re7.b(f870.H(c2), z42.a(5));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(f870.H(c2), z42.b(5));
        }
        vjw.a(a3, null, q, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(c2, 5, porterDuffColorFilter), aVar, 440, 56);
        PostingUserMessageText postingUserMessageText = popupDialog.c;
        q630 E2 = ahn.E(s200.H(txj0.f(aVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 17, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), "PostingPopupTitle");
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(868988748, 560, -1, "com.vk.newsfeed.posting.impl.presentation.base.fragment.MessagePopupDialog.Title (MessagePopupDialog.kt:109)");
        }
        String eo = eo(postingUserMessageText, aVar, 64);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        iyk0 iyk0Var = rrv0.a;
        ylu0 ylu0Var = (ylu0) aVar.r(iyk0Var);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getText().m;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
        }
        iyk0 iyk0Var2 = rrv0.c;
        wuv0 wuv0Var = (wuv0) aVar.r(iyk0Var2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        yqv0.c(eo, E2, j, null, null, 0, 3, null, 2, false, 0, 2, null, wuv0Var.z, aVar, 100663344, 48, 5816);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        PostingUserMessageText postingUserMessageText2 = popupDialog.d;
        q630 H = s200.H(txj0.f(aVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
        if (androidx.compose.runtime.b.d()) {
            i2 = -1;
            androidx.compose.runtime.b.f(-2064049040, 560, -1, "com.vk.newsfeed.posting.impl.presentation.base.fragment.MessagePopupDialog.Subtitle (MessagePopupDialog.kt:123)");
        } else {
            i2 = -1;
        }
        String eo2 = eo(postingUserMessageText2, aVar, 64);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, i2, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var2 = (ylu0) aVar.r(iyk0Var);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j2 = ylu0Var2.getText().r;
        if (androidx.compose.runtime.b.d()) {
            i3 = 0;
            androidx.compose.runtime.b.f(-473561179, 0, i2, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
        } else {
            i3 = 0;
        }
        wuv0 wuv0Var2 = (wuv0) aVar.r(iyk0Var2);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        int i5 = i3;
        yqv0.c(eo2, H, j2, null, null, 0, 3, null, 0, false, 0, 0, null, wuv0Var2.d0, aVar, 48, 0, 8120);
        androidx.compose.runtime.a aVar4 = aVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        f9t.e(txj0.h(aVar2, 32), aVar4, 6);
        PostingUserMessageButton postingUserMessageButton = popupDialog.e;
        a.C0011a.C0012a c0012a2 = a.C0011a.a;
        if (postingUserMessageButton == null) {
            aVar4.K(-1053759344);
            aVar4.j();
            ua20Var = this;
            c0012a = c0012a2;
        } else {
            aVar4.K(-1053759343);
            q630 E3 = ahn.E(txj0.f(aVar2, 1.0f), "PostingPopupActionButton");
            String eo3 = eo(postingUserMessageButton.b, aVar4, 64);
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean y = aVar4.y(postingUserMessageButton) | aVar4.y(this);
            Object x2 = aVar4.x();
            if (y || x2 == c0012a2) {
                x2 = new com.vk.movika.sdk.base.ui.l(14, postingUserMessageButton, this);
                aVar4.R(x2);
            }
            c0012a = c0012a2;
            ua20Var = this;
            bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, E3, null, false, false, null, null, null, eo3, null, null, null, null, false, null, null, null, aVar, 28080, 0, 0, 4190176);
            aVar4 = aVar;
            aVar4.j();
        }
        f9t.e(txj0.h(aVar2, 12), aVar4, 6);
        q630 E4 = ahn.E(txj0.f(aVar2, 1.0f), "PostingPopupCancelButton");
        boolean y2 = aVar4.y(ua20Var);
        Object x3 = aVar4.x();
        if (y2 || x3 == c0012a) {
            i4 = i5;
            b bVar = new b(0, this, ua20.class, "hide", "hide()V", 0);
            aVar4.R(bVar);
            x3 = bVar;
        } else {
            i4 = i5;
        }
        bhu0.e((gzs) ((fcy) x3), ButtonSize.Large, ButtonStyle.Secondary, ButtonAppearance.Neutral, E4, null, false, false, null, null, null, d370.N(R.string.vk_bottomsheet_confirmation_cancel, i4, aVar4), null, null, null, null, false, null, null, null, aVar, 28080, 0, 0, 4190176);
        aVar.G();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
