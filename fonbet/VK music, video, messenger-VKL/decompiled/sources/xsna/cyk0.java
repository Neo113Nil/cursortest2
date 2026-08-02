package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: LyricsContent.kt */
/* loaded from: classes3.dex */
public final class cyk0 extends da00 {
    public final List<String> a;
    public final String b;

    public cyk0(List<String> list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyk0)) {
            return false;
        }
        cyk0 cyk0Var = (cyk0) obj;
        return epx.f(this.a, cyk0Var.a) && epx.f(this.b, cyk0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StaticLyricsContent(lines=");
        sb.append(this.a);
        sb.append(", credits=");
        return ho8.a(sb, this.b, ')');
    }

    public cyk0() {
        this(EmptyList.b, null);
    }
}
