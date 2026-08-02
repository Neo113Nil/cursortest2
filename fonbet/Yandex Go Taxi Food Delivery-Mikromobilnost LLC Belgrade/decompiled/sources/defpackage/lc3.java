package defpackage;

import com.yandex.messaging.chat.DeleteMessageUseCase$deleteMessage$$inlined$cancelableCoroutineWrapper$1$1$1;
import com.yandex.messaging.chat.attachments.AttachmentsUploader$uploadFiles$$inlined$disposableCoroutineWrapper$1$1$1;
import com.yandex.messaging.chat.attachments.YaDiskAttachmentsUploader$uploadIntoYaDisk$$inlined$disposableCoroutineWrapper$1$1$1;
import com.yandex.messaging.domain.botrequest.SendBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$default$1$1$1;
import com.yandex.messaging.domain.poll.PollsApi$fetchPollInfo$$inlined$cancelableCoroutineWrapper$default$1$1$1;
import com.yandex.messaging.internal.translator.TranslationController$updateFromHistory$$inlined$cancelableCoroutineWrapper$default$1$1$1;

/* loaded from: classes15.dex */
public final class lc3 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tse b;
    public final /* synthetic */ e1k c;

    public /* synthetic */ lc3(tse tseVar, e1k e1kVar, int i) {
        this.a = i;
        this.c = e1kVar;
        this.b = tseVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        e1k e1kVar = this.c;
        tse tseVar = this.b;
        switch (i) {
            case 0:
                tje.N(tseVar, ie60.a, null, new AttachmentsUploader$uploadFiles$$inlined$disposableCoroutineWrapper$1$1$1(e1kVar, null), 2);
                break;
            case 1:
                tje.N(tseVar, ie60.a, null, new DeleteMessageUseCase$deleteMessage$$inlined$cancelableCoroutineWrapper$1$1$1(e1kVar, null), 2);
                break;
            case 2:
                tje.N(tseVar, ie60.a, null, new PollsApi$fetchPollInfo$$inlined$cancelableCoroutineWrapper$default$1$1$1(e1kVar, null), 2);
                break;
            case 3:
                tje.N(tseVar, ie60.a, null, new SendBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$default$1$1$1(e1kVar, null), 2);
                break;
            case 4:
                tje.N(tseVar, ie60.a, null, new TranslationController$updateFromHistory$$inlined$cancelableCoroutineWrapper$default$1$1$1(e1kVar, null), 2);
                break;
            default:
                tje.N(tseVar, ie60.a, null, new YaDiskAttachmentsUploader$uploadIntoYaDisk$$inlined$disposableCoroutineWrapper$1$1$1(e1kVar, null), 2);
                break;
        }
        return zy11Var;
    }
}
