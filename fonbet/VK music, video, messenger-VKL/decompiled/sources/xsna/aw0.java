package xsna;

import com.vkontakte.android.attachments.AdHideReason;
import com.vkontakte.android.attachments.AdSource;
import java.util.List;

/* compiled from: AdsHideAdParams.kt */
/* loaded from: classes4.dex */
public final class aw0 {
    public final int a;
    public final int b;
    public final String c;
    public final AdSource d;
    public final List<AdHideReason> e;

    public aw0(int i, int i2, String str, AdSource adSource, List list) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = adSource;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw0)) {
            return false;
        }
        aw0 aw0Var = (aw0) obj;
        return this.a == aw0Var.a && this.b == aw0Var.b && epx.f(this.c, aw0Var.c) && this.d == aw0Var.d && epx.f(this.e, aw0Var.e);
    }

    public final int hashCode() {
        int hashCode = (((this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31)) * 31) + 3107) * 31;
        AdSource adSource = this.d;
        int hashCode2 = (hashCode + (adSource == null ? 0 : adSource.hashCode())) * 31;
        List<AdHideReason> list = this.e;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdsHideAdParams(adsId1=");
        sb.append(this.a);
        sb.append(", adsId2=");
        sb.append(this.b);
        sb.append(", adData=");
        sb.append(this.c);
        sb.append(", objectType=ad, source=");
        sb.append(this.d);
        sb.append(", hideReasons=");
        return ms9.a(')', sb, this.e);
    }
}
