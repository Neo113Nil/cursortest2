package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.messages.dto.MessagesCallChatDto;
import com.vk.api.generated.messages.dto.MessagesGetScheduledCallsResponseDto;
import com.vk.api.generated.messages.dto.MessagesScheduledCallItemDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.call_list.scheduled.ScheduledScreenSharingMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledAudioMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledCallRecurrence;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledVideoMuteOption;
import com.vk.voip.ui.call_list.scheduled.feature.model.ScheduledWatchTogetherOption;
import com.vk.voip.userid.CallsUserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* compiled from: ScheduledCallsApiModelMapper.kt */
/* loaded from: classes7.dex */
public final class v6h0 {
    public final Object a = msy.a(LazyThreadSafetyMode.NONE, new nh(27));

    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlin.Lazy] */
    public final ArrayList a(MessagesGetScheduledCallsResponseDto messagesGetScheduledCallsResponseDto) {
        Object obj;
        ScheduledCallRecurrence scheduledCallRecurrence;
        Iterator it;
        List<UsersUserFullDto> list;
        List<GroupsGroupFullDto> list2;
        MessagesScheduledCallItemDto messagesScheduledCallItemDto;
        s49 s49Var;
        long j;
        List<MessagesScheduledCallItemDto> f = messagesGetScheduledCallsResponseDto.f();
        if (f == null) {
            f = EmptyList.b;
        }
        List<UsersUserFullDto> i = messagesGetScheduledCallsResponseDto.i();
        if (i == null) {
            i = EmptyList.b;
        }
        List<GroupsGroupFullDto> d = messagesGetScheduledCallsResponseDto.d();
        if (d == null) {
            d = EmptyList.b;
        }
        List<MessagesScheduledCallItemDto> list3 = f;
        ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            MessagesScheduledCallItemDto messagesScheduledCallItemDto2 = (MessagesScheduledCallItemDto) it2.next();
            UserId e = messagesScheduledCallItemDto2.e();
            Iterator<T> it3 = i.iterator();
            while (true) {
                if (it3.hasNext()) {
                    obj = it3.next();
                    if (epx.f(((UsersUserFullDto) obj).s1(), e)) {
                    }
                } else {
                    obj = null;
                }
            }
            UsersUserFullDto usersUserFullDto = (UsersUserFullDto) obj;
            String a = usersUserFullDto != null ? rq.a(usersUserFullDto, new StringBuilder(), ' ') : null;
            UserId e2 = fkq0.e(e);
            if (a == null) {
                for (GroupsGroupFullDto groupsGroupFullDto : d) {
                    if (epx.f(groupsGroupFullDto.P0(), e2)) {
                        a = groupsGroupFullDto.y1();
                        if (a == null) {
                            a = "";
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            CallId callId = new CallId(messagesScheduledCallItemDto2.d());
            String str = a;
            String l = messagesScheduledCallItemDto2.l();
            Serializer.c<? extends Serializer.StreamParcelable> cVar = CallsUserId.CREATOR;
            CallsUserId.VkUserId vkUserId = new CallsUserId.VkUserId(e);
            switch (pif0.$EnumSwitchMapping$0[messagesScheduledCallItemDto2.u().e().ordinal()]) {
                case 1:
                    scheduledCallRecurrence = ScheduledCallRecurrence.DAILY;
                    break;
                case 2:
                    scheduledCallRecurrence = ScheduledCallRecurrence.MONTHLY;
                    break;
                case 3:
                    scheduledCallRecurrence = ScheduledCallRecurrence.WEEKDAYS;
                    break;
                case 4:
                    scheduledCallRecurrence = ScheduledCallRecurrence.WEEKEND;
                    break;
                case 5:
                    scheduledCallRecurrence = ScheduledCallRecurrence.WEEKLY;
                    break;
                case 6:
                    scheduledCallRecurrence = ScheduledCallRecurrence.YEARLY;
                    break;
                default:
                    scheduledCallRecurrence = ScheduledCallRecurrence.NEVER;
                    break;
            }
            Long f2 = messagesScheduledCallItemDto2.u().f();
            mvo0 mvo0Var = f2 != null ? new mvo0(TimeUnit.SECONDS.toMillis(f2.longValue())) : null;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(messagesScheduledCallItemDto2.u().g());
            long millis2 = timeUnit.toMillis(messagesScheduledCallItemDto2.u().d());
            long millis3 = timeUnit.toMillis(messagesScheduledCallItemDto2.u().getDuration());
            String D = messagesScheduledCallItemDto2.D();
            boolean C = messagesScheduledCallItemDto2.C();
            MessagesCallChatDto f3 = messagesScheduledCallItemDto2.f();
            if (f3 != null) {
                UserId d2 = f3.d();
                if (d2 != null) {
                    it = it2;
                    UserId userId = f3.getId() != 0 ? d2 : null;
                    list = i;
                    if (userId != null) {
                        j = userId.b;
                        list2 = d;
                        String title = f3.getTitle();
                        Serializer.c<ImageList> cVar2 = ImageList.CREATOR;
                        messagesScheduledCallItemDto = messagesScheduledCallItemDto2;
                        s49Var = new s49(j, title, ImageList.a.a(f3.e()));
                    }
                } else {
                    it = it2;
                    list = i;
                }
                j = 0;
                list2 = d;
                String title2 = f3.getTitle();
                Serializer.c<ImageList> cVar22 = ImageList.CREATOR;
                messagesScheduledCallItemDto = messagesScheduledCallItemDto2;
                s49Var = new s49(j, title2, ImageList.a.a(f3.e()));
            } else {
                it = it2;
                list = i;
                list2 = d;
                messagesScheduledCallItemDto = messagesScheduledCallItemDto2;
                s49Var = null;
            }
            Boolean F = messagesScheduledCallItemDto.F();
            boolean booleanValue = F != null ? F.booleanValue() : false;
            String i2 = messagesScheduledCallItemDto.i();
            ScheduledAudioMuteOption scheduledAudioMuteOption = epx.f(i2, "mute") ? ScheduledAudioMuteOption.MutedOnJoin : epx.f(i2, "mute_permanent") ? ScheduledAudioMuteOption.MutedPermanent : ScheduledAudioMuteOption.Enabled;
            String k = messagesScheduledCallItemDto.k();
            ScheduledVideoMuteOption scheduledVideoMuteOption = epx.f(k, "mute") ? ScheduledVideoMuteOption.DisabledOnJoin : epx.f(k, "mute_permanent") ? ScheduledVideoMuteOption.DisabledPermanent : ScheduledVideoMuteOption.Enabled;
            boolean z = booleanValue;
            s49 s49Var2 = s49Var;
            ScheduledCallRecurrence scheduledCallRecurrence2 = scheduledCallRecurrence;
            ScheduledWatchTogetherOption scheduledWatchTogetherOption = new ScheduledWatchTogetherOption(((Boolean) ((gzs) this.a.getValue()).invoke()).booleanValue(), epx.f(messagesScheduledCallItemDto.o(), Boolean.FALSE));
            Boolean p = messagesScheduledCallItemDto.p();
            boolean booleanValue2 = p != null ? p.booleanValue() : false;
            boolean f4 = epx.f(messagesScheduledCallItemDto.g(), Boolean.TRUE);
            boolean t0 = messagesScheduledCallItemDto.t0();
            String j2 = messagesScheduledCallItemDto.j();
            ScheduledScreenSharingMuteOption scheduledScreenSharingMuteOption = epx.f(j2, "mute") ? ScheduledScreenSharingMuteOption.DisabledOnJoin : epx.f(j2, "mute_permanent") ? ScheduledScreenSharingMuteOption.DisabledPermanent : ScheduledScreenSharingMuteOption.Enabled;
            Boolean n = messagesScheduledCallItemDto.n();
            boolean booleanValue3 = n != null ? n.booleanValue() : false;
            Boolean B = messagesScheduledCallItemDto.B();
            arrayList.add(new x5h0(callId, l, vkUserId, str, scheduledCallRecurrence2, mvo0Var, millis, millis3, D, s49Var2, z, f4, C, scheduledAudioMuteOption, scheduledVideoMuteOption, scheduledWatchTogetherOption, booleanValue2, t0, millis2, scheduledScreenSharingMuteOption, booleanValue3, B != null ? B.booleanValue() : false));
            it2 = it;
            i = list;
            d = list2;
        }
        return arrayList;
    }
}
