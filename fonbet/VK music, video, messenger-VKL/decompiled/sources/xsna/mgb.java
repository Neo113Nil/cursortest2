package xsna;

import android.content.Context;
import com.vk.channels.api.Channel;
import com.vk.channels.api.ChannelActionInProgress;
import com.vk.channels.impl.list.item.SuggestHeaderItem;
import com.vk.channels.impl.list.loader.ChannelsListItemsLoader;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.engine.models.users.User;
import com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.ListBuilder;
import xsna.ogb;
import xsna.p4b;
import xsna.q630;
import xsna.ygb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class mgb implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mgb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ChannelsListItemsLoader channelsListItemsLoader;
        int i;
        ArrayList arrayList;
        int i2;
        ListBuilder g;
        CharSequence charSequence;
        CharSequence charSequence2;
        nkb nkbVar;
        User user;
        int i3 = this.b;
        Object obj5 = this.c;
        switch (i3) {
            case 0:
                ChannelsListItemsLoader channelsListItemsLoader2 = (ChannelsListItemsLoader) obj5;
                ogb.a aVar = (ogb.a) obj;
                nkb nkbVar2 = (nkb) obj2;
                Map<Peer, ? extends ImStoryState> map = (Map) obj3;
                int intValue = ((Integer) obj4).intValue();
                Context context = channelsListItemsLoader2.a;
                ngb ngbVar = channelsListItemsLoader2.f;
                ArrayList arrayList2 = new ArrayList();
                List<Channel> list = nkbVar2.a;
                int i4 = nkbVar2.d;
                if (list.isEmpty()) {
                    channelsListItemsLoader = channelsListItemsLoader2;
                    i = intValue;
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    int i5 = nkbVar2.e;
                    SuggestHeaderItem.DropdownState dropdownState = i4 > 2 ? SuggestHeaderItem.DropdownState.Expanded : i4 < i5 ? SuggestHeaderItem.DropdownState.Collapsed : SuggestHeaderItem.DropdownState.NoNeed;
                    arrayList3.add(new SuggestHeaderItem(i5, dropdownState));
                    ProfilesSimpleInfo Ob = nkbVar2.c.Ob();
                    List<Channel> list2 = nkbVar2.a;
                    i = intValue;
                    ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        Channel channel = (Channel) it.next();
                        Iterator it2 = it;
                        ChannelsListItemsLoader channelsListItemsLoader3 = channelsListItemsLoader2;
                        MsgFromChannel msgFromChannel = nkbVar2.b.get(Long.valueOf(channel.b));
                        if (msgFromChannel != null) {
                            ngbVar.getClass();
                            charSequence2 = p4b.a(msgFromChannel, Ob);
                        } else {
                            charSequence2 = (String) ngbVar.c.getValue();
                        }
                        CharSequence charSequence3 = charSequence2;
                        if (channel.z == ChannelType.PERSONAL_CHANNEL) {
                            nkbVar = nkbVar2;
                            user = (User) Ob.b.get(Long.valueOf(channel.A.d));
                        } else {
                            nkbVar = nkbVar2;
                            user = null;
                        }
                        long j = channel.b;
                        ImageList imageList = channel.c;
                        ProfilesSimpleInfo profilesSimpleInfo = Ob;
                        String str = channel.d;
                        Serializer.c<Peer> cVar = Peer.CREATOR;
                        ImStoryState imStoryState = map.get(Peer.a.b(j));
                        if (imStoryState == null) {
                            imStoryState = ImStoryState.NONE;
                        }
                        arrayList4.add(Boolean.valueOf(arrayList3.add(new f3n0(j, imageList, str, charSequence3, imStoryState, channel.f, user))));
                        it = it2;
                        Ob = profilesSimpleInfo;
                        nkbVar2 = nkbVar;
                        channelsListItemsLoader2 = channelsListItemsLoader3;
                    }
                    channelsListItemsLoader = channelsListItemsLoader2;
                    if (dropdownState == SuggestHeaderItem.DropdownState.Expanded && i4 < i5) {
                        arrayList3.add(new v930());
                    }
                    arrayList2.addAll(arrayList3);
                    if (!aVar.a.isEmpty()) {
                        arrayList2.add(new vqj0(context.getString(R.string.vkapp_channels_subscriptions_title_header)));
                    }
                }
                List<Channel> list3 = aVar.a;
                List<dcf0> list4 = aVar.d;
                if (list3.isEmpty()) {
                    arrayList = arrayList2;
                    i2 = 10;
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    ProfilesSimpleInfo Ob2 = aVar.c.Ob();
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj6 : list3) {
                        if (((Channel) obj6).t == ChannelActionInProgress.NONE) {
                            arrayList6.add(obj6);
                        }
                    }
                    Iterator it3 = arrayList6.iterator();
                    boolean z = false;
                    while (it3.hasNext()) {
                        Channel channel2 = (Channel) it3.next();
                        if (z && !pli.j(channel2.s)) {
                            arrayList5.add(wrn.b);
                        }
                        ArrayList arrayList7 = arrayList2;
                        ChannelsListItemsLoader channelsListItemsLoader4 = channelsListItemsLoader;
                        ngb ngbVar2 = channelsListItemsLoader4.f;
                        MsgFromChannel msgFromChannel2 = (MsgFromChannel) aVar.b.get(Long.valueOf(channel2.b));
                        qcy<Object>[] qcyVarArr = ngb.d;
                        arrayList5.add(ngbVar2.a(channel2, msgFromChannel2, Ob2, map, false));
                        channelsListItemsLoader = channelsListItemsLoader4;
                        z = pli.j(channel2.s);
                        arrayList2 = arrayList7;
                    }
                    arrayList = arrayList2;
                    i2 = 10;
                    arrayList.addAll(arrayList5);
                }
                if (aVar.f) {
                    arrayList.add(xpz.b);
                } else if (!list4.isEmpty()) {
                    boolean isEmpty = list3.isEmpty();
                    int i6 = aVar.e;
                    if (BuildInfo.t()) {
                        boolean z2 = !isEmpty && i >= i6;
                        String string = isEmpty ? null : z2 ? context.getString(R.string.vkim_expand) : context.getString(R.string.vkim_collapse);
                        ListBuilder e = e43.e();
                        e.add(new fcf0(string, z2));
                        if (!z2) {
                            List<dcf0> list5 = list4;
                            ArrayList arrayList8 = new ArrayList(c5g.u(list5, i2));
                            for (dcf0 dcf0Var : list5) {
                                arrayList8.add(new pcf0(dcf0Var.b, dcf0Var.c, dcf0Var.d, dcf0Var.e, new VerifyInfo(dcf0Var.f, false, false, false, false, false, 62, null)));
                            }
                            e.addAll(arrayList8);
                        }
                        g = e.g();
                    } else {
                        ListBuilder e2 = e43.e();
                        e2.add(new vqj0(context.getString(R.string.vkim_communities_recommendations)));
                        List<dcf0> list6 = list4;
                        ArrayList arrayList9 = new ArrayList(c5g.u(list6, i2));
                        for (dcf0 dcf0Var2 : list6) {
                            MsgFromChannel msgFromChannel3 = dcf0Var2.g;
                            if (msgFromChannel3 != null) {
                                ngbVar.getClass();
                                p4b.a aVar2 = p4b.a;
                                charSequence = p4b.a(msgFromChannel3, new ProfilesSimpleInfo());
                            } else {
                                charSequence = (String) ngbVar.c.getValue();
                            }
                            arrayList9.add(new mcf0(dcf0Var2.b, dcf0Var2.c, dcf0Var2.d, charSequence, dcf0Var2.h));
                        }
                        e2.addAll(arrayList9);
                        g = e2.g();
                    }
                    arrayList.addAll(g);
                } else if (arrayList.isEmpty()) {
                    arrayList.add(cgp.b);
                }
                return new ygb.a(aVar, new ChannelsListItemsLoader.a(arrayList));
            default:
                v5v v5vVar = (v5v) obj5;
                izs izsVar = (izs) obj;
                ((Boolean) obj2).getClass();
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                int i7 = VideoProfileCreatorOnboardingVideoCounterView.o;
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar3.y(izsVar) ? 4 : 2;
                }
                if (aVar3.t(intValue2 & 1, (intValue2 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1020599076, intValue2, -1, "com.vk.video.profile.presentation.views.creatoronboarding.videocounter.VideoProfileCreatorOnboardingVideoCounterView.Title.<anonymous> (VideoProfileCreatorOnboardingVideoCounterView.kt:142)");
                    }
                    String str2 = v5vVar.a;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j2 = ylu0Var.getText().m;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(str2, ahn.E(q630.a.a, "video_creators_onboarding_counter_title"), j2, null, null, 0, 0, null, 0, false, 0, 0, izsVar, wuv0Var.k, aVar3, 48, (intValue2 << 6) & 896, 4088);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
        }
    }
}
