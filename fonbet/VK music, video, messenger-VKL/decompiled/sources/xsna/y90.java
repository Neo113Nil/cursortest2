package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.market.dto.MarketGetCartExtendedResponseDto;
import com.vk.api.generated.market.dto.MarketItemPropertyValueDto;
import com.vk.api.generated.market.dto.MarketMarketItemAvailabilityDto;
import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.api.generated.market.dto.MarketMarketItemRatingDto;
import com.vk.api.generated.market.dto.MarketPriceDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.clips.sdk.shared.api.nps.api.condition.SdkExternalNpsCondition;
import com.vk.dto.common.Image;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Playlist;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.sharing.api.dto.Target;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.a03;
import xsna.cce;
import xsna.epe;
import xsna.qdd;
import xsna.r2j;
import xsna.ugf;
import xsna.ybe;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class y90 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ y90(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.ArrayList] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Image image;
        ArrayList arrayList;
        Iterator it;
        ?? r2;
        Iterator it2;
        ArrayList arrayList2;
        int i = 10;
        int i2 = 0;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                j7j0 j7j0Var = (j7j0) obj;
                sl2 sl2Var = sl2.a;
                ArrayList arrayList3 = j7j0Var.a;
                ProfilesSimpleInfo Ob = j7j0Var.b.Ob();
                sl2Var.getClass();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (((Dialog) obj2).Gb()) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    Dialog dialog = (Dialog) it3.next();
                    hdm hdmVar = sl2.d;
                    if (hdmVar == null) {
                        hdmVar = null;
                    }
                    arrayList5.add(hdmVar.a(dialog, Ob));
                }
                CopyOnWriteArrayList<Target> copyOnWriteArrayList = sl2.l;
                copyOnWriteArrayList.clear();
                copyOnWriteArrayList.addAll(arrayList5);
                List g = sl2.g();
                ArrayList arrayList6 = new ArrayList();
                Iterator it4 = g.iterator();
                while (it4.hasNext()) {
                    String str = ((Target) it4.next()).f;
                    if (str != null) {
                        arrayList6.add(str);
                    }
                }
                return j5g.R(arrayList6);
            case 2:
                ((Boolean) obj).booleanValue();
                return s3q0.a;
            case 3:
                return s3q0.a;
            case 4:
                int i3 = BroadcastConfigFragment.U;
                return Boolean.valueOf(((it80) obj).a != null);
            case 5:
                qgi0.r((tgi0) obj, "CatalogBanner");
                return s3q0.a;
            case 6:
                Playlist playlist = (Playlist) obj;
                HashSet hashSet = new HashSet();
                List<Artist> list = playlist.r;
                if (list != null) {
                    hashSet.addAll(list);
                }
                List<Artist> list2 = playlist.s;
                if (list2 != null) {
                    hashSet.addAll(list2);
                }
                ArrayList arrayList7 = new ArrayList();
                Iterator it5 = hashSet.iterator();
                while (it5.hasNext()) {
                    String str2 = ((Artist) it5.next()).c;
                    if (str2 != null) {
                        arrayList7.add(str2);
                    }
                }
                return p4g.k(arrayList7, "", null);
            case 7:
                ((ikv0) obj).a();
                itg0.m(rsg0.y0(yfb.x(new tfx("account.subscribeAdsAcceptance", new com.vk.movika.sdk.android.defaultplayer.view.a(r3 ? 1 : 0), new er(0))), null, null, 3));
                return s3q0.a;
            case 8:
                ListBuilder e = e43.e();
                Iterator it6 = ((MarketGetCartExtendedResponseDto) obj).d().iterator();
                while (it6.hasNext()) {
                    MarketMarketItemFullDto marketMarketItemFullDto = (MarketMarketItemFullDto) it6.next();
                    if (marketMarketItemFullDto.f() != MarketMarketItemAvailabilityDto.AVAILABLE) {
                        it = it6;
                    } else {
                        long id = marketMarketItemFullDto.getId();
                        String title = marketMarketItemFullDto.getTitle();
                        String description = marketMarketItemFullDto.getDescription();
                        MarketPriceDto a0 = marketMarketItemFullDto.a0();
                        Integer f = a0.f();
                        k6d0 k6d0Var = new k6d0(f != null ? f.intValue() : i2, a0.l(), a0.n());
                        Integer l = marketMarketItemFullDto.l();
                        int intValue = l != null ? l.intValue() : i2;
                        List<BaseImageDto> K0 = marketMarketItemFullDto.K0();
                        if (K0 != null) {
                            new ne6();
                            image = ne6.a(K0);
                        } else {
                            image = null;
                        }
                        List<PhotosPhotoDto> Z = marketMarketItemFullDto.Z();
                        if (Z != null) {
                            List<PhotosPhotoDto> list3 = Z;
                            arrayList = new ArrayList(c5g.u(list3, i));
                            Iterator it7 = list3.iterator();
                            while (it7.hasNext()) {
                                List<PhotosPhotoSizesDto> R = ((PhotosPhotoDto) it7.next()).R();
                                if (R != null) {
                                    List<PhotosPhotoSizesDto> list4 = R;
                                    it2 = it6;
                                    arrayList2 = new ArrayList(c5g.u(list4, i));
                                    Iterator it8 = list4.iterator();
                                    while (it8.hasNext()) {
                                        arrayList2.add(new vfa0().a((PhotosPhotoSizesDto) it8.next()));
                                    }
                                } else {
                                    it2 = it6;
                                    arrayList2 = null;
                                }
                                arrayList.add(new Image(arrayList2));
                                it6 = it2;
                                i = 10;
                            }
                        } else {
                            arrayList = null;
                        }
                        it = it6;
                        List list5 = arrayList;
                        if (arrayList == null) {
                            list5 = EmptyList.b;
                        }
                        fpd0 fpd0Var = new fpd0(image, list5);
                        List<MarketItemPropertyValueDto> l0 = marketMarketItemFullDto.l0();
                        if (l0 != null) {
                            List<MarketItemPropertyValueDto> list6 = l0;
                            r2 = new ArrayList(c5g.u(list6, 10));
                            for (MarketItemPropertyValueDto marketItemPropertyValueDto : list6) {
                                r2.add(new jrd0(marketItemPropertyValueDto.f(), marketItemPropertyValueDto.g()));
                            }
                        } else {
                            r2 = 0;
                        }
                        if (r2 == 0) {
                            r2 = EmptyList.b;
                        }
                        List list7 = r2;
                        MarketMarketItemRatingDto F = marketMarketItemFullDto.F();
                        Float valueOf = Float.valueOf(F != null ? F.d() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        MarketMarketItemRatingDto F2 = marketMarketItemFullDto.F();
                        e.add(new xw80(id, title, description, k6d0Var, intValue, fpd0Var, list7, valueOf, F2 != null ? F2.e() : 0));
                    }
                    it6 = it;
                    i = 10;
                    i2 = 0;
                }
                return e.g();
            case 9:
                SdkExternalNpsCondition sdkExternalNpsCondition = (SdkExternalNpsCondition) obj;
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{"CLIPS_NPS", "poll is ready; " + sdkExternalNpsCondition});
                }
                return s3q0.a;
            case 10:
                return Boolean.valueOf(((qdd.c) obj) instanceof qdd.c.C3559c);
            case 11:
                pao paoVar = (pao) obj;
                return io.reactivex.rxjava3.core.x.k(new gny(paoVar.a, paoVar.b, paoVar.c, paoVar.d));
            case 12:
                ybe.a aVar = (ybe.a) obj;
                return new cce.b(aVar.g, aVar.h, aVar.i, aVar.e, aVar.f);
            case 13:
                dpe dpeVar = (dpe) obj;
                doe doeVar = dpeVar.c;
                doe doeVar2 = (doeVar == null || !dpeVar.b) ? null : doeVar;
                return new epe.a.C2831a(doeVar2, doeVar2 != null && dpeVar.a);
            case 14:
                iui iuiVar = (iui) obj;
                final e64 a = iuiVar.a(new mdf());
                final e64 a2 = iuiVar.a(new bif());
                final e64 a3 = iuiVar.a(new zff());
                final e64 a4 = iuiVar.a(new cif());
                final e64 a5 = iuiVar.a(new qgf());
                final e64 a6 = iuiVar.a(new sdf());
                final e64 a7 = iuiVar.a(new dif());
                final e64 a8 = iuiVar.a(new qkf());
                final e64 a9 = iuiVar.a(new zud());
                iuiVar.a = new wzs() { // from class: xsna.kjf
                    @Override // xsna.wzs
                    public final Object invoke(Object obj3, Object obj4) {
                        em50 em50Var = (em50) obj3;
                        ugf ugfVar = (ugf) obj4;
                        if (ugfVar instanceof ugf.f) {
                            return em50Var.b(ugfVar, e64.this);
                        }
                        if (ugfVar instanceof ugf.a) {
                            return em50Var.a(a, ugfVar);
                        }
                        if (ugfVar instanceof ugf.d) {
                            return em50Var.a(a3, ugfVar);
                        }
                        if (ugfVar instanceof ugf.g) {
                            return em50Var.a(a4, ugfVar);
                        }
                        if (ugfVar instanceof ugf.e) {
                            return em50Var.a(a5, ugfVar);
                        }
                        if (ugfVar instanceof ugf.b) {
                            return em50Var.a(a6, ugfVar);
                        }
                        if (ugfVar instanceof ugf.h) {
                            return em50Var.a(a7, ugfVar);
                        }
                        if (ugfVar instanceof ugf.i) {
                            return em50Var.a(a8, ugfVar);
                        }
                        if (ugfVar instanceof ugf.c) {
                            return em50Var.a(a9, ugfVar);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                };
                return s3q0.a;
            case 15:
                return Integer.valueOf(an10.b(sa30.E(((Float) obj).floatValue(), new k9x(0, 1, 1), new k9x(0, 100, 1))));
            case 16:
                cvk.u(R.string.common_network_error, false);
                return s3q0.a;
            case 17:
                return Boolean.valueOf(((vwh) obj).e);
            case 18:
                return s3q0.a;
            case 19:
                return r2j.a.a;
            case 20:
                x8j x8jVar = (x8j) obj;
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return new rbj(x8jVar.c, x8jVar.a, SortOrder.BY_NAME, x8jVar.d, false, null, 384);
            case 21:
                a03 a03Var = (a03) obj;
                if (a03Var instanceof a03.b) {
                    return ((a03.b) a03Var).a;
                }
                if (a03Var instanceof a03.a) {
                    return ((a03.a) a03Var).a;
                }
                throw new NoWhenBranchMatchedException();
            case 22:
                return s3q0.a;
            case 23:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return ((Context) obj).getString(R.string.vkim_clear_history);
            case 24:
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                ChatSettings chatSettings = bVar.z;
                return com.vk.im.engine.models.dialogs.b.a(bVar, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, chatSettings != null ? ChatSettings.zb(chatSettings, null, null, null, 0, false, -262145) : null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -16777217, 2097151);
            case 25:
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                return ((d6n) obj).b.c;
            case 26:
                qgi0.r((tgi0) obj, "mvi_downloaded_header_test_tag");
                return s3q0.a;
            case 27:
                float f2 = jlo.a;
                return Boolean.TRUE;
            case 28:
                ((vgg) obj).c();
                return s3q0.a;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    cvk.u(R.string.error, false);
                }
                return s3q0.a;
        }
    }
}
