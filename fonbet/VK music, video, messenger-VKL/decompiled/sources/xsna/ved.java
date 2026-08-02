package xsna;

import java.util.List;

/* compiled from: ClipUserSettingsResponse.kt */
/* loaded from: classes18.dex */
public final class ved {
    public final List<ued> a;
    public final boolean b;

    public ved(List<ued> list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ved)) {
            return false;
        }
        ved vedVar = (ved) obj;
        return epx.f(this.a, vedVar.a) && this.b == vedVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipUserSettingsResponse(settings=");
        sb.append(this.a);
        sb.append(", ownerCanAttachLink=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
