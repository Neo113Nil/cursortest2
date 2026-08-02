package xsna;

import android.app.Application;
import com.vk.push.common.AppInfo;
import com.vk.push.common.HostInfoProvider;
import com.vk.push.common.Logger;
import java.util.List;

/* loaded from: classes9.dex */
public final class aaz0 {
    public final Application a;
    public final String b;
    public final Logger c;
    public final List<AppInfo> d;
    public final List<AppInfo> e;
    public final HostInfoProvider f;
    public final HostInfoProvider g;
    public final AppInfo h;
    public final List<AppInfo> i;
    public final String j;

    public aaz0(Application application, String str, Logger logger, List list, List list2, HostInfoProvider hostInfoProvider, HostInfoProvider hostInfoProvider2, AppInfo appInfo, List list3, String str2) {
        this.a = application;
        this.b = str;
        this.c = logger;
        this.d = list;
        this.e = list2;
        this.f = hostInfoProvider;
        this.g = hostInfoProvider2;
        this.h = appInfo;
        this.i = list3;
        this.j = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaz0)) {
            return false;
        }
        aaz0 aaz0Var = (aaz0) obj;
        return epx.f(this.a, aaz0Var.a) && epx.f(this.b, aaz0Var.b) && epx.f(this.c, aaz0Var.c) && epx.f(this.d, aaz0Var.d) && epx.f(this.e, aaz0Var.e) && epx.f(this.f, aaz0Var.f) && epx.f(this.g, aaz0Var.g) && epx.f(this.h, aaz0Var.h) && epx.f(this.i, aaz0Var.i) && epx.f(this.j, aaz0Var.j);
    }

    public final int hashCode() {
        int a = fw3.a(fw3.a((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 961, this.b)) * 31, 31, this.d), 31, this.e);
        HostInfoProvider hostInfoProvider = this.f;
        int hashCode = (a + (hostInfoProvider == null ? 0 : hostInfoProvider.hashCode())) * 31;
        HostInfoProvider hostInfoProvider2 = this.g;
        return this.j.hashCode() + fw3.a((this.h.hashCode() + ((hashCode + (hostInfoProvider2 != null ? hostInfoProvider2.hashCode() : 0)) * 31)) * 31, 961, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkpnsConfig(application=");
        sb.append(this.a);
        sb.append(", projectId=");
        sb.append(this.b);
        sb.append(", clientIdCallback=null, logger=");
        sb.append(this.c);
        sb.append(", additionalAuthProviders=");
        sb.append(this.d);
        sb.append(", additionalPushProviders=");
        sb.append(this.e);
        sb.append(", hostInfoProvider=");
        sb.append(this.f);
        sb.append(", topicHostInfoProvider=");
        sb.append(this.g);
        sb.append(", default=");
        sb.append(this.h);
        sb.append(", providers=");
        sb.append(this.i);
        sb.append(", testModeEnabled=false, sdkType=");
        return ho8.a(sb, this.j, ')');
    }
}
