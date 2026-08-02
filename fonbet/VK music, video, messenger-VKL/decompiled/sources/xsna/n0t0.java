package xsna;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Image;
import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.progress.VideoProgressView;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.Arrays;
import one.video.exo.offline.DownloadInfo;
import xsna.dis0;
import xsna.s9t0;

/* compiled from: VideoOfflineViewHolder.kt */
/* loaded from: classes3.dex */
public final class n0t0 extends vif0<czs0> implements View.OnClickListener {
    public final bzs0 n;
    public final vhs0 o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final VKImageView t;
    public final View u;
    public final VideoProgressView v;
    public final h270 w;
    public dw20 x;
    public czs0 y;

    /* compiled from: VideoOfflineViewHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadInfo.State.values().length];
            try {
                iArr[DownloadInfo.State.STATE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownloadInfo.State.STATE_REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public n0t0() {
        throw null;
    }

    public n0t0(ViewGroup viewGroup, bzs0 bzs0Var, vhs0 vhs0Var) {
        super(viewGroup, R.layout.offline_item_view, 0);
        this.n = bzs0Var;
        this.o = vhs0Var;
        this.p = (TextView) this.itemView.findViewById(R.id.title);
        this.q = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.r = (TextView) this.itemView.findViewById(R.id.info);
        this.s = (TextView) this.itemView.findViewById(R.id.error);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.photo);
        this.t = vKImageView;
        View findViewById = this.itemView.findViewById(R.id.options);
        this.u = findViewById;
        this.v = (VideoProgressView) this.itemView.findViewById(R.id.download_view);
        this.w = new h270(vKImageView, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, null, null, 252);
        bpn0 bpn0Var = jjc.a;
        findViewById.setOnClickListener(new q01(this, 2));
        this.itemView.setOnClickListener(new q01(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vif0
    public final void i6(czs0 czs0Var) {
        s9t0 s9t0Var;
        String str;
        czs0 czs0Var2 = czs0Var;
        VideoFileOld videoFileOld = czs0Var2.a;
        m0t0 m0t0Var = new m0t0(videoFileOld, 0);
        VideoProgressView videoProgressView = this.v;
        videoProgressView.setOnRetryClickListener(m0t0Var);
        int i = 9;
        videoProgressView.setOnCancelClickListener(new ax5(this, videoFileOld, czs0Var2, 9));
        Object obj = dis0.t;
        DownloadInfo downloadInfo = czs0Var2.b;
        DownloadInfo.State state = downloadInfo != null ? downloadInfo.c : null;
        int i2 = state == null ? -1 : dis0.a.C2739a.$EnumSwitchMapping$0[state.ordinal()];
        if (i2 == -1) {
            s9t0Var = s9t0.c.a;
        } else if (i2 == 1) {
            s9t0Var = s9t0.c.a;
        } else if (i2 == 2) {
            s9t0Var = s9t0.b.a;
        } else if (i2 != 3) {
            float f = downloadInfo.g;
            DownloadInfo.State state2 = downloadInfo.c;
            s9t0Var = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? new s9t0.d((int) Math.ceil(f), w8o.c(state2), w8o.d(state2)) : s9t0.e.a;
        } else {
            s9t0Var = s9t0.a.a;
        }
        videoProgressView.a(s9t0Var);
        DownloadInfo.State state3 = downloadInfo.c;
        int i3 = state3 != null ? a.$EnumSwitchMapping$0[state3.ordinal()] : -1;
        TextView textView = this.s;
        TextView textView2 = this.q;
        TextView textView3 = this.r;
        if (i3 == 1) {
            bwt0.p0(textView3, false);
            bwt0.p0(textView2, false);
            bwt0.p0(textView, true);
        } else if (i3 != 2) {
            bwt0.p0(textView, false);
            int b = an10.b(downloadInfo.g);
            if (b == 0) {
                str = b6().getString(R.string.video_download_progress_soon);
            } else if (b < 100) {
                Resources b6 = b6();
                StringBuilder sb = new StringBuilder();
                sb.append(b);
                sb.append('%');
                str = b6.getString(R.string.video_download_progress, sb.toString());
            } else {
                str = "";
            }
            textView2.setText(str);
            bwt0.p0(textView2, !drm0.N(textView2.getText()));
            String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(downloadInfo.d / 1048576.0f)}, 1));
            if (b == 0) {
                textView3.setText("");
            } else if (b < 100) {
                textView3.setText(b6().getString(R.string.video_download_progress_size, format));
                textView3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                textView3.setText(b6().getString(R.string.video_download_progress_size, format));
                his0.v(textView3, R.drawable.vk_icon_check_circle_12, 0);
            }
            bwt0.p0(textView3, !drm0.N(textView3.getText()));
        }
        czs0 czs0Var3 = this.y;
        boolean equals = videoFileOld.equals(czs0Var3 != null ? czs0Var3.a : null);
        this.y = czs0Var2;
        if (equals) {
            return;
        }
        Image image = ((czs0) this.m).a.I0;
        io.reactivex.rxjava3.core.x o = fxc0.B().J().M1() ? this.n.o(image, ((czs0) this.m).a.r1()) : new io.reactivex.rxjava3.internal.operators.single.v(new im9(image));
        asu0 asu0Var = asu0.a;
        hg1.b(this.itemView, new io.reactivex.rxjava3.internal.operators.single.e0(o.q(asu0Var.c()).m(asu0Var.d()), new xw70(new hsc0(this, 28), 13)).subscribe(new vtg0(new com.vk.movika.sdk.base.ui.q0(this, 8), i)));
        CharSequence v = gpt0.v(videoFileOld);
        TextView textView4 = this.p;
        textView4.setText(v);
        MusicVideoFile musicVideoFile = videoFileOld instanceof MusicVideoFile ? (MusicVideoFile) videoFileOld : null;
        if (musicVideoFile == null || !musicVideoFile.A1) {
            textView4.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            textView4.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, textView4.getContext()), (Drawable) null);
            textView4.setCompoundDrawablePadding(iah0.a(4));
        }
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        yg5 e = b.C1208b.a().e(videoFileOld, null);
        String a2 = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.OFFLINE);
        yg5.o0(e, a2, null, videoFileOld.W, false, 2);
        com.vk.libvideo.autoplay.a aVar = com.vk.libvideo.autoplay.a.t;
        h270 h270Var = this.w;
        h270Var.k(videoFileOld, e, aVar);
        h270Var.w(a2);
    }

    @Override // xsna.vif0
    public final void m6() {
        dw20 dw20Var = this.x;
        if (dw20Var != null) {
            dw20Var.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != this.itemView) {
            if (view == this.u) {
                this.o.invoke(((czs0) this.m).a);
                return;
            }
            return;
        }
        this.w.w(com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.OFFLINE));
        Activity h = e3m.h(view.getContext());
        if (h == null) {
            return;
        }
        if (fxc0.B().J().z()) {
            uc.r(this.w, h, true, null, null, null, null, 188);
        } else {
            uc.r(this.w, h, false, null, null, null, null, 252);
        }
    }
}
