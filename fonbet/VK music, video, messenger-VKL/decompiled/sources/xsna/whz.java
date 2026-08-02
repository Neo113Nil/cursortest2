package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.common.VideoFile;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.movika.api.InteractiveData;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.e3m;
import xsna.ocx;

/* compiled from: LiteInteractiveVideoView.kt */
/* loaded from: classes3.dex */
public final class whz extends ef6 {
    public static final /* synthetic */ int N = 0;
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;
    public final Object K;
    public final Object L;
    public final vhz M;
    public final Context w;
    public final boolean x;
    public final boolean y;
    public final com.vk.libvideo.autoplay.a z;

    /* compiled from: LiteInteractiveVideoView.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<View, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(View view) {
            whz whzVar = (whz) this.receiver;
            int i = whz.N;
            whzVar.getClass();
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            com.vk.libvideo.autoplay.e.f(!com.vk.libvideo.autoplay.e.c());
            return s3q0.a;
        }
    }

    public whz(Context context, boolean z, boolean z2) {
        super(true);
        this.w = context;
        this.x = z;
        this.y = z2;
        this.z = com.vk.libvideo.autoplay.a.t;
        tbg tbgVar = new tbg(this, 28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.A = msy.a(lazyThreadSafetyMode, tbgVar);
        this.B = msy.a(lazyThreadSafetyMode, new atm(this, 16));
        this.C = msy.a(lazyThreadSafetyMode, new m1o(this, 16));
        this.D = msy.a(lazyThreadSafetyMode, new btm(this, 19));
        this.E = msy.a(lazyThreadSafetyMode, new tbh(this, 28));
        this.F = msy.a(lazyThreadSafetyMode, new s1m(this, 20));
        this.G = msy.a(lazyThreadSafetyMode, new mxj(this, 25));
        this.H = msy.a(lazyThreadSafetyMode, new gbj(this, 22));
        this.I = msy.a(lazyThreadSafetyMode, new m3g(this, 27));
        this.J = msy.a(lazyThreadSafetyMode, new bfm(this, 15));
        this.K = msy.a(lazyThreadSafetyMode, new nef(this, 17));
        this.L = msy.a(lazyThreadSafetyMode, new sim(this, 15));
        this.M = new vhz(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ef6
    public final void J(ocx ocxVar) {
        super.J(ocxVar);
        ocx.c cVar = ocxVar.f;
        boolean z = (cVar instanceof ocx.c.a) && !((ocx.c.a) cVar).a;
        ?? r1 = this.F;
        ((View) r1.getValue()).setBackgroundColor(z ? g2u0.a(R.color.vk_black_alpha35, (View) r1.getValue()) : 0);
        awt0.v((VkImageSimple) this.G.getValue(), z);
        VkImageSimple vkImageSimple = (VkImageSimple) this.H.getValue();
        if (vkImageSimple != null) {
            vkImageSimple.setImageResource(epx.d(ocxVar.o, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? R.drawable.vk_icon_mute_24 : R.drawable.vk_icon_volume_24);
        }
        if (this.y) {
            boolean z2 = ocxVar.t;
            int i = z2 ? R.drawable.vk_icon_done_outline_24 : R.drawable.vk_icon_clock_24;
            e3m.a aVar = e3m.a;
            Context context = this.w;
            Drawable c = enj.c(i, context.getColor(R.color.vk_white), context);
            ?? r2 = this.I;
            VkImageSimple vkImageSimple2 = (VkImageSimple) r2.getValue();
            if (vkImageSimple2 != null) {
                vkImageSimple2.setImageDrawable(c);
            }
            VkImageSimple vkImageSimple3 = (VkImageSimple) r2.getValue();
            if (vkImageSimple3 != null) {
                vkImageSimple3.setContentDescription(context.getString(z2 ? R.string.remove_from_watch_video_later_content_description : R.string.add_to_watch_video_later_content_description));
            }
        }
    }

    @Override // xsna.mnt0
    public final com.vk.libvideo.autoplay.a getVideoConfig() {
        return this.z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rcx
    public final View getView() {
        return (View) this.A.getValue();
    }

    @Override // xsna.ef6
    public final af6 q() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ef6
    public final VKImageView r() {
        return (VKImageView) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ef6
    public final View s() {
        return (View) this.J.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ef6
    public final VkSimpleButton t() {
        return (VkSimpleButton) this.K.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ef6
    public final ViewGroup u() {
        return (ViewGroup) this.C.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ef6
    public final InteractiveDurationView v() {
        return (InteractiveDurationView) this.D.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ef6
    public final View x() {
        return (View) this.E.getValue();
    }

    @Override // xsna.ef6, xsna.rcx
    public final void y0(InteractiveData interactiveData) {
        super.y0(interactiveData);
        VideoFile videoFile = interactiveData.a;
        axt0.a(z(), videoFile);
        bwt0.S(getView(), new az2(16, this, videoFile));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.ef6
    public final VideoTextureView z() {
        return (VideoTextureView) this.B.getValue();
    }

    @Override // xsna.rcx
    public final void E2(boolean z) {
    }
}
