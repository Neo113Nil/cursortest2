package defpackage;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import java.util.Date;
import java.util.Iterator;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes6.dex */
public final class j610 {
    public final k7x0 a;
    public final i610 b;
    public final qbl0 c;
    public final s0r0 d;
    public final n0 e = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public j610(k7x0 k7x0Var, i610 i610Var, qbl0 qbl0Var, s0r0 s0r0Var) {
        this.a = k7x0Var;
        this.b = i610Var;
        this.c = qbl0Var;
        this.d = s0r0Var;
    }

    public final void a(mi31 mi31Var) {
        int i;
        Object obj;
        dbl0 b = this.c.b();
        k610 k610Var = k610.f;
        n0 n0Var = this.e;
        if (b != null) {
            w5d0 w5d0Var = (w5d0) b.a.d(w5d0.d);
            if (w5d0Var.b && (i = w5d0Var.c) >= 0) {
                long j = i * 86400000;
                i610 i610Var = this.b;
                i610Var.getClass();
                if (System.currentTimeMillis() > new Date(i610Var.a.a.j("ru.yandex.taxi.utils.PreferenceUtils.FIELD_MASTERCARD_LAST_SHOWN_TIMESTAMP", 0L)).getTime() + j && !this.d.a.a) {
                    Iterator it = mi31Var.a.S.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (((ServiceLevel.Branding) obj).c == ServiceLevel.Branding.Type.MASTERCARD_CASHBACK) {
                                break;
                            }
                        }
                    }
                    ServiceLevel.Branding branding = (ServiceLevel.Branding) obj;
                    if (branding == null) {
                        n0Var.g(k610Var);
                        return;
                    }
                    String str = branding.e;
                    String str2 = branding.f;
                    if (str == null || str.length() == 0) {
                        n0Var.g(k610Var);
                        return;
                    }
                    String str3 = branding.k;
                    if (str3 != null && str3.length() != 0) {
                        str3 = ((m7x0) this.a).a(str3);
                    }
                    n0Var.g(new k610(str, str2, str3, branding.b == ServiceLevel.Branding.Action.SHOW_BANNER ? branding.j.c : null, true));
                    return;
                }
            }
        }
        n0Var.g(k610Var);
    }
}
