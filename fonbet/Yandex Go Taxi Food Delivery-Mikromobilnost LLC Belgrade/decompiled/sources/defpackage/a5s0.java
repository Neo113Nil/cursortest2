package defpackage;

import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes9.dex */
public final class a5s0 implements qqo {
    public final /* synthetic */ qqo a;
    public final j2t b;

    public a5s0(rqo rqoVar, j2t j2tVar) {
        this.a = ((jbh) rqoVar).a(SimpleBooleanExperiment.SHOULD_ACTIVATE_SHORTCUTS_FOR_UNAVAILABLE_ZONE);
        this.b = j2tVar;
    }

    @Override // defpackage.qqo
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.qqo
    public final Object b() {
        return (Boolean) this.a.b();
    }
}
