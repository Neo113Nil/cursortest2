package xsna;

import com.vk.appredirects.entity.App;
import com.vk.appredirects.entity.LinkType;
import java.util.List;

/* compiled from: AppRedirectSetting.kt */
/* loaded from: classes15.dex */
public final class j83 {
    public final LinkType a;
    public final App b;
    public final List<App> c;

    /* JADX WARN: Multi-variable type inference failed */
    public j83(LinkType linkType, App app2, List<? extends App> list) {
        this.a = linkType;
        this.b = app2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j83)) {
            return false;
        }
        j83 j83Var = (j83) obj;
        return this.a == j83Var.a && this.b == j83Var.b && epx.f(this.c, j83Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        App app2 = this.b;
        return this.c.hashCode() + ((hashCode + (app2 == null ? 0 : app2.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppRedirectSetting(linkType=");
        sb.append(this.a);
        sb.append(", handler=");
        sb.append(this.b);
        sb.append(", options=");
        return ms9.a(')', sb, this.c);
    }
}
