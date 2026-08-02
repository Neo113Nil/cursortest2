package xsna;

import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.catalog2.common.dto.ui.UIBlockTopshelf;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.ecomm.market.album.MarketEditAlbumFinishedFragment;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photoviewer.PhotoViewer;
import com.vk.voip.ui.onboarding.features.FeatureId;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.media.OkmpStreamer;
import xsna.cri;
import xsna.dt1;
import xsna.hff;
import xsna.i7d0;
import xsna.it80;
import xsna.j7d0;
import xsna.je4;
import xsna.k7d0;
import xsna.ln50;
import xsna.q630;
import xsna.qv4;
import xsna.suq;
import xsna.tbd0;
import xsna.vdh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class zu3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zu3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        gzs<s3q0> gzsVar;
        gzs<s3q0> gzsVar2;
        com.vk.core.compose.component.semantics.a aVar;
        wzs<MarketProductTileConfig.f, Integer, s3q0> wzsVar;
        gzs<s3q0> gzsVar3;
        sa10 sa10Var;
        wzs wzsVar2;
        com.vk.core.compose.component.semantics.a aVar2;
        i7d0 i7d0Var;
        cdh cdhVar;
        wzs<MarketProductTileConfig.f, Integer, s3q0> wzsVar3;
        gzs<s3q0> gzsVar4;
        wzs wzsVar4;
        wzs<MarketProductTileConfig.f, Integer, s3q0> wzsVar5;
        sa10 sa10Var2;
        com.vk.core.compose.component.semantics.a aVar3;
        s3q0 createPublisher$lambda$10;
        int i = this.b;
        int i2 = 10;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        q630.a aVar4 = q630.a.a;
        us2 us2Var = null;
        boolean z3 = false;
        boolean z4 = false;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                av3 av3Var = (av3) obj3;
                Boolean bool = (Boolean) obj2;
                if (!((Boolean) obj).booleanValue() || !bool.booleanValue()) {
                    it80.b.getClass();
                    return it80.a.a();
                }
                it80.a aVar5 = it80.b;
                FeatureId featureId = av3Var.a;
                suq suqVar = new suq(featureId, av3Var.a(featureId), new suq.c.a(R.string.voip_feature_onboarding_asr_title, R.string.voip_feature_onboarding_asr_subtitle, 60, null));
                aVar5.getClass();
                return new it80(suqVar);
            case 1:
                ce4 ce4Var = (ce4) obj3;
                el50 el50Var = (el50) obj;
                je4 je4Var = (je4) obj2;
                if (!(je4Var instanceof je4.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                el50Var.f(el50Var, new in50(fpf0.a(je4.a.class)), ln50.a.a, new yl0(ce4Var, je4Var, el50Var, r10 ? 1 : 0));
                return s3q0.a;
            case 2:
                sjo.b(((View) obj).getBackground(), ((kkm) obj2).f(((qv4.a) obj3).a() ? R.attr.vk_legacy_destructive : R.attr.vk_legacy_accent), PorterDuff.Mode.SRC_IN);
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((hr8) obj3).e(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 4:
                hff hffVar = (hff) obj3;
                sti stiVar = (sti) obj;
                sl50 sl50Var = (sl50) obj2;
                lbk lbkVar = hffVar.a.c;
                hff.a aVar6 = hffVar.c;
                stiVar.a(new obf(sl50Var, lbkVar, aVar6.j));
                stiVar.a(new jef(sl50Var, aVar6.c));
                stiVar.a(new wgf(sl50Var, aVar6.f, aVar6.e));
                stiVar.a(new pkf(sl50Var, aVar6.i));
                stiVar.a(new ref(sl50Var));
                return s3q0.a;
            case 5:
                vdh.a aVar7 = (vdh.a) obj3;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar8.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1730606127, intValue, -1, "com.vk.profile.community.impl.ui.item.header.priorityblock.services.CommunityPriorityBlockServicesItem.ViewHolder.<anonymous>.<anonymous> (CommunityPriorityBlockServicesItem.kt:98)");
                    }
                    String N = d370.N(R.string.community_priority_block_header_market_services_add_btn_accessibility, 0, aVar8);
                    String N2 = d370.N(R.string.community_priority_block_header_market_services_show_all_btn_accessibility, 0, aVar8);
                    String str = aVar7.q6().b.a;
                    boolean z5 = aVar7.q6().b.b;
                    Object x = aVar8.x();
                    Object obj4 = x;
                    if (x == c0012a) {
                        lt0 lt0Var = new lt0(22);
                        aVar8.R(lt0Var);
                        obj4 = lt0Var;
                    }
                    com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(null, (izs) obj4, 3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-385535918, 3072, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlock.Header.Middle.Text.Companion.invoke (PrimaryBlock.kt:25)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(658630472, 6, -1, "com.vk.community.design.compose.primaryblock.remember (CommunityPrimaryBlockHeaderTextImpl.kt:66)");
                    }
                    Object x2 = aVar8.x();
                    Object obj5 = x2;
                    if (x2 == c0012a) {
                        hdh hdhVar = new hdh(a, str, z5);
                        aVar8.R(hdhVar);
                        obj5 = hdhVar;
                    }
                    hdh hdhVar2 = (hdh) obj5;
                    ((zak0) hdhVar2.a).setValue(str);
                    ((zak0) hdhVar2.b).setValue(Boolean.valueOf(z5));
                    ((zak0) hdhVar2.c).setValue(a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    boolean z6 = aVar7.q6().b.d;
                    boolean z7 = aVar7.q6().b.c;
                    gzs<s3q0> gzsVar5 = aVar7.o;
                    gzs<s3q0> gzsVar6 = aVar7.p;
                    boolean J = aVar8.J(N);
                    Object x3 = aVar8.x();
                    Object obj6 = x3;
                    if (J || x3 == c0012a) {
                        rdh rdhVar = new rdh(N, z3 ? 1 : 0);
                        aVar8.R(rdhVar);
                        obj6 = rdhVar;
                    }
                    com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) obj6, 3);
                    boolean J2 = aVar8.J(N2);
                    Object x4 = aVar8.x();
                    Object obj7 = x4;
                    if (J2 || x4 == c0012a) {
                        sdh sdhVar = new sdh(N2, z4 ? 1 : 0);
                        aVar8.R(sdhVar);
                        obj7 = sdhVar;
                    }
                    com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(null, (izs) obj7, 3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1985649738, 1572864, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlock.Header.RightActions.BaseActions.Companion.invoke (PrimaryBlock.kt:76)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1810662089, 6, -1, "com.vk.community.design.compose.primaryblock.remember (PrimaryBlockHeaderBaseRightActionsImpl.kt:104)");
                    }
                    Object x5 = aVar8.x();
                    if (x5 == c0012a) {
                        z = z6;
                        z2 = z7;
                        x5 = new q8d0(z, z2, gzsVar5, gzsVar6, a2, a3);
                        gzsVar = gzsVar5;
                        gzsVar2 = gzsVar6;
                        aVar = a2;
                        aVar8.R(x5);
                    } else {
                        z = z6;
                        z2 = z7;
                        gzsVar = gzsVar5;
                        gzsVar2 = gzsVar6;
                        aVar = a2;
                    }
                    q8d0 q8d0Var = (q8d0) x5;
                    ((zak0) q8d0Var.a).setValue(Boolean.valueOf(z));
                    ((zak0) q8d0Var.b).setValue(Boolean.valueOf(z2));
                    ((zak0) q8d0Var.c).setValue(gzsVar);
                    ((zak0) q8d0Var.d).setValue(gzsVar2);
                    ((zak0) q8d0Var.e).setValue(aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    fdh a4 = j7d0.a.a(hdhVar2, q8d0Var, aVar8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1224549335, 0, -1, "com.vk.profile.community.impl.ui.item.header.priorityblock.services.CommunityPriorityBlockServicesItem.ViewHolder.provideContent (CommunityPriorityBlockServicesItem.kt:142)");
                    }
                    tbd0 tbd0Var = aVar7.q6().c;
                    if (tbd0Var instanceof tbd0.d) {
                        aVar8.K(-902731468);
                        aVar8.K(-29115090);
                        tbd0.d dVar = (tbd0.d) tbd0Var;
                        ArrayList<MarketProductTileConfig> arrayList = dVar.a;
                        ArrayList arrayList2 = new ArrayList(c5g.u(new wow(arrayList), 10));
                        for (MarketProductTileConfig marketProductTileConfig : arrayList) {
                            boolean J3 = aVar8.J(marketProductTileConfig);
                            Object x6 = aVar8.x();
                            if (J3 || x6 == c0012a) {
                                x6 = new t9e(marketProductTileConfig, 5);
                                aVar8.R(x6);
                            }
                            arrayList2.add(new ua10(marketProductTileConfig, com.vk.core.compose.component.semantics.b.a(null, (izs) x6, 3)));
                        }
                        aVar8.j();
                        sa10 sa10Var3 = new sa10(arrayList2, false, dVar.b, dVar.c);
                        wzs<MarketProductTileConfig.f, Integer, s3q0> wzsVar6 = aVar7.t;
                        wzs<MarketProductTileConfig.f, Integer, s3q0> wzsVar7 = aVar7.u;
                        gzs<s3q0> gzsVar7 = aVar7.q;
                        gzs<s3q0> gzsVar8 = aVar7.r;
                        Object x7 = aVar8.x();
                        Object obj8 = x7;
                        if (x7 == c0012a) {
                            pf pfVar = new pf(18);
                            aVar8.R(pfVar);
                            obj8 = pfVar;
                        }
                        com.vk.core.compose.component.semantics.a a5 = com.vk.core.compose.component.semantics.b.a(null, (izs) obj8, 3);
                        boolean y = aVar8.y(aVar7);
                        Object x8 = aVar8.x();
                        Object obj9 = x8;
                        if (y || x8 == c0012a) {
                            tdh tdhVar = new tdh(aVar7);
                            aVar8.R(tdhVar);
                            obj9 = tdhVar;
                        }
                        wzs wzsVar8 = (wzs) obj9;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-506487261, 12582912, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlock.Content.Services.TileContent.Companion.invoke (PrimaryBlock.kt:184)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-505231698, 6, -1, "com.vk.community.design.compose.primaryblock.remember (PrimaryBlockServicesTileContentImpl.kt:177)");
                        }
                        Object x9 = aVar8.x();
                        if (x9 == c0012a) {
                            x9 = new f9d0(sa10Var3, wzsVar6, wzsVar7, wzsVar8, gzsVar7, gzsVar8, a5);
                            sa10Var2 = sa10Var3;
                            wzsVar5 = wzsVar6;
                            wzsVar3 = wzsVar7;
                            wzsVar4 = wzsVar8;
                            gzsVar4 = gzsVar8;
                            aVar3 = a5;
                            aVar8.R(x9);
                        } else {
                            wzsVar3 = wzsVar7;
                            gzsVar4 = gzsVar8;
                            wzsVar4 = wzsVar8;
                            wzsVar5 = wzsVar6;
                            sa10Var2 = sa10Var3;
                            aVar3 = a5;
                        }
                        f9d0 f9d0Var = (f9d0) x9;
                        ((zak0) f9d0Var.e).setValue(sa10Var2);
                        ((zak0) f9d0Var.f).setValue(wzsVar5);
                        ((zak0) f9d0Var.g).setValue(wzsVar3);
                        ((zak0) f9d0Var.h).setValue(wzsVar4);
                        ((zak0) f9d0Var.j).setValue(gzsVar4);
                        ((zak0) f9d0Var.k).setValue(aVar3);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar8.j();
                        i7d0Var = f9d0Var;
                    } else if (tbd0Var instanceof tbd0.b) {
                        aVar8.K(-901250784);
                        tbd0.b bVar = (tbd0.b) tbd0Var;
                        i7d0 a6 = i7d0.b.a.a(bVar.a, bVar.b, aVar7.q, aVar8);
                        aVar8.j();
                        i7d0Var = a6;
                    } else if (tbd0Var instanceof tbd0.e) {
                        aVar8.K(-900917720);
                        int i3 = iah0.g(aVar7.itemView.getContext()).x;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1788372693, 384, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlock.Content.Services.TileShimmer.Companion.invoke (PrimaryBlock.kt:223)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-2070286965, 6, -1, "com.vk.community.design.compose.primaryblock.remember (PrimaryBlockServicesTileShimmerContentImpl.kt:56)");
                        }
                        Object x10 = aVar8.x();
                        Object obj10 = x10;
                        if (x10 == c0012a) {
                            g9d0 g9d0Var = new g9d0(i3);
                            aVar8.R(g9d0Var);
                            obj10 = g9d0Var;
                        }
                        g9d0 g9d0Var2 = (g9d0) obj10;
                        ((zak0) g9d0Var2.d).setValue(Integer.valueOf(i3));
                        ((zak0) g9d0Var2.e).setValue(null);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar8.j();
                        i7d0Var = g9d0Var2;
                    } else if (tbd0Var instanceof tbd0.a) {
                        aVar8.K(-900719506);
                        tbd0.a aVar9 = (tbd0.a) tbd0Var;
                        i7d0 a7 = i7d0.a.C3034a.a(aVar9.a, aVar9.b, aVar7.o, aVar8);
                        aVar8.j();
                        i7d0Var = a7;
                    } else {
                        if (!(tbd0Var instanceof tbd0.c)) {
                            throw alb0.c(-29121232, aVar8);
                        }
                        aVar8.K(-900359968);
                        aVar8.K(-29038610);
                        tbd0.c cVar = (tbd0.c) tbd0Var;
                        ArrayList<MarketProductTileConfig> arrayList3 = cVar.a;
                        ArrayList arrayList4 = new ArrayList(c5g.u(new wow(arrayList3), 10));
                        for (MarketProductTileConfig marketProductTileConfig2 : arrayList3) {
                            boolean J4 = aVar8.J(marketProductTileConfig2);
                            Object x11 = aVar8.x();
                            if (J4 || x11 == c0012a) {
                                x11 = new vs(marketProductTileConfig2, 26);
                                aVar8.R(x11);
                            }
                            arrayList4.add(new ua10(marketProductTileConfig2, com.vk.core.compose.component.semantics.b.a(null, (izs) x11, 3)));
                        }
                        aVar8.j();
                        sa10 sa10Var4 = new sa10(arrayList4, cVar.b, cVar.c, cVar.d);
                        wzs<MarketProductTileConfig.f, Integer, s3q0> wzsVar9 = aVar7.t;
                        gzs<s3q0> gzsVar9 = aVar7.q;
                        gzs<s3q0> gzsVar10 = aVar7.r;
                        Object x12 = aVar8.x();
                        Object obj11 = x12;
                        if (x12 == c0012a) {
                            rf rfVar = new rf(24);
                            aVar8.R(rfVar);
                            obj11 = rfVar;
                        }
                        com.vk.core.compose.component.semantics.a a8 = com.vk.core.compose.component.semantics.b.a(null, (izs) obj11, 3);
                        boolean y2 = aVar8.y(aVar7);
                        Object x13 = aVar8.x();
                        Object obj12 = x13;
                        if (y2 || x13 == c0012a) {
                            udh udhVar = new udh(aVar7);
                            aVar8.R(udhVar);
                            obj12 = udhVar;
                        }
                        wzs wzsVar10 = (wzs) obj12;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(963885393, 1572864, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlock.Content.Services.ListContent.Companion.invoke (PrimaryBlock.kt:206)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(862123904, 6, -1, "com.vk.community.design.compose.primaryblock.remember (PrimaryBlockServicesListContentImpl.kt:255)");
                        }
                        Object x14 = aVar8.x();
                        if (x14 == c0012a) {
                            x14 = new w8d0(sa10Var4, wzsVar9, wzsVar10, gzsVar9, gzsVar10, a8);
                            sa10Var = sa10Var4;
                            wzsVar = wzsVar9;
                            wzsVar2 = wzsVar10;
                            gzsVar3 = gzsVar10;
                            aVar2 = a8;
                            aVar8.R(x14);
                        } else {
                            wzsVar = wzsVar9;
                            gzsVar3 = gzsVar10;
                            sa10Var = sa10Var4;
                            wzsVar2 = wzsVar10;
                            aVar2 = a8;
                        }
                        w8d0 w8d0Var = (w8d0) x14;
                        ((zak0) w8d0Var.d).setValue(sa10Var);
                        ((zak0) w8d0Var.e).setValue(wzsVar);
                        ((zak0) w8d0Var.f).setValue(wzsVar2);
                        ((zak0) w8d0Var.h).setValue(gzsVar3);
                        ((zak0) w8d0Var.i).setValue(aVar2);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar8.j();
                        i7d0Var = w8d0Var;
                    }
                    i7d0 i7d0Var2 = i7d0Var;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    rvw rvwVar = aVar7.q6().d;
                    if (rvwVar == null) {
                        aVar8.K(302185642);
                        aVar8.j();
                        cdhVar = null;
                    } else {
                        aVar8.K(302185643);
                        cdh a9 = k7d0.a.C3167a.a(rvwVar.a, rvwVar.b, aVar7.n, aVar8);
                        aVar8.j();
                        cdhVar = a9;
                    }
                    jdh.a(a4, i7d0Var2, txj0.z(txj0.f(aVar4, 1.0f), null, 3), cdhVar, aVar8, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar8.h();
                }
                return s3q0.a;
            case 6:
                m1i0 m1i0Var = (m1i0) obj3;
                androidx.compose.runtime.a aVar10 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar10.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(488888983, intValue2, -1, "com.vk.core.compose.component.ComposableSingletons$VkSecondaryTabRowKt.lambda$2108253928.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VkSecondaryTabRow.kt:565)");
                    }
                    Object x15 = aVar10.x();
                    if (x15 == c0012a) {
                        x15 = new com.vk.movika.sdk.base.logic.interactor.l(14);
                        aVar10.R(x15);
                    }
                    m1i0Var.b(true, x15, joi.e, null, aVar10, 438, 8);
                    Object x16 = aVar10.x();
                    if (x16 == c0012a) {
                        x16 = new com.vk.movika.sdk.base.logic.interactor.m(i2);
                        aVar10.R(x16);
                    }
                    m1i0Var.b(false, (gzs) x16, joi.f, null, aVar10, 438, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar10.h();
                }
                return s3q0.a;
            case 7:
                DiscoverMediaTabFragment2 discoverMediaTabFragment2 = (DiscoverMediaTabFragment2) obj3;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                discoverMediaTabFragment2.w0 = booleanValue;
                boolean z8 = discoverMediaTabFragment2.x0;
                if (booleanValue && z8) {
                    b0g.a(new b5n(discoverMediaTabFragment2));
                } else {
                    ThemableShimmer themableShimmer = discoverMediaTabFragment2.q0;
                    if (themableShimmer != null) {
                        themableShimmer.c();
                    }
                }
                ViewGroup viewGroup = discoverMediaTabFragment2.p0;
                if (viewGroup != null) {
                    bwt0.p0(viewGroup, booleanValue);
                }
                if (!booleanValue) {
                    x5n x5nVar = discoverMediaTabFragment2.d0;
                    if (!x5nVar.e) {
                        x5nVar.e = true;
                        jse0 jse0Var = x5nVar.c;
                        if (jse0Var != null) {
                            jse0Var.h();
                        }
                    }
                }
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                zmt.a((izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 9:
                MarketEditAlbumFinishedFragment marketEditAlbumFinishedFragment = (MarketEditAlbumFinishedFragment) obj3;
                androidx.compose.runtime.a aVar11 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i4 = MarketEditAlbumFinishedFragment.Q;
                if (aVar11.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1665021716, intValue3, -1, "com.vk.ecomm.market.album.MarketEditAlbumFinishedFragment.onCreateView.<anonymous>.<anonymous> (MarketEditAlbumFinishedFragment.kt:62)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-59554439, new bn7(marketEditAlbumFinishedFragment, 8), aVar11), aVar11, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar11.h();
                }
                return s3q0.a;
            case 10:
                ld10 ld10Var = (ld10) obj3;
                androidx.compose.runtime.a aVar12 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar12.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1901722100, intValue4, -1, "com.vk.ecomm.design.compose.property.MarketPropertyTextVariant.<anonymous> (MarketPropertyTextVariant.kt:61)");
                    }
                    dt1.a.getClass();
                    ty6 ty6Var = dt1.a.f;
                    q630 a10 = txj0.a(aVar4, 56, 36);
                    cp10 d = ja8.d(ty6Var, false);
                    int hashCode = Long.hashCode(n34.n(aVar12));
                    sy90 D = aVar12.D();
                    q630 c = qri.c(aVar12, a10);
                    cri.h7.getClass();
                    LayoutNode.a aVar13 = cri.a.b;
                    if (aVar12.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar12.H();
                    if (aVar12.L()) {
                        aVar12.I(aVar13);
                    } else {
                        aVar12.f();
                    }
                    k9q0.w(aVar12, d, cri.a.f);
                    k9q0.w(aVar12, D, cri.a.e);
                    k9q0.w(aVar12, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar12, cri.a.h);
                    k9q0.w(aVar12, c, cri.a.d);
                    String str2 = ld10Var.b;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar12.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    frv0 frv0Var = wuv0Var.h0;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar12.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str2, s200.E(aVar4, 14, 9), ylu0Var.getText().m, null, null, 0, 0, null, 0, false, 0, 1, null, frv0Var, aVar12, 0, 48, 6136);
                    aVar12.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar12.h();
                }
                return s3q0.a;
            case 11:
                mf30 mf30Var = (mf30) obj3;
                androidx.compose.runtime.a aVar14 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar14.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(253100468, intValue5, -1, "com.vk.catalog2.common.ui.holders.video.topshelf.components.MovieTextField.createView.<anonymous>.<anonymous> (MovieTextField.kt:44)");
                    }
                    UIBlockTopshelf.TopshelfItem topshelfItem = mf30Var.a;
                    Integer num = topshelfItem.f;
                    if (!(topshelfItem instanceof UIBlockTopshelf.TopshelfPlaylist) || num == null) {
                        aVar14.K(-1848433234);
                    } else {
                        aVar14.K(-1846360543);
                        rnu0.c(ContentBadgeSize.Medium, ContentBadgeMode.Primary, ContentBadgeAppearance.Design.Overlay, null, null, null, d370.F(R.plurals.catalog_topshelf_playlist_items_count, num.intValue(), new Object[]{num.toString()}, aVar14, 0), null, null, null, false, null, false, null, aVar14, 438, 0, 16312);
                    }
                    aVar14.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar14.h();
                }
                return s3q0.a;
            case 12:
                createPublisher$lambda$10 = OkmpStreamer.createPublisher$lambda$10((OkmpStreamer) obj3, ((Integer) obj).intValue(), (gzs) obj2);
                return createPublisher$lambda$10;
            case 13:
                PhotoFlowFragment photoFlowFragment = (PhotoFlowFragment) obj3;
                ((Integer) obj2).getClass();
                int i5 = PhotoFlowFragment.m0;
                return ((x7a0) photoFlowFragment.V.getValue()).d(photoFlowFragment.go(), (String) obj);
            case 14:
                PhotoViewer photoViewer = (PhotoViewer) obj3;
                ((Float) obj).getClass();
                ((Float) obj2).getClass();
                if (photoViewer.L && !photoViewer.M) {
                    photoViewer.M = true;
                    Toolbar toolbar = photoViewer.D;
                    toolbar.addOnLayoutChangeListener(new bea0(photoViewer));
                    toolbar.requestLayout();
                }
                return s3q0.a;
            case 15:
                ((Integer) obj2).getClass();
                ((xdg0) obj3).a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 16:
                ((Integer) obj2).getClass();
                ((ttq0) obj3).q6(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                DonutVideoUiModel.DescriptionChip descriptionChip = (DonutVideoUiModel.DescriptionChip) obj3;
                androidx.compose.runtime.a aVar15 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                aVar15.K(-968777628);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-968777628, intValue6, -1, "com.vk.catalog.mvi.block.video.impl.video.video.VideoViewStateMapper.map.<anonymous>.<anonymous> (VideoViewStateMapper.kt:76)");
                }
                DonutPriceTemplate donutPriceTemplate = descriptionChip.c;
                if (donutPriceTemplate == null) {
                    aVar15.K(1325959284);
                } else {
                    aVar15.K(1012604205);
                    us2Var = z1o.a(donutPriceTemplate, m4s.B(aVar15), aVar15, 0);
                }
                aVar15.j();
                if (us2Var == null) {
                    aVar15.K(1012608927);
                    us2Var = ws2.b(descriptionChip.b, aVar15, 0);
                    aVar15.j();
                } else {
                    aVar15.K(1012603626);
                    aVar15.j();
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar15.j();
                return us2Var;
        }
    }

    public /* synthetic */ zu3(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
