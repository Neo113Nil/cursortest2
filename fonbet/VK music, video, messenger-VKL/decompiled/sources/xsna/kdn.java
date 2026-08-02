package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.MinElf;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.likes.LikesGetList;
import com.vk.catalog2.common.dto.api.market.CatalogClassifiedYoulaCity;
import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.core.serialize.Serializer;
import com.vk.core.tips.Tooltip;
import com.vk.core.tips.c;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.donut.design.view.badge.DonutBadge;
import com.vk.donut.price.model.template.DonutPriceTemplate;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.market.catalog.CatalogMarketCategoryContext;
import com.vk.dto.market.catalog.CatalogMarketDeliveryTypeDto;
import com.vk.dto.market.catalog.CatalogMarketFilter;
import com.vk.dto.market.catalog.CatalogMarketSorting;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.polls.Poll;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.api.analytics.MarketUtmData;
import com.vk.ecomm.catalog.impl.catalog.base.b;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.feed.design.view.newsfeed.ads_mytarget.bls.MyTargetAdSurveyPageView;
import com.vk.friends.recommendations.impl.presentation.FriendsImportFragment;
import com.vk.fullscreenvideo.design.view.bottom.FullscreenBottomControlsView;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.b;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.playlist.ModernPlaylistModel;
import com.vk.reactions.fragments.ReactionsFragment;
import com.vk.sharing.api.dto.GroupPickerInfo;
import com.vk.sharing.core.picker.PickingImpl;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.health.js.bridge.api.events.GetSteps$Response;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.bmt;
import xsna.c110;
import xsna.dg20;
import xsna.e120;
import xsna.h5v;
import xsna.liu;
import xsna.o0r0;
import xsna.odn;
import xsna.p810;
import xsna.qn60;
import xsna.w8v;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class kdn implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kdn(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0694 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x06a4  */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object[] objArr;
        CallMemberId callMemberId;
        Object[] objArr2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Integer num;
        String str7;
        com.vk.core.tips.b k;
        int i = 3;
        int i2 = 5;
        int i3 = 2;
        int i4 = 1;
        switch (this.b) {
            case 0:
                ndn ndnVar = (ndn) this.c;
                Throwable th = (Throwable) obj;
                mzp0 mzp0Var = ndnVar.l;
                if (mzp0Var != null) {
                    mzp0Var.f();
                }
                ndnVar.T(new odn.d(th));
                return s3q0.a;
            case 1:
                DonutPriceTemplate donutPriceTemplate = (DonutPriceTemplate) this.c;
                Context context = (Context) obj;
                DonutBadge donutBadge = new DonutBadge(context, null, 6);
                donutBadge.setText(y1o.b(donutPriceTemplate, context));
                return donutBadge;
            case 2:
                wio wioVar = (wio) this.c;
                RecyclerView recyclerView = wioVar.l;
                v3p v3pVar = wioVar.c;
                if (recyclerView != null) {
                    lkf0.d(recyclerView, 0);
                }
                oak0.d(v3pVar.getView(), v3pVar.getLogger(), new qcl(wioVar, i3));
                return s3q0.a;
            case 3:
                bcq bcqVar = (bcq) this.c;
                ptk ptkVar = (ptk) obj;
                return ((Boolean) bcqVar.m.getValue()).booleanValue() ? bcqVar.d1((ExtendedCommunityProfile) ptkVar.a) : io.reactivex.rxjava3.core.q.T(ptkVar);
            case 4:
                ExternalNpsCondition externalNpsCondition = (ExternalNpsCondition) this.c;
                Throwable th2 = (Throwable) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"CLIPS_NPS", "trigger condition error: " + th2.getMessage() + "; " + externalNpsCondition});
                }
                return s3q0.a;
            case 5:
                FriendsImportFragment friendsImportFragment = (FriendsImportFragment) this.c;
                String str8 = (String) obj;
                int i5 = FriendsImportFragment.a0;
                com.vk.friends.recommendations.impl.presentation.a jo = friendsImportFragment.jo();
                if (!epx.f(jo.h, str8)) {
                    jo.h = str8;
                    jo.K0();
                }
                return s3q0.a;
            case 6:
                return FullscreenBottomControlsView.A((FullscreenBottomControlsView) this.c, (com.vk.fullscreenvideo.a) obj);
            case 7:
                bmt.a aVar = (bmt.a) this.c;
                qn60.c cVar = (qn60.c) obj;
                ArrayList arrayList = cVar.a;
                og50 og50Var = cVar.b;
                blt bltVar = aVar.a;
                return new wmt(arrayList, og50Var, bltVar.a, bltVar.b);
            case 8:
                xnt xntVar = (xnt) this.c;
                if (xntVar.c) {
                    vnt vntVar = xntVar.b;
                    vntVar.Zn(vntVar.i1, vntVar.j1, vntVar.k1);
                    RecyclerView recyclerView2 = vntVar.i1;
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(4);
                    }
                    View view = vntVar.j1;
                    if (view != null) {
                        f4m.j(view);
                    }
                    View view2 = vntVar.k1;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    vntVar.l1.setItems(EmptyList.b);
                }
                return s3q0.a;
            case 9:
                uut uutVar = (uut) this.c;
                List list = (List) obj;
                String b = defpackage.j0.b("VKWebAppGetSteps", uutVar.b);
                xgx0 xgx0Var = xgx0.a;
                StringBuilder sb = new StringBuilder("VkStepsGetStepsGoogleFitDelegate.handleStepsReceivedFromDataSource() -> steps: ");
                sb.append(list);
                sb.append(", thread: ");
                mft0.a(sb, xgx0Var);
                com.vk.superapp.base.js.bridge.b.p(uutVar.b, new JsMethod("VKWebAppGetSteps"), new GetSteps$Response(null, new GetSteps$Response.Data(n0l0.a(list), b), b, 1, null), null, null, false, null, 60);
                return s3q0.a;
            case 10:
                giu giuVar = (giu) this.c;
                liu.a aVar2 = (liu.a) obj;
                kiu kiuVar = giuVar.w;
                CallMemberId callMemberId2 = aVar2.a;
                if (callMemberId2 != null) {
                    if (epx.f(callMemberId2, kiuVar != null ? kiuVar.a.a : null)) {
                        objArr = true;
                        callMemberId = aVar2.c;
                        if (callMemberId != null) {
                            if (epx.f(callMemberId, kiuVar != null ? kiuVar.a.a : null)) {
                                objArr2 = true;
                                if (objArr == false && objArr2 == false) {
                                    i4 = 0;
                                }
                                ImageView imageView = giuVar.D;
                                imageView.setVisibility(i4 == 0 ? 8 : 0);
                                if (i4 != 0) {
                                    imageView.setImageResource(objArr2 != false ? R.drawable.voip_pin_dot_shadow_24 : R.drawable.voip_pin_shadow_24);
                                }
                                return s3q0.a;
                            }
                        }
                        objArr2 = false;
                        if (objArr == false) {
                            i4 = 0;
                        }
                        ImageView imageView2 = giuVar.D;
                        imageView2.setVisibility(i4 == 0 ? 8 : 0);
                        if (i4 != 0) {
                        }
                        return s3q0.a;
                    }
                }
                objArr = false;
                callMemberId = aVar2.c;
                if (callMemberId != null) {
                }
                objArr2 = false;
                if (objArr == false) {
                }
                ImageView imageView22 = giuVar.D;
                imageView22.setVisibility(i4 == 0 ? 8 : 0);
                if (i4 != 0) {
                }
                return s3q0.a;
            case 11:
                qmu qmuVar = (qmu) this.c;
                ImageView imageView3 = qmuVar.t;
                GroupSuggestion groupSuggestion = (GroupSuggestion) qmuVar.m;
                if (groupSuggestion == null) {
                    return s3q0.a;
                }
                Group group = groupSuggestion.b;
                imageView3.removeCallbacks(qmuVar.w);
                ViewPropertyAnimator viewPropertyAnimator = qmuVar.v;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                qmuVar.v = null;
                qmuVar.u = null;
                int i6 = group.C;
                if (i6 == 1 || i6 == 2 || i6 == 4) {
                    Context context2 = qmuVar.itemView.getContext();
                    if (context2 != null) {
                        Object[] objArr3 = group.C == 4 ? 1 : null;
                        int i7 = group.p;
                        if (((i7 == 0 && group.m == 2) || (i7 == 0 && group.m == 1)) && fkq0.c(group.L) && objArr3 == null) {
                            xwk.e().h0().b(context2, group, new mh3(9, qmuVar, group));
                        } else {
                            e4h.l(xwk.e().h0(), context2, fkq0.e(group.c), new ku1(14, qmuVar, group), group, 16);
                        }
                    }
                } else if (group.p == 1) {
                    int l2 = krv0.l(R.attr.vk_ui_icon_accent);
                    imageView3.getContext();
                    e.b bVar = new e.b(imageView3, null, null, l2, 6);
                    bVar.w = R.layout.ds_internal_context_menu_item;
                    VkContextMenu.c.c(bVar, R.string.group_event_join, null, false, null, new nh3(13, qmuVar, group), 30);
                    VkContextMenu.c.c(bVar, R.string.group_event_join_unsure, null, false, null, new cg1(16, qmuVar, group), 30);
                    bVar.a().j(false);
                } else {
                    qmuVar.q6(group, true);
                }
                return s3q0.a;
            case 12:
                ((eqv) this.c).d((BitmapDrawable) obj);
                return s3q0.a;
            case 13:
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c cVar2 = (com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.c) this.c;
                cVar2.c.a();
                com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.d dVar = cVar2.c;
                dVar.f(false);
                dVar.d((Poll) obj, true);
                return s3q0.a;
            case 14:
                ((cmz) this.c).i.setItems((List) obj);
                return s3q0.a;
            case 15:
                com.vk.ecomm.catalog.impl.catalog.base.b bVar2 = (com.vk.ecomm.catalog.impl.catalog.base.b) this.c;
                b.C0927b c0927b = bVar2.e;
                lu00 lu00Var = (lu00) obj;
                if (lu00Var instanceof mu00) {
                    bVar2.g = ((mu00) lu00Var).c;
                } else if (lu00Var instanceof nu00) {
                    bVar2.h = ((nu00) lu00Var).c;
                } else if (lu00Var instanceof qu00) {
                    qu00 qu00Var = (qu00) lu00Var;
                    bVar2.i = new CatalogClassifiedYoulaCity("", qu00Var.c, qu00Var.d, qu00Var.e);
                    bVar2.j = qu00Var.f;
                } else if (lu00Var instanceof ou00) {
                    bVar2.g = null;
                    bVar2.h = null;
                    bVar2.i = null;
                    bVar2.j = false;
                } else {
                    if (!(lu00Var instanceof pu00)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Bundle bundle = new Bundle();
                    CatalogMarketFilter catalogMarketFilter = bVar2.g;
                    if (catalogMarketFilter != null) {
                        Long l3 = catalogMarketFilter.c;
                        Long l4 = catalogMarketFilter.d;
                        if (l3 != null) {
                            bundle.putLong("key_filter_price_from", l3.longValue());
                        }
                        if (l4 != null) {
                            bundle.putLong("key_filter_price_to", l4.longValue());
                        }
                        Integer num2 = catalogMarketFilter.h;
                        if (num2 != null) {
                            bundle.putInt("key_filter_distance", num2.intValue());
                        }
                        String h = catalogMarketFilter.b.h();
                        if (h != null) {
                            bundle.putString("key_catalog_context", h);
                        }
                        List<CatalogMarketCategoryContext> list2 = catalogMarketFilter.g;
                        ArrayList arrayList2 = new ArrayList();
                        for (CatalogMarketCategoryContext catalogMarketCategoryContext : list2) {
                            Integer num3 = catalogMarketCategoryContext.e;
                            Pair pair = num3 != null ? new Pair(catalogMarketCategoryContext.b.h(), Integer.valueOf(num3.intValue())) : null;
                            if (pair != null) {
                                arrayList2.add(pair);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            bundle.remove("key_category_ids");
                        } else {
                            bundle.putString("key_category_ids", j5g.g0(arrayList2, "&", null, null, 0, new od3(i), 30));
                        }
                        String str9 = catalogMarketFilter.k;
                        if (str9 != null) {
                            bundle.putString("key_status_id", str9);
                        }
                        Boolean bool = catalogMarketFilter.m;
                        if (bool != null) {
                            bundle.putBoolean("online_payment_enabled", bool.booleanValue());
                        }
                        Boolean bool2 = catalogMarketFilter.n;
                        if (bool2 != null) {
                            bundle.putBoolean("discount_enabled", bool2.booleanValue());
                        }
                        Boolean bool3 = catalogMarketFilter.o;
                        if (bool3 != null) {
                            bundle.putBoolean("seller_high_rating_enabled", bool3.booleanValue());
                        }
                        Boolean bool4 = catalogMarketFilter.p;
                        if (bool4 != null) {
                            bundle.putBoolean("friends_reviews_enabled", bool4.booleanValue());
                        }
                        Boolean bool5 = catalogMarketFilter.q;
                        if (bool5 != null) {
                            bundle.putBoolean("friends_wishlist_enabled", bool5.booleanValue());
                        }
                        CatalogMarketDeliveryTypeDto catalogMarketDeliveryTypeDto = catalogMarketFilter.r;
                        String i8 = catalogMarketDeliveryTypeDto != null ? catalogMarketDeliveryTypeDto.i() : null;
                        if (i8 != null) {
                            bundle.putString("delivery_type", i8);
                        }
                    }
                    CatalogMarketSorting catalogMarketSorting = bVar2.h;
                    if (catalogMarketSorting != null && (str7 = catalogMarketSorting.c) != null) {
                        bundle.putString("key_sorting_option_id", str7);
                    }
                    CatalogClassifiedYoulaCity catalogClassifiedYoulaCity = bVar2.i;
                    if (catalogClassifiedYoulaCity != null) {
                        double d = catalogClassifiedYoulaCity.d;
                        double d2 = catalogClassifiedYoulaCity.e;
                        String str10 = catalogClassifiedYoulaCity.c;
                        boolean z = bVar2.j;
                        bundle.putDouble("key_latitude", d);
                        bundle.putDouble("key_longitude", d2);
                        if (str10 != null) {
                            bundle.putString("key_location_name", str10);
                        }
                        bundle.putBoolean("key_save_geo", z);
                    }
                    String str11 = c0927b.a;
                    if (str11 != null) {
                        bundle.putString("key_item_id", str11);
                    }
                    MarketAnalyticsParams marketAnalyticsParams = c0927b.b;
                    if (marketAnalyticsParams != null) {
                        MarketUtmData marketUtmData = marketAnalyticsParams.b;
                        if (marketUtmData != null && (num = marketUtmData.b) != null) {
                            bundle.putInt("ad_campaign_id", num.intValue());
                        }
                        if (marketUtmData != null && (str6 = marketUtmData.c) != null) {
                            bundle.putString("ad_campaign", str6);
                        }
                        if (marketUtmData != null && (str5 = marketUtmData.d) != null) {
                            bundle.putString("ad_campaign_source", str5);
                        }
                        if (marketUtmData != null && (str4 = marketUtmData.e) != null) {
                            bundle.putString("ad_campaign_content", str4);
                        }
                        if (marketUtmData != null && (str3 = marketUtmData.f) != null) {
                            bundle.putString("ad_campaign_medium", str3);
                        }
                        if (marketUtmData != null && (str2 = marketUtmData.g) != null) {
                            bundle.putString("ad_campaign_term", str2);
                        }
                        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = marketAnalyticsParams.d;
                        if (commonMarketStat$TypeRefSource != null) {
                            bundle.putString("ref_source", commonMarketStat$TypeRefSource.name().toLowerCase(Locale.ROOT));
                        }
                        if (marketUtmData != null && (str = marketUtmData.h) != null) {
                            bundle.putString("traffic_source", str);
                        }
                    }
                    bundle.putParcelable("owner_id", c0927b.c);
                    Integer num4 = c0927b.d;
                    if (num4 != null) {
                        bundle.putInt("album_id", num4.intValue());
                    }
                    bVar2.b.b(new ltf0(new Bundle(bundle), ((pu00) lu00Var).c, c0927b.e), true);
                }
                return s3q0.a;
            case 16:
                c110 c110Var = (c110) obj;
                j110 j110Var = ((MarketItemCommentsFragment) this.c).Z;
                if (j110Var != null) {
                    MarketItemCommentsFragment marketItemCommentsFragment = j110Var.a;
                    if (c110Var instanceof c110.a) {
                        c110.a aVar3 = (c110.a) c110Var;
                        ReactionsFragment.a aVar4 = new ReactionsFragment.a(aVar3.b, aVar3.a);
                        Bundle bundle2 = aVar4.j;
                        bundle2.putSerializable("ltype", LikesGetList.Type.COMMENT);
                        bundle2.putSerializable("lptype", LikesGetList.Type.MARKET);
                        aVar4.l(marketItemCommentsFragment);
                    } else if (c110Var instanceof c110.b) {
                        c110.b bVar3 = (c110.b) c110Var;
                        j110Var.c.a(bVar3.a, marketItemCommentsFragment.requireContext(), bVar3.b);
                    } else if (c110Var instanceof c110.c) {
                        PickingImpl.a a = j110Var.b.a(marketItemCommentsFragment.requireContext());
                        GroupPickerInfo groupPickerInfo = a.b;
                        groupPickerInfo.k = 1;
                        c110.c cVar3 = (c110.c) c110Var;
                        groupPickerInfo.h = fkq0.a(cVar3.a);
                        groupPickerInfo.g = cVar3.b;
                        groupPickerInfo.b = true;
                        a.a(4331, marketItemCommentsFragment);
                    } else {
                        if (!(c110Var instanceof c110.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        o0r0 e = xwk.e();
                        Context requireContext = marketItemCommentsFragment.requireContext();
                        ((c110.d) c110Var).getClass();
                        e.m(requireContext, null, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                    }
                }
                return s3q0.a;
            case 17:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ImageView imageView4 = marketItemReviewsFragment.q0;
                if (imageView4 == null) {
                    imageView4 = null;
                }
                bwt0.p0(imageView4, booleanValue);
                TextView textView = marketItemReviewsFragment.r0;
                bwt0.p0(textView != null ? textView : null, booleanValue);
                return s3q0.a;
            case 18:
                ((f810) this.c).T((p810.k) obj);
                return s3q0.a;
            case 19:
                ((i810) ((f910) this.c).w.getValue()).setItems((List) obj);
                return s3q0.a;
            case 20:
                e120 e120Var = (e120) this.c;
                ((e120.a) obj).getClass();
                jza jzaVar = new jza(null, null, Source.NETWORK);
                a1w a1wVar = q1w.a;
                io.reactivex.rxjava3.internal.operators.single.c C = (a1wVar != null ? a1wVar : null).C(e120Var, jzaVar);
                asu0 asu0Var = asu0.a;
                int i9 = 29;
                e120Var.i.b(C.q(asu0Var.c()).m(asu0Var.d()).subscribe(new d120(new p010(e120Var, i2), r8), new qz(new y8(i9), i9)));
                return s3q0.a;
            case 21:
                ((n320) this.c).a.a(vjc0.b);
                return s3q0.a;
            case 22:
                eg20 eg20Var = (eg20) this.c;
                w8v w8vVar = (w8v) obj;
                if (w8vVar instanceof w8v.f) {
                    eg20Var.a(new dg20.d(((w8v.f) w8vVar).c));
                }
                if (!(w8vVar instanceof w8v.b)) {
                    eg20Var.t = false;
                } else if (eg20Var.t) {
                    de deVar = ((w8v.b) w8vVar).c;
                    if (deVar instanceof rj30) {
                        eg20Var.t = false;
                        rj30 rj30Var = (rj30) deVar;
                        eg20Var.r.onNext(new h5v.a(rj30Var.b, rj30Var.c));
                    }
                }
                return s3q0.a;
            case 23:
                vw20 vw20Var = (vw20) this.c;
                vw20Var.show();
                return new u37(vw20Var, i4);
            case 24:
                Playlist playlist = (Playlist) obj;
                abo aboVar = ((ModernPlaylistModel) this.c).d;
                List<MusicTrack> list3 = playlist.y;
                ArrayList arrayList3 = new ArrayList(c5g.u(list3, 10));
                Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((MusicTrack) it.next()).Fb());
                }
                Playlist g = aboVar.g(playlist, arrayList3);
                g.y = aboVar.a(g, g.y);
                return g;
            case 25:
                ((com.vk.im.ui.components.viewcontrollers.msg_list_empty.a) this.c).e(b.d.a);
                return s3q0.a;
            case 26:
                rx30 rx30Var = (rx30) this.c;
                int i10 = jur0.m;
                return new jur0(rx30Var.i.inflate(R.layout.vkim_msg_search_hint, (ViewGroup) obj, false), rx30Var.h);
            case 27:
                kz30 kz30Var = (kz30) this.c;
                View view3 = (View) obj;
                xgy xgyVar = kz30Var.N;
                boolean z2 = !(xgyVar != null && xgyVar.e());
                ChatFragment.k kVar = kz30Var.K;
                if (kVar == null) {
                    kVar = null;
                }
                long j = kz30Var.e;
                ChatFragment chatFragment = ChatFragment.this;
                ChatFragment.d dVar2 = ChatFragment.w1;
                a1w jo2 = chatFragment.jo();
                Serializer.c<Peer> cVar4 = Peer.CREATOR;
                jo2.D(kVar, new igm(Peer.a.b(j), z2));
                kz30Var.R.postDelayed(new xab(kz30Var, i2), 160L);
                int i11 = ify.a;
                if (ify.e(ify.c)) {
                    xgy xgyVar2 = kz30Var.N;
                    if (xgyVar2 != null) {
                        float height = xgyVar2.f.getHeight();
                        ChatFragment.k kVar2 = kz30Var.K;
                        if (kVar2 == null) {
                            kVar2 = null;
                        }
                        kVar2.e(height);
                        ChatFragment.k kVar3 = kz30Var.K;
                        (kVar3 != null ? kVar3 : null).j(height);
                    }
                } else {
                    ChatFragment.k kVar4 = kz30Var.K;
                    (kVar4 != null ? kVar4 : null).e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                xgy H = kz30Var.H();
                H.k();
                if (!H.e()) {
                    e4w e4wVar = kz30Var.Q;
                    wvw wvwVar = e4wVar.b;
                    l7v b2 = wvwVar.b();
                    HintId hintId = HintId.IM_CHAT_BOT_KEYBOARD_HIDING;
                    Hint p = b2.p(hintId.getId());
                    if (p != null) {
                        Context context3 = view3.getContext();
                        String string = context3.getString(R.string.vkim_chat_bot_keyboard_hiding_tooltip);
                        l7v b3 = wvwVar.b();
                        String str12 = p.b;
                        b3.getClass();
                        k = new Tooltip(context3, "", string, null, new yn3(e4wVar, 11), null, new b1y(str12), 0, 0, null, 0.8f, null, 0, false, null, 0, false, null, null, new c.C0781c(0), null, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, new WeakReference(view3), null, null, null, 2146958248, 15).k(context3, (r15 & 2) != 0, true, (r15 & 8) != 0, true, false, new zn2(view3, i3), r4);
                        e4wVar.c = k;
                        view3.addOnAttachStateChangeListener(new d4w(view3, e4wVar));
                        wvwVar.b().b(hintId.getId());
                    }
                }
                return s3q0.a;
            case 28:
                return new Pair((Bitmap) obj, (Throwable) this.c);
            default:
                View view4 = (View) obj;
                izs<? super View, s3q0> izsVar = ((MyTargetAdSurveyPageView) this.c).i;
                if (izsVar != null) {
                    izsVar.invoke(view4);
                }
                return s3q0.a;
        }
    }
}
