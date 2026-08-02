package xsna;

import androidx.recyclerview.widget.m;
import xsna.gfm0;

/* compiled from: StoryStatisticsInfoAdapter.kt */
/* loaded from: classes6.dex */
public final class oxm extends m.e<gfm0> {
    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(gfm0 gfm0Var, gfm0 gfm0Var2) {
        gfm0 gfm0Var3 = gfm0Var;
        gfm0 gfm0Var4 = gfm0Var2;
        if ((gfm0Var3 instanceof gfm0.a) && (gfm0Var4 instanceof gfm0.a)) {
            qwl0 qwl0Var = ((gfm0.a) gfm0Var3).a;
            String str = qwl0Var.a;
            qwl0 qwl0Var2 = ((gfm0.a) gfm0Var4).a;
            return epx.f(str, qwl0Var2.a) && epx.f(qwl0Var.b, qwl0Var2.b);
        }
        if ((gfm0Var3 instanceof gfm0.b) && (gfm0Var4 instanceof gfm0.b)) {
            return gfm0Var3.equals(gfm0Var4);
        }
        if (!(gfm0Var3 instanceof gfm0.c) || !(gfm0Var4 instanceof gfm0.c)) {
            return false;
        }
        zdm0 zdm0Var = ((gfm0.c) gfm0Var3).a;
        String str2 = zdm0Var.a;
        zdm0 zdm0Var2 = ((gfm0.c) gfm0Var4).a;
        return epx.f(str2, zdm0Var2.a) && epx.f(zdm0Var.b, zdm0Var2.b);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(gfm0 gfm0Var, gfm0 gfm0Var2) {
        gfm0 gfm0Var3 = gfm0Var;
        gfm0 gfm0Var4 = gfm0Var2;
        if ((gfm0Var3 instanceof gfm0.a) && (gfm0Var4 instanceof gfm0.a)) {
            return true;
        }
        if ((gfm0Var3 instanceof gfm0.b) && (gfm0Var4 instanceof gfm0.b)) {
            return true;
        }
        return (gfm0Var3 instanceof gfm0.c) && (gfm0Var4 instanceof gfm0.c);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final /* bridge */ /* synthetic */ Object getChangePayload(gfm0 gfm0Var, gfm0 gfm0Var2) {
        return s3q0.a;
    }
}
