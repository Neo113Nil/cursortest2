package yads;

import android.content.Context;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.j5g;

/* loaded from: classes10.dex */
public final class g7 implements qy0, i13 {
    public final ViewGroup a;
    public final t2 b;
    public final kz c;
    public final c7 d;
    public final ExtendedNativeAdView e;
    public final s2 f;
    public final tk2 g;
    public final lw h;
    public final vr2 i;
    public final ArrayList j;
    public final List k;
    public final long l;
    public int m;
    public boolean n;

    public g7(Context context, x12 x12Var, z00 z00Var, js2 js2Var, ArrayList arrayList, hi0 hi0Var, ViewGroup viewGroup, t2 t2Var, kz kzVar, bf1 bf1Var, c7 c7Var, ExtendedNativeAdView extendedNativeAdView, s2 s2Var, tk2 tk2Var, lw lwVar, vr2 vr2Var) {
        this.a = viewGroup;
        this.b = t2Var;
        this.c = kzVar;
        this.d = c7Var;
        this.e = extendedNativeAdView;
        this.f = s2Var;
        this.g = tk2Var;
        this.h = lwVar;
        this.i = vr2Var;
        List a = c7Var.a();
        this.k = a;
        Iterator it = a.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((j7) it.next()).a();
        }
        this.l = j;
        this.j = bf1Var.a(context, this.e, x12Var, z00Var, new f7(this), js2Var, this.g, new i7(this), arrayList, hi0Var, this.d, this.h);
    }

    public final void a() {
        this.a.setContentDescription("pageIndex: " + this.m);
    }

    public final void b() {
        j7 j7Var = (j7) j5g.b0(this.m - 1, this.k);
        long j = j7Var != null ? j7Var.a : 0L;
        this.g.a += j;
        lw lwVar = this.h;
        lwVar.a += lwVar.b;
        lwVar.b = 0L;
        if (this.m < this.j.size()) {
            int i = this.m;
            this.m = i + 1;
            if (!((af1) this.j.get(i)).a()) {
                d();
            } else {
                a();
                this.i.a(this.e, this.l, this.g.a);
            }
        }
    }

    @Override // yads.qy0
    public final void c() {
        ViewGroup viewGroup = this.a;
        ExtendedNativeAdView extendedNativeAdView = this.e;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        viewGroup.removeAllViews();
        viewGroup.addView(extendedNativeAdView, layoutParams);
        s2 s2Var = this.f;
        ExtendedNativeAdView extendedNativeAdView2 = this.e;
        s2Var.getClass();
        try {
            if (s2Var.a instanceof w32) {
                s22 a = s2Var.e.a(extendedNativeAdView2, s2Var.d);
                w32 w32Var = (w32) s2Var.a;
                w32Var.getClass();
                w32Var.a(a.c, w32Var.Q, new a32(a));
                ((w32) s2Var.a).b(s2Var.c);
            }
            this.m = 1;
            this.n = false;
            af1 af1Var = (af1) j5g.a0(this.j);
            if (af1Var != null && af1Var.a()) {
                a();
                this.i.a(this.e, this.l, this.g.a);
            } else if (this.m >= this.j.size()) {
                this.c.e();
            } else {
                b();
            }
        } catch (k12 unused) {
            s2Var.b.e();
        }
    }

    public final void d() {
        if (this.m >= this.j.size()) {
            this.c.e();
        } else {
            b();
        }
    }

    @Override // yads.qy0
    public final void invalidate() {
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((af1) it.next()).b();
        }
        x12 x12Var = this.f.a;
        if (x12Var instanceof w32) {
            ((w32) x12Var).b((z00) null);
        }
    }
}
