package defpackage;

import ru.yandex.taxi.layers.experiments.a;
import ru.yandex.taxi.layers.experiments.f;

/* loaded from: classes9.dex */
public final class ayx implements v7p {
    public final /* synthetic */ int a;
    public final m2g b;

    public /* synthetic */ ayx(m2g m2gVar, int i) {
        this.a = i;
        this.b = m2gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        m2g m2gVar = this.b;
        switch (i) {
            case 0:
                return new a((rqo) m2gVar.get());
            case 1:
                return new f((rqo) m2gVar.get());
            default:
                return new xyx((rqo) m2gVar.get());
        }
    }
}
