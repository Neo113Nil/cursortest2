package xsna;

/* compiled from: BirthdaysListViewItem.kt */
/* loaded from: classes15.dex */
public final class jb7 implements hfz {
    public final String b;

    public jb7(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jb7) && epx.f(this.b, ((jb7) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.hashCode());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("SectionHeader(title="), this.b, ')');
    }
}
