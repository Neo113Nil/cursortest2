package xsna;

import androidx.recyclerview.widget.m;
import com.vk.dto.photo.Photo;

/* compiled from: PhotoDiffUtilCallback.kt */
/* loaded from: classes3.dex */
public final class y5a0 extends m.e<Photo> {
    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(Photo photo, Photo photo2) {
        return photo.equals(photo2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(Photo photo, Photo photo2) {
        return photo.c == photo2.c;
    }

    @Override // androidx.recyclerview.widget.m.e
    public final Object getChangePayload(Photo photo, Photo photo2) {
        return photo2;
    }
}
