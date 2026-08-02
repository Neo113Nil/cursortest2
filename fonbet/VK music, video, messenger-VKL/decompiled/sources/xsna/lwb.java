package xsna;

import com.vk.api.generated.market.dto.MarketMarketAlbumDto;
import com.vk.api.generated.market.dto.MarketServicesViewTypeDto;
import com.vk.dto.common.GoodAlbum;
import com.vk.im.design.view.chat_profile.ChatProfileActionsView;
import com.vk.profile.community.impl.ui.profile.state.Services;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.xkh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class lwb implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lwb(xkh xkhVar, ExtendedCommunityProfile extendedCommunityProfile, Services services, boolean z) {
        this.d = xkhVar;
        this.e = extendedCommunityProfile;
        this.f = services;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        MarketServicesViewTypeDto marketServicesViewTypeDto;
        Services.ViewType viewType;
        boolean z;
        e11 e11Var;
        List<GoodAlbum> list;
        List<GoodAlbum> list2;
        List<MarketMarketAlbumDto> list3;
        switch (this.b) {
            case 0:
                ChatProfileActionsView chatProfileActionsView = (ChatProfileActionsView) this.d;
                List list4 = (List) this.e;
                xub xubVar = (xub) this.f;
                if (this.c) {
                    ChatProfileActionsView.a aVar = chatProfileActionsView.t;
                    if (aVar != null) {
                        aVar.b(list4);
                    }
                } else {
                    ChatProfileActionsView.a aVar2 = chatProfileActionsView.t;
                    if (aVar2 != null) {
                        aVar2.a(xubVar);
                    }
                }
                break;
            default:
                xkh xkhVar = (xkh) this.d;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) this.e;
                Services services = (Services) this.f;
                xkh.a aVar3 = (xkh.a) obj;
                it80<xkh.b> it80Var = aVar3.b;
                it80<String> it80Var2 = aVar3.c;
                xkh.b bVar = it80Var.a;
                String str = bVar != null ? bVar.b : null;
                if (bVar == null || (marketServicesViewTypeDto = bVar.c) == null) {
                    marketServicesViewTypeDto = MarketServicesViewTypeDto.CARDS;
                }
                List<f5u> list5 = bVar != null ? bVar.a : null;
                if (list5 == null) {
                    list5 = EmptyList.b;
                }
                List<MarketMarketAlbumDto> list6 = aVar3.a.a;
                if (list6 == null) {
                    list6 = EmptyList.b;
                }
                boolean z2 = this.c;
                if (z2 && (((list3 = list6) == null || list3.isEmpty()) && list5.isEmpty())) {
                    xkhVar.q(Services.i(services, null, null, null, false, false, null, it80Var2.a, null, null, CommunityProfileContentItem.State.EMPTY, null, 57087));
                } else {
                    Collection collection = services.k;
                    if (collection == null) {
                        collection = EmptyList.b;
                    }
                    ArrayList u0 = j5g.u0(ur00.a(list6), collection);
                    osi0 osi0Var = services.j;
                    Collection collection2 = osi0Var != null ? osi0Var.a : null;
                    if (collection2 == null) {
                        collection2 = EmptyList.b;
                    }
                    ArrayList u02 = j5g.u0(list5, collection2);
                    boolean z3 = false;
                    boolean z4 = z2 ? list6.size() > 6 : services.p;
                    ExtendedUserProfile.b bVar2 = extendedCommunityProfile != null ? extendedCommunityProfile.S : null;
                    List<f5u> list7 = list5;
                    osi0 osi0Var2 = new osi0(u02);
                    List H0 = j5g.H0(u0, 6);
                    if (myc0.f(str) && !list7.isEmpty()) {
                        z3 = true;
                    }
                    CommunityProfileContentItem.State state = z2 ? CommunityProfileContentItem.State.LOADED : services.w;
                    CommunityProfileContentItem.State state2 = z2 ? services.x : CommunityProfileContentItem.State.LOADED;
                    if (z2) {
                        Services.ViewType.a aVar4 = Services.ViewType.Companion;
                        Integer valueOf = marketServicesViewTypeDto != null ? Integer.valueOf(marketServicesViewTypeDto.i()) : null;
                        aVar4.getClass();
                        viewType = (valueOf != null && valueOf.intValue() == 2) ? Services.ViewType.VIEW_TYPE_ROWS : Services.ViewType.VIEW_TYPE_CARDS;
                    } else {
                        viewType = services.q;
                    }
                    Services.ViewType viewType2 = viewType;
                    String str2 = z2 ? it80Var2.a : services.r;
                    String str3 = bVar2 != null ? bVar2.a : null;
                    String str4 = bVar2 != null ? bVar2.b : null;
                    String str5 = bVar2 != null ? bVar2.c : null;
                    if (str3 == null || str4 == null || str5 == null) {
                        z = z4;
                        e11Var = null;
                    } else {
                        z = z4;
                        e11Var = new e11(str3, str4, str5);
                    }
                    Services i = Services.i(services, osi0Var2, H0, null, z3, z, viewType2, str2, e11Var, str, state, state2, 38940);
                    if (z2) {
                        CommunityProfileContentItem.ContentType contentType = i.l;
                        List<GoodAlbum> list8 = i.k;
                        osi0 osi0Var3 = i.j;
                        if (contentType.l()) {
                            ArrayList arrayList = osi0Var3 != null ? osi0Var3.a : null;
                            if (arrayList == null || arrayList.isEmpty()) {
                                i = Services.i(i, null, null, CommunityProfileContentItem.ContentType.ALBUMS, false, false, null, null, null, null, null, null, 65531);
                            }
                        }
                        if (contentType.l() && ((list2 = list8) == null || list2.isEmpty())) {
                            i = Services.i(i, null, null, CommunityProfileContentItem.ContentType.ITEMS, false, false, null, null, null, null, null, null, 65531);
                        } else {
                            if (contentType.h()) {
                                ArrayList arrayList2 = osi0Var3 != null ? osi0Var3.a : null;
                                if (arrayList2 != null && !arrayList2.isEmpty()) {
                                    i = Services.i(i, null, null, CommunityProfileContentItem.ContentType.MIXED, false, false, null, null, null, null, null, null, 65531);
                                }
                            }
                            i = (!contentType.j() || (list = list8) == null || list.isEmpty()) ? i : Services.i(i, null, null, CommunityProfileContentItem.ContentType.MIXED, false, false, null, null, null, null, null, null, 65531);
                        }
                    }
                    xkhVar.q(i);
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lwb(boolean z, ChatProfileActionsView chatProfileActionsView, List list, xub xubVar) {
        this.c = z;
        this.d = chatProfileActionsView;
        this.e = list;
        this.f = xubVar;
    }
}
