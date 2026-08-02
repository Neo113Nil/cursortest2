package xsna;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.voip.ui.broadcast.list.ui.PastBroadcastsFragment;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: PastBroadcastContentViewHolder.kt */
/* loaded from: classes7.dex */
public final class rn90 extends vfz<eo90> {
    public final so90<ro90> l;
    public final VideoOverlayView m;
    public final TextView n;
    public final TextView o;
    public final VKImageView p;
    public final DurationView q;
    public final ImageView r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;

    public rn90(ViewGroup viewGroup, PastBroadcastsFragment.d dVar) {
        super(R.layout.voip_video_small_item, viewGroup);
        this.l = dVar;
        this.m = (VideoOverlayView) this.itemView.findViewById(R.id.overlay_view);
        this.n = (TextView) this.itemView.findViewById(R.id.title);
        this.o = (TextView) this.itemView.findViewById(R.id.subtitle_views);
        this.p = (VKImageView) this.itemView.findViewById(R.id.preview);
        this.q = (DurationView) this.itemView.findViewById(R.id.duration);
        this.r = (ImageView) this.itemView.findViewById(R.id.menu);
        com.vk.movika.sdk.base.logic.interactor.l lVar = new com.vk.movika.sdk.base.logic.interactor.l(29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.s = msy.a(lazyThreadSafetyMode, lVar);
        this.t = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.logic.interactor.m(22));
        this.u = msy.a(lazyThreadSafetyMode, new la0(19));
        this.v = msy.a(lazyThreadSafetyMode, new zq3(26));
    }

    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(eo90 eo90Var) {
        VideoFile A;
        eo90 eo90Var2 = eo90Var;
        VideoFile videoFile = eo90Var2.b;
        this.n.setText(videoFile.getTitle());
        TextView textView = this.o;
        bwt0.p0(textView, true);
        textView.setText(videoFile.P());
        bwt0.i0(this.r, new np5(19, this, eo90Var2));
        DurationView durationView = this.q;
        durationView.setBackgroundResource(R.drawable.bg_video_duration_label_old);
        durationView.setText(gpt0.m(durationView.getContext(), videoFile, true, false));
        String g = gpt0.g(this.itemView.getContext(), videoFile);
        VKImageView vKImageView = this.p;
        vKImageView.setContentDescription(g);
        Context context = this.itemView.getContext();
        bwt0.r0(e3m.a(R.dimen.voip_small_content_item_width, context), vKImageView);
        bwt0.c0(e3m.a(R.dimen.voip_small_content_item_height, context), vKImageView);
        int a = e3m.a(R.dimen.voip_small_content_item_width, context);
        VideoOverlayView videoOverlayView = this.m;
        bwt0.r0(a, videoOverlayView);
        bwt0.c0(e3m.a(R.dimen.voip_small_content_item_height, context), videoOverlayView);
        bpn0 bpn0Var = VideoOverlayView.I;
        boolean c = fxc0.B().c(videoFile);
        VideoRestriction O = videoFile.O();
        String str = null;
        com.vk.libvideo.design.view.overlay.b a2 = O != null ? ((a390) this.u.getValue()).a(O) : null;
        boolean z = videoFile.d8() || videoFile.z0();
        VideoPipStateHolder.a.getClass();
        yg5 c2 = VideoPipStateHolder.c();
        if (c2 != null && (A = c2.A()) != null) {
            str = A.a1();
        }
        VideoOverlayView.b.a(new VideoOverlayView.a(this.p, this.m, new qk(13, this, videoFile), null, this.q, false, false, c, new u110(videoFile, 7), new sk(19, this, videoFile), a2, z, epx.f(str, videoFile.a1()), new in60(this, 4), (i1t0) this.v.getValue(), null, 65768));
        bwt0.i0(this.itemView, new mp3(24, this, eo90Var2));
    }
}
