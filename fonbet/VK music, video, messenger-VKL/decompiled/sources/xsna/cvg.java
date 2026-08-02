package xsna;

import android.content.Context;
import android.util.Size;
import com.vk.api.generated.groups.dto.GroupsChatDto;
import com.vk.api.generated.groups.dto.GroupsGetChatsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.api.generated.groups.dto.GroupsTabContentChatsDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.data.VKList;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.superapp.api.dto.app.GameSubscription;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.h0n0;
import xsna.ikv0;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class cvg implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ cvg(com.vk.donut.impl.a aVar, boolean z, com.vk.lists.c cVar) {
        this.b = 3;
        this.e = aVar;
        this.c = z;
        this.d = cVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        Object obj2;
        int i = this.b;
        Object obj3 = this.d;
        boolean z = this.c;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                com.vk.lists.c cVar = (com.vk.lists.c) obj3;
                dvg dvgVar = (dvg) obj4;
                GroupsGetChatsResponseDto groupsGetChatsResponseDto = (GroupsGetChatsResponseDto) obj;
                List<GroupsChatDto> d = groupsGetChatsResponseDto.d();
                ArrayList arrayList2 = new ArrayList(c5g.u(d, 10));
                Iterator<T> it = d.iterator();
                while (it.hasNext()) {
                    arrayList2.add(fai.x((GroupsChatDto) it.next()));
                }
                cVar.l(groupsGetChatsResponseDto.getCount());
                dvgVar.b.lo(new VKList<>(arrayList2), z);
                return s3q0.a;
            case 1:
                ofh ofhVar = (ofh) obj3;
                pzb pzbVar = (pzb) obj4;
                GroupsGetContentForTabsResponseDto groupsGetContentForTabsResponseDto = (GroupsGetContentForTabsResponseDto) obj;
                GroupsTabContentChatsDto f = groupsGetContentForTabsResponseDto.f();
                List<GroupsChatDto> d2 = f != null ? f.d() : null;
                if (d2 == null) {
                    d2 = EmptyList.b;
                }
                if (z && d2.isEmpty()) {
                    ofhVar.q(pzb.i(pzbVar, null, false, null, CommunityProfileContentItem.State.EMPTY, null, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE));
                } else {
                    Collection collection = pzbVar.j;
                    if (collection == null) {
                        collection = EmptyList.b;
                    }
                    Collection collection2 = collection;
                    List<GroupsChatDto> list = d2;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(fai.x((GroupsChatDto) it2.next()));
                    }
                    ArrayList u0 = j5g.u0(arrayList3, collection2);
                    GroupsTabContentChatsDto f2 = groupsGetContentForTabsResponseDto.f();
                    boolean f3 = myc0.f(f2 != null ? f2.e() : null);
                    CommunityProfileContentItem.State state = z ? CommunityProfileContentItem.State.LOADED : pzbVar.o;
                    CommunityProfileContentItem.State state2 = z ? pzbVar.q : CommunityProfileContentItem.State.LOADED;
                    GroupsTabContentChatsDto f4 = groupsGetContentForTabsResponseDto.f();
                    ofhVar.q(pzb.i(pzbVar, u0, f3, f4 != null ? f4.e() : null, state, state2, 88));
                }
                return s3q0.a;
            case 2:
                com.vk.im.ui.components.msg_list.a aVar = (com.vk.im.ui.components.msg_list.a) obj3;
                Peer peer = (Peer) obj4;
                izm0 izm0Var = aVar.X;
                Context context = aVar.k;
                izm0Var.d(peer, false);
                DisplayNameFormatter displayNameFormatter = (DisplayNameFormatter) aVar.I.getValue();
                ProfilesInfo h = aVar.O0.h();
                Peer.Type type = Peer.Type.USER;
                UserNameCase userNameCase = peer.Ab(type) ? z ? UserNameCase.GEN : UserNameCase.ACC : UserNameCase.NOM;
                qcy<Object>[] qcyVarArr = DisplayNameFormatter.d;
                DisplayNameFormatter.NameOrder nameOrder = DisplayNameFormatter.NameOrder.START_WITH_FIRSTNAME;
                displayNameFormatter.j().setLength(0);
                displayNameFormatter.h(h.Bb(peer), userNameCase, displayNameFormatter.j(), nameOrder);
                tlo0.h d3 = oq.d(tlo0.Companion, context.getString(z ? peer.Ab(type) ? R.string.vkim_unsubscribe_user_success : R.string.vkim_unsubscribe_group_success : peer.Ab(type) ? R.string.vkim_subscribe_user_success : R.string.vkim_subscribe_group_success, displayNameFormatter.j().toString()));
                ikv0.a aVar2 = new ikv0.a(context);
                aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
                aVar2.u = new ikv0.d(new ikv0.d.c(tlo0.b.a(d3, context).toString()), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                aVar2.n();
                return s3q0.a;
            default:
                com.vk.donut.impl.a aVar3 = (com.vk.donut.impl.a) obj4;
                com.vk.lists.c cVar2 = (com.vk.lists.c) obj3;
                h0n0 h0n0Var = (h0n0) obj;
                if (h0n0Var instanceof h0n0.b) {
                    h0n0.b bVar = (h0n0.b) h0n0Var;
                    if (z) {
                        arrayList = new ArrayList();
                        Iterator it3 = bVar.b.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj2 = it3.next();
                                if (((GameSubscription) obj2).o == 1) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        GameSubscription gameSubscription = (GameSubscription) obj2;
                        if (gameSubscription != null) {
                            arrayList.addAll(com.vk.donut.impl.a.x(new a0j0(R.string.music)));
                            arrayList.addAll(aVar3.g(Integer.valueOf((int) gameSubscription.m)));
                        } else if (o25.a().i().C) {
                            arrayList.addAll(com.vk.donut.impl.a.x(new a0j0(R.string.music)));
                            arrayList.addAll(aVar3.g(null));
                        }
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = bVar.b;
                        ArrayList arrayList7 = new ArrayList();
                        for (Object obj5 : arrayList6) {
                            if (((GameSubscription) obj5).o != 1) {
                                arrayList7.add(obj5);
                            }
                        }
                        Iterator it4 = arrayList7.iterator();
                        while (it4.hasNext()) {
                            GameSubscription gameSubscription2 = (GameSubscription) it4.next();
                            if (gameSubscription2.q) {
                                arrayList4.add(gameSubscription2);
                            } else {
                                arrayList5.add(gameSubscription2);
                            }
                        }
                        if (!arrayList5.isEmpty()) {
                            arrayList.addAll(com.vk.donut.impl.a.x(new a0j0(R.string.category_mini_apps)));
                            arrayList.addAll(com.vk.donut.impl.a.z(arrayList5));
                        }
                        if (!arrayList4.isEmpty()) {
                            arrayList.addAll(com.vk.donut.impl.a.x(new a0j0(R.string.category_games)));
                            arrayList.addAll(com.vk.donut.impl.a.z(arrayList4));
                        }
                    } else {
                        arrayList = new ArrayList();
                    }
                    aVar3.b(bVar, z, cVar2, arrayList);
                } else {
                    if (!(h0n0Var instanceof h0n0.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h0n0.a aVar4 = (h0n0.a) h0n0Var;
                    ArrayList arrayList8 = new ArrayList();
                    if (z && o25.a().i().C) {
                        q890 q890Var = new q890(iah0.a(12));
                        q890Var.a = 2;
                        arrayList8.add(q890Var);
                        arrayList8.add(new xzi0(null, new uq50(aVar3, 7)));
                    }
                    aVar3.b(aVar4, z, cVar2, arrayList8);
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ cvg(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }
}
