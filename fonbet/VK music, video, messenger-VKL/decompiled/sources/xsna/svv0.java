package xsna;

import com.vk.external.miniapp.net.app.WebAdConfig;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.browser.internal.utils.analytics.MiniAppEntryPoint;
import java.util.Map;
import java.util.UUID;

/* compiled from: VkUiData.kt */
/* loaded from: classes6.dex */
public abstract class svv0 {

    /* compiled from: VkUiData.kt */
    public static final class a extends svv0 {
        public final WebApiApplication a;
        public final String b;
        public final String c;
        public final Long d;
        public final String e;
        public final MiniAppEntryPoint f;
        public final UUID g;
        public final boolean h;
        public final String i;

        public a(WebApiApplication webApiApplication, String str, String str2, Long l, String str3, MiniAppEntryPoint miniAppEntryPoint, UUID uuid, boolean z, String str4) {
            this.a = webApiApplication;
            this.b = str;
            this.c = str2;
            this.d = l;
            this.e = str3;
            this.f = miniAppEntryPoint;
            this.g = uuid;
            this.h = z;
            this.i = str4;
        }

        @Override // xsna.svv0
        public final long a() {
            return this.a.b;
        }

        @Override // xsna.svv0
        public final boolean b() {
            WebApiApplication webApiApplication = this.a;
            return !webApiApplication.B || webApiApplication.M;
        }

        @Override // xsna.svv0
        public final String c() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && this.f == aVar.f && epx.f(this.g, aVar.g) && this.h == aVar.h && epx.f(this.i, aVar.i);
        }

        public final int hashCode() {
            int i = ((int) this.a.b) * 31;
            String str = this.b;
            int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l = this.d;
            int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
            String str3 = this.e;
            int hashCode4 = (this.f.hashCode() + ((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
            UUID uuid = this.g;
            int b = qoy.b((hashCode4 + (uuid == null ? 0 : uuid.hashCode())) * 31, 31, this.h);
            String str4 = this.i;
            return b + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("App(app=");
            sb.append(this.a);
            sb.append(", urlToLoad=");
            sb.append(this.b);
            sb.append(", source=");
            sb.append(this.c);
            sb.append(", dialogId=");
            sb.append(this.d);
            sb.append(", originalUrl=");
            sb.append(this.e);
            sb.append(", entryPoint=");
            sb.append(this.f);
            sb.append(", measuringSessionId=");
            sb.append(this.g);
            sb.append(", isUserBanned=");
            sb.append(this.h);
            sb.append(", specialUrl=");
            return ho8.a(sb, this.i, ')');
        }
    }

    /* compiled from: VkUiData.kt */
    public static final class b extends svv0 {
        public final String a;
        public final long b;
        public final boolean c;
        public final boolean d;
        public final Map<String, String> e;
        public final boolean f;
        public final boolean g;
        public WebAdConfig h;

        public b() {
            throw null;
        }

        public b(String str, long j, boolean z, Map map, boolean z2, boolean z3, int i) {
            z = (i & 8) != 0 ? true : z;
            map = (i & 16) != 0 ? jgp.b : map;
            z2 = (i & 32) != 0 ? false : z2;
            z3 = (i & 64) != 0 ? false : z3;
            this.a = str;
            this.b = j;
            this.c = true;
            this.d = z;
            this.e = map;
            this.f = z2;
            this.g = z3;
            this.h = null;
        }

        @Override // xsna.svv0
        public final long a() {
            return this.b;
        }

        @Override // xsna.svv0
        public final boolean b() {
            return this.g;
        }

        @Override // xsna.svv0
        public final String c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && epx.f(this.e, bVar.e) && this.f == bVar.f && this.g == bVar.g && epx.f(this.h, bVar.h);
        }

        public final int hashCode() {
            String str = this.a;
            int b = qoy.b(qoy.b(v11.a(qoy.b(qoy.b(bh10.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
            WebAdConfig webAdConfig = this.h;
            return b + (webAdConfig != null ? webAdConfig.hashCode() : 0);
        }

        public final String toString() {
            return "Page(urlToLoad=" + this.a + ", appId=" + this.b + ", shouldAppendVkUiQueries=" + this.c + ", isVkUi=" + this.d + ", headers=" + this.e + ", isUserBanned=" + this.f + ", canCache=" + this.g + ", adConfig=" + this.h + ')';
        }
    }

    public abstract long a();

    public abstract boolean b();

    public abstract String c();
}
