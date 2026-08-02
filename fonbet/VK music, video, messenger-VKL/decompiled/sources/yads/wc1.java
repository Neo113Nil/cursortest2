package yads;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public abstract class wc1 extends RelativeLayout {
    private final d4 a;
    private final ov2 b;
    private final ni1 c;
    private final si1 d;
    private final hx2 e;
    private final km f;
    private final xc1 g;
    private final ArrayList h;
    private int i;
    private int j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ wc1(Context context, AttributeSet attributeSet, int i, d4 d4Var, mv3 mv3Var) {
        this(context, attributeSet, i, d4Var, mv3Var, r6, r7, r8, new jm(context, d4Var, mv3Var, r8), gx2.a());
        ni1 ni1Var = new ni1();
        si1 si1Var = new si1(context);
        w5 w5Var = new w5();
    }

    private final xc1 a() {
        return ad1.a(this, this.f);
    }

    public abstract km a(Context context, d4 d4Var, jm jmVar, w5 w5Var);

    public final void addVisibilityChangeListener(pm3 pm3Var) {
        this.h.add(pm3Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i00 c() {
        e13 e13Var;
        this.d.a();
        km kmVar = this.f;
        v9 v9Var = kmVar.v;
        if (v9Var != null) {
            ov0 c = v9Var.c();
            int i = c.c;
            e13Var = c;
            if (i == 0) {
                int i2 = c.d;
                e13Var = c;
                if (i2 == 0) {
                    e13Var = null;
                }
            }
        }
        e13Var = kmVar.c.d.a;
        if (e13Var != null) {
            return new i00(e13Var);
        }
        return null;
    }

    public final String d() {
        this.d.a();
        um umVar = this.f.K;
        if (umVar != null) {
            return umVar.getAdInfo();
        }
        return null;
    }

    public void destroy() {
        this.d.a();
        this.c.a();
        this.h.clear();
        int i = tb.b;
        if (tb.a((mu) this.f)) {
            return;
        }
        this.f.d();
    }

    public final pi3 e() {
        this.d.a();
        return this.f.E;
    }

    public final d4 getAdConfiguration$mobileads_externalRelease() {
        return this.a;
    }

    public final int getHeightMeasureSpec$mobileads_externalRelease() {
        return this.j;
    }

    public final ov2 getSdkEnvironmentModule$mobileads_externalRelease() {
        return this.b;
    }

    public final int getWidthMeasureSpec$mobileads_externalRelease() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getClass().toString();
        xc1 xc1Var = this.g;
        getContext();
        xc1Var.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        int i2 = tb.b;
        if (!tb.a((mu) this.f)) {
            km kmVar = this.f;
            v9 v9Var = kmVar.v;
            ov0 c = v9Var != null ? v9Var.c() : null;
            if (c != null) {
                e13 e13Var = kmVar.c.d.a;
                v9 v9Var2 = kmVar.v;
                if (v9Var2 != null && e13Var != null && g13.a(kmVar.a, v9Var2, c, kmVar.F, e13Var)) {
                    i = 0;
                    setVisibility(i);
                }
            }
            g9 g9Var = this.a.e;
            if (g9Var != null) {
                a(g9Var);
            }
            i = 8;
            setVisibility(i);
        }
        Objects.toString(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getClass().toString();
        xc1 xc1Var = this.g;
        getContext();
        xc1Var.onDetachedFromWindow();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.i = i;
        this.j = i2;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.e == null) {
            return;
        }
        Objects.toString(view);
        qu2 a = this.e.a(getContext());
        if (a == null || !a.h()) {
            a(i);
        } else if (this == view) {
            a(i);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        getVisibility();
        a((i == 0 && getVisibility() == 0) ? 0 : 8);
    }

    public final void removeVisibilityChangeListener(pm3 pm3Var) {
        this.h.remove(pm3Var);
    }

    public void setAdUnitId(String str) {
        this.d.a();
        this.f.c.a(str);
    }

    public final c00 a(String str) {
        List list;
        this.d.a();
        i00 c = c();
        la laVar = c != null ? new la(c.a.getWidth(), c.a.getHeight()) : null;
        String d = d();
        this.d.a();
        um umVar = this.f.K;
        if (umVar == null || (list = umVar.b()) == null) {
            list = EmptyList.b;
        }
        return new c00(str, laVar, d, list);
    }

    public final List b() {
        List a;
        this.d.a();
        um umVar = this.f.K;
        return (umVar == null || (a = umVar.a()) == null) ? EmptyList.b : a;
    }

    public wc1(Context context, AttributeSet attributeSet, int i, d4 d4Var, mv3 mv3Var, ni1 ni1Var, si1 si1Var, w5 w5Var, jm jmVar, hx2 hx2Var) {
        super(context, attributeSet, i);
        this.a = d4Var;
        this.b = mv3Var;
        this.c = ni1Var;
        this.d = si1Var;
        this.e = hx2Var;
        this.h = new ArrayList();
        si1Var.a();
        km a = a(context, d4Var, jmVar, w5Var);
        this.f = a;
        jmVar.a(a.e());
        xc1 a2 = a();
        this.g = a2;
        a2.a(context, this);
    }

    public final void a(g9 g9Var) {
        this.d.a();
        this.c.a(new xsna.e6(12, this, g9Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(wc1 wc1Var, g9 g9Var) {
        wc1Var.f.b(g9Var);
    }

    private final void a(int i) {
        int i2 = tb.b;
        if (tb.a((mu) this.f)) {
            return;
        }
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((sn2) ((pm3) it.next())).p();
        }
    }

    public final void a(h00 h00Var) {
        this.d.a();
        km kmVar = this.f;
        jm jmVar = kmVar.D;
        kmVar.u = jmVar;
        jmVar.c = h00Var;
        jmVar.b.a(h00Var);
    }

    public final void a(i00 i00Var) {
        this.d.a();
        this.f.a(i00Var.a);
    }
}
