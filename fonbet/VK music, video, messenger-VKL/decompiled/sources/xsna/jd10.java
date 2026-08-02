package xsna;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.api.generated.market.dto.MarketProductLinkedContentItemDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.video.dto.VideoVideoTypeDto;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: MarketProductVideoMediaItemHolder.kt */
/* loaded from: classes18.dex */
public final class jd10 extends wa10 {
    public final ViewGroup h;
    public final w6e i;
    public final g7s0 j;
    public final VideoOverlayView k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public io.reactivex.rxjava3.disposables.c p;

    /* compiled from: MarketProductVideoMediaItemHolder.kt */
    public static final class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ MediaContentItem c;

        public a(MediaContentItem mediaContentItem) {
            this.c = mediaContentItem;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            jd10 jd10Var = jd10.this;
            jd10Var.b(this.c, new wik(jd10Var, 21));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            io.reactivex.rxjava3.disposables.c cVar = jd10.this.p;
            if (cVar != null) {
                cVar.dispose();
            }
        }
    }

    public jd10(ViewGroup viewGroup, int i, w6e w6eVar, kdg0 kdg0Var, g7s0 g7s0Var) {
        super(viewGroup, i, w6eVar, kdg0Var);
        this.h = viewGroup;
        this.i = w6eVar;
        this.j = g7s0Var;
        this.k = (VideoOverlayView) viewGroup.findViewById(R.id.video_item_overlay);
        ee4 ee4Var = new ee4(21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.l = msy.a(lazyThreadSafetyMode, ee4Var);
        this.m = msy.a(lazyThreadSafetyMode, new l63(21));
        this.n = msy.a(lazyThreadSafetyMode, new af0(25));
        this.o = msy.a(lazyThreadSafetyMode, new w9(19));
        viewGroup.setOnClickListener(new m4w(this, 1));
    }

    @Override // xsna.wa10
    public final void a(MediaContentItem mediaContentItem) {
        super.a(mediaContentItem);
        MarketProductLinkedContentItemDto marketProductLinkedContentItemDto = mediaContentItem.b;
        VideoVideoFullDto g = marketProductLinkedContentItemDto.g();
        if (g != null) {
            VideoFileOld d = ums0.d(ums0.a, g, null, null, null, 30);
            int max = Math.max(480, this.h.getMeasuredWidth());
            ImageSize Cb = d.I0.Cb(max, true, true);
            if (Cb == null) {
                Cb = d.J0.Cb(max, true, true);
            }
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            VkImage vkImage = this.e;
            vkImage.setScaleType(scaleType);
            vkImage.o0(Cb != null ? Cb.d.d : null, null);
            boolean c = this.j.c(d);
            VideoOverlayView videoOverlayView = this.k;
            if (!c || mediaContentItem.c) {
                f4m.j(videoOverlayView);
                vkImage.setVisibility(0);
            } else {
                b(mediaContentItem, new rmg(this, 23));
                videoOverlayView.addOnAttachStateChangeListener(new a(mediaContentItem));
            }
            Resources resources = this.a.getContext().getResources();
            VideoVideoFullDto g2 = marketProductLinkedContentItemDto.g();
            vkImage.setContentDescription(resources.getString((g2 != null ? g2.R2() : null) == VideoVideoTypeDto.SHORT_VIDEO ? R.string.accessibility_media_content_clip : R.string.accessibility_media_content_video));
        }
    }

    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(MediaContentItem mediaContentItem, izs<? super io.reactivex.rxjava3.disposables.c, s3q0> izsVar) {
        VideoFile A;
        VideoVideoFullDto g = mediaContentItem.b.g();
        if (g != null) {
            VideoFileOld d = ums0.d(ums0.a, g, null, null, null, 30);
            bpn0 bpn0Var = VideoOverlayView.I;
            boolean c = this.j.c(d);
            VideoRestriction videoRestriction = d.O0;
            String str = null;
            com.vk.libvideo.design.view.overlay.b a2 = videoRestriction != null ? ((a390) this.n.getValue()).a(videoRestriction) : null;
            boolean z = d.d8() || d.z0();
            VideoPipStateHolder.a.getClass();
            yg5 c2 = VideoPipStateHolder.c();
            if (c2 != null && (A = c2.A()) != null) {
                str = A.a1();
            }
            VideoOverlayView.b.a(new VideoOverlayView.a(this.e, this.k, new xg2(8, this, mediaContentItem), new v77(izsVar, 4), null, false, false, c, new com.vk.movika.sdk.base.ui.s(12, this, d), new ie3(16, this, d), a2, z, epx.f(str, d.a1()), new qbj(this, 27), (i1t0) this.o.getValue(), null, 65776));
            if (mediaContentItem.c) {
                f4m.j(this.k);
                this.e.setVisibility(0);
            }
        }
    }
}
