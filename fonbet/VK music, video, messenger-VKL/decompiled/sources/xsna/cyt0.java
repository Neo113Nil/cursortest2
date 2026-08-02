package xsna;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class cyt0 implements izs {
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ dne e;

    public /* synthetic */ cyt0(View view, int i, int i2, dne dneVar) {
        this.b = view;
        this.c = i;
        this.d = i2;
        this.e = dneVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        View view = this.b;
        int measuredHeight = view.getMeasuredHeight();
        int i = this.c;
        int i2 = this.d;
        dne dneVar = this.e;
        if (measuredHeight == i && view.getMeasuredWidth() == i2) {
            dneVar.invoke();
        } else {
            fyt0.c(view, new cyt0(view, i, i2, dneVar));
        }
        return s3q0.a;
    }
}
