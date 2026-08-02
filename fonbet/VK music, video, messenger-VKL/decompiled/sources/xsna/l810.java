package xsna;

/* compiled from: MarketMultiPickerPageContent.kt */
/* loaded from: classes18.dex */
public final class l810 {
    public final a a;

    /* compiled from: MarketMultiPickerPageContent.kt */
    public static abstract class a {

        /* compiled from: MarketMultiPickerPageContent.kt */
        /* renamed from: xsna.l810$a$a, reason: collision with other inner class name */
        public static final class C3240a extends a {
            public static final C3240a a = new C3240a();
        }
    }

    public l810() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l810)) {
            return false;
        }
        l810 l810Var = (l810) obj;
        l810Var.getClass();
        return epx.f(this.a, l810Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + shy.a(0, Integer.hashCode(0) * 31, 31);
    }

    public final String toString() {
        return "MarketMultiPickerPageContent(offset=0, count=0, pagingState=" + this.a + ')';
    }

    public l810(int i) {
        this.a = a.C3240a.a;
    }
}
