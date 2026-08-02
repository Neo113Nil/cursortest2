package xsna;

import java.util.HashSet;
import java.util.function.Function;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class e86 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ izs b;

    public /* synthetic */ e86(izs izsVar, int i) {
        this.a = i;
        this.b = izsVar;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return (Boolean) ((tb4) this.b).invoke(obj);
            default:
                return (HashSet) ((gky) this.b).invoke(obj);
        }
    }
}
