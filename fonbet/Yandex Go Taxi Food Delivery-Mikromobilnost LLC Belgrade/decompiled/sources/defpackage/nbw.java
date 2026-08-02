package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class nbw {
    public final String a;
    public final String b;
    public final boolean c;

    public nbw(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nbw)) {
            return false;
        }
        nbw nbwVar = (nbw) obj;
        return jl40.l(this.a, nbwVar.a) && jl40.l(this.b, nbwVar.b) && this.c == nbwVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("IntercityDashboardCommentSuggestUiState(suggestText=", this.a, ", imageTag=", this.b, ", isSelected="), this.c, Extension.C_BRAKE);
    }
}
