package defpackage;

import java.util.function.BiConsumer;

/* loaded from: classes12.dex */
public final /* synthetic */ class no40 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ fes0 b;

    public /* synthetic */ no40(fes0 fes0Var, int i) {
        this.a = i;
        this.b = fes0Var;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.a;
        fes0 fes0Var = this.b;
        int intValue = ((Integer) obj).intValue();
        int intValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                fes0Var.a(intValue, intValue2);
                break;
            default:
                fes0Var.a(intValue, intValue2);
                break;
        }
    }
}
