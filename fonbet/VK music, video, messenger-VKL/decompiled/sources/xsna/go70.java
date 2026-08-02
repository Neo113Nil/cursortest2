package xsna;

import com.vk.auth.oauth.VkOAuthService;

/* compiled from: OAuthVerificationProvider.kt */
/* loaded from: classes15.dex */
public final class go70 {
    public final VkOAuthService a;
    public final int b;

    public go70(VkOAuthService vkOAuthService, int i) {
        this.a = vkOAuthService;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go70)) {
            return false;
        }
        go70 go70Var = (go70) obj;
        return this.a == go70Var.a && this.b == go70Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OAuthVerificationProvider(service=");
        sb.append(this.a);
        sb.append(", version=");
        return vu5.b(sb, this.b, ')');
    }
}
