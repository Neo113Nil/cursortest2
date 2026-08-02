package xsna;

import android.content.Context;
import android.os.Build;
import com.vkontakte.android.R;

/* compiled from: AndroidGraphicsContext.android.kt */
/* loaded from: classes11.dex */
public final class c92 implements kdu {
    public static boolean f = true;
    public final p52 a;
    public final Object b = new Object();
    public kyt0 c;
    public boolean d;
    public final a92 e;

    public c92(p52 p52Var) {
        this.a = p52Var;
        a92 a92Var = new a92(this);
        this.e = a92Var;
        if (p52Var.isAttachedToWindow()) {
            Context context = p52Var.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(a92Var);
                this.d = true;
            }
        }
        p52Var.addOnAttachStateChangeListener(new b92(this));
    }

    @Override // xsna.kdu
    public final mdu a() {
        pdu ieuVar;
        mdu mduVar;
        synchronized (this.b) {
            try {
                p52 p52Var = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    p52Var.getUniqueDrawingId();
                }
                if (i >= 29) {
                    ieuVar = new heu();
                } else if (f) {
                    try {
                        ieuVar = new vdu(this.a, new ir9(), new er9());
                    } catch (Throwable unused) {
                        f = false;
                        ieuVar = new ieu(c(this.a));
                    }
                } else {
                    ieuVar = new ieu(c(this.a));
                }
                mduVar = new mdu(ieuVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return mduVar;
    }

    @Override // xsna.kdu
    public final void b(mdu mduVar) {
        synchronized (this.b) {
            if (!mduVar.s) {
                mduVar.s = true;
                mduVar.b();
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final qho c(p52 p52Var) {
        kyt0 kyt0Var = this.c;
        if (kyt0Var != null) {
            return kyt0Var;
        }
        kyt0 kyt0Var2 = new kyt0(p52Var.getContext());
        kyt0Var2.setClipChildren(false);
        kyt0Var2.setClipToPadding(false);
        kyt0Var2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        p52Var.addView(kyt0Var2, -1);
        this.c = kyt0Var2;
        return kyt0Var2;
    }
}
