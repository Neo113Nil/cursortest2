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
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Image$ConvertToImage$Type;
import com.vk.dto.common.VideoFile;
import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import com.vkontakte.android.attachments.DocumentAttachment;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import one.video.transform.TransformController;
import xsna.fh5;

/* compiled from: AnimationHolder.kt */
/* loaded from: classes4.dex */
public final class pp2 extends rp6<qp2, NewsEntry> implements bnw, blc0, View.OnClickListener, ent0, fh5.b, i7o {
    public static final /* synthetic */ int S = 0;
    public DocumentAttachment E;
    public anw F;
    public final mp2 G;
    public final fh5 H;
    public final FrescoImageView I;
    public final DurationView J;
    public final View K;
    public final View L;
    public final com.vk.libvideo.autoplay.a M;
    public final RatioFrameLayout N;
    public DocumentAttachment O;
    public e6o P;
    public x64 Q;
    public final nwf0 R;

    /* compiled from: AnimationHolder.kt */
    public static final class a extends ImageViewer.b {
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final void a() {
            fh5 fh5Var = pp2.this.H;
            VideoMinifiedPlayerStateHolder.a.getClass();
            if (VideoMinifiedPlayerStateHolder.a()) {
                return;
            }
            cnt0 cnt0Var = fh5Var.q;
            if (cnt0Var != null) {
                cnt0Var.i(fh5Var);
            }
            yg5 yg5Var = fh5Var.j;
            if (yg5Var == null) {
                yg5Var = null;
            }
            yg5Var.G0(yg5Var.V());
            yg5Var.pause();
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final View c(int i) {
            View c;
            pp2 pp2Var = pp2.this;
            anw anwVar = pp2Var.F;
            if (anwVar != null && (c = anwVar.c(i)) != null) {
                return c;
            }
            if (i == this.b) {
                return pp2Var.I;
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final void e(int i) {
            anw anwVar = pp2.this.F;
            if (anwVar != null) {
                anwVar.e(i);
            }
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final Rect g() {
            pp2 pp2Var = pp2.this;
            anw anwVar = pp2Var.F;
            if (anwVar != null) {
                return anwVar.g();
            }
            Object parent = pp2Var.itemView.getParent();
            View view = parent instanceof View ? (View) parent : null;
            if (view != null) {
                return bwt0.C(view);
            }
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final String m(int i, int i2) {
            String a;
            int i3 = this.b;
            String str = null;
            pp2 pp2Var = pp2.this;
            if (i == i3) {
                qp2 qp2Var = (qp2) pp2Var.C;
                if (qp2Var != null) {
                    str = qp2Var.p;
                } else {
                    DocumentAttachment documentAttachment = pp2Var.O;
                    str = (documentAttachment != null ? documentAttachment : null).f;
                }
            }
            anw anwVar = pp2Var.F;
            return (anwVar == null || (a = anwVar.a(i)) == null) ? str : a;
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
            fh5 fh5Var = pp2.this.H;
            VideoMinifiedPlayerStateHolder.a.getClass();
            if (VideoMinifiedPlayerStateHolder.a()) {
                return;
            }
            cnt0 cnt0Var = fh5Var.q;
            if (cnt0Var != null) {
                cnt0Var.i(fh5Var);
            }
            fh5Var.m0();
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final float[] q(int i) {
            anw anwVar = pp2.this.F;
            if (anwVar != null) {
                return anwVar.b();
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp2(ViewGroup viewGroup) {
        super(R.layout.attach_animation, viewGroup);
        viewGroup.getContext();
        this.D = t980.a;
        mp2 mp2Var = new mp2();
        this.G = mp2Var;
        VideoTextureView videoTextureView = (VideoTextureView) this.itemView.findViewById(R.id.video_display);
        FrescoImageView frescoImageView = (FrescoImageView) this.itemView.findViewById(R.id.att_doc_thumb);
        this.I = frescoImageView;
        View findViewById = this.itemView.findViewById(R.id.play);
        this.K = findViewById;
        this.L = this.itemView.findViewById(R.id.error);
        this.M = new com.vk.libvideo.autoplay.a(false, RepeatMode.BY_VIDEO_PARAMS, null, false, false, false, null, null, null, null, null, null, false, null, 524285);
        RatioFrameLayout ratioFrameLayout = (RatioFrameLayout) this.itemView.findViewById(R.id.container);
        this.N = ratioFrameLayout;
        this.R = new nwf0(ratioFrameLayout, new v01(this, 1));
        getContext();
        this.J = (DurationView) this.itemView.findViewById(R.id.duration);
        TransformController.ScaleType scaleType = TransformController.ScaleType.CROP;
        SoftReference<Bitmap> softReference = VideoTextureView.r;
        videoTextureView.i(scaleType, false);
        abg0 abg0Var = dhr0.t;
        frescoImageView.setPlaceholder(new LayerDrawable(new Drawable[]{new ColorDrawable(abg0Var.c(R.attr.vk_ui_background_content)), new ColorDrawable(abg0Var.c(R.attr.vk_ui_image_placeholder))}));
        fh5 fh5Var = new fh5(mp2Var, videoTextureView, (ViewGroup) this.itemView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, frescoImageView, findViewById, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -4194392, 31);
        this.H = fh5Var;
        fh5Var.z0 = this;
        View.OnClickListener onClickListener = this.P;
        if (onClickListener == null) {
            bpn0 bpn0Var = jjc.a;
            onClickListener = new q01(this, 2);
        }
        this.itemView.setOnClickListener(onClickListener);
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        this.R.a(z);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        bpn0 bpn0Var = jjc.a;
        e6o a2 = s6oVar.a(new q01(this, 2), s6oVar.e);
        this.P = a2;
        this.itemView.setOnClickListener(a2);
    }

    @Override // xsna.rp6
    public final void R6(qp2 qp2Var) {
        String str;
        qp2 qp2Var2 = qp2Var;
        if (qp2Var2.q == Image$ConvertToImage$Type.gif) {
            this.O = qp2Var2.i;
            VideoFile videoFile = qp2Var2.j;
            yg5 yg5Var = qp2Var2.k;
            com.vk.libvideo.autoplay.a aVar = this.M;
            fh5 fh5Var = this.H;
            fh5Var.k(videoFile, yg5Var, aVar);
            this.G.b = getAdapterPosition();
            np2 np2Var = new np2(0, new op2(this, pp2.class, "isAdvertisement", "isAdvertisement()Z", 0), mcy.class, "get", "get()Ljava/lang/Object;", 0);
            FrescoImageView frescoImageView = this.I;
            frescoImageView.setIgnoreTrafficSaverPredicate(np2Var);
            frescoImageView.setRemoteImage(qp2Var2.s);
            this.N.setRatio(qp2Var2.r);
            DurationView durationView = this.J;
            if (durationView != null) {
                yg5 yg5Var2 = fh5Var.j;
                if (yg5Var2 == null) {
                    yg5Var2 = null;
                }
                if (yg5Var2.p0()) {
                    str = "GIF";
                } else {
                    str = "GIF, " + dun.s6(qp2Var2.t, frescoImageView.getResources());
                }
                durationView.setText(str);
            }
        }
    }

    @Override // xsna.fh5.b
    public final void U1(fh5.a aVar) {
        bwt0.p0(this.L, aVar.c());
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
        this.Q = x64Var;
    }

    @Override // xsna.rp6, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        if (u1c0Var instanceof r74) {
            Attachment attachment = ((r74) u1c0Var).q;
            this.E = attachment instanceof DocumentAttachment ? (DocumentAttachment) attachment : null;
        }
        super.a6(u1c0Var);
        mnh0.v(this.itemView, t6());
    }

    @Override // xsna.bnw
    public final void b5(anw anwVar) {
        this.F = anwVar;
    }

    @Override // xsna.fh5.b
    public final void i5(fh5.a aVar, fh5.a aVar2) {
        if (aVar.c() != aVar2.c()) {
            bwt0.p0(this.L, aVar2.c());
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        Activity h = e3m.h(view.getContext());
        if (h == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(10);
        DocumentAttachment documentAttachment = this.E;
        if (documentAttachment != null) {
            qp2 qp2Var = (qp2) this.C;
            Object q6 = qp2Var != null ? qp2Var.h : q6();
            fsx0 fsx0Var = q6 instanceof fsx0 ? (fsx0) q6 : null;
            List<EntryAttachment> N7 = fsx0Var != null ? fsx0Var.N7() : null;
            List<EntryAttachment> list = N7;
            if (list == null || list.isEmpty()) {
                arrayList.add(documentAttachment);
            } else {
                int size = N7.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    Attachment attachment = N7.get(i3).b;
                    if (documentAttachment == attachment) {
                        i2 = arrayList.size();
                    }
                    if ((attachment instanceof PhotoAttachment) && !(attachment instanceof AlbumAttachment)) {
                        arrayList.add(attachment);
                    } else if ((attachment instanceof DocumentAttachment) && ((DocumentAttachment) attachment).Ib()) {
                        arrayList.add(attachment);
                    }
                }
                if (!arrayList.isEmpty()) {
                    i = i2;
                    ImageViewer.f(myc0.d(), i, arrayList, h, new a(i), null, null, MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint.NEWS_ITEM, false, null, false, 4016);
                }
                arrayList.add(documentAttachment);
            }
        }
        i = 0;
        ImageViewer.f(myc0.d(), i, arrayList, h, new a(i), null, null, MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint.NEWS_ITEM, false, null, false, 4016);
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.H;
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
    }
}
