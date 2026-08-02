package xsna;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.fresco.animation.bitmap.BitmapAnimationBackend;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: DefaultBitmapAnimationDrawableFactory.java */
/* loaded from: classes.dex */
public final class sbl implements tjo {
    public final ej2 a;
    public final ScheduledExecutorService b;
    public final ExecutorService c;
    public final e830 d;
    public final hta0 e;
    public final qyj<ww8, svf> f;
    public final cin0 g;
    public final cin0 h;
    public final cin0 i;
    public final cin0 j;

    public sbl(pj2 pj2Var, h0q0 h0q0Var, fmi0 fmi0Var, RealtimeSinceBootClock realtimeSinceBootClock, hta0 hta0Var, qyj qyjVar, lj2 lj2Var, mj2 mj2Var, cin0 cin0Var, cin0 cin0Var2, cin0 cin0Var3, cin0 cin0Var4) {
        this.a = pj2Var;
        this.b = h0q0Var;
        this.c = fmi0Var;
        this.d = realtimeSinceBootClock;
        this.e = hta0Var;
        this.f = qyjVar;
        this.g = cin0Var;
        this.i = cin0Var3;
        this.h = cin0Var2;
        this.j = cin0Var4;
    }

    @Override // xsna.tjo
    public final Drawable a(svf svfVar) {
        tbl tblVar;
        ec7 ec7Var = null;
        if (!(svfVar instanceof pvf)) {
            return null;
        }
        pvf pvfVar = (pvf) svfVar;
        pk2 x = pvfVar.x();
        wk2 y = pvfVar.y();
        y.getClass();
        Bitmap.Config z = x != null ? x.z() : null;
        Object obj = this.g.a;
        pk2 a = y.a();
        dj2 e = this.a.e(y, new Rect(0, 0, a.getWidth(), a.getHeight()));
        q1t q1tVar = new q1t(e);
        Integer num = 2;
        int intValue = num.intValue();
        qyj<ww8, svf> qyjVar = this.f;
        dc7 pliVar = intValue != 1 ? intValue != 2 ? intValue != 3 ? new pli(11) : new ycy(0) : new bhs(new sj2(new gp2(y.hashCode(), false), qyjVar), false) : new bhs(new sj2(new gp2(y.hashCode(), false), qyjVar), true);
        cj2 cj2Var = new cj2(pliVar, e, ((Boolean) obj).booleanValue());
        Integer num2 = 3;
        int intValue2 = num2.intValue();
        hta0 hta0Var = this.e;
        if (intValue2 > 0) {
            ec7Var = new dnr(intValue2);
            if (z == null) {
                z = Bitmap.Config.ARGB_8888;
            }
            tblVar = new tbl(hta0Var, cj2Var, z, this.c);
        } else {
            tblVar = null;
        }
        return new aj2(an2.a(new BitmapAnimationBackend(this.e, pliVar, q1tVar, cj2Var, ((Boolean) obj).booleanValue(), ((Boolean) obj).booleanValue() ? new mfs(y.b(), q1tVar, cj2Var, new kfs(hta0Var, ((Integer) this.i.a).intValue(), ((Integer) this.j.a).intValue()), ((Boolean) this.h.a).booleanValue()) : ec7Var, tblVar, null), this.d, this.b));
    }

    @Override // xsna.tjo
    public final boolean b(svf svfVar) {
        return svfVar instanceof pvf;
    }
}
