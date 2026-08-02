package xsna;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.f5h0;

/* compiled from: AlbumViewHolder.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes4.dex */
public final class ql1 extends vif0<PhotoAlbum> {
    public final kdg0 n;
    public final VKImageView o;
    public final TextView p;
    public final TextView q;
    public final ImageView r;
    public final Drawable s;

    public ql1(View view, kdg0 kdg0Var, final mq1 mq1Var, lb lbVar) {
        super(view);
        this.n = kdg0Var;
        ImageView imageView = (ImageView) view.findViewById(R.id.reorder);
        VKImageView vKImageView = (VKImageView) view.findViewById(R.id.photo);
        this.o = vKImageView;
        this.p = (TextView) view.findViewById(R.id.title);
        this.q = (TextView) view.findViewById(R.id.description);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.delete);
        this.r = imageView2;
        Drawable e = enj.e(R.drawable.vk_icon_picture_outline_28, R.attr.vk_ui_icon_secondary, this.itemView.getContext());
        this.s = e;
        vKImageView.Q0(e, f5h0.e.a);
        vKImageView.getHierarchy().u(RoundingParams.b(cn70.b(6)));
        imageView.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.kl1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    return false;
                }
                ql1 ql1Var = ql1.this;
                if (ql1Var.getAbsoluteAdapterPosition() == -1) {
                    return false;
                }
                mq1Var.invoke(ql1Var, ql1Var.m);
                return false;
            }
        });
        bwt0.i0(imageView2, new ll1(0, lbVar, this));
    }

    @Override // xsna.vif0
    public final void i6(PhotoAlbum photoAlbum) {
        PhotoAlbum photoAlbum2 = photoAlbum;
        PhotoRestriction photoRestriction = photoAlbum2.s;
        kdg0 kdg0Var = this.n;
        VKImageView vKImageView = this.o;
        if (photoRestriction == null) {
            kdg0Var.f(vKImageView);
            bwt0.S(vKImageView, new ml1(0, photoAlbum2, this));
        } else {
            String str = photoAlbum2.l;
            if (str.length() == 0) {
                str = photoAlbum2.k;
            }
            kdg0Var.d(vKImageView, photoAlbum2.s, true, false, new jhg(str, 2));
        }
        this.p.setText(photoAlbum2.g);
        this.q.setText(photoAlbum2.h);
        this.r.setContentDescription(h6(R.string.accessibility_delete_album, photoAlbum2.g));
    }
}
