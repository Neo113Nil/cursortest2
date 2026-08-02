package xsna;

import com.vk.dto.posting.PostingVisibilityMode;

/* compiled from: PostingSettingsUserState.kt */
/* loaded from: classes3.dex */
public final class bmc0 {
    public final b a;
    public final a b;

    /* compiled from: PostingSettingsUserState.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;

        public a() {
            this(0);
        }

        public static a a(a aVar, boolean z, boolean z2, int i) {
            if ((i & 1) != 0) {
                z = aVar.a;
            }
            if ((i & 2) != 0) {
                z2 = aVar.b;
            }
            aVar.getClass();
            return new a(z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SettingsInfo(isVisible=");
            sb.append(this.a);
            sb.append(", isModified=");
            return defpackage.q0.a(sb, this.b, ')');
        }

        public /* synthetic */ a(int i) {
            this(true, false);
        }

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }
    }

    /* compiled from: PostingSettingsUserState.kt */
    public static final class b {
        public final boolean a;
        public final boolean b;
        public final PostingVisibilityMode c;

        public b() {
            this(0);
        }

        public static b a(b bVar, boolean z, PostingVisibilityMode postingVisibilityMode, int i) {
            boolean z2 = (i & 1) != 0 ? bVar.a : false;
            if ((i & 2) != 0) {
                z = bVar.b;
            }
            if ((i & 4) != 0) {
                postingVisibilityMode = bVar.c;
            }
            bVar.getClass();
            return new b(z2, z, postingVisibilityMode);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return "VisibilityInfo(isAllowed=" + this.a + ", isVisible=" + this.b + ", visibilityMode=" + this.c + ')';
        }

        public b(boolean z, boolean z2, PostingVisibilityMode postingVisibilityMode) {
            this.a = z;
            this.b = z2;
            this.c = postingVisibilityMode;
        }

        public /* synthetic */ b(int i) {
            this(true, true, PostingVisibilityMode.ALL);
        }
    }

    public bmc0() {
        this(0);
    }

    public static bmc0 a(bmc0 bmc0Var, b bVar, a aVar, int i) {
        if ((i & 1) != 0) {
            bVar = bmc0Var.a;
        }
        if ((i & 2) != 0) {
            aVar = bmc0Var.b;
        }
        bmc0Var.getClass();
        return new bmc0(bVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmc0)) {
            return false;
        }
        bmc0 bmc0Var = (bmc0) obj;
        return epx.f(this.a, bmc0Var.a) && epx.f(this.b, bmc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PostingSettingsUserState(visibilityInfo=" + this.a + ", settingsInfo=" + this.b + ')';
    }

    public bmc0(b bVar, a aVar) {
        this.a = bVar;
        this.b = aVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ bmc0(int i) {
        this(new b(r0), new a(r0));
        int i2 = 0;
    }
}
