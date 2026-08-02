package xsna;

/* compiled from: TimelineSettings.kt */
/* loaded from: classes18.dex */
public abstract class t60 {
    public boolean a;

    /* compiled from: TimelineSettings.kt */
    public static final class a extends t60 {
        public final boolean b = true;

        @Override // xsna.t60
        public final boolean a() {
            return this.b;
        }
    }

    /* compiled from: TimelineSettings.kt */
    public static final class b extends t60 {
        public final long b = 300;
    }

    public boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return getClass().getName().equals(obj != null ? obj.getClass().getName() : null);
    }

    public final int hashCode() {
        return getClass().hashCode();
    }
}
