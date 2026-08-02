package xsna;

import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;

/* compiled from: DonutSubscription.kt */
/* loaded from: classes18.dex */
public final class c1o {
    public final UserId a;
    public final String b;
    public final String c;
    public final VerifyInfo d;

    public c1o(UserId userId, String str, String str2, VerifyInfo verifyInfo) {
        this.a = userId;
        this.b = str;
        this.c = str2;
        this.d = verifyInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1o)) {
            return false;
        }
        c1o c1oVar = (c1o) obj;
        return epx.f(this.a, c1oVar.a) && epx.f(this.b, c1oVar.b) && epx.f(this.c, c1oVar.c) && epx.f(this.d, c1oVar.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a.b) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DonutOwner(id=" + this.a + ", name=" + this.b + ", photoBase=" + this.c + ", verifyInfo=" + this.d + ')';
    }
}
