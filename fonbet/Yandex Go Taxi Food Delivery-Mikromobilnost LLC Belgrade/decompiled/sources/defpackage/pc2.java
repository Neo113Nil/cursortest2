package defpackage;

import androidx.compose.foundation.text.contextmenu.internal.b;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes10.dex */
public final /* synthetic */ class pc2 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ aly0 c;

    public /* synthetic */ pc2(b bVar, aly0 aly0Var, int i) {
        this.a = i;
        this.b = bVar;
        this.c = aly0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        Object obj = zy11.a;
        int i2 = 25;
        aly0 aly0Var = this.c;
        b bVar = this.b;
        switch (i) {
            case 0:
                oc2 oc2Var = bVar.f;
                f02 f02Var = new f02(3, aly0Var);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                bVar.e.c("dataBuilder", oc2Var, new j0(i2, ref$ObjectRef, f02Var));
                Object obj2 = ref$ObjectRef.element;
                if (obj2 != null) {
                    obj = obj2;
                }
                return (zky0) obj;
            case 1:
                oc2 oc2Var2 = bVar.g;
                pc2 pc2Var = new pc2(bVar, aly0Var, 2);
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                bVar.e.c("positioner", oc2Var2, new j0(i2, ref$ObjectRef2, pc2Var));
                Object obj3 = ref$ObjectRef2.element;
                if (obj3 != null) {
                    obj = obj3;
                }
                return (zii0) obj;
            default:
                Object invoke = bVar.c.invoke();
                if (!((rzx) invoke).d()) {
                    invoke = null;
                }
                rzx rzxVar = (rzx) invoke;
                return rzxVar == null ? zii0.e : aly0Var.k0(rzxVar).j(rzxVar.v(0L));
        }
    }
}
