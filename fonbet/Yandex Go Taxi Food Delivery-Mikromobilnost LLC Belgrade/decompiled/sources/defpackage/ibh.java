package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes9.dex */
public final class ibh implements t1b0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v1b0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ibh(v1b0 v1b0Var, Object obj, int i) {
        this.a = i;
        this.b = v1b0Var;
        this.c = obj;
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        int i = this.a;
        Object obj = this.c;
        v1b0 v1b0Var = this.b;
        switch (i) {
            case 0:
                return v1b0Var.h((vn11) obj);
            default:
                return v1b0Var.b((SimplePersistentBooleanExperiment) obj);
        }
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        int i = this.a;
        Object obj = this.c;
        v1b0 v1b0Var = this.b;
        switch (i) {
            case 0:
                return v1b0Var.i((vn11) obj, continuation);
            default:
                return v1b0Var.f((SimplePersistentBooleanExperiment) obj, continuation);
        }
    }

    @Override // defpackage.t1b0
    public final Object c() {
        int i = this.a;
        Object obj = this.c;
        v1b0 v1b0Var = this.b;
        switch (i) {
            case 0:
                return v1b0Var.a((vn11) obj);
            default:
                return Boolean.valueOf(v1b0Var.g((SimplePersistentBooleanExperiment) obj));
        }
    }
}
