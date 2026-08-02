package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.design.view.templates.ClipsTemplateEditorFragmentsBottomView;

/* compiled from: ClipsTemplateEditorFragmentsBottomView.kt */
/* loaded from: classes16.dex */
public final class s7f extends RecyclerView.t {
    public final /* synthetic */ ClipsTemplateEditorFragmentsBottomView b;

    public s7f(ClipsTemplateEditorFragmentsBottomView clipsTemplateEditorFragmentsBottomView) {
        this.b = clipsTemplateEditorFragmentsBottomView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3 = ClipsTemplateEditorFragmentsBottomView.j;
        this.b.c();
    }
}
