package xsna;

import java.util.List;
import xsna.a8a;
import xsna.jht0;
import xsna.omt0;

/* compiled from: LazyDsl.kt */
/* loaded from: classes17.dex */
public final class lk00 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lk00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((List) this.c).get(((Number) obj).intValue());
                return null;
            case 1:
                float[] fArr = ((en10) obj).a;
                tny tnyVar = (tny) this.c;
                if (tnyVar.e()) {
                    jgz.p(tnyVar).T(tnyVar, fArr);
                }
                return s3q0.a;
            default:
                jht0 jht0Var = (jht0) obj;
                omt0.a aVar = (omt0.a) this.c;
                jht0.a aVar2 = (jht0.a) (!(jht0Var instanceof jht0.a) ? null : jht0Var);
                if (aVar2 == null) {
                    return jht0Var;
                }
                a8a.a aVar3 = aVar.c;
                return jht0.a.b(aVar2, false, aVar3.d, aVar3.e, Float.valueOf(aVar3.a), aVar.d, false, 135);
        }
    }
}
