package defpackage;

import kotlin.jvm.internal.Ref$FloatRef;

/* loaded from: classes10.dex */
public final /* synthetic */ class o9m implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref$FloatRef b;

    public /* synthetic */ o9m(Ref$FloatRef ref$FloatRef, int i) {
        this.a = i;
        this.b = ref$FloatRef;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Ref$FloatRef ref$FloatRef = this.b;
        zvd0 zvd0Var = (zvd0) obj;
        float floatValue = ((Float) obj2).floatValue();
        switch (i) {
            case 0:
                zvd0Var.a();
                ref$FloatRef.element = floatValue;
                break;
            default:
                zvd0Var.a();
                ref$FloatRef.element = floatValue;
                break;
        }
        return zy11Var;
    }
}
