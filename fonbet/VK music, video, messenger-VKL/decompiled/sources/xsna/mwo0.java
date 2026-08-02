package xsna;

import android.content.Context;
import android.graphics.RectF;
import com.vk.clips.design.view.timeline.TimelineView;
import com.vk.editor.timeline.state.TracksFilter;
import java.util.Iterator;

/* compiled from: TimelineController.kt */
/* loaded from: classes18.dex */
public final class mwo0 {
    public final Context a;
    public final TimelineView b;
    public final vd7 c;
    public final ywo0 d = new ywo0(null);
    public final gc00 e;
    public wzs<? super pwo0, ? super gp6, Boolean> f;
    public izs<? super Integer, s3q0> g;
    public gzs<s3q0> h;
    public gzs<s3q0> i;
    public rwo0 j;
    public g2f k;
    public uke l;
    public long m;
    public gxo0 n;

    public mwo0(Context context, TimelineView timelineView, vd7 vd7Var) {
        this.a = context;
        this.b = timelineView;
        this.c = vd7Var;
        this.e = new gc00(new dck0(this, 6), vd7Var);
    }

    public final void a() {
        this.b.invalidate();
        izs<? super Integer, s3q0> izsVar = this.g;
        if (izsVar != null) {
            izsVar.invoke(Integer.valueOf(this.d.a));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [xsna.gp6] */
    /* JADX WARN: Type inference failed for: r2v2, types: [xsna.gp6] */
    /* JADX WARN: Type inference failed for: r2v4, types: [xsna.ckt0] */
    public final void b(float f, float f2) {
        ckt0 a;
        rwo0 rwo0Var;
        ywo0 ywo0Var = this.d;
        Iterator<ckt0> it = ywo0Var.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                a = ywo0Var.a(f, f2);
                break;
            } else {
                a = it.next();
                if (a.l.contains(f, f2)) {
                    break;
                }
            }
        }
        if (a == 0 || (rwo0Var = this.j) == null) {
            return;
        }
        rwo0Var.m(a.D());
    }

    public final void c(int i, int i2) {
        ywo0 ywo0Var = this.d;
        ywo0Var.k(i, i2);
        if (i != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.m > 130) {
                rwo0 rwo0Var = this.j;
                if (rwo0Var != null) {
                    rwo0Var.t(ywo0Var.s);
                }
                this.m = currentTimeMillis;
            }
        }
        a();
    }

    public final void d(gp6 gp6Var) {
        float f = gp6Var.u().top;
        ywo0 ywo0Var = this.d;
        RectF rectF = ywo0Var.q;
        RectF rectF2 = ywo0Var.q;
        float f2 = rectF.top;
        float f3 = h7i0.l;
        if (f < f2 + f3) {
            c(0, (int) ((gp6Var.u().top - rectF2.top) - f3));
        }
        float f4 = rectF2.bottom - ywo0Var.f(TracksFilter.ONLY_FIXED);
        if (gp6Var.u().bottom > f4) {
            c(0, (int) (gp6Var.u().bottom - f4));
        }
    }

    public final boolean e(gp6 gp6Var) {
        ywo0 ywo0Var = this.d;
        if (gp6Var == null || epx.f(ywo0Var.j, gp6Var)) {
            gp6Var = null;
        }
        if (gp6Var != null) {
            d(gp6Var);
        }
        wzs<? super pwo0, ? super gp6, Boolean> wzsVar = this.f;
        if (wzsVar == null || !wzsVar.invoke(ywo0Var.h(gp6Var), gp6Var).booleanValue()) {
            return false;
        }
        ywo0Var.j = gp6Var;
        a();
        return true;
    }
}
