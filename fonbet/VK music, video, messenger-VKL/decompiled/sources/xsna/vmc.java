package xsna;

/* compiled from: ClipCatalogClipsMapper.kt */
/* loaded from: classes17.dex */
public final class vmc {
    public final a a;
    public final j2r0 b;
    public final k2r0 c;
    public final dqu d;
    public final equ e;

    /* compiled from: ClipCatalogClipsMapper.kt */
    public static final class a {
        public final boolean a;

        public a() {
            this(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ClipCatalogClipsMapperConfig(isNeedToLoadTitle="), this.a, ')');
        }

        public a(boolean z) {
            this.a = z;
        }
    }

    public vmc(a aVar) {
        this.a = aVar;
        this.b = new j2r0();
        this.c = new k2r0();
        this.d = new dqu();
        this.e = new equ();
    }

    public vmc() {
        this(new a(true));
    }
}
