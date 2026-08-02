package xsna;

import android.app.Activity;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.marketIntegrations.dto.MarketIntegrationsInfoBlockDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.GoodAlbum;
import com.vk.dto.group.GroupContentTabSetting;
import com.vk.dto.group.GroupContentTabType;
import com.vk.dto.market.GoodBadge;
import com.vk.im.design.view.chat_profile.ChatProfileActionsView;
import com.vk.profile.community.impl.ui.profile.state.MarketInfoBlockModel;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.toggle.features.SoccomFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bex0;
import xsna.fih;
import xsna.utj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class kwb implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kwb(fih fihVar, ExtendedCommunityProfile extendedCommunityProfile, p8u p8uVar, boolean z) {
        this.d = fihVar;
        this.e = extendedCommunityProfile;
        this.f = p8uVar;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x022f  */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        MarketInfoBlockModel marketInfoBlockModel;
        boolean z3;
        List<GoodAlbum> list;
        List<GoodAlbum> list2;
        boolean z4;
        String str;
        List<BaseImageDto> list3;
        String str2;
        Integer num;
        Integer num2;
        gvv0 view;
        int i = this.b;
        Object obj2 = this.f;
        boolean z5 = this.c;
        Object obj3 = this.e;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ChatProfileActionsView chatProfileActionsView = (ChatProfileActionsView) obj4;
                List list4 = (List) obj3;
                xub xubVar = (xub) obj2;
                if (z5) {
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
            case 1:
                fih fihVar = (fih) obj4;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj3;
                p8u p8uVar = (p8u) obj2;
                fih.b bVar = (fih.b) obj;
                fih.a aVar3 = bVar.c;
                String str3 = aVar3 != null ? aVar3.b : null;
                List list5 = bVar.a;
                if (list5 == null) {
                    list5 = EmptyList.b;
                }
                List list6 = aVar3 != null ? aVar3.a : null;
                if (list6 == null) {
                    list6 = EmptyList.b;
                }
                if (z5 && list5.isEmpty() && list6.isEmpty()) {
                    fihVar.q(p8u.i(p8uVar, null, null, null, false, false, bVar.d, null, null, null, CommunityProfileContentItem.State.EMPTY, null, null, 57215));
                } else {
                    Collection collection = p8uVar.k;
                    if (collection == null) {
                        collection = EmptyList.b;
                    }
                    ArrayList u0 = j5g.u0(ur00.a(list5), collection);
                    a9u a9uVar = p8uVar.j;
                    Collection collection2 = a9uVar != null ? a9uVar.a : null;
                    if (collection2 == null) {
                        collection2 = EmptyList.b;
                    }
                    ArrayList u02 = j5g.u0(list6, collection2);
                    boolean z6 = z5 ? bVar.b > list5.size() : p8uVar.p;
                    boolean f = epx.f(extendedCommunityProfile != null ? Boolean.valueOf(extendedCommunityProfile.q2) : null, Boolean.TRUE);
                    ExtendedUserProfile.b bVar2 = extendedCommunityProfile != null ? extendedCommunityProfile.R : null;
                    a9u a9uVar2 = new a9u(u02);
                    boolean z7 = myc0.f(str3) && !list6.isEmpty();
                    CommunityProfileContentItem.State state = z5 ? CommunityProfileContentItem.State.LOADED : p8uVar.w;
                    CommunityProfileContentItem.State state2 = z5 ? p8uVar.x : CommunityProfileContentItem.State.LOADED;
                    String str4 = z5 ? bVar.d : p8uVar.q;
                    fih.a aVar4 = bVar.c;
                    MarketIntegrationsInfoBlockDto marketIntegrationsInfoBlockDto = aVar4 != null ? aVar4.c : null;
                    if (marketIntegrationsInfoBlockDto != null) {
                        SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
                        soccomFeatures.getClass();
                        boolean a = com.vk.toggle.b.A.a(soccomFeatures);
                        List<BaseImageDto> e = marketIntegrationsInfoBlockDto.e();
                        MarketInfoBlockModel.SubType.a aVar5 = MarketInfoBlockModel.SubType.Companion;
                        MarketIntegrationsInfoBlockDto.SubtypeDto f2 = marketIntegrationsInfoBlockDto.f();
                        String i2 = f2 != null ? f2.i() : null;
                        aVar5.getClass();
                        MarketInfoBlockModel.SubType a2 = MarketInfoBlockModel.SubType.a.a(i2);
                        String g = marketIntegrationsInfoBlockDto.g();
                        MarketIntegrationsInfoBlockDto marketIntegrationsInfoBlockDto2 = marketIntegrationsInfoBlockDto;
                        if (e != null) {
                            Serializer.c<GoodBadge> cVar = GoodBadge.CREATOR;
                            z4 = a;
                            str = GoodBadge.a.c(e);
                        } else {
                            z4 = a;
                            str = null;
                        }
                        if (e != null) {
                            Serializer.c<GoodBadge> cVar2 = GoodBadge.CREATOR;
                            list3 = e;
                            str2 = GoodBadge.a.a(e);
                        } else {
                            list3 = e;
                            str2 = null;
                        }
                        if (list3 != null) {
                            Serializer.c<GoodBadge> cVar3 = GoodBadge.CREATOR;
                            z = z7;
                            num = GoodBadge.a.d(list3);
                        } else {
                            z = z7;
                            num = null;
                        }
                        if (list3 != null) {
                            Serializer.c<GoodBadge> cVar4 = GoodBadge.CREATOR;
                            z2 = z5;
                            num2 = GoodBadge.a.b(list3);
                        } else {
                            z2 = z5;
                            num2 = null;
                        }
                        dly dlyVar = new dly(str, str2, num, num2);
                        if (!z4) {
                            dlyVar = null;
                        }
                        marketInfoBlockModel = new MarketInfoBlockModel(a2, g, dlyVar, marketIntegrationsInfoBlockDto2.d());
                    } else {
                        z = z7;
                        z2 = z5;
                        marketInfoBlockModel = null;
                    }
                    GroupContentTabSetting groupContentTabSetting = new GroupContentTabSetting(GroupContentTabType.MARKET, null, p8uVar.m, p8uVar.n, null, null, null, false, 242, null);
                    boolean z8 = p8uVar.m;
                    Integer valueOf = extendedCommunityProfile != null ? Integer.valueOf(extendedCommunityProfile.r2) : null;
                    if (f) {
                        if ((extendedCommunityProfile != null ? extendedCommunityProfile.r2 : 0) > 0 && !z8) {
                            z3 = true;
                            if (!z3) {
                                valueOf = null;
                            }
                            CommunityProfileContentItem.d r = fihVar.r(groupContentTabSetting, f, valueOf);
                            String str5 = bVar2 == null ? bVar2.a : null;
                            String str6 = bVar2 == null ? bVar2.b : null;
                            String str7 = bVar2 == null ? bVar2.c : null;
                            p8u i3 = p8u.i(p8uVar, a9uVar2, u0, null, z, z6, str4, marketInfoBlockModel, (str5 != null || str6 == null || str7 == null) ? null : new e11(str5, str6, str7), str3, state, state2, r, 6172);
                            if (!z2) {
                                CommunityProfileContentItem.ContentType contentType = i3.l;
                                List<GoodAlbum> list7 = i3.k;
                                a9u a9uVar3 = i3.j;
                                if (contentType.l()) {
                                    ArrayList arrayList = a9uVar3 != null ? a9uVar3.a : null;
                                    if (arrayList == null || arrayList.isEmpty()) {
                                        i3 = p8u.i(i3, null, null, CommunityProfileContentItem.ContentType.ALBUMS, false, false, null, null, null, null, null, null, null, 65531);
                                    }
                                }
                                if (contentType.l() && ((list2 = list7) == null || list2.isEmpty())) {
                                    i3 = p8u.i(i3, null, null, CommunityProfileContentItem.ContentType.ITEMS, false, false, null, null, null, null, null, null, null, 65531);
                                } else {
                                    if (contentType.h()) {
                                        ArrayList arrayList2 = a9uVar3 != null ? a9uVar3.a : null;
                                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                                            i3 = p8u.i(i3, null, null, CommunityProfileContentItem.ContentType.MIXED, false, false, null, null, null, null, null, null, null, 65531);
                                        }
                                    }
                                    i3 = (!contentType.j() || (list = list7) == null || list.isEmpty()) ? i3 : p8u.i(i3, null, null, CommunityProfileContentItem.ContentType.MIXED, false, false, null, null, null, null, null, null, null, 65531);
                                }
                            }
                            fihVar.q(i3);
                        }
                    }
                    z3 = false;
                    if (!z3) {
                    }
                    CommunityProfileContentItem.d r2 = fihVar.r(groupContentTabSetting, f, valueOf);
                    if (bVar2 == null) {
                    }
                    if (bVar2 == null) {
                    }
                    if (bVar2 == null) {
                    }
                    p8u i32 = p8u.i(p8uVar, a9uVar2, u0, null, z, z6, str4, marketInfoBlockModel, (str5 != null || str6 == null || str7 == null) ? null : new e11(str5, str6, str7), str3, state, state2, r2, 6172);
                    if (!z2) {
                    }
                    fihVar.q(i32);
                }
                break;
            default:
                w2y w2yVar = (w2y) obj4;
                Activity activity = (Activity) obj2;
                bex0.a.b(w2yVar.a, JsApiMethodType.ADD_MINI_APP_SNIPPET_TO_CHAT, com.vk.movika.sdk.android.defaultplayer.interactive.c.b("result", true), null, 12);
                ((ifu0) obj3).dismiss();
                if (z5) {
                    fvv0 fvv0Var = w2yVar.b;
                    if (fvv0Var != null && (view = fvv0Var.getView()) != null) {
                        view.jk();
                    }
                } else {
                    fvv0 fvv0Var2 = w2yVar.b;
                    boolean z9 = fvv0Var2 != null && fvv0Var2.h();
                    utj.a aVar6 = new utj.a(activity);
                    aVar6.g(R.drawable.vk_icon_check_circle_outline_56);
                    aVar6.l = Integer.valueOf(e3m.f(R.attr.vk_ui_background_positive, activity));
                    aVar6.n = activity.getString(z9 ? R.string.vk_im_integration_close_app_snackbar_message_game : R.string.vk_im_integration_close_app_snackbar_message_service);
                    aVar6.d(R.string.vk_im_integration_close_app_snackbar_button, new tcn(w2yVar, 13));
                    aVar6.m();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ kwb(w2y w2yVar, ifu0 ifu0Var, boolean z, Activity activity) {
        this.d = w2yVar;
        this.e = ifu0Var;
        this.c = z;
        this.f = activity;
    }

    public /* synthetic */ kwb(boolean z, ChatProfileActionsView chatProfileActionsView, List list, xub xubVar) {
        this.c = z;
        this.d = chatProfileActionsView;
        this.e = list;
        this.f = xubVar;
    }
}
