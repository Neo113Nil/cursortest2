package xsna;

import com.vk.superapp.api.dto.auth.VkAuthAppScope;
import java.util.ArrayList;
import java.util.List;

/* compiled from: QrInfoResponse.kt */
/* loaded from: classes6.dex */
public final class mlc {
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List<VkAuthAppScope> e;
    public final List<mao0> f;

    public mlc(int i, String str, String str2, boolean z, ArrayList arrayList, ArrayList arrayList2) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = arrayList;
        this.f = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlc)) {
            return false;
        }
        mlc mlcVar = (mlc) obj;
        return this.a == mlcVar.a && epx.f(this.b, mlcVar.b) && epx.f(this.c, mlcVar.c) && this.d == mlcVar.d && epx.f(this.e, mlcVar.e) && epx.f(this.f, mlcVar.f);
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int b = qoy.b((a + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        List<VkAuthAppScope> list = this.e;
        int hashCode = (b + (list == null ? 0 : list.hashCode())) * 31;
        List<mao0> list2 = this.f;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientInfo(clientId=");
        sb.append(this.a);
        sb.append(", clientName=");
        sb.append(this.b);
        sb.append(", clientIconUrl=");
        sb.append(this.c);
        sb.append(", isOfficialClient=");
        sb.append(this.d);
        sb.append(", scopeList=");
        sb.append(this.e);
        sb.append(", termsLink=");
        return ms9.a(')', sb, this.f);
    }
}
