package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.altpins.walking_route.map.a;

/* loaded from: classes5.dex */
public final class kz1 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ kz1(a aVar, int i) {
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
                ry1 ry1Var = (ry1) obj;
                aVar.m = ry1Var;
                aVar.a.e(ry1Var);
                aVar.b();
                break;
            case 1:
                if (!aVar.l) {
                    aVar.b();
                    break;
                }
                break;
            case 2:
                mo21 mo21Var = (mo21) obj;
                aVar.i.Ng(mo21Var.a, mo21Var.b, mo21Var.c);
                break;
            default:
                aVar.i.updateAzimuth(((Number) obj).floatValue());
                break;
        }
        return zy11Var;
    }
}
