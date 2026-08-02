package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.market.dto.MarketProfileInfoDto;
import com.vk.api.generated.market.dto.MarketProfileInfoLocationDto;
import com.vk.api.generated.market.dto.MarketProfileInfoSimpleButtonDto;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.articles.ArticleFragment;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicSelectorCatalogEmbeddedTabsVh;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.f;
import com.vk.clips.favorites.impl.ui.folders.renaming.a;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.divider.VkDivider;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.fave.MarketFavable;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.api.analytics.MarketUtmData;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogRootVh;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.friends.impl.followers.presentation.fragments.AbsFollowersListFragment;
import com.vk.im.ui.views.RichEditText;
import com.vk.mvi.core.internal.executors.ThreadType;
import com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.AdminCommunitiesDataSource;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketTransitionToProfile;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.MarketAttachment;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.text.Regex;
import xsna.au5;
import xsna.bo0;
import xsna.dgc;
import xsna.dob;
import xsna.dw20;
import xsna.egc;
import xsna.gko;
import xsna.gm50;
import xsna.kb7;
import xsna.oj3;
import xsna.oj8;
import xsna.tj50;
import xsna.tlo0;
import xsna.u3s;
import xsna.wt1;
import xsna.wub;
import xsna.xn50;
import xsna.zn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class sa implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sa(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        MarketUtmData marketUtmData;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((AbsFollowersListFragment) obj2).S.c(u3s.a.a);
                return s3q0.a;
            case 1:
                return ((AdminCommunitiesDataSource) obj2).a();
            case 2:
                wt1 wt1Var = (wt1) obj2;
                return wt1Var.h.a(cj50.a(((FriendsGetFieldsResponseDto) obj).d(), new wt1.a(1, wt1Var.e, j2r0.class, "map", "map(Lcom/vk/api/generated/users/dto/UsersUserFullDto;)Lcom/vk/dto/user/UserProfile;", 0))).l(new n7(new vt1(0), 1));
            case 3:
                np20 np20Var = (np20) obj2;
                Pair pair = (Pair) obj;
                WebApiApplication webApiApplication = (WebApiApplication) pair.d();
                String str2 = (String) pair.g();
                ApiApplication b = chx0.b(webApiApplication);
                iq20 iq20Var = np20Var.d;
                String str3 = iq20Var.a;
                if (str3 != null && str3.length() != 0) {
                    b.B = iq20Var.a;
                }
                if (b.Y != null) {
                    Context context = np20Var.b;
                    Regex regex = com.vk.common.links.c.a;
                    bis.d(new op20(b, context, null, null, null, 28)).k(context);
                } else {
                    mq20 mq20Var = np20Var.c;
                    String str4 = mq20Var.a;
                    hf3.c(new op20(b, np20Var.b, new mq20(str4 == null ? str2 : str4, mq20Var.b, mq20Var.c, mq20Var.d, mq20Var.e, mq20Var.f, mq20Var.g), np20Var.d, np20Var.e));
                }
                return s3q0.a;
            case 4:
                tj50.a aVar = (tj50.a) obj;
                pi3 pi3Var = pi3.b;
                ao8 ao8Var = ao8.d;
                return new oj3.a(aVar.a(pi3Var, ao8Var), aVar.a(new qi3((ti3) obj2, 0), ao8Var), aVar.a(ri3.b, ao8Var), aVar.a(si3.b, ao8Var), aVar.a(new x50(2), ao8Var));
            case 5:
                ArticleFragment articleFragment = ((rp3) obj2).b;
                com.vk.articles.a aVar2 = articleFragment.m0;
                if (aVar2 != null) {
                    aVar2.clearFocus();
                }
                articleFragment.finish();
                return s3q0.a;
            case 6:
                ((ci4) obj2).G.getClass();
                return e3a.b((CatalogCatalogResponseObjectDto) obj);
            case 7:
                ((rg50) obj2).C(((Integer) obj).intValue());
                return s3q0.a;
            case 8:
                rt5 rt5Var = (rt5) obj2;
                int i2 = rt5.r1;
                gm50.a.a(rt5Var, ((au5.a) obj).a, new com.vk.im.engine.internal.api_commands.messages.a(rt5Var, 7));
                return s3q0.a;
            case 9:
                eb7 eb7Var = (eb7) obj2;
                kb7.a aVar3 = (kb7.a) obj;
                ja7 ja7Var = eb7Var.l;
                ja7Var.setItems(aVar3.a);
                ja7Var.notifyDataSetChanged();
                eb7Var.g.setRefreshing(aVar3.b);
                return s3q0.a;
            case 10:
                return Integer.valueOf(((BookingEditScreenState.g) ((wow) obj2).b.get(((Integer) obj).intValue())).b.m);
            case 11:
                gmq gmqVar = (gmq) obj;
                return (!(gmqVar instanceof MarketFavable) || ((MarketFavable) gmqVar).b == ((MarketAttachment) obj2).f.b) ? s3q0.a : s3q0.a;
            case 12:
                u76 u76Var = ((u48) obj2).m;
                if (u76Var != null) {
                    u76Var.T4(null);
                }
                return s3q0.a;
            case 13:
                ((ke8) obj2).c.invoke();
                return s3q0.a;
            case 14:
                tj50.a aVar4 = (tj50.a) obj;
                zi8 zi8Var = zi8.b;
                ao8 ao8Var2 = ao8.d;
                h0u0 a = aVar4.a(zi8Var, ao8Var2);
                xi8 xi8Var = new xi8();
                ThreadType.a aVar5 = ThreadType.Companion;
                ThreadType[] threadTypeArr = {ThreadType.STATE};
                aVar5.getClass();
                ThreadType.a.a(threadTypeArr);
                return new oj8.a(aVar4.f(ao8Var2, tj50.a.b, new izs[]{aj8.b, bj8.b, cj8.b, dj8.b}, new c2u(xi8Var, 23)), a);
            case 15:
                m99 m99Var = (m99) obj2;
                bo0.c cVar = new bo0.c(Collections.singleton(((Throwable) obj) instanceof VKApiException ? zn0.c.a : zn0.g.a), EmptySet.b);
                ((ao0) m99Var.l.getValue()).a(cVar);
                m99Var.f(s99.a(m99Var.j(), null, null, null, null, null, null, cVar, false, 191));
                return s3q0.a;
            case 16:
                return Boolean.valueOf(((List) obj2).contains(((UIBlock) obj).b));
            case 17:
                ((com.vk.catalog2.common.ui.mvp.util.a) obj2).i = null;
                return s3q0.a;
            case 18:
                ((Boolean) obj).booleanValue();
                ((hoa) obj2).b.invoke();
                return s3q0.a;
            case 19:
                ecb ecbVar = ((mcb) obj2).c;
                ecbVar.j.d();
                qcb qcbVar = ecbVar.i;
                qcbVar.Yn(true);
                qcbVar.hide();
                return s3q0.a;
            case 20:
                ynb ynbVar = (ynb) obj2;
                dob.i iVar = (dob.i) obj;
                oob oobVar = ynbVar.l;
                if (oobVar != null) {
                    oobVar.H(iVar.a, iVar.b);
                }
                oob oobVar2 = ynbVar.l;
                if (oobVar2 != null) {
                    RichEditText richEditText = oobVar2.v;
                    if (richEditText == null) {
                        richEditText = null;
                    }
                    richEditText.setEllipsize(TextUtils.TruncateAt.END);
                    RichEditText richEditText2 = oobVar2.v;
                    if (richEditText2 == null) {
                        richEditText2 = null;
                    }
                    richEditText2.setSingleLine(true);
                    RichEditText richEditText3 = oobVar2.v;
                    if (richEditText3 == null) {
                        richEditText3 = null;
                    }
                    richEditText3.setKeyListener(null);
                }
                return s3q0.a;
            case 21:
                ((ftb) obj2).e.u0((Throwable) obj);
                return s3q0.a;
            case 22:
                ((wub.a) obj2).q.e(null);
                return s3q0.a;
            case 23:
                ClassifiedsCatalogRootVh.a aVar6 = ((xfc) obj2).a;
                ClassifiedsCatalogRootVh classifiedsCatalogRootVh = ClassifiedsCatalogRootVh.this;
                Context context2 = aVar6.b.getContext();
                MarketProfileInfoDto marketProfileInfoDto = classifiedsCatalogRootVh.D;
                if (marketProfileInfoDto != null) {
                    MarketProfileInfoSimpleButtonDto g = marketProfileInfoDto.g();
                    egc.a aVar7 = g != null ? new egc.a(g.d(), g.e()) : null;
                    MarketProfileInfoSimpleButtonDto j = marketProfileInfoDto.j();
                    egc.a aVar8 = j != null ? new egc.a(j.d(), j.e()) : null;
                    MarketProfileInfoSimpleButtonDto k = marketProfileInfoDto.k();
                    egc.a aVar9 = k != null ? new egc.a(k.d(), k.e()) : null;
                    ggc ggcVar = new ggc(context2, marketProfileInfoDto, classifiedsCatalogRootVh.J, new ry0(classifiedsCatalogRootVh, 15));
                    String d = marketProfileInfoDto.i().d();
                    if (d != null) {
                        wfc wfcVar = classifiedsCatalogRootVh.A;
                        MarketAnalyticsParams marketAnalyticsParams = classifiedsCatalogRootVh.y;
                        if (marketAnalyticsParams != null) {
                            wfcVar.getClass();
                            str = marketAnalyticsParams.j;
                        } else {
                            str = null;
                        }
                        wfcVar.getClass();
                        wfc.b(str, new CommonMarketStat$TypeMarketTransitionToProfile(wfc.a(marketAnalyticsParams), (marketAnalyticsParams == null || (marketUtmData = marketAnalyticsParams.b) == null) ? null : marketUtmData.h));
                        egc egcVar = classifiedsCatalogRootVh.Q;
                        MarketProfileInfoLocationDto marketProfileInfoLocationDto = (MarketProfileInfoLocationDto) classifiedsCatalogRootVh.R.c;
                        String d2 = marketProfileInfoLocationDto != null ? marketProfileInfoLocationDto.d() : null;
                        if (d2 == null) {
                            d2 = "";
                        }
                        egcVar.getClass();
                        View inflate = e3m.b(context2).inflate(R.layout.catalog_classifieds_root_overflow_dialog, (ViewGroup) null);
                        fgc fgcVar = new fgc(egcVar, ggcVar, egcVar.b, egcVar.a);
                        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.top_bar);
                        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(d, (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, null, 14));
                        vkTopBar.setBefore(new VkTopBar.c.d(null, new eu1(fgcVar, 13), null, null, 13));
                        vkTopBar.setShowBottomDivider(true);
                        VkGroupHeader vkGroupHeader = (VkGroupHeader) inflate.findViewById(R.id.products_header);
                        vkGroupHeader.setSize(VkGroupHeader.Size.Medium);
                        vkGroupHeader.setTitle(new VkGroupHeader.d(tq.h(tlo0.Companion, R.string.classifieds_catalog_menu_goods_title), null, null, null, 0, 510));
                        VkCell vkCell = (VkCell) inflate.findViewById(R.id.geo_cell);
                        VkCell.Left.Main.Size size = VkCell.Left.Main.Size.Medium;
                        gko.b bVar = gko.Companion;
                        vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.c(new gko(R.drawable.vk_icon_place_outline_24), size, (k1u0) null, 12), null));
                        vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(new tlo0.h(d2), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d((tlo0) new tlo0.f(R.string.classifieds_catalog_menu_geo_description), (gzs) null, 0, (TextUtils.TruncateAt) (0 == true ? 1 : 0), (VkCell.Middle.d.b.C0815b) (0 == true ? 1 : 0), (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
                        jjc.g(vkCell, new com.vk.movika.sdk.base.observable.a(fgcVar, 26));
                        VkDivider vkDivider = (VkDivider) inflate.findViewById(R.id.geo_divider);
                        if (d2.length() == 0) {
                            f4m.j(vkCell);
                            f4m.j(vkDivider);
                        } else {
                            vkCell.setVisibility(0);
                            vkDivider.setVisibility(0);
                        }
                        egc.a((VkCell) inflate.findViewById(R.id.order_cell), R.drawable.vk_icon_cube_box_outline_28, R.string.classifieds_catalog_menu_my_orders, aVar7, new zy(fgcVar, 19));
                        egc.a((VkCell) inflate.findViewById(R.id.wishlist_cell), R.drawable.vk_icon_list_like_outline_28, R.string.classifieds_catalog_menu_wishlist, aVar9, new yg(fgcVar, 16));
                        egc.a((VkCell) inflate.findViewById(R.id.all_reviews_cell), R.drawable.vk_icon_comment_outline_28, R.string.classifieds_catalog_menu_all_reviews, aVar8, new zg(fgcVar, 22));
                        egcVar.c = ((dw20.b) new dgc.a(context2, null).D0(inflate, false).F0(true).x(0).B(iah0.b(12.0f), true, true).c(new d5j(inflate)).I(false).G0()).O().l(R.attr.vk_ui_background_modal).I0(null);
                    }
                }
                return s3q0.a;
            case 24:
                nad nadVar = (nad) obj2;
                VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) obj;
                if (vKApiExecutionException != null) {
                    j03.i(nadVar.c, vKApiExecutionException);
                } else {
                    cvk.u(R.string.error, false);
                }
                l7s l7sVar = nadVar.e;
                PrivacySetting privacySetting = nadVar.p;
                if (privacySetting == null) {
                    privacySetting = nadVar.m;
                }
                EmptyList emptyList = EmptyList.b;
                nadVar.S0(l7sVar, privacySetting, emptyList, emptyList);
                return s3q0.a;
            case 25:
                Pair pair2 = (Pair) obj;
                File file = (File) pair2.d();
                jkq0 jkq0Var = (jkq0) pair2.g();
                ((h1e) obj2).getClass();
                return h1e.a(file, jkq0Var);
            case 26:
                com.vk.clips.favorites.impl.ui.folders.renaming.b bVar2 = (com.vk.clips.favorites.impl.ui.folders.renaming.b) obj2;
                String str5 = com.vk.clips.favorites.impl.ui.folders.renaming.b.m1;
                bVar2.getClass();
                xn50.a.c(bVar2, a.b.b);
                return s3q0.a;
            case 27:
                ((com.vk.clips.attachments.impl.publish.geolocation.presentation.e) obj2).T(new f.C0548f((List) obj));
                return s3q0.a;
            case 28:
                mce mceVar = (mce) obj2;
                mceVar.j(null, (jpe) obj, new ild(null), mceVar.e instanceof PaginationKey.Initial);
                return s3q0.a;
            default:
                hda hdaVar = (hda) obj;
                Object b0 = j5g.b0(0, jda.a((jda) ((ClipsMusicSelectorCatalogEmbeddedTabsVh) obj2).f.getValue(), hdaVar.a, hdaVar.b, false, false, 12));
                return Optional.ofNullable(b0 instanceof UIBlockList ? (UIBlockList) b0 : null);
        }
    }

    public /* synthetic */ sa(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
