package xsna;

import java.util.LinkedHashMap;

/* compiled from: DialogThemesLangModel.kt */
/* loaded from: classes2.dex */
public final class nlm {
    public final LinkedHashMap a;
    public final String b;
    public final boolean c;

    public nlm(String str, LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlm)) {
            return false;
        }
        nlm nlmVar = (nlm) obj;
        return this.a.equals(nlmVar.a) && epx.f(this.b, nlmVar.b) && this.c == nlmVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogThemesLangModel(styles=");
        sb.append(this.a);
        sb.append(", versionHash=");
        sb.append(this.b);
        sb.append(", notChanged=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
