package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.discovery.a;

/* loaded from: classes5.dex */
public final class pwj implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ pwj(a aVar, int i) {
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
                ((rwj) aVar.Dg()).updateBadgeCount(((Number) obj).intValue());
                break;
            case 1:
                ((rwj) aVar.Dg()).updateAzimuth(((Number) obj).floatValue());
                break;
            default:
                ((rwj) aVar.Dg()).updateUserLocation((mo21) obj);
                break;
        }
        return zy11Var;
    }
}
