package yads;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes10.dex */
public final class qw implements zf0, c2 {
    public final v9 a;
    public final b2 b;
    public final cw c;
    public final kz d;
    public final d02 e;
    public final z30 f;
    public final o73 g;
    public ew h;
    public final tk2 i;
    public final yv j;

    public qw(v9 v9Var, b2 b2Var, cw cwVar, kz kzVar, d02 d02Var, z30 z30Var, o73 o73Var) {
        this.a = v9Var;
        this.b = b2Var;
        this.c = cwVar;
        this.d = kzVar;
        this.e = d02Var;
        this.f = z30Var;
        this.g = o73Var;
        this.i = o73Var.d();
        this.j = o73Var.a();
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        View c = this.e.c(viewGroup);
        ProgressBar a = this.e.a(viewGroup);
        if (c != null) {
            this.b.b.add(this);
            qu2 a2 = gx2.a().a(c.getContext());
            boolean z = false;
            boolean z2 = a2 != null && a2.G;
            eg0[] eg0VarArr = eg0.b;
            if ("divkit".equals(this.a.k) && z2) {
                z = true;
            }
            if (!z) {
                c.setOnClickListener(new pw(this.d, this.f));
            }
            a(c, a);
            if (c.getTag() == null) {
                c.setTag(CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
            }
        }
    }

    @Override // yads.c2
    public final void b() {
        ew ewVar = this.h;
        if (ewVar != null) {
            ewVar.b();
        }
    }

    @Override // yads.zf0
    public final void c() {
        this.b.b.remove(this);
        ew ewVar = this.h;
        if (ewVar != null) {
            ewVar.invalidate();
        }
    }

    public final void a(View view, ProgressBar progressBar) {
        ew gc0Var;
        Long l = this.a.j;
        long longValue = l != null ? l.longValue() : 0L;
        if (progressBar != null) {
            gc0Var = new mk2(view, progressBar, new bm0(), new kw(new ff()), this.f, this.i, longValue);
        } else {
            gc0Var = this.j.a() ? new gc0(view, this.c, this.f, longValue, this.g.e, wc2.a(true)) : null;
        }
        this.h = gc0Var;
        if (gc0Var != null) {
            gc0Var.c();
        }
    }

    @Override // yads.c2
    public final void a() {
        ew ewVar = this.h;
        if (ewVar != null) {
            ewVar.a();
        }
    }
}
