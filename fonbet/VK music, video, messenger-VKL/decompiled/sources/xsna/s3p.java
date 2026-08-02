package xsna;

import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: EditorBottomMultiStoriesView.kt */
/* loaded from: classes16.dex */
public final class s3p extends FrameLayout {
    public final RecyclerView b;
    public f640 c;
    public final LinearLayoutManager d;
    public ujf0 e;
    public final ImageView f;
    public gzs<s3q0> g;
    public ImageView h;

    /* compiled from: EditorBottomMultiStoriesView.kt */
    public static final class a extends RecyclerView.n {
        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
            if (childLayoutPosition != 0) {
                rect.left = cn70.b(8);
            } else {
                rect.left = cn70.b(8);
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter == null || childLayoutPosition + 1 != adapter.getItemCount()) {
                return;
            }
            rect.right = cn70.b(36);
        }
    }

    public s3p(l7s l7sVar) {
        super(l7sVar, null, 0);
        View.inflate(l7sVar, R.layout.story_editor_picker_preview_view, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_images_preview);
        this.b = recyclerView;
        recyclerView.getContext();
        this.d = new LinearLayoutManager(0, false);
        ImageView imageView = (ImageView) findViewById(R.id.action);
        this.f = imageView;
        bwt0.i0(imageView, new qqe(this, 14));
        recyclerView.addOnScrollListener(new r3p(this));
    }

    public final Integer a() {
        int itemCount;
        f640 f640Var = this.c;
        if (f640Var != null && (itemCount = f640Var.getItemCount()) >= 0) {
            int i = 0;
            while (true) {
                Object c = f640Var.c.c(i);
                h640 h640Var = c instanceof h640 ? (h640) c : null;
                if (h640Var != null && h640Var.b) {
                    return Integer.valueOf(i);
                }
                if (i == itemCount) {
                    break;
                }
                i++;
            }
        }
        return null;
    }

    public final void b() {
        RecyclerView recyclerView = this.b;
        if (recyclerView.getScrollState() != 0) {
            return;
        }
        Integer a2 = a();
        if (a2 == null) {
            ImageView imageView = this.h;
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager != null ? layoutManager.findViewByPosition(a2.intValue()) : null) == null) {
            ImageView imageView2 = this.h;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
                return;
            }
            return;
        }
        ImageView imageView3 = this.h;
        if (imageView3 != null) {
            imageView3.setTranslationX(bwt0.C(r1).left);
        }
        ImageView imageView4 = this.h;
        if (imageView4 != null) {
            imageView4.setVisibility(((View) recyclerView.getParent().getParent()).getVisibility() == 0 ? 0 : 8);
        }
    }

    public final f640 getGalleryPickerPreviewAdapter() {
        return this.c;
    }

    public final gzs<s3q0> getOnAction() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LinearLayoutManager linearLayoutManager = this.d;
        RecyclerView recyclerView = this.b;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.c);
        recyclerView.addItemDecoration(new a());
        ImageView imageView = (ImageView) getRootView().findViewById(R.id.remove);
        bwt0.h(recyclerView, new com.vk.movika.sdk.base.presenter.c(11, imageView, this));
        bwt0.i0(imageView, new rlh(this, 7));
        this.h = imageView;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        RecyclerView.Adapter adapter;
        ujf0 ujf0Var = this.e;
        if (ujf0Var != null && (adapter = this.b.getAdapter()) != null) {
            adapter.unregisterAdapterDataObserver(ujf0Var);
        }
        this.e = null;
        super.onDetachedFromWindow();
    }

    public final void setActionContentDescription(String str) {
        this.f.setContentDescription(str);
    }

    public final void setGalleryPickerPreviewAdapter(f640 f640Var) {
        RecyclerView.Adapter adapter;
        RecyclerView recyclerView = this.b;
        recyclerView.setAdapter(f640Var);
        this.c = f640Var;
        ujf0 ujf0Var = this.e;
        if (ujf0Var != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.unregisterAdapterDataObserver(ujf0Var);
        }
        this.e = null;
        this.e = f640Var != null ? wjf0.b(f640Var, new pff(this, 19)) : null;
    }

    public final void setItemTouchHelper(androidx.recyclerview.widget.r rVar) {
        rVar.l(this.b);
    }

    public final void setOnAction(gzs<s3q0> gzsVar) {
        this.g = gzsVar;
    }
}
