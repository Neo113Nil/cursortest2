package xsna;

import com.vk.external.miniapp.net.app.WebImage;

/* compiled from: WidgetSetting.kt */
/* loaded from: classes6.dex */
public final class qnx0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final WebImage e;
    public final boolean f;
    public final boolean g;

    public qnx0(String str, String str2, String str3, String str4, WebImage webImage, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = webImage;
        this.f = z;
        this.g = z2;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnx0)) {
            return false;
        }
        qnx0 qnx0Var = (qnx0) obj;
        return epx.f(this.a, qnx0Var.a) && epx.f(this.b, qnx0Var.b) && epx.f(this.c, qnx0Var.c) && epx.f(this.d, qnx0Var.d) && epx.f(this.e, qnx0Var.e) && this.f == qnx0Var.f && this.g == qnx0Var.g;
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        WebImage webImage = this.e;
        return Boolean.hashCode(this.g) + qoy.b((a + (webImage == null ? 0 : webImage.b.hashCode())) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WidgetSetting(uid=");
        sb.append(this.a);
        sb.append(", widgetId=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", icon=");
        sb.append(this.e);
        sb.append(", isEnabled=");
        sb.append(this.f);
        sb.append(", isUnremovable=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
