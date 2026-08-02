package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.animation.SimpleSpringInterpolator;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.BalanceBarView;
import ru.yandex.taxi.widget.BalanceWidget;

/* loaded from: classes6.dex */
public final class p4u0 extends dv31 {
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public int F;
    public float G;
    public float H;
    public float I;
    public final float J;
    public float K;
    public float L;
    public final BalanceWidget k;
    public final BalanceBarView l;
    public final i3y m;
    public final nl0 n;
    public final nl0 o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final Rect t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p4u0(BalanceWidget balanceWidget, BalanceBarView balanceBarView) {
        super(balanceWidget, new po4(r1, r2, r2, r4, false));
        ColorDrawable colorDrawable = mam.a;
        dv4 dv4Var = new dv4(qje.t(xng0.controlMinor, balanceWidget.getContext()), 0.5f, null, false);
        EmptyList emptyList = EmptyList.a;
        this.k = balanceWidget;
        this.l = balanceBarView;
        this.m = a.a(new fet0(13));
        this.n = new nl0();
        this.o = new nl0();
        this.p = tje.u(8, balanceWidget.getContext());
        int u = tje.u(2, balanceWidget.getContext());
        this.q = u;
        int u2 = tje.u(24, balanceWidget.getContext());
        this.r = u2;
        this.s = tje.u(20, balanceWidget.getContext());
        this.t = new Rect();
        this.J = (u2 * 0.625f) + u;
    }

    public static void i(ArrayList arrayList, float f, float f2) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zh2 zh2Var = (zh2) it.next();
            zh2Var.d = uh6.H(zh2Var.b, zh2Var.c, f);
            zh2Var.g = uh6.H(zh2Var.e, zh2Var.f, f2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0106  */
    @Override // defpackage.dv31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2) {
        Float valueOf;
        float f;
        po4 po4Var = (po4) obj2;
        List list = po4Var.b;
        nl0 nl0Var = this.n;
        List list2 = nl0Var.b;
        nl0Var.b = list;
        kp50.f(new ml0(list2, list), false).a(nl0Var.c);
        List list3 = po4Var.c;
        nl0 nl0Var2 = this.o;
        List list4 = nl0Var2.b;
        nl0Var2.b = list3;
        kp50.f(new ml0(list4, list3), false).a(nl0Var2.c);
        List list5 = po4Var.b;
        boolean isEmpty = list5.isEmpty();
        View view = this.a;
        this.F = c.h((isEmpty && list3.isEmpty()) ? 60 : 40, view);
        this.u = this.w;
        h();
        this.x = this.z;
        int i = this.p;
        this.y = (i * 2) + this.s + this.A;
        this.C = this.E;
        this.D = po4Var.e ? 1.0f : 0.0f;
        boolean isEmpty2 = list5.isEmpty();
        int i2 = this.r;
        float f2 = isEmpty2 ? 0.0f : i2 / 2.0f;
        float f3 = this.c;
        float j = j(nl0Var, (i + f2) * f3) - (f2 * f3);
        this.G = this.I;
        this.H = j;
        boolean z = this.v > this.u;
        Iterator it = nl0Var.a.iterator();
        if (it.hasNext()) {
            zh2 zh2Var = (zh2) it.next();
            float abs = Math.abs(zh2Var.b - zh2Var.c);
            while (it.hasNext()) {
                zh2 zh2Var2 = (zh2) it.next();
                abs = Math.max(abs, Math.abs(zh2Var2.b - zh2Var2.c));
            }
            valueOf = Float.valueOf(abs);
        } else {
            valueOf = null;
        }
        float max = Math.max(Math.abs(this.H - this.G), valueOf != null ? valueOf.floatValue() : 0.0f);
        if (z) {
            long j2 = this.h;
            if (j2 > 0) {
                f = 40.0f / j2;
                this.K = f;
                float f4 = this.J;
                this.L = max > f4 ? 1.0f - (f4 / max) : 0.0f;
                j(nl0Var2, (((i2 / 2.0f) + this.F + this.q) * f3) + j);
                view.requestLayout();
            }
        }
        f = 0.0f;
        this.K = f;
        float f42 = this.J;
        this.L = max > f42 ? 1.0f - (f42 / max) : 0.0f;
        j(nl0Var2, (((i2 / 2.0f) + this.F + this.q) * f3) + j);
        view.requestLayout();
    }

    @Override // defpackage.dv31
    public final void d(Object obj, Object obj2) {
        Pair pair;
        int i;
        PathInterpolator pathInterpolator;
        po4 po4Var = (po4) obj2;
        if (((po4) obj).e || po4Var.e) {
            i3y i3yVar = this.m;
            pair = new Pair((SimpleSpringInterpolator) i3yVar.getValue(), Long.valueOf(((SimpleSpringInterpolator) i3yVar.getValue()).getDurationMillis()));
        } else {
            BalanceBarView.Companion.getClass();
            pathInterpolator = BalanceBarView.DEFAULT_INTERPOLATOR;
            pair = new Pair(pathInterpolator, 300L);
        }
        Interpolator interpolator = (Interpolator) pair.getFirst();
        long longValue = ((Number) pair.getSecond()).longValue();
        this.i = interpolator;
        this.h = longValue;
        po4Var.a.getPadding(this.t);
        Iterator it = po4Var.b.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i = this.r;
            if (!hasNext) {
                break;
            } else {
                mam.a(((n4v) it.next()).a, i);
            }
        }
        Iterator it2 = po4Var.c.iterator();
        while (it2.hasNext()) {
            mam.a(((n4v) it2.next()).a, i);
        }
        this.k.setExpandedContentVisible(po4Var.e);
        this.l.updateState(po4Var.d, this.f);
    }

    @Override // defpackage.dv31
    public final void f(float f) {
        float max = Math.max(f, this.K);
        float f2 = this.K;
        float f3 = (max - f2) / (1.0f - f2);
        float max2 = Math.max(f, this.L);
        float f4 = this.L;
        float f5 = (max2 - f4) / (1.0f - f4);
        this.w = uh6.H(this.u, this.v, f3);
        this.z = uh6.H(this.x, this.y, f3);
        this.I = uh6.H(this.G, this.H, f3);
        this.E = uh6.H(this.C, this.D, f);
        i(this.n.a, f3, f5);
        i(this.o.a, f3, f5);
    }

    public final void h() {
        this.v = Math.max((this.p * 2.0f) + this.F + ((this.r + this.q) * (this.o.a.size() + this.n.a.size())), this.B);
    }

    public final float j(nl0 nl0Var, float f) {
        ArrayList arrayList = nl0Var.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zh2 zh2Var = (zh2) arrayList.get(i);
            if (zh2Var == nl0.d) {
                zh2 zh2Var2 = new zh2(((n4v) nl0Var.b.get(i)).a);
                zh2Var2.d = f;
                zh2Var2.g = 0.0f;
                zh2Var2.b = f;
                zh2Var2.c = f;
                zh2Var2.e = 0.0f;
                zh2Var2.f = 255.0f;
                arrayList.set(i, zh2Var2);
            } else {
                zh2Var.b = zh2Var.d;
                zh2Var.c = f;
                zh2Var.e = zh2Var.g;
                zh2Var.f = 255.0f;
            }
            f += this.c * (this.r + this.q);
        }
        return f;
    }
}
