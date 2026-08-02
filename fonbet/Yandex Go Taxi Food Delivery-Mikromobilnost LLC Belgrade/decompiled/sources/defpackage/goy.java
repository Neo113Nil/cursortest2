package defpackage;

import com.yandex.mapkit.geometry.Point;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class goy implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ hoy b;

    public /* synthetic */ goy(hoy hoyVar, int i) {
        this.a = i;
        this.b = hoyVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        hoy hoyVar = this.b;
        switch (i) {
            case 0:
                Object Zb = ((foy) hoyVar.Dg()).Zb((yq00) obj, continuation);
                if (Zb == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Pair pair = (Pair) obj;
                ((foy) hoyVar.Dg()).df((Point) pair.getFirst(), (Point) pair.getSecond());
                break;
            case 2:
                ((foy) hoyVar.Dg()).hb((bl00) obj);
                break;
            case 3:
                t201 t201Var = (t201) obj;
                foy foyVar = (foy) hoyVar.Dg();
                zzs zzsVar = t201Var.a;
                foyVar.y3(zzsVar != null ? new Point(zzsVar.a, zzsVar.b) : null, (float) t201Var.c);
                break;
            case 4:
                ((foy) hoyVar.Dg()).Ld(!((Boolean) obj).booleanValue());
                break;
            case 5:
                ((foy) hoyVar.Dg()).o0(Math.max(Math.min(Math.max(0.0f, ((Number) obj).floatValue() / 9.0f), 2.0f) - 1.0f, 0.5f));
                break;
            default:
                ((foy) hoyVar.Dg()).a4((yoy) obj);
                break;
        }
        return zy11Var;
    }
}
