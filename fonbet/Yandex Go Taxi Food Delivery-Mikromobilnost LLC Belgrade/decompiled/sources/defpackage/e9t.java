package defpackage;

import com.yandex.messaging.internal.GetMessageTypeUseCase$run$$inlined$flatMapLatest$1;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.authorized.chat.b;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class e9t extends vds0 {
    public final b b;
    public final kse c;

    public e9t(kse kseVar, b bVar) {
        super(kseVar.b);
        this.b = bVar;
        this.c = kseVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        ServerMessageRef serverMessageRef = (ServerMessageRef) obj;
        return e.F(e.X(this.b.b(p8b.a(serverMessageRef.getRequiredChatId())), new GetMessageTypeUseCase$run$$inlined$flatMapLatest$1(null, serverMessageRef)), this.c.e);
    }
}
