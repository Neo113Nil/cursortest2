package xsna;

import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.im.engine.models.messages.Msg;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImMessagingRecognition;

/* compiled from: VideoMsgTranscriptReporter.kt */
/* loaded from: classes.dex */
public final class kxs0 extends s140 {
    @Override // xsna.s140
    public final void e(Msg msg, AttachWithTranscription attachWithTranscription, long j, boolean z, boolean z2, int i) {
        MobileOfficialAppsImStat$TypeImMessagingRecognition.Event event = MobileOfficialAppsImStat$TypeImMessagingRecognition.Event.TRANSCRIPT_LOADING;
        MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType messageType = MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType.VIDEO_MESSAGE;
        long Cb = msg.Cb();
        long j2 = attachWithTranscription.q().b;
        int Z5 = msg.Z5();
        Integer Db = msg.Db();
        int i2 = (int) j;
        MobileOfficialAppsImStat$TypeImMessagingRecognition.Result result = i == 0 ? MobileOfficialAppsImStat$TypeImMessagingRecognition.Result.COMPLETED : MobileOfficialAppsImStat$TypeImMessagingRecognition.Result.INTERRUPTED;
        MobileOfficialAppsImStat$TypeImMessagingRecognition mobileOfficialAppsImStat$TypeImMessagingRecognition = new MobileOfficialAppsImStat$TypeImMessagingRecognition(event, messageType, Cb, z2 ? MobileOfficialAppsImStat$TypeImMessagingRecognition.Actor.AUTO : MobileOfficialAppsImStat$TypeImMessagingRecognition.Actor.USER, Integer.valueOf(Z5), Db, Integer.valueOf(i2), null, null, null, null, result, null, null, Integer.valueOf(z ? 1 : 0), null, null, Long.valueOf(j2), 112512, null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsImStat$TypeImMessagingRecognition;
        kx6Var.q();
    }

    @Override // xsna.s140
    public final void g(Msg msg, AttachWithTranscription attachWithTranscription) {
        MobileOfficialAppsImStat$TypeImMessagingRecognition.Event event = MobileOfficialAppsImStat$TypeImMessagingRecognition.Event.TRANSCRIPT_TOGGLE;
        MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType messageType = MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType.VIDEO_MESSAGE;
        long Cb = msg.Cb();
        long j = attachWithTranscription.q().b;
        int Z5 = msg.Z5();
        MobileOfficialAppsImStat$TypeImMessagingRecognition mobileOfficialAppsImStat$TypeImMessagingRecognition = new MobileOfficialAppsImStat$TypeImMessagingRecognition(event, messageType, Cb, null, Integer.valueOf(Z5), msg.Db(), null, null, null, null, 0, null, null, null, null, null, null, Long.valueOf(j), 129992, null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsImStat$TypeImMessagingRecognition;
        kx6Var.q();
    }

    @Override // xsna.s140
    public final void h(Msg msg, AttachWithTranscription attachWithTranscription) {
        MobileOfficialAppsImStat$TypeImMessagingRecognition.Event event = MobileOfficialAppsImStat$TypeImMessagingRecognition.Event.TRANSCRIPT_TOGGLE;
        MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType messageType = MobileOfficialAppsImStat$TypeImMessagingRecognition.MessageType.VIDEO_MESSAGE;
        long Cb = msg.Cb();
        long j = attachWithTranscription.q().b;
        int Z5 = msg.Z5();
        MobileOfficialAppsImStat$TypeImMessagingRecognition mobileOfficialAppsImStat$TypeImMessagingRecognition = new MobileOfficialAppsImStat$TypeImMessagingRecognition(event, messageType, Cb, null, Integer.valueOf(Z5), msg.Db(), null, null, null, null, 1, null, null, null, null, null, null, Long.valueOf(j), 129992, null);
        kx6 kx6Var = new kx6();
        kx6Var.f = mobileOfficialAppsImStat$TypeImMessagingRecognition;
        kx6Var.q();
    }
}
