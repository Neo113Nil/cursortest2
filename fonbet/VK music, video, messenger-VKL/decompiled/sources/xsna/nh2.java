package xsna;

import com.vk.clips.design.view.correction.CorrectionsRecyclerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ float c;

    public /* synthetic */ nh2(float f, int i) {
        this.b = i;
        this.c = f;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        float f = this.c;
        switch (i) {
            case 0:
                tdu tduVar = (tdu) obj;
                tduVar.A(f);
                tduVar.B(f);
                return s3q0.a;
            default:
                lwj lwjVar = (lwj) obj;
                int i2 = CorrectionsRecyclerView.i;
                lwjVar.b = f;
                return lwjVar;
        }
    }
}
