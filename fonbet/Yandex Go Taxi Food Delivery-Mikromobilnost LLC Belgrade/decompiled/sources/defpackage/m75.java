package defpackage;

import com.yandex.go.places.impl.navigation.common.base.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final /* synthetic */ class m75 implements sy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ m75(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        Object value;
        ArrayList arrayList;
        int i = this.a;
        d dVar = this.b;
        switch (i) {
            case 0:
                ccc0 ccc0Var = dVar.V;
                bcc0 bcc0Var = (bcc0) a.R((List) ccc0Var.a.getValue());
                if ((bcc0Var != null ? bcc0Var.a : null) instanceof cm80) {
                    ccc0Var.a();
                } else {
                    r0 r0Var = ccc0Var.a;
                    do {
                        value = r0Var.getValue();
                        arrayList = new ArrayList();
                        for (Object obj : (List) value) {
                            if (!(((bcc0) obj).a instanceof cm80)) {
                                arrayList.add(obj);
                            }
                        }
                    } while (!r0Var.k(value, arrayList));
                }
                dVar.T().a();
                break;
            default:
                dVar.V.a();
                dVar.r(new qu(9));
                break;
        }
    }
}
