package defpackage;

import com.yandex.messaging.domain.personal.GetUserEmailUseCase$run$$inlined$flatMapLatest$1;
import com.yandex.messaging.internal.authorized.j;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class hft extends vds0 {
    public final j b;

    public hft(kse kseVar, j jVar) {
        super(kseVar.e);
        this.b = jVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return e.t(e.X(new mth(gbb1.d(this.b), 6), new GetUserEmailUseCase$run$$inlined$flatMapLatest$1(null, (gft) obj)));
    }
}
