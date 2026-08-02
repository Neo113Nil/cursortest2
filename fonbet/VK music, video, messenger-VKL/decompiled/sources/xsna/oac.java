package xsna;

import android.net.Uri;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.market.album.MarketEditAlbumCoverFragment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.im.dto.EduAuthData;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vk.superapp.api.dto.auth.ReloginParams;
import com.vk.superapp.holders.TileScrollLayoutManager;
import com.vk.superapp.ui.SuperAppTilesRowLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Triple;
import kotlin.collections.EmptySet;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.ejd0;
import xsna.g7n0;
import xsna.q630;
import xsna.s5h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class oac implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oac(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = 2;
        switch (this.b) {
            case 0:
                dz40.d.b bVar = (dz40.d.b) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(807302182, intValue, -1, "com.vk.music.stickyplayer.presentation.components.chips.ChipConcerts.<anonymous> (Chip.kt:380)");
                    }
                    fbc.o(bVar.b, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                s5h s5hVar = (s5h) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-465130698, intValue2, -1, "com.vk.profile.community.impl.ui.item.header.CommunityInternalMenuItemViewHolder.<anonymous>.<anonymous> (CommunityInternalMenuItemViewHolder.kt:55)");
                    }
                    q630.a aVar3 = q630.a.a;
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, aVar3);
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
                    k9q0.w(aVar2, d, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    s5hVar.s6(0, aVar2);
                    s5h.a.a(null, false, 0L, null, s5hVar, aVar2, 0);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                sst0 sst0Var = (sst0) this.c;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1446324151, intValue3, -1, "com.vk.profile.core.tabs.ui.videos.CommunityProfileContentVideoViewHolder.setupShimmers.<anonymous> (CommunityProfileContentVideoViewHolder.kt:300)");
                    }
                    rrv0.d(null, null, null, null, kai.c(1064675442, new bh5(sst0Var, i), aVar5), aVar5, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 3:
                t5p t5pVar = (t5p) this.c;
                String str = (String) obj;
                UserId userId = (UserId) obj2;
                if (fkq0.c(userId)) {
                    b25 a = o25.a();
                    new ReloginParams(userId, null);
                    a.getClass();
                    return s3q0.a;
                }
                String uuid = UUID.randomUUID().toString();
                String str2 = "https://" + "oauth.".concat(a0a.d) + "/blank.html";
                zsu0 zsu0Var = new zsu0();
                zsu0Var.a = uuid;
                zsu0Var.b = str2;
                String queryParameter = Uri.parse(str).getQueryParameter("action");
                zsu0Var.f = queryParameter != null ? queryParameter : "";
                Uri.Builder buildUpon = zsu0Var.a(str).buildUpon();
                if (dhr0.M()) {
                    buildUpon.appendQueryParameter("scheme", "space_gray");
                }
                EmptySet.b.getClass();
                new EduAuthData(buildUpon.build().toString(), "https://" + "oauth.".concat(a0a.d) + "/blank.html", null, null);
                t5pVar.a();
                return s3q0.a;
            case 4:
                EntriesListPresenter entriesListPresenter = (EntriesListPresenter) this.c;
                u1c0 u1c0Var = (u1c0) obj;
                u1c0Var.h = (ol60) j5g.a0(new uy9((h170) entriesListPresenter.m.getValue()).l(0, new Triple((NewsEntry) obj2, u1c0Var.b, entriesListPresenter.b.M0())));
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((v0r) this.c).i(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                e7v e7vVar = (e7v) this.c;
                if (((q7v0) obj).d((VkOnboardingCampaign) obj2)) {
                    e7vVar.a.a(new vic0());
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                ((uiy) this.c).b(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                f2h0 f2h0Var = (f2h0) obj;
                List list = (List) ((wzs) this.c).invoke(f2h0Var, obj2);
                List list2 = list;
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (obj3 != null && !f2h0Var.a(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i2 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list2.isEmpty()) {
                    return null;
                }
                return new ArrayList(list2);
            case 9:
                MarketEditAlbumCoverFragment marketEditAlbumCoverFragment = (MarketEditAlbumCoverFragment) this.c;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i3 = MarketEditAlbumCoverFragment.d0;
                if (aVar6.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1623704687, intValue4, -1, "com.vk.ecomm.market.album.MarketEditAlbumCoverFragment.onViewCreated.<anonymous> (MarketEditAlbumCoverFragment.kt:177)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-2036105908, new id4(marketEditAlbumCoverFragment, 6), aVar6), aVar6, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                ((xl20) this.c).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 11:
                lb40 lb40Var = (lb40) this.c;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1217742780, intValue5, -1, "com.vk.music.stickyplayer.presentation.components.MusicBigPlayerControls.Content.<anonymous> (MusicBigPlayerControls.kt:42)");
                    }
                    lb40Var.d(0, aVar7);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 12:
                com.vk.newsfeed.common.recycler.holders.i iVar = (com.vk.newsfeed.common.recycler.holders.i) this.c;
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                float b = floatValue - cn70.b(56);
                float f = (floatValue2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || b <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 0.0f : b / floatValue2;
                if (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = 0.83f;
                }
                iVar.Q.setRatio(f);
                return s3q0.a;
            case 13:
                ((lld0) this.c).a.invoke(new ejd0.f.a(((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 14:
                ((Integer) obj2).getClass();
                x5g0.b((q630) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 15:
                String str3 = (String) this.c;
                UIBlockList uIBlockList = (UIBlockList) ((UIBlock) obj).zb();
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                Iterator it = j5g.s0(e43.g(arrayList), 1).iterator();
                while (it.hasNext()) {
                    int intValue6 = ((Number) it.next()).intValue();
                    if (arrayList.get(intValue6) instanceof UIBlockHeader) {
                        int i4 = intValue6 + 1;
                        if ((arrayList.get(i4) instanceof UIBlockList) && cal0.b(str3, ((UIBlockList) arrayList.get(i4)).y)) {
                            UIBlockBadge uIBlockBadge = ((UIBlockHeader) arrayList.get(intValue6)).C;
                            CatalogBadge catalogBadge = uIBlockBadge != null ? uIBlockBadge.y : null;
                            if (catalogBadge != null) {
                                String str4 = catalogBadge.b;
                                if (str4.length() > 0) {
                                    int parseInt = Integer.parseInt(str4) - 1;
                                    String valueOf = parseInt > 0 ? String.valueOf(parseInt) : "";
                                    UIBlockBadge uIBlockBadge2 = ((UIBlockHeader) arrayList.get(intValue6)).C;
                                    if (uIBlockBadge2 != null) {
                                        uIBlockBadge2.y = CatalogBadge.zb(catalogBadge, valueOf, 2);
                                    }
                                }
                            }
                        }
                    }
                }
                cal0.c(uIBlockList, str3, new z6u(21), new l4k0(true ? 1 : 0));
                ArrayList<UIBlock> arrayList2 = uIBlockList.y;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : arrayList2) {
                    if (obj4 instanceof UIBlockList) {
                        arrayList3.add(obj4);
                    }
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    cal0.c((UIBlockList) it2.next(), str3, new ev60(11), new m4k0(i));
                }
                return uIBlockList;
            case 16:
                g7n0.c cVar = (g7n0.c) this.c;
                RecyclerView recyclerView = (RecyclerView) obj;
                ((Integer) obj2).getClass();
                RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                return layoutManager instanceof SuperAppTilesRowLayoutManager ? new c2q0(recyclerView, cVar, (wzs) null, new d7n0(com.vk.metrics.eventtracking.b.a), (pvx) null, 44) : layoutManager instanceof TileScrollLayoutManager ? new c2q0(recyclerView, cVar, (wzs) null, new e7n0(com.vk.metrics.eventtracking.b.a), (pvx) null, 44) : new k470(recyclerView, new f7n0(), true, null, new j470(com.vk.metrics.eventtracking.b.a), 24);
            case 17:
                arq0 arq0Var = (arq0) this.c;
                q630.a aVar8 = q630.a.a;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue7 = ((Integer) obj2).intValue();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (aVar9.t(intValue7 & 1, (intValue7 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(340822503, intValue7, -1, "com.vk.profile.user.impl.ui.adapter.holders.lego.UserProfileLegoHeaderViewHolder.Content.<anonymous> (UserProfileLegoHeaderViewHolder.kt:72)");
                    }
                    ja5 v = jgz.v(0, 0, aVar9, 7);
                    ja5 ja5Var = (ja5) ((zak0) arq0Var.s).getValue();
                    ja5 ja5Var2 = ja5Var == null ? v : ja5Var;
                    boolean J = aVar9.J(ja5Var2) | aVar9.y(arq0Var);
                    Object x = aVar9.x();
                    Object obj5 = x;
                    if (J || x == c0012a) {
                        brq0 brq0Var = new brq0(ja5Var2, arq0Var, null);
                        aVar9.R(brq0Var);
                        obj5 = brq0Var;
                    }
                    bap.g(ja5Var2, (wzs) obj5, aVar9, 0);
                    AuthorHeaderConfig authorHeaderConfig = (AuthorHeaderConfig) ((zak0) arq0Var.r).getValue();
                    if (authorHeaderConfig == null) {
                        aVar9.K(141112775);
                        aVar9.j();
                    } else {
                        aVar9.K(141112776);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar9.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        q630 m = hr80.m(aVar8, ylu0Var.getBackground().a, androidx.compose.ui.graphics.e.a);
                        boolean booleanValue = ((Boolean) ((zak0) arq0Var.u).getValue()).booleanValue();
                        int i5 = y1z.a;
                        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                        float j1 = ((azl) aVar9.r(uvi.h)).j1(((wak0) arq0Var.p).getIntValue());
                        boolean y = aVar9.y(arq0Var);
                        Object x2 = aVar9.x();
                        Object obj6 = x2;
                        if (y || x2 == c0012a) {
                            l850 l850Var = new l850(arq0Var, 25);
                            aVar9.R(l850Var);
                            obj6 = l850Var;
                        }
                        com.vk.profile.design.compose.header.d.a(authorHeaderConfig, (izs) obj6, m, ja5Var2, j1, booleanValue, false, aVar9, 0);
                        aVar9.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
            case 18:
                cit0 cit0Var = (cit0) this.c;
                UIBlockList a2 = bit0.a.a((UIBlockList) obj);
                cit0Var.c = Integer.valueOf(a2.hashCode());
                return a2;
            default:
                jmu0 jmu0Var = (jmu0) this.c;
                androidx.compose.runtime.a aVar10 = (androidx.compose.runtime.a) obj;
                int intValue8 = ((Integer) obj2).intValue();
                int i6 = jmu0.g1;
                if (aVar10.t(intValue8 & 1, (intValue8 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1251566843, intValue8, -1, "com.vk.core.compose.modal.VkComposeModalBottomSheet.Content.<anonymous> (VkComposeModalBottomSheet.kt:7)");
                    }
                    jmu0Var.co(8, aVar10);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar10.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ oac(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }

    public /* synthetic */ oac(cal0 cal0Var, String str) {
        this.b = 15;
        this.c = str;
    }

    public /* synthetic */ oac(arq0 arq0Var) {
        this.b = 17;
        this.c = arq0Var;
    }
}
