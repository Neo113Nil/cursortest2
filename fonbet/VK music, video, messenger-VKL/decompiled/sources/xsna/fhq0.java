package xsna;

import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.dto.common.id.UserId;
import org.json.JSONObject;

/* compiled from: UserData.kt */
/* loaded from: classes6.dex */
public final class fhq0 {
    public final UserId a;
    public final AccountProfileType b;

    static {
        UserId.b bVar = UserId.c;
        AccountProfileType.a aVar = AccountProfileType.Companion;
    }

    public fhq0(UserId userId, AccountProfileType accountProfileType) {
        this.a = userId;
        this.b = accountProfileType;
    }

    public final AccountProfileType a() {
        return this.b;
    }

    public final UserId b() {
        return this.a;
    }

    public final JSONObject c() {
        return new JSONObject().put("userId", this.a.b).put("profileType", this.b.i());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhq0)) {
            return false;
        }
        fhq0 fhq0Var = (fhq0) obj;
        return epx.f(this.a, fhq0Var.a) && this.b == fhq0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a.b) * 31);
    }

    public final String toString() {
        return "UserData(userId=" + this.a + ", profileType=" + this.b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fhq0(JSONObject jSONObject) {
        this(r0, r5 == null ? AccountProfileType.NORMAL : r5);
        UserId userId = new UserId(jSONObject.optLong("userId", UserId.d.b));
        AccountProfileType.a aVar = AccountProfileType.Companion;
        JSONObject optJSONObject = jSONObject.optJSONObject("profileType");
        aVar.getClass();
        AccountProfileType a = AccountProfileType.a.a(optJSONObject != null ? Integer.valueOf(optJSONObject.optInt("code")) : null);
    }
}
