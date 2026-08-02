package xsna;

import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.im.ui.di.MaxUtilityComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class bff implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ bff(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((LinksBridgeComponent) this.c.a(fpf0.a(LinksBridgeComponent.class))).p();
            case 1:
                return ((NewsFeedComponent) this.c.a(fpf0.a(NewsFeedComponent.class))).G2();
            default:
                return (MaxUtilityComponent) this.c.mo408a(fpf0.a(MaxUtilityComponent.class));
        }
    }
}
