package xsna;

import android.net.Uri;
import java.util.List;

/* compiled from: AnalyticsConfig.kt */
/* loaded from: classes3.dex */
public final class aqa0 {
    public final Uri a;
    public final List<zpa0> b;

    /* JADX WARN: Multi-variable type inference failed */
    public aqa0(Uri uri, List<? extends zpa0> list) {
        this.a = uri;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqa0)) {
            return false;
        }
        aqa0 aqa0Var = (aqa0) obj;
        return epx.f(this.a, aqa0Var.a) && epx.f(this.b, aqa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PixelAnalyticsConfig(videoUrl=");
        sb.append(this.a);
        sb.append(", pixels=");
        return ms9.a(')', sb, this.b);
    }
}
