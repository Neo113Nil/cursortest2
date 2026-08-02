package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.GetUserAverageResponseTimeUseCase$run$$inlined$flatMapLatest$1;
import com.yandex.messaging.internal.authorized.i;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class cft extends vds0 {
    public final kse b;
    public final k020 c;
    public final el21 d;
    public final p4t e;

    public cft(kse kseVar, k020 k020Var, el21 el21Var, p4t p4tVar) {
        super(kseVar.e);
        this.b = kseVar;
        this.c = k020Var;
        this.d = el21Var;
        this.e = p4tVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return e.F(e.X(i.b(this.d), new GetUserAverageResponseTimeUseCase$run$$inlined$flatMapLatest$1(null, (ChatRequest) obj, this)), this.b.e);
    }
}
