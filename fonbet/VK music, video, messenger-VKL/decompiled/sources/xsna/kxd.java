package xsna;

import com.vk.media.filters.di.FiltersComponent;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.newsfeed.api.di.PostingSettingsComponent;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class kxd implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ h7m c;

    public /* synthetic */ kxd(h7m h7mVar, int i) {
        this.b = i;
        this.c = h7mVar;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return ((FiltersComponent) this.c.mo408a(fpf0.a(FiltersComponent.class))).r7();
            case 1:
                return ((NarrativeComponent) this.c.a(fpf0.a(NarrativeComponent.class))).h3();
            default:
                return (PostingSettingsComponent) this.c.mo408a(fpf0.a(PostingSettingsComponent.class));
        }
    }
}
