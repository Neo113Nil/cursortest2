package xsna;

import com.vk.dto.narratives.HighlightCover;
import com.vk.narratives.impl.highlights.HighlightChooseCoverFragment;

/* compiled from: Delegates.kt */
/* loaded from: classes3.dex */
public final class s4v extends wq70<HighlightCover> {
    public final /* synthetic */ HighlightChooseCoverFragment.c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4v(HighlightCover highlightCover, HighlightChooseCoverFragment.c cVar) {
        super(highlightCover);
        this.b = cVar;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy<?> qcyVar, HighlightCover highlightCover, HighlightCover highlightCover2) {
        HighlightChooseCoverFragment.c cVar = this.b;
        cVar.submitList(cVar.x0());
    }
}
