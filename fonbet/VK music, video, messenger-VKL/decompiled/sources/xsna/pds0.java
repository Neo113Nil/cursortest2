package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeEventSource;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.design.view.VideoControlsBarView;
import com.vkontakte.android.R;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import one.video.exo.offline.DownloadInfo;
import xsna.b4;
import xsna.eao;

/* compiled from: VideoControlsBarDelegate.kt */
/* loaded from: classes7.dex */
public final class pds0 extends p1u0<AboutVideoItem.g> {
    public final c4 a;
    public final egs0 b;

    /* compiled from: VideoControlsBarDelegate.kt */
    public static final class a extends qf6 {
        public final c4 l;
        public final VideoControlsBarView m;
        public VideoFile n;

        /* compiled from: VideoControlsBarDelegate.kt */
        /* renamed from: xsna.pds0$a$a, reason: collision with other inner class name */
        public static final class C3507a implements VideoControlsBarView.a {
            public C3507a() {
            }

            @Override // com.vk.video.design.view.VideoControlsBarView.a
            public final void a() {
                a.this.l.d(b4.d.a);
            }

            @Override // com.vk.video.design.view.VideoControlsBarView.a
            public final void b() {
                a aVar = a.this;
                VideoFile videoFile = aVar.n;
                if (videoFile != null) {
                    aVar.l.d(new b4.k(videoFile, VideoScreenMode.DISCOVERY));
                }
            }

            @Override // com.vk.video.design.view.VideoControlsBarView.a
            public final void c() {
                a.this.l.d(new b4.f0(MobileOfficialAppsSharingStat$TypeEventSource.BUTTON));
            }

            @Override // com.vk.video.design.view.VideoControlsBarView.a
            public final void d() {
                a aVar = a.this;
                VideoFile videoFile = aVar.n;
                if (videoFile != null) {
                    aVar.l.d(new b4.h(videoFile.O9()));
                }
            }

            @Override // com.vk.video.design.view.VideoControlsBarView.a
            public final void e() {
                a.this.l.d(b4.m0.a);
            }

            @Override // com.vk.video.design.view.VideoControlsBarView.a
            public final void f() {
                a.this.l.d(b4.e.a);
            }
        }

        public a(ViewGroup viewGroup, c4 c4Var, egs0 egs0Var) {
            super(viewGroup, R.layout.video_controls_bar_item, egs0Var);
            this.l = c4Var;
            VideoControlsBarView videoControlsBarView = (VideoControlsBarView) this.itemView.findViewById(R.id.controls_bar);
            this.m = videoControlsBarView;
            videoControlsBarView.setOnButtonClickListener(new C3507a());
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x01dd  */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
        /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.vfz
        /* renamed from: W5 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void i6(hfz hfzVar) {
            boolean z;
            boolean z2;
            int l1;
            ViewGroup.LayoutParams layoutParams;
            AboutVideoItem.g gVar = (AboutVideoItem.g) hfzVar;
            VideoFile videoFile = gVar.j;
            this.n = videoFile;
            eao eaoVar = gVar.e;
            eao.a aVar = eaoVar instanceof eao.a ? (eao.a) eaoVar : null;
            DownloadInfo downloadInfo = aVar != null ? aVar.a : null;
            VideoControlsBarView videoControlsBarView = this.m;
            ImageView imageView = videoControlsBarView.h;
            TextView textView = videoControlsBarView.f;
            TextView textView2 = videoControlsBarView.g;
            View view = videoControlsBarView.c;
            videoControlsBarView.l = videoFile;
            boolean e = fxc0.B().b0().e(videoFile);
            boolean z3 = !e;
            VideoRestriction O = videoFile.O();
            boolean z4 = (O == null || O.f) ? false : true;
            boolean z5 = (fxc0.B().c(videoFile) || z4) ? false : true;
            boolean z6 = ((Boolean) videoControlsBarView.m.getValue()).booleanValue() && e5o.a(videoFile);
            boolean z7 = videoFile.J8() && z5 && !e;
            if (videoFile.i0()) {
                gpt0 gpt0Var = gpt0.a;
                z = z7;
                if (new Date(TimeUnit.SECONDS.toMillis(videoFile.k1())).compareTo(new Date(System.currentTimeMillis())) <= 0) {
                    z2 = true;
                    bwt0.p0(view, z2);
                    bwt0.p0(textView2, videoFile.Fa());
                    VideoFeatures videoFeatures = VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY;
                    videoFeatures.getClass();
                    boolean a = com.vk.toggle.b.A.a(videoFeatures);
                    boolean z8 = com.vk.toggle.d.u().c;
                    bwt0.p0(textView, z4 && !a);
                    bwt0.p0(imageView, (z && o25.a().b() && !z6) ? false : true);
                    bwt0.p0(videoControlsBarView.i, (a || videoFile.T1()) ? false : true);
                    view.setEnabled(z3);
                    textView2.setEnabled(z3);
                    textView.setEnabled(z3);
                    view.setSelected((videoFile.O9() || e) ? false : true);
                    imageView.setSelected(videoFile.X());
                    TextView textView3 = videoControlsBarView.e;
                    l1 = videoFile.l1();
                    Integer valueOf = Integer.valueOf(l1);
                    if (l1 <= 0) {
                        valueOf = null;
                    }
                    String l = valueOf == null ? uqm0.l(valueOf.intValue()) : null;
                    textView3.setText(l);
                    layoutParams = textView3.getLayoutParams();
                    if (layoutParams != null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginStart(iah0.a(l != null ? 30 : 24));
                    textView3.setLayoutParams(marginLayoutParams);
                    int c1 = videoFile.c1();
                    Integer valueOf2 = Integer.valueOf(c1);
                    if (c1 <= 0 || z4) {
                        valueOf2 = null;
                    }
                    String l2 = valueOf2 != null ? uqm0.l(valueOf2.intValue()) : null;
                    textView.setText(l2);
                    textView.setCompoundDrawablePadding(l2 != null ? iah0.a(6) : 0);
                    int W7 = videoFile.W7();
                    Integer valueOf3 = Integer.valueOf(W7);
                    if (!z8 || W7 <= 0) {
                        valueOf3 = null;
                    }
                    String l3 = valueOf3 != null ? uqm0.l(valueOf3.intValue()) : null;
                    textView2.setText(l3);
                    textView2.setCompoundDrawablePadding(l3 != null ? iah0.a(6) : 0);
                    imageView.setContentDescription(videoFile.X() ? videoControlsBarView.getContext().getString(R.string.remove_from_watch_video_later_content_description) : videoControlsBarView.getContext().getString(R.string.add_to_watch_video_later_content_description));
                    uys0 uys0Var = videoControlsBarView.j;
                    boolean z9 = (gpt0.D(videoFile) && !e) || z6;
                    uys0Var.a(videoFile);
                    uys0Var.c(gpt0.F(downloadInfo), downloadInfo != null ? downloadInfo.a : null);
                    uys0Var.setVisible(z9);
                    return;
                }
            } else {
                z = z7;
            }
            z2 = false;
            bwt0.p0(view, z2);
            bwt0.p0(textView2, videoFile.Fa());
            VideoFeatures videoFeatures2 = VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY;
            videoFeatures2.getClass();
            boolean a2 = com.vk.toggle.b.A.a(videoFeatures2);
            boolean z82 = com.vk.toggle.d.u().c;
            bwt0.p0(textView, z4 && !a2);
            bwt0.p0(imageView, (z && o25.a().b() && !z6) ? false : true);
            bwt0.p0(videoControlsBarView.i, (a2 || videoFile.T1()) ? false : true);
            view.setEnabled(z3);
            textView2.setEnabled(z3);
            textView.setEnabled(z3);
            view.setSelected((videoFile.O9() || e) ? false : true);
            imageView.setSelected(videoFile.X());
            TextView textView32 = videoControlsBarView.e;
            l1 = videoFile.l1();
            Integer valueOf4 = Integer.valueOf(l1);
            if (l1 <= 0) {
            }
            if (valueOf4 == null) {
            }
            textView32.setText(l);
            layoutParams = textView32.getLayoutParams();
            if (layoutParams != null) {
            }
        }
    }

    public pds0(c4 c4Var, egs0 egs0Var) {
        this.a = c4Var;
        this.b = egs0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.g> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a, this.b);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.g;
    }
}
