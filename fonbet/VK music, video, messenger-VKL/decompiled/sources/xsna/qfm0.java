package xsna;

import com.vk.stories.design.view.stats.carousel.PreviewSnapRecyclerView;
import xsna.pfm0;

/* compiled from: StoryStatisticsPreview.kt */
/* loaded from: classes6.dex */
public final class qfm0 implements PreviewSnapRecyclerView.a {
    public final /* synthetic */ pfm0 a;

    public qfm0(pfm0 pfm0Var) {
        this.a = pfm0Var;
    }

    @Override // com.vk.stories.design.view.stats.carousel.PreviewSnapRecyclerView.a
    public final void a(int i) {
        pfm0.a aVar = this.a.D;
        if (aVar != null) {
            aVar.h(i);
        }
    }

    @Override // com.vk.stories.design.view.stats.carousel.PreviewSnapRecyclerView.a
    public final void b() {
        pfm0.a aVar = this.a.D;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // com.vk.stories.design.view.stats.carousel.PreviewSnapRecyclerView.a
    public final void c() {
        pfm0.a aVar = this.a.D;
        if (aVar != null) {
            aVar.g();
        }
    }
}
