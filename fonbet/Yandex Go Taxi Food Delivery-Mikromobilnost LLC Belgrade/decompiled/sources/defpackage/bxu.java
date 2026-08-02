package defpackage;

import ru.yandex.taxi.address.design.SourceDestinationComponent;

/* loaded from: classes14.dex */
public final class bxu implements SourceDestinationComponent.a {
    public final /* synthetic */ sls a;
    public final /* synthetic */ sls b;

    public bxu(sls slsVar, sls slsVar2) {
        this.a = slsVar;
        this.b = slsVar2;
    }

    @Override // ru.yandex.taxi.address.design.SourceDestinationComponent.a
    public final void Y() {
        this.a.invoke();
    }

    @Override // ru.yandex.taxi.address.design.SourceDestinationComponent.a
    public final void x0() {
        this.b.invoke();
    }
}
