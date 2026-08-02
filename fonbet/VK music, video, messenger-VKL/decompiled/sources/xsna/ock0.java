package xsna;

import com.vk.dto.music.Thumb;
import com.vk.music.snippet.api.domain.model.SnippetSectionTypeEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: SnippetSectionEntity.kt */
/* loaded from: classes3.dex */
public final class ock0 {
    public final SnippetSectionTypeEntity a;
    public final String b;
    public final String c;
    public final Thumb d;
    public final String e;
    public final ArrayList f;
    public final List<String> g;
    public final String h;
    public final ArrayList<String> i;
    public final String j = UUID.randomUUID().toString();

    public ock0(SnippetSectionTypeEntity snippetSectionTypeEntity, String str, String str2, Thumb thumb, String str3, ArrayList arrayList, List list, String str4) {
        this.a = snippetSectionTypeEntity;
        this.b = str;
        this.c = str2;
        this.d = thumb;
        this.e = str3;
        this.f = arrayList;
        this.g = list;
        this.h = str4;
        this.i = new ArrayList<>(list);
        arrayList.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ock0)) {
            return false;
        }
        ock0 ock0Var = (ock0) obj;
        return this.a == ock0Var.a && epx.f(this.b, ock0Var.b) && epx.f(this.c, ock0Var.c) && this.d.equals(ock0Var.d) && epx.f(this.e, ock0Var.e) && this.f.equals(ock0Var.f) && epx.f(this.g, ock0Var.g) && epx.f(this.h, ock0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + fw3.a(qr.a(this.f, urd0.a((this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SnippetSectionEntity(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", thumb=");
        sb.append(this.d);
        sb.append(", navUrl=");
        sb.append(this.e);
        sb.append(", snippets=");
        sb.append(this.f);
        sb.append(", snippetIds=");
        sb.append(this.g);
        sb.append(", trackCode=");
        return ho8.a(sb, this.h, ')');
    }
}
