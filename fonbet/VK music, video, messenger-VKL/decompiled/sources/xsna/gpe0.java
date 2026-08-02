package xsna;

import com.vk.libvideo.api.quality.QualitySettingsType;

/* compiled from: QualitySettingsItem.kt */
/* loaded from: classes2.dex */
public final class gpe0 {
    public final int a;
    public final String b;
    public final String c;
    public final QualitySettingsType d;
    public final boolean e;

    public gpe0(int i, String str, String str2, QualitySettingsType qualitySettingsType, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = qualitySettingsType;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpe0)) {
            return false;
        }
        gpe0 gpe0Var = (gpe0) obj;
        return this.a == gpe0Var.a && epx.f(this.b, gpe0Var.b) && epx.f(this.c, gpe0Var.c) && this.d == gpe0Var.d && this.e == gpe0Var.e;
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualitySettings(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subTitle=");
        sb.append(this.c);
        sb.append(", qualitySettingsType=");
        sb.append(this.d);
        sb.append(", enabled=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
