package xsna;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.widget.GalleryRecyclerView;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import xsna.tna0;

/* compiled from: GalleryPinchGestureHelper.kt */
/* loaded from: classes15.dex */
public final class e5t implements tna0.a {
    public final c5t b;
    public final tna0 c = new tna0(this);
    public boolean d = true;
    public final d5t e = new d5t(this);
    public float f = 1.0f;
    public int g;

    public e5t(int i, c5t c5tVar) {
        this.b = c5tVar;
        this.g = i;
    }

    @Override // xsna.tna0.a
    public final void W(float f, float f2, float f3, float f4, float f5) {
        int i;
        RecyclerView.Adapter adapter;
        int i2;
        float f6 = this.f * f3;
        this.f = f6;
        boolean z = true;
        if (f6 > 1.35f && (i2 = this.g) > 1) {
            this.g = i2 - 1;
        } else if (f6 >= 0.85f || (i = this.g) >= 5) {
            return;
        } else {
            this.g = i + 1;
        }
        this.f = 1.0f;
        int i3 = this.g;
        c5t c5tVar = this.b;
        WeakReference<GalleryRecyclerView> weakReference = c5tVar.a;
        GalleryRecyclerView galleryRecyclerView = weakReference.get();
        if ((galleryRecyclerView == null || galleryRecyclerView.getSpanCount() != 1) && i3 != 1) {
            z = false;
        }
        GalleryRecyclerView galleryRecyclerView2 = weakReference.get();
        if (galleryRecyclerView2 != null) {
            galleryRecyclerView2.setSpanCount(i3);
        }
        WeakReference<View> weakReference2 = c5tVar.c;
        View view = weakReference2 != null ? weakReference2.get() : null;
        GalleryRecyclerView galleryRecyclerView3 = weakReference.get();
        RecyclerView recyclerView = galleryRecyclerView3 != null ? galleryRecyclerView3.getRecyclerView() : null;
        if (view != null && recyclerView != null) {
            int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
            int height = (recyclerView.getHeight() - view.getHeight()) / 2;
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (gridLayoutManager != null) {
                gridLayoutManager.K(childLayoutPosition, height);
            }
        }
        if (z) {
            GalleryRecyclerView galleryRecyclerView4 = weakReference.get();
            RecyclerView recyclerView2 = galleryRecyclerView4 != null ? galleryRecyclerView4.getRecyclerView() : null;
            if (recyclerView2 != null && (adapter = recyclerView2.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
            c5tVar.b.invoke();
        }
    }

    @Override // xsna.tna0.a
    public final void a(float f, float f2, float f3, float f4) {
        float f5 = f + f3;
        float f6 = 2;
        Pair<Float, Float> pair = new Pair<>(Float.valueOf(f5 / f6), Float.valueOf((f2 + f4) / f6));
        c5t c5tVar = this.b;
        c5tVar.a(pair);
        c5tVar.b(false);
    }

    @Override // xsna.tna0.a
    public final void m() {
        this.f = 1.0f;
        c5t c5tVar = this.b;
        c5tVar.a(null);
        c5tVar.b(true);
    }
}
