package xsna;

import android.content.Context;
import android.os.Parcel;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.database.dto.DatabaseCityDto;
import com.vk.api.generated.database.dto.DatabaseGetCitiesResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsTabContentServicesDto;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.market.dto.MarketServicesViewTypeDto;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorSelectorUserItem;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsException;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.friends.recommendations.impl.presentation.FriendsRecommendationsFragment;
import com.vk.im.engine.models.attaches.MediaType;
import com.vk.log.L;
import com.vk.search.params.api.City;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.AlbumChooseState;
import com.vk.voip.ui.sessionrooms.dialog.model.SessionRoomParticipantModel;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.l1j;
import xsna.rzn;
import xsna.tlo0;
import xsna.ush;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class qm implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ qm(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0303, code lost:
    
        if (r13 == false) goto L136;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x030e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02e8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List<com.vk.dto.common.data.CallProducerButton>] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        List<MarketMarketItemDto> e;
        ?? r10;
        ?? r12;
        boolean z;
        List list;
        List D0;
        String str;
        String str2;
        switch (this.b) {
            case 0:
                return s3q0.a;
            case 1:
                return AlbumChooseState.a((AlbumChooseState) obj, null, null, 0, true, false, false, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            case 2:
                qgi0.c((tgi0) obj);
                return s3q0.a;
            case 3:
                qgi0.r((tgi0) obj, "cart_top_bar_back");
                return s3q0.a;
            case 4:
                return ((MediaType) obj).h();
            case 5:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 6:
                return j5g.O0(((scf0) obj).b.c.values());
            case 7:
                qgi0.r((tgi0) obj, "CHAT_SETTINGS_TOP_BAR_TITLE_TAG");
                return s3q0.a;
            case 8:
                qi90 qi90Var = (qi90) ((npp0) obj);
                qi90Var.q = false;
                itl.f(qi90Var).R();
                return Boolean.FALSE;
            case 9:
                DatabaseGetCitiesResponseDto databaseGetCitiesResponseDto = (DatabaseGetCitiesResponseDto) obj;
                int count = databaseGetCitiesResponseDto.getCount();
                List<DatabaseCityDto> d = databaseGetCitiesResponseDto.d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                for (DatabaseCityDto databaseCityDto : d) {
                    arrayList2.add(new City(databaseCityDto.getId(), databaseCityDto.getTitle(), databaseCityDto.f(), databaseCityDto.d()));
                }
                return new jwk(count, arrayList2);
            case 10:
                ClipsCoauthorsSelectorMviState.a aVar = (ClipsCoauthorsSelectorMviState.a) obj;
                Set<ClipsCoauthorSelectorUserItem> set = aVar.c;
                return aVar.f instanceof ClipsCoauthorsException.CoauthorsNetworkException ? new w0h0(false, Integer.valueOf(set.size())) : fnd.d(set, aVar.e);
            case 11:
                L.i((Throwable) obj);
                return s3q0.a;
            case 12:
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = (GroupsGetContentForTabsResponseDto) obj;
                GroupsTabContentServicesDto B = groupsGetContentForTabsResponseDto.B();
                if (B == null || (e = B.e()) == null) {
                    arrayList = null;
                } else {
                    List<MarketMarketItemDto> list2 = e;
                    arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        Good c = b210.c((MarketMarketItemDto) it.next());
                        Parcel obtain = Parcel.obtain();
                        try {
                            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
                            Serializer.g gVar = new Serializer.g(obtain);
                            gVar.i0(c);
                            obtain.setDataPosition(0);
                            Serializer.StreamParcelable G = gVar.G(Good.class.getClassLoader());
                            obtain.recycle();
                            Good good = (Good) G;
                            List<CallProducerButton> list3 = good.n0;
                            if (list3 != null) {
                                r10 = new ArrayList();
                                for (Object obj2 : list3) {
                                    CallProducerButton callProducerButton = (CallProducerButton) obj2;
                                    if (callProducerButton.b == 2) {
                                        Boolean bool = callProducerButton.f;
                                        if (bool != null) {
                                            z = bool.booleanValue();
                                            break;
                                        } else {
                                            z = false;
                                            break;
                                        }
                                    }
                                    if (callProducerButton.b == 2) {
                                        r12 = false;
                                        if (r12 == false) {
                                            r10.add(obj2);
                                        }
                                    }
                                    r12 = true;
                                    if (r12 == false) {
                                    }
                                }
                            } else {
                                r10 = EmptyList.b;
                            }
                            good.n0 = r10;
                            arrayList.add(new p9h(good));
                        } catch (Throwable th) {
                            obtain.recycle();
                            throw th;
                        }
                    }
                }
                GroupsTabContentServicesDto B2 = groupsGetContentForTabsResponseDto.B();
                boolean i9 = B2 != null ? B2.i9() : false;
                GroupsTabContentServicesDto B3 = groupsGetContentForTabsResponseDto.B();
                String f = B3 != null ? B3.f() : null;
                GroupsTabContentServicesDto B4 = groupsGetContentForTabsResponseDto.B();
                return new ush.a(f, arrayList, i9, (B4 != null ? B4.g() : null) == MarketServicesViewTypeDto.ROWS);
            case 13:
                return s3q0.a;
            case 14:
                l1j.f fVar = (l1j.f) obj;
                String str3 = fVar.f;
                l1j.e eVar = fVar.g;
                LinkedHashSet linkedHashSet = eVar.b;
                Set<ParticipantId> set2 = eVar.e;
                Set<ParticipantId> set3 = set2;
                Set g = izi0.g(linkedHashSet, set3);
                Set<ParticipantId> set4 = eVar.d;
                Set<ParticipantId> set5 = set4;
                LinkedHashSet j = izi0.j(g, set5);
                LinkedHashSet j2 = izi0.j(izi0.g(eVar.c, set5), set3);
                LinkedHashMap linkedHashMap = eVar.a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (j.contains((ParticipantId) entry.getKey())) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Collection values = linkedHashMap2.values();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = values.iterator();
                while (true) {
                    String str4 = "";
                    if (!it2.hasNext()) {
                        List D02 = j5g.D0(new qaa(r6 ? 1 : 0), arrayList3);
                        SessionRoomId.Room room = fVar.b;
                        boolean z2 = fVar.d;
                        if (z2) {
                            list = D02;
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj3 : D02) {
                                if (!((SessionRoomParticipantModel) obj3).d) {
                                    arrayList4.add(obj3);
                                }
                            }
                            list = arrayList4;
                        }
                        if (fVar.d) {
                            D0 = EmptyList.b;
                        } else {
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                if (j2.contains((ParticipantId) entry2.getKey())) {
                                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                                }
                            }
                            Collection values2 = linkedHashMap3.values();
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj4 : values2) {
                                SessionRoomParticipantModel sessionRoomParticipantModel = (SessionRoomParticipantModel) obj4;
                                if (str3.length() != 0) {
                                    wk90 wk90Var = sessionRoomParticipantModel.g;
                                    if (wk90Var == null || (str = wk90Var.b) == null) {
                                        str = "";
                                    }
                                    if (drm0.D(cqm0.m(str), str3, false)) {
                                    }
                                }
                                arrayList5.add(obj4);
                            }
                            D0 = j5g.D0(new raa(r6 ? 1 : 0), arrayList5);
                        }
                        return new pvi0(room, z2, list, D0, (set2.isEmpty() && set4.isEmpty()) ? false : true);
                    }
                    Object next = it2.next();
                    SessionRoomParticipantModel sessionRoomParticipantModel2 = (SessionRoomParticipantModel) next;
                    if (str3.length() != 0) {
                        wk90 wk90Var2 = sessionRoomParticipantModel2.g;
                        if (wk90Var2 != null && (str2 = wk90Var2.b) != null) {
                            str4 = str2;
                        }
                        if (drm0.D(cqm0.m(str4), str3, false)) {
                        }
                    }
                    arrayList3.add(next);
                }
                break;
            case 15:
                return ((c9k) obj).p;
            case 16:
                return Boolean.valueOf(((List) obj).size() == 2);
            case 17:
                return Boolean.valueOf(!((Set) obj).isEmpty());
            case 18:
                rzn rznVar = new rzn((Context) obj);
                rznVar.setRightContent(new rzn.a.C3643a("Немного текста"));
                tlo0.Companion.getClass();
                rznVar.setText(new tlo0.h("Много текста вообще жестб Много текста вообще жестб Много текста вообще жестб"));
                return rznVar;
            case 19:
                com.vk.photos.ui.editalbum.domain.c.i = null;
                return s3q0.a;
            case 20:
                ((etv0) obj).b(false);
                return s3q0.a;
            case 21:
                Context context = (Context) obj;
                qmu0 qmu0Var = new qmu0(context);
                qmu0Var.b(new omu0(oq.d(tlo0.Companion, "Поддержать автора")));
                qmu0Var.c(new pmu0(new tlo0.h("100 ₽/мес"), new pr6(13), R.attr.vk_ui_background_content_inverse, R.attr.vk_ui_text_contrast_themed, false));
                qmu0Var.setBackgroundColor(e3m.f(R.attr.vk_ui_background_secondary, context));
                return qmu0Var;
            case 22:
                return ayr.a((ayr) obj, null, false, false, null, null, null, null, null, null, null, false, 15359);
            case 23:
                return new zz80((ViewGroup) obj);
            case 24:
                int i = FriendsRecommendationsFragment.b0;
                L.i((Throwable) obj);
                return s3q0.a;
            case 25:
                return Float.valueOf((((Boolean) obj).booleanValue() ? 255 : 102) / 255.0f);
            case 26:
                if (obj instanceof ApiApplication) {
                    return (ApiApplication) obj;
                }
                return null;
            case 27:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 28:
                return xwk.d().a().m((CharSequence) obj);
            default:
                b5w b5wVar = (b5w) obj;
                StringBuilder sb = new StringBuilder("(");
                sb.append(b5wVar.b.name());
                sb.append('_');
                return vu5.a(')', b5wVar.a, sb);
        }
    }

    public /* synthetic */ qm(Object obj, int i) {
        this.b = i;
    }
}
