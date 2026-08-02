package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.stoproute.ui.g;

/* loaded from: classes6.dex */
public final class l340 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ l340(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        g gVar = this.b;
        switch (i) {
            case 0:
                p440 p440Var = (p440) obj;
                r0 r0Var = gVar.p;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, k340.a((k340) value, p440Var, null, false, null, 0.0f, null, null, 122)));
            case 1:
                List list = (List) obj;
                r0 r0Var2 = gVar.p;
                do {
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, k340.a((k340) value2, null, list, false, null, 0.0f, null, null, HProv.PP_DELETE_KEYSET)));
            case 2:
                cu30 cu30Var = (cu30) obj;
                r0 r0Var3 = gVar.p;
                do {
                    value3 = r0Var3.getValue();
                } while (!r0Var3.k(value3, k340.a((k340) value3, null, null, false, null, 0.0f, cu30Var.a, cu30Var.b, 31)));
            default:
                float floatValue = ((Number) obj).floatValue();
                r0 r0Var4 = gVar.p;
                do {
                    value4 = r0Var4.getValue();
                } while (!r0Var4.k(value4, k340.a((k340) value4, null, null, false, null, floatValue, null, null, 111)));
        }
        return zy11Var;
    }
}
