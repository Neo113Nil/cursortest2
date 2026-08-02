package xsna;

import com.vk.api.base.Document;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: AppsSendRequestWithAttachment.java */
/* loaded from: classes14.dex */
public final class qf3 extends rsg0 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qf3(String str, int i) {
        super(str);
        this.s = i;
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return Integer.valueOf(jSONObject.optInt("response"));
            case 1:
                return tav0.b(jSONObject.optJSONObject("response"), Document.u);
            default:
                return Boolean.valueOf(jSONObject.getInt("response") == 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf3(int i, int i2, int i3, UserId userId) {
        super("docs.get");
        this.s = 1;
        F(userId, "owner_id");
        C(i, SignalingProtocol.KEY_OFFSET);
        C(i2, "count");
        if (i3 > 0) {
            C(i3, "type");
        }
    }
}
