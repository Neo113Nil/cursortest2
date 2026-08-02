package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.chat.GetOnlineStatusByChatRequestUseCase$run$$inlined$flatMapLatest$1;
import com.yandex.messaging.chat.c;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class p9t extends vds0 {
    public final ibt b;
    public final c c;

    public p9t(ibt ibtVar, c cVar, kse kseVar) {
        super(kseVar.e);
        this.b = ibtVar;
        this.c = cVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        return e.X(this.b.a((ChatRequest) obj), new GetOnlineStatusByChatRequestUseCase$run$$inlined$flatMapLatest$1(null, this));
    }
}
