package xsna;

import com.vk.dto.common.Image;
import java.util.List;
import xsna.rvd0;
import xsna.zxe;

/* compiled from: ProfileCard.kt */
/* loaded from: classes17.dex */
public interface hud0 {

    /* compiled from: ProfileCard.kt */
    public static final class a implements hud0 {
        public final Image a;
        public final String b;
        public final zxe.a c;

        public a() {
            this(null, null);
        }

        @Override // xsna.hud0
        public final zxe a() {
            return this.c;
        }

        @Override // xsna.hud0
        public final boolean c() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        @Override // xsna.hud0
        public final long getKey() {
            return 0L;
        }

        public final int hashCode() {
            Image image = this.a;
            int hashCode = (image == null ? 0 : image.hashCode()) * 31;
            String str = this.b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnonProfile(image=");
            sb.append(this.a);
            sb.append(", title=");
            return ho8.a(sb, this.b, ')');
        }

        public a(Image image, String str) {
            this.a = image;
            this.b = str;
            this.c = zxe.a.a;
        }
    }

    /* compiled from: ProfileCard.kt */
    public interface b extends hud0 {

        /* compiled from: ProfileCard.kt */
        /* renamed from: xsna.hud0$b$b, reason: collision with other inner class name */
        public static final class C3022b implements b, e {
            public final rvd0 a;
            public final zxe.b b;
            public final boolean c;
            public final long d;

            public C3022b(rvd0 rvd0Var) {
                this.a = rvd0Var;
                rvd0.a aVar = rvd0Var.c;
                this.b = fkq0.d(aVar.d) ? zxe.b.c.a : zxe.b.C4209b.a;
                this.c = true;
                this.d = aVar.d.b;
            }

            @Override // xsna.hud0
            public final zxe a() {
                return this.b;
            }

            @Override // xsna.hud0.e
            public final rvd0 b() {
                return this.a;
            }

            @Override // xsna.hud0
            public final boolean c() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3022b) && epx.f(this.a, ((C3022b) obj).a);
            }

            @Override // xsna.hud0
            public final long getKey() {
                return this.d;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "CurUserProfile(profileData=" + this.a + ')';
            }
        }

        /* compiled from: ProfileCard.kt */
        public static final class a implements b {
            public final List a;
            public final zxe.b.a b;

            public a() {
                this(k3k0.c);
            }

            @Override // xsna.hud0
            public final zxe a() {
                return this.b;
            }

            @Override // xsna.hud0
            public final boolean c() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            @Override // xsna.hud0
            public final long getKey() {
                return 0L;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return jr.a(')', new StringBuilder("AddNewProfile(images="), this.a);
            }

            public a(List list) {
                this.a = list;
                this.b = zxe.b.a.a;
            }
        }
    }

    /* compiled from: ProfileCard.kt */
    public static final class c implements hud0, e {
        public final rvd0 a;
        public final long b;

        public c(rvd0 rvd0Var) {
            this.a = rvd0Var;
            this.b = rvd0Var.c.d.b;
        }

        @Override // xsna.hud0
        public final zxe a() {
            return zxe.c.a;
        }

        @Override // xsna.hud0.e
        public final rvd0 b() {
            return this.a;
        }

        @Override // xsna.hud0
        public final boolean c() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        @Override // xsna.hud0
        public final long getKey() {
            return this.b;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DeactivatedProfile(profileData=" + this.a + ')';
        }
    }

    /* compiled from: ProfileCard.kt */
    public static final class d implements hud0, e {
        public final rvd0 a;
        public final zxe.d b;
        public final long c;

        public d(rvd0 rvd0Var, zxe.d dVar) {
            this.a = rvd0Var;
            this.b = dVar;
            this.c = rvd0Var.c.d.b;
        }

        @Override // xsna.hud0
        public final zxe a() {
            return this.b;
        }

        @Override // xsna.hud0.e
        public final rvd0 b() {
            return this.a;
        }

        @Override // xsna.hud0
        public final boolean c() {
            return !this.b.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        @Override // xsna.hud0
        public final long getKey() {
            return this.c;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OtherUserProfile(profileData=" + this.a + ", buttonsState=" + this.b + ')';
        }
    }

    /* compiled from: ProfileCard.kt */
    public interface e extends hud0 {
        rvd0 b();
    }

    zxe a();

    boolean c();

    long getKey();
}
