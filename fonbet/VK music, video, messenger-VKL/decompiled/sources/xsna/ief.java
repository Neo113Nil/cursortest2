package xsna;

import java.util.List;

/* compiled from: ClipsUploadDescriptionViewState.kt */
/* loaded from: classes17.dex */
public final class ief {
    public final String a;
    public final us2 b;
    public final List c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public ief(String str, us2 us2Var, List list, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = us2Var;
        this.c = list;
        this.d = str2;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ief)) {
            return false;
        }
        ief iefVar = (ief) obj;
        return epx.f(this.a, iefVar.a) && this.b.equals(iefVar.b) && epx.f(this.c, iefVar.c) && epx.f(this.d, iefVar.d) && this.e == iefVar.e && this.f == iefVar.f;
    }

    public final int hashCode() {
        int a = fw3.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return Boolean.hashCode(this.f) + qoy.b(qoy.b((a + (str == null ? 0 : str.hashCode())) * 31, 31, true), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsUploadDescriptionViewState(previewUri=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append((Object) this.b);
        sb.append(", trendingHashtags=");
        mr.c(", trendingHashtagsOnboardingTitle=", sb, this.c);
        sb.append(this.d);
        sb.append(", withFullscreenPreview=true, withOpenEditorButton=");
        sb.append(this.e);
        sb.append(", withTrendingHashtagsLanding=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
