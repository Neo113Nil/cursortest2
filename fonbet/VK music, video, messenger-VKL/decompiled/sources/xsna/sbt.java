package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;
import java.util.ArrayList;

/* compiled from: GamesCatalogSection.kt */
/* loaded from: classes17.dex */
public final class sbt {
    public final WebApiApplication a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final a f;
    public final String g;
    public final Boolean h;

    /* compiled from: GamesCatalogSection.kt */
    public static final class a {
        public final String a;
        public final ArrayList b;

        /* compiled from: GamesCatalogSection.kt */
        /* renamed from: xsna.sbt$a$a, reason: collision with other inner class name */
        public static final class C3659a {
            public final String a;
            public final String b;
            public final String c;

            public C3659a(String str, String str2, String str3) {
                this.a = str;
                this.b = str2;
                this.c = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3659a)) {
                    return false;
                }
                C3659a c3659a = (C3659a) obj;
                return epx.f(this.a, c3659a.a) && epx.f(this.b, c3659a.b) && epx.f(this.c, c3659a.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("GamesCatalogUserProfile(name=");
                sb.append(this.a);
                sb.append(", photoUrl=");
                sb.append(this.b);
                sb.append(", profileUrl=");
                return ho8.a(sb, this.c, ')');
            }
        }

        public a(String str, ArrayList arrayList) {
            this.a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GamesCatalogUserStack(description=");
            sb.append(this.a);
            sb.append(", profiles=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.b);
        }
    }

    public sbt(WebApiApplication webApiApplication, String str, String str2, String str3, String str4, a aVar, String str5, Boolean bool) {
        this.a = webApiApplication;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = aVar;
        this.g = str5;
        this.h = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbt)) {
            return false;
        }
        sbt sbtVar = (sbt) obj;
        return epx.f(this.a, sbtVar.a) && epx.f(this.b, sbtVar.b) && epx.f(this.c, sbtVar.c) && epx.f(this.d, sbtVar.d) && epx.f(this.e, sbtVar.e) && epx.f(this.f, sbtVar.f) && epx.f(this.g, sbtVar.g) && epx.f(this.h, sbtVar.h);
    }

    public final int hashCode() {
        int i = ((int) this.a.b) * 31;
        String str = this.b;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int a2 = urd0.a((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d);
        String str3 = this.e;
        int hashCode2 = (a2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        a aVar = this.f;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str4 = this.g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.h;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GamesCatalogExtendedAppItem(app=");
        sb.append(this.a);
        sb.append(", webViewUrl=");
        sb.append(this.b);
        sb.append(", uid=");
        sb.append(this.c);
        sb.append(", sectionTrackCode=");
        sb.append(this.d);
        sb.append(", ref=");
        sb.append(this.e);
        sb.append(", userStack=");
        sb.append(this.f);
        sb.append(", subtitle=");
        sb.append(this.g);
        sb.append(", achievementLabel=");
        return tn.a(sb, this.h, ')');
    }

    public /* synthetic */ sbt(WebApiApplication webApiApplication, String str, String str2, String str3, String str4, a aVar, String str5, Boolean bool, int i) {
        this(webApiApplication, (i & 2) != 0 ? null : str, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : aVar, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : bool);
    }
}
