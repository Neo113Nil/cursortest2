package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.preorder.summary.solid.sourcedestination.b;

/* loaded from: classes6.dex */
public final class bpv0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ bpv0(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                bVar.v = (u0c0) obj;
                SourceDestinationComponent sourceDestinationComponent = bVar.n;
                if (sourceDestinationComponent != null) {
                    bVar.a(sourceDestinationComponent);
                    break;
                }
                break;
            default:
                SourceDestinationComponent sourceDestinationComponent2 = bVar.n;
                if (sourceDestinationComponent2 != null) {
                    bVar.a(sourceDestinationComponent2);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
