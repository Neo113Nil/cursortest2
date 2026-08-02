package defpackage;

import com.yandex.messaging.domain.statuses.GetStatusByGuidUseCase$run$$inlined$flatMapLatest$1;
import com.yandex.messaging.internal.authorized.j;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class pdt extends vds0 {
    public final j b;

    public pdt(kse kseVar, j jVar) {
        super(kseVar.e);
        this.b = jVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return e.X(gbb1.d(this.b), new GetStatusByGuidUseCase$run$$inlined$flatMapLatest$1((String) obj, null));
    }
}
