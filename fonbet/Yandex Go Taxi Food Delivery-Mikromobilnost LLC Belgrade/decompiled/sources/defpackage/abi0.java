package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.proto.PostMessageResponse;
import com.yandex.messaging.core.net.entities.proto.ShortMessageInfo;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.Reaction;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.MessageData;
import java.io.IOException;

/* loaded from: classes15.dex */
public final class abi0 extends ree0 {
    public final /* synthetic */ bbi0 a;
    public final /* synthetic */ ServerMessageRef b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int w;

    public abi0(bbi0 bbi0Var, ServerMessageRef serverMessageRef, int i, int i2) {
        this.a = bbi0Var;
        this.b = serverMessageRef;
        this.c = i;
        this.w = i2;
    }

    @Override // defpackage.ree0
    public final ClientMessage b() {
        return new ClientMessage(null, null, null, null, null, null, null, null, null, new Reaction(this.a.c.a.b, this.b.getTimestamp(), this.c, this.w), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268434943, null);
    }

    @Override // defpackage.ree0
    public final boolean f(PostMessageResponse postMessageResponse) {
        bbi0 bbi0Var = this.a;
        z83.g(null, bbi0Var.g, Looper.myLooper());
        if (ree0.h(postMessageResponse.status)) {
            return false;
        }
        rnz rnzVar = bbi0Var.h;
        ServerMessageRef serverMessageRef = this.b;
        rnzVar.i(serverMessageRef.getTimestamp());
        bbi0Var.e.a(bbi0Var.c.a.a, serverMessageRef.getTimestamp());
        return true;
    }

    @Override // defpackage.ree0
    public final void g(PostMessageResponse postMessageResponse) {
        MessageData messageData;
        bbi0 bbi0Var = this.a;
        x08 x08Var = null;
        z83.g(null, bbi0Var.g, Looper.myLooper());
        ShortMessageInfo shortMessageInfo = postMessageResponse.messageInfo;
        ServerMessageRef serverMessageRef = this.b;
        if (shortMessageInfo != null) {
            fw10 fw10Var = bbi0Var.d;
            long j = shortMessageInfo.version;
            agc0 agc0Var = new agc0(20, bbi0Var, serverMessageRef);
            vcz0 vcz0Var = (vcz0) fw10Var.b.b;
            String b = vcz0Var.d.b(vcz0Var.a.a, serverMessageRef.getTimestamp());
            if (b == null) {
                messageData = null;
            } else {
                try {
                    messageData = (MessageData) vcz0Var.c.adapter(MessageData.class).fromJson(b);
                } catch (IOException e) {
                    ny61.j(e);
                    return;
                }
            }
            Long valueOf = messageData != null ? Long.valueOf(messageData.reactionsVersion) : null;
            if (valueOf != null && j > valueOf.longValue()) {
                x08Var = fw10Var.e.f(new ew10(fw10Var, serverMessageRef, agc0Var));
            }
            if (x08Var != null) {
                bbi0Var.i.h(serverMessageRef.getTimestamp(), x08Var);
                return;
            }
        }
        bbi0Var.h.i(serverMessageRef.getTimestamp());
        bbi0Var.e.a(bbi0Var.c.a.a, serverMessageRef.getTimestamp());
    }
}
