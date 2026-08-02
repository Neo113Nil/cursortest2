package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.chat.GetRateLimitUseCase$run$$inlined$flatMapLatest$1;
import com.yandex.messaging.internal.authorized.chat.b;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class dct extends vds0 {
    public final b b;

    public dct(kse kseVar, b bVar) {
        super(kseVar.e);
        this.b = bVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return e.X(this.b.b((ChatRequest) obj), new GetRateLimitUseCase$run$$inlined$flatMapLatest$1(null, this));
    }
}
