package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.ImageStatus;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ImageStatusUpdateQueueEvent.kt */
/* loaded from: classes5.dex */
public final class bmw implements dre0<ImageStatus> {
    public final UserId a;

    public bmw(UserId userId) {
        this.a = userId;
    }

    @Override // xsna.dre0
    public final ImageStatus a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject == null) {
            return null;
        }
        try {
            Serializer.c<ImageStatus> cVar = ImageStatus.CREATOR;
            return ImageStatus.a.a(optJSONObject);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // xsna.dre0
    public final String b() {
        return "imagestatus_" + this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bmw) && epx.f(this.a, ((bmw) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("ImageStatusUpdateQueueEvent(userId="), this.a, ')');
    }
}
