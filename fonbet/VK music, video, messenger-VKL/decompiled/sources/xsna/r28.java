package xsna;

import com.vk.instantjobs.InstantJob;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.u6x;

/* compiled from: BotBtnEventTimeoutJob.kt */
/* loaded from: classes.dex */
public final class r28 extends u4w {
    public final String c;
    public final long d;

    /* compiled from: BotBtnEventTimeoutJob.kt */
    public static final class a implements s7x<r28> {
        @Override // xsna.s7x
        public final r28 a(ny90 ny90Var) {
            return new r28(ny90Var.f("eventId"), ny90Var.e(SignalingProtocol.KEY_TIMEOUT_MS));
        }

        @Override // xsna.s7x
        public final void b(r28 r28Var, ny90 ny90Var) {
            r28 r28Var2 = r28Var;
            ny90Var.o("eventId", r28Var2.c);
            ny90Var.n(SignalingProtocol.KEY_TIMEOUT_MS, r28Var2.d);
        }

        @Override // xsna.s7x
        public final String getType() {
            return "BotBtnEventTimeoutJob";
        }
    }

    public r28(String str, long j) {
        this.c = str;
        this.d = j;
    }

    @Override // xsna.u4w
    public final void L(w2w w2wVar, u6x.a aVar) {
        w2wVar.J0(this, new p28(this.c, "4"));
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationHideCondition o() {
        return InstantJob.NotificationHideCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final InstantJob.NotificationShowCondition p() {
        return InstantJob.NotificationShowCondition.NEVER;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final long r() {
        return this.d;
    }

    @Override // com.vk.instantjobs.InstantJob
    public final String s() {
        return "BotBtnEventTimeoutJob";
    }
}
