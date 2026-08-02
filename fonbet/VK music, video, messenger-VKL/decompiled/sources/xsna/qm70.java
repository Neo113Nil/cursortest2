package xsna;

import android.net.Uri;
import java.util.List;

/* compiled from: NspkChooserViewState.kt */
/* loaded from: classes2.dex */
public final class qm70 implements ao50 {
    public final Uri a;
    public final b3h0 b;
    public final String c;
    public final List<hfz> d;

    /* JADX WARN: Multi-variable type inference failed */
    public qm70(Uri uri, b3h0 b3h0Var, String str, List<? extends hfz> list) {
        this.a = uri;
        this.b = b3h0Var;
        this.c = str;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm70)) {
            return false;
        }
        qm70 qm70Var = (qm70) obj;
        return epx.f(this.a, qm70Var.a) && epx.f(this.b, qm70Var.b) && epx.f(this.c, qm70Var.c) && epx.f(this.d, qm70Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NspkChooserViewState(originLink=");
        sb.append(this.a);
        sb.append(", sbpLinkData=");
        sb.append(this.b);
        sb.append(", sumValue=");
        sb.append(this.c);
        sb.append(", banks=");
        return ms9.a(')', sb, this.d);
    }
}
