package xsna;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.profile.CatalogProfileLocalState;
import com.vk.catalog2.common.ui.core.video.view.FirstPinnedTabLayout;
import com.vk.dto.group.Group;
import com.vk.dto.stickers.bonus.StickersBonusResult;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.stickers.views.sticker.StickerPackPrice;
import com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.gwu;
import xsna.hty;
import xsna.i7d0;
import xsna.j7d0;
import xsna.k7d0;
import xsna.ldh;
import xsna.q630;
import xsna.sbd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ud6 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ud6(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        StickersBonusResult stickersBonusResult;
        StickerPackPrice stickerPackPrice;
        int i;
        int i2;
        String str;
        boolean z;
        Integer num;
        boolean z2;
        j7d0.c.b.a aVar;
        izs izsVar;
        com.vk.core.compose.component.semantics.a aVar2;
        com.vk.core.compose.component.semantics.a aVar3;
        com.vk.core.compose.component.semantics.a aVar4;
        int i3;
        i7d0 i7d0Var;
        cdh cdhVar;
        int i4;
        int i5 = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        int i6 = 3;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i5) {
            case 0:
                UIBlockList uIBlockList = (UIBlockList) obj;
                ys0 ys0Var = new ys0(z3 ? 1 : 0, (Group) obj4, (CatalogProfileLocalState.FollowSource) obj3);
                for (UIBlock uIBlock : uIBlockList.y) {
                    ys0Var.invoke(uIBlockList, uIBlock);
                    if (uIBlock instanceof UIBlockList) {
                        UIBlockList uIBlockList2 = (UIBlockList) uIBlock;
                        for (UIBlock uIBlock2 : uIBlockList2.y) {
                            ys0Var.invoke(uIBlockList2, uIBlock2);
                            if (uIBlock2 instanceof UIBlockList) {
                                UIBlockList uIBlockList3 = (UIBlockList) uIBlock2;
                                for (UIBlock uIBlock3 : uIBlockList3.y) {
                                    ys0Var.invoke(uIBlockList3, uIBlock3);
                                    if (uIBlock3 instanceof UIBlockList) {
                                        o19.w((UIBlockList) uIBlock3, ys0Var);
                                    }
                                }
                            }
                        }
                    }
                }
                return uIBlockList;
            case 1:
                ((Integer) obj2).getClass();
                cpc.b((qpc) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                pmd.d((String) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                StickerPackPreview stickerPackPreview = (StickerPackPreview) obj4;
                Context context = (Context) obj3;
                nge0 nge0Var = (nge0) obj2;
                boolean f = bhu.f(stickerPackPreview);
                int i7 = stickerPackPreview.b;
                if (f || (stickerPackPrice = stickerPackPreview.o) == null || stickerPackPrice.b != 0) {
                    y9l0.a(new s1l0(i7));
                } else {
                    y9l0.a(new q1l0(i7));
                }
                if (nge0Var != null && (stickersBonusResult = nge0Var.l) != null) {
                    new gl7().a(context, stickersBonusResult);
                }
                return s3q0.a;
            case 4:
                ldh.a aVar5 = (ldh.a) obj4;
                izs izsVar2 = (izs) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar6.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(914061767, intValue, -1, "com.vk.profile.community.impl.ui.item.header.priorityblock.goods.CommunityPriorityBlockGoodsItem.ViewHolder.<anonymous>.<anonymous> (CommunityPriorityBlockGoodsItem.kt:78)");
                    }
                    String N = d370.N(R.string.community_priority_block_header_market_goods_add_btn_accessibility, 0, aVar6);
                    String N2 = d370.N(R.string.community_priority_block_header_market_goods_show_all_btn_accessibility, 0, aVar6);
                    String str2 = aVar5.q6().b.a;
                    boolean z7 = aVar5.q6().b.b;
                    Object x = aVar6.x();
                    Object obj5 = x;
                    if (x == c0012a) {
                        md mdVar = new md(20);
                        aVar6.R(mdVar);
                        obj5 = mdVar;
                    }
                    com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(null, (izs) obj5, 3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(20961681, 24576, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlock.Header.Middle.Market.Companion.invoke (PrimaryBlock.kt:42)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1278005133, 6, -1, "com.vk.community.design.compose.primaryblock.remember (PrimaryBlockGoodsHeaderMiddleImpl.kt:93)");
                    }
                    Object x2 = aVar6.x();
                    Object obj6 = x2;
                    if (x2 == c0012a) {
                        f8d0 f8d0Var = new f8d0(a, str2, z7);
                        aVar6.R(f8d0Var);
                        obj6 = f8d0Var;
                    }
                    f8d0 f8d0Var2 = (f8d0) obj6;
                    ((zak0) f8d0Var2.a).setValue(str2);
                    ((zak0) f8d0Var2.b).setValue(null);
                    ((zak0) f8d0Var2.c).setValue(Boolean.valueOf(z7));
                    ((zak0) f8d0Var2.d).setValue(a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    Integer num2 = aVar5.q6().b.g;
                    boolean z8 = aVar5.q6().b.d;
                    gwu.c cVar = aVar5.q6().b.e;
                    j7d0.c.b.a aVar7 = cVar != null ? new j7d0.c.b.a(cVar.a, cVar.b, cVar.c) : null;
                    String str3 = aVar5.q6().b.f;
                    boolean z9 = aVar5.q6().b.c;
                    boolean J = aVar6.J(N);
                    Object x3 = aVar6.x();
                    Object obj7 = x3;
                    if (J || x3 == c0012a) {
                        v9 v9Var = new v9(N, 28);
                        aVar6.R(v9Var);
                        obj7 = v9Var;
                    }
                    com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, (izs) obj7, 3);
                    boolean J2 = aVar6.J(N2);
                    Object x4 = aVar6.x();
                    Object obj8 = x4;
                    if (J2 || x4 == c0012a) {
                        ge3 ge3Var = new ge3(N2, 1);
                        aVar6.R(ge3Var);
                        obj8 = ge3Var;
                    }
                    com.vk.core.compose.component.semantics.a a3 = com.vk.core.compose.component.semantics.b.a(null, (izs) obj8, 3);
                    Object x5 = aVar6.x();
                    Object obj9 = x5;
                    if (x5 == c0012a) {
                        f57 f57Var = new f57(11);
                        aVar6.R(f57Var);
                        obj9 = f57Var;
                    }
                    com.vk.core.compose.component.semantics.a a4 = com.vk.core.compose.component.semantics.b.a(null, (izs) obj9, 3);
                    Object x6 = aVar6.x();
                    int i8 = 17;
                    Object obj10 = x6;
                    if (x6 == c0012a) {
                        zj zjVar = new zj(i8);
                        aVar6.R(zjVar);
                        obj10 = zjVar;
                    }
                    com.vk.core.compose.component.semantics.a a5 = com.vk.core.compose.component.semantics.b.a(null, (izs) obj10, 3);
                    boolean J3 = aVar6.J(izsVar2) | aVar6.y(aVar5);
                    Object x7 = aVar6.x();
                    Object obj11 = x7;
                    if (J3 || x7 == c0012a) {
                        v77 v77Var = new v77(izsVar2, aVar5);
                        aVar6.R(v77Var);
                        obj11 = v77Var;
                    }
                    izs izsVar3 = (izs) obj11;
                    if (androidx.compose.runtime.b.d()) {
                        i = 6;
                        i2 = 0;
                        androidx.compose.runtime.b.f(1646597771, 0, 6, "com.vk.community.design.compose.primaryblock.PrimaryBlock.Header.RightActions.Market.Companion.invoke (PrimaryBlock.kt:102)");
                    } else {
                        i = 6;
                        i2 = 0;
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-692985901, i, i2, "com.vk.community.design.compose.primaryblock.remember (PrimaryBlockGoodsHeaderRightActionsImpl.kt:334)");
                    }
                    Object x8 = aVar6.x();
                    if (x8 == c0012a) {
                        z = z9;
                        z2 = z8;
                        x8 = new m8d0(num2, z2, z, aVar7, str3, izsVar3, a2, a5, a3, a4);
                        num = num2;
                        aVar = aVar7;
                        str = str3;
                        izsVar = izsVar3;
                        aVar2 = a2;
                        aVar3 = a5;
                        aVar4 = a3;
                        aVar6.R(x8);
                    } else {
                        str = str3;
                        z = z9;
                        num = num2;
                        z2 = z8;
                        aVar = aVar7;
                        izsVar = izsVar3;
                        aVar2 = a2;
                        aVar3 = a5;
                        aVar4 = a3;
                    }
                    m8d0 m8d0Var = (m8d0) x8;
                    ((zak0) m8d0Var.a).setValue(num);
                    ((zak0) m8d0Var.b).setValue(Boolean.valueOf(z2));
                    ((zak0) m8d0Var.c).setValue(Boolean.valueOf(z));
                    ((zak0) m8d0Var.d).setValue(aVar);
                    ((zak0) m8d0Var.e).setValue(str);
                    ((zak0) m8d0Var.f).setValue(izsVar);
                    ((zak0) m8d0Var.g).setValue(aVar2);
                    ((zak0) m8d0Var.h).setValue(aVar3);
                    ((zak0) m8d0Var.i).setValue(aVar4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    fdh a6 = j7d0.a.a(f8d0Var2, m8d0Var, aVar6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-547835786, 0, -1, "com.vk.profile.community.impl.ui.item.header.priorityblock.goods.CommunityPriorityBlockGoodsItem.ViewHolder.provideContent (CommunityPriorityBlockGoodsItem.kt:136)");
                    }
                    sbd0 sbd0Var = aVar5.q6().c;
                    if (sbd0Var instanceof sbd0.b) {
                        aVar6.K(300130697);
                        aVar6.K(1810802720);
                        sbd0.b bVar = (sbd0.b) sbd0Var;
                        ArrayList<MarketProductTileConfig> arrayList = bVar.a;
                        int i9 = 10;
                        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                        for (MarketProductTileConfig marketProductTileConfig : arrayList) {
                            boolean J4 = aVar6.J(marketProductTileConfig);
                            Object x9 = aVar6.x();
                            if (J4 || x9 == c0012a) {
                                x9 = new s6(marketProductTileConfig, 24);
                                aVar6.R(x9);
                            }
                            arrayList2.add(new ta10(marketProductTileConfig, com.vk.core.compose.component.semantics.b.a(null, (izs) x9, 3)));
                        }
                        aVar6.j();
                        aVar6.K(1810822667);
                        ArrayList<o7d0> arrayList3 = bVar.b;
                        ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                        for (o7d0 o7d0Var : arrayList3) {
                            boolean J5 = aVar6.J(o7d0Var);
                            Object x10 = aVar6.x();
                            if (J5 || x10 == c0012a) {
                                x10 = new arf(o7d0Var, i6);
                                aVar6.R(x10);
                            }
                            arrayList4.add(new qa10(o7d0Var, com.vk.core.compose.component.semantics.b.a(null, (izs) x10, 3)));
                        }
                        aVar6.j();
                        ra10 ra10Var = new ra10(arrayList2, arrayList4, bVar.c, bVar.d);
                        boolean J6 = aVar6.J(izsVar2) | aVar6.y(aVar5);
                        Object x11 = aVar6.x();
                        Object obj12 = x11;
                        if (J6 || x11 == c0012a) {
                            g22 g22Var = new g22(i9, izsVar2, aVar5);
                            aVar6.R(g22Var);
                            obj12 = g22Var;
                        }
                        izs izsVar4 = (izs) obj12;
                        Object x12 = aVar6.x();
                        Object obj13 = x12;
                        if (x12 == c0012a) {
                            fj1 fj1Var = new fj1(17);
                            aVar6.R(fj1Var);
                            obj13 = fj1Var;
                        }
                        com.vk.core.compose.component.semantics.a a7 = com.vk.core.compose.component.semantics.b.a(null, (izs) obj13, 3);
                        if (androidx.compose.runtime.b.d()) {
                            i4 = -1;
                            androidx.compose.runtime.b.f(246847036, 3072, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlock.Content.Market.Goods.Companion.invoke (PrimaryBlock.kt:151)");
                        } else {
                            i4 = -1;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1693730574, 6, i4, "com.vk.community.design.compose.primaryblock.remember (PrimaryBlockGoodsContentImpl.kt:225)");
                        }
                        Object x13 = aVar6.x();
                        Object obj14 = x13;
                        if (x13 == c0012a) {
                            d8d0 d8d0Var = new d8d0(ra10Var, izsVar4, a7);
                            aVar6.R(d8d0Var);
                            obj14 = d8d0Var;
                        }
                        d8d0 d8d0Var2 = (d8d0) obj14;
                        ((zak0) d8d0Var2.e).setValue(ra10Var);
                        ((zak0) d8d0Var2.g).setValue(a7);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar6.j();
                        i7d0Var = d8d0Var2;
                    } else if (sbd0Var instanceof sbd0.c) {
                        aVar6.K(301989736);
                        sbd0.c cVar2 = (sbd0.c) sbd0Var;
                        String str4 = cVar2.a;
                        String str5 = cVar2.b;
                        boolean J7 = aVar6.J(izsVar2);
                        Object x14 = aVar6.x();
                        Object obj15 = x14;
                        if (J7 || x14 == c0012a) {
                            us0 us0Var = new us0(izsVar2, i6);
                            aVar6.R(us0Var);
                            obj15 = us0Var;
                        }
                        i7d0 a8 = i7d0.b.a.a(str4, str5, (gzs) obj15, aVar6);
                        aVar6.j();
                        i7d0Var = a8;
                    } else if (sbd0Var instanceof sbd0.d) {
                        aVar6.K(302369455);
                        int i10 = iah0.g(aVar5.itemView.getContext()).x;
                        if (androidx.compose.runtime.b.d()) {
                            i3 = -1;
                            androidx.compose.runtime.b.f(1919313811, 384, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlock.Content.Market.Shimmer.Companion.invoke (PrimaryBlock.kt:166)");
                        } else {
                            i3 = -1;
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-321713053, 6, i3, "com.vk.community.design.compose.primaryblock.remember (PrimaryBlockGoodsShimmerContentImpl.kt:55)");
                        }
                        Object x15 = aVar6.x();
                        Object obj16 = x15;
                        if (x15 == c0012a) {
                            o8d0 o8d0Var = new o8d0(i10);
                            aVar6.R(o8d0Var);
                            obj16 = o8d0Var;
                        }
                        o8d0 o8d0Var2 = (o8d0) obj16;
                        ((zak0) o8d0Var2.e).setValue(Integer.valueOf(i10));
                        ((zak0) o8d0Var2.f).setValue(null);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar6.j();
                        i7d0Var = o8d0Var2;
                    } else {
                        if (!(sbd0Var instanceof sbd0.a)) {
                            throw alb0.c(1810794910, aVar6);
                        }
                        aVar6.K(302561686);
                        sbd0.a aVar8 = (sbd0.a) sbd0Var;
                        String str6 = aVar8.a;
                        String str7 = aVar8.b;
                        boolean J8 = aVar6.J(izsVar2);
                        Object x16 = aVar6.x();
                        Object obj17 = x16;
                        if (J8 || x16 == c0012a) {
                            tw twVar = new tw(izsVar2, 4);
                            aVar6.R(twVar);
                            obj17 = twVar;
                        }
                        i7d0 a9 = i7d0.a.C3034a.a(str6, str7, (gzs) obj17, aVar6);
                        aVar6.j();
                        i7d0Var = a9;
                    }
                    i7d0 i7d0Var2 = i7d0Var;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    rvw rvwVar = aVar5.q6().d;
                    if (rvwVar == null) {
                        aVar6.K(724375387);
                        aVar6.j();
                        cdhVar = null;
                    } else {
                        aVar6.K(724375388);
                        String str8 = rvwVar.a;
                        String str9 = rvwVar.b;
                        boolean J9 = aVar6.J(izsVar2);
                        Object x17 = aVar6.x();
                        Object obj18 = x17;
                        if (J9 || x17 == c0012a) {
                            w77 w77Var = new w77(izsVar2, 1);
                            aVar6.R(w77Var);
                            obj18 = w77Var;
                        }
                        cdh a10 = k7d0.a.C3167a.a(str8, str9, (gzs) obj18, aVar6);
                        aVar6.j();
                        cdhVar = a10;
                    }
                    jdh.a(a6, i7d0Var2, txj0.z(txj0.f(q630.a.a, 1.0f), null, 3), cdhVar, aVar6, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((rbl) obj4).a((ht6) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                wzs wzsVar = (wzs) obj3;
                Integer num3 = (Integer) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                int i11 = FirstPinnedTabLayout.h;
                if (num3.intValue() < ((FirstPinnedTabLayout) obj4).g) {
                    return (View) wzsVar.invoke(num3, viewGroup);
                }
                return null;
            case 7:
                izs izsVar5 = (izs) obj4;
                mtk0 mtk0Var = (mtk0) obj3;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar9.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1595606105, intValue2, -1, "com.vk.games.presentation.catalog.screen.RenderGameCatalogContent.<anonymous> (GamesCatalogMainTabScreen.kt:115)");
                    }
                    if (((Boolean) mtk0Var.getValue()).booleanValue()) {
                        aVar9.K(1996606404);
                        boolean J10 = aVar9.J(izsVar5);
                        Object x18 = aVar9.x();
                        if (J10 || x18 == c0012a) {
                            x18 = new dz7(izsVar5, i6);
                            aVar9.R(x18);
                        }
                        khq.a(0, aVar9, (gzs) x18, null);
                    } else {
                        aVar9.K(1991972059);
                    }
                    aVar9.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
            case 8:
                hty htyVar = (hty) obj4;
                hty.a aVar10 = (hty.a) obj3;
                androidx.compose.runtime.a aVar11 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar11.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(818252804, intValue3, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:85)");
                    }
                    androidx.compose.foundation.lazy.layout.b bVar2 = (androidx.compose.foundation.lazy.layout.b) htyVar.b.invoke();
                    int i12 = aVar10.c;
                    Object obj19 = aVar10.a;
                    if ((i12 >= bVar2.getItemCount() || !bVar2.h(i12).equals(obj19)) && (i12 = bVar2.b(obj19)) != -1) {
                        aVar10.c = i12;
                    }
                    int i13 = i12;
                    if (i13 != -1) {
                        aVar11.K(-1664741271);
                        sdy.g(bVar2, htyVar.a, i13, aVar10.a, aVar11, 0);
                        aVar11.j();
                    } else {
                        aVar11.K(-1664505826);
                        aVar11.j();
                    }
                    boolean y = aVar11.y(aVar10);
                    Object x19 = aVar11.x();
                    if (y || x19 == c0012a) {
                        x19 = new jjx((Object) aVar10, (int) (z4 ? 1 : 0));
                        aVar11.R(x19);
                    }
                    bap.c(obj19, (izs) x19, aVar11, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar11.h();
                }
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((bkd0) obj4).x6((ikd0) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                ((ote0) obj4).a((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 11:
                eoj0 eoj0Var = (eoj0) obj4;
                String str10 = (String) obj3;
                Uri uri = (Uri) obj;
                if (((Throwable) obj2) != null) {
                    eoj0Var.c.s0(str10);
                    return s3q0.a;
                }
                eoj0Var.c.s0(uri.toString());
                return s3q0.a;
            case 12:
                mc90 mc90Var = (mc90) obj4;
                List list = (List) obj3;
                androidx.compose.runtime.a aVar12 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar12.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-38794965, intValue4, -1, "com.vk.video.ui.discovery.minimizable.recycler.design.compose.cards.base.SlidingCards.<anonymous> (SlidingCards.kt:38)");
                    }
                    float f2 = kqu0.l;
                    float f3 = kqu0.v;
                    z1k0.c(mc90Var, kai.c(1364870380, new u8d0(list, z6 ? 1 : 0), aVar12), kai.c(1961898124, new z2h(list, z5 ? 1 : 0), aVar12), new u890(f3, f2, f3, f2), null, null, aVar12, 200112);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar12.h();
                }
                return s3q0.a;
            case 13:
                ((Integer) obj2).getClass();
                vwn0.a((e3n0) obj4, (pwn0) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 14:
                ((Integer) obj2).getClass();
                njs0.a((hjs0) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                int i14 = VideoProfileCreatorOnboardingVideoCounterView.o;
                ((VideoProfileCreatorOnboardingVideoCounterView) obj4).D((izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(71));
                return s3q0.a;
        }
    }

    public /* synthetic */ ud6(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
