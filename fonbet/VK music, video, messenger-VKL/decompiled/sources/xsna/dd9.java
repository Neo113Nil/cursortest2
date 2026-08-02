package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.dto.common.id.UserId;
import com.vk.voip.api.id.CallId;
import org.json.JSONObject;

/* compiled from: CallsQueueEvent.kt */
/* loaded from: classes7.dex */
public class dd9 implements dre0<a> {
    public final UserId a;
    public final int b;
    public final int c;
    public final vk90 d;
    public final xrb e;
    public final rsw f;

    /* compiled from: CallsQueueEvent.kt */
    /* loaded from: classes11.dex */
    public interface a {

        /* compiled from: CallsQueueEvent.kt */
        /* renamed from: xsna.dd9$a$a, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C2722a implements a {
            public final UserId a;

            public C2722a(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2722a) && epx.f(this.a, ((C2722a) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("CallHistoryUpdated(userId="), this.a, ')');
            }
        }

        /* compiled from: CallsQueueEvent.kt */
        /* loaded from: classes7.dex */
        public static final class b implements a {
            public final UserId a;

            public b(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("CallSettingsUpdated(userId="), this.a, ')');
            }
        }

        /* compiled from: CallsQueueEvent.kt */
        /* loaded from: classes7.dex */
        public static final class c implements a {
            public final UserId a;
            public final CallId b;
            public final jvi0 c;

            public c(UserId userId, CallId callId, jvi0 jvi0Var) {
                this.a = userId;
                this.b = callId;
                this.c = jvi0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b.b);
            }

            public final String toString() {
                return "ChatInfoUpdated(userId=" + this.a + ", callId=" + this.b + ", roomId=" + this.c + ')';
            }
        }

        /* compiled from: CallsQueueEvent.kt */
        /* loaded from: classes7.dex */
        public static final class d implements a {
            public final UserId a;

            public d(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("CurrentCallsUpdate(userId="), this.a, ')');
            }
        }

        /* compiled from: CallsQueueEvent.kt */
        public static final class e implements a {
            public final UserId a;
            public final JSONObject b;

            public e(UserId userId, JSONObject jSONObject) {
                this.a = userId;
                this.b = jSONObject;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
            }

            public final String toString() {
                return "IncomingCall(toUserId=" + this.a + ", data=" + this.b + ')';
            }
        }

        /* compiled from: CallsQueueEvent.kt */
        /* loaded from: classes7.dex */
        public static final class f implements a {
            public final UserId a;
            public final CallId b;
            public final String c;
            public final String d;

            public f(UserId userId, CallId callId, String str, String str2) {
                this.a = userId;
                this.b = callId;
                this.c = str;
                this.d = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d);
            }

            public final int hashCode() {
                int a = urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b.b), 31, this.c);
                String str = this.d;
                return a + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ParticipantNameChanged(userId=");
                sb.append(this.a);
                sb.append(", callId=");
                sb.append(this.b);
                sb.append(", participantId=");
                sb.append(this.c);
                sb.append(", changedName=");
                return ho8.a(sb, this.d, ')');
            }
        }

        /* compiled from: CallsQueueEvent.kt */
        /* loaded from: classes7.dex */
        public static final class g implements a {
            public final UserId a;

            public g(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("ScheduledCallsUpdate(userId="), this.a, ')');
            }
        }

        /* compiled from: CallsQueueEvent.kt */
        /* loaded from: classes7.dex */
        public static final class h implements a {
            public static final h a = new h();
        }
    }

    public dd9(UserId userId, int i, int i2) {
        this.a = userId;
        this.b = i;
        this.c = i2;
        this.d = new vk90(userId);
        this.e = new xrb(userId);
        this.f = new rsw(userId);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xsna.dre0
    public final a a(JSONObject jSONObject) {
        a cVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        String string = jSONObject2.getString("type");
        a.h hVar = a.h.a;
        if (string != null) {
            int hashCode = string.hashCode();
            UserId userId = this.a;
            try {
                switch (hashCode) {
                    case -1764772999:
                        if (string.equals("current_calls_update")) {
                            return new a.d(userId);
                        }
                        break;
                    case -1510374203:
                        if (string.equals("scheduled_calls_update")) {
                            return new a.g(userId);
                        }
                        break;
                    case -822844713:
                        if (string.equals("incoming_call")) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("value");
                            UserId userId2 = this.f.a;
                            return new a.e(userId2, new JSONObject().put("to_id", String.valueOf(userId2.b)).put("body", jSONObject3).put("type", NotificationCompat.CATEGORY_CALL));
                        }
                        break;
                    case -591533009:
                        if (string.equals("call_history_updated")) {
                            return new a.C2722a(userId);
                        }
                        break;
                    case -69442639:
                        if (string.equals("chat_info_updated")) {
                            xrb xrbVar = this.e;
                            JSONObject jSONObject4 = jSONObject2.getJSONObject("value");
                            UserId userId3 = xrbVar.a;
                            CallId callId = new CallId(jSONObject4.getString("call_id"));
                            String optString = jSONObject4.optString("hall_id");
                            int i = 0;
                            boolean z = optString.length() == 0;
                            if (!z) {
                                i = Integer.parseInt(optString);
                            }
                            cVar = new a.c(userId3, callId, new jvi0(z, i));
                            return cVar;
                        }
                        break;
                    case 760047087:
                        if (string.equals("group_call_history_updated")) {
                            return new a.C2722a(userId);
                        }
                        break;
                    case 921444953:
                        if (string.equals("call_settings_changed")) {
                            return new a.b(userId);
                        }
                        break;
                    case 1380568716:
                        if (string.equals("participant_name_changed")) {
                            vk90 vk90Var = this.d;
                            JSONObject jSONObject5 = jSONObject2.getJSONObject("value");
                            cVar = new a.f(vk90Var.a, new CallId(jSONObject5.getString("call_id")), jSONObject5.getString("participant_id"), jSONObject5.isNull("new_custom_name_for_call") ? null : jSONObject5.optString("new_custom_name_for_call"));
                            return cVar;
                        }
                        break;
                }
            } catch (Throwable unused) {
                return hVar;
            }
        }
        return hVar;
    }

    @Override // xsna.dre0
    public String b() {
        return "calls_" + this.a.b + '_' + this.b + '_' + this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        dd9 dd9Var = (dd9) obj;
        return epx.f(this.a, dd9Var.a) && this.b == dd9Var.b && this.c == dd9Var.c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.a.b) * 31) + this.b) * 31) + this.c;
    }
}
