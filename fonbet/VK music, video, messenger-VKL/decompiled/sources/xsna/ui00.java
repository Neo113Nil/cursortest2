package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: ManagedGroupsQueueEvent.kt */
/* loaded from: classes3.dex */
public final class ui00 implements dre0<a> {
    public final UserId a;

    /* compiled from: ManagedGroupsQueueEvent.kt */
    public interface a {

        /* compiled from: ManagedGroupsQueueEvent.kt */
        /* renamed from: xsna.ui00$a$a, reason: collision with other inner class name */
        public static final class C3807a implements a {
            public final int a;

            public C3807a(int i) {
                this.a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3807a) && this.a == ((C3807a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("FolderCounterUpdate(unreadCount="), this.a, ')');
            }
        }

        /* compiled from: ManagedGroupsQueueEvent.kt */
        public static final class b implements a {
            public final Peer.Group a;
            public final int b;

            public b(Peer.Group group, int i) {
                this.a = group;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && this.b == bVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("GroupCounterUpdate(peer=");
                sb.append(this.a);
                sb.append(", unreadCount=");
                return vu5.b(sb, this.b, ')');
            }
        }

        /* compiled from: ManagedGroupsQueueEvent.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1095466105;
            }

            public final String toString() {
                return DeviceInfo.STR_TYPE_UNKNOWN;
            }
        }
    }

    public ui00(UserId userId) {
        this.a = userId;
    }

    @Override // xsna.dre0
    public final a a(JSONObject jSONObject) {
        String string = jSONObject.getString("entity_type");
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        if (!epx.f(string, "groupmessagecounter")) {
            return epx.f(string, "groupfoldercounter") ? new a.C3807a(jSONObject2.getInt("unread_count")) : a.c.a;
        }
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return new a.b(Peer.a.c(jSONObject2.getLong("group_id")), jSONObject2.getInt("unread_count"));
    }

    @Override // xsna.dre0
    public final String b() {
        return "groupeditordialogcounter_" + this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ui00) && epx.f(this.a, ((ui00) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("ManagedGroupsQueueEvent(userId="), this.a, ')');
    }
}
