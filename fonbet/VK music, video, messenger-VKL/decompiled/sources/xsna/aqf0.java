package xsna;

import com.vk.log.L;
import java.util.List;

/* compiled from: RegisterDeviceForPushesCmd.kt */
/* loaded from: classes2.dex */
public final class aqf0 extends le6<s3q0> {
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;
    public final String f;
    public final List<String> g;
    public final boolean h;

    public aqf0(String str, int i, String str2, boolean z, String str3, List<String> list, boolean z2) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = list;
        this.h = z2;
        L.p("RegisterDeviceForPushesCmd created: " + this);
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        x6x O0 = w2wVar.O0();
        mla mlaVar = this.a;
        if (mlaVar == null) {
            mlaVar = null;
        }
        w2wVar.O0().e("old register device for pushes", O0.h("", mlaVar.b()), new w110(this, 20));
        w2wVar.O0().d(new bqf0(this.b, this.c, this.d, this.e, this.f, this.g, this.h));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqf0)) {
            return false;
        }
        aqf0 aqf0Var = (aqf0) obj;
        return epx.f(this.b, aqf0Var.b) && this.c == aqf0Var.c && epx.f(this.d, aqf0Var.d) && this.e == aqf0Var.e && epx.f(this.f, aqf0Var.f) && epx.f(this.g, aqf0Var.g) && this.h == aqf0Var.h;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.h) + fw3.a(urd0.a(qoy.b(urd0.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder a = t33.a("RegisterDeviceForPushesCmd(token='", erm0.D0(5, this.b), "', appVersion=");
        a.append(this.c);
        a.append(", isGoogleServicesAvailable=");
        a.append(this.e);
        a.append(", pushProvider=");
        a.append(this.f);
        a.append(", exchangeTokens=");
        a.append(this.g);
        a.append(", isRegisteringLoggedDevice=");
        return defpackage.q0.a(a, this.h, ')');
    }
}
