package defpackage;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.PrivateChatRequest;
import com.yandex.messaging.core.net.entities.chatcreate.CreatePrivateChatParam;

/* loaded from: classes15.dex */
public final class d7b implements x08 {
    public x08 a;
    public final /* synthetic */ i7b b;
    public final /* synthetic */ yw80 c;
    public final /* synthetic */ long w;
    public final /* synthetic */ qsa0 x;

    public d7b(i7b i7bVar, String str, ChatRequest chatRequest, yw80 yw80Var, long j, qsa0 qsa0Var) {
        this.b = i7bVar;
        this.c = yw80Var;
        this.w = j;
        this.x = qsa0Var;
        to3 to3Var = (to3) i7bVar.x.getValue();
        md6 md6Var = new md6(27, i7bVar, this);
        PrivateChatRequest privateChatRequest = chatRequest instanceof PrivateChatRequest ? (PrivateChatRequest) chatRequest : null;
        String onetimeUserToken = privateChatRequest != null ? privateChatRequest.onetimeUserToken() : null;
        to3Var.getClass();
        this.a = to3Var.a.a(new io3(4, to3Var, new CreatePrivateChatParam(str, onetimeUserToken), md6Var));
    }

    @Override // defpackage.x08
    public final void cancel() {
        x08 x08Var = this.a;
        if (x08Var != null) {
            x08Var.cancel();
        }
        this.a = null;
    }
}
