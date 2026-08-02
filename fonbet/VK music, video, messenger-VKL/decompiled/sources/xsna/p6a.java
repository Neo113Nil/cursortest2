package xsna;

import android.content.DialogInterface;
import android.widget.ListView;
import com.vk.api.generated.catalog.dto.CatalogGetSearchGroupsScreenRefDto;
import com.vk.api.generated.catalog.dto.CatalogGetSearchGroupsSortDto;
import com.vk.api.generated.catalog.dto.CatalogGetSearchGroupsTypeDto;
import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.catalog2.common.dto.api.communities.CatalogGetSearchGroupsRequestFactory;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.notifications.NotificationItem;
import com.vk.notifications.NotificationClickHandlerImpl;
import com.vk.search.params.api.City;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.search.params.api.domain.model.SearchLocation;
import com.vk.search.params.api.domain.model.geo.Coordinate;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class p6a implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ p6a(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ee  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        CatalogGetSearchGroupsScreenRefDto catalogGetSearchGroupsScreenRefDto;
        CatalogGetSearchGroupsSortDto catalogGetSearchGroupsSortDto;
        CatalogGetSearchGroupsTypeDto catalogGetSearchGroupsTypeDto;
        Integer num;
        City city;
        VkGroupsSearchParams.CommunityType communityType;
        VkGroupsSearchParams.SortType sortType;
        int i = this.b;
        int i2 = 0;
        int i3 = 0;
        i2 = 0;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                CatalogGetSearchGroupsRequestFactory catalogGetSearchGroupsRequestFactory = (CatalogGetSearchGroupsRequestFactory) obj5;
                String str = (String) obj4;
                VkGroupsSearchParams vkGroupsSearchParams = (VkGroupsSearchParams) obj3;
                SearchRequestFactory.a aVar = (SearchRequestFactory.a) obj2;
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    catalogGetSearchGroupsRequestFactory.s = (Coordinate) optional.get();
                }
                UserId userId = catalogGetSearchGroupsRequestFactory.p;
                SearchLocation searchLocation = vkGroupsSearchParams != null ? vkGroupsSearchParams.f : null;
                SearchLocation.CurrentLocation currentLocation = searchLocation instanceof SearchLocation.CurrentLocation ? (SearchLocation.CurrentLocation) searchLocation : null;
                SearchLocation searchLocation2 = vkGroupsSearchParams != null ? vkGroupsSearchParams.f : null;
                SearchLocation.City city2 = searchLocation2 instanceof SearchLocation.City ? (SearchLocation.City) searchLocation2 : null;
                UserId userId2 = epx.f(userId, UserId.d) ? null : userId;
                wga k = catalogGetSearchGroupsRequestFactory.k();
                Iterator it = CatalogGetSearchGroupsScreenRefDto.i().iterator();
                while (true) {
                    if (it.hasNext()) {
                        catalogGetSearchGroupsScreenRefDto = it.next();
                        if (epx.f(((CatalogGetSearchGroupsScreenRefDto) catalogGetSearchGroupsScreenRefDto).j(), aVar != null ? aVar.h() : null)) {
                        }
                    } else {
                        catalogGetSearchGroupsScreenRefDto = 0;
                    }
                }
                CatalogGetSearchGroupsScreenRefDto catalogGetSearchGroupsScreenRefDto2 = catalogGetSearchGroupsScreenRefDto;
                if (vkGroupsSearchParams == null || (sortType = vkGroupsSearchParams.d) == null) {
                    catalogGetSearchGroupsSortDto = null;
                } else {
                    int i4 = CatalogGetSearchGroupsRequestFactory.a.$EnumSwitchMapping$1[sortType.ordinal()];
                    catalogGetSearchGroupsSortDto = i4 != 1 ? i4 != 2 ? i4 != 3 ? null : CatalogGetSearchGroupsSortDto.POPULARITY : CatalogGetSearchGroupsSortDto.MEMBERS : CatalogGetSearchGroupsSortDto.RELEVANT;
                }
                if (vkGroupsSearchParams == null || (communityType = vkGroupsSearchParams.c) == null) {
                    catalogGetSearchGroupsTypeDto = null;
                } else {
                    int i5 = CatalogGetSearchGroupsRequestFactory.a.$EnumSwitchMapping$0[communityType.ordinal()];
                    catalogGetSearchGroupsTypeDto = i5 != 1 ? i5 != 2 ? i5 != 3 ? null : CatalogGetSearchGroupsTypeDto.PAGE : CatalogGetSearchGroupsTypeDto.EVENT : CatalogGetSearchGroupsTypeDto.GROUP;
                }
                Float valueOf = currentLocation != null ? Float.valueOf((float) currentLocation.c.b) : null;
                Float valueOf2 = currentLocation != null ? Float.valueOf((float) currentLocation.c.c) : null;
                if (city2 != null) {
                    city = city2.b;
                } else if (vkGroupsSearchParams == null || (city = vkGroupsSearchParams.b) == null) {
                    num = null;
                    Integer p = CatalogGetSearchGroupsRequestFactory.p(vkGroupsSearchParams == null ? Boolean.valueOf(vkGroupsSearchParams.g) : null);
                    Integer p2 = CatalogGetSearchGroupsRequestFactory.p(vkGroupsSearchParams == null ? Boolean.valueOf(vkGroupsSearchParams.h) : null);
                    Integer p3 = CatalogGetSearchGroupsRequestFactory.p(vkGroupsSearchParams == null ? Boolean.valueOf(vkGroupsSearchParams.j) : null);
                    Integer p4 = CatalogGetSearchGroupsRequestFactory.p(vkGroupsSearchParams == null ? Boolean.valueOf(vkGroupsSearchParams.i) : null);
                    Integer p5 = CatalogGetSearchGroupsRequestFactory.p(vkGroupsSearchParams == null ? Boolean.valueOf(vkGroupsSearchParams.k) : null);
                    Integer p6 = CatalogGetSearchGroupsRequestFactory.p(vkGroupsSearchParams == null ? Boolean.valueOf(vkGroupsSearchParams.l) : null);
                    boolean z = catalogGetSearchGroupsRequestFactory.j;
                    String str2 = catalogGetSearchGroupsRequestFactory.q;
                    Coordinate coordinate = catalogGetSearchGroupsRequestFactory.s;
                    Float valueOf3 = coordinate == null ? Float.valueOf((float) coordinate.b) : null;
                    Coordinate coordinate2 = catalogGetSearchGroupsRequestFactory.s;
                    Float valueOf4 = coordinate2 == null ? Float.valueOf((float) coordinate2.c) : null;
                    if (catalogGetSearchGroupsRequestFactory.r && str.length() > 0) {
                        i2 = catalogGetSearchGroupsRequestFactory.h;
                    }
                    SearchRequestFactory.InputMethod inputMethod = catalogGetSearchGroupsRequestFactory.k;
                    io.reactivex.rxjava3.internal.operators.observable.j1 U = rsg0.y0(yfb.x(k.l(valueOf, valueOf2, valueOf3, valueOf4, userId2, str, catalogGetSearchGroupsSortDto, catalogGetSearchGroupsTypeDto, num, p, p2, p4, p3, p5, p6, Boolean.valueOf(z), catalogGetSearchGroupsScreenRefDto2, str2, Integer.valueOf(i2), inputMethod != SearchRequestFactory.InputMethod.Suggest ? catalogGetSearchGroupsRequestFactory.f : null, inputMethod == null ? inputMethod.h() : null)), null, null, 3).U(new p7(new q6a(1, catalogGetSearchGroupsRequestFactory.j(), e3a.class, "mapToDefaultSection", "mapToDefaultSection(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 9));
                    n20 n20Var = new n20(new jt(catalogGetSearchGroupsRequestFactory), 11);
                    a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                    a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                    return U.E(n20Var, lVar, kVar, kVar);
                }
                num = Integer.valueOf(city.b);
                Integer p7 = CatalogGetSearchGroupsRequestFactory.p(vkGroupsSearchParams == null ? Boolean.valueOf(vkGroupsSearchParams.g) : null);
                Integer p22 = CatalogGetSearchGroupsRequestFactory.p(vkGroupsSearchParams == null ? Boolean.valueOf(vkGroupsSearchParams.h) : null);
                Integer p32 = CatalogGetSearchGroupsRequestFactory.p(vkGroupsSearchParams == null ? Boolean.valueOf(vkGroupsSearchParams.j) : null);
                Integer p42 = CatalogGetSearchGroupsRequestFactory.p(vkGroupsSearchParams == null ? Boolean.valueOf(vkGroupsSearchParams.i) : null);
                Integer p52 = CatalogGetSearchGroupsRequestFactory.p(vkGroupsSearchParams == null ? Boolean.valueOf(vkGroupsSearchParams.k) : null);
                Integer p62 = CatalogGetSearchGroupsRequestFactory.p(vkGroupsSearchParams == null ? Boolean.valueOf(vkGroupsSearchParams.l) : null);
                boolean z2 = catalogGetSearchGroupsRequestFactory.j;
                String str22 = catalogGetSearchGroupsRequestFactory.q;
                Coordinate coordinate3 = catalogGetSearchGroupsRequestFactory.s;
                if (coordinate3 == null) {
                }
                Coordinate coordinate22 = catalogGetSearchGroupsRequestFactory.s;
                if (coordinate22 == null) {
                }
                if (catalogGetSearchGroupsRequestFactory.r) {
                    i2 = catalogGetSearchGroupsRequestFactory.h;
                }
                SearchRequestFactory.InputMethod inputMethod2 = catalogGetSearchGroupsRequestFactory.k;
                io.reactivex.rxjava3.internal.operators.observable.j1 U2 = rsg0.y0(yfb.x(k.l(valueOf, valueOf2, valueOf3, valueOf4, userId2, str, catalogGetSearchGroupsSortDto, catalogGetSearchGroupsTypeDto, num, p7, p22, p42, p32, p52, p62, Boolean.valueOf(z2), catalogGetSearchGroupsScreenRefDto2, str22, Integer.valueOf(i2), inputMethod2 != SearchRequestFactory.InputMethod.Suggest ? catalogGetSearchGroupsRequestFactory.f : null, inputMethod2 == null ? inputMethod2.h() : null)), null, null, 3).U(new p7(new q6a(1, catalogGetSearchGroupsRequestFactory.j(), e3a.class, "mapToDefaultSection", "mapToDefaultSection(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0), 9));
                n20 n20Var2 = new n20(new jt(catalogGetSearchGroupsRequestFactory), 11);
                a.l lVar2 = io.reactivex.rxjava3.internal.functions.a.d;
                a.k kVar2 = io.reactivex.rxjava3.internal.functions.a.c;
                return U2.E(n20Var2, lVar2, kVar2, kVar2);
            case 1:
                NotificationClickHandlerImpl.JoinType joinType = (NotificationClickHandlerImpl.JoinType) obj5;
                NotificationItem notificationItem = (NotificationItem) obj4;
                Group group = (Group) obj3;
                bj70 bj70Var = (bj70) obj2;
                Integer valueOf5 = Integer.valueOf(R.drawable.vk_icon_cancel_24);
                int i6 = dpu.a;
                o1e0.a.a(new a9l(2));
                if (joinType == NotificationClickHandlerImpl.JoinType.ACCEPT || joinType == NotificationClickHandlerImpl.JoinType.UNSURE) {
                    notificationItem.v = new NotificationItem.b(Integer.valueOf(R.drawable.vk_icon_done_24), Integer.valueOf(R.string.friend_req_accepted));
                } else if (group.p == 1) {
                    notificationItem.v = new NotificationItem.b(valueOf5, Integer.valueOf(R.string.invitation_declined));
                } else {
                    notificationItem.v = new NotificationItem.b(valueOf5, Integer.valueOf(R.string.friend_req_declined));
                }
                bj70Var.Q(notificationItem);
                return s3q0.a;
            default:
                ArrayList arrayList = (ArrayList) obj4;
                izs izsVar = (izs) obj3;
                ListView listView = (ListView) obj2;
                DialogInterface dialogInterface = (DialogInterface) ((Ref$ObjectRef) obj5).element;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj6 : arrayList) {
                    int i7 = i3 + 1;
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    if (listView.getCheckedItemPositions().get(i3)) {
                        arrayList2.add(obj6);
                    }
                    i3 = i7;
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((lwb0) it2.next()).f);
                }
                izsVar.invoke(arrayList3);
                return s3q0.a;
        }
    }
}
