package defpackage;

import com.yandex.runtime.image.ImageProvider;
import java.util.List;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.map.overlay.pickup.a;

/* loaded from: classes6.dex */
public final class hqb0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ hqb0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                int intValue = ((Number) obj).intValue();
                aVar.m = true;
                f4c0 f4c0Var = aVar.j;
                if (!aVar.n) {
                    f4c0Var.y((ImageProvider) aVar.d.get(intValue));
                }
                f4c0Var.k(3.0f);
                break;
            default:
                int intValue2 = ((Number) obj).intValue();
                boolean z = aVar.n;
                f4c0 f4c0Var2 = aVar.j;
                if (!z) {
                    List list = aVar.d;
                    f4c0Var2.y((ImageProvider) list.get((list.size() - intValue2) - 1));
                }
                f4c0Var2.k(1.0f);
                aVar.m = false;
                break;
        }
        return zy11Var;
    }
}
