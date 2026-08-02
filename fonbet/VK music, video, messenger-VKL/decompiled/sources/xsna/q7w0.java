package xsna;

/* compiled from: StickersBroadcaster.kt */
/* loaded from: classes5.dex */
public final class q7w0 extends icl0 {
    public final String a;
    public final boolean b;

    public q7w0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7w0)) {
            return false;
        }
        q7w0 q7w0Var = (q7w0) obj;
        return epx.f(this.a, q7w0Var.a) && this.b == q7w0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VmojiCharacterRecreated(characterId=");
        sb.append(this.a);
        sb.append(", isPromo=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
