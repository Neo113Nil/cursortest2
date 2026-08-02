package xsna;

import com.vk.dto.common.id.UserId;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: UserProfileMainWallContentRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class xrq0 implements wrq0 {
    public ConcurrentHashMap<UserId, JSONObject> a;

    @Override // xsna.wrq0
    public final void a(UserId userId, JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.a.put(userId, jSONObject);
    }

    @Override // xsna.wrq0
    public final JSONObject b(UserId userId) {
        return this.a.get(userId);
    }

    @Override // xsna.wrq0
    public final void clear() {
        this.a.clear();
    }
}
