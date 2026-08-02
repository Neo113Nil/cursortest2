package defpackage;

import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes9.dex */
public final class ic20 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref$ObjectRef b;

    public /* synthetic */ ic20(int i, Ref$ObjectRef ref$ObjectRef) {
        this.a = i;
        this.b = ref$ObjectRef;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Ref$ObjectRef ref$ObjectRef = this.b;
        switch (i) {
            case 0:
                Runnable runnable = (Runnable) ref$ObjectRef.element;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                Runnable runnable2 = (Runnable) ref$ObjectRef.element;
                if (runnable2 != null) {
                    runnable2.run();
                    break;
                }
                break;
            default:
                Runnable runnable3 = (Runnable) ref$ObjectRef.element;
                if (runnable3 != null) {
                    runnable3.run();
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
