package xsna;

import android.view.ViewTreeObserver;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.attachpicker.widget.ContextProgressView;
import com.vkontakte.android.R;

/* compiled from: GalleryFragmentImpl.kt */
/* loaded from: classes15.dex */
public final class z3t implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ContextProgressView b;
    public final /* synthetic */ GalleryFragmentImpl c;

    public z3t(ContextProgressView contextProgressView, GalleryFragmentImpl galleryFragmentImpl) {
        this.b = contextProgressView;
        this.c = galleryFragmentImpl;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ContextProgressView contextProgressView = this.b;
        contextProgressView.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.c.a0 == null) {
            return false;
        }
        contextProgressView.setTranslationY(((r1.getHeight() - ((int) r3.getDimension(R.dimen.picker_top_offset))) - contextProgressView.getResources().getDimension(R.dimen.picker_gallery_loading_progress)) / 2.0f);
        return false;
    }
}
