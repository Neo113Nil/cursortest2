package xsna;

import com.vk.dto.common.id.UserId;
import java.util.HashMap;
import java.util.List;

/* compiled from: ClipEndOverlayMyTargetCustomParams.kt */
/* loaded from: classes17.dex */
public final class lvc {
    public final Integer a;
    public final UserId b;
    public final boolean c;
    public final List<String> d;
    public final String e;
    public final HashMap<String, Object> f;

    public lvc(Integer num, UserId userId, boolean z, List<String> list, String str, HashMap<String, Object> hashMap) {
        this.a = num;
        this.b = userId;
        this.c = z;
        this.d = list;
        this.e = str;
        this.f = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvc)) {
            return false;
        }
        lvc lvcVar = (lvc) obj;
        return epx.f(this.a, lvcVar.a) && epx.f(this.b, lvcVar.b) && this.c == lvcVar.c && epx.f(this.d, lvcVar.d) && epx.f(this.e, lvcVar.e) && epx.f(this.f, lvcVar.f);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        UserId userId = this.b;
        int b = qoy.b((hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31, 31, this.c);
        List<String> list = this.d;
        int hashCode2 = (b + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        HashMap<String, Object> hashMap = this.f;
        return hashCode3 + (hashMap != null ? hashMap.hashCode() : 0);
    }

    public final String toString() {
        return "ClipEndOverlayMyTargetCustomParams(videoId=" + this.a + ", ownerId=" + this.b + ", isSellerAd=" + this.c + ", wbItemIds=" + this.d + ", articles=" + this.e + ", additionalParams=" + this.f + ')';
    }
}
