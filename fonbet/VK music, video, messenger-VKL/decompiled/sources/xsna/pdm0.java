package xsna;

import android.view.ViewGroup;
import com.vk.camera.editor.stories.impl.share.content.StoryShareContentType;
import xsna.rdm0;

/* compiled from: StoryShareContentDelegate.kt */
/* loaded from: classes16.dex */
public final class pdm0 extends p1u0<rdm0.b> {
    public final izs<x7j0, s3q0> a;
    public final StoryShareContentType b;

    /* JADX WARN: Multi-variable type inference failed */
    public pdm0(izs<? super x7j0, s3q0> izsVar, StoryShareContentType storyShareContentType) {
        this.a = izsVar;
        this.b = storyShareContentType;
    }

    @Override // xsna.p1u0
    public final vfz<? extends rdm0.b> b(ViewGroup viewGroup) {
        return new qdm0(viewGroup, this.a, this.b);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof rdm0.b;
    }
}
