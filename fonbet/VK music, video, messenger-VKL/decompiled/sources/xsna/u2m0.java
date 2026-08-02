package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: View.kt */
/* loaded from: classes6.dex */
public final class u2m0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ com.vk.story.viewer.impl.presentation.stories.view.storyview.b b;
    public final /* synthetic */ View c;
    public final /* synthetic */ zlq d;
    public final /* synthetic */ ViewGroup e;
    public final /* synthetic */ FrameLayout f;

    public u2m0(com.vk.story.viewer.impl.presentation.stories.view.storyview.b bVar, View view, zlq zlqVar, ViewGroup viewGroup, FrameLayout frameLayout) {
        this.b = bVar;
        this.c = view;
        this.d = zlqVar;
        this.e = viewGroup;
        this.f = frameLayout;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        ViewGroup viewGroup = this.e;
        com.vk.story.viewer.impl.presentation.stories.view.storyview.b bVar = this.b;
        View view2 = this.c;
        zlq zlqVar = this.d;
        com.vk.story.viewer.impl.presentation.stories.view.storyview.b.a(bVar, view2, zlqVar, viewGroup);
        com.vk.story.viewer.impl.presentation.stories.view.storyview.b.b(bVar, zlqVar, this.f);
    }
}
