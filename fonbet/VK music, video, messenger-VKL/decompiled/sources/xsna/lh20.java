package xsna;

import kotlin.collections.builders.SetBuilder;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class lh20 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ lh20(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    a1w a1wVar = q1w.a;
                    if (a1wVar == null) {
                        a1wVar = null;
                    }
                    his0.d(a1wVar);
                }
                return s3q0.a;
            default:
                qyg0 qyg0Var = (qyg0) obj;
                SetBuilder setBuilder = new SetBuilder();
                while (qyg0Var.step()) {
                    setBuilder.add(Integer.valueOf((int) qyg0Var.getLong(0)));
                }
                return setBuilder.d();
        }
    }
}
