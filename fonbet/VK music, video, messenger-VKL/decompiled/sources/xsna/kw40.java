package xsna;

/* compiled from: MusicPlayerEvent.kt */
/* loaded from: classes3.dex */
public abstract class kw40 {
    public final mw40 a;

    /* compiled from: MusicPlayerEvent.kt */
    public static final class a extends kw40 {
        public final hr90 b;

        public a(mw40 mw40Var, hr90 hr90Var) {
            super(mw40Var);
            this.b = hr90Var;
        }

        public final String toString() {
            return "MusicPlayerEvent.Pause(eventTrigger=" + this.b + ", meta=" + this.a + ')';
        }
    }

    /* compiled from: MusicPlayerEvent.kt */
    public static final class b extends kw40 {
        public final xua0 b;

        public b(mw40 mw40Var, xua0 xua0Var) {
            super(mw40Var);
            this.b = xua0Var;
        }

        public final String toString() {
            return "MusicPlayerEvent.Play(eventTrigger=" + this.b + ", meta=" + this.a + ')';
        }
    }

    /* compiled from: MusicPlayerEvent.kt */
    public static final class c extends kw40 {
        public final agl0 b;

        public c(mw40 mw40Var, agl0 agl0Var) {
            super(mw40Var);
            this.b = agl0Var;
        }

        public final String toString() {
            return "MusicPlayerEvent.Stop(eventTrigger=" + this.b + ", meta=" + this.a + ')';
        }
    }

    public kw40(mw40 mw40Var) {
        this.a = mw40Var;
    }
}
