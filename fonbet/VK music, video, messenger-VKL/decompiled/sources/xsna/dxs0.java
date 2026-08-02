package xsna;

import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.engine.models.messages.Msg;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImMessagingRecognition;

/* compiled from: VideoMsgReporterImpl.kt */
/* loaded from: classes5.dex */
public final class dxs0 implements cxs0 {
    public static final dxs0 a = new dxs0();

    @Override // xsna.cxs0
    public final void a(Msg msg, AttachVideoMsg attachVideoMsg) {
        if (msg == null || attachVideoMsg == null) {
            return;
        }
        MobileOfficialAppsImStat$TypeImMessagingRecognition.Event event = MobileOfficialAppsImStat$TypeImMessagingRecognition.Event.VIEWED_PERC_25;
        MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType messageType = MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType.VIDEO_MESSAGE;
        long j = msg.c;
        long j2 = attachVideoMsg.b.I0().b;
        int i = msg.d;
        int i2 = msg.b;
        int duration = attachVideoMsg.b.getDuration();
        MobileOfficialAppsImStat$TypeImMessagingRecognition mobileOfficialAppsImStat$TypeImMessagingRecognition = new MobileOfficialAppsImStat$TypeImMessagingRecognition(event, messageType, j, null, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(duration), MobileOfficialAppsImStat$TypeImMessagingRecognition.Source.MSG_LIST_ATTACH, Integer.valueOf(attachVideoMsg.c), null, null, null, null, null, null, null, null, Long.valueOf(j2), 130568, null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsImStat$TypeImMessagingRecognition;
        kx6Var.q();
    }

    @Override // xsna.cxs0
    public final void b(Msg msg, AttachVideoMsg attachVideoMsg) {
        if (msg == null || attachVideoMsg == null) {
            return;
        }
        MobileOfficialAppsImStat$TypeImMessagingRecognition.Event event = MobileOfficialAppsImStat$TypeImMessagingRecognition.Event.VIEWED_PERC_50;
        MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType messageType = MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType.VIDEO_MESSAGE;
        long j = msg.c;
        long j2 = attachVideoMsg.b.I0().b;
        int i = msg.d;
        int i2 = msg.b;
        int duration = attachVideoMsg.b.getDuration();
        MobileOfficialAppsImStat$TypeImMessagingRecognition mobileOfficialAppsImStat$TypeImMessagingRecognition = new MobileOfficialAppsImStat$TypeImMessagingRecognition(event, messageType, j, null, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(duration), MobileOfficialAppsImStat$TypeImMessagingRecognition.Source.MSG_LIST_ATTACH, Integer.valueOf(attachVideoMsg.c), null, null, null, null, null, null, null, null, Long.valueOf(j2), 130568, null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsImStat$TypeImMessagingRecognition;
        kx6Var.q();
    }

    @Override // xsna.cxs0
    public final void c(Msg msg, AttachVideoMsg attachVideoMsg) {
        if (msg == null || attachVideoMsg == null) {
            return;
        }
        MobileOfficialAppsImStat$TypeImMessagingRecognition.Event event = MobileOfficialAppsImStat$TypeImMessagingRecognition.Event.CLOSE;
        MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType messageType = MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType.VIDEO_MESSAGE;
        long j = msg.c;
        long j2 = attachVideoMsg.b.I0().b;
        MobileOfficialAppsImStat$TypeImMessagingRecognition.Actor actor = MobileOfficialAppsImStat$TypeImMessagingRecognition.Actor.AUTO;
        int i = msg.d;
        int i2 = msg.b;
        int duration = attachVideoMsg.b.getDuration();
        MobileOfficialAppsImStat$TypeImMessagingRecognition mobileOfficialAppsImStat$TypeImMessagingRecognition = new MobileOfficialAppsImStat$TypeImMessagingRecognition(event, messageType, j, actor, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(duration), MobileOfficialAppsImStat$TypeImMessagingRecognition.Source.MSG_LIST_ATTACH, Integer.valueOf(attachVideoMsg.c), null, null, null, null, null, null, null, null, Long.valueOf(j2), 130560, null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsImStat$TypeImMessagingRecognition;
        kx6Var.q();
    }

    @Override // xsna.cxs0
    public final void d(long j, long j2, int i, boolean z) {
        MobileOfficialAppsImStat$TypeImMessagingRecognition mobileOfficialAppsImStat$TypeImMessagingRecognition = new MobileOfficialAppsImStat$TypeImMessagingRecognition(MobileOfficialAppsImStat$TypeImMessagingRecognition.Event.USE_ZOOM, MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType.VIDEO_MESSAGE, j, null, null, null, null, null, Integer.valueOf(i), z ? MobileOfficialAppsImStat$TypeImMessagingRecognition.RecordType.LONGTAP : MobileOfficialAppsImStat$TypeImMessagingRecognition.RecordType.TAP, null, null, null, null, null, null, null, Long.valueOf(j2), 130296, null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsImStat$TypeImMessagingRecognition;
        kx6Var.q();
    }

    @Override // xsna.cxs0
    public final void e(long j, long j2, int i, boolean z) {
        MobileOfficialAppsImStat$TypeImMessagingRecognition mobileOfficialAppsImStat$TypeImMessagingRecognition = new MobileOfficialAppsImStat$TypeImMessagingRecognition(MobileOfficialAppsImStat$TypeImMessagingRecognition.Event.SWITCH_CAMERA, MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType.VIDEO_MESSAGE, j, null, null, null, null, null, Integer.valueOf(i), z ? MobileOfficialAppsImStat$TypeImMessagingRecognition.RecordType.LONGTAP : MobileOfficialAppsImStat$TypeImMessagingRecognition.RecordType.TAP, null, null, null, null, null, null, null, Long.valueOf(j2), 130296, null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsImStat$TypeImMessagingRecognition;
        kx6Var.q();
    }

    @Override // xsna.cxs0
    public final void f(Msg msg, AttachVideoMsg attachVideoMsg) {
        if (msg == null || attachVideoMsg == null) {
            return;
        }
        MobileOfficialAppsImStat$TypeImMessagingRecognition.Event event = MobileOfficialAppsImStat$TypeImMessagingRecognition.Event.PLAY;
        MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType messageType = MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType.VIDEO_MESSAGE;
        long j = msg.c;
        long j2 = attachVideoMsg.b.I0().b;
        MobileOfficialAppsImStat$TypeImMessagingRecognition.Actor actor = MobileOfficialAppsImStat$TypeImMessagingRecognition.Actor.USER;
        int i = msg.d;
        int i2 = msg.b;
        int duration = attachVideoMsg.b.getDuration();
        MobileOfficialAppsImStat$TypeImMessagingRecognition mobileOfficialAppsImStat$TypeImMessagingRecognition = new MobileOfficialAppsImStat$TypeImMessagingRecognition(event, messageType, j, actor, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(duration), MobileOfficialAppsImStat$TypeImMessagingRecognition.Source.MSG_LIST_ATTACH, Integer.valueOf(attachVideoMsg.c), null, null, null, null, null, null, null, null, Long.valueOf(j2), 130560, null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsImStat$TypeImMessagingRecognition;
        kx6Var.q();
    }

    @Override // xsna.cxs0
    public final void g(Msg msg, AttachVideoMsg attachVideoMsg) {
        if (msg == null || attachVideoMsg == null) {
            return;
        }
        MobileOfficialAppsImStat$TypeImMessagingRecognition.Event event = MobileOfficialAppsImStat$TypeImMessagingRecognition.Event.VIEWED_FINISH;
        MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType messageType = MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType.VIDEO_MESSAGE;
        long j = msg.c;
        long j2 = attachVideoMsg.b.I0().b;
        int i = msg.d;
        int i2 = msg.b;
        int duration = attachVideoMsg.b.getDuration();
        MobileOfficialAppsImStat$TypeImMessagingRecognition mobileOfficialAppsImStat$TypeImMessagingRecognition = new MobileOfficialAppsImStat$TypeImMessagingRecognition(event, messageType, j, null, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(duration), MobileOfficialAppsImStat$TypeImMessagingRecognition.Source.MSG_LIST_ATTACH, Integer.valueOf(attachVideoMsg.c), null, null, null, null, null, null, null, null, Long.valueOf(j2), 130568, null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsImStat$TypeImMessagingRecognition;
        kx6Var.q();
    }

    @Override // xsna.cxs0
    public final void h(long j, long j2, Integer num, Integer num2, Integer num3, Integer num4) {
        MobileOfficialAppsImStat$TypeImMessagingRecognition mobileOfficialAppsImStat$TypeImMessagingRecognition = new MobileOfficialAppsImStat$TypeImMessagingRecognition(MobileOfficialAppsImStat$TypeImMessagingRecognition.Event.SAVE, MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType.VIDEO_MESSAGE, j, null, num, num2, num3, null, num4, null, null, null, null, null, null, null, null, Long.valueOf(j2), 130696, null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsImStat$TypeImMessagingRecognition;
        kx6Var.q();
    }

    @Override // xsna.cxs0
    public final void i(Msg msg, AttachVideoMsg attachVideoMsg) {
        if (msg == null || attachVideoMsg == null) {
            return;
        }
        MobileOfficialAppsImStat$TypeImMessagingRecognition.Event event = MobileOfficialAppsImStat$TypeImMessagingRecognition.Event.VIEWED_PERC_75;
        MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType messageType = MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType.VIDEO_MESSAGE;
        long j = msg.c;
        long j2 = attachVideoMsg.b.I0().b;
        int i = msg.d;
        int i2 = msg.b;
        int duration = attachVideoMsg.b.getDuration();
        MobileOfficialAppsImStat$TypeImMessagingRecognition mobileOfficialAppsImStat$TypeImMessagingRecognition = new MobileOfficialAppsImStat$TypeImMessagingRecognition(event, messageType, j, null, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(duration), MobileOfficialAppsImStat$TypeImMessagingRecognition.Source.MSG_LIST_ATTACH, Integer.valueOf(attachVideoMsg.c), null, null, null, null, null, null, null, null, Long.valueOf(j2), 130568, null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsImStat$TypeImMessagingRecognition;
        kx6Var.q();
    }

    @Override // xsna.cxs0
    public final void j(long j, long j2, int i, boolean z) {
        MobileOfficialAppsImStat$TypeImMessagingRecognition mobileOfficialAppsImStat$TypeImMessagingRecognition = new MobileOfficialAppsImStat$TypeImMessagingRecognition(MobileOfficialAppsImStat$TypeImMessagingRecognition.Event.RECORD_START, MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType.VIDEO_MESSAGE, j, null, null, null, null, null, Integer.valueOf(i), z ? MobileOfficialAppsImStat$TypeImMessagingRecognition.RecordType.LONGTAP : MobileOfficialAppsImStat$TypeImMessagingRecognition.RecordType.TAP, null, null, null, null, null, null, null, Long.valueOf(j2), 130296, null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsImStat$TypeImMessagingRecognition;
        kx6Var.q();
    }

    @Override // xsna.cxs0
    public final void k(Msg msg, AttachVideoMsg attachVideoMsg) {
        if (msg == null || attachVideoMsg == null) {
            return;
        }
        MobileOfficialAppsImStat$TypeImMessagingRecognition.Event event = MobileOfficialAppsImStat$TypeImMessagingRecognition.Event.PAUSE;
        MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType messageType = MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType.VIDEO_MESSAGE;
        long j = msg.c;
        long j2 = attachVideoMsg.b.I0().b;
        MobileOfficialAppsImStat$TypeImMessagingRecognition.Actor actor = MobileOfficialAppsImStat$TypeImMessagingRecognition.Actor.USER;
        int i = msg.d;
        int i2 = msg.b;
        int duration = attachVideoMsg.b.getDuration();
        MobileOfficialAppsImStat$TypeImMessagingRecognition mobileOfficialAppsImStat$TypeImMessagingRecognition = new MobileOfficialAppsImStat$TypeImMessagingRecognition(event, messageType, j, actor, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(duration), MobileOfficialAppsImStat$TypeImMessagingRecognition.Source.MSG_LIST_ATTACH, Integer.valueOf(attachVideoMsg.c), null, null, null, null, null, null, null, null, Long.valueOf(j2), 130560, null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsImStat$TypeImMessagingRecognition;
        kx6Var.q();
    }
}
