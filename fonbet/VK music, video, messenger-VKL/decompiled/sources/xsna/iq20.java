package xsna;

import com.vk.common.links.LaunchContext;
import com.vk.superapp.core.perf.BrowserPerfState;

/* compiled from: MiniAppLaunchDto.kt */
/* loaded from: classes7.dex */
public final class iq20 {
    public final String a;
    public String b;
    public final String c;
    public BrowserPerfState d;
    public final Integer e;
    public final String f;
    public final yp80 g;
    public final LaunchContext h;

    public iq20() {
        this(null, null, null, null, null, null, null, null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq20)) {
            return false;
        }
        iq20 iq20Var = (iq20) obj;
        return epx.f(this.a, iq20Var.a) && epx.f(this.b, iq20Var.b) && epx.f(this.c, iq20Var.c) && epx.f(this.d, iq20Var.d) && epx.f(this.e, iq20Var.e) && epx.f(this.f, iq20Var.f) && epx.f(this.g, iq20Var.g) && epx.f(this.h, iq20Var.h);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BrowserPerfState browserPerfState = this.d;
        int hashCode4 = (hashCode3 + (browserPerfState == null ? 0 : browserPerfState.hashCode())) * 31;
        Integer num = this.e;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        yp80 yp80Var = this.g;
        int hashCode7 = (hashCode6 + (yp80Var == null ? 0 : yp80Var.hashCode())) * 31;
        LaunchContext launchContext = this.h;
        return hashCode7 + (launchContext != null ? launchContext.hashCode() : 0);
    }

    public final String toString() {
        return "MiniAppStat(trackCode=" + this.a + ", ref=" + this.b + ", entryPoint=" + this.c + ", perfState=" + this.d + ", requestId=" + this.e + ", requestKey=" + this.f + ", callback=" + this.g + ", launchContext=" + this.h + ')';
    }

    public iq20(String str, String str2, String str3, BrowserPerfState browserPerfState, Integer num, String str4, yp80 yp80Var, LaunchContext launchContext, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        browserPerfState = (i & 8) != 0 ? null : browserPerfState;
        num = (i & 16) != 0 ? null : num;
        str4 = (i & 32) != 0 ? null : str4;
        yp80Var = (i & 64) != 0 ? null : yp80Var;
        launchContext = (i & 128) != 0 ? null : launchContext;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = browserPerfState;
        this.e = num;
        this.f = str4;
        this.g = yp80Var;
        this.h = launchContext;
    }
}
