package defpackage;

import android.content.Context;
import com.monetization.ads.network.core.Request;
import com.yandex.go.mob.HostMobSupportedApiNames;
import com.yandex.mobile.ads.network.interceptor.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import yads.h01;

/* loaded from: classes7.dex */
public abstract class aj61 extends Request {
    public final Context a;
    public final g291 b;
    public final bj81 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public aj61(Context context, int i, String str, g291 g291Var, bj81 bj81Var) {
        super(i, r1, g291Var);
        String str2;
        String str3;
        int H;
        int H2;
        b bVar = gga1.b;
        if (bVar != null) {
            fp20 fp20Var = (fp20) bVar.a;
            ds20 ds20Var = fp20Var.c;
            not notVar = (not) fp20Var.a;
            notVar.getClass();
            String b = notVar.b(HostMobSupportedApiNames.YX_MOBILE_ADS);
            if (b == null) {
                notVar.c.getClass();
                b = "https://yandex.ru/ads";
            }
            Map map = fp20Var.b;
            ds20Var.getClass();
            String obj = evu0.k0(str).toString();
            obj = evu0.y(obj, "://", false) ? obj : "https://".concat(obj);
            String a = ds20.a(obj);
            String str4 = null;
            String substring = (a != null && (H2 = evu0.H(obj, a, 0, false, 6)) >= 0) ? obj.substring(a.length() + H2) : null;
            if (substring != null) {
                substring = evu0.J(substring) ? null : substring;
                if (substring != null) {
                    String f0 = evu0.f0('?', substring, substring);
                    String f02 = evu0.f0('#', f0, f0);
                    List list = ds20.a;
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        int H3 = evu0.H(f02, (String) it.next(), 0, false, 6);
                        Integer valueOf = H3 < 0 ? null : Integer.valueOf(H3);
                        if (valueOf != null) {
                            arrayList.add(valueOf);
                        }
                    }
                    Integer num = (Integer) a.h0(arrayList);
                    if (num != null) {
                        str3 = substring.substring(num.intValue());
                        if (str3 != null) {
                            String obj2 = evu0.k0(b).toString();
                            if (!evu0.J(obj2)) {
                                obj2 = evu0.y(obj2, "://", false) ? obj2 : "https://".concat(obj2);
                                String a2 = ds20.a(obj2);
                                if (a2 != null) {
                                    String c0 = evu0.c0('@', a2, a2);
                                    String str5 = (String) map.get(evu0.f0(':', c0, c0));
                                    if (str5 != null) {
                                        str5 = evu0.J(str5) ? null : str5;
                                        if (str5 != null) {
                                            if (!evu0.a0(str5, '/')) {
                                                str5 = "/".concat(str5);
                                            }
                                            str2 = oyr.q(evu0.g0(obj2, "://", obj2), "://", a2, str5, str3);
                                            this.a = context;
                                            this.b = g291Var;
                                            this.c = bj81Var;
                                            setShouldCache(false);
                                            setRetryPolicy(new nv71(1.0f, 10000, 0));
                                        }
                                    }
                                    String a3 = ds20.a(obj2);
                                    if (a3 != null && (H = evu0.H(obj2, a3, 0, false, 6)) >= 0) {
                                        str4 = obj2.substring(a3.length() + H);
                                    }
                                    str5 = str4 == null ? "" : str4;
                                    str2 = oyr.q(evu0.g0(obj2, "://", obj2), "://", a2, str5, str3);
                                    this.a = context;
                                    this.b = g291Var;
                                    this.c = bj81Var;
                                    setShouldCache(false);
                                    setRetryPolicy(new nv71(1.0f, 10000, 0));
                                }
                            }
                        }
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
            }
        }
        str2 = str;
        this.a = context;
        this.b = g291Var;
        this.c = bj81Var;
        setShouldCache(false);
        setRetryPolicy(new nv71(1.0f, 10000, 0));
    }

    public final void b(Map map) {
        y381 y381Var;
        String b = ob71.b(map, h01.R);
        if (b != null) {
            Context context = this.a;
            y381 y381Var2 = y171.b;
            if (y381Var2 == null) {
                synchronized (y171.a) {
                    y381Var = y171.b;
                    if (y381Var == null) {
                        y381Var = new y381(s881.a(context, "YadPreferenceFile"));
                        y171.b = y381Var;
                    }
                }
                y381Var2 = y381Var;
            }
            y381Var2.a.a("ServerSideClientIP", b);
        }
    }

    @Override // com.monetization.ads.network.core.Request
    public final void deliverResponse(Object obj) {
        this.b.a(obj);
    }
}
