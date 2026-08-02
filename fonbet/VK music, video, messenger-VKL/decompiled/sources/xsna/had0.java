package xsna;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.utils.ImageViewMeasurer;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.photo.Photo;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedPhotoView;
import com.vk.feed.tool.view.newsfeed.image.FixedSizeFrescoImageViewLegacy;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.qi6;

/* compiled from: PrimaryPhotoAlbumHolder.kt */
/* loaded from: classes4.dex */
public final class had0 extends m56<AlbumAttachment> implements View.OnClickListener {
    public static final /* synthetic */ int M = 0;
    public final FixedSizeFrescoImageViewLegacy D;
    public final TextView E;
    public final ImageView F;
    public final TextView G;
    public final RestrictedPhotoView H;
    public e6o I;
    public final ColorStateList J;
    public final ColorStateList K;
    public final c5j0 L;

    public had0(ViewGroup viewGroup) {
        super(R.layout.holder_primary_album, viewGroup);
        FixedSizeFrescoImageViewLegacy fixedSizeFrescoImageViewLegacy = (FixedSizeFrescoImageViewLegacy) this.itemView.findViewById(R.id.image_view);
        this.D = fixedSizeFrescoImageViewLegacy;
        this.E = (TextView) this.itemView.findViewById(R.id.title);
        this.F = (ImageView) this.itemView.findViewById(R.id.icon);
        this.G = (TextView) this.itemView.findViewById(R.id.counter);
        RestrictedPhotoView restrictedPhotoView = (RestrictedPhotoView) this.itemView.findViewById(R.id.restriction_view);
        this.H = restrictedPhotoView;
        this.J = ColorStateList.valueOf(-1);
        abg0 abg0Var = dhr0.t;
        this.K = ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_text_secondary));
        c5j0 c5j0Var = new c5j0(0.75f);
        this.L = c5j0Var;
        if (q6() instanceof ShitAttachment) {
            fixedSizeFrescoImageViewLegacy.setOnClickListener(null);
        } else {
            View.OnClickListener onClickListener = this.I;
            fixedSizeFrescoImageViewLegacy.setOnClickListener(onClickListener == null ? this : onClickListener);
        }
        fixedSizeFrescoImageViewLegacy.setCornerRadius(cn70.b(10));
        float a = cn70.a() * 10.0f;
        jw5.q(c5j0Var.a, a);
        c5j0Var.b = !(a == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        c5j0Var.c = true;
        c5j0Var.invalidateSelf();
        fixedSizeFrescoImageViewLegacy.l(0.5f, abg0Var.c(R.attr.vk_ui_image_border_alpha));
        fixedSizeFrescoImageViewLegacy.setHeightMode(ImageViewMeasurer.HeightMode.MIN_RATIO);
        ColorDrawable colorDrawable = new ColorDrawable(abg0Var.c(R.attr.vk_ui_background_tertiary));
        fixedSizeFrescoImageViewLegacy.setPlaceholder(colorDrawable);
        fixedSizeFrescoImageViewLegacy.setEmptyPlaceholder(colorDrawable);
        dek0.b(fixedSizeFrescoImageViewLegacy, new ead0(this), null, 12);
        restrictedPhotoView.setTextSize(14.0f);
        restrictedPhotoView.setTextMaxLines(3);
        restrictedPhotoView.setTextTopMargin(cn70.b(12));
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.I = s6oVar.a(this, s6oVar.e);
        boolean z = q6() instanceof ShitAttachment;
        FixedSizeFrescoImageViewLegacy fixedSizeFrescoImageViewLegacy = this.D;
        if (z) {
            fixedSizeFrescoImageViewLegacy.setOnClickListener(null);
            return;
        }
        View.OnClickListener onClickListener = this.I;
        if (onClickListener == null) {
            onClickListener = this;
        }
        fixedSizeFrescoImageViewLegacy.setOnClickListener(onClickListener);
    }

    @Override // xsna.m56
    public final void T6(AlbumAttachment albumAttachment) {
        AlbumAttachment albumAttachment2 = albumAttachment;
        u1c0 J0 = J0();
        ol60 ol60Var = J0 != null ? J0.h : null;
        s6d0 s6d0Var = ol60Var instanceof s6d0 ? (s6d0) ol60Var : null;
        TextView textView = this.G;
        TextView textView2 = this.E;
        FixedSizeFrescoImageViewLegacy fixedSizeFrescoImageViewLegacy = this.D;
        if (s6d0Var != null) {
            textView2.setText(s6d0Var.k);
            int i = s6d0Var.l;
            textView.setText(i > 0 ? s6(R.plurals.photo_album_quantity, i, Integer.valueOf(i)) : v6(R.string.photo_album_empty));
            fixedSizeFrescoImageViewLegacy.setWrapContent(false);
            fixedSizeFrescoImageViewLegacy.r(s6d0Var.m, s6d0Var.n);
            fixedSizeFrescoImageViewLegacy.setIgnoreTrafficSaverPredicate(new i2u(0, new gad0(this, had0.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0, 3));
            fixedSizeFrescoImageViewLegacy.setLocalImage((fxj0) null);
            fixedSizeFrescoImageViewLegacy.setRemoteImage((List<? extends fxj0>) s6d0Var.o);
            fixedSizeFrescoImageViewLegacy.setPostprocessor(s6d0Var.q ? edg0.b : null);
            X6(s6d0Var, false);
            return;
        }
        String str = albumAttachment2.m;
        Photo photo = albumAttachment2.l;
        textView2.setText(str);
        int i2 = albumAttachment2.y;
        textView.setText(i2 > 0 ? s6(R.plurals.photo_album_quantity, i2, Integer.valueOf(i2)) : v6(R.string.photo_album_empty));
        int a = qi6.a.a(this.itemView.getContext());
        ArrayList arrayList = photo.y.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (ImageSize.j.contains(Character.valueOf(((ImageSize) next).b))) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = photo.y.b;
        }
        ArrayList arrayList3 = arrayList2;
        ImageSize y = nr2.y(a, arrayList3);
        fixedSizeFrescoImageViewLegacy.setWrapContent(false);
        if (y != null) {
            Image image = y.d;
            fixedSizeFrescoImageViewLegacy.r(image.b, image.c);
        } else {
            fixedSizeFrescoImageViewLegacy.r(135, 100);
        }
        fixedSizeFrescoImageViewLegacy.setIgnoreTrafficSaverPredicate(new d94(0, new fad0(this, had0.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0, 5));
        fixedSizeFrescoImageViewLegacy.setLocalImage((fxj0) null);
        if (!photo.Ib() || photo.Hb()) {
            fixedSizeFrescoImageViewLegacy.setRemoteImage((List<? extends fxj0>) arrayList3);
        } else {
            fixedSizeFrescoImageViewLegacy.setRemoteImage((fxj0) null);
        }
        fixedSizeFrescoImageViewLegacy.setPostprocessor(photo.Hb() ? edg0.b : null);
        Y6(false);
    }

    public final void X6(s6d0 s6d0Var, boolean z) {
        boolean z2 = s6d0Var.p;
        boolean z3 = s6d0Var.r;
        ColorStateList colorStateList = this.J;
        ColorStateList colorStateList2 = this.K;
        ColorStateList colorStateList3 = (z || z3) ? colorStateList : colorStateList2;
        this.F.setImageTintList(colorStateList3);
        this.G.setTextColor(colorStateList3);
        this.E.setTextColor(colorStateList3);
        this.D.getHierarchy().r((z || z3) ? this.L : null, 0);
        RestrictedPhotoView restrictedPhotoView = this.H;
        if (z2) {
            if (!z) {
                colorStateList = colorStateList2;
            }
            if (s6d0Var.q) {
                colorStateList2 = colorStateList;
            }
            restrictedPhotoView.d(o6(s6d0Var.t), colorStateList2, RestrictedPhotoView.u);
            restrictedPhotoView.setText(s6d0Var.s);
            restrictedPhotoView.setTextColor(colorStateList);
        }
        restrictedPhotoView.setVisibility(z2 ? 0 : 8);
    }

    public final void Y6(boolean z) {
        Photo photo;
        AlbumAttachment albumAttachment = (AlbumAttachment) this.C;
        c5j0 c5j0Var = null;
        PhotoRestriction photoRestriction = (albumAttachment == null || (photo = albumAttachment.l) == null) ? null : photo.L;
        ColorStateList colorStateList = this.K;
        ColorStateList colorStateList2 = this.J;
        ColorStateList colorStateList3 = (!z && (photoRestriction == null || photoRestriction.d)) ? colorStateList : colorStateList2;
        this.F.setImageTintList(colorStateList3);
        this.G.setTextColor(colorStateList3);
        this.E.setTextColor(colorStateList3);
        c5j0 c5j0Var2 = this.L;
        if (z || (photoRestriction != null && !photoRestriction.d)) {
            c5j0Var = c5j0Var2;
        }
        this.D.getHierarchy().r(c5j0Var, 0);
        RestrictedPhotoView restrictedPhotoView = this.H;
        if (photoRestriction != null) {
            if (!z) {
                colorStateList2 = colorStateList;
            }
            boolean z2 = photoRestriction.d;
            int i = z2 ? R.drawable.vk_icon_hide_outline_56 : R.drawable.vk_icon_do_not_disturb_outline_56;
            if (z2) {
                colorStateList = colorStateList2;
            }
            restrictedPhotoView.d(o6(i), colorStateList, RestrictedPhotoView.u);
            restrictedPhotoView.setText(photoRestriction.b);
            restrictedPhotoView.setTextColor(colorStateList2);
        }
        restrictedPhotoView.setVisibility(photoRestriction == null ? 8 : 0);
    }
}
