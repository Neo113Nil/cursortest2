package defpackage;

import com.yandex.go.places.impl.navigation.common.base.b;
import com.yandex.go.places.impl.navigation.common.base.c;
import com.yandex.go.places.impl.navigation.common.base.d;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final /* synthetic */ class i75 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ i75(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Object value;
        ArrayList arrayList;
        int i = this.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                return new b(dVar);
            case 1:
                return new o75(dVar, 0);
            case 2:
                return new com.yandex.go.places.impl.navigation.common.navigator.internal.b(dVar.U, dVar.V, dVar.X(), dVar.Q, dVar.M, dVar.H, dVar.I, dVar.O, dVar.P, dVar.N, dVar.Z(), dVar.Y(), dVar.T(), dVar.U(), dVar.W());
            case 3:
                return new c(dVar);
            default:
                r0 r0Var = dVar.V.a;
                do {
                    value = r0Var.getValue();
                    arrayList = new ArrayList();
                    for (Object obj : (List) value) {
                        if (!(((bcc0) obj).a instanceof wl80)) {
                            arrayList.add(obj);
                        }
                    }
                } while (!r0Var.k(value, arrayList));
                return zy11.a;
        }
    }
}
