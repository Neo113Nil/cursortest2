package xsna;

import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.im.engine.models.messages.Msg;
import com.vk.metrics.eventtracking.Event;

/* compiled from: AudioMsgReporter.kt */
/* loaded from: classes.dex */
public final class tr4 extends s140 {
    @Override // xsna.s140
    public final void e(Msg msg, AttachWithTranscription attachWithTranscription, long j, boolean z, boolean z2, int i) {
        int i2 = (int) j;
        long y = msg.y();
        int Z5 = msg.Z5();
        StringBuilder sb = new StringBuilder();
        sb.append(attachWithTranscription.q());
        sb.append('_');
        sb.append(attachWithTranscription.getId());
        new uq4(i2, z, y, Z5, sb.toString(), i == 0, z2).q();
    }

    @Override // xsna.s140
    public final void g(Msg msg, AttachWithTranscription attachWithTranscription) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b = h5s.b("vkm_transcript_toggle");
        b.b("peer_id", Long.valueOf(msg.y()));
        b.b("conversation_message_id", Integer.valueOf(msg.Z5()));
        StringBuilder sb = new StringBuilder();
        sb.append(attachWithTranscription.q());
        sb.append('_');
        sb.append(attachWithTranscription.getId());
        b.c("audio_message_id", sb.toString());
        b.b("show", 0);
        com.vk.movika.sdk.base.model.n.c(b, thp0.c, bVar);
    }

    @Override // xsna.s140
    public final void h(Msg msg, AttachWithTranscription attachWithTranscription) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b = h5s.b("vkm_transcript_toggle");
        b.b("peer_id", Long.valueOf(msg.y()));
        b.b("conversation_message_id", Integer.valueOf(msg.Z5()));
        StringBuilder sb = new StringBuilder();
        sb.append(attachWithTranscription.q());
        sb.append('_');
        sb.append(attachWithTranscription.getId());
        b.c("audio_message_id", sb.toString());
        b.b("show", 1);
        com.vk.movika.sdk.base.model.n.c(b, thp0.c, bVar);
    }
}
