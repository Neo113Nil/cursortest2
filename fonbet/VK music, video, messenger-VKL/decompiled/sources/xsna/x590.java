package xsna;

import com.vk.clips.sdk.models.SdkCoOwnerItem;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.models.SdkVerifyInfo;
import java.util.List;

/* compiled from: OwnerViewState.kt */
/* loaded from: classes17.dex */
public final class x590 {
    public final a a;
    public final tlo0 b;
    public final b c;
    public final d d;
    public final c e;
    public final boolean f;

    /* compiled from: OwnerViewState.kt */
    public interface a {

        /* compiled from: OwnerViewState.kt */
        /* renamed from: xsna.x590$a$a, reason: collision with other inner class name */
        public static final class C3974a implements a {
            public final SdkOwner a;
            public final List<SdkCoOwnerItem> b;

            public C3974a(SdkOwner sdkOwner, List<SdkCoOwnerItem> list) {
                this.a = sdkOwner;
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3974a)) {
                    return false;
                }
                C3974a c3974a = (C3974a) obj;
                return epx.f(this.a, c3974a.a) && epx.f(this.b, c3974a.b);
            }

            public final int hashCode() {
                SdkOwner sdkOwner = this.a;
                return this.b.hashCode() + ((sdkOwner == null ? 0 : sdkOwner.hashCode()) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Coauthors(owner=");
                sb.append(this.a);
                sb.append(", coauthors=");
                return ms9.a(')', sb, this.b);
            }
        }

        /* compiled from: OwnerViewState.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 995725460;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* compiled from: OwnerViewState.kt */
        public static final class c implements a {
            public final SdkOwner a;
            public final String b;

            public c(SdkOwner sdkOwner, String str) {
                this.a = sdkOwner;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
            }

            public final int hashCode() {
                SdkOwner sdkOwner = this.a;
                int hashCode = (sdkOwner == null ? 0 : sdkOwner.hashCode()) * 31;
                String str = this.b;
                return hashCode + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("SingleOwner(owner=");
                sb.append(this.a);
                sb.append(", url=");
                return ho8.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: OwnerViewState.kt */
    public interface b {

        /* compiled from: OwnerViewState.kt */
        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1295074624;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* compiled from: OwnerViewState.kt */
        /* renamed from: xsna.x590$b$b, reason: collision with other inner class name */
        public static final class C3975b implements b {
            public final String a;

            public C3975b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3975b) && epx.f(this.a, ((C3975b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Visible(statusUrl="), this.a, ')');
            }
        }
    }

    /* compiled from: OwnerViewState.kt */
    public interface c {

        /* compiled from: OwnerViewState.kt */
        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1708229832;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* compiled from: OwnerViewState.kt */
        public static final class b implements c {
            public final String a;
            public final String b;
            public final boolean c;
            public final boolean d;

            public b(String str, String str2, boolean z, boolean z2) {
                this.a = str;
                this.b = str2;
                this.c = z;
                this.d = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d;
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                return Boolean.hashCode(this.d) + qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Visible(title=");
                sb.append(this.a);
                sb.append(", author=");
                sb.append(this.b);
                sb.append(", isTrend=");
                sb.append(this.c);
                sb.append(", isOriginal=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }
    }

    /* compiled from: OwnerViewState.kt */
    public interface d {

        /* compiled from: OwnerViewState.kt */
        public static final class a implements d {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1605517412;
            }

            public final String toString() {
                return "Hidden";
            }
        }

        /* compiled from: OwnerViewState.kt */
        public static final class b implements d {
            public final SdkVerifyInfo a;

            public b(SdkVerifyInfo sdkVerifyInfo) {
                this.a = sdkVerifyInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Visible(verifyInfo=" + this.a + ')';
            }
        }
    }

    public x590(a aVar, tlo0 tlo0Var, b bVar, d dVar, c cVar, boolean z) {
        this.a = aVar;
        this.b = tlo0Var;
        this.c = bVar;
        this.d = dVar;
        this.e = cVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x590)) {
            return false;
        }
        x590 x590Var = (x590) obj;
        return epx.f(this.a, x590Var.a) && epx.f(this.b, x590Var.b) && epx.f(this.c, x590Var.c) && epx.f(this.d, x590Var.d) && epx.f(this.e, x590Var.e) && this.f == x590Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + com.vk.movika.sdk.base.model.history.b.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OwnerViewState(avatarState=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", statusState=");
        sb.append(this.c);
        sb.append(", verifiedState=");
        sb.append(this.d);
        sb.append(", musicState=");
        sb.append(this.e);
        sb.append(", isAdsBannerVisible=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
