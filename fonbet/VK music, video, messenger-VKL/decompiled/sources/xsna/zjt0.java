package xsna;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.VideoRestrictionView;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VideoThumbnailHolder.kt */
/* loaded from: classes4.dex */
public final class zjt0 extends sso0<VideoAttachment> implements View.OnClickListener {
    public final TextView E;
    public final InteractiveDurationView F;
    public final VideoOverlayView G;
    public final VideoRestrictionView H;
    public final StringBuilder I;
    public boolean J;
    public io.reactivex.rxjava3.disposables.c K;
    public izs<? super VideoAttachment, Boolean> L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final Object P;

    public zjt0(ViewGroup viewGroup) {
        super(R.layout.attach_comment_video, viewGroup);
        this.E = (TextView) this.itemView.findViewById(R.id.duration);
        this.F = (InteractiveDurationView) this.itemView.findViewById(R.id.interactive_duration);
        this.G = (VideoOverlayView) this.itemView.findViewById(R.id.media_overlay_view);
        this.H = (VideoRestrictionView) this.itemView.findViewById(R.id.media_deprecated_restriction_view);
        this.I = new StringBuilder();
        fog0 fog0Var = new fog0(7);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.M = msy.a(lazyThreadSafetyMode, fog0Var);
        this.N = msy.a(lazyThreadSafetyMode, new yjt0(0));
        this.O = msy.a(lazyThreadSafetyMode, new h13(28));
        this.P = msy.a(lazyThreadSafetyMode, new gos0(1));
        this.itemView.setOnClickListener(this);
        this.D.setPlaceholderImage(R.drawable.placeholder_video);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.m56
    public final void T6(Attachment attachment) {
        VideoFile A;
        VideoAttachment videoAttachment = (VideoAttachment) attachment;
        boolean W9 = videoAttachment.k.W9();
        this.J = W9;
        TextView textView = this.E;
        InteractiveDurationView interactiveDurationView = this.F;
        if (W9) {
            interactiveDurationView.setVisibility(0);
            textView.setVisibility(4);
            interactiveDurationView.setTextDescriptionVisible(false);
            interactiveDurationView.setDurationText(gpt0.m(this.itemView.getContext(), videoAttachment.k, true, false));
        } else {
            interactiveDurationView.setVisibility(4);
            textView.setVisibility(0);
            int duration = videoAttachment.k.getDuration();
            gpt0 gpt0Var = gpt0.a;
            textView.setText(z8s.a(duration));
        }
        View view = this.itemView;
        StringBuilder sb = this.I;
        sb.setLength(0);
        sb.append(v6(R.string.video));
        sb.append(": ");
        sb.append(videoAttachment.k.getTitle());
        sb.append(", ");
        sb.append((CharSequence) f870.o(videoAttachment.k.getDuration(), this.itemView.getContext()));
        view.setContentDescription(sb);
        VideoFile videoFile = videoAttachment.k;
        if (videoFile == null) {
            return;
        }
        bpn0 bpn0Var = VideoOverlayView.I;
        TextView textView2 = this.J ? interactiveDurationView : textView;
        boolean c = fxc0.B().c(videoFile);
        VideoRestriction O = videoFile.O();
        String str = null;
        com.vk.libvideo.design.view.overlay.b a = O != null ? ((a390) this.O.getValue()).a(O) : null;
        boolean z = videoFile.d8() || videoFile.z0();
        VideoPipStateHolder.a.getClass();
        yg5 c2 = VideoPipStateHolder.c();
        if (c2 != null && (A = c2.A()) != null) {
            str = A.a1();
        }
        VideoOverlayView.b.a(new VideoOverlayView.a(this.D, this.G, new dsp0(2, this, videoAttachment), new hfm0(this, 17), textView2, false, false, c, new gkc0(videoFile, 28), new xy0(26, this, videoFile), a, z, epx.f(str, videoFile.a1()), new x9l0(this, 16), (i1t0) this.P.getValue(), null, 65760));
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity h;
        VideoAttachment videoAttachment;
        if (jjc.b() || (h = e3m.h(this.itemView.getContext())) == null || (videoAttachment = (VideoAttachment) this.C) == null) {
            return;
        }
        VideoFile videoFile = videoAttachment.k;
        izs<? super VideoAttachment, Boolean> izsVar = this.L;
        if (izsVar != null ? izsVar.invoke(videoAttachment).booleanValue() : false) {
            return;
        }
        hd60.a().A0(h, videoFile, this.u, null, (r18 & 16) != 0 ? null : videoAttachment.m, null, false, (r18 & 256) != 0 ? null : null);
        s3q0 s3q0Var = s3q0.a;
    }
}
