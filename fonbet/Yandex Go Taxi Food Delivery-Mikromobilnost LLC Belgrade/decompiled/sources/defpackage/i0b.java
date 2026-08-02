package defpackage;

import android.os.SystemClock;
import com.yandex.messaging.core.net.entities.proto.PostMessageResponse;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.core.net.entities.proto.message.Report;
import com.yandex.messaging.internal.LocalMessageRef;

/* loaded from: classes15.dex */
public final class i0b extends ree0 {
    public long a;
    public final /* synthetic */ bc b;
    public final /* synthetic */ Report c;
    public final /* synthetic */ oxe0 w;
    public final /* synthetic */ LocalMessageRef x;
    public final /* synthetic */ long y;

    public i0b(bc bcVar, Report report, oxe0 oxe0Var, LocalMessageRef localMessageRef, long j) {
        this.b = bcVar;
        this.c = report;
        this.w = oxe0Var;
        this.x = localMessageRef;
        this.y = j;
    }

    @Override // defpackage.ree0
    public final ClientMessage b() {
        ((jwa0) this.b.w).getClass();
        this.a = SystemClock.elapsedRealtime();
        return new ClientMessage(null, null, null, null, null, null, null, null, this.c, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 0, false, 268435199, null);
    }

    @Override // defpackage.ree0
    public final void g(PostMessageResponse postMessageResponse) {
        bc bcVar = this.b;
        ((jwa0) bcVar.w).a(this.a, "time2ack_report");
        this.w.run();
        x22 x22Var = (x22) bcVar.x;
        String str = ((o1b0) bcVar.a).b;
        vcz0 vcz0Var = (vcz0) bcVar.c;
        o1b0 o1b0Var = vcz0Var.a;
        LocalMessageRef localMessageRef = this.x;
        String messageId = localMessageRef.getMessageId();
        az10 az10Var = vcz0Var.e;
        x22Var.h("complaint_sent", "chat_id", str, "target_guid", messageId != null ? az10Var.i(o1b0Var.a, localMessageRef.getMessageId()) : az10Var.h(o1b0Var.a, localMessageRef.getTimestamp()), "msg_id", Long.valueOf(this.y));
    }
}
