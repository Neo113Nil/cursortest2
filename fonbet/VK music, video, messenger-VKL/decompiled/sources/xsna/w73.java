package xsna;

import com.vk.superapp.api.dto.auth.VkAuthAppScope;
import java.util.List;

/* compiled from: AppPermissions.kt */
/* loaded from: classes6.dex */
public final class w73 {
    public final List<VkAuthAppScope> a;
    public final List<String> b;
    public final String c;
    public final String d;

    public w73(List<VkAuthAppScope> list, List<String> list2, String str, String str2) {
        this.a = list;
        this.b = list2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w73)) {
            return false;
        }
        w73 w73Var = (w73) obj;
        return epx.f(this.a, w73Var.a) && epx.f(this.b, w73Var.b) && epx.f(this.c, w73Var.c) && epx.f(this.d, w73Var.d);
    }

    public final int hashCode() {
        List<VkAuthAppScope> list = this.a;
        int a = fw3.a((list == null ? 0 : list.hashCode()) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppPermissions(vkConnectPermissions=");
        sb.append(this.a);
        sb.append(", grantedPermissions=");
        sb.append(this.b);
        sb.append(", termsLink=");
        sb.append(this.c);
        sb.append(", privacyPolicyLink=");
        return ho8.a(sb, this.d, ')');
    }
}
