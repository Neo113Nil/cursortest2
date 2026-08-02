package defpackage;

import ru.yandex.taxi.logistics.address.g;

/* loaded from: classes.dex */
public final class q2g implements xvf0 {
    public final /* synthetic */ int a;
    public final hzk b;

    public /* synthetic */ q2g(int i, hzk hzkVar) {
        this.a = i;
        this.b = hzkVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        hzk hzkVar = this.b;
        switch (i) {
            case 0:
                bdi bdiVar = (bdi) hzkVar.b;
                q5z.h(bdiVar);
                return bdiVar;
            default:
                g gVar = (g) hzkVar.a;
                q5z.h(gVar);
                return gVar;
        }
    }
}
