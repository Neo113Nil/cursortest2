package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.common.AdRequestError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.qn9;

/* loaded from: classes10.dex */
public final class w12 {
    public final q12 a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final y5 c;
    public c10 d;
    public zu3 e;

    public w12(Context context, d4 d4Var, ov2 ov2Var, w5 w5Var, q12 q12Var) {
        this.a = q12Var;
        this.c = new y5(context, d4Var, ov2Var, w5Var);
    }

    public final void a(l4 l4Var) {
        this.c.a(l4Var.b, l4Var.c);
        this.b.post(new xsna.si0(7, this, l4Var));
    }

    public static final void a(w12 w12Var, l4 l4Var) {
        c10 c10Var = w12Var.d;
        if (c10Var != null) {
            ((tu3) c10Var).a(l4Var);
        }
        zu3 zu3Var = w12Var.e;
        if (zu3Var != null) {
            new CallbackStackTraceMarker(new xu3(zu3Var, new AdRequestError(l4Var.a, l4Var.c, l4Var.d)));
        }
        q12 q12Var = w12Var.a;
        p12 p12Var = (p12) q12Var.a;
        p12Var.e.a();
        p12Var.d.remove(q12Var);
    }

    public final void a(x12 x12Var) {
        d00 d00Var = e00.c;
        p4.a("native");
        this.c.a();
        this.b.post(new qn9(9, this, x12Var));
    }

    public static final void a(w12 w12Var, x12 x12Var) {
        c10 c10Var = w12Var.d;
        if (c10Var != null) {
            ((tu3) c10Var).a(x12Var);
        }
        q12 q12Var = w12Var.a;
        p12 p12Var = (p12) q12Var.a;
        p12Var.e.a();
        p12Var.d.remove(q12Var);
    }

    public final void a(ArrayList arrayList) {
        d00 d00Var = e00.c;
        p4.a("native");
        this.c.a();
        this.b.post(new xsna.h12(17, this, arrayList));
    }

    public static final void a(w12 w12Var, List list) {
        zu3 zu3Var = w12Var.e;
        if (zu3Var != null) {
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.yandex.mobile.ads.nativeads.d((x12) it.next()));
            }
            new CallbackStackTraceMarker(new yu3(zu3Var, arrayList));
        }
        q12 q12Var = w12Var.a;
        p12 p12Var = (p12) q12Var.a;
        p12Var.e.a();
        p12Var.d.remove(q12Var);
    }

    public final void a(w32 w32Var) {
        d00 d00Var = e00.c;
        p4.a("native");
        this.c.a();
        this.b.post(new xsna.k0(14, this, w32Var));
    }

    public static final void a(w12 w12Var, w32 w32Var) {
        w12Var.getClass();
        q12 q12Var = w12Var.a;
        p12 p12Var = (p12) q12Var.a;
        p12Var.e.a();
        p12Var.d.remove(q12Var);
    }

    public final void a(d4 d4Var) {
        this.c.e = new j9(d4Var);
    }

    public final void a(j22 j22Var) {
        this.c.f = j22Var;
    }
}
