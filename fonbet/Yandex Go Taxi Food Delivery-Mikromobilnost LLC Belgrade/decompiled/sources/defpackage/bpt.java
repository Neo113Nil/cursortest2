package defpackage;

import android.net.Uri;
import com.yandex.go.mob.HostMobSupportedApiNames;
import java.util.Iterator;
import kotlin.Pair;

/* loaded from: classes8.dex */
public final class bpt {
    public final nle a;

    public bpt(nle nleVar) {
        this.a = nleVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r1 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yp20 a() {
        String str;
        String str2;
        String str3;
        Object obj;
        pr20 pr20Var;
        lq20 lq20Var;
        iq20 a = this.a.a(HostMobSupportedApiNames.TAXI_V4);
        if (a == null || (pr20Var = a.a) == null || (lq20Var = pr20Var.a) == null || (str = lq20Var.b) == null) {
            str = "no_proxy";
        }
        if (a != null) {
            Iterator it = a.b.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((Pair) obj).c(), "mobcf")) {
                    break;
                }
            }
            Pair pair = (Pair) obj;
            if (pair != null) {
                str2 = (String) pair.f();
            }
        }
        str2 = "no_config";
        if (a == null || (str3 = (String) a.c.get("X-Mob-Id")) == null) {
            str3 = "unknown_mob_id";
        }
        return new yp20(str, str2, str3);
    }

    public final String b(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("mobcf", a().b).toString();
        } catch (Throwable th) {
            xby.l(jst.e, "PROXY_PROVISION_URL_PATCH", null, th, null, 10);
            return str;
        }
    }
}
