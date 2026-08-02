package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: EntriesListFieldsProviderDelegate.kt */
/* loaded from: classes4.dex */
public final class lqp extends RecyclerView.t {
    public final /* synthetic */ mqp b;

    public lqp(mqp mqpVar) {
        this.b = mqpVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        mqp mqpVar = this.b;
        mqpVar.v.d(recyclerView, i);
        mqpVar.w.a(recyclerView, i);
        if (i == 0) {
            hl60 hl60Var = hl60.a;
            hl60.j((ArrayList) mqp.T.getValue(), recyclerView, null, null, 28);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        mqp mqpVar = this.b;
        qt3 qt3Var = mqpVar.q;
        if (qt3Var != null) {
            qt3Var.b();
        }
        xif0 xif0Var = mqpVar.u;
        if (xif0Var != null) {
            xif0Var.a();
        }
        c6f0 c6f0Var = ((g3f0) mqpVar.I.getValue()).a.h;
        if (c6f0Var != null) {
            m3r m3rVar = c6f0Var.c;
            if (!m3rVar.C) {
                m3rVar.requestLayout();
            }
            s3q0 s3q0Var = s3q0.a;
        }
        hl60 hl60Var = hl60.a;
        hl60.c(i2);
        mqpVar.a().c(recyclerView, i2);
    }
}
