package defpackage;

import com.yandex.messaging.core.net.entities.proto.PostMessageResponse;
import com.yandex.messaging.core.net.entities.proto.message.ChatApproval;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.internal.net.socket.PostMethodException;
import kotlin.Result;

/* loaded from: classes15.dex */
public final class q0b extends ree0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q0b(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ree0
    public final ClientMessage b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ChatApproval chatApproval = new ChatApproval();
                chatApproval.chatId = ((r0b) obj).a.b;
                return new ClientMessage(null, null, null, null, null, null, null, null, null, null, null, null, null, null, chatApproval, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268419071, null);
            case 1:
                return new ClientMessage(null, null, null, (PlainMessage) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268435447, null);
            case 2:
                return new ClientMessage(null, null, null, (PlainMessage) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268435447, null);
            default:
                return (ClientMessage) ((n8a) obj).invoke();
        }
    }

    @Override // defpackage.ree0
    public boolean f(PostMessageResponse postMessageResponse) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 1:
                ((mc3) obj).n();
                return true;
            case 2:
                ((g3v0) obj).n();
                return true;
            case 3:
                j18 j18Var = (j18) obj;
                if (j18Var.t() instanceof mf60) {
                    j18Var.resumeWith(new Result.Failure(new PostMethodException(postMessageResponse)));
                }
                return true;
            default:
                return super.f(postMessageResponse);
        }
    }

    @Override // defpackage.ree0
    public final void g(PostMessageResponse postMessageResponse) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((v4a) obj).run();
                r0b r0bVar = (r0b) this.b;
                r0bVar.a();
                r0bVar.e = null;
                break;
            case 1:
                ((mc3) obj).i();
                break;
            case 2:
                ((g3v0) obj).i();
                break;
            default:
                j18 j18Var = (j18) obj;
                if (j18Var.t() instanceof mf60) {
                    j18Var.resumeWith(postMessageResponse);
                    break;
                }
                break;
        }
    }
}
