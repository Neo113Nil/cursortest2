package xsna;

import com.huawei.hms.hihealth.data.DeviceInfo;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: MultiAccountQueueEvent.kt */
/* loaded from: classes3.dex */
public final class t240 implements dre0<a> {
    public final UserId a;

    /* compiled from: MultiAccountQueueEvent.kt */
    public interface a {

        /* compiled from: MultiAccountQueueEvent.kt */
        /* renamed from: xsna.t240$a$a, reason: collision with other inner class name */
        public static final class C3713a implements a {
            public static final C3713a a = new C3713a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3713a);
            }

            public final int hashCode() {
                return -101279939;
            }

            public final String toString() {
                return "AccountInfo";
            }
        }

        /* compiled from: MultiAccountQueueEvent.kt */
        public static final class b implements a {
            public final int a;

            public b(int i) {
                this.a = i;
            }

            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("Counter(count="), this.a, ')');
            }
        }

        /* compiled from: MultiAccountQueueEvent.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1043566580;
            }

            public final String toString() {
                return DeviceInfo.STR_TYPE_UNKNOWN;
            }
        }
    }

    public t240(UserId userId) {
        this.a = userId;
    }

    @Override // xsna.dre0
    public final a a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        String optString = optJSONObject != null ? optJSONObject.optString("type") : null;
        return epx.f(optString, "update_counter") ? new a.b(optJSONObject.optInt("value_android")) : epx.f(optString, "update_account_info") ? a.C3713a.a : a.c.a;
    }

    @Override // xsna.dre0
    public final String b() {
        return "multiaccount_" + this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t240) && epx.f(this.a, ((t240) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("MultiAccountQueueEvent(userId="), this.a, ')');
    }
}
