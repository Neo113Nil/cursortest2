package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.favorites.list.ui.f;

/* loaded from: classes5.dex */
public final class djp implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ djp(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        f fVar = this.b;
        switch (i) {
            case 0:
                fVar.Pg();
                break;
            default:
                ((vip) fVar.Dg()).render((rjp) obj);
                break;
        }
        return zy11Var;
    }
}
