package xsna;

import com.vk.im.engine.reporters.performance.events.LogType;

/* compiled from: ChannelsStubAttachReporterImpl.kt */
/* loaded from: classes5.dex */
public final class kkb implements jkb {
    public static final kkb a = new kkb();
    public static volatile Long b;

    @Override // xsna.jkb
    public final void a(long j) {
        Long l = b;
        if (l != null && j == l.longValue()) {
            new r3w0(LogType.ACTIVE_CHANNEL_STUB_ATTACH, null, null, null, null, null, null, null, null, null, null, 16382).q();
        }
    }

    @Override // xsna.jkb
    public final void b(Long l) {
        b = l;
    }
}
