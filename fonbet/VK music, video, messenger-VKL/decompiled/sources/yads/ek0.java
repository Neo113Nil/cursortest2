package yads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class ek0 {
    public final dq2 a;
    public final Context b;
    public final wj0 c;
    public final HashMap d;
    public final HashMap e;
    public final Handler f;
    public Runnable g;

    public /* synthetic */ ek0(dq2 dq2Var, Context context) {
        this(dq2Var, context, new wj0());
    }

    public final void a(String str, bk0 bk0Var, Drawable drawable, mn3 mn3Var) {
        this.e.put(str, new ck0(bk0Var, drawable, mn3Var));
        if (this.g == null) {
            xsna.sd sdVar = new xsna.sd(this, 17);
            this.f.postDelayed(sdVar, 100L);
            this.g = sdVar;
        }
    }

    public ek0(dq2 dq2Var, Context context, wj0 wj0Var) {
        this.a = dq2Var;
        this.b = context;
        this.c = wj0Var;
        this.d = new HashMap();
        this.e = new HashMap();
        this.f = new Handler(Looper.getMainLooper());
    }

    public static final void a(ek0 ek0Var) {
        Iterator it = ek0Var.e.entrySet().iterator();
        while (it.hasNext()) {
            ck0 ck0Var = (ck0) ((Map.Entry) it.next()).getValue();
            for (x31 x31Var : ck0Var.a.b) {
                if (ck0Var.c == null) {
                    Drawable drawable = ck0Var.b;
                    if (drawable != null) {
                        x31Var.a.a(drawable);
                    } else {
                        x31Var.getClass();
                    }
                } else {
                    x31Var.getClass();
                }
            }
        }
        ek0Var.e.clear();
        ek0Var.g = null;
    }

    public final void a(String str, x31 x31Var) {
        vj0 a = this.c.a(str);
        if (a != null) {
            Drawable drawable = a.a;
            if (drawable != null) {
                x31Var.a.a(drawable);
                return;
            }
            return;
        }
        bk0 bk0Var = (bk0) this.d.get(str);
        if (bk0Var != null) {
            bk0Var.a.add(x31Var);
            return;
        }
        Context context = this.b;
        gk0 gk0Var = new gk0(str, new fk0(context.getApplicationContext()), new dk0(this, str), new xsna.jx0(this, str));
        this.d.put(str, new bk0(x31Var));
        this.a.a(gk0Var);
    }

    public static final void a(ek0 ek0Var, String str, mn3 mn3Var) {
        bk0 bk0Var = (bk0) ek0Var.d.remove(str);
        if (bk0Var == null) {
            return;
        }
        ek0Var.a(str, bk0Var, null, mn3Var);
    }
}
