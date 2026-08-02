package defpackage;

import androidx.compose.ui.draw.b;
import androidx.compose.ui.graphics.Path$Direction;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;

/* loaded from: classes11.dex */
public final /* synthetic */ class mgr0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ mgr0(String str, String str2, String str3, String str4, long j) {
        this.a = 1;
        this.c = str;
        this.w = str2;
        this.b = j;
        this.x = str3;
        this.y = str4;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        long j = this.b;
        Object obj2 = this.y;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                eb2 eb2Var = (eb2) obj4;
                igr0 igr0Var = (igr0) obj3;
                m3u0 m3u0Var = (m3u0) obj2;
                b bVar = (b) obj;
                ix80 a = ((ehr0) obj5).a(bVar.a.c(), bVar.a.getLayoutDirection(), bVar);
                boolean z = a instanceof gx80;
                long j2 = this.b;
                if (z) {
                    return bVar.a(new ogr0(eb2Var, m3u0Var, j2, igr0Var, (gx80) a, eb2Var, 0));
                }
                if (!(a instanceof hx80)) {
                    if (a instanceof fx80) {
                        return bVar.a(new ogr0(eb2Var, m3u0Var, j2, igr0Var, (fx80) a, eb2Var, 3));
                    }
                    w511.b();
                    return null;
                }
                sxk0 sxk0Var = ((hx80) a).a;
                if (ora1.d(sxk0Var)) {
                    return bVar.a(new ogr0(eb2Var, m3u0Var, j2, igr0Var, sxk0Var, eb2Var, 1));
                }
                jb2 a2 = nb2.a();
                a2.f(sxk0Var, Path$Direction.CounterClockwise);
                return bVar.a(new ogr0(eb2Var, m3u0Var, j2, igr0Var, a2, eb2Var, 2));
            case 1:
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                oll0 oll0Var = (oll0) obj;
                ull0 T0 = oll0Var.T0("UPDATE stored_experiments SET version = ?, value = ?, last_update = ? WHERE source = ? AND name = ?");
                try {
                    if (str == null) {
                        T0.p(1);
                    } else {
                        T0.g1(1, str);
                    }
                    T0.g1(2, str2);
                    T0.b(3, j);
                    T0.g1(4, str3);
                    T0.g1(5, str4);
                    T0.q();
                    int x = jx81.x(oll0Var);
                    T0.close();
                    return Integer.valueOf(x);
                } catch (Throwable th) {
                    T0.close();
                    throw th;
                }
            default:
                com.ybsdk.feature.webview.internal.domain.b bVar2 = (com.ybsdk.feature.webview.internal.domain.b) obj5;
                String str5 = (String) obj4;
                String str6 = (String) obj3;
                String str7 = (String) obj2;
                if (((Throwable) obj) instanceof CancellationException) {
                    gw41 gw41Var = bVar2.c.v0;
                    String valueOf = String.valueOf(j);
                    String valueOf2 = String.valueOf(System.currentTimeMillis());
                    LinkedHashMap t = x4e.t(5, "url", str5, "url_source", str6);
                    if (str7 != null) {
                        t.put("retpath", str7);
                    }
                    t.put("start_time_ms", valueOf);
                    t.put("cancel_time_ms", valueOf2);
                    gw41Var.a.a("tech.webview.status_check.cancel", t);
                }
                return zy11.a;
        }
    }

    public /* synthetic */ mgr0(Object obj, Object obj2, Object obj3, Object obj4, long j, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
        this.b = j;
    }
}
