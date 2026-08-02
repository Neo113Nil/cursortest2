package xsna;

import com.ironsource.X3;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: UploadAttachmentEvent.kt */
/* loaded from: classes5.dex */
public final class n9q0 implements dre0<a> {
    public final UserId a;

    /* compiled from: UploadAttachmentEvent.kt */
    public static abstract class a {

        /* compiled from: UploadAttachmentEvent.kt */
        /* renamed from: xsna.n9q0$a$a, reason: collision with other inner class name */
        public static final class C3391a extends a {
            public static final C3391a a = new C3391a();
        }

        /* compiled from: UploadAttachmentEvent.kt */
        public static final class b extends a {
            public final String a;
            public final int b;
            public final int c;
            public final int d;

            public b(String str, int i, int i2, int i3) {
                this.a = str;
                this.b = i;
                this.c = i2;
                this.d = i3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
            }

            public final int hashCode() {
                return Integer.hashCode(this.d) + shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SuccessPayload(type=");
                sb.append(this.a);
                sb.append(", albumId=");
                sb.append(this.b);
                sb.append(", id=");
                sb.append(this.c);
                sb.append(", ownerId=");
                return vu5.b(sb, this.d, ')');
            }
        }
    }

    public n9q0(UserId userId) {
        this.a = userId;
    }

    @Override // xsna.dre0
    public final a a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject == null) {
            return a.C3391a.a;
        }
        if (!epx.f(optJSONObject.optString("status"), "success")) {
            return a.C3391a.a;
        }
        JSONObject jSONObject2 = optJSONObject.getJSONObject(X3.i.I0);
        return new a.b(optJSONObject.getJSONObject("payload").getString("type"), jSONObject2.optInt("album_id"), jSONObject2.getInt("id"), jSONObject2.getInt("owner_id"));
    }

    @Override // xsna.dre0
    public final String b() {
        return "wallpost_" + this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9q0) && epx.f(this.a, ((n9q0) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("UploadAttachmentEvent(userId="), this.a, ')');
    }
}
