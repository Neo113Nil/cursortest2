package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.messaging.internal.view.timeline.galleryview.GalleryView;

/* loaded from: classes15.dex */
public final class ass extends RecyclerView.d {
    public final /* synthetic */ GalleryView a;

    public ass(GalleryView galleryView) {
        this.a = galleryView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.d
    public final void c(Rect rect, View view, RecyclerView recyclerView, RecyclerView.k kVar) {
        GalleryView galleryView = this.a;
        rect.set(0, 0, galleryView.getImagePadding(), galleryView.getImagePadding());
    }
}
