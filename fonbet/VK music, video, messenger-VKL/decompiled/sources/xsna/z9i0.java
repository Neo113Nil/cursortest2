package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vkontakte.android.R;
import xsna.f5h0;

/* compiled from: SelectSpecialAlbumViewHolder.kt */
/* loaded from: classes4.dex */
public final class z9i0 extends vif0<PhotoAlbumWrapper.SpecialPhotoAlbum> {
    public final TextView n;
    public final ImageView o;
    public final Drawable p;

    public z9i0(View view, dn20 dn20Var) {
        super(view);
        VKImageView vKImageView = (VKImageView) view.findViewById(R.id.photo);
        this.n = (TextView) view.findViewById(R.id.title);
        this.o = (ImageView) view.findViewById(R.id.select);
        Drawable e = enj.e(R.drawable.vk_icon_picture_outline_28, R.attr.vk_ui_icon_accent, this.itemView.getContext());
        this.p = e;
        vKImageView.Q0(e, f5h0.e.a);
        bwt0.i0(view, new d50(24, dn20Var, this));
    }

    @Override // xsna.vif0
    public final void i6(PhotoAlbumWrapper.SpecialPhotoAlbum specialPhotoAlbum) {
        PhotoAlbumWrapper.SpecialPhotoAlbum specialPhotoAlbum2 = specialPhotoAlbum;
        s3q0 s3q0Var = s3q0.a;
        this.n.setText(specialPhotoAlbum2.f);
        this.o.setVisibility(!specialPhotoAlbum2.g ? 4 : 0);
    }

    @Override // xsna.vif0
    public final void j6(PhotoAlbumWrapper.SpecialPhotoAlbum specialPhotoAlbum, Object obj) {
        PhotoAlbumWrapper.SpecialPhotoAlbum specialPhotoAlbum2 = specialPhotoAlbum;
        this.n.setText(specialPhotoAlbum2.f);
        this.o.setVisibility(!specialPhotoAlbum2.g ? 4 : 0);
    }
}
