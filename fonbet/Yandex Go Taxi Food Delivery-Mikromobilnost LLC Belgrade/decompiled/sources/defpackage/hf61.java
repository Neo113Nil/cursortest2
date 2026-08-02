package defpackage;

import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.map_object.w0;

/* loaded from: classes9.dex */
public final class hf61 implements xsd0 {
    public final ah00 a;

    public hf61(ah00 ah00Var) {
        this.a = ah00Var;
    }

    @Override // defpackage.xsd0
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        uc4 uc4Var = ((w0) wsd0Var.getAction()).a;
        zy11 zy11Var = zy11.a;
        if (uc4Var == null) {
            jst.e.k(new IllegalArgumentException(), "No bBox for zooming");
            return zy11Var;
        }
        kol0 kol0Var = new kol0(dvw.b(continuation));
        zzs zzsVar = uc4Var.a;
        Point point = new Point(zzsVar.a, zzsVar.b);
        zzs zzsVar2 = uc4Var.b;
        ((gh00) this.a).A(new BoundingBox(point, new Point(zzsVar2.a, zzsVar2.b)), new gf61(kol0Var));
        Object a = kol0Var.a();
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : zy11Var;
    }
}
