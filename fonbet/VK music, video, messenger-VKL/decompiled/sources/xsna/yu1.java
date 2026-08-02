package xsna;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.PopupWindow;
import androidx.compose.ui.platform.ComposeView;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.market.dto.MarketBlockDataDto;
import com.vk.api.generated.market.dto.MarketCurrencyDto;
import com.vk.api.generated.market.dto.MarketGetRecommendsResponseDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.catalog2.common.dto.api.block.CatalogBlock;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.core.preference.Preference;
import com.vk.dto.common.Currency;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Price;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.id.UserId;
import com.vk.dto.discover.carousel.products.ProductCarousel;
import com.vk.dto.discover.carousel.products.ProductCarouselItem;
import com.vk.dto.games.CatalogMiniAppItem;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.group.Group;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickersDictionaryItemLight;
import com.vk.dto.stories.model.web.StoryBoxPrepared;
import com.vk.dto.uxpolls.PollAnswer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.chats.ChatPreview;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.posting.poll_editor.presentation.model.PollEditorMode;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.profile.community.impl.ui.events.CommunityEventsState;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonUnknownError;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxAction;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxType;
import com.vk.superapp.bridges.dto.analytics.VkStepsResultPermissionItem$SyncReason;
import com.vk.superapp.core.js.bridge.api.events.StorageSet$Parameters;
import com.vk.video.polls.nav.PollNavParams;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.e8v0;
import xsna.g6c;
import xsna.k4i;
import xsna.kbl0;
import xsna.omv0;
import xsna.pnb0;
import xsna.r2c;
import xsna.tba0;
import xsna.uje;
import xsna.xpb0;
import xsna.z710;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class yu1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yu1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Price price;
        Photo photo;
        int i = 1;
        int i2 = 0;
        switch (this.b) {
            case 0:
                dv1 dv1Var = (dv1) this.c;
                dv1Var.c.a((String) this.d);
                s13 s13Var = dv1Var.b;
                if (s13Var != null) {
                    s13Var.e(MiniAppSettingsBoxType.SETTINGS_BOX_ALLOW_GROUP_MESSAGES, MiniAppSettingsBoxAction.ALLOW);
                }
                break;
            case 1:
                ((com.vk.search.fragment.a) this.c).g.a((VkOnboardingCampaign) this.d, VkOnboardingType.Tooltip, e8v0.m.b);
                break;
            case 2:
                rtb rtbVar = (rtb) this.c;
                bpn0 bpn0Var = rtbVar.p;
                Dialog dialog = (Dialog) this.d;
                ChatPreview chatPreview = (ChatPreview) obj;
                ProfilesInfo profilesInfo = new ProfilesInfo();
                profilesInfo.Lb(chatPreview.n);
                rtbVar.o.Hb(profilesInfo);
                List<Peer> list = chatPreview.m;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!epx.f((Peer) obj2, (Peer) bpn0Var.getValue())) {
                        arrayList.add(obj2);
                    }
                }
                stb stbVar = new stb(dialog, arrayList, chatPreview.l, rtbVar.o, (Peer) bpn0Var.getValue(), dialog.Wb());
                ttb ttbVar = rtbVar.m;
                (ttbVar == null ? null : ttbVar).d(stbVar);
                break;
            case 3:
                ((q5c) this.c).b.a(new r2c.w(((g6c.k) this.d).b, ((n4c) obj).a));
                break;
            case 4:
                izs izsVar = (izs) this.c;
                wh50 wh50Var = (wh50) this.d;
                tho0 tho0Var = (tho0) obj;
                us2 us2Var = tho0Var.a;
                if (!defpackage.b.b(us2Var.c)) {
                    wh50Var.setValue(tho0Var);
                    izsVar.invoke(new uje.b(us2Var.c));
                }
                break;
            case 5:
                CommunityEventsState.Content.Items items = (CommunityEventsState.Content.Items) this.c;
                izs izsVar2 = (izs) this.d;
                nvy nvyVar = (nvy) obj;
                ArrayList arrayList2 = items.a;
                nvyVar.e(arrayList2.size(), null, new jdf(arrayList2, i), new jai(802480018, new r2h(arrayList2, izsVar2), true));
                nvy.g(nvyVar, null, null, new jai(-634636648, new q2h(0, items, izsVar2), true), 3);
                break;
            case 6:
                ((ComposeView) this.c).setContentDescription(((k4i) ((k4i.a) this.d).m).g.d);
                qgi0.r((tgi0) obj, "COMMUNITY_TRUST_MARK_ITEM");
                break;
            case 7:
                String str = (String) this.d;
                NewsEntriesContainer newsEntriesContainer = (NewsEntriesContainer) this.c;
                com.vk.metrics.eventtracking.b.a.a(new RuntimeException("DiscoverRepository Exception ".concat(str), (Throwable) obj));
                break;
            case 8:
                VKActivity vKActivity = (VKActivity) this.c;
                avo avoVar = (avo) this.d;
                PopupWindow popupWindow = (PopupWindow) obj;
                View rootView = vKActivity.getWindow().getDecorView().getRootView();
                if (rootView.isAttachedToWindow()) {
                    avoVar.invoke(popupWindow);
                } else {
                    rootView.addOnAttachStateChangeListener(new cvo(rootView, avoVar, popupWindow));
                }
                break;
            case 9:
                qrp qrpVar = (qrp) this.c;
                Map<Integer, PollAnswer> map = (Map) this.d;
                com.vk.video.polls.nav.a b = ((PollNavParams.a) obj).b(qrpVar.b);
                b.c = map;
                dhr0.a.getClass();
                b.d = dhr0.u().c;
                break;
            case 10:
                CatalogBlock catalogBlock = (CatalogBlock) this.c;
                bi20 bi20Var = (bi20) this.d;
                ApiApplication apiApplication = (ApiApplication) obj;
                Object zb = catalogBlock.m.zb(apiApplication.b);
                CatalogMiniAppItem catalogMiniAppItem = zb instanceof CatalogMiniAppItem ? (CatalogMiniAppItem) zb : null;
                if (catalogMiniAppItem != null) {
                    break;
                }
                break;
            case 11:
                dvt dvtVar = (dvt) this.c;
                Context context = (Context) this.d;
                String str2 = (String) obj;
                omv0 omv0Var = (omv0) dvtVar.o.getValue();
                Long l = dvtVar.p;
                omv0.a aVar = new omv0.a(l != null ? l.longValue() : System.currentTimeMillis(), VkStepsResultPermissionItem$SyncReason.GET_STEPS_COMMAND, (iyu0) null, str2, 8);
                omv0Var.getClass();
                omv0.a(context, aVar);
                break;
            case 12:
                ((muv) this.c).b.put((String) this.d, (StoryBoxPrepared) obj);
                break;
            case 13:
                ((p3y) this.c).L0().g(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNKNOWN_ERROR, null, new Responses$ReasonUnknownError(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131064, null), ((StorageSet$Parameters) this.d).e(), 1, null));
                break;
            case 14:
                nxz nxzVar = (nxz) this.c;
                GeoLocation geoLocation = (GeoLocation) obj;
                usa0 usa0Var = new usa0(geoLocation.g, geoLocation.h, ((CharSequence) this.d).toString(), 0, 10);
                usa0Var.n = true;
                int i3 = 18;
                break;
            case 15:
                o2i o2iVar = (o2i) this.c;
                MarketItemCommentsFragment marketItemCommentsFragment = (MarketItemCommentsFragment) this.d;
                Throwable th = (Throwable) obj;
                int i4 = MarketItemCommentsFragment.j0;
                if (!o2iVar.d(th, true)) {
                    enj.r(marketItemCommentsFragment.mo2getContext(), j03.g(marketItemCommentsFragment.mo2getContext(), th, R.string.error), 0);
                }
                break;
            case 16:
                ((f810) this.c).C(new z710.i(((glu) this.d).b));
                break;
            case 17:
                ((tgp0) obj).b((bgk0) this.c, (ur4) this.d);
                break;
            case 18:
                break;
            case 19:
                ((bca0) this.d).n.load(((tba0.b) this.c).a.a.Db(((VKImageView) obj).getHeight(), false).d.d);
                break;
            case 20:
                aob0 aob0Var = (aob0) this.c;
                xpb0 xpb0Var = (xpb0) this.d;
                qv2 qv2Var = (qv2) obj;
                Map<qv2, iv2> map2 = aob0Var.d.invoke().b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(new bpw(map2));
                Object remove = linkedHashMap.remove(qv2Var);
                aob0Var.e.invoke(new bpw<>(linkedHashMap));
                ArrayList arrayList3 = new ArrayList(new wow(aob0Var.h.invoke().b));
                arrayList3.remove(qv2Var);
                List O0 = j5g.O0(arrayList3);
                aob0Var.i.invoke(new wow<>(O0));
                izs<pnb0, s3q0> izsVar3 = aob0Var.a;
                izsVar3.invoke(new pnb0.a.c(aob0Var.b.invoke(), aob0Var.f.invoke().b, O0, linkedHashMap));
                iv2 iv2Var = (iv2) remove;
                if (epx.f(((xpb0.a) xpb0Var).f, PollEditorMode.Edit.b)) {
                    int i5 = qv2Var.a;
                    izs<gob0, s3q0> izsVar4 = aob0Var.k;
                    gob0 invoke = aob0Var.j.invoke();
                    long j = iv2Var != null ? iv2Var.a : 0L;
                    if (j > 0) {
                        ArrayList arrayList4 = new ArrayList(invoke.a);
                        arrayList4.add(Long.valueOf(j));
                        gob0 a = gob0.a(invoke, new wow(arrayList4), null, null, 6);
                        izsVar4.invoke(a);
                        izsVar3.invoke(new pnb0.a.f(a.a));
                    } else {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(invoke.c);
                        linkedHashMap2.remove(Integer.valueOf(i5));
                        s3q0 s3q0Var = s3q0.a;
                        izsVar4.invoke(gob0.a(invoke, null, null, new bpw(linkedHashMap2), 3));
                    }
                }
                break;
            case 21:
                com.vk.im.popup.b bVar = (com.vk.im.popup.b) this.c;
                izs izsVar5 = (izs) this.d;
                Object obj3 = ((brj0) obj).o;
                lwb0 lwb0Var = obj3 instanceof lwb0 ? (lwb0) obj3 : null;
                if (lwb0Var == null) {
                    break;
                } else {
                    if (lwb0Var.i) {
                        bVar.dismiss();
                    }
                    T t = lwb0Var.f;
                    if (t != 0) {
                        izsVar5.invoke(t);
                    }
                    break;
                }
            case 22:
                psd0 psd0Var = (psd0) this.c;
                ProductCarousel productCarousel = (ProductCarousel) this.d;
                MarketGetRecommendsResponseDto marketGetRecommendsResponseDto = (MarketGetRecommendsResponseDto) obj;
                dqu dquVar = psd0Var.c;
                List<GroupsGroupFullDto> e = marketGetRecommendsResponseDto.e();
                dquVar.getClass();
                LinkedHashMap b2 = dqu.b(e);
                productCarousel.e = false;
                MarketBlockDataDto d = marketGetRecommendsResponseDto.d();
                String d2 = d != null ? d.d() : null;
                if (d2 != null) {
                    productCarousel.q = d2;
                }
                String e2 = d != null ? d.e() : null;
                if (e2 != null) {
                    productCarousel.r = e2;
                }
                String f = d != null ? d.f() : null;
                if (f != null) {
                    productCarousel.s = f;
                }
                List<MarketMarketItemDto> f2 = marketGetRecommendsResponseDto.f();
                ArrayList arrayList5 = new ArrayList(c5g.u(f2, 10));
                for (MarketMarketItemDto marketMarketItemDto : f2) {
                    int id = marketMarketItemDto.getId();
                    String title = marketMarketItemDto.getTitle();
                    Boolean w0 = marketMarketItemDto.w0();
                    boolean booleanValue = w0 != null ? w0.booleanValue() : i2;
                    MarketPriceDto F = marketMarketItemDto.F();
                    long l2 = cqm0.l(F.d());
                    long l3 = cqm0.l(F.k());
                    MarketCurrencyDto e3 = F.e();
                    Currency currency = new Currency(e3.getId(), e3.d(), e3.getTitle());
                    String n = F.n();
                    String l4 = F.l();
                    Integer f3 = F.f();
                    Price price2 = new Price(l2, l3, currency, n, l4, f3 != null ? f3.intValue() : 0, "", "", null, 256, null);
                    List<BaseImageDto> W = marketMarketItemDto.W();
                    if (W != null) {
                        List<BaseImageDto> list2 = W;
                        ArrayList arrayList6 = new ArrayList(c5g.u(list2, 10));
                        for (BaseImageDto baseImageDto : list2) {
                            arrayList6.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
                        }
                        price = price2;
                        photo = new Photo(new Image(arrayList6));
                    } else {
                        price = price2;
                        photo = null;
                    }
                    String url = marketMarketItemDto.getUrl();
                    UserId q = marketMarketItemDto.q();
                    boolean z = productCarousel.w;
                    String str3 = productCarousel.l;
                    ProductCarousel.Type type = productCarousel.x;
                    Group group = (Group) b2.get(fkq0.e(marketMarketItemDto.q()));
                    String str4 = group != null ? group.d : null;
                    Group group2 = (Group) b2.get(fkq0.e(marketMarketItemDto.q()));
                    arrayList5.add(new ProductCarouselItem(id, title, booleanValue, price, photo, null, null, null, url, q, null, z, str3, type, str4, group2 != null ? group2.g : null, null, 65536, null));
                    i2 = 0;
                }
                productCarousel.o = arrayList5;
                break;
            case 23:
                ((a5e0) this.c).b.g((hyg0) obj, (List) this.d);
                break;
            case 24:
                break;
            case 25:
                hqj hqjVar = (hqj) this.c;
                qh50 qh50Var = (qh50) this.d;
                hqjVar.v(obj);
                if (qh50Var != null) {
                    qh50Var.e(obj);
                }
                break;
            case 26:
                s6n0 s6n0Var = (s6n0) this.c;
                String str5 = (String) this.d;
                List<StickersDictionaryItemLight> list3 = (List) obj;
                s6n0Var.getClass();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (StickersDictionaryItemLight stickersDictionaryItemLight : list3) {
                    if (stickersDictionaryItemLight != null) {
                        Iterator<String> it = stickersDictionaryItemLight.Ab().iterator();
                        while (it.hasNext()) {
                            linkedHashMap3.put(it.next(), stickersDictionaryItemLight);
                        }
                    }
                }
                s6n0Var.g = linkedHashMap3;
                p6n0 p6n0Var = s6n0Var.b;
                p6n0Var.getClass();
                new io.reactivex.rxjava3.internal.operators.single.v(new o6n0(new xy0(24, p6n0Var, list3), i2)).q(asu0.a.c()).subscribe();
                HashMap<UserId, kbl0> hashMap = kbl0.b;
                Preference.H(kbl0.a.b().a, "suggestions_version_hash", str5);
                s6n0Var.d.set(false);
                break;
            case 27:
                ((n9m0) this.c).invoke((VmojiProductModel) this.d);
                break;
            case 28:
                zhw0 zhw0Var = (zhw0) this.c;
                String str6 = (String) this.d;
                Throwable th2 = (Throwable) obj;
                L.i(th2);
                zhw0Var.T(new hiw0(str6, th2));
                break;
            default:
                ((gvw0) this.c).g = false;
                ((w9l0) this.d).invoke((Intent) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ yu1(String str, NewsEntriesContainer newsEntriesContainer) {
        this.b = 7;
        this.d = str;
        this.c = newsEntriesContainer;
    }

    public /* synthetic */ yu1(kw70 kw70Var, bgk0 bgk0Var, ur4 ur4Var) {
        this.b = 17;
        this.c = bgk0Var;
        this.d = ur4Var;
    }
}
