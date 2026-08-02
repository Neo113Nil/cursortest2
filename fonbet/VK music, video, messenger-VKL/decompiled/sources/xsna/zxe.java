package xsna;

/* compiled from: ClipsProfileToolbarButtonsState.kt */
/* loaded from: classes17.dex */
public interface zxe {

    /* compiled from: ClipsProfileToolbarButtonsState.kt */
    public static final class a implements zxe {
        public static final a a = new a();
    }

    /* compiled from: ClipsProfileToolbarButtonsState.kt */
    public interface b extends zxe {

        /* compiled from: ClipsProfileToolbarButtonsState.kt */
        public static final class a implements b {
            public static final a a = new a();
        }

        /* compiled from: ClipsProfileToolbarButtonsState.kt */
        /* renamed from: xsna.zxe$b$b, reason: collision with other inner class name */
        public static final class C4209b implements b {
            public static final C4209b a = new C4209b();
        }

        /* compiled from: ClipsProfileToolbarButtonsState.kt */
        public static final class c implements b {
            public static final c a = new c();
        }
    }

    /* compiled from: ClipsProfileToolbarButtonsState.kt */
    public static final class c implements zxe {
        public static final c a = new c();
    }

    /* compiled from: ClipsProfileToolbarButtonsState.kt */
    public static final class d implements zxe {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public d(boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
        }

        public static d a(d dVar, boolean z, boolean z2, boolean z3, boolean z4, int i) {
            if ((i & 1) != 0) {
                z = dVar.a;
            }
            if ((i & 2) != 0) {
                z2 = dVar.b;
            }
            if ((i & 4) != 0) {
                z3 = dVar.c;
            }
            if ((i & 8) != 0) {
                z4 = dVar.d;
            }
            return new d(z, z2, z3, z4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && this.d == dVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OtherUser(isBlacklisted=");
            sb.append(this.a);
            sb.append(", isSubscribed=");
            sb.append(this.b);
            sb.append(", canSendMessage=");
            sb.append(this.c);
            sb.append(", subscribeEnabled=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }
}
