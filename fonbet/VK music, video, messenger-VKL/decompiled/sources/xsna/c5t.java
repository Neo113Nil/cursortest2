package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.widget.GalleryRecyclerView;
import java.lang.ref.WeakReference;
import kotlin.Pair;

/* compiled from: GalleryPinchGestureCallback.kt */
/* loaded from: classes15.dex */
public final class c5t {
    public final WeakReference<GalleryRecyclerView> a;
    public final b1j b;
    public WeakReference<View> c;

    public c5t(WeakReference weakReference, b1j b1jVar) {
        this.a = weakReference;
        this.b = b1jVar;
    }

    public final void a(Pair<Float, Float> pair) {
        View findChildViewUnder;
        WeakReference<View> weakReference = null;
        if (pair == null) {
            WeakReference<View> weakReference2 = this.c;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
        } else {
            float floatValue = pair.d().floatValue();
            float floatValue2 = pair.g().floatValue();
            GalleryRecyclerView galleryRecyclerView = this.a.get();
            RecyclerView recyclerView = galleryRecyclerView != null ? galleryRecyclerView.getRecyclerView() : null;
            if (recyclerView != null && (findChildViewUnder = recyclerView.findChildViewUnder(floatValue, floatValue2)) != null) {
                weakReference = new WeakReference<>(findChildViewUnder);
            }
        }
        this.c = weakReference;
    }

    public final void b(boolean z) {
        GalleryRecyclerView galleryRecyclerView = this.a.get();
        if (galleryRecyclerView != null) {
            galleryRecyclerView.setCanScroll(z);
        }
    }
}
