package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import ru.yandex.taxi.widget.BalanceBarView;

/* loaded from: classes6.dex */
public final class do4 extends dv31 {
    public final ArgbEvaluatorCompat k;
    public final int l;
    public final int m;
    public final zh2 n;
    public Drawable o;
    public Drawable p;
    public final RectF q;
    public float r;
    public float s;
    public final Paint t;
    public int u;
    public int v;

    public do4(BalanceBarView balanceBarView) {
        super(balanceBarView, new dv4(qje.t(xng0.controlMinor, balanceBarView.getContext()), 0.5f, null, true));
        this.k = new ArgbEvaluatorCompat();
        this.l = tje.r(usg0.balance_bar_item_size, balanceBarView.getContext());
        this.m = tje.r(usg0.balance_bar_item_small_size, balanceBarView.getContext());
        this.n = new zh2(mam.a);
        this.q = new RectF();
        this.t = new Paint(1);
    }

    @Override // defpackage.dv31
    public final void a(Object obj, Object obj2) {
        dv4 dv4Var = (dv4) obj2;
        n4v n4vVar = ((dv4) obj).c;
        String str = n4vVar != null ? n4vVar.b : null;
        n4v n4vVar2 = dv4Var.c;
        float f = !jl40.l(str, n4vVar2 != null ? n4vVar2.b : null) ? 0.0f : 255.0f;
        zh2 zh2Var = this.n;
        zh2Var.e = f;
        zh2Var.f = 255.0f;
        zh2Var.b = zh2Var.d;
        float f2 = dv4Var.b;
        if (this.b) {
            f2 = 1.0f - f2;
        }
        zh2Var.c = f2;
        this.r = this.q.width();
        this.s = dv4Var.c != null ? this.l : this.m;
        this.u = this.t.getColor();
        this.v = dv4Var.a;
        this.a.invalidate();
    }

    @Override // defpackage.dv31
    public final void d(Object obj, Object obj2) {
        this.o = this.p;
        n4v n4vVar = ((dv4) obj2).c;
        BitmapDrawable bitmapDrawable = n4vVar != null ? n4vVar.a : null;
        this.p = bitmapDrawable;
        if (bitmapDrawable != null) {
            mam.a(bitmapDrawable, this.l);
        }
    }

    @Override // defpackage.dv31
    public final void f(float f) {
        zh2 zh2Var = this.n;
        zh2Var.d = uh6.H(zh2Var.b, zh2Var.c, f);
        zh2Var.g = uh6.H(zh2Var.e, zh2Var.f, f);
        float H = uh6.H(this.r, this.s, f) / 2.0f;
        float f2 = -H;
        this.q.set(f2, f2, H, H);
        this.t.setColor(this.k.evaluate(f, Integer.valueOf(this.u), Integer.valueOf(this.v)).intValue());
    }
}
