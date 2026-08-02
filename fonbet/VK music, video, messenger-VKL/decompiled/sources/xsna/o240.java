package xsna;

import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import java.util.Iterator;
import xsna.usi0;

/* compiled from: MultiAccountLogoutHelper.kt */
/* loaded from: classes6.dex */
public final class o240 {
    public final mui0 a;
    public final sxi0 b;
    public final mp c;
    public final com.vk.superapp.multiaccount.api.a d;
    public final x140 e;

    public o240(mui0 mui0Var, sxi0 sxi0Var, mp mpVar, com.vk.superapp.multiaccount.api.a aVar) {
        this.a = mui0Var;
        this.b = sxi0Var;
        this.c = mpVar;
        this.d = aVar;
        r55 r55Var = r55.a;
        this.e = new x140(r55.a());
    }

    public static usi0.a a(o240 o240Var, UserId userId, boolean z) {
        Object obj;
        usi0.a i;
        Bundle bundle = Bundle.EMPTY;
        mui0 mui0Var = o240Var.a;
        Iterator it = mui0Var.e().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((usi0.a) obj).c().a, userId)) {
                break;
            }
        }
        usi0.a aVar = (usi0.a) obj;
        if (aVar != null && (i = mui0Var.i()) != null) {
            o240Var.b.h(aVar);
            mp mpVar = o240Var.c;
            if (mpVar != null) {
                mpVar.c(userId);
            }
            usi0.a i2 = mui0Var.i();
            if (i2 != null) {
                if (!epx.f(i.c().a, i2.c().a)) {
                    x140 x140Var = o240Var.e;
                    MultiAccountEntryPoint multiAccountEntryPoint = z ? MultiAccountEntryPoint.Logout.d : MultiAccountEntryPoint.Unknown.d;
                    x140Var.getClass();
                    io.reactivex.rxjava3.internal.operators.observable.g.subscribe(x140.a(i2, multiAccountEntryPoint, i), new r1u(), new n240(new i37(par0.a, 11), 0), io.reactivex.rxjava3.internal.functions.a.c);
                }
                return aVar;
            }
        }
        return null;
    }
}
