package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ru.yandex.taxi.stories.presentation.preview.StoriesPreviewsListView;
import ru.yandex.taxi.stories.presentation.preview.StoryPreviewView;

/* loaded from: classes6.dex */
public final class enu0 implements fnu0 {
    public final /* synthetic */ StoriesPreviewsListView a;

    public enu0(StoriesPreviewsListView storiesPreviewsListView) {
        this.a = storiesPreviewsListView;
    }

    @Override // defpackage.fnu0
    public final void a(String str) {
        cnu0 cnu0Var;
        cnu0Var = this.a.adapter;
        int f = cnu0Var.f(cnu0Var.A);
        int f2 = cnu0Var.f(str);
        cnu0Var.A = str;
        if (f >= 0) {
            cnu0Var.notifyItemChanged(f);
        }
        if (f2 < 0 || f2 == f) {
            return;
        }
        cnu0Var.notifyItemChanged(f2);
    }

    @Override // defpackage.fnu0
    public final Rect b(String str) {
        cnu0 cnu0Var;
        Rect storyViewScreenBounds;
        StoriesPreviewsListView storiesPreviewsListView = this.a;
        cnu0Var = storiesPreviewsListView.adapter;
        int f = cnu0Var.f(str);
        if (f < 0) {
            return null;
        }
        storyViewScreenBounds = storiesPreviewsListView.storyViewScreenBounds(f);
        return storyViewScreenBounds;
    }

    @Override // defpackage.fnu0
    public final View c(String str) {
        cnu0 cnu0Var;
        RecyclerView.e layoutManager;
        StoriesPreviewsListView storiesPreviewsListView = this.a;
        cnu0Var = storiesPreviewsListView.adapter;
        int f = cnu0Var.f(str);
        if (f < 0 || (layoutManager = storiesPreviewsListView.getLayoutManager()) == null) {
            return null;
        }
        return layoutManager.X(f);
    }

    @Override // defpackage.fnu0
    public final void d(String str) {
        cnu0 cnu0Var;
        StoriesPreviewsListView storiesPreviewsListView = this.a;
        cnu0Var = storiesPreviewsListView.adapter;
        int f = cnu0Var.f(cnu0Var.A);
        int f2 = cnu0Var.f(str);
        cnu0Var.A = str;
        if (f >= 0) {
            cnu0Var.notifyItemChanged(f);
        }
        if (f2 >= 0 && f2 != f) {
            cnu0Var.notifyItemChanged(f2);
        }
        storiesPreviewsListView.scrollToOpenedStory();
    }

    @Override // defpackage.fnu0
    public final void e() {
        cnu0 cnu0Var;
        View X;
        StoryPreviewView storyPreviewView;
        StoriesPreviewsListView storiesPreviewsListView = this.a;
        RecyclerView.e layoutManager = storiesPreviewsListView.getLayoutManager();
        if (layoutManager != null) {
            cnu0Var = storiesPreviewsListView.adapter;
            int f = cnu0Var.f(cnu0Var.A);
            if (f >= 0 && (X = layoutManager.X(f)) != null && (storyPreviewView = (StoryPreviewView) X.findViewById(kdh0.root)) != null) {
                storyPreviewView.animateFromClosedStory();
            }
            cnu0Var.A = null;
        }
    }
}
