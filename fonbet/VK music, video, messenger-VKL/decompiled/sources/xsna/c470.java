package xsna;

/* compiled from: NoResultsItem.kt */
/* loaded from: classes2.dex */
public final class c470 implements bia0 {
    public final String b;

    public c470() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c470) && epx.f(this.b, ((c470) obj).b);
    }

    @Override // xsna.hfz
    public final /* bridge */ /* synthetic */ Number getItemId() {
        return 14;
    }

    public final int hashCode() {
        String str = this.b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("NoResultsItem(text="), this.b, ')');
    }

    public c470(String str) {
        this.b = str;
    }
}
