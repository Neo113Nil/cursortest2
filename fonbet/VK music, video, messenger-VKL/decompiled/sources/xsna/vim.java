package xsna;

import com.vk.metrics.eventtracking.Event;

/* compiled from: DialogPreviewReporterImpl.kt */
/* loaded from: classes5.dex */
public final class vim implements uim {
    public static final vim a = new vim();

    @Override // xsna.uim
    public final void a(long j) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b = h5s.b("messages_open_dialog_from_preview");
        b.b("peer_id", Long.valueOf(j));
        com.vk.movika.sdk.base.model.n.c(b, thp0.c, bVar);
    }

    @Override // xsna.uim
    public final void b(long j) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a b = h5s.b("messages_open_preview");
        b.b("peer_id", Long.valueOf(j));
        com.vk.movika.sdk.base.model.n.c(b, thp0.c, bVar);
    }
}
