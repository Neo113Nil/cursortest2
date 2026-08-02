package xsna;

import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.clips.upload.vk.api.di.ClipsUploadVkComponent;
import com.vk.narratives.api.di.NarrativeComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class g1h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ g1h(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((NarrativeComponent) this.c.a(fpf0.a(NarrativeComponent.class))).h3();
            case 1:
                return ((ClipsUploadVkComponent) this.c.a(fpf0.a(ClipsUploadVkComponent.class))).Uc();
            default:
                return ((LinksBridgeComponent) this.c.a(fpf0.a(LinksBridgeComponent.class))).p().e();
        }
    }
}
