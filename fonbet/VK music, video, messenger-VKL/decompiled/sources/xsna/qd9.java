package xsna;

import com.vk.api.generated.calls.dto.CallsGetHistoryFilterDto;
import com.vk.api.generated.calls.dto.CallsStartMuteAudioDto;
import com.vk.api.generated.calls.dto.CallsStartMuteScreenSharingDto;
import com.vk.api.generated.calls.dto.CallsStartMuteVideoDto;
import com.vk.api.generated.calls.dto.CallsStartRecurrenceRuleDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: CallsService.kt */
/* loaded from: classes.dex */
public interface qd9 {
    static /* synthetic */ xy2 a(qd9 qd9Var, String str, String str2, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return qd9Var.f(str, str2);
    }

    static xy2 b(rd9 rd9Var, Boolean bool, UserId userId, String str, Long l, Integer num, Long l2, CallsStartRecurrenceRuleDto callsStartRecurrenceRuleDto, Boolean bool2, Boolean bool3, CallsStartMuteAudioDto callsStartMuteAudioDto, CallsStartMuteVideoDto callsStartMuteVideoDto, CallsStartMuteScreenSharingDto callsStartMuteScreenSharingDto, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i) {
        String str2 = (i & 8) != 0 ? null : str;
        Long l3 = (i & 16) != 0 ? null : l;
        Integer num2 = (i & 32) != 0 ? null : num;
        Long l4 = (i & 128) != 0 ? null : l2;
        CallsStartRecurrenceRuleDto callsStartRecurrenceRuleDto2 = (i & 256) != 0 ? null : callsStartRecurrenceRuleDto;
        Boolean bool8 = (32768 & i) != 0 ? null : bool4;
        Boolean bool9 = (i & 8388608) == 0 ? bool7 : null;
        rd9Var.getClass();
        tfx tfxVar = new tfx("calls.start", new en(8), new pn(8));
        tfxVar.j("only_auth_users", bool.booleanValue());
        if (userId != null) {
            tfx.n(tfxVar, "group_id", userId, 0L, 0L, 12);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "name", str2, 0, 0, 12);
        }
        if (l3 != null) {
            tfx.m(tfxVar, "time", l3.longValue(), 0L, 12);
        }
        if (num2 != null) {
            tfx.l(tfxVar, "duration", num2.intValue(), 0, 0, 12);
        }
        if (l4 != null) {
            tfx.m(tfxVar, "recurrence_until_time", l4.longValue(), 0L, 12);
        }
        if (callsStartRecurrenceRuleDto2 != null) {
            tfx.o(tfxVar, "recurrence_rule", callsStartRecurrenceRuleDto2.i(), 0, 0, 12);
        }
        tfxVar.j("skip_notification", bool2.booleanValue());
        tfxVar.j("waiting_hall", bool3.booleanValue());
        if (callsStartMuteAudioDto != null) {
            tfx.o(tfxVar, "mute_audio", callsStartMuteAudioDto.i(), 0, 0, 12);
        }
        if (callsStartMuteVideoDto != null) {
            tfx.o(tfxVar, "mute_video", callsStartMuteVideoDto.i(), 0, 0, 12);
        }
        if (callsStartMuteScreenSharingDto != null) {
            tfx.o(tfxVar, "mute_screen_sharing", callsStartMuteScreenSharingDto.i(), 0, 0, 12);
        }
        if (bool8 != null) {
            tfxVar.j("only_admin_can_share_movie", bool8.booleanValue());
        }
        tfxVar.j("feedback", bool5.booleanValue());
        tfxVar.j("only_admin_can_record", bool6.booleanValue());
        if (bool9 != null) {
            tfxVar.j(SignalingProtocol.KEY_SHOW_CHAT_HISTORY, bool9.booleanValue());
        }
        return tfxVar;
    }

    static xy2 c(rd9 rd9Var, String str, String str2, String str3, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        String str4 = str3;
        rd9Var.getClass();
        tfx tfxVar = new tfx("calls.editParticipantName", new nr(7), new defpackage.j0(11));
        tfxVar.g(36, 36, "call_id", str);
        tfx.o(tfxVar, "name", str2, 0, 0, 12);
        if (str4 != null) {
            tfx.o(tfxVar, "participant_id", str4, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx d(Long l, CallsGetHistoryFilterDto callsGetHistoryFilterDto, List list) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("calls.getHistory", new io.reactivex.rxjava3.internal.operators.mixed.j(5), new io.reactivex.rxjava3.internal.operators.mixed.k(6));
        tfxVar.f(20, 1, 50, "count");
        if (l != null) {
            tfx.m(tfxVar, "pagination_marker", l.longValue(), 1L, 8);
        }
        if (callsGetHistoryFilterDto != null) {
            tfx.o(tfxVar, "filter", callsGetHistoryFilterDto.i(), 0, 0, 12);
        }
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((UsersFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        return tfxVar;
    }

    default tfx e(UserId userId) {
        tfx tfxVar = new tfx("calls.getGroupToken", new sq(5), new com.vk.movika.sdk.android.defaultplayer.interactive.c(5));
        tfx.n(tfxVar, "group_id", userId, 0L, -1L, 4);
        return tfxVar;
    }

    default tfx f(String str, String str2) {
        tfx tfxVar = new tfx("calls.deleteParticipantName", new io.reactivex.rxjava3.internal.operators.mixed.n(4), new zq(6));
        tfxVar.g(36, 36, "call_id", str);
        if (str2 != null) {
            tfx.o(tfxVar, "participant_id", str2, 0, 0, 12);
        }
        return tfxVar;
    }

    default tfx g(String str) {
        tfx tfxVar = new tfx("calls.checkParticipantName", new cr(5), new io.reactivex.rxjava3.internal.operators.observable.n0(8));
        tfx.o(tfxVar, "name", str, 0, 0, 12);
        return tfxVar;
    }
}
