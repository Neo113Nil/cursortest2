package defpackage;

import android.graphics.Rect;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.map_common.style.source.e;
import ru.yandex.taxi.masstransit.experiment.f;
import ru.yandex.taxi.masstransit.overlay.onmap.h;

/* loaded from: classes6.dex */
public final class jk40 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ h b;

    public /* synthetic */ jk40(h hVar, int i) {
        this.a = i;
        this.b = hVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        h hVar = this.b;
        switch (i) {
            case 0:
                ((e) hVar.G).c(3, ((f) obj).c);
                break;
            case 1:
                h.Kg(hVar, (fk40) obj);
                break;
            case 2:
                if (!((Boolean) hVar.M.getValue()).booleanValue()) {
                    h.Kg(hVar, (fk40) hVar.N.getValue());
                    break;
                }
                break;
            default:
                hVar.D.Lc(hVar, (Rect) obj);
                break;
        }
        return zy11Var;
    }
}
