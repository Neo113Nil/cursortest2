package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsChallenge;
import java.util.ArrayList;

/* compiled from: ToolbarBindingData.kt */
/* loaded from: classes17.dex */
public abstract class a3p0 {

    /* compiled from: ToolbarBindingData.kt */
    public static final class a extends a3p0 {
        public final ClipGridParams.Data a;
        public final int b;
        public final int c;
        public final ClipsChallenge d;
        public final C2519a e;

        /* compiled from: ToolbarBindingData.kt */
        /* renamed from: xsna.a3p0$a$a, reason: collision with other inner class name */
        public static final class C2519a {
            public final String a;
            public final tlo0 b;
            public final tlo0 c;
            public final tlo0 d;
            public final String e;
            public final Image f;
            public final Long g;

            public C2519a(String str, tlo0 tlo0Var, tlo0 tlo0Var2, tlo0 tlo0Var3, String str2, Image image, Long l) {
                this.a = str;
                this.b = tlo0Var;
                this.c = tlo0Var2;
                this.d = tlo0Var3;
                this.e = str2;
                this.f = image;
                this.g = l;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2519a)) {
                    return false;
                }
                C2519a c2519a = (C2519a) obj;
                return epx.f(this.a, c2519a.a) && epx.f(this.b, c2519a.b) && epx.f(this.c, c2519a.c) && epx.f(this.d, c2519a.d) && epx.f(this.e, c2519a.e) && epx.f(this.f, c2519a.f) && epx.f(this.g, c2519a.g);
            }

            public final int hashCode() {
                String str = this.a;
                int a = com.vk.movika.sdk.base.model.history.b.a(com.vk.movika.sdk.base.model.history.b.a(com.vk.movika.sdk.base.model.history.b.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
                String str2 = this.e;
                int b = fq.b(this.f, (a + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
                Long l = this.g;
                return b + (l != null ? l.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Banner(id=");
                sb.append(this.a);
                sb.append(", title=");
                sb.append(this.b);
                sb.append(", description=");
                sb.append(this.c);
                sb.append(", buttonTitle=");
                sb.append(this.d);
                sb.append(", buttonUrl=");
                sb.append(this.e);
                sb.append(", image=");
                sb.append(this.f);
                sb.append(", ttl=");
                return iq.b(sb, this.g, ')');
            }
        }

        public a(ClipGridParams.Data data, int i, int i2, ClipsChallenge clipsChallenge, C2519a c2519a) {
            this.a = data;
            this.b = i;
            this.c = i2;
            this.d = clipsChallenge;
            this.e = c2519a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int a = shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
            ClipsChallenge clipsChallenge = this.d;
            int hashCode = (a + (clipsChallenge == null ? 0 : clipsChallenge.hashCode())) * 31;
            C2519a c2519a = this.e;
            return Boolean.hashCode(false) + ((hashCode + (c2519a == null ? 0 : c2519a.hashCode())) * 31);
        }

        public final String toString() {
            return "Common(params=" + this.a + ", viewsCount=" + this.b + ", likesCount=" + this.c + ", challenge=" + this.d + ", banner=" + this.e + ", roundedCorners=false)";
        }
    }

    /* compiled from: ToolbarBindingData.kt */
    public static abstract class b extends a3p0 {

        /* compiled from: ToolbarBindingData.kt */
        public static final class a extends b {
            public final ClipGridParams.Data.Profile a;

            public a(ClipGridParams.Data.Profile profile) {
                this.a = profile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return Boolean.hashCode(false) + (this.a.b.hashCode() * 31);
            }

            public final String toString() {
                return "Common(params=" + this.a + ", roundedCorners=false)";
            }
        }

        /* compiled from: ToolbarBindingData.kt */
        /* renamed from: xsna.a3p0$b$b, reason: collision with other inner class name */
        public static final class C2520b extends b {
            public final ArrayList a;
            public final UserId b;
            public final boolean c;
            public final wl0 d;

            public C2520b(ArrayList arrayList, UserId userId, boolean z, wl0 wl0Var) {
                this.a = arrayList;
                this.b = userId;
                this.c = z;
                this.d = wl0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2520b)) {
                    return false;
                }
                C2520b c2520b = (C2520b) obj;
                return epx.f(this.a, c2520b.a) && epx.f(this.b, c2520b.b) && this.c == c2520b.c && epx.f(this.d, c2520b.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + qoy.b(bh10.a(this.a.hashCode() * 31, 31, this.b.b), 31, this.c);
            }

            public final String toString() {
                return "Owner(profiles=" + this.a + ", selectedId=" + this.b + ", roundedCorners=" + this.c + ", onProfileSelected=" + this.d + ')';
            }
        }
    }

    /* compiled from: ToolbarBindingData.kt */
    public static final class c extends a3p0 {
        public final String a;
        public final Image b;

        public c(String str, Image image) {
            this.a = str;
            this.b = image;
        }
    }
}
