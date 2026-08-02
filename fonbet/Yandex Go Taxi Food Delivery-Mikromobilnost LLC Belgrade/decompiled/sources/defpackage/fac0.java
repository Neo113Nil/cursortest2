package defpackage;

import com.yandex.go.places.impl.navigation.common.navigator.internal.b;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final /* synthetic */ class fac0 implements sy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ sls c;

    public /* synthetic */ fac0(b bVar, sls slsVar, int i) {
        this.a = i;
        this.b = bVar;
        this.c = slsVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        int i = this.a;
        sls slsVar = this.c;
        b bVar = this.b;
        switch (i) {
            case 0:
                r0 r0Var = bVar.b.a;
                do {
                    value = r0Var.getValue();
                    arrayList = new ArrayList();
                    for (Object obj : (List) value) {
                        if (!(((bcc0) obj).a instanceof yl80)) {
                            arrayList.add(obj);
                        }
                    }
                } while (!r0Var.k(value, arrayList));
                slsVar.invoke();
                bVar.o.s(true);
                break;
            default:
                r0 r0Var2 = bVar.b.a;
                do {
                    value2 = r0Var2.getValue();
                    arrayList2 = new ArrayList();
                    for (Object obj2 : (List) value2) {
                        if (!(((bcc0) obj2).a instanceof yl80)) {
                            arrayList2.add(obj2);
                        }
                    }
                } while (!r0Var2.k(value2, arrayList2));
                slsVar.invoke();
                bVar.o.s(false);
                break;
        }
    }
}
