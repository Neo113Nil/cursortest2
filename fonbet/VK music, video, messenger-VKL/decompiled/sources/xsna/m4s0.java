package xsna;

import com.vk.stat.scheme.SchemeStat$TypeBackgroundItem;
import com.vk.stat.scheme.SchemeStat$TypeVideoBackgroundListeningItem;

/* compiled from: VideoBackgroundAnalyticsController.kt */
/* loaded from: classes2.dex */
public final class m4s0 implements j0q0 {
    public final /* synthetic */ com.vk.libvideo.autoplay.background.controller.a a;

    public m4s0(com.vk.libvideo.autoplay.background.controller.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.j0q0
    public final SchemeStat$TypeBackgroundItem.b a() {
        return c(SchemeStat$TypeVideoBackgroundListeningItem.EventType.END);
    }

    @Override // xsna.j0q0
    public final SchemeStat$TypeVideoBackgroundListeningItem b() {
        return c(SchemeStat$TypeVideoBackgroundListeningItem.EventType.START);
    }

    public final SchemeStat$TypeVideoBackgroundListeningItem c(SchemeStat$TypeVideoBackgroundListeningItem.EventType eventType) {
        com.vk.libvideo.autoplay.background.controller.a aVar = this.a;
        yg5 b = aVar.b.b();
        if (b != null && aVar.c.a(b) && b.J0() && !b.R0().h()) {
            return new SchemeStat$TypeVideoBackgroundListeningItem(eventType, Integer.valueOf((int) (b.getPosition() / 1000)));
        }
        return null;
    }
}
