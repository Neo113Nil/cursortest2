package defpackage;

import com.yandex.messaging.domain.personal.organization.employee.GetEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1;
import com.yandex.messaging.internal.authorized.j;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class b7t {
    public final kse a;
    public final j b;

    public b7t(kse kseVar, j jVar) {
        this.a = kseVar;
        this.b = jVar;
    }

    public final tpr a(a7t a7tVar) {
        return e.F(e.X(gbb1.d(this.b), new GetEmployeeInfoUseCase$execute$$inlined$flatMapLatest$1(null, a7tVar)), this.a.e);
    }
}
