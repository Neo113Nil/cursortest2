package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.messaging.internal.view.timeline.poll.a;

/* loaded from: classes15.dex */
public final class ir80 extends a {
    public static final int C3 = olh0.msg_vh_chat_other_poll_message;
    public final View B3;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ir80(jwf jwfVar) {
        super(false, r0, jwfVar);
        View g = g8a1.g((ViewGroup) jwfVar.k, olh0.msg_vh_chat_other_poll_message);
        this.B3 = g.findViewById(e9h0.message_content);
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final int B0() {
        return 0;
    }

    @Override // com.yandex.messaging.internal.view.timeline.c
    public final View C0() {
        return this.B3;
    }

    @Override // com.yandex.messaging.internal.view.timeline.poll.a, com.yandex.messaging.internal.view.timeline.c, com.yandex.messaging.internal.view.timeline.e
    public final void X(yab yabVar, vb5 vb5Var) {
        super.X(yabVar, vb5Var);
        this.O = new tbz0(yabVar.Z(), yabVar.a());
    }
}
