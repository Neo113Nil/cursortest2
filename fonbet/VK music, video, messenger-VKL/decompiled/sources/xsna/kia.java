package xsna;

import com.vk.notifications.list.api.di.NotificationListComponent;
import com.vk.video.music.api.di.MusicInVideoComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class kia implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ kia(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (MusicInVideoComponent) this.c.a(fpf0.a(MusicInVideoComponent.class));
            default:
                return (NotificationListComponent) this.c.a(fpf0.a(NotificationListComponent.class));
        }
    }
}
