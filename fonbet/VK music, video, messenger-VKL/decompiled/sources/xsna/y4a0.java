package xsna;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.image.VkEnhancedImageView;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.photo.Photo;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedPhotoView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PhotoAlbumHolder.kt */
/* loaded from: classes4.dex */
public final class y4a0 extends de6<w4a0> implements blc0 {
    public final h170 k;
    public final afu l;
    public final VkEnhancedImageView m;
    public final RestrictedPhotoView n;
    public x64 o;
    public final nwf0 p;
    public final Object q;
    public final Object r;
    public final Object s;

    /* compiled from: PhotoAlbumHolder.kt */
    public static final class a {
        public static y4a0 a(ViewGroup viewGroup, boolean z, gzs gzsVar, h170 h170Var) {
            afu afuVar = new afu(viewGroup.getContext());
            afuVar.setId(R.id.container);
            VkEnhancedImageView vkEnhancedImageView = new VkEnhancedImageView(viewGroup.getContext(), null, 6, 0);
            vkEnhancedImageView.setId(R.id.enhanced_image);
            dek0.b(vkEnhancedImageView, null, null, 6);
            vkEnhancedImageView.setWithImageDownscale(z);
            vkEnhancedImageView.setIgnoreTrafficSaverPredicate(gzsVar);
            if (!z) {
                vkEnhancedImageView.setFadeDuration(0);
            }
            vkEnhancedImageView.setScaleType(ScaleType.CENTER_CROP);
            afuVar.addView(vkEnhancedImageView, new ViewGroup.LayoutParams(-1, -1));
            RestrictedPhotoView restrictedPhotoView = new RestrictedPhotoView(viewGroup.getContext(), null, 6, 0);
            restrictedPhotoView.setId(R.id.restriction_view);
            restrictedPhotoView.setVisibility(8);
            int b = cn70.b(8);
            restrictedPhotoView.setPadding(b, b, b, b);
            afuVar.addView(restrictedPhotoView, new ViewGroup.LayoutParams(-1, -2));
            return new y4a0(afuVar, h170Var);
        }
    }

    public y4a0(afu afuVar, h170 h170Var) {
        super(afuVar, 2);
        this.k = h170Var;
        afu afuVar2 = (afu) afuVar.findViewById(R.id.container);
        this.l = afuVar2;
        VkEnhancedImageView vkEnhancedImageView = (VkEnhancedImageView) afuVar.findViewById(R.id.enhanced_image);
        this.m = vkEnhancedImageView;
        this.n = (RestrictedPhotoView) afuVar.findViewById(R.id.restriction_view);
        this.p = new nwf0(afuVar, new naj(this, 6));
        zq3 zq3Var = new zq3(27);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.q = msy.a(lazyThreadSafetyMode, zq3Var);
        this.r = msy.a(lazyThreadSafetyMode, new f84(16));
        this.s = msy.a(lazyThreadSafetyMode, new e20(21));
        afuVar2.a(m33.a(R.drawable.vk_icon_album_filled_12, afuVar.getContext()), cn70.b(12));
        afuVar2.setLabelGap(cn70.b(6));
        afuVar2.setLabelCornerRadius(cn70.a() * 4.0f);
        afuVar2.setLabelTextSize(12.0f);
        ColorDrawable colorDrawable = new ColorDrawable(dhr0.t.c(R.attr.vk_ui_background_tertiary));
        vkEnhancedImageView.setPlaceholder(colorDrawable);
        vkEnhancedImageView.setEmptyPlaceholder(colorDrawable);
        afuVar.setOnClickListener(this);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        this.p.a(z);
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
        this.o = x64Var;
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.de6
    public final void b(Attachment attachment) {
        if (attachment instanceof AlbumAttachment) {
            Photo photo = ((AlbumAttachment) attachment).l;
            String f = uqm0.f(r11.y);
            afu afuVar = this.l;
            afuVar.setLabelText(f);
            VkEnhancedImageView vkEnhancedImageView = this.m;
            SparseArray<Drawable> sparseArray = null;
            vkEnhancedImageView.setLocalImage((fxj0) null);
            boolean Ib = photo.Ib();
            Image image = photo.y;
            if (!Ib || photo.Hb()) {
                vkEnhancedImageView.setRemoteImages(image.b);
                iso0 s = com.vk.toggle.d.s();
                String str = photo.P;
                h170 h170Var = this.k;
                String b = s.b(str, h170Var.h() && h170Var.i());
                if (b != null) {
                    vkEnhancedImageView.setThumbHash(b);
                }
            } else {
                vkEnhancedImageView.setRemoteImage(null);
            }
            PhotoRestriction photoRestriction = photo.L;
            RestrictedPhotoView restrictedPhotoView = this.n;
            if (photoRestriction != null) {
                restrictedPhotoView.setIcon(photoRestriction.d ? (SparseArray) this.r.getValue() : (SparseArray) this.q.getValue());
            }
            kci.o(vkEnhancedImageView, (photoRestriction == null || !photoRestriction.d) ? null : edg0.b);
            restrictedPhotoView.setVisibility(photoRestriction == null ? 8 : 0);
            if (!photo.Ib() && image.b.isEmpty()) {
                sparseArray = (SparseArray) this.s.getValue();
            }
            afuVar.setOverlayIcon(sparseArray);
        }
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.de6
    public final void c(w4a0 w4a0Var) {
        w4a0 w4a0Var2 = w4a0Var;
        boolean z = w4a0Var2.g;
        String str = w4a0Var2.h;
        afu afuVar = this.l;
        afuVar.setLabelText(str);
        boolean z2 = w4a0Var2.f;
        RestrictedPhotoView restrictedPhotoView = this.n;
        if (z2) {
            restrictedPhotoView.setIcon(z ? (SparseArray) this.r.getValue() : (SparseArray) this.q.getValue());
        }
        jwx jwxVar = z ? edg0.b : null;
        VkEnhancedImageView vkEnhancedImageView = this.m;
        kci.o(vkEnhancedImageView, jwxVar);
        vkEnhancedImageView.setLocalImage((fxj0) null);
        vkEnhancedImageView.setRemoteImages(w4a0Var2.i);
        iso0 s = com.vk.toggle.d.s();
        String str2 = w4a0Var2.e.l.P;
        h170 h170Var = this.k;
        String b = s.b(str2, h170Var.h() && h170Var.i());
        if (b != null) {
            vkEnhancedImageView.setThumbHash(b);
        }
        restrictedPhotoView.setVisibility(z2 ? 0 : 8);
        afuVar.setOverlayIcon(w4a0Var2.j ? (SparseArray) this.s.getValue() : null);
    }

    @Override // xsna.de6, android.view.View.OnClickListener
    public final void onClick(View view) {
        x64 x64Var = this.o;
        if (x64Var != null) {
            x64Var.a(this.d);
        } else {
            super.onClick(view);
        }
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
    }
}
