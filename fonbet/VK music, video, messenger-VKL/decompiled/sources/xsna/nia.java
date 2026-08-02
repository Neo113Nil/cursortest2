package xsna;

import com.vk.feed.blacklist.api.di.BlacklistComponent;
import com.vk.video.focus.api.VideoFocusComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class nia implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ nia(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (VideoFocusComponent) this.c.a(fpf0.a(VideoFocusComponent.class));
            default:
                return (BlacklistComponent) this.c.a(fpf0.a(BlacklistComponent.class));
        }
    }
}
