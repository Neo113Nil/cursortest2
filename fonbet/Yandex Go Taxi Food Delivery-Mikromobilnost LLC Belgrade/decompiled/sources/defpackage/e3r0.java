package defpackage;

import com.yandex.div.core.expression.variables.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final /* synthetic */ class e3r0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ e3r0(Serializable serializable, boolean z, int i) {
        this.a = i;
        this.c = serializable;
        this.b = z;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        boolean z2 = this.b;
        Serializable serializable = this.c;
        switch (i) {
            case 0:
                a aVar = (a) obj;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (ArrayList) serializable) {
                    c231 c231Var = (c231) obj2;
                    if (z2 || !aVar.h(c231Var.c())) {
                        arrayList.add(obj2);
                    }
                }
                c231[] c231VarArr = (c231[]) arrayList.toArray(new c231[0]);
                if (c231VarArr.length != 0) {
                    aVar.i((c231[]) Arrays.copyOf(c231VarArr, c231VarArr.length));
                }
                return zy11.a;
            default:
                String str = (String) serializable;
                za31 za31Var = (za31) obj;
                if ((jl40.l(str, "") || jl40.l(za31Var.a.a, str)) && za31Var.a.o == z2) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
