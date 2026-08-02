package defpackage;

import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.delivery.impl.paid_insurance.experiment.b;

/* loaded from: classes9.dex */
public final class gbh implements qqo {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public gbh(rqo rqoVar) {
        this.a = 2;
        vgi.Companion.getClass();
        qqo c = ((jbh) rqoVar).c(vgi.e);
        this.b = c;
        this.c = new b(c.a());
    }

    @Override // defpackage.qqo
    public final tpr a() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return ((v1b0) obj).d((SimpleBooleanExperiment) obj2);
            case 1:
                return ((v1b0) obj).h((xn11) obj2);
            case 2:
                return ((qqo) obj).a();
            default:
                return new g92(2, obj2);
        }
    }

    @Override // defpackage.qqo
    public final Object b() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((v1b0) obj2).j((SimpleBooleanExperiment) obj));
            case 1:
                return ((v1b0) obj2).c((xn11) obj);
            case 2:
                return (vgi) ((qqo) obj2).b();
            default:
                return obj2;
        }
    }

    public /* synthetic */ gbh(v1b0 v1b0Var, Object obj, int i) {
        this.a = i;
        this.b = v1b0Var;
        this.c = obj;
    }

    public gbh(Object obj) {
        this.a = 3;
        this.c = obj;
        this.b = obj;
    }
}
