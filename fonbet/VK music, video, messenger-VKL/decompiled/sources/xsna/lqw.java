package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ImportContactsModal.kt */
/* loaded from: classes2.dex */
public final class lqw extends jmu0 {
    public owv h1;

    /* compiled from: ImportContactsModal.kt */
    public static final class a extends kmu0 {
        public final owv h;

        public a(Context context, owv owvVar) {
            super(context, new kqw());
            this.h = owvVar;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            lqw lqwVar = new lqw();
            lqwVar.h1 = this.h;
            return lqwVar;
        }
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        aVar.K(565504644);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(565504644, 8, -1, "com.vk.importcontacts.impl.presentation.main.view.ImportContactsModal.ThemedContent (ImportContactsModal.kt:39)");
        }
        q630.a aVar2 = q630.a.a;
        q630 f = txj0.f(aVar2, 1.0f);
        a.m mVar = androidx.compose.foundation.layout.a.c;
        dt1.a.getClass();
        androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
        int hashCode = Long.hashCode(n34.n(aVar));
        sy90 D = aVar.D();
        q630 c = qri.c(aVar, f);
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
        cri.a.c cVar = cri.a.f;
        k9q0.w(aVar, a2, cVar);
        cri.a.e eVar = cri.a.e;
        k9q0.w(aVar, D, eVar);
        Integer valueOf = Integer.valueOf(hashCode);
        cri.a.b bVar = cri.a.g;
        k9q0.w(aVar, valueOf, bVar);
        cri.a.C2678a c2678a = cri.a.h;
        k9q0.t(aVar, c2678a);
        cri.a.d dVar = cri.a.d;
        k9q0.w(aVar, c, dVar);
        gcv gcvVar = new gcv(dt1.a.o);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1218192156, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-PhoneOutline56> (VkSdkIcons.kt:2806)");
        }
        lg90 a3 = pg90.a(R.drawable.vk_icon_phone_outline_56, 0, aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        vqv.a(a3, null, gcvVar, wlb0.h(aVar).getIcon().a, aVar, 56, 0);
        float f2 = 12;
        yqv0.a(d370.N(R.string.import_contacts_modal_title, 0, aVar), txj0.f(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), wlb0.h(aVar).getText().m, l2l0.l(20), null, null, 0L, 3, 0L, null, 0, false, 0, 0, null, wlb0.l(aVar).C, aVar, 3120, 0, 523248);
        yqv0.a(d370.N(R.string.import_contacts_modal_subtitle, 0, aVar), txj0.f(s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32, 5), 1.0f), wlb0.h(aVar).getText().p, l2l0.l(14), null, null, 0L, 3, 0L, null, 0, false, 0, 0, null, wlb0.l(aVar).e0, aVar, 3120, 0, 523248);
        q630 f3 = txj0.f(aVar2, 1.0f);
        androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, aVar, 0);
        int hashCode2 = Long.hashCode(n34.n(aVar));
        sy90 D2 = aVar.D();
        q630 c2 = qri.c(aVar, f3);
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
        k9q0.w(aVar, a4, cVar);
        k9q0.w(aVar, D2, eVar);
        ur.d(hashCode2, aVar, bVar, aVar, c2678a);
        k9q0.w(aVar, c2, dVar);
        if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            szw.a("invalid weight; must be greater than zero");
        }
        q630 E = ahn.E(s200.H(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), "skipBtnConfirmationTestTag");
        String N = d370.N(R.string.import_contacts_modal_skip_button_text, 0, aVar);
        ButtonSize buttonSize = ButtonSize.Large;
        ButtonStyle buttonStyle = ButtonStyle.Secondary;
        ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
        boolean y = aVar.y(this);
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (y || x == c0012a) {
            x = new myh(this, 25);
            aVar.R(x);
        }
        bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar, X2.b.f, 0, 0, 4190176);
        if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            szw.a("invalid weight; must be greater than zero");
        }
        xpy xpyVar = new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
        String N2 = d370.N(R.string.import_contacts_modal_add_button_text, 0, aVar);
        ButtonStyle buttonStyle2 = ButtonStyle.Primary;
        boolean y2 = aVar.y(this);
        Object x2 = aVar.x();
        if (y2 || x2 == c0012a) {
            x2 = new flu(this, 7);
            aVar.R(x2);
        }
        bhu0.e((gzs) x2, buttonSize, buttonStyle2, buttonAppearance, xpyVar, null, false, false, null, null, null, N2, null, null, null, null, false, null, null, null, aVar, X2.b.f, 0, 0, 4190176);
        if (kr.f(aVar)) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
    }
}
