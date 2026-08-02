package xsna;

import android.content.Context;
import com.vk.dto.common.data.InaccessibilityMessage;
import com.vk.dto.common.id.UserId;

/* compiled from: ProductButtonsBinder.kt */
/* loaded from: classes18.dex */
public final class r19 {
    public final String a;
    public final boolean b;
    public final InaccessibilityMessage c;
    public final UserId d;
    public final boolean e;
    public final Context f;

    public r19(String str, boolean z, InaccessibilityMessage inaccessibilityMessage, UserId userId, boolean z2, Context context) {
        this.a = str;
        this.b = z;
        this.c = inaccessibilityMessage;
        this.d = userId;
        this.e = z2;
        this.f = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r19)) {
            return false;
        }
        r19 r19Var = (r19) obj;
        return epx.f(this.a, r19Var.a) && this.b == r19Var.b && epx.f(this.c, r19Var.c) && epx.f(this.d, r19Var.d) && this.e == r19Var.e && epx.f(this.f, r19Var.f);
    }

    public final int hashCode() {
        int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
        InaccessibilityMessage inaccessibilityMessage = this.c;
        int hashCode = (b + (inaccessibilityMessage == null ? 0 : inaccessibilityMessage.hashCode())) * 31;
        UserId userId = this.d;
        return this.f.hashCode() + qoy.b((hashCode + (userId != null ? Long.hashCode(userId.b) : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        return "CallClickArgs(phone=" + this.a + ", isAvailableNow=" + this.b + ", inaccessibilityMessage=" + this.c + ", contactId=" + this.d + ", primaryButton=" + this.e + ", context=" + this.f + ')';
    }
}
