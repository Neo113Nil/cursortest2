package xsna;

/* compiled from: ClipsEditorStatus.kt */
/* loaded from: classes16.dex */
public final class yzd {
    public static final yzd f = new yzd(false, false, false, false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public yzd(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public static yzd a(yzd yzdVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        if ((i & 1) != 0) {
            z = yzdVar.a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            z2 = yzdVar.b;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = yzdVar.c;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = yzdVar.d;
        }
        boolean z9 = z4;
        if ((i & 16) != 0) {
            z5 = yzdVar.e;
        }
        yzdVar.getClass();
        return new yzd(z6, z7, z8, z9, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzd)) {
            return false;
        }
        yzd yzdVar = (yzd) obj;
        return this.a == yzdVar.a && this.b == yzdVar.b && this.c == yzdVar.c && this.d == yzdVar.d && this.e == yzdVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsEditorStatus(uploadEnabled=");
        sb.append(this.a);
        sb.append(", undoEnabled=");
        sb.append(this.b);
        sb.append(", redoEnabled=");
        sb.append(this.c);
        sb.append(", allVideosMuted=");
        sb.append(this.d);
        sb.append(", voiceoverRecording=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
