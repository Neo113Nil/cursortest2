package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.feature.OfflinePodcastEpisodesMviState;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class am3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ am3(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((hm3) this.c).d((km3) this.d, (String) this.e, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                q630 q630Var = (q630) this.c;
                xvy xvyVar = (xvy) this.d;
                izs izsVar = (izs) this.e;
                ((Integer) obj2).getClass();
                com.vk.profile.community.members.impl.ui.d.e(ne7.I(1), (androidx.compose.runtime.a) obj, izsVar, xvyVar, q630Var);
                return s3q0.a;
            case 2:
                OfflinePodcastEpisodesMviState.SortType sortType = (OfflinePodcastEpisodesMviState.SortType) this.c;
                izs izsVar2 = (izs) this.d;
                gzs gzsVar = (gzs) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1613977035, intValue, -1, "com.vk.music.podcast.impl.ui.offlinepage.presentation.compose.SortBottomSheet.<anonymous> (OfflinePodcastEpisodesMviComposeComponent.kt:328)");
                    }
                    q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar, 0);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, H);
                    cri.h7.getClass();
                    LayoutNode.a aVar2 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar2);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    muv0.h(TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.catalog_offline_replacement_title, 0, aVar), null, null, null, null, aVar, 196608, 30), null, null, null, aVar, 14), null, null, null, null, null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar, 0, 0, 8190);
                    aVar.K(146172591);
                    for (OfflinePodcastEpisodesMviState.SortType sortType2 : OfflinePodcastEpisodesMviState.SortType.i()) {
                        boolean z = sortType2 == sortType;
                        boolean J = aVar.J(izsVar2) | aVar.J(gzsVar);
                        Object x = aVar.x();
                        if (J || x == a.C0011a.a) {
                            x = new fo6(18, izsVar2, gzsVar);
                            aVar.R(x);
                        }
                        cv70.h(sortType2, z, (izs) x, null, aVar, 0);
                    }
                    if (gp.d(aVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            default:
                hh80 hh80Var = (hh80) this.c;
                mc90 mc90Var = (mc90) this.d;
                izs izsVar3 = (izs) this.e;
                ((Integer) obj2).getClass();
                pf80.b(ne7.I(7), (androidx.compose.runtime.a) obj, izsVar3, hh80Var, mc90Var);
                return s3q0.a;
        }
    }

    public /* synthetic */ am3(OfflinePodcastEpisodesMviState.SortType sortType, izs izsVar, gzs gzsVar) {
        this.b = 2;
        this.c = sortType;
        this.d = izsVar;
        this.e = gzsVar;
    }
}
