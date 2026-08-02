package defpackage;

import android.app.ActivityManager;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import com.yandex.messaging.core.net.entities.proto.message.SeenMarker;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessageInfo;
import com.yandex.messaging.core.net.entities.proto.telemost.MeetingCallingMessage;
import com.yandex.messaging.internal.entities.PushData;
import com.yandex.messaging.utils.b;
import io.appmetrica.analytics.impl.C0553n3;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import kotlin.Pair;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes15.dex */
public final class m7c {
    public final x22 a;
    public final b b;
    public final lqo c;
    public final eil0 d;

    public m7c(x22 x22Var, b bVar, lqo lqoVar, eil0 eil0Var) {
        this.a = x22Var;
        this.b = bVar;
        this.c = lqoVar;
        this.d = eil0Var;
    }

    public static LinkedHashMap f(PushData pushData) {
        String str;
        ServerMessageInfo serverMessageInfo;
        ReducedUserInfo reducedUserInfo;
        Pair pair = new Pair("chat id", pushData.chatId);
        ServerMessage serverMessage = pushData.serverMessage;
        String str2 = null;
        LinkedHashMap l = kotlin.collections.b.l(pair, new Pair("addressee id", (serverMessage == null || (serverMessageInfo = serverMessage.serverMessageInfo) == null || (reducedUserInfo = serverMessageInfo.from) == null) ? null : reducedUserInfo.userId), new Pair("recipient_id", pushData.recipientUserId));
        ServerMessage serverMessage2 = pushData.serverMessage;
        if (serverMessage2 != null) {
            ClientMessage clientMessage = serverMessage2.clientMessage;
            if (clientMessage.plain != null) {
                str2 = "Plain";
            } else if (clientMessage.seenMarker != null) {
                str2 = "SeenMarker";
            } else if (clientMessage.typing != null) {
                str2 = "Typing";
            } else if (clientMessage.systemMessage != null) {
                str2 = "SystemMessage";
            } else if (clientMessage.heartbeat != null) {
                str2 = "Heartbeat";
            } else if (clientMessage.stateSync != null) {
                str2 = "StateSync";
            } else if (clientMessage.callingMessage != null) {
                str2 = "CallingMessage";
            } else {
                MeetingCallingMessage meetingCallingMessage = clientMessage.meetingCallingMessage;
                if (meetingCallingMessage != null) {
                    if (meetingCallingMessage.getIncomingCall() != null) {
                        str = "IncomingCall";
                    } else if (meetingCallingMessage.getRingingEnded() != null) {
                        str = "RingingEnded";
                    } else if (meetingCallingMessage.getRinging() != null) {
                        str = "Ringing";
                    } else if (meetingCallingMessage.getOutgoingRingingEnded() != null) {
                        str = "OutgoingRingingEnded";
                    } else if (meetingCallingMessage.getEndRinging() != null) {
                        str = "EndRinging";
                    } else if (meetingCallingMessage.getNotifyRinging() != null) {
                        str = "NotifyRinging";
                    } else if (meetingCallingMessage.getEndOutgoingRinging() != null) {
                        str = "EndOutgoingRinging";
                    } else {
                        z83.i();
                        str = "Unknown";
                    }
                    str2 = "MeetingCallingMessage/".concat(str);
                } else if (clientMessage.pin != null) {
                    str2 = "Pin";
                } else if (clientMessage.reaction != null) {
                    str2 = "Reaction";
                }
            }
            l.put("message_type", str2);
            l.put("is_message_silent", Boolean.valueOf(clientMessage.isSilent));
            l.put("notification_behaviour", Integer.valueOf(clientMessage.notificationBehaviour));
            PlainMessage plainMessage = clientMessage.plain;
            if (plainMessage != null) {
                l.put("plain_message_ts", Long.valueOf(plainMessage.getTimestamp()));
            }
            SeenMarker seenMarker = clientMessage.seenMarker;
            if (seenMarker != null) {
                l.put("seen_marker_ts", Long.valueOf(seenMarker.getTimestamp()));
            }
        }
        return l;
    }

    public final String a() {
        return this.c.a(tz10.E) ? "blocking_coroutine" : "legacy";
    }

    public final void b(m5g0 m5g0Var) {
        this.d.b("push_error", kotlin.collections.b.i(new Pair("transit_id", m5g0Var.a), new Pair(CRLReasonCodeExtension.REASON, "push_message_is_invalid"), new Pair("push_handling_strategy", a())));
    }

    public final void c(Exception exc, String str) {
        this.d.b("push_error", kotlin.collections.b.i(new Pair(CRLReasonCodeExtension.REASON, str), new Pair(Constants.KEY_EXCEPTION, exc), new Pair("push_handling_strategy", a())));
        this.a.reportError(str, exc);
    }

    public final void d(String str, PushData pushData, m5g0 m5g0Var, int i) {
        LinkedHashMap l = kotlin.collections.b.l(new Pair("transit_id", m5g0Var.a), new Pair(CRLReasonCodeExtension.REASON, str), new Pair("app_running_status", this.b.a() ? "foreground" : C0553n3.g), new Pair("connection_status", Integer.valueOf(i)), new Pair("push_handling_strategy", a()));
        l.putAll(f(pushData));
        this.d.b("push_error", l);
    }

    public final void e(PushData pushData, m5g0 m5g0Var, int i) {
        Pair pair = new Pair("transit_id", m5g0Var.a);
        b bVar = this.b;
        LinkedHashMap l = kotlin.collections.b.l(pair, new Pair("app_running_status", bVar.a() ? "foreground" : C0553n3.g), new Pair("app_background_restricted", Boolean.valueOf(((ActivityManager) bVar.a.getSystemService("activity")).isBackgroundRestricted())), new Pair("connection_status", Integer.valueOf(i)), new Pair("push_handling_strategy", a()));
        l.putAll(f(pushData));
        this.d.b("push_received", l);
    }
}
