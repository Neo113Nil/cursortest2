package xsna;

import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: PhotosCopy.java */
/* loaded from: classes15.dex */
public final class pea0 extends rsg0 {
    public final /* synthetic */ int s = 1;

    public /* synthetic */ pea0(String str) {
        super(str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                try {
                    return Integer.valueOf(jSONObject.getInt("response"));
                } catch (Exception unused) {
                    return -1;
                }
            default:
                return Boolean.valueOf(jSONObject.getInt("response") == 1);
        }
    }

    public pea0(long j, UserId userId, String str) {
        super("fave.removeProduct");
        D(j, "id");
        F(userId, "owner_id");
        if (str == null || str.length() == 0) {
            return;
        }
        K("ref", str);
    }
}
