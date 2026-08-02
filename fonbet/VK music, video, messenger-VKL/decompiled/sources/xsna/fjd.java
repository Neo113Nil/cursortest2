package xsna;

import xsna.tlo0;

/* compiled from: ClipsAvatarCommentBubbleView.kt */
/* loaded from: classes16.dex */
public final class fjd {
    public final tlo0.h a;
    public final x7g b;
    public final boolean c;

    public fjd(tlo0.h hVar, x7g x7gVar, boolean z) {
        this.a = hVar;
        this.b = x7gVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjd)) {
            return false;
        }
        fjd fjdVar = (fjd) obj;
        return this.a.equals(fjdVar.a) && this.b.equals(fjdVar.b) && this.c == fjdVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b.a, this.a.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Comment(text=");
        sb.append(this.a);
        sb.append(", color=");
        sb.append(this.b);
        sb.append(", withAnimation=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
