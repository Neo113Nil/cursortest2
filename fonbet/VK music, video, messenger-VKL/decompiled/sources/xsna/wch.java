package xsna;

/* compiled from: CommunityPostingItemModel.kt */
/* loaded from: classes5.dex */
public final class wch extends s4h {
    public static final a k = new a();
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final iug j;

    /* compiled from: CommunityPostingItemModel.kt */
    public static final class a {
    }

    public wch(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, iug iugVar) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = iugVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wch)) {
            return false;
        }
        wch wchVar = (wch) obj;
        return this.b == wchVar.b && this.c == wchVar.c && this.d == wchVar.d && this.e == wchVar.e && this.f == wchVar.f && this.g == wchVar.g && this.h == wchVar.h && this.i == wchVar.i && epx.f(this.j, wchVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        return "CommunityPostingItemModel(isAdmin=" + this.b + ", isEditor=" + this.c + ", canPostStories=" + this.d + ", canPostVideos=" + this.e + ", showClipsIcon=" + this.f + ", canSuggest=" + this.g + ", needToShowPostingPlaceholder=" + this.h + ", showSuggest=" + this.i + ", channelInfo=" + this.j + ')';
    }
}
