package xsna;

import android.content.Intent;
import android.graphics.RectF;
import com.vk.dto.user.UserProfile;
import com.vk.profile.user.impl.domain.edit.models.ProfileSettingType;
import xsna.e4s;
import xsna.pta;

/* compiled from: UserEditProfileAction.kt */
/* loaded from: classes5.dex */
public interface aiq0 extends kj50 {

    /* compiled from: UserEditProfileAction.kt */
    public interface a extends aiq0 {

        /* compiled from: UserEditProfileAction.kt */
        /* renamed from: xsna.aiq0$a$a, reason: collision with other inner class name */
        public static final class C2544a implements a {
            public static final C2544a b = new C2544a();
        }

        /* compiled from: UserEditProfileAction.kt */
        public static final class b implements a {
            public final String b;

            public b() {
                this(null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                String str = this.b;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Edit(sourceScreen="), this.b, ')');
            }

            public b(String str) {
                this.b = str;
            }
        }

        /* compiled from: UserEditProfileAction.kt */
        public static final class c implements a {
            public final Intent b;

            public c(Intent intent) {
                this.b = intent;
            }
        }

        /* compiled from: UserEditProfileAction.kt */
        public static final class d implements a {
            public static final d b = new d();
        }
    }

    /* compiled from: UserEditProfileAction.kt */
    public interface b extends aiq0 {

        /* compiled from: UserEditProfileAction.kt */
        public static final class a implements b {
            public static final a b = new a();
        }

        /* compiled from: UserEditProfileAction.kt */
        /* renamed from: xsna.aiq0$b$b, reason: collision with other inner class name */
        public static final class C2545b implements b {
            public static final C2545b b = new C2545b();
        }
    }

    /* compiled from: UserEditProfileAction.kt */
    public static final class c implements aiq0 {
        public final Intent b;

        public c(Intent intent) {
            this.b = intent;
        }
    }

    /* compiled from: UserEditProfileAction.kt */
    public interface d extends aiq0 {

        /* compiled from: UserEditProfileAction.kt */
        public static final class a implements d {
            public final pta.a b;

            public a(pta.a aVar) {
                this.b = aVar;
            }
        }

        /* compiled from: UserEditProfileAction.kt */
        public static final class b implements d {
            public final pta.a b;

            public b(pta.a aVar) {
                this.b = aVar;
            }
        }
    }

    /* compiled from: UserEditProfileAction.kt */
    public interface e extends aiq0 {

        /* compiled from: UserEditProfileAction.kt */
        public static final class a implements e {
            public static final a b = new a();
        }

        /* compiled from: UserEditProfileAction.kt */
        public static final class b implements e {
            public final Intent b;

            public b(Intent intent) {
                this.b = intent;
            }
        }

        /* compiled from: UserEditProfileAction.kt */
        public static final class c implements e {
            public static final c b = new c();
        }
    }

    /* compiled from: UserEditProfileAction.kt */
    public static final class f implements aiq0 {
        public final String b;

        public f(String str) {
            this.b = str;
        }
    }

    /* compiled from: UserEditProfileAction.kt */
    public interface g extends aiq0 {

        /* compiled from: UserEditProfileAction.kt */
        public static final class a implements g {
            public final e4s.a b;

            public a(e4s.a aVar) {
                this.b = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ClickDescription(description=" + this.b + ')';
            }
        }

        /* compiled from: UserEditProfileAction.kt */
        public static final class b implements g {
            public final boolean b;
            public final boolean c;

            public b(boolean z, boolean z2) {
                this.b = z;
                this.c = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.b == bVar.b && this.c == bVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Edit(isChecked=");
                sb.append(this.b);
                sb.append(", openProfileIfNeeded=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: UserEditProfileAction.kt */
        public static final class c implements g {
            public static final c b = new c();
        }

        /* compiled from: UserEditProfileAction.kt */
        public static final class d implements g {
            public static final d b = new d();
        }
    }

    /* compiled from: UserEditProfileAction.kt */
    public interface h extends aiq0 {

        /* compiled from: UserEditProfileAction.kt */
        public static final class a implements h {
            public static final a b = new a();
        }

        /* compiled from: UserEditProfileAction.kt */
        public static final class b implements h {
            public static final b b = new b();
        }
    }

    /* compiled from: UserEditProfileAction.kt */
    public interface i extends aiq0 {

        /* compiled from: UserEditProfileAction.kt */
        public static final class a implements i {
        }

        /* compiled from: UserEditProfileAction.kt */
        public static final class b implements i {
            public final UserProfile b;

            public b(UserProfile userProfile) {
                this.b = userProfile;
            }
        }

        /* compiled from: UserEditProfileAction.kt */
        public static final class c implements i {
            public final String b;
            public final RectF c;

            public c() {
                this(null, null);
            }

            public c(RectF rectF, String str) {
                this.b = str;
                this.c = rectF;
            }
        }

        /* compiled from: UserEditProfileAction.kt */
        public interface d extends i {

            /* compiled from: UserEditProfileAction.kt */
            public static final class a implements d {
                public static final a b = new a();
            }

            /* compiled from: UserEditProfileAction.kt */
            public static final class b implements d {
                public final boolean b;
                public final boolean c;

                public b(boolean z, boolean z2) {
                    this.b = z;
                    this.c = z2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.b == bVar.b && this.c == bVar.c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Onboarding(isFollowersModeEnabled=");
                    sb.append(this.b);
                    sb.append(", showActionButton=");
                    return defpackage.q0.a(sb, this.c, ')');
                }
            }
        }

        /* compiled from: UserEditProfileAction.kt */
        public static final class e implements i {
            public final String b;

            public e(String str) {
                this.b = str;
            }
        }

        /* compiled from: UserEditProfileAction.kt */
        public static final class f implements i {
            public final ProfileSettingType b;

            public f(ProfileSettingType profileSettingType) {
                this.b = profileSettingType;
            }
        }

        /* compiled from: UserEditProfileAction.kt */
        public static final class g implements i {
            public final String b;

            public g(String str) {
                this.b = str;
            }
        }

        /* compiled from: UserEditProfileAction.kt */
        public static final class h implements i {
            public static final h b = new h();
        }
    }

    /* compiled from: UserEditProfileAction.kt */
    public interface j extends aiq0 {

        /* compiled from: UserEditProfileAction.kt */
        public static final class a implements j {
            public static final a b = new a();
        }

        /* compiled from: UserEditProfileAction.kt */
        public static final class b implements j {
            public static final b b = new b();
        }

        /* compiled from: UserEditProfileAction.kt */
        public static final class c implements j {
            public static final c b = new c();
        }
    }

    /* compiled from: UserEditProfileAction.kt */
    public static final class k implements aiq0 {
    }

    /* compiled from: UserEditProfileAction.kt */
    public interface l extends aiq0 {

        /* compiled from: UserEditProfileAction.kt */
        public static final class a implements l {
            public static final a b = new a();
        }

        /* compiled from: UserEditProfileAction.kt */
        public static final class b implements l {
            public static final b b = new b();
        }
    }

    /* compiled from: UserEditProfileAction.kt */
    public static final class m implements aiq0 {
        public final boolean b;

        public m(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.b == ((m) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UpdateProfileClosedState(isClosed="), this.b, ')');
        }
    }

    /* compiled from: UserEditProfileAction.kt */
    public static final class n implements aiq0 {
        public final boolean b;

        public n(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.b == ((n) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UpdateSilentModeState(isEnabled="), this.b, ')');
        }
    }
}
