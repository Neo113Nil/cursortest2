package xsna;

import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class w3a implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ g8m c;

    public /* synthetic */ w3a(g8m g8mVar, int i) {
        this.b = i;
        this.c = g8mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return (ClipsEntryPointsComponent) this.c.c(fpf0.a(ClipsEntryPointsComponent.class));
            default:
                return (NewsFeedBridgeComponent) this.c.a(fpf0.a(NewsFeedBridgeComponent.class));
        }
    }
}
