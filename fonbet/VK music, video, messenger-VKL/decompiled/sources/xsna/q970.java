package xsna;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: NotificationDataLossBottomSheetFragment.kt */
/* loaded from: classes4.dex */
public final class q970 extends jmu0 {
    public static final /* synthetic */ int i1 = 0;
    public euk h1;

    /* compiled from: NotificationDataLossBottomSheetFragment.kt */
    public static final class a extends kmu0 {
        public final euk h;

        public a(Context context, euk eukVar, com.vk.movika.sdk.base.ui.k kVar) {
            super(context, new p970());
            this.h = eukVar;
            q(false);
            r();
            p(false);
            this.d.A1 = kVar;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            q970 q970Var = new q970();
            q970Var.An(false);
            q970Var.h1 = this.h;
            return q970Var;
        }
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        ColorFilter porterDuffColorFilter;
        aVar.K(-2042467419);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2042467419, 8, -1, "com.vk.newsfeed.posting.impl.presentation.NotificationDataLossBottomSheetFragment.ThemedContent (NotificationDataLossBottomSheetFragment.kt:43)");
        }
        jgh0 x = p490.x(aVar);
        q630.a aVar2 = q630.a.a;
        q630 D = p490.D(aVar2, x, 14);
        dt1.a.getClass();
        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, aVar, 48);
        int hashCode = Long.hashCode(n34.n(aVar));
        sy90 D2 = aVar.D();
        q630 c = qri.c(aVar, D);
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
        k9q0.w(aVar, D2, cri.a.e);
        k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
        k9q0.t(aVar, cri.a.h);
        k9q0.w(aVar, c, cri.a.d);
        ty6.a aVar4 = dt1.a.o;
        float f = 8;
        q630 H = s200.H(new gcv(aVar4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
        lg90 a3 = pg90.a(R.drawable.vk_icon_info_outline_56, 0, aVar);
        long j = wlb0.h(aVar).getIcon().h;
        if (Build.VERSION.SDK_INT >= 29) {
            se7.b();
            porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
        }
        vjw.a(a3, null, H, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j, 5, porterDuffColorFilter), aVar, 56, 56);
        yqv0.c(d370.N(R.string.notification_data_loss_title, 0, aVar), s200.H(new gcv(aVar4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 20, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 0L, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar).C, aVar, 0, 0, 8124);
        yqv0.c(d370.N(R.string.notification_data_loss_subtitle, 0, aVar), s200.H(new gcv(aVar4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(aVar).getText().r, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar).d0, aVar, 0, 0, 8120);
        f9t.e(txj0.h(aVar2, 24), aVar, 6);
        q630 f2 = txj0.f(aVar2, 1.0f);
        String N = d370.N(R.string.notification_data_loss_accept_button, 0, aVar);
        ButtonSize buttonSize = ButtonSize.Large;
        ButtonStyle buttonStyle = ButtonStyle.Secondary;
        ButtonAppearance buttonAppearance = ButtonAppearance.Negative;
        boolean y = aVar.y(this);
        Object x2 = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (y || x2 == c0012a) {
            x2 = new s6y(this, 17);
            aVar.R(x2);
        }
        bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, f2, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar, 28080, 0, 0, 4190176);
        f9t.e(txj0.h(aVar2, 12), aVar, 6);
        q630 f3 = txj0.f(aVar2, 1.0f);
        String N2 = d370.N(R.string.notification_data_loss_cancel_button, 0, aVar);
        ButtonAppearance buttonAppearance2 = ButtonAppearance.Accent;
        boolean y2 = aVar.y(this);
        Object x3 = aVar.x();
        if (y2 || x3 == c0012a) {
            x3 = new gzv(this, 23);
            aVar.R(x3);
        }
        bhu0.e((gzs) x3, buttonSize, buttonStyle, buttonAppearance2, f3, null, false, false, null, null, null, N2, null, null, null, null, false, null, null, null, aVar, 28080, 0, 0, 4190176);
        aVar.G();
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
