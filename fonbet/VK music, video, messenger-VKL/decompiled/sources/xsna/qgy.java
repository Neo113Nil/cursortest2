package xsna;

/* compiled from: StickersKeyboardItems.kt */
/* loaded from: classes6.dex */
public final class qgy extends rf6 {
    public final String b;
    public final int c;

    public qgy(String str, int i) {
        this.b = str;
        this.c = i;
    }

    @Override // xsna.rf6
    public final int a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qgy)) {
            return false;
        }
        qgy qgyVar = (qgy) obj;
        return epx.f(this.b, qgyVar.b) && this.c == qgyVar.c;
    }

    @Override // xsna.rf6, xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyboardNoteViewItem(note=");
        sb.append(this.b);
        sb.append(", stickerId=");
        return vu5.b(sb, this.c, ')');
    }
}
