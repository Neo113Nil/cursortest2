package xsna;

import java.util.List;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class le2 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ wh50 c;
    public final /* synthetic */ izs d;

    public /* synthetic */ le2(izs izsVar, wh50 wh50Var) {
        this.d = izsVar;
        this.c = wh50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.d.invoke((String) obj);
                this.c.setValue(Boolean.TRUE);
                break;
            default:
                List list = (List) ((Pair) uka.a.get(((Number) this.c.getValue()).intValue())).j();
                ((rry) obj).a(list.size(), null, new ioj(list, 1), new jai(-1117249557, new joj(1, this.d, list), true));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ le2(wh50 wh50Var, izs izsVar) {
        this.c = wh50Var;
        this.d = izsVar;
    }
}
