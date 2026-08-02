package yads;

import java.util.ArrayList;
import java.util.List;
import xsna.epx;
import xsna.xe9;

/* loaded from: classes10.dex */
public final class rc implements m0 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;

    public rc(String str, String str2, String str3, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = arrayList;
    }

    @Override // yads.m0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc)) {
            return false;
        }
        rc rcVar = (rc) obj;
        return epx.f(this.a, rcVar.a) && epx.f(this.b, rcVar.b) && epx.f(this.c, rcVar.c) && epx.f(this.d, rcVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + k4.a(this.c, k4.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        List list = this.d;
        StringBuilder a = xe9.a("AdtuneAction(actionType=", str, ", adtuneUrl=", str2, ", optOutUrl=");
        a.append(str3);
        a.append(", trackingUrls=");
        a.append(list);
        a.append(")");
        return a.toString();
    }
}
