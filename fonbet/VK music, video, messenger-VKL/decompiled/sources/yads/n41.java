package yads;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import java.util.HashMap;

/* loaded from: classes10.dex */
public abstract class n41 {
    public final dq2 a;
    public final k41 b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public final Handler e = new Handler(Looper.getMainLooper());
    public i41 f;

    public n41(dq2 dq2Var, v92 v92Var) {
        this.a = dq2Var;
        this.b = v92Var;
    }

    public final l41 a(String str, m41 m41Var, int i, int i2) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
        ((h13) this).g.getClass();
        String a = m31.a(str, scaleType);
        Bitmap a2 = ((v92) this.b).a(a);
        if (a2 != null) {
            l41 l41Var = new l41(this, a2, null, null);
            m41Var.a(l41Var, true);
            return l41Var;
        }
        l41 l41Var2 = new l41(this, null, a, m41Var);
        m41Var.a(l41Var2, true);
        j41 j41Var = (j41) this.c.get(a);
        if (j41Var == null) {
            j41Var = (j41) this.d.get(a);
        }
        if (j41Var != null) {
            j41Var.d.add(l41Var2);
            return l41Var2;
        }
        r41 r41Var = new r41(str, new g41(this, a), i, i2, scaleType, Bitmap.Config.RGB_565, new h41(this, a));
        this.a.a(r41Var);
        this.c.put(a, new j41(r41Var, l41Var2));
        return l41Var2;
    }
}
