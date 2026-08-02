package xsna;

import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.kbx0;
import xsna.liy;
import xsna.q630;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jiy implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ gzs d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jiy(KidsModeRestrictionRenderer.Source source, gzs gzsVar, gzs gzsVar2, Integer num) {
        this.b = 0;
        this.e = source;
        this.c = gzsVar;
        this.d = gzsVar2;
        this.f = num;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i;
        switch (this.b) {
            case 0:
                KidsModeRestrictionRenderer.Source source = (KidsModeRestrictionRenderer.Source) this.e;
                gzs gzsVar = (gzs) this.c;
                Integer num = (Integer) this.f;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(600503965, intValue, -1, "com.vk.musc.kidsmode.impl.presentation.EnabledKidsModeRestrictionContent.<anonymous> (KidsModeRestriction.kt:46)");
                    }
                    long j = wlb0.h(aVar).getBackground().g;
                    e.a aVar2 = androidx.compose.ui.graphics.e.a;
                    q630.a aVar3 = q630.a.a;
                    q630 d = txj0.d(s200.F(48, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, hr80.m(aVar3, j, aVar2)), 1.0f);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.o, aVar, 54);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, d);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar4);
                    } else {
                        aVar.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar, a, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar, c, dVar);
                    q630 d2 = rte0.d(txj0.q(aVar3, 96), vog0.a);
                    ty6 ty6Var = dt1.a.c;
                    cp10 d3 = ja8.d(ty6Var, false);
                    int hashCode2 = Long.hashCode(n34.n(aVar));
                    sy90 D2 = aVar.D();
                    q630 c2 = qri.c(aVar, d2);
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar4);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, d3, cVar);
                    k9q0.w(aVar, D2, eVar);
                    ur.d(hashCode2, aVar, bVar, aVar, c2678a);
                    k9q0.w(aVar, c2, dVar);
                    vjw.a(pg90.a(R.drawable.illustration_vk_music_pink_llama_96, 0, aVar), null, kci.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 5, 1, l2l0.o(txj0.d(aVar3, 1.0f), 1.15f, 1.15f)), ty6Var, wkj.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar, 28088, 96);
                    aVar.G();
                    float f = 12;
                    f9t.e(txj0.h(aVar3, f), aVar, 6);
                    int i2 = liy.a.$EnumSwitchMapping$0[source.ordinal()];
                    if (i2 == 1) {
                        i = R.string.restriction_from_settings_description;
                    } else if (i2 == 2) {
                        i = R.string.restriction_from_profile_description;
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R.string.unavailable_kids_mode_screen_description;
                    }
                    yqv0.c(d370.N(i, 0, aVar), txj0.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 300, 1, aVar3), wlb0.h(aVar).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar).T, aVar, 48, 0, 8120);
                    f9t.e(txj0.h(aVar3, 16), aVar, 6);
                    String N = d370.N(R.string.restriction_turn_off_kids_mode_button_title, 0, aVar);
                    ButtonSize buttonSize = ButtonSize.Small;
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    bhu0.e(gzsVar, buttonSize, buttonStyle, buttonAppearance, null, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar, X2.b.f, 0, 0, 4190192);
                    androidx.compose.runtime.a aVar5 = aVar;
                    gzs gzsVar2 = this.d;
                    if (gzsVar2 == null || num == null) {
                        aVar5.K(-1246541969);
                    } else {
                        aVar5.K(-1242088478);
                        f9t.e(txj0.h(aVar3, f), aVar5, 6);
                        bhu0.e(gzsVar2, buttonSize, ButtonStyle.Link, buttonAppearance, txj0.f(aVar3, 1.0f), null, false, false, null, null, null, d370.N(num.intValue(), 0, aVar5), null, null, null, null, false, null, null, null, aVar5, 28080, 0, 0, 4190176);
                        aVar5 = aVar5;
                    }
                    aVar5.j();
                    aVar5.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                uzp.b((ynr0) this.e, (gzs) this.c, this.d, (gzs) this.f, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                ((kbx0.b) this.e).a((kbx0.c) this.c, (ag1) this.d, (com.vk.movika.sdk.android.defaultplayer.container.e) this.f, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ jiy(Object obj, Object obj2, gzs gzsVar, gzs gzsVar2, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = obj2;
        this.d = gzsVar;
        this.f = gzsVar2;
    }
}
