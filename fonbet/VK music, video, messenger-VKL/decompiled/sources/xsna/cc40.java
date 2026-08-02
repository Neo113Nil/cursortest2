package xsna;

/* compiled from: MusicBottomPanelUiDto.kt */
/* loaded from: classes4.dex */
public final class cc40 {
    public final boolean a;
    public final ma40 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final boolean l;

    public cc40() {
        this(true, null, false, false, true, "", false, false, false, false, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc40)) {
            return false;
        }
        cc40 cc40Var = (cc40) obj;
        return this.a == cc40Var.a && epx.f(this.b, cc40Var.b) && this.c == cc40Var.c && this.d == cc40Var.d && this.e == cc40Var.e && epx.f(this.f, cc40Var.f) && this.g == cc40Var.g && this.h == cc40Var.h && this.i == cc40Var.i && this.j == cc40Var.j && epx.f(this.k, cc40Var.k) && this.l == cc40Var.l;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        ma40 ma40Var = this.b;
        int b = qoy.b(qoy.b(qoy.b(qoy.b(urd0.a(qoy.b(qoy.b(qoy.b((hashCode + (ma40Var == null ? 0 : ma40Var.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        String str = this.k;
        return Boolean.hashCode(this.l) + ((b + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicBottomPanelUiDto(shouldShowPanel=");
        sb.append(this.a);
        sb.append(", attachUiDto=");
        sb.append(this.b);
        sb.append(", shouldShowPreviewCell=");
        sb.append(this.c);
        sb.append(", shouldShowSnippetControls=");
        sb.append(this.d);
        sb.append(", shouldShowHint=");
        sb.append(this.e);
        sb.append(", hintText=");
        sb.append(this.f);
        sb.append(", isSaveButtonEnabled=");
        sb.append(this.g);
        sb.append(", canOpen=");
        sb.append(this.h);
        sb.append(", shouldShowAttachPlaylistButton=");
        sb.append(this.i);
        sb.append(", shouldShowSnippetSubtitle=");
        sb.append(this.j);
        sb.append(", snippetOnboardingTitle=");
        sb.append(this.k);
        sb.append(", shouldShowSnippetOnboarding=");
        return defpackage.q0.a(sb, this.l, ')');
    }

    public cc40(boolean z, ma40 ma40Var, boolean z2, boolean z3, boolean z4, String str, boolean z5, boolean z6, boolean z7, boolean z8, String str2, boolean z9) {
        this.a = z;
        this.b = ma40Var;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = str;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = str2;
        this.l = z9;
    }
}
