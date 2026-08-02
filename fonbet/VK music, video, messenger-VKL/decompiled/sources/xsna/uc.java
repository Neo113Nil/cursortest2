package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.OfferVkVideo;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.api.VideoAutoPlayDelayType;
import com.vk.libvideo.api.ui.VideoResizer;
import com.vk.libvideo.design.view.duration.DurationView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.media.player.PlayerError;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: AbstractAutoPlayDelegate.kt */
/* loaded from: classes2.dex */
public abstract class uc extends c56 implements mnt0, jux0, zmt0 {
    public static int t;
    public final DurationView b;
    public final View c;
    public final ih5 d;
    public final boolean e = bo.h();
    public final bpn0 f = new bpn0(new qc(this, 0));
    public final int g;
    public WeakReference<View> h;
    public WeakReference<ViewGroup> i;
    public yg5 j;
    public String k;
    public String l;
    public String m;
    public boolean n;
    public VideoFile o;
    public boolean p;
    public cnt0 q;
    public com.vk.libvideo.autoplay.a r;
    public final a s;

    /* compiled from: AbstractAutoPlayDelegate.kt */
    public static final class a implements jly {
        public a() {
        }

        @Override // xsna.jly
        public final String a(Context context) {
            uc ucVar = uc.this;
            if (ucVar.o.x5()) {
                return context.getString(R.string.label_gif);
            }
            if (ucVar.o.z0()) {
                return context.getString(R.string.video_live_upcoming);
            }
            if (ucVar.o.q0()) {
                return context.getString(R.string.video_live).toUpperCase(Locale.ROOT);
            }
            if (!fxc0.B().J().v() || ucVar.o.ab() != OfferVkVideo.LISTING) {
                int b = b();
                gpt0 gpt0Var = gpt0.a;
                return z8s.a(b);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(context.getString(R.string.vk_video_title));
            sb.append(" · ");
            int b2 = b();
            gpt0 gpt0Var2 = gpt0.a;
            sb.append(z8s.a(b2));
            return sb.toString();
        }

        public final int b() {
            long duration;
            uc ucVar = uc.this;
            yg5 yg5Var = ucVar.j;
            if (yg5Var == null) {
                yg5Var = null;
            }
            if (yg5Var.getPosition() > 0 && ucVar.getVideoFocused() && ucVar.o.T3()) {
                yg5 yg5Var2 = ucVar.j;
                if (yg5Var2 == null) {
                    yg5Var2 = null;
                }
                long duration2 = yg5Var2.getDuration();
                yg5 yg5Var3 = ucVar.j;
                if (yg5Var3 == null) {
                    yg5Var3 = null;
                }
                if ((duration2 - yg5Var3.getPosition()) / 1000 < 0) {
                    yg5 yg5Var4 = ucVar.j;
                    duration = (yg5Var4 != null ? yg5Var4 : null).getDuration();
                } else {
                    yg5 yg5Var5 = ucVar.j;
                    if (yg5Var5 == null) {
                        yg5Var5 = null;
                    }
                    long duration3 = yg5Var5.getDuration();
                    yg5 yg5Var6 = ucVar.j;
                    duration = duration3 - (yg5Var6 != null ? yg5Var6 : null).getPosition();
                }
            } else {
                yg5 yg5Var7 = ucVar.j;
                duration = (yg5Var7 != null ? yg5Var7 : null).getDuration();
            }
            return (int) (duration / 1000);
        }
    }

    public uc(DurationView durationView, View view, ih5 ih5Var) {
        this.b = durationView;
        this.c = view;
        this.d = ih5Var;
        int i = t;
        t = i + 1;
        this.g = i;
        this.h = new WeakReference<>(null);
        this.i = new WeakReference<>(null);
        this.o = new VideoFileOld();
        this.r = com.vk.libvideo.autoplay.a.t;
        this.s = new a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (xsna.e5o.a(r20.o) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void o(uc ucVar, Activity activity, boolean z, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, String str2, int i) {
        boolean z2;
        String str3 = (i & 4) != 0 ? null : str;
        SearchStatsLoggingInfo searchStatsLoggingInfo2 = (i & 8) != 0 ? null : searchStatsLoggingInfo;
        String str4 = (i & 16) != 0 ? null : "about_video_feed_tag";
        String str5 = (i & 32) != 0 ? null : str2;
        f5o f5oVar = (f5o) ucVar.f.getValue();
        if (f5oVar != null) {
            z2 = true;
            if (f5oVar.a()) {
            }
        }
        z2 = false;
        if (ucVar.o.Z9() && !(ucVar.o instanceof MusicVideoFile) && !fxc0.B().c(ucVar.o) && !z2) {
            cvk.u(gpt0.n(PlayerError.ERROR_CONTENT_RESTRICTED, false), false);
            return;
        }
        if (ucVar.o.x5()) {
            cvk.w(activity.getString(gpt0.n(PlayerError.ERROR_NOT_SUPPORT, false)), false);
            return;
        }
        if (ucVar.o.isEmpty() && !z2) {
            VideoFile videoFile = ucVar.o;
            w1s0.g(activity, videoFile.I0(), videoFile.o0(), videoFile.C1(), videoFile.C2(), false, false, new rc(ucVar, activity, z, 0), 224);
            return;
        }
        if (!ucVar.o.W9() || z) {
            if (ucVar.o.isExternal() || !ucVar.o.T3()) {
                fxc0.B().Y().k(activity, ucVar.o, (r43 & 4) != 0 ? null : ucVar.k, (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : ucVar.m, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : searchStatsLoggingInfo2, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : ucVar.e());
                return;
            } else {
                r(ucVar, activity, z, str3, searchStatsLoggingInfo2, str4, str5, 96);
                return;
            }
        }
        ydt0 Y = fxc0.B().Y();
        VideoFile videoFile2 = ucVar.o;
        String str6 = ucVar.k;
        String str7 = ucVar.m;
        ucVar.e();
        Y.d(activity, videoFile2, str6, (r35 & 8) != 0 ? null : null, (r35 & 16) != 0 ? null : str7, (r35 & 32) != 0 ? null : null, (r35 & 64) != 0 ? false : false, (r35 & 128) != 0 ? null : null, (r35 & 256) != 0 ? false : false, (r35 & 2048) != 0 ? -1L : 0L, (r35 & 4096) != 0 ? null : searchStatsLoggingInfo2, null, (r35 & 16384) != 0 ? null : null);
    }

    public static /* synthetic */ void r(uc ucVar, Activity activity, boolean z, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, String str2, String str3, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            searchStatsLoggingInfo = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        ucVar.p(activity, z, str, searchStatsLoggingInfo, str2, (i & 64) == 0, (i & 128) != 0 ? null : str3);
    }

    public void G2(View view) {
        if (this.i.get() == null) {
            View s = bwt0.s(view.getParent(), new sc(0));
            if (!(s instanceof ViewGroup)) {
                s = null;
            }
            this.i = new WeakReference<>((ViewGroup) s);
        }
        if (this.h.get() == null) {
            View s2 = bwt0.s(view.getParent(), new tc(0));
            this.h = new WeakReference<>(s2 != null ? s2 : null);
        }
    }

    @Override // xsna.c56
    public final View f() {
        return getVideoView();
    }

    @Override // xsna.io2
    public VideoResizer.VideoFitType getContentScaleType() {
        yg5 yg5Var = this.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        return yg5Var.P0() ? VideoResizer.VideoFitType.FIT : VideoResizer.VideoFitType.CROP;
    }

    @Override // xsna.dnt0
    public final VideoAutoPlayDelayType getVideoAutoPlayDelayType() {
        return null;
    }

    @Override // xsna.mnt0
    public final com.vk.libvideo.autoplay.a getVideoConfig() {
        return this.r;
    }

    public boolean getVideoFocused() {
        return this.p;
    }

    /* renamed from: getVideoView */
    public VideoTextureView mo407getVideoView() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (com.vk.dto.common.restrictions.VideoRestriction.SupportedAction.a.a(r5) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(VideoFile videoFile, yg5 yg5Var, com.vk.libvideo.autoplay.a aVar) {
        f5o f5oVar;
        v(videoFile);
        this.j = yg5Var;
        View view = this.c;
        if (view != null) {
            VideoRestriction O = this.o.O();
            RestrictionButton restrictionButton = O != null ? O.e : null;
            boolean z = true;
            if (this.e && O != null && !O.f && ((f5oVar = (f5o) this.f.getValue()) == null || !f5oVar.a() || !e5o.a(this.o))) {
                if (restrictionButton != null) {
                    VideoRestriction.SupportedAction.Companion.getClass();
                }
                z = false;
            }
            view.setClickable(z);
            view.setEnabled(z);
            view.setFocusable(z);
        }
    }

    public final void n(boolean z, boolean z2) {
        DurationView durationView = this.b;
        if (z2) {
            if (durationView != null) {
                durationView.setBackgroundResource(R.drawable.bg_right_round_corner_overlay_primary);
                return;
            }
            return;
        }
        yg5 yg5Var = this.j;
        if (yg5Var == null) {
            yg5Var = null;
        }
        boolean v = yg5Var.v();
        ih5 ih5Var = this.d;
        if (v) {
            if (durationView != null) {
                durationView.setBackgroundResource((this.o.z0() || !this.o.T3()) ? ih5Var.a.b : ih5Var.a.c);
            }
        } else if (z) {
            if (durationView != null) {
                durationView.setBackgroundColor(0);
            }
        } else if (durationView != null) {
            durationView.setBackgroundResource(ih5Var.a.a);
        }
    }

    public abstract void p(Activity activity, boolean z, String str, SearchStatsLoggingInfo searchStatsLoggingInfo, String str2, boolean z2, String str3);

    public final void s(String str) {
        yg5 yg5Var = this.j;
        if (yg5Var != null) {
            if (yg5Var == null) {
                yg5Var = null;
            }
            yg5Var.s0(str);
        }
        this.m = str;
    }

    @Override // xsna.mnt0
    public final void setFocusController(cnt0 cnt0Var) {
        this.q = cnt0Var;
    }

    public void setVideoFocused(boolean z) {
        this.p = z;
    }

    public final void v(VideoFile videoFile) {
        yg5 yg5Var = this.j;
        if (yg5Var != null && epx.f(yg5Var.A().r1(), videoFile.r1())) {
            yg5 yg5Var2 = this.j;
            if (yg5Var2 == null) {
                yg5Var2 = null;
            }
            yg5Var2.N(videoFile);
        }
        this.o = videoFile;
    }

    public final void w(String str) {
        yg5 yg5Var = this.j;
        if (yg5Var != null) {
            if (yg5Var == null) {
                yg5Var = null;
            }
            yg5Var.q0(str);
        }
        this.k = str;
    }

    public void w0(View view) {
    }
}
