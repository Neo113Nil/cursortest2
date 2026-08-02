package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.ImageSize;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoTag;

/* compiled from: SuggestedPhotoTagsAdapter.kt */
/* loaded from: classes4.dex */
public final class s3n0 extends zoj0<PhotoTag, RecyclerView.e0> {
    public z980 e;
    public Photo f;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if (e0Var instanceof uba0) {
            PhotoTag photoTag = (PhotoTag) this.c.c(i);
            if (photoTag != null) {
                ((uba0) e0Var).V5(photoTag);
            }
            Photo photo = this.f;
            if (photo != null) {
                uba0 uba0Var = (uba0) e0Var;
                uba0Var.t = photo;
                ImageSize imageSize = (ImageSize) ixj0.b(photo.y.b);
                uba0Var.n.load(imageSize != null ? imageSize.d.d : null);
            }
            ((uba0) e0Var).v = this.e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new uba0(viewGroup);
    }
}
