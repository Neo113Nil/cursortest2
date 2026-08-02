package defpackage;

import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;

/* loaded from: classes9.dex */
public final class bni implements qqo {
    public final /* synthetic */ qqo a;

    public bni(rqo rqoVar) {
        this.a = ((jbh) rqoVar).a(SimpleBooleanExperiment.DELIVERY_RESTORE_FALSE_COMPLETED_ORDERS);
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
