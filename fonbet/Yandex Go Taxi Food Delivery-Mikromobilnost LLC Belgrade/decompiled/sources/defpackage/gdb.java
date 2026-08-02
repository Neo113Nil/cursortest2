package defpackage;

import com.yandex.messaging.core.net.entities.proto.PostMessageResponse;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.UnseenMarker;
import com.yandex.messaging.internal.authorized.chat.unread.MarkUnreadActionException;
import kotlin.Result;

/* loaded from: classes15.dex */
public final class gdb extends ree0 {
    public final /* synthetic */ hdb a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long w;
    public final /* synthetic */ k200 x;

    public gdb(hdb hdbVar, long j, long j2, long j3, k200 k200Var) {
        this.a = hdbVar;
        this.b = j;
        this.c = j2;
        this.w = j3;
        this.x = k200Var;
    }

    @Override // defpackage.ree0
    public final ClientMessage b() {
        return new ClientMessage(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new UnseenMarker(this.a.a.b, this.b, this.c, this.w), null, null, null, false, 0, false, 266338303, null);
    }

    @Override // defpackage.ree0
    public final boolean f(PostMessageResponse postMessageResponse) {
        if (ree0.h(postMessageResponse.status)) {
            return false;
        }
        this.x.invoke(new Result(new Result.Failure(new MarkUnreadActionException())));
        return true;
    }

    @Override // defpackage.ree0
    public final void g(PostMessageResponse postMessageResponse) {
        this.x.invoke(new Result(zy11.a));
    }
}
