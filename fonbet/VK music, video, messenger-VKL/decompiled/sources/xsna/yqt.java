package xsna;

import com.vk.dto.common.data.ApiApplication;

/* compiled from: CopyrightInfoRequest.kt */
/* loaded from: classes4.dex */
public final class yqt {
    public final String a;
    public final int b;
    public String c;
    public final ApiApplication d;

    public yqt(String str, int i, String str2, ApiApplication apiApplication) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = apiApplication;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqt)) {
            return false;
        }
        yqt yqtVar = (yqt) obj;
        return epx.f(this.a, yqtVar.a) && this.b == yqtVar.b && epx.f(this.c, yqtVar.c) && epx.f(this.d, yqtVar.d);
    }

    public final int hashCode() {
        int a = shy.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        ApiApplication apiApplication = this.d;
        return hashCode + (apiApplication != null ? apiApplication.hashCode() : 0);
    }

    public final String toString() {
        return "GetCopyrightInfoResponse(ownerName=" + this.a + ", ownerSex=" + this.b + ", sourceName=" + this.c + ", app=" + this.d + ')';
    }
}
