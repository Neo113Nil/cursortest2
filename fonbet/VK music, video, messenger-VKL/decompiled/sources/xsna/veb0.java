package xsna;

import java.util.List;

/* compiled from: PlaylistUiModel.kt */
/* loaded from: classes17.dex */
public final class veb0 {
    public final String a;
    public final List<String> b;

    public veb0(String str, List<String> list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof veb0)) {
            return false;
        }
        veb0 veb0Var = (veb0) obj;
        return epx.f(this.a, veb0Var.a) && epx.f(this.b, veb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistUiModel(name=");
        sb.append(this.a);
        sb.append(", coverImages=");
        return ms9.a(')', sb, this.b);
    }
}
