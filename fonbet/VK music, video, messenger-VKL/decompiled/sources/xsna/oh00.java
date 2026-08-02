package xsna;

import com.vk.log.L;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ManageDevicesForPushesCmd.kt */
/* loaded from: classes2.dex */
public final class oh00 extends le6<s3q0> {
    public final String b;
    public final int c;
    public final String d;
    public final boolean e;
    public final String f;
    public final List<String> g;
    public final boolean h;
    public final Boolean i;

    public /* synthetic */ oh00(String str, int i, String str2, boolean z, String str3, List list, boolean z2) {
        this(str, i, str2, z, str3, list, z2, null);
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        x6x O0 = w2wVar.O0();
        mla mlaVar = this.a;
        if (mlaVar == null) {
            mlaVar = null;
        }
        w2wVar.O0().e("old manage device for pushes", O0.h("", mlaVar.b()), new ifg(this, 29));
        w2wVar.O0().d(new mh00(this.b, this.c, this.d, this.e, this.f, this.g, this.h, false, this.i));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh00)) {
            return false;
        }
        oh00 oh00Var = (oh00) obj;
        return epx.f(this.b, oh00Var.b) && this.c == oh00Var.c && epx.f(this.d, oh00Var.d) && this.e == oh00Var.e && epx.f(this.f, oh00Var.f) && epx.f(this.g, oh00Var.g) && this.h == oh00Var.h && epx.f(this.i, oh00Var.i);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(qoy.b(fw3.a(urd0.a(qoy.b(urd0.a(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, false);
        Boolean bool = this.i;
        return b + (bool != null ? bool.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            ManageDevicesForPushesCmd(\n                pushToken = ");
        sb.append(erm0.D0(5, this.b));
        sb.append(",\n                appVersion = ");
        sb.append(this.c);
        sb.append(",\n                companionApps = ");
        sb.append(this.d);
        sb.append(",\n                isGoogleServicesAvailable = ");
        sb.append(this.e);
        sb.append(",\n                pushProvider = ");
        sb.append(this.f);
        sb.append(",\n                unregisterAccessTokens = ");
        List<String> list = this.g;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(erm0.D0(5, (String) it.next()));
        }
        sb.append(j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, null, 62));
        sb.append(",\n                isMultiaccPushSettingsSwitch = ");
        sb.append(this.i);
        sb.append(",\n            )\n        ");
        return xqm0.g(sb.toString());
    }

    public oh00(String str, int i, String str2, boolean z, String str3, List list, boolean z2, Boolean bool) {
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = z;
        this.f = str3;
        this.g = list;
        this.h = z2;
        this.i = bool;
        L.p("ManageDevicesForPushesCmd created: " + this);
    }
}
