package xsna;

import com.vk.bridges.di.BridgeComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class tnh implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ tnh(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((StoryViewerComponent) this.c.a(fpf0.a(StoryViewerComponent.class))).z3();
            default:
                return ((BridgeComponent) this.c.a(fpf0.a(BridgeComponent.class))).t();
        }
    }
}
