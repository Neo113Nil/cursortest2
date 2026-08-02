package xsna;

import android.content.Intent;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.shortVideo.dto.ShortVideoSaveUploadedThumbResponseDto;
import com.vk.api.generated.video.dto.VideoVideoImageDto;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerState;
import com.vk.dto.common.Good;
import com.vk.dto.common.MarketRejectInfo;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Price;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.ClipsGeoLocationAttachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.GroupMarketInfo;
import com.vk.dto.group.RelatedCategoryItem;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.design.compose.tile.MarketProductTileConfig;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.market.good.good2.presentation.label.ProductLabelSubtype;
import com.vk.ecomm.market.good.good2.presentation.label.ProductLabelType;
import com.vk.ecomm.market.good.good2.presentation.restrictions.ProductCardRestrictions;
import com.vk.ecomm.market.good.ui.holder.LoadingState;
import com.vk.ecomm.market.good.ui.holder.goodquickmessages.QuickMessageItem;
import com.vk.ecomm.market.good.ui.restriction.ProductCardRestrictionViewState;
import com.vk.ecomm.market.good.ui.restriction.b;
import com.vk.ecomm.market.good.ui.restriction.c;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.folders.impl.model.FoldersListLoaderStateEvents;
import com.vk.games.presentation.fragments.GameUnavailableFragment;
import com.vk.identity.fragments.IdentityEditFragment;
import com.vk.im.reporters.api.dialog.OpenChatListReporter;
import com.vk.im.ui.fragments.DialogsFragment;
import com.vk.log.L;
import com.vk.metrics.eventtracking.Event;
import com.vk.music.screens.about.CommunityProfileLinksFragment;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.profile.community.chats.impl.presentation.CommunityChatsFragment;
import com.vk.profile.community.details.links.feature.CommunityProfileLinksArgs;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.stat.scheme.CommonMarketStat$ProductCardFomoLabels;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.SmbFeatures;
import com.vk.voip.ui.debug.view.HeadersViewBoundsDebugView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.a5u;
import xsna.c2r;
import xsna.ejd0;
import xsna.f3m;
import xsna.fnd0;
import xsna.g5u;
import xsna.icl;
import xsna.inv;
import xsna.kjf0;
import xsna.l0s;
import xsna.l2f;
import xsna.lbv;
import xsna.m7a0;
import xsna.qvq;
import xsna.t6k;
import xsna.u8m;
import xsna.wk50;
import xsna.y6k;
import xsna.yo60;
import xsna.z4u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class t9e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t9e(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:216:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0649  */
    /* JADX WARN: Type inference failed for: r0v152, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        voc vocVar;
        boolean contains;
        NewsEntry newsEntry;
        a5u.a aVar;
        String str;
        ProductCardRestrictions productCardRestrictions;
        a5u.a aVar2;
        List list;
        d210 d210Var;
        jp5 jp5Var;
        lpd0 lpd0Var;
        h010 h010Var;
        ArrayList arrayList;
        String a;
        Map.Entry entry;
        List<RelatedCategoryItem> list2;
        ArrayList arrayList2;
        List O0;
        UserId userId;
        ProductCardRestrictionViewState.Button button;
        ComposeView composeView;
        ComposeView composeView2;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ClipsGeoLocationAttachment clipsGeoLocationAttachment = (ClipsGeoLocationAttachment) obj2;
                w9y w9yVar = (w9y) obj;
                w9yVar.c(Integer.valueOf(clipsGeoLocationAttachment.b), "id");
                w9yVar.c(Integer.valueOf(clipsGeoLocationAttachment.c), "category_id");
                w9yVar.c(Integer.valueOf(clipsGeoLocationAttachment.d), "ownerId");
                w9yVar.f("latitude", Double.valueOf(clipsGeoLocationAttachment.e));
                w9yVar.f("longitude", Double.valueOf(clipsGeoLocationAttachment.f));
                w9yVar.e(clipsGeoLocationAttachment.g, "title");
                w9yVar.e(clipsGeoLocationAttachment.h, "photo");
                w9yVar.e(clipsGeoLocationAttachment.i, RTCStatsConstants.KEY_ADDRESS);
                w9yVar.e(clipsGeoLocationAttachment.j, "city");
                w9yVar.e(clipsGeoLocationAttachment.k, "country");
                return s3q0.a;
            case 1:
                View view = (View) obj2;
                int i2 = ClipsInterestsFragment.Y;
                ucp.f(view.isAttachedToWindow() ? view : null);
                return s3q0.a;
            case 2:
                ((com.vk.clips.playlists.ui.picker.d) obj2).f.getClass();
                return tqe.a((ClipsPlaylistPickerState.Content) obj);
            case 3:
                l9f l9fVar = (l9f) obj2;
                List<VideoVideoImageDto> d = ((ShortVideoSaveUploadedThumbResponseDto) obj).d();
                if (d != null && (vocVar = l9fVar.p) != null) {
                    vocVar.b(d);
                }
                return s3q0.a;
            case 4:
                int i3 = CommunityChatsFragment.b0;
                FragmentActivity activity = ((CommunityChatsFragment) obj2).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 5:
                qgi0.r((tgi0) obj, "priority_block_community_item_".concat(((MarketProductTileConfig) obj2).a));
                return s3q0.a;
            case 6:
                fkh fkhVar = (fkh) obj2;
                m7a0 m7a0Var = (m7a0) obj;
                if (m7a0Var instanceof m7a0.a) {
                    List<Photo> list3 = ((m7a0.a) m7a0Var).b;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator<T> it = list3.iterator();
                        while (it.hasNext()) {
                            if (epx.f(((Photo) it.next()).e, fkhVar.a)) {
                                contains = true;
                                return Boolean.valueOf(contains);
                            }
                        }
                    }
                    contains = false;
                    return Boolean.valueOf(contains);
                }
                if (m7a0Var instanceof m7a0.b) {
                    List<Photo> list4 = ((m7a0.b) m7a0Var).a;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list4, 10));
                    Iterator<T> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((Photo) it2.next()).e);
                    }
                    contains = arrayList3.contains(fkhVar.a);
                    return Boolean.valueOf(contains);
                }
                contains = false;
                return Boolean.valueOf(contains);
            case 7:
                qmh qmhVar = (qmh) obj2;
                qmhVar.a.invoke(d.a.a);
                qmhVar.b.invoke(new CommunityProfileAction.o(false));
                return s3q0.a;
            case 8:
                qcy<Object>[] qcyVarArr = CommunityProfileLinksFragment.P;
                return new cn50(up2.d(new oe5(5, (gzs) obj, (CommunityProfileLinksArgs) ((CommunityProfileLinksFragment) obj2).requireArguments().getParcelable("arguments_community_profile_links_fragment")), vqh.b, svj.b));
            case 9:
                mvh mvhVar = (mvh) obj2;
                Throwable th = (Throwable) obj;
                awh awhVar = mvhVar.d0;
                awhVar.g3();
                if (mvhVar.c.d.isEmpty()) {
                    awhVar.V1();
                } else {
                    awhVar.Ij();
                }
                L.e(th);
                return s3q0.a;
            case 10:
                ((l2f.a) obj2).a(Boolean.FALSE);
                return s3q0.a;
            case 11:
                ((zak0) ((rfj) obj2).m).setValue((String) obj);
                return s3q0.a;
            case 12:
                t6k t6kVar = (t6k) obj2;
                y6k.b bVar = t6kVar.h;
                LayoutInflater layoutInflater = t6kVar.j;
                ViewGroup viewGroup = (ViewGroup) obj;
                ImFeatures imFeatures = ImFeatures.IM_START_CHAT_REDESIGN;
                imFeatures.getClass();
                return com.vk.toggle.b.A.a(imFeatures) ? new wzo0(layoutInflater.inflate(R.layout.vkim_new_chat_title_vh, viewGroup, false), bVar) : new t6k.h(layoutInflater.inflate(R.layout.vkim_new_chat_title_vh_old, viewGroup, false), bVar);
            case 13:
                ((cbk) obj2).i = true;
                return s3q0.a;
            case 14:
                return new dkl((ViewGroup) obj, (icl.a) obj2);
            case 15:
                cem cemVar = (cem) obj2;
                xgl0 xgl0Var = (xgl0) obj;
                int d2 = xgl0Var.system().d();
                hpm e = xgl0Var.b().e();
                Peer peer = cemVar.b;
                List<Peer> list5 = cemVar.f;
                Integer P = e.P(peer.b);
                if (P == null || P.intValue() < 0) {
                    P = null;
                }
                return new dem(new xpp(list5 != null ? lnm.a(xgl0Var.b().e(), peer.b, list5, null, 4) : P != null ? lnm.a(xgl0Var.b().e(), peer.b, null, null, 6) : null, P == null || P.intValue() != d2), cemVar.g != null && (P == null || xgl0Var.b().e().R(peer.b) != null));
            case 16:
                List list6 = (List) obj;
                efm efmVar = ((cfm) obj2).e;
                if (efmVar != null) {
                    efmVar.a(list6.contains(u8m.o0.b));
                }
                return s3q0.a;
            case 17:
                com.vk.im.ui.components.dialogs_list.c cVar = ((DialogsFragment) obj2).j0;
                (cVar == null ? null : cVar).v();
                return s3q0.a;
            case 18:
                EntriesListPresenter entriesListPresenter = (EntriesListPresenter) obj2;
                ay00 ay00Var = (ay00) obj;
                if (ay00Var instanceof gu00) {
                    gu00 gu00Var = (gu00) ay00Var;
                    entriesListPresenter.K(gu00Var.b, gu00Var.a);
                } else if (ay00Var instanceof iu00) {
                    entriesListPresenter.K(0, ((iu00) ay00Var).a);
                } else if (ay00Var instanceof hu00) {
                    hu00 hu00Var = (hu00) ay00Var;
                    entriesListPresenter.K(hu00Var.c, hu00Var.a);
                } else if (ay00Var instanceof hy00) {
                    hy00 hy00Var = (hy00) ay00Var;
                    Iterator<NewsEntry> it3 = entriesListPresenter.d.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            NewsEntry next = it3.next();
                            NewsEntry newsEntry2 = next;
                            if (newsEntry2 instanceof FaveEntry) {
                                Object obj3 = ((FaveEntry) newsEntry2).i.f;
                                newsEntry = ((obj3 instanceof Good) && ((Good) obj3).b == hy00Var.a) ? next : null;
                            }
                        }
                    }
                    NewsEntry newsEntry3 = newsEntry;
                    Iterator<u1c0> it4 = entriesListPresenter.c.d.iterator();
                    int i4 = 0;
                    while (true) {
                        if (it4.hasNext()) {
                            u1c0 next2 = it4.next();
                            if (epx.f(next2.b, newsEntry3)) {
                                ((FaveEntry) newsEntry3).i.f.s0(hy00Var.c);
                                entriesListPresenter.b.H3(next2, i4);
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                return s3q0.a;
            case 19:
                ((bq60) obj2).a(yo60.e.a.a);
                return s3q0.a;
            case 20:
                wk50.a aVar3 = (wk50.a) obj2;
                aVar3.b(new c2r.h.a((Throwable) obj));
                aVar3.a(qvq.n.b);
                return s3q0.a;
            case 21:
                l0s l0sVar = (l0s) obj2;
                bpn0 bpn0Var = l0sVar.d;
                OpenChatListReporter openChatListReporter = l0sVar.b;
                int i5 = l0s.a.$EnumSwitchMapping$0[((FoldersListLoaderStateEvents.LoaderStateEvent) obj).ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        openChatListReporter.f((mdz) bpn0Var.getValue(), null);
                    } else {
                        if (i5 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        openChatListReporter.c((mdz) bpn0Var.getValue());
                    }
                }
                return s3q0.a;
            case 22:
                ((h3t) obj2).e.c((Throwable) obj);
                return s3q0.a;
            case 23:
                Toolbar toolbar = (Toolbar) obj;
                qcy<Object>[] qcyVarArr2 = GameUnavailableFragment.W;
                TypedValue typedValue = krv0.a;
                krv0.r(toolbar, R.drawable.vk_icon_cancel_outline_28);
                toolbar.setNavigationContentDescription(R.string.accessibility_toolbar_back);
                toolbar.setTitle((CharSequence) null);
                toolbar.setNavigationOnClickListener(new l44((GameUnavailableFragment) obj2, 4));
                toolbar.setElevation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            case 24:
                GoodFragment goodFragment = (GoodFragment) obj2;
                d210 d210Var2 = (d210) obj;
                qcy<Object>[] qcyVarArr3 = GoodFragment.U0;
                mzp0 mzp0Var = goodFragment.J;
                if (mzp0Var != null) {
                    mzp0Var.c(false);
                }
                goodFragment.Qo().b(new ejd0.c.a(d210Var2));
                goodFragment.So(LoadingState.IDLE);
                h5u h5uVar = (h5u) goodFragment.Po().a.t0.getValue();
                cxo Po = goodFragment.Po();
                a5u.a aVar4 = new a5u.a(d210Var2.s, d210Var2.c, goodFragment.Oo(), goodFragment.No(), goodFragment.U, goodFragment.requireContext());
                jp5 jp5Var2 = new jp5(12, goodFragment, d210Var2);
                h5uVar.getClass();
                y4u y4uVar = Po.a;
                int i6 = d210Var2.h;
                String str2 = d210Var2.j;
                String str3 = d210Var2.t;
                Good good = d210Var2.a;
                if (good != null) {
                    Po.s = good.B;
                    Po.j0 = d210Var2.O;
                }
                if (good == null) {
                    ymd0 ymd0Var = Po.Y;
                    if (ymd0Var != null && (composeView2 = Po.e0) != null) {
                        ymd0Var.a(composeView2, fnd0.b.a);
                    }
                    jp5Var2.invoke(g5u.f.a);
                } else {
                    long j = good.b;
                    if (Po.z) {
                        if (b210.a(Po.r, ((Boolean) h5uVar.a.getValue()).booleanValue())) {
                            Po.J = null;
                        }
                        Po.r = null;
                    }
                    if (d210Var2.i == null || str2 == null) {
                        z4u z4uVar = Po.F;
                        if (z4uVar != null) {
                            com.vk.ecomm.market.good.ui.restriction.a aVar5 = z4uVar.c;
                            r7u r7uVar = z4uVar.a;
                            if (good.i0) {
                                MarketRejectInfo marketRejectInfo = good.e0;
                                if (str3 == null || str3.length() <= 0 || marketRejectInfo == null) {
                                    str = str3;
                                    String str4 = good.j0;
                                    aVar5.i = str4;
                                    aVar5.g.setVisibility(0);
                                    aVar5.c(new ProductCardRestrictionViewState(ProductCardRestrictionViewState.Icon.Error, b.InterfaceC0949b.C0950b.a, str4 != null ? new ProductCardRestrictionViewState.Button(ProductCardRestrictionViewState.Button.Mode.Primary, c.C0951c.a, false) : null, null));
                                    r7uVar.e();
                                } else {
                                    String str5 = marketRejectInfo.e;
                                    String str6 = marketRejectInfo.d;
                                    est estVar = new est(r7uVar, 1);
                                    aVar5.j = str5;
                                    aVar5.k = estVar;
                                    aVar5.g.setVisibility(0);
                                    ProductCardRestrictionViewState.Icon icon = ProductCardRestrictionViewState.Icon.Error;
                                    b.InterfaceC0949b.a aVar6 = new b.InterfaceC0949b.a(str6);
                                    ProductCardRestrictionViewState.Button button2 = new ProductCardRestrictionViewState.Button(ProductCardRestrictionViewState.Button.Mode.Primary, c.f.a, false);
                                    if (str5 != null) {
                                        str = str3;
                                        button = new ProductCardRestrictionViewState.Button(ProductCardRestrictionViewState.Button.Mode.Tertiary, c.e.a, false);
                                    } else {
                                        str = str3;
                                        button = null;
                                    }
                                    aVar5.c(new ProductCardRestrictionViewState(icon, aVar6, button2, button));
                                    r7uVar.e();
                                }
                                productCardRestrictions = ProductCardRestrictions.FULLY_RESTRICTIONS;
                                aVar = aVar4;
                            } else {
                                str = str3;
                                int i7 = z4u.a.$EnumSwitchMapping$0[((y330) z4uVar.b.V.getValue()).a(good.g0, good.h0).ordinal()];
                                if (i7 == 1) {
                                    aVar = aVar4;
                                    productCardRestrictions = ProductCardRestrictions.NO_RESTRICTIONS;
                                } else if (i7 == 2) {
                                    aVar = aVar4;
                                    aVar5.l = new c95(r7uVar, 5);
                                    aVar5.g.setVisibility(0);
                                    aVar5.c(new ProductCardRestrictionViewState(ProductCardRestrictionViewState.Icon.Help, b.c.a, new ProductCardRestrictionViewState.Button(ProductCardRestrictionViewState.Button.Mode.Primary, c.b.a, false), new ProductCardRestrictionViewState.Button(ProductCardRestrictionViewState.Button.Mode.Tertiary, c.g.a, false)));
                                    r7uVar.b();
                                    productCardRestrictions = ProductCardRestrictions.PARTIALLY_RESTRICTIONS;
                                } else {
                                    if (i7 != 3) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    aVar5.g.setVisibility(0);
                                    aVar = aVar4;
                                    aVar5.c(new ProductCardRestrictionViewState(ProductCardRestrictionViewState.Icon.Error, b.a.a, new ProductCardRestrictionViewState.Button(ProductCardRestrictionViewState.Button.Mode.Primary, c.a.a, false), null));
                                    r7uVar.e();
                                    productCardRestrictions = ProductCardRestrictions.FULLY_RESTRICTIONS;
                                }
                            }
                        } else {
                            aVar = aVar4;
                            str = str3;
                            productCardRestrictions = null;
                        }
                        jp5Var2.invoke(new g5u.d(productCardRestrictions));
                        if (productCardRestrictions == ProductCardRestrictions.FULLY_RESTRICTIONS) {
                            Po.r = good;
                            h010 h010Var2 = Po.f;
                            if (h010Var2 != null) {
                                h010Var2.b = j;
                            }
                            Po.z = true;
                        } else {
                            Po.u = d210Var2.p;
                            boolean z = d210Var2.q && !good.V;
                            Po.v = z;
                            if (z && !Po.i) {
                                h010 h010Var3 = Po.f;
                                Long valueOf = (h010Var3 == null || (userId = h010Var3.c) == null) ? null : Long.valueOf(userId.b);
                                h010 h010Var4 = Po.f;
                                Long valueOf2 = h010Var4 != null ? Long.valueOf(h010Var4.b) : null;
                                if (valueOf != null && valueOf2 != null) {
                                    long longValue = valueOf2.longValue();
                                    long longValue2 = valueOf.longValue();
                                    el3 el3Var = Event.b;
                                    Event.a b = h5s.b("new_store_open_product");
                                    b.b("product_id", Long.valueOf(longValue));
                                    b.b("store_id", Long.valueOf(longValue2));
                                    b.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER);
                                    com.vk.metrics.eventtracking.b.a.k(b.e());
                                }
                                Po.i = true;
                            }
                            Po.x = i6;
                            Po.y = d210Var2.w;
                            LinkedHashMap<String, lpd0> linkedHashMap = d210Var2.J;
                            if (linkedHashMap != null) {
                                ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
                                Iterator<Map.Entry<String, lpd0>> it5 = linkedHashMap.entrySet().iterator();
                                while (it5.hasNext()) {
                                    arrayList4.add(it5.next().getValue().c);
                                }
                                ArrayList arrayList5 = new ArrayList(linkedHashMap.size());
                                Iterator<Map.Entry<String, lpd0>> it6 = linkedHashMap.entrySet().iterator();
                                while (it6.hasNext()) {
                                    Integer num = it6.next().getValue().g;
                                    arrayList5.add(Integer.valueOf(num != null ? num.intValue() : -1));
                                }
                                Po.k0 = new CommonMarketStat$ProductCardFomoLabels(arrayList4, arrayList5);
                            }
                            e4u e4uVar = Po.P;
                            if (e4uVar != null) {
                                Boolean bool = Po.C;
                                e4uVar.c = good;
                                if (bool == null) {
                                    bool = Boolean.FALSE;
                                }
                                e4uVar.d = bool;
                            }
                            String str7 = d210Var2.d;
                            String str8 = d210Var2.e;
                            String str9 = d210Var2.o;
                            String str10 = d210Var2.n;
                            Price price = d210Var2.v;
                            Integer num2 = d210Var2.z;
                            Integer num3 = d210Var2.A;
                            boolean z2 = d210Var2.x || d210Var2.y;
                            List<String> list7 = d210Var2.B;
                            List<Object> list8 = d210Var2.C;
                            GroupMarketInfo.b bVar2 = d210Var2.E;
                            boolean z3 = str == null || str.length() == 0;
                            k5u k5uVar = new k5u(str7, str8, str9, str10, price, num2, num3, z2, list7, list8, bVar2, !z3, i6 == 0, d210Var2.f, d210Var2.F, d210Var2.G, d210Var2.H, d210Var2.I, d210Var2.K, d210Var2.L, d210Var2.J, d210Var2.M, d210Var2.N);
                            List<VideoFile> list9 = d210Var2.D;
                            a5u a5uVar = Po.c;
                            sld0 sld0Var = a5uVar.b;
                            ArrayList arrayList6 = new ArrayList();
                            boolean z4 = b210.a(good, sld0Var.a) ? sld0Var.a ? bVar2.e : bVar2.d : bVar2.c;
                            if (z4) {
                                aVar2 = aVar;
                                Po.I = new gs1(good, aVar2, Po, 3);
                            } else {
                                aVar2 = aVar;
                                if (str9 == null || str10 == null) {
                                    Po.I = null;
                                } else {
                                    Po.I = new w76(a5uVar, aVar2, k5uVar, 2);
                                }
                            }
                            List list10 = good.A;
                            if (list10 == null) {
                                list10 = EmptyList.b;
                            }
                            List list11 = list10;
                            if (list9 == null || (O0 = j5g.O0(list9)) == null) {
                                list = EmptyList.b;
                            } else {
                                List list12 = O0;
                                Iterator it7 = list12.iterator();
                                while (it7.hasNext()) {
                                    ((VideoFile) it7.next()).f1(new Owner(null, null, k5uVar.b, null, null, null, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194299, null));
                                }
                                list = list12;
                            }
                            duk dukVar = new duk(good, k5uVar, z4, list11, list);
                            wyp0 wyp0Var = a5uVar.c;
                            vyp0 vyp0Var = wyp0Var.a;
                            izp0 izp0Var = new izp0(vyp0Var, wyp0Var.b);
                            szp0 szp0Var = new szp0(vyp0Var);
                            vzp0 vzp0Var = new vzp0(vyp0Var);
                            ezp0 ezp0Var = new ezp0(Po, dukVar, aVar2, vyp0Var);
                            izp0Var.b(ezp0Var);
                            ArrayList arrayList7 = izp0Var.b;
                            vyp0Var.a(arrayList7);
                            ArrayList arrayList8 = ezp0Var.e;
                            arrayList8.addAll(arrayList7);
                            SmbFeatures smbFeatures = SmbFeatures.PRODUCT_BUY_NOW;
                            smbFeatures.getClass();
                            if (com.vk.toggle.b.A.a(smbFeatures)) {
                                d210Var = d210Var2;
                                jp5Var = jp5Var2;
                            } else {
                                List<QuickMessageItem> list13 = k5uVar.q;
                                if (list13 != null) {
                                    arrayList2 = new ArrayList();
                                    Iterator it8 = list13.iterator();
                                    while (it8.hasNext()) {
                                        Iterator it9 = it8;
                                        Object next3 = it9.next();
                                        jp5 jp5Var3 = jp5Var2;
                                        if (!((QuickMessageItem) next3).f) {
                                            arrayList2.add(next3);
                                        }
                                        it8 = it9;
                                        jp5Var2 = jp5Var3;
                                    }
                                } else {
                                    arrayList2 = null;
                                }
                                jp5Var = jp5Var2;
                                if (!z3 || ((arrayList2 != null && arrayList2.isEmpty()) || arrayList2 == null)) {
                                    d210Var = d210Var2;
                                } else {
                                    d210Var = d210Var2;
                                    ezp0Var.a(kjf0.a.a(28, new qse0(ezp0Var.c.f.getString(R.string.product_message_to_owner), arrayList2, k5uVar.t)));
                                }
                            }
                            szp0Var.b(ezp0Var);
                            vyp0 vyp0Var2 = szp0Var.a;
                            ArrayList arrayList9 = szp0Var.b;
                            vyp0Var2.a(arrayList9);
                            arrayList8.addAll(arrayList9);
                            vzp0Var.b(ezp0Var);
                            vyp0 vyp0Var3 = vzp0Var.a;
                            ArrayList arrayList10 = vzp0Var.b;
                            vyp0Var3.a(arrayList10);
                            arrayList8.addAll(arrayList10);
                            kjf0.a a2 = y4uVar.a().a(Po);
                            if (a2 == null) {
                                ezp0Var.a(kjf0.a.a(33, Boolean.TRUE));
                            } else {
                                ezp0Var.a(a2);
                            }
                            if (z3 && ((list2 = k5uVar.p) == null || !list2.isEmpty())) {
                                ArrayList arrayList11 = new ArrayList();
                                arrayList11.add(kjf0.a.b(18, new k8u(k5uVar.o, null)));
                                if (list2 != null) {
                                    for (Iterator it10 = list2.iterator(); it10.hasNext(); it10 = it10) {
                                        RelatedCategoryItem relatedCategoryItem = (RelatedCategoryItem) it10.next();
                                        String str11 = relatedCategoryItem.b;
                                        String str12 = relatedCategoryItem.c;
                                        String str13 = relatedCategoryItem.d;
                                        arrayList11.add(kjf0.a.a(27, new cla(str11, str12, relatedCategoryItem.e, str13, new y7l0(1, ezp0Var, str13))));
                                    }
                                }
                                ezp0Var.d.a(arrayList11);
                                arrayList8.addAll(arrayList11);
                            }
                            if (z3) {
                                ezp0Var.a(kjf0.a.a(26, new mww(dukVar.a.V ? R.string.product_report_service : R.string.product_report_product, new h6m0(ezp0Var, 5))));
                            }
                            arrayList6.addAll(arrayList8);
                            LinkedHashMap<String, lpd0> linkedHashMap2 = k5uVar.u;
                            if (linkedHashMap2 != null) {
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                for (Map.Entry<String, lpd0> entry2 : linkedHashMap2.entrySet()) {
                                    if (entry2.getValue().a == ProductLabelType.OZON && entry2.getValue().b == ProductLabelSubtype.CART_PRICE) {
                                        linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                                    }
                                }
                                Set entrySet = linkedHashMap3.entrySet();
                                if (entrySet != null && (entry = (Map.Entry) j5g.Z(entrySet)) != null) {
                                    lpd0Var = (lpd0) entry.getValue();
                                    if ((lpd0Var == null ? lpd0Var.f : null) instanceof mpd0) {
                                    }
                                    arrayList6.size();
                                    Po.q = aVar2.b;
                                    Po.r = good;
                                    h010Var = Po.f;
                                    if (h010Var != null) {
                                        h010Var.b = j;
                                    }
                                    Po.z = true;
                                    arrayList = new ArrayList(arrayList6);
                                    Po.A = str;
                                    Po.B = d210Var.u;
                                    Good good2 = Po.r;
                                    a = good2 == null ? ((y110) y4uVar.G.getValue()).a(good2) : null;
                                    if (a == null) {
                                        a = "";
                                    }
                                    boolean z5 = (Po.a() || b210.a(Po.r, ((Boolean) Po.d.getValue()).booleanValue())) ? false : true;
                                    Good good3 = Po.r;
                                    boolean z6 = good3 == null && good3.Bb() && Po.x == 0;
                                    j8u j8uVar = new j8u();
                                    j8uVar.a = j;
                                    j8uVar.b = aVar2.d;
                                    j8uVar.c = a;
                                    j8uVar.d = z5;
                                    j8uVar.e = z6;
                                    maz b2 = y4uVar.b();
                                    jp5 jp5Var4 = jp5Var;
                                    gbh gbhVar = new gbh(jp5Var4, 19);
                                    b3p0 b3p0Var = new b3p0();
                                    b3p0Var.a = Po;
                                    b3p0Var.b = aVar2.c;
                                    b3p0Var.c = j8uVar;
                                    b3p0Var.d = b2;
                                    b3p0Var.e = gbhVar;
                                    Po.X = b3p0Var;
                                    if (arrayList.isEmpty()) {
                                        jp5Var4.invoke(g5u.b.a);
                                        jp5Var4.invoke(new g5u.c(arrayList));
                                    } else {
                                        jp5Var4.invoke(g5u.f.a);
                                    }
                                }
                            }
                            lpd0Var = null;
                            if ((lpd0Var == null ? lpd0Var.f : null) instanceof mpd0) {
                            }
                            arrayList6.size();
                            Po.q = aVar2.b;
                            Po.r = good;
                            h010Var = Po.f;
                            if (h010Var != null) {
                            }
                            Po.z = true;
                            arrayList = new ArrayList(arrayList6);
                            Po.A = str;
                            Po.B = d210Var.u;
                            Good good22 = Po.r;
                            if (good22 == null) {
                            }
                            if (a == null) {
                            }
                            if (Po.a()) {
                            }
                            Good good32 = Po.r;
                            if (good32 == null) {
                            }
                            j8u j8uVar2 = new j8u();
                            j8uVar2.a = j;
                            j8uVar2.b = aVar2.d;
                            j8uVar2.c = a;
                            j8uVar2.d = z5;
                            j8uVar2.e = z6;
                            maz b22 = y4uVar.b();
                            jp5 jp5Var42 = jp5Var;
                            gbh gbhVar2 = new gbh(jp5Var42, 19);
                            b3p0 b3p0Var2 = new b3p0();
                            b3p0Var2.a = Po;
                            b3p0Var2.b = aVar2.c;
                            b3p0Var2.c = j8uVar2;
                            b3p0Var2.d = b22;
                            b3p0Var2.e = gbhVar2;
                            Po.X = b3p0Var2;
                            if (arrayList.isEmpty()) {
                            }
                        }
                    } else {
                        ymd0 ymd0Var2 = Po.Y;
                        if (ymd0Var2 != null && (composeView = Po.e0) != null) {
                            ymd0Var2.a(composeView, fnd0.b.a);
                        }
                        jp5Var2.invoke(new g5u.e(str2));
                    }
                }
                return s3q0.a;
            case 25:
                f3m.a aVar7 = (f3m.a) obj;
                int i8 = HeadersViewBoundsDebugView.c;
                f4m.u((HeadersViewBoundsDebugView) obj2, aVar7.c, aVar7.a, aVar7.d, aVar7.b);
                return s3q0.a;
            case 26:
                s7v s7vVar = (s7v) obj2;
                ((Boolean) obj).getClass();
                s7vVar.b.j0.setActionInProgress(false);
                s7vVar.b.j0.play();
                return s3q0.a;
            case 27:
                ((cbv) obj2).p.onNext(lbv.b.a);
                return s3q0.a;
            case 28:
                gzs<Boolean> gzsVar = ((inv.a) obj2).f;
                return Boolean.valueOf(gzsVar != null ? gzsVar.invoke().booleanValue() : false);
            default:
                int i9 = IdentityEditFragment.U;
                ((IdentityEditFragment) obj2).Mf(-1, (Intent) obj);
                return s3q0.a;
        }
    }
}
