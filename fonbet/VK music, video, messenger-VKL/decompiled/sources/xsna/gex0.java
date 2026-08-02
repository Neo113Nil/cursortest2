package xsna;

import com.vk.core.preference.Preference;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import com.vk.update.core.c;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.ky6;

/* compiled from: WebAppCore.kt */
/* loaded from: classes11.dex */
public final class gex0 implements w8i {
    public static final gex0 b = new gex0();
    public static final AtomicBoolean c = new AtomicBoolean();

    /* compiled from: WebAppCore.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final er6 c;
        public final fr6 d;
        public final fr6 e;

        public a() {
            throw null;
        }

        public a(String str) {
            er6 er6Var = new er6(19);
            fr6 fr6Var = new fr6(25);
            this.a = "vkclient";
            this.b = str;
            this.c = er6Var;
            this.d = fr6Var;
            this.e = fr6Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31);
        }

        public final String toString() {
            return "Config(appName=" + this.a + ", appId=" + this.b + ", debugApiHost=" + this.c + ", debugOauthHost=" + this.d + ", debugOauthTokenHost=" + this.e + ')';
        }
    }

    /* compiled from: WebAppCore.kt */
    public static final class b {
        public final void a(String str, com.vk.update.core.c cVar) {
            String str2;
            if ((cVar instanceof c.g) || (cVar instanceof c.d)) {
                ky6.a aVar = (ky6.a) Preference.j().edit();
                str2 = str;
                aVar.putString("vk_package_manager_install_key", str2);
                aVar.a();
            } else {
                str2 = str;
            }
            l5m l5mVar = new l5m(null, null, 3);
            l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.IN_APP_UPDATE.h(), null, str2, Integer.valueOf((int) cVar.b()), cVar.a(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -30, 3, null);
            l5mVar.q();
        }
    }
}
