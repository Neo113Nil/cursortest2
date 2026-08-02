package xsna;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class la8 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Serializable g;
    public final /* synthetic */ Object h;

    public /* synthetic */ la8(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = serializable;
        this.h = obj5;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [T, java.lang.Object] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tra0[] tra0VarArr = (tra0[]) this.c;
                List list = (List) this.d;
                ep10 ep10Var = (ep10) this.e;
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.f;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) this.g;
                ma8 ma8Var = (ma8) this.h;
                tra0.a aVar = (tra0.a) obj;
                int length = tra0VarArr.length;
                int i = 0;
                int i2 = 0;
                while (i2 < length) {
                    ja8.b(aVar, tra0VarArr[i2], (zo10) list.get(i), ep10Var.getLayoutDirection(), ref$IntRef.element, ref$IntRef2.element, ma8Var.a);
                    i2++;
                    i++;
                }
                return s3q0.a;
            default:
                dhl0 dhl0Var = (dhl0) this.c;
                Object obj2 = this.d;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.e;
                izs izsVar = (izs) this.f;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) this.g;
                izs izsVar2 = (izs) this.h;
                synchronized (dhl0Var.g) {
                    ?? d = dhl0Var.d(obj2);
                    ref$ObjectRef.element = d;
                    if (d != 0) {
                        ?? invoke = izsVar.invoke(d);
                        if (!d.equals(invoke)) {
                            ref$ObjectRef2.element = invoke;
                            izsVar2.invoke(invoke);
                            dhl0Var.g.put(obj2, invoke);
                        }
                    }
                }
                return s3q0.a;
        }
    }
}
