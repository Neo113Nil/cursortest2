package xsna;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.ImageViewer;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.core.util.measure.ScaleType;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.AttachmentWithMedia;
import com.vk.dto.common.Image;
import com.vk.dto.common.Image$ConvertToImage$Type;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFileOld;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.DocumentAttachment;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import one.video.transform.TransformController;
import xsna.fh5;

/* compiled from: GifHolder.kt */
/* loaded from: classes4.dex */
public final class pyt extends ufw<DocumentAttachment> implements blc0, View.OnClickListener, ent0, fh5.b {
    public static final /* synthetic */ int Q = 0;
    public final a E;
    public final fh5 F;
    public final VKEnhancedImageView G;
    public final DurationView H;
    public final View I;
    public final View J;
    public final com.vk.libvideo.autoplay.a K;
    public final RatioFrameLayout L;
    public DocumentAttachment M;
    public e6o N;
    public x64 O;
    public final nwf0 P;

    /* compiled from: GifHolder.kt */
    public static final class a implements sj0 {
        public int b;

        @Override // xsna.sj0
        public final int getAdapterPosition() {
            return this.b;
        }
    }

    /* compiled from: GifHolder.kt */
    public static final class b extends ImageViewer.b {
        public final /* synthetic */ int b;

        public b(int i) {
            this.b = i;
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final void a() {
            fh5 fh5Var;
            cnt0 cnt0Var;
            VideoMinifiedPlayerStateHolder.a.getClass();
            if (VideoMinifiedPlayerStateHolder.a() || (cnt0Var = (fh5Var = pyt.this.F).q) == null) {
                return;
            }
            cnt0Var.i(fh5Var);
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            View c;
            pyt pytVar = pyt.this;
            anw anwVar = pytVar.D;
            if (anwVar != null && (c = anwVar.c(i)) != null) {
                return c;
            }
            if (i == this.b) {
                return pytVar.G;
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final void e(int i) {
            anw anwVar = pyt.this.D;
            if (anwVar != null) {
                anwVar.e(i);
            }
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final Rect g() {
            pyt pytVar = pyt.this;
            anw anwVar = pytVar.D;
            if (anwVar != null) {
                return anwVar.g();
            }
            Object parent = pytVar.itemView.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                return bwt0.C(view);
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final String m(int i, int i2) {
            DocumentAttachment documentAttachment;
            String a;
            pyt pytVar = pyt.this;
            anw anwVar = pytVar.D;
            if (anwVar != null && (a = anwVar.a(i)) != null) {
                return a;
            }
            if (i != this.b || (documentAttachment = pytVar.M) == null) {
                return null;
            }
            return documentAttachment.f;
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
            fh5 fh5Var;
            cnt0 cnt0Var;
            VideoMinifiedPlayerStateHolder.a.getClass();
            if (VideoMinifiedPlayerStateHolder.a() || (cnt0Var = (fh5Var = pyt.this.F).q) == null) {
                return;
            }
            cnt0Var.i(fh5Var);
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final float[] q(int i) {
            anw anwVar = pyt.this.D;
            if (anwVar != null) {
                return anwVar.b();
            }
            return null;
        }
    }

    public pyt(ViewGroup viewGroup) {
        super(R.layout.gif_item, viewGroup);
        a aVar = new a();
        this.E = aVar;
        VideoTextureView videoTextureView = (VideoTextureView) this.itemView.findViewById(R.id.video_display);
        VKEnhancedImageView vKEnhancedImageView = (VKEnhancedImageView) this.itemView.findViewById(R.id.att_doc_thumb);
        this.G = vKEnhancedImageView;
        this.H = (DurationView) this.itemView.findViewById(R.id.duration);
        View findViewById = this.itemView.findViewById(R.id.play);
        this.I = findViewById;
        this.J = this.itemView.findViewById(R.id.error);
        this.K = new com.vk.libvideo.autoplay.a(false, RepeatMode.BY_VIDEO_PARAMS, null, false, false, false, null, null, null, null, null, null, false, null, 524285);
        RatioFrameLayout ratioFrameLayout = (RatioFrameLayout) this.itemView.findViewById(R.id.gif_container);
        this.L = ratioFrameLayout;
        this.P = new nwf0(ratioFrameLayout, new oyt(this, 0));
        TransformController.ScaleType scaleType = TransformController.ScaleType.CROP;
        SoftReference<Bitmap> softReference = VideoTextureView.r;
        videoTextureView.i(scaleType, false);
        abg0 abg0Var = dhr0.t;
        vKEnhancedImageView.setPlaceholder(new LayerDrawable(new Drawable[]{new ColorDrawable(abg0Var.c(R.attr.vk_ui_background_content)), new ColorDrawable(abg0Var.c(R.attr.vk_ui_image_placeholder))}));
        vKEnhancedImageView.setScaleType(ScaleType.CENTER_CROP);
        fh5 fh5Var = new fh5(aVar, videoTextureView, (ViewGroup) this.itemView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, vKEnhancedImageView, findViewById, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -4194392, 31);
        this.F = fh5Var;
        fh5Var.z0 = this;
        View.OnClickListener onClickListener = this.N;
        if (onClickListener == null) {
            bpn0 bpn0Var = jjc.a;
            onClickListener = new q01(this, 2);
        }
        this.itemView.setOnClickListener(onClickListener);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        this.P.a(z);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        bpn0 bpn0Var = jjc.a;
        e6o a2 = s6oVar.a(new q01(this, 2), s6oVar.e);
        this.N = a2;
        this.itemView.setOnClickListener(a2);
    }

    @Override // xsna.m56
    public final void T6(Attachment attachment) {
        List<? extends fxj0> singletonList;
        DocumentAttachment documentAttachment = (DocumentAttachment) attachment;
        if (documentAttachment.Fb() == Image$ConvertToImage$Type.gif) {
            this.M = documentAttachment;
            ImageSize imageSize = new ImageSize(documentAttachment.h, documentAttachment.l, documentAttachment.m, null, (char) 0, false, 56, null);
            VideoFileOld videoFileOld = documentAttachment.r;
            yg5 yg5Var = documentAttachment.t;
            com.vk.libvideo.autoplay.a aVar = this.K;
            fh5 fh5Var = this.F;
            fh5Var.k(videoFileOld, yg5Var, aVar);
            this.E.b = getAdapterPosition();
            qyt qytVar = new qyt(0, new ryt(this, pyt.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0, 0);
            VKEnhancedImageView vKEnhancedImageView = this.G;
            vKEnhancedImageView.setIgnoreTrafficSaverPredicate(qytVar);
            Image image = documentAttachment.s;
            if (image == null || (singletonList = image.b) == null) {
                singletonList = Collections.singletonList(imageSize);
            }
            vKEnhancedImageView.setRemoteImage(singletonList);
            vKEnhancedImageView.getAspectRatio();
            this.L.setRatio(documentAttachment.m / documentAttachment.l);
            yg5 yg5Var2 = fh5Var.j;
            if (yg5Var2 == null) {
                yg5Var2 = null;
            }
            boolean p0 = yg5Var2.p0();
            DurationView durationView = this.H;
            if (p0) {
                durationView.setText("GIF");
                return;
            }
            DocumentAttachment documentAttachment2 = this.M;
            if (documentAttachment2 != null) {
                durationView.setText("GIF, " + dun.s6(documentAttachment2.n, vKEnhancedImageView.getResources()));
            }
        }
    }

    @Override // xsna.fh5.b
    public final void U1(fh5.a aVar) {
        bwt0.p0(this.J, aVar.c());
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
        this.O = x64Var;
    }

    @Override // xsna.fh5.b
    public final void i5(fh5.a aVar, fh5.a aVar2) {
        if (aVar.c() != aVar2.c()) {
            bwt0.p0(this.J, aVar2.c());
        }
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity h = e3m.h(view.getContext());
        if (h == null) {
            return;
        }
        ArrayList<AttachmentWithMedia> arrayList = new ArrayList<>(10);
        int X6 = X6(arrayList);
        ImageViewer.f(myc0.d(), X6, arrayList, h, new b(X6), null, null, MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint.NEWS_ITEM, false, null, false, 4016);
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.F;
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
    }
}
