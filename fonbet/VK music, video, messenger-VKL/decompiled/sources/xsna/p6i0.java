package xsna;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.imageloader.view.VKImageView;
import com.vk.photos.root.selectalbum.domain.PhotoAlbumWrapper;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.f5h0;

/* compiled from: SelectAlbumViewHolder.kt */
/* loaded from: classes4.dex */
public final class p6i0 extends vif0<PhotoAlbumWrapper.CommonPhotoAlbum> {
    public final kdg0 n;
    public final el1 o;
    public final VKImageView p;
    public final TextView q;
    public final ImageView r;
    public final Drawable s;
    public final Object t;

    public p6i0(View view, kdg0 kdg0Var, el1 el1Var, dn20 dn20Var) {
        super(view);
        this.n = kdg0Var;
        this.o = el1Var;
        VKImageView vKImageView = (VKImageView) view.findViewById(R.id.photo);
        this.p = vKImageView;
        this.q = (TextView) view.findViewById(R.id.title);
        this.r = (ImageView) view.findViewById(R.id.select);
        Drawable e = enj.e(R.drawable.vk_icon_picture_outline_28, R.attr.vk_ui_icon_secondary, this.itemView.getContext());
        this.s = e;
        this.t = msy.a(LazyThreadSafetyMode.NONE, new lva0(this, 14));
        vKImageView.Q0(e, f5h0.e.a);
        vKImageView.getHierarchy().u(RoundingParams.b(cn70.b(6)));
        bwt0.i0(view, new qt5(26, dn20Var, this));
    }

    @Override // xsna.vif0
    public final void i6(PhotoAlbumWrapper.CommonPhotoAlbum commonPhotoAlbum) {
        PhotoAlbumWrapper.CommonPhotoAlbum commonPhotoAlbum2 = commonPhotoAlbum;
        PhotoAlbum photoAlbum = commonPhotoAlbum2.e;
        s3q0 s3q0Var = s3q0.a;
        q6(commonPhotoAlbum2);
        PhotoRestriction photoRestriction = photoAlbum.s;
        kdg0 kdg0Var = this.n;
        VKImageView vKImageView = this.p;
        if (photoRestriction == null) {
            kdg0Var.f(vKImageView);
            bwt0.S(vKImageView, new r770(5, photoAlbum, this));
        } else {
            String str = photoAlbum.l;
            if (str.length() == 0) {
                str = photoAlbum.k;
            }
            kdg0Var.d(vKImageView, photoAlbum.s, true, false, new jhg(str, 2));
        }
    }

    @Override // xsna.vif0
    public final /* bridge */ /* synthetic */ void j6(PhotoAlbumWrapper.CommonPhotoAlbum commonPhotoAlbum, Object obj) {
        q6(commonPhotoAlbum);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void q6(PhotoAlbumWrapper.CommonPhotoAlbum commonPhotoAlbum) {
        PhotoAlbum photoAlbum = commonPhotoAlbum.e;
        this.r.setVisibility(!commonPhotoAlbum.f ? 4 : 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) photoAlbum.g);
        if (this.o.a(photoAlbum)) {
            spannableStringBuilder.append((CharSequence) " ");
            ImageSpan imageSpan = new ImageSpan((Drawable) this.t.getValue(), 0);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(imageSpan, length - 1, length, 33);
        }
        o6i0 o6i0Var = new o6i0(0, this, photoAlbum);
        TextView textView = this.q;
        bwt0.S(textView, o6i0Var);
        textView.setText(spannableStringBuilder);
    }
}
