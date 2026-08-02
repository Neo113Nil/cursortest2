package xsna;

import java.io.File;
import java.util.List;

/* compiled from: ExternalFilePickerContract.kt */
/* loaded from: classes18.dex */
public final class oeq implements km50 {
    public final String b;
    public final boolean c;
    public final List<File> d;

    public oeq() {
        this(null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oeq)) {
            return false;
        }
        oeq oeqVar = (oeq) obj;
        return epx.f(this.b, oeqVar.b) && this.c == oeqVar.c && epx.f(this.d, oeqVar.d);
    }

    public final int hashCode() {
        String str = this.b;
        int b = qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
        List<File> list = this.d;
        return b + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalFilePickerState(error=");
        sb.append(this.b);
        sb.append(", isLoading=");
        sb.append(this.c);
        sb.append(", files=");
        return ms9.a(')', sb, this.d);
    }

    public oeq(String str, List list, int i) {
        str = (i & 1) != 0 ? null : str;
        boolean z = (i & 2) == 0;
        list = (i & 4) != 0 ? null : list;
        this.b = str;
        this.c = z;
        this.d = list;
    }
}
