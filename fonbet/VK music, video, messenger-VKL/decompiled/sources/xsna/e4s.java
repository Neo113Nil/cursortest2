package xsna;

/* compiled from: FollowersModeSettingsData.kt */
/* loaded from: classes5.dex */
public final class e4s {
    public final boolean a;
    public final a b;

    /* compiled from: FollowersModeSettingsData.kt */
    public static abstract class a {
        public final s8u0 a;

        /* compiled from: FollowersModeSettingsData.kt */
        /* renamed from: xsna.e4s$a$a, reason: collision with other inner class name */
        public static final class C2777a extends a {
            public static final C2777a b = new C2777a(null);
        }

        /* compiled from: FollowersModeSettingsData.kt */
        public static final class b extends a {
            public final s8u0 b;

            public b(s8u0 s8u0Var) {
                super(s8u0Var);
                this.b = s8u0Var;
            }

            @Override // xsna.e4s.a
            public final s8u0 a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "SilentModeEnabled(text=" + this.b + ')';
            }
        }

        public a(s8u0 s8u0Var) {
            this.a = s8u0Var;
        }

        public s8u0 a() {
            return this.a;
        }
    }

    public e4s(boolean z, a aVar) {
        this.a = z;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4s)) {
            return false;
        }
        e4s e4sVar = (e4s) obj;
        return this.a == e4sVar.a && epx.f(this.b, e4sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "FollowersModeSettingsData(isSwitchEnabled=" + this.a + ", description=" + this.b + ')';
    }
}
