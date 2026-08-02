package defpackage;

import com.yandex.messaging.core.net.entities.proto.PostMessageResponse;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.MessageContext;

/* loaded from: classes15.dex */
public final class bb6 extends ree0 {
    public final /* synthetic */ cb6 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String w;
    public final /* synthetic */ BotRequest.ServerAction x;
    public final /* synthetic */ BotRequest.Error[] y;
    public final /* synthetic */ Runnable z;

    public bb6(cb6 cb6Var, String str, long j, String str2, BotRequest.ServerAction serverAction, BotRequest.Error[] errorArr, Runnable runnable) {
        this.a = cb6Var;
        this.b = str;
        this.c = j;
        this.w = str2;
        this.x = serverAction;
        this.y = errorArr;
        this.z = runnable;
    }

    @Override // defpackage.ree0
    public final ClientMessage b() {
        cb6 cb6Var = this.a;
        o1b0 o1b0Var = cb6Var.a;
        String str = o1b0Var.b;
        az10 az10Var = cb6Var.e;
        long j = o1b0Var.a;
        String str2 = this.b;
        Long F = az10Var.F(j, str2);
        return new ClientMessage(null, null, null, null, null, null, new BotRequest(str, null, null, new MessageContext(str2, F != null ? F.longValue() : 0L, Long.valueOf(this.c), this.w), this.y, null, this.x, 38, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268435391, null);
    }

    @Override // defpackage.ree0
    public final void g(PostMessageResponse postMessageResponse) {
        this.z.run();
    }
}
