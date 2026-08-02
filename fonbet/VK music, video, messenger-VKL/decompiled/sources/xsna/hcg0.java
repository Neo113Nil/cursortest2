package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ImageViewer;
import com.vk.core.utils.ImageViewMeasurer;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.photo.Photo;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedBlurredPhotoView;
import com.vk.feed.design.view.newsfeed.restriction.RestrictedPhotoView;
import com.vk.feed.tool.view.newsfeed.photo.BlurredImageWrapper;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import com.vkontakte.android.data.PostInteract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.qi6;

/* compiled from: RestrictedBlurredPhotoHolder.kt */
/* loaded from: classes4.dex */
public final class hcg0 extends ufw<PhotoAttachment> implements View.OnClickListener {
    public static final /* synthetic */ int K = 0;
    public final kdg0 E;
    public final BlurredImageWrapper F;
    public final RestrictedBlurredPhotoView G;
    public final View H;
    public ImageViewer.c<AttachmentWithMedia> I;
    public final bpn0 J;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hcg0(ViewGroup viewGroup, kdg0 kdg0Var, h170 h170Var) {
        super(r0);
        Context context = viewGroup.getContext();
        BlurredImageWrapper blurredImageWrapper = new BlurredImageWrapper(context, null, 6);
        blurredImageWrapper.setId(R.id.container);
        RestrictedBlurredPhotoView restrictedBlurredPhotoView = new RestrictedBlurredPhotoView(context, null, 6);
        restrictedBlurredPhotoView.setId(R.id.pds_photo_attach);
        restrictedBlurredPhotoView.c(R.drawable.vk_icon_hide_outline_56, -1, RestrictedPhotoView.u);
        restrictedBlurredPhotoView.setTextMaxLines(2);
        restrictedBlurredPhotoView.setTextColor(-1);
        int b = cn70.b(32);
        restrictedBlurredPhotoView.setPadding(b, b, b, b);
        restrictedBlurredPhotoView.setTextTopMargin(cn70.b(8));
        restrictedBlurredPhotoView.setButtonTopMargin(cn70.b(20));
        blurredImageWrapper.addView(restrictedBlurredPhotoView, new ViewGroup.LayoutParams(-2, -2));
        f4m.y(e3m.a(R.dimen.newsfeed_single_photo_top_space, context), blurredImageWrapper);
        View view = new View(context);
        view.setId(R.id.pds_photo_indicator);
        view.setBackgroundResource(R.drawable.ic_market_12_white_with_bg);
        view.setImportantForAccessibility(2);
        view.setVisibility(8);
        RestrictedPhotoView.a aVar = new RestrictedPhotoView.a(cn70.b(20), cn70.b(20), 8388693);
        int b2 = cn70.b(8);
        ((ViewGroup.MarginLayoutParams) aVar).leftMargin = b2;
        ((ViewGroup.MarginLayoutParams) aVar).topMargin = b2;
        ((ViewGroup.MarginLayoutParams) aVar).rightMargin = b2;
        ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = b2;
        s3q0 s3q0Var = s3q0.a;
        restrictedBlurredPhotoView.a(view, aVar);
        this.E = kdg0Var;
        BlurredImageWrapper blurredImageWrapper2 = (BlurredImageWrapper) this.itemView.findViewById(R.id.container);
        this.F = blurredImageWrapper2;
        RestrictedBlurredPhotoView restrictedBlurredPhotoView2 = (RestrictedBlurredPhotoView) this.itemView.findViewById(R.id.pds_photo_attach);
        this.G = restrictedBlurredPhotoView2;
        this.H = this.itemView.findViewById(R.id.pds_photo_indicator);
        this.J = new bpn0(new io60(this, 22));
        restrictedBlurredPhotoView2.setUseThumbHash(h170Var.i() && h170Var.h());
        restrictedBlurredPhotoView2.setOnClickListener(this);
        restrictedBlurredPhotoView2.setButtonClickListener(new uzb(this, 9));
        blurredImageWrapper2.setOnClickListener(this);
        abg0 abg0Var = dhr0.t;
        blurredImageWrapper2.b(abg0Var.c(R.attr.vk_ui_background_content));
        blurredImageWrapper2.setBlurPostprocessor(edg0.a);
        blurredImageWrapper2.setBlurPlaceholderColor(abg0Var.c(R.attr.vk_ui_background_secondary));
        awt0.x(blurredImageWrapper2, 0, 0, 0, 0, 10);
        blurredImageWrapper2.setCornersPainter(new xso0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.a() * 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, krv0.l(R.attr.vk_ui_background_content), 0, 24));
        restrictedBlurredPhotoView2.setHeightMode(ImageViewMeasurer.HeightMode.MIN_RATIO);
    }

    @Override // xsna.m56
    public final void T6(Attachment attachment) {
        RestrictionButton restrictionButton;
        PhotoAttachment photoAttachment = (PhotoAttachment) attachment;
        u1c0 J0 = J0();
        ol60 ol60Var = J0 != null ? J0.h : null;
        jcg0 jcg0Var = ol60Var instanceof jcg0 ? (jcg0) ol60Var : null;
        BlurredImageWrapper blurredImageWrapper = this.F;
        RestrictedBlurredPhotoView restrictedBlurredPhotoView = this.G;
        View view = this.H;
        if (jcg0Var != null) {
            int i = dek0.a;
            dek0.b(restrictedBlurredPhotoView, null, null, 14);
            restrictedBlurredPhotoView.setWrapContent(photoAttachment.b);
            restrictedBlurredPhotoView.g(jcg0Var.k, jcg0Var.l);
            if (jcg0Var.n) {
                if (!restrictedBlurredPhotoView.p) {
                    restrictedBlurredPhotoView.p = true;
                    restrictedBlurredPhotoView.requestLayout();
                    restrictedBlurredPhotoView.invalidate();
                }
                restrictedBlurredPhotoView.i();
                restrictedBlurredPhotoView.setText(jcg0Var.o);
                restrictedBlurredPhotoView.setButtonText(jcg0Var.p);
            } else {
                restrictedBlurredPhotoView.j();
            }
            restrictedBlurredPhotoView.h(jcg0Var.q, jcg0Var.j.l.P);
            bwt0.p0(view, jcg0Var.r);
            f4m.q(jcg0Var.t, view);
            f4m.r(jcg0Var.s, view);
            blurredImageWrapper.a(jcg0Var.m);
            return;
        }
        int a2 = qi6.a.a(this.itemView.getContext());
        Photo photo = photoAttachment.l;
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
        int i2 = dek0.a;
        dek0.b(restrictedBlurredPhotoView, null, null, 14);
        ImageSize y = nr2.y(a2, arrayList2);
        restrictedBlurredPhotoView.setWrapContent(photoAttachment.b);
        if (y != null) {
            Image image = y.d;
            restrictedBlurredPhotoView.g(image.b, image.c);
        } else {
            restrictedBlurredPhotoView.g(135, 100);
        }
        boolean Hb = photo.Hb();
        String str = photo.P;
        if (Hb) {
            if (!restrictedBlurredPhotoView.p) {
                restrictedBlurredPhotoView.p = true;
                restrictedBlurredPhotoView.requestLayout();
                restrictedBlurredPhotoView.invalidate();
            }
            restrictedBlurredPhotoView.i();
            PhotoRestriction photoRestriction = photo.L;
            restrictedBlurredPhotoView.setText(photoRestriction != null ? photoRestriction.b : null);
            PhotoRestriction photoRestriction2 = photo.L;
            if (photoRestriction2 != null && (restrictionButton = photoRestriction2.e) != null) {
                r1 = restrictionButton.c;
            }
            restrictedBlurredPhotoView.setButtonText(r1);
            restrictedBlurredPhotoView.h(photoAttachment.Ib(), str);
            bwt0.p0(view, false);
        } else {
            restrictedBlurredPhotoView.j();
            restrictedBlurredPhotoView.h(y != null ? y.d.d : null, str);
            bwt0.p0(view, photo.r);
        }
        if (jcg0Var != null) {
            f4m.q(jcg0Var.t, view);
            f4m.r(jcg0Var.s, view);
        } else {
            f4m.q(cn70.b(8), view);
            f4m.r(cn70.b(8), view);
        }
        blurredImageWrapper.a(photoAttachment.Ib());
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        PhotoAttachment photoAttachment;
        List<EntryAttachment> N7;
        if (jjc.b() || this.I != null || (photoAttachment = (PhotoAttachment) this.C) == null) {
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
            bpn0 bpn0Var = this.J;
            ((a) bpn0Var.getValue()).a = i;
            this.I = ImageViewer.f(myc0.d(), i, arrayList, h, (a) bpn0Var.getValue(), null, null, MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint.NEWS_ITEM, false, null, false, 4016);
        }
    }

    /* compiled from: RestrictedBlurredPhotoHolder.kt */
    public final class a implements ImageViewer.a {
        public int a = -1;

        public a() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            View c;
            int i2 = hcg0.K;
            hcg0 hcg0Var = hcg0.this;
            boolean t = fdi.t((PhotoAttachment) hcg0Var.C);
            anw anwVar = hcg0Var.D;
            if (anwVar != null && (c = anwVar.c(i)) != null) {
                return c;
            }
            if (this.a != i || t) {
                return null;
            }
            return hcg0Var.itemView.findViewById(R.id.restricted_blurred_photo);
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect d(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void e(int i) {
            int i2 = hcg0.K;
            anw anwVar = hcg0.this.D;
            if (anwVar != null) {
                anwVar.e(i);
            }
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Integer f() {
            int i = hcg0.K;
            anw anwVar = hcg0.this.D;
            if (anwVar != null) {
                return anwVar.f();
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect g() {
            int i = hcg0.K;
            hcg0 hcg0Var = hcg0.this;
            anw anwVar = hcg0Var.D;
            if (anwVar != null) {
                return anwVar.g();
            }
            Object parent = hcg0Var.itemView.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                return bwt0.F(view);
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
            int i3 = hcg0.K;
            anw anwVar = hcg0.this.D;
            if (anwVar != null) {
                return anwVar.a(i);
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void o() {
            int i = hcg0.K;
            hcg0 hcg0Var = hcg0.this;
            anw anwVar = hcg0Var.D;
            if (anwVar != null) {
                anwVar.h(hcg0Var.I);
            }
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
            hcg0.this.I = null;
            this.a = -1;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final float[] q(int i) {
            int i2 = hcg0.K;
            anw anwVar = hcg0.this.D;
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
