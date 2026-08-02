package xsna;

import com.vk.dto.music.Thumb;
import com.vk.music.snippet.api.presentation.model.SnippetSectionType;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SnippetSection.kt */
/* loaded from: classes3.dex */
public final class nck0 {
    public final String a;
    public final String b;
    public final String c;
    public final Thumb d;
    public final String e;
    public final SnippetSectionType f;
    public final List<nbk0> g;

    public nck0(String str, String str2, String str3, Thumb thumb, String str4, SnippetSectionType snippetSectionType, List<nbk0> list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = thumb;
        this.e = str4;
        this.f = snippetSectionType;
        this.g = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static nck0 a(nck0 nck0Var, ArrayList arrayList, int i) {
        String str = nck0Var.a;
        String str2 = nck0Var.b;
        String str3 = nck0Var.c;
        Thumb thumb = nck0Var.d;
        String str4 = nck0Var.e;
        SnippetSectionType snippetSectionType = nck0Var.f;
        List list = arrayList;
        if ((i & 64) != 0) {
            list = nck0Var.g;
        }
        return new nck0(str, str2, str3, thumb, str4, snippetSectionType, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nck0)) {
            return false;
        }
        nck0 nck0Var = (nck0) obj;
        return epx.f(this.a, nck0Var.a) && epx.f(this.b, nck0Var.b) && epx.f(this.c, nck0Var.c) && epx.f(this.d, nck0Var.d) && epx.f(this.e, nck0Var.e) && this.f == nck0Var.f && epx.f(this.g, nck0Var.g);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Thumb thumb = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + urd0.a((a + (thumb == null ? 0 : thumb.hashCode())) * 31, 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnippetSection(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", thumb=");
        sb.append(this.d);
        sb.append(", navUrl=");
        sb.append(this.e);
        sb.append(", type=");
        sb.append(this.f);
        sb.append(", snippets=");
        return ms9.a(')', sb, this.g);
    }
}
