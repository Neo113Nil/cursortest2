package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.internal.CreateChannel;
import com.yandex.messaging.internal.CreateGroupChat;
import com.yandex.messaging.internal.GetSpamSuggestUseCase$run$$inlined$flatMapLatest$1;
import com.yandex.messaging.internal.authorized.chat.b;
import kotlinx.coroutines.flow.e;

/* loaded from: classes15.dex */
public final class odt extends vds0 {
    public final MessengerEnvironment b;
    public final b c;
    public final kse d;

    public odt(MessengerEnvironment messengerEnvironment, b bVar, kse kseVar) {
        super(kseVar.b);
        this.b = messengerEnvironment;
        this.c = bVar;
        this.d = kseVar;
    }

    @Override // defpackage.vds0
    public final tpr b(Object obj) {
        ChatRequest chatRequest = (ChatRequest) obj;
        return (!this.b.getIsModerated() || (chatRequest instanceof CreateGroupChat) || (chatRequest instanceof CreateChannel)) ? new g92(2, null) : e.F(e.X(this.c.b(chatRequest), new GetSpamSuggestUseCase$run$$inlined$flatMapLatest$1(3, null)), this.d.e);
    }
}
