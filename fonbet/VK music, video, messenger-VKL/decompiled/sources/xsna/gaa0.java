package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: PhotoMlEnhanceQueueEvent.kt */
/* loaded from: classes5.dex */
public final class gaa0 implements dre0<b> {
    public final UserId a;

    /* compiled from: PhotoMlEnhanceQueueEvent.kt */
    public static final class a implements b {
        public final Exception a;

        public a(Exception exc) {
            this.a = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a.equals(((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "EnhanceErrorEvent(error=" + this.a + ')';
        }
    }

    /* compiled from: PhotoMlEnhanceQueueEvent.kt */
    public interface b {
    }

    /* compiled from: PhotoMlEnhanceQueueEvent.kt */
    public static final class c implements b {
        public final String a;
        public final String b;

        public c(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EnhanceSuccessEvent(photoId=");
            sb.append(this.a);
            sb.append(", resultImageUrl=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public gaa0(UserId userId) {
        this.a = userId;
    }

    @Override // xsna.dre0
    public final b a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            return new c(jSONObject2.getString("photo_id"), jSONObject2.getString(CampaignEx.JSON_KEY_IMAGE_URL));
        } catch (Exception e) {
            return new a(e);
        }
    }

    @Override // xsna.dre0
    public final String b() {
        return "enhancephoto_" + this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gaa0) && epx.f(this.a, ((gaa0) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("PhotoMlEnhanceQueueEvent(userId="), this.a, ')');
    }
}
