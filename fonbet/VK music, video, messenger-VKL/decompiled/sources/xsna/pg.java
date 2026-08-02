package xsna;

import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.feature.music.offline.content.OfflineCatalogCategories;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.clips.design.view.timeline.TimelineBottomActionsView;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vk.libvideo.api.ad.a;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.poll.fragments.PollVotersFragment;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.stories.design.view.polls.AbstractPollView;
import com.vk.stories.design.view.polls.SimplePollView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.EmptyCoroutineContext;
import xsna.cri;
import xsna.dt1;
import xsna.osh;
import xsna.q630;
import xsna.ye0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class pg implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        View findViewByPosition;
        int i = this.b;
        int i2 = 10;
        Integer num2 = null;
        int i3 = 2;
        int i4 = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                SimplePollView simplePollView = (SimplePollView) obj3;
                com.vk.stories.design.view.polls.a aVar = (com.vk.stories.design.view.polls.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i5 = AbstractPollView.S;
                aVar.a(simplePollView.getPoll(), simplePollView.getPoll().f.get(intValue), false);
                aVar.setClickable(true);
                aVar.setEnabled(true);
                return s3q0.a;
            case 1:
                osh.a aVar2 = (osh.a) obj;
                l3f l3fVar = ((osh) obj3).f;
                List list = aVar2.a;
                if (list == null) {
                    list = EmptyList.b;
                }
                l3fVar.invoke(new d.n.c.a.b(list, aVar2.c));
                return s3q0.a;
            case 2:
                e64 e64Var = (e64) obj3;
                em50 em50Var = (em50) obj;
                j8n j8nVar = (j8n) obj2;
                if (j8nVar instanceof i8n) {
                    return em50Var.a(e64Var, j8nVar);
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                ((Integer) obj2).getClass();
                ((d010) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 4:
                j210 j210Var = (j210) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-749808556, intValue2, -1, "com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.adapter.review.MarketItemReviewItemComposeViewHolder.bind.<anonymous> (MarketItemReviewItemComposeViewHolder.kt:47)");
                    }
                    rrv0.d(null, null, null, null, kai.c(1401692665, new y6c(j210Var, 6), aVar3), aVar3, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((go20) obj3).b(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                MusicOfflineCatalogRootVh musicOfflineCatalogRootVh = (MusicOfflineCatalogRootVh) obj3;
                String str = (String) obj;
                MusicOfflineCatalogRootVh.a aVar4 = musicOfflineCatalogRootVh.B;
                if (aVar4 != null) {
                    aVar4.a(str);
                }
                if (str.length() > 0) {
                    musicOfflineCatalogRootVh.i8(vyh0.a);
                    musicOfflineCatalogRootVh.A.d();
                } else {
                    musicOfflineCatalogRootVh.i8(alj.a);
                    musicOfflineCatalogRootVh.I.a(OfflineCatalogCategories.All.n());
                }
                return s3q0.a;
            case 7:
                final PollVotersFragment pollVotersFragment = (PollVotersFragment) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i6 = PollVotersFragment.a0;
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1600647864, intValue3, -1, "com.vk.poll.fragments.PollVotersFragment.PollVotersContent.<anonymous> (PollVotersFragment.kt:114)");
                    }
                    q630.a aVar6 = q630.a.a;
                    q630 d = txj0.d(aVar6, 1.0f);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar5, 0);
                    int hashCode = Long.hashCode(n34.n(aVar5));
                    sy90 D = aVar5.D();
                    q630 c = qri.c(aVar5, d);
                    cri.h7.getClass();
                    LayoutNode.a aVar7 = cri.a.b;
                    if (aVar5.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar5.H();
                    if (aVar5.L()) {
                        aVar5.I(aVar7);
                    } else {
                        aVar5.f();
                    }
                    k9q0.w(aVar5, a, cri.a.f);
                    k9q0.w(aVar5, D, cri.a.e);
                    k9q0.w(aVar5, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar5, cri.a.h);
                    k9q0.w(aVar5, c, cri.a.d);
                    String N = d370.N(R.string.vk_back, 0, aVar5);
                    boolean y = aVar5.y(pollVotersFragment);
                    Object x = aVar5.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    Object obj4 = x;
                    if (y || x == c0012a) {
                        re40 re40Var = new re40(pollVotersFragment, i2);
                        aVar5.R(re40Var);
                        obj4 = re40Var;
                    }
                    gzs gzsVar = (gzs) obj4;
                    boolean J = aVar5.J(N);
                    Object x2 = aVar5.x();
                    Object obj5 = x2;
                    if (J || x2 == c0012a) {
                        ieo ieoVar = new ieo(N, i3);
                        aVar5.R(ieoVar);
                        obj5 = ieoVar;
                    }
                    TopBar$Before.e a2 = e.a.a(gzsVar, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) obj5, 3), aVar5, 196608, 14);
                    Bundle arguments = pollVotersFragment.getArguments();
                    String string = arguments != null ? arguments.getString("answer_name") : null;
                    if (string == null) {
                        string = "";
                    }
                    muv0.h(TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(string, null, null, null, null, aVar5, 196608, 30), null, null, null, aVar5, 14), null, null, null, a2, null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar5, 0, 0, 8174);
                    Object x3 = aVar5.x();
                    Object obj6 = x3;
                    if (x3 == c0012a) {
                        ltb0 ltb0Var = new ltb0(i4);
                        aVar5.R(ltb0Var);
                        obj6 = ltb0Var;
                    }
                    yjl b = rc90.b(0, (gzs) obj6, aVar5, 384, 3);
                    Object x4 = aVar5.x();
                    Object obj7 = x4;
                    if (x4 == c0012a) {
                        yvj j = bap.j(EmptyCoroutineContext.b, aVar5);
                        aVar5.R(j);
                        obj7 = j;
                    }
                    yvj yvjVar = (yvj) obj7;
                    Object x5 = aVar5.x();
                    int i7 = 21;
                    Object obj8 = x5;
                    if (x5 == c0012a) {
                        hc1 hc1Var = new hc1(i7, yvjVar, b);
                        aVar5.R(hc1Var);
                        obj8 = hc1Var;
                    }
                    final gzs gzsVar2 = (gzs) obj8;
                    Object x6 = aVar5.x();
                    int i8 = 16;
                    Object obj9 = x6;
                    if (x6 == c0012a) {
                        fy0 fy0Var = new fy0(i8, yvjVar, b);
                        aVar5.R(fy0Var);
                        obj9 = fy0Var;
                    }
                    final gzs gzsVar3 = (gzs) obj9;
                    Object x7 = aVar5.x();
                    Object obj10 = x7;
                    if (x7 == c0012a) {
                        f1m b2 = bbk0.b(new pp00(b, i7));
                        aVar5.R(b2);
                        obj10 = b2;
                    }
                    final mtk0 mtk0Var = (mtk0) obj10;
                    ejv0.a(s200.E(aVar6, 16, 8), Integer.valueOf(((Number) mtk0Var.getValue()).intValue()), false, null, kai.c(-485727403, new yzs() { // from class: xsna.mtb0
                        @Override // xsna.yzs
                        public final Object invoke(Object obj11, Object obj12, Object obj13) {
                            y4i0 y4i0Var = (y4i0) obj11;
                            androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj12;
                            int intValue4 = ((Integer) obj13).intValue();
                            int i9 = PollVotersFragment.a0;
                            if ((intValue4 & 6) == 0) {
                                intValue4 |= aVar8.J(y4i0Var) ? 4 : 2;
                            }
                            if (aVar8.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(-485727403, intValue4, -1, "com.vk.poll.fragments.PollVotersFragment.PollVotersContent.<anonymous>.<anonymous>.<anonymous> (PollVotersFragment.kt:150)");
                                }
                                PollVotersFragment pollVotersFragment2 = PollVotersFragment.this;
                                String str2 = (String) ((zak0) pollVotersFragment2.Y).getValue();
                                mtk0 mtk0Var2 = mtk0Var;
                                int i10 = (intValue4 & 14) | 3072;
                                pollVotersFragment2.io(i10, aVar8, str2, gzsVar2, y4i0Var, ((Number) mtk0Var2.getValue()).intValue() == 0);
                                pollVotersFragment2.io(i10, aVar8, (String) ((zak0) pollVotersFragment2.Z).getValue(), gzsVar3, y4i0Var, ((Number) mtk0Var2.getValue()).intValue() == 1);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar8.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar5), aVar5, 24582, 12);
                    nb90.a(b, null, null, null, 1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, null, null, null, kai.c(439680289, new htb0(pollVotersFragment, i4), aVar5), aVar5, 24576, 24576, 16366);
                    aVar5.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 8:
                SuggestedPostsFragment suggestedPostsFragment = (SuggestedPostsFragment) obj3;
                int i9 = 0;
                sq60 sq60Var = (sq60) obj2;
                RecyclerView recyclerView = suggestedPostsFragment.b0;
                if (recyclerView == null) {
                    return s3q0.a;
                }
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (sq60Var.e) {
                    num = Integer.valueOf(linearLayoutManager != null ? linearLayoutManager.v() : 0);
                } else {
                    num = null;
                }
                if (num != null) {
                    if (linearLayoutManager != null && (findViewByPosition = linearLayoutManager.findViewByPosition(num.intValue())) != null) {
                        i9 = findViewByPosition.getTop();
                    }
                    num2 = Integer.valueOf(i9);
                }
                suggestedPostsFragment.eo().c().H0(recyclerView, new hc3(i2, suggestedPostsFragment, sq60Var), new qg40(1, num, num2, linearLayoutManager, suggestedPostsFragment, sq60Var), sq60Var.a, sq60Var.c);
                return s3q0.a;
            case 9:
                iwo0 iwo0Var = (iwo0) obj;
                View view = (View) obj2;
                wzs<iwo0, View, s3q0> onActionListener$timeline_release = ((TimelineBottomActionsView) obj3).getOnActionListener$timeline_release();
                if (onActionListener$timeline_release != null) {
                    onActionListener$timeline_release.invoke(iwo0Var, view);
                }
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                ((lzo0) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                com.vk.movika.sdk.base.model.l lVar = (com.vk.movika.sdk.base.model.l) obj3;
                int intValue4 = ((Integer) obj).intValue();
                int intValue5 = ((Integer) obj2).intValue();
                ba30 ba30Var = (ba30) lVar.c;
                if (ba30Var != null) {
                    ka30 ka30Var = ba30Var.d;
                    boolean z = ka30Var.e;
                    float f = ka30Var.f;
                    ba30 ba30Var2 = new ba30(ba30Var.a, intValue5, intValue4, new ka30(ka30Var.a, ka30Var.b, ka30Var.c, ka30Var.d, z, f, (z && f <= ((float) intValue4)) || intValue4 >= intValue5), ba30Var.e);
                    lVar.c = ba30Var2;
                    VideoAutoPlay videoAutoPlay = ((l3s0) lVar.a).a;
                    je0 N0 = videoAutoPlay.N0();
                    if (N0 != null) {
                        videoAutoPlay.y.g(new a.b(ba30Var2), (ye0.a) N0);
                    }
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ pg(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
