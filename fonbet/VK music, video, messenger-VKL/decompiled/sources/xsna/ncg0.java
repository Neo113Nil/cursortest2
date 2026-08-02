package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ImageViewer;
import com.vk.core.utils.ImageViewMeasurer;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedPhotoView;
import com.vk.feed.tool.view.newsfeed.photo.BlurredImageWrapper;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.qi6;

/* compiled from: RestrictedPhotoHolder.kt */
/* loaded from: classes4.dex */
public final class ncg0 extends ufw<PhotoAttachment> implements View.OnClickListener, w8i {
    public static final /* synthetic */ int I = 0;
    public final RestrictedPhotoView E;
    public ImageViewer.c<AttachmentWithMedia> F;
    public final bpn0 G;
    public final Object H;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ncg0(ViewGroup viewGroup) {
        super(r0);
        Context context = viewGroup.getContext();
        BlurredImageWrapper blurredImageWrapper = new BlurredImageWrapper(context, null, 6);
        blurredImageWrapper.setId(R.id.container);
        RestrictedPhotoView restrictedPhotoView = new RestrictedPhotoView(context, null, 6, 0);
        restrictedPhotoView.setId(R.id.attach);
        restrictedPhotoView.c(R.drawable.vk_icon_do_not_disturb_outline_56, e3m.f(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_primary, context), RestrictedPhotoView.u);
        restrictedPhotoView.setTextMaxLines(3);
        restrictedPhotoView.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, context));
        restrictedPhotoView.setBackgroundColor(e3m.f(R.attr.vk_ui_image_placeholder, context));
        int b = cn70.b(32);
        restrictedPhotoView.setPadding(b, b, b, b);
        restrictedPhotoView.setTextTopMargin(cn70.b(8));
        blurredImageWrapper.addView(restrictedPhotoView, new FrameLayout.LayoutParams(-2, -2));
        f4m.y(e3m.a(R.dimen.newsfeed_single_photo_top_space, context), blurredImageWrapper);
        BlurredImageWrapper blurredImageWrapper2 = (BlurredImageWrapper) this.itemView.findViewById(R.id.container);
        RestrictedPhotoView restrictedPhotoView2 = (RestrictedPhotoView) this.itemView.findViewById(R.id.attach);
        this.E = restrictedPhotoView2;
        this.G = new bpn0(new q010(this, 27));
        this.H = msy.a(LazyThreadSafetyMode.NONE, new g880(this, 17));
        restrictedPhotoView2.setOnClickListener(this);
        blurredImageWrapper2.setOnClickListener(this);
        abg0 abg0Var = dhr0.t;
        blurredImageWrapper2.b(abg0Var.c(R.attr.vk_ui_background_content));
        blurredImageWrapper2.setBlurPlaceholderColor(abg0Var.c(R.attr.vk_ui_background_secondary));
        awt0.x(blurredImageWrapper2, 0, 0, 0, 0, 10);
        blurredImageWrapper2.setCornersPainter(new xso0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.a() * 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, krv0.l(R.attr.vk_ui_background_content), 0, 24));
        restrictedPhotoView2.setHeightMode(ImageViewMeasurer.HeightMode.MIN_RATIO);
    }

    public static List Y6(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (ImageSize.j.contains(Character.valueOf(((ImageSize) obj).b))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2.isEmpty() ? arrayList : arrayList2;
    }

    @Override // xsna.m56
    public final void T6(Attachment attachment) {
        PhotoAttachment photoAttachment = (PhotoAttachment) attachment;
        u1c0 J0 = J0();
        ol60 ol60Var = J0 != null ? J0.h : null;
        int a2 = qi6.a.a(this.itemView.getContext());
        if (!(ol60Var instanceof ocg0)) {
            b7(photoAttachment, nr2.y(a2, Y6(photoAttachment.l.y.b)));
        } else {
            ocg0 ocg0Var = (ocg0) ol60Var;
            b7(ocg0Var.j, nr2.y(a2, Y6(ocg0Var.l.b)));
        }
    }

    public final void b7(PhotoAttachment photoAttachment, ImageSize imageSize) {
        boolean z = photoAttachment.b;
        RestrictedPhotoView restrictedPhotoView = this.E;
        restrictedPhotoView.setWrapContent(z);
        if (imageSize != null) {
            Image image = imageSize.d;
            restrictedPhotoView.g(image.b, image.c);
        } else {
            restrictedPhotoView.g(135, 100);
        }
        PhotoRestriction photoRestriction = photoAttachment.l.L;
        restrictedPhotoView.setText(photoRestriction != null ? photoRestriction.b : null);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        PhotoAttachment photoAttachment;
        List<EntryAttachment> N7;
        if (jjc.b() || this.F != null || (photoAttachment = (PhotoAttachment) this.C) == null) {
            return;
        }
        Parcelable q6 = q6();
        fsx0 fsx0Var = q6 instanceof fsx0 ? (fsx0) q6 : null;
        if (fsx0Var == null || (N7 = fsx0Var.N7()) == null) {
            return;
        }
        PostInteract postInteract = this.w;
        if (postInteract != null) {
            postInteract.zb(PostInteract.Type.open_photo);
        }
        int size = N7.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Attachment attachment = N7.get(i2).b;
            if (photoAttachment == attachment) {
                i = arrayList.size();
            }
            if ((attachment instanceof PhotoAttachment) && !(attachment instanceof AlbumAttachment)) {
                arrayList.add(attachment);
            } else if ((attachment instanceof DocumentAttachment) && ((DocumentAttachment) attachment).Ib()) {
                arrayList.add(attachment);
            }
        }
        Activity h = e3m.h(this.itemView.getContext());
        if (h != null) {
            bpn0 bpn0Var = this.G;
            ((a) bpn0Var.getValue()).a = i;
            this.F = ImageViewer.f((ImageViewer) this.H.getValue(), i, arrayList, h, (a) bpn0Var.getValue(), null, null, MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint.NEWS_ITEM, false, null, false, 4016);
        }
    }

    /* compiled from: RestrictedPhotoHolder.kt */
    public final class a implements ImageViewer.a {
        public int a = -1;

        public a() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            View c;
            int i2 = ncg0.I;
            ncg0 ncg0Var = ncg0.this;
            anw anwVar = ncg0Var.D;
            if (anwVar != null && (c = anwVar.c(i)) != null) {
                return c;
            }
            if (this.a == i) {
                return ncg0Var.itemView;
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect d(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void e(int i) {
            int i2 = ncg0.I;
            anw anwVar = ncg0.this.D;
            if (anwVar != null) {
                anwVar.e(i);
            }
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Integer f() {
            int i = ncg0.I;
            anw anwVar = ncg0.this.D;
            if (anwVar != null) {
                return anwVar.f();
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect g() {
            int i = ncg0.I;
            ncg0 ncg0Var = ncg0.this;
            anw anwVar = ncg0Var.D;
            if (anwVar != null) {
                return anwVar.g();
            }
            View view = ncg0Var.itemView;
            Object parent = view != null ? view.getParent() : null;
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                return bwt0.F(view2);
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean h() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String i() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Context j() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String m(int i, int i2) {
            int i3 = ncg0.I;
            anw anwVar = ncg0.this.D;
            if (anwVar != null) {
                return anwVar.a(i);
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void o() {
            int i = ncg0.I;
            ncg0 ncg0Var = ncg0.this;
            anw anwVar = ncg0Var.D;
            if (anwVar != null) {
                anwVar.h(ncg0Var.F);
            }
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
            ncg0.this.F = null;
            this.a = -1;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final float[] q(int i) {
            int i2 = ncg0.I;
            anw anwVar = ncg0.this.D;
            if (anwVar != null) {
                return anwVar.b();
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final ImageViewer.d r() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean s() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void a() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void p() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void b(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void n(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void t(Photo photo) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void v(AttachForMediaViewer attachForMediaViewer, ImageViewer.SwipeDirection swipeDirection, boolean z) {
        }
    }
}
