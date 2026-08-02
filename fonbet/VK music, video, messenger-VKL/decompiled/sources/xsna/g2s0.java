package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.utils.b;
import com.vk.core.view.VideoRestrictionView;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.MusicVideoParams;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.ui.components.attaches_history.attaches.model.simple.SimpleAttachListItem;
import com.vk.libvideo.design.view.movika.InteractiveDurationView;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: VideoAttachViewTypeDelegate.kt */
/* loaded from: classes2.dex */
public final class g2s0 extends p1u0<SimpleAttachListItem> {
    public m6a a;

    /* compiled from: VideoAttachViewTypeDelegate.kt */
    public final class a extends vfz<SimpleAttachListItem> {
        public final VKEnhancedImageView l;
        public final TextView m;
        public final InteractiveDurationView n;
        public final TextView o;
        public final TextView p;
        public final TextView q;
        public final View r;
        public final View s;
        public io.reactivex.rxjava3.disposables.c t;
        public final Drawable u;
        public final dpg0 v;
        public final coo w;
        public HistoryAttach x;

        public a(g2s0 g2s0Var, View view) {
            super(view);
            this.l = (VKEnhancedImageView) view.findViewById(R.id.image);
            this.m = (TextView) view.findViewById(R.id.duration);
            this.n = (InteractiveDurationView) view.findViewById(R.id.interactive_duration);
            this.o = (TextView) view.findViewById(R.id.title);
            this.p = (TextView) view.findViewById(R.id.info);
            this.q = (TextView) view.findViewById(R.id.subinfo);
            View findViewById = view.findViewById(R.id.options);
            this.r = findViewById;
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.history_attach_video_restriction_container);
            View c = l1t0.c(fxc0.B().Q(), view.getContext(), cn70.b(2), 6);
            this.s = c;
            int i = VideoRestrictionView.d;
            VideoRestrictionView.a.a(iah0.a(2), view.getContext());
            Context context = view.getContext();
            e3m.a aVar = e3m.a;
            this.u = m33.a(R.drawable.default_placeholder_2, context);
            Drawable a = m33.a(R.drawable.ic_videos_placeholder, view.getContext());
            if (a == null) {
                throw new IllegalArgumentException("ic_videos_placeholder not found");
            }
            this.v = new dpg0(a, iah0.a(r5));
            this.w = new coo(view.getContext());
            wpb wpbVar = new wpb(3, this, g2s0Var);
            bpn0 bpn0Var = jjc.a;
            view.setOnClickListener(new q01(wpbVar, 2));
            findViewById.setOnClickListener(new q01(new n2q(7, this, g2s0Var), 2));
            viewGroup.addView(c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(SimpleAttachListItem simpleAttachListItem) {
            HistoryAttach historyAttach = simpleAttachListItem.b;
            this.x = historyAttach;
            AttachVideo attachVideo = (AttachVideo) historyAttach.d;
            MusicVideoParams i = attachVideo.i();
            boolean f = epx.f(attachVideo.b.getType(), "music_video");
            TextView textView = this.p;
            TextView textView2 = this.q;
            TextView textView3 = this.o;
            if (f) {
                textView3.setText(s490.d(this.itemView.getContext(), attachVideo.getTitle(), i != null ? i.b : null, R.attr.vk_ui_text_secondary));
                textView.setText(s490.d(this.itemView.getContext(), s490.i(i != null ? i.f : null), s490.c(i != null ? i.g : null), R.attr.vk_ui_text_secondary));
                textView2.setText(b.C0795b.d(i != null ? i.c : 0L, i != null ? i.e : null));
                textView3.setMaxLines(1);
                bwt0.p0(textView2, true);
            } else {
                textView3.setText(attachVideo.getTitle());
                textView.setText(textView.getResources().getQuantityString(R.plurals.vkim_history_attaches_video_views, attachVideo.b.L8(), Integer.valueOf(attachVideo.b.L8())));
                bwt0.p0(textView2, false);
                textView3.setMaxLines(2);
            }
            if (i == null || !i.d) {
                textView3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                textView3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, textView3.getContext()), (Drawable) null);
                textView3.setCompoundDrawablePadding(iah0.a(4));
            }
            boolean W9 = attachVideo.b.W9();
            TextView textView4 = this.m;
            coo cooVar = this.w;
            InteractiveDurationView interactiveDurationView = this.n;
            if (W9) {
                interactiveDurationView.setDurationText(cooVar.a(attachVideo.b.getDuration()));
                interactiveDurationView.setTextDescriptionVisible(false);
            } else {
                textView4.setText(cooVar.a(attachVideo.b.getDuration()));
            }
            VideoFile videoFile = attachVideo.b;
            ImageList imageList = attachVideo.c;
            boolean W92 = videoFile.W9();
            l1t0 Q = fxc0.B().Q();
            am6 am6Var = new am6(this, W92, imageList, 3);
            fda0 fda0Var = new fda0(this, 19);
            if (W92) {
                textView4 = interactiveDurationView;
            }
            Q.d(this.s, videoFile, this.l, am6Var, fda0Var, (128 & 64) != 0 ? null : textView4);
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends SimpleAttachListItem> b(ViewGroup viewGroup) {
        return new a(this, bwt0.I(R.layout.vkim_history_attach_video, viewGroup, false));
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof SimpleAttachListItem) && (((SimpleAttachListItem) hfzVar).b.d instanceof AttachVideo);
    }
}
