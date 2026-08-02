package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.coauthors.list.pendings.mvi.entity.state.ClipCoauthorsDecisionLaunchType;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.d;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class jnc implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jnc(d.b.a aVar, mtk0 mtk0Var, int i) {
        this.b = 3;
        this.e = aVar;
        this.c = mtk0Var;
        this.d = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        q630.a aVar;
        Integer num;
        ClipCoauthorsDecisionLaunchType clipCoauthorsDecisionLaunchType;
        int i;
        switch (this.b) {
            case 0:
                znc zncVar = (znc) this.e;
                izs izsVar = (izs) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1724402075, intValue, -1, "com.vk.clips.coauthors.list.pendings.mvi.ClipCoauthorDecisionContent.<anonymous> (ClipCoauthorDecisionContent.kt:57)");
                    }
                    float f = 12;
                    uog0 d = vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                    q630.a aVar3 = q630.a.a;
                    q630 d2 = rte0.d(aVar3, d);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    q630 m = hr80.m(d2, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, m);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar4);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    onc.c(zncVar, izsVar, null, aVar2, 0);
                    boolean z2 = zncVar.e;
                    ClipCoauthorsDecisionLaunchType clipCoauthorsDecisionLaunchType2 = zncVar.c;
                    if (z2) {
                        z = z2;
                        aVar = aVar3;
                        num = null;
                        clipCoauthorsDecisionLaunchType = clipCoauthorsDecisionLaunchType2;
                        aVar2.K(1261282023);
                    } else {
                        aVar2.K(1264307437);
                        z = z2;
                        num = null;
                        aVar = aVar3;
                        clipCoauthorsDecisionLaunchType = clipCoauthorsDecisionLaunchType2;
                        jqu0.a(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 6, 14);
                        aVar2 = aVar2;
                    }
                    aVar2.j();
                    ArrayList arrayList = zncVar.b;
                    boolean z3 = zncVar.e;
                    boolean J = aVar2.J(izsVar);
                    Object x = aVar2.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new op3(izsVar, 2);
                        aVar2.R(x);
                    }
                    onc.b(arrayList, z3, (izs) x, null, aVar2, 0);
                    f9t.e(txj0.h(aVar, f), aVar2, 6);
                    ButtonSize buttonSize = ButtonSize.Large;
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    if (clipCoauthorsDecisionLaunchType.equals(ClipCoauthorsDecisionLaunchType.AcceptRequest.b)) {
                        i = R.string.clips_coauthors_accept_invite_bs_button;
                    } else {
                        if (!clipCoauthorsDecisionLaunchType.equals(ClipCoauthorsDecisionLaunchType.DeclineRequest.b)) {
                            if (!(clipCoauthorsDecisionLaunchType instanceof ClipCoauthorsDecisionLaunchType.DeleteClip)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (z) {
                                i = R.string.clips_coauthors_decline_invite_bs_button_redesign;
                            }
                        }
                        i = R.string.clips_coauthors_decline_invite_bs_button;
                    }
                    String N = d370.N(i, 0, aVar2);
                    int i2 = this.d;
                    Integer valueOf = (z && i2 > 0 && ((clipCoauthorsDecisionLaunchType instanceof ClipCoauthorsDecisionLaunchType.AcceptRequest) || (clipCoauthorsDecisionLaunchType instanceof ClipCoauthorsDecisionLaunchType.DeclineRequest))) ? Integer.valueOf(i2) : num;
                    q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(aVar, 1.0f));
                    boolean z4 = i2 > 0;
                    boolean J2 = aVar2.J(zncVar) | aVar2.J(izsVar);
                    Object x2 = aVar2.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new kg(6, zncVar, izsVar);
                        aVar2.R(x2);
                    }
                    androidx.compose.runtime.a aVar5 = aVar2;
                    bhu0.e((gzs) x2, buttonSize, buttonStyle, buttonAppearance, F, null, false, false, null, null, null, N, valueOf, null, null, null, z4, null, null, null, aVar5, 28080, 0, 0, 4050912);
                    if (xga0.c(aVar, f, aVar5, 6)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                sku.a((pju) this.e, (izs) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                rok0.c((xow) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((d.b.a) this.e).e((mtk0) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.datacontent.presets.b.m((VideoMetaViewState.i) this.e, (q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(this.d | 1));
                return s3q0.a;
        }
    }

    public /* synthetic */ jnc(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.e = obj;
        this.c = obj2;
        this.d = i;
    }
}
