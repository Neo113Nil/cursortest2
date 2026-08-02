package xsna;

import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;

/* compiled from: OpeningParams.kt */
/* loaded from: classes4.dex */
public final class rs80 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final PostingCreationEntryPoint h;
    public final String i;
    public final m7b j;
    public final o6c0 k;

    public rs80(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, PostingCreationEntryPoint postingCreationEntryPoint, String str, m7b m7bVar, o6c0 o6c0Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = postingCreationEntryPoint;
        this.i = str;
        this.j = m7bVar;
        this.k = o6c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs80)) {
            return false;
        }
        rs80 rs80Var = (rs80) obj;
        return this.a == rs80Var.a && this.b == rs80Var.b && this.c == rs80Var.c && this.d == rs80Var.d && this.e == rs80Var.e && this.f == rs80Var.f && this.g == rs80Var.g && this.h == rs80Var.h && epx.f(this.i, rs80Var.i) && epx.f(this.j, rs80Var.j) && epx.f(this.k, rs80Var.k);
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31;
        String str = this.i;
        return this.k.hashCode() + ((this.j.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "OpeningParams(isClipsAvailable=" + this.a + ", isStoriesAvailable=" + this.b + ", isVideoAvailable=" + this.c + ", isLivesAvailable=" + this.d + ", isPostingRedesignEnabled=" + this.e + ", isVideoRelocationHintAvailable=" + this.f + ", isUserPosting=" + this.g + ", creationEntryPoint=" + this.h + ", title=" + this.i + ", channelParams=" + this.j + ", postParams=" + this.k + ')';
    }
}
