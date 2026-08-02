package xsna;

/* compiled from: ShowMoreType.kt */
/* loaded from: classes17.dex */
public abstract class uij0 {

    /* compiled from: ShowMoreType.kt */
    public static final class a extends uij0 {
        public static final a a = new a();
    }

    /* compiled from: ShowMoreType.kt */
    public static final class b extends uij0 {
        public static final b a = new b();
    }

    /* compiled from: ShowMoreType.kt */
    public static final class c extends uij0 {
        public static final c a = new c();
    }

    public final String toString() {
        return this instanceof c ? "same_line" : this instanceof a ? "new_line" : "none";
    }
}
