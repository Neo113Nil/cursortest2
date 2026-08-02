package xsna;

import com.vk.dto.user.RequestUserProfile;
import java.util.List;

/* compiled from: AccountSearchContactsPage.kt */
/* loaded from: classes13.dex */
public final class bq {
    public final List<RequestUserProfile> a;
    public final List<RequestUserProfile> b;

    /* JADX WARN: Multi-variable type inference failed */
    public bq(List<? extends RequestUserProfile> list, List<? extends RequestUserProfile> list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq)) {
            return false;
        }
        bq bqVar = (bq) obj;
        return epx.f(this.a, bqVar.a) && epx.f(this.b, bqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccountSearchContactsPage(found=");
        sb.append(this.a);
        sb.append(", other=");
        return ms9.a(')', sb, this.b);
    }
}
