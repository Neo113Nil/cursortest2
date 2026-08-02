package xsna;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.imageloader.view.VKImageView;
import com.vk.photos.common.ui.tags.TagsSuggestionsOverlayView;
import com.vkontakte.android.R;
import xsna.fs90;
import xsna.tba0;

/* compiled from: PhotoTagsAdapter.kt */
/* loaded from: classes4.dex */
public final class bca0 extends vif0<tba0.b> {
    public final VKImageView n;
    public final VKImageView o;
    public final TextView p;
    public final TextView q;
    public final TagsSuggestionsOverlayView r;
    public final TextView s;
    public final TextView t;
    public final VKImageView u;
    public final LinearLayout v;
    public final ImageView w;
    public final TextView x;
    public final TextView y;

    public bca0(View view, x2y x2yVar, es00 es00Var, fda0 fda0Var, gda0 gda0Var, kn20 kn20Var) {
        super(view);
        VKImageView vKImageView = (VKImageView) view.findViewById(R.id.photo);
        this.n = vKImageView;
        VKImageView vKImageView2 = (VKImageView) view.findViewById(R.id.album);
        this.o = vKImageView2;
        this.p = (TextView) view.findViewById(R.id.title);
        this.q = (TextView) view.findViewById(R.id.source);
        TagsSuggestionsOverlayView tagsSuggestionsOverlayView = (TagsSuggestionsOverlayView) view.findViewById(R.id.photo_tag);
        this.r = tagsSuggestionsOverlayView;
        TextView textView = (TextView) view.findViewById(R.id.accept);
        this.s = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.decline);
        this.t = textView2;
        VKImageView vKImageView3 = (VKImageView) this.itemView.findViewById(R.id.photo_background);
        this.u = vKImageView3;
        this.v = (LinearLayout) view.findViewById(R.id.restriction_view);
        this.w = (ImageView) view.findViewById(R.id.restriction_icon);
        this.x = (TextView) view.findViewById(R.id.restriction_title);
        TextView textView3 = (TextView) view.findViewById(R.id.skip_restriction);
        this.y = textView3;
        bwt0.i0(textView, new oh3(24, x2yVar, this));
        bwt0.i0(textView2, new qd1(28, es00Var, this));
        vKImageView2.setRound(true);
        vKImageView.setOnLoadCallback(new aca0(this));
        tagsSuggestionsOverlayView.setNameVisible(false);
        vKImageView3.setPostprocessor(edg0.a);
        bwt0.i0(vKImageView2, new mu1(24, gda0Var, this));
        int i = 1;
        bwt0.i0(vKImageView3, new pm90(i, fda0Var, this));
        bwt0.i0(vKImageView, new qm90(i, fda0Var, this));
        textView3.setOnClickListener(new wad(3, kn20Var, this));
    }

    @Override // xsna.vif0
    public final void i6(tba0.b bVar) {
        String str;
        Image image;
        ImageSize Cb;
        tba0.b bVar2 = bVar;
        j6(bVar2, fs90.a.a);
        qba0 qba0Var = bVar2.a;
        String str2 = qba0Var.g;
        Owner owner = qba0Var.c;
        this.s.setText(str2);
        this.t.setText(qba0Var.h);
        Photo photo = qba0Var.a;
        ImageSize imageSize = (ImageSize) ixj0.m(photo.y.b);
        this.u.load(imageSize != null ? imageSize.d.d : null);
        PhotoAlbum photoAlbum = qba0Var.b;
        if (photoAlbum == null || (str = photoAlbum.k) == null) {
            str = (owner == null || (image = owner.g) == null || (Cb = image.Cb(iah0.z(this.itemView.getContext()), true, false)) == null) ? null : Cb.d.d;
        }
        this.o.load(str);
        boolean d = fkq0.d(photo.e);
        TextView textView = this.q;
        if (d) {
            at.d(this.itemView, R.string.photo_tags_users_photo, textView);
        } else {
            at.d(this.itemView, R.string.photo_tags_community_photo, textView);
        }
        this.p.setText(owner != null ? owner.c : null);
    }

    @Override // xsna.vif0
    /* renamed from: q6, reason: merged with bridge method [inline-methods] */
    public final void j6(tba0.b bVar, Object obj) {
        qba0 qba0Var = bVar.a;
        PhotoRestriction photoRestriction = qba0Var.a.L;
        boolean z = qba0Var.n;
        VKImageView vKImageView = this.n;
        LinearLayout linearLayout = this.v;
        TagsSuggestionsOverlayView tagsSuggestionsOverlayView = this.r;
        if (!z && photoRestriction != null) {
            bwt0.p0(tagsSuggestionsOverlayView, false);
            bwt0.p0(linearLayout, true);
            this.w.setImageResource(!photoRestriction.d ? R.drawable.vk_icon_block_outline_56 : R.drawable.vk_icon_hide_outline_56);
            this.x.setText(photoRestriction.b);
            RestrictionButton restrictionButton = photoRestriction.e;
            this.y.setText(restrictionButton != null ? restrictionButton.c : null);
            bwt0.p0(vKImageView, false);
            return;
        }
        bwt0.p0(linearLayout, false);
        bwt0.p0(tagsSuggestionsOverlayView, true);
        tagsSuggestionsOverlayView.setTags(qba0Var.a.b);
        bwt0.p0(vKImageView, true);
        if ((obj instanceof fs90.a) || (obj instanceof fs90.b)) {
            bwt0.S(this.u, new yu1(19, bVar, this));
        }
    }
}
