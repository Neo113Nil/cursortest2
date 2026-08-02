package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.AdvertisementInfo;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.PlayerAction;
import com.vk.music.player.PlayerMode;
import com.vk.music.player.PlayerTrack;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;

/* compiled from: ModernSmallPlayerView.kt */
@ozl
/* loaded from: classes3.dex */
public final class p630 extends ConstraintLayout implements View.OnClickListener, View.OnLongClickListener, too0, pel0 {
    public final bpn0 A;
    public final bpn0 B;
    public PlayerMode C;
    public MusicTrack D;
    public baf0 E;
    public baf0 F;
    public baf0 G;
    public baf0 H;
    public baf0 I;
    public baf0 J;
    public baf0 K;
    public baf0 L;
    public boolean M;
    public a N;
    public final p630 t;
    public final ImageView u;
    public final TextView v;
    public final ImageView w;
    public final TextView x;
    public final ProgressBar y;
    public final ImageView z;

    /* compiled from: ModernSmallPlayerView.kt */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: ModernSmallPlayerView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayerMode.values().length];
            try {
                iArr[PlayerMode.ADVERTISEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerMode.AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerMode.PODCAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayerMode.AUDIO_BOOK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlayerMode.STREAM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PlayerMode.RADIO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PlayerMode.NFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PlayerMode.EXTERNAL_AUDIO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PlayerMode.LOADING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public p630(Context context) {
        super(context, null, 0);
        this.t = this;
        View frameLayout = new FrameLayout(context);
        frameLayout.setId(R.id.music_small_player_highlight_foreground);
        bwt0.Z(R.attr.vk_ui_background_content, frameLayout);
        e3m.a aVar = e3m.a;
        frameLayout.setForeground(m33.a(R.drawable.highlight, context));
        addView(frameLayout, 0, 0);
        View frameLayout2 = new FrameLayout(context, null, 0);
        frameLayout2.setId(R.id.music_small_player_navigation_shadow);
        bwt0.Z(R.attr.vk_ui_separator_primary_alpha, frameLayout2);
        addView(frameLayout2, -1, iah0.a(0.75f));
        ImageView imageView = new ImageView(context, null, 0);
        imageView.setId(R.id.music_small_player_iv_play_pause);
        imageView.setOnClickListener(this);
        imageView.setClickable(true);
        imageView.setFocusable(true);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        float f = 48;
        addView(imageView, iah0.a(f), 0);
        this.u = imageView;
        TextView textView = new TextView(context, null, 0);
        textView.setId(R.id.music_small_player_tv_title);
        textView.setMaxLines(1);
        textView.setSingleLine();
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        jno0.c(textView, R.attr.vk_ui_text_primary);
        com.vk.typography.b.k(textView, FontFamily.MEDIUM, Float.valueOf(13.0f), 4);
        float f2 = 4;
        f4m.s(iah0.a(f2), textView);
        f4m.r(iah0.a(f2), textView);
        addView(textView, -2, -2);
        this.v = textView;
        ImageView imageView2 = new ImageView(context, null, 0);
        imageView2.setId(R.id.music_small_player_iv_explicit);
        imageView2.setImageDrawable(m33.a(R.drawable.vk_icon_error_circle_fill_gray_12, context));
        imageView2.setVisibility(8);
        f4m.r(iah0.a(f2), imageView2);
        f4m.s(iah0.a(f2), imageView2);
        float f3 = 14;
        addView(imageView2, iah0.a(f3), iah0.a(f3));
        this.w = imageView2;
        TextView textView2 = new TextView(context, null, 0);
        textView2.setId(R.id.music_small_player_tv_artist);
        textView2.setMaxLines(1);
        textView2.setSingleLine();
        jno0.c(textView2, R.attr.vk_ui_text_secondary);
        com.vk.typography.b.k(textView2, FontFamily.REGULAR, Float.valueOf(11.0f), 4);
        f4m.s(iah0.a(f2), textView2);
        f4m.r(iah0.a(f2), textView2);
        textView2.setEllipsize(truncateAt);
        addView(textView2, -2, -2);
        this.x = textView2;
        ProgressBar progressBar = new ProgressBar(context, null, android.R.style.Widget.DeviceDefault.ProgressBar.Horizontal);
        progressBar.setId(R.id.music_small_player_pb_loading);
        progressBar.setIndeterminateTintList(dhr0.r(R.attr.vk_ui_icon_secondary));
        progressBar.setVisibility(8);
        float f4 = 16;
        addView(progressBar, iah0.a(f4), iah0.a(f4));
        this.y = progressBar;
        ImageView imageView3 = new ImageView(context, null, 0);
        imageView3.setId(R.id.music_small_player_iv_next_close);
        imageView3.setOnClickListener(this);
        imageView3.setClickable(true);
        imageView3.setFocusable(true);
        imageView3.setScaleType(scaleType);
        addView(imageView3, iah0.a(f), 0);
        this.z = imageView3;
        this.A = new bpn0(new d1(24));
        this.B = new bpn0(new pd4(19));
        this.C = PlayerMode.AUDIO;
        this.M = true;
        setMinimumHeight(context.getResources().getDimensionPixelSize(R.dimen.music_modern_small_player_height));
        setOnClickListener(this);
        setOnLongClickListener(this);
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.i(this);
        bVar.k(frameLayout2.getId(), 7, 0, 7);
        bVar.k(frameLayout2.getId(), 6, 0, 6);
        bVar.k(frameLayout2.getId(), 3, 0, 3);
        bVar.k(frameLayout.getId(), 3, 0, 3);
        bVar.k(frameLayout.getId(), 4, 0, 4);
        bVar.k(frameLayout.getId(), 7, 0, 7);
        bVar.k(frameLayout.getId(), 6, 0, 6);
        bVar.u(frameLayout.getId()).e.d0 = context.getResources().getDimensionPixelSize(R.dimen.music_modern_small_player_height);
        bVar.k(imageView.getId(), 3, 0, 3);
        bVar.k(imageView.getId(), 4, 0, 4);
        bVar.k(imageView.getId(), 6, 0, 6);
        bVar.u(imageView.getId()).e.d0 = context.getResources().getDimensionPixelSize(R.dimen.music_modern_small_player_height);
        bVar.k(textView.getId(), 3, 0, 3);
        bVar.k(textView.getId(), 4, textView2.getId(), 3);
        bVar.k(textView.getId(), 7, imageView2.getId(), 6);
        bVar.k(textView.getId(), 6, imageView.getId(), 7);
        bVar.u(textView.getId()).e.m0 = true;
        bVar.u(textView.getId()).e.W = 2;
        bVar.k(imageView2.getId(), 3, textView.getId(), 3);
        bVar.k(imageView2.getId(), 4, textView.getId(), 4);
        bVar.k(imageView2.getId(), 7, imageView3.getId(), 6);
        bVar.k(imageView2.getId(), 6, textView.getId(), 7);
        bVar.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, imageView2.getId());
        bVar.I(0.8f, imageView2.getId());
        bVar.G(imageView2.getId(), 6, cn70.b(8));
        bVar.k(textView2.getId(), 3, textView.getId(), 4);
        bVar.k(textView2.getId(), 4, 0, 4);
        bVar.k(textView2.getId(), 7, imageView3.getId(), 6);
        bVar.k(textView2.getId(), 6, imageView.getId(), 7);
        bVar.u(textView2.getId()).e.m0 = true;
        bVar.k(progressBar.getId(), 3, 0, 3);
        bVar.k(progressBar.getId(), 4, 0, 4);
        bVar.k(progressBar.getId(), 7, imageView3.getId(), 6);
        bVar.k(progressBar.getId(), 6, imageView.getId(), 7);
        bVar.k(imageView3.getId(), 3, 0, 3);
        bVar.k(imageView3.getId(), 4, 0, 4);
        bVar.k(imageView3.getId(), 7, 0, 7);
        bVar.u(imageView3.getId()).e.d0 = context.getResources().getDimensionPixelSize(R.dimen.music_modern_small_player_height);
        bVar.b(this);
        Ng();
        addOnAttachStateChangeListener(new o630(this));
    }

    public static final void Q4(p630 p630Var, yj40 yj40Var) {
        MusicTrack b2 = p630Var.getPlayerModel().b();
        if (b2 == null) {
            return;
        }
        if (yj40Var instanceof ave0) {
            if (b2.Wb() && b2.b == ((ave0) yj40Var).a) {
                PlayerTrack o0 = p630Var.getPlayerModel().o0();
                if (o0 != null) {
                    o0.b = MusicTrack.zb(o0.b, 0, o25.a().c(), 0, 0, null, false, null, null, false, false, null, null, null, -3, 1048575);
                }
                p630Var.a5();
                return;
            }
            return;
        }
        if ((yj40Var instanceof bve0) && b2.Wb() && b2.b == ((bve0) yj40Var).a) {
            PlayerTrack o02 = p630Var.getPlayerModel().o0();
            if (o02 != null) {
                o02.b = MusicTrack.zb(o02.b, 0, UserId.d, 0, 0, null, false, null, null, false, false, null, null, null, -3, 1048575);
            }
            p630Var.a5();
        }
    }

    public static void T4(ImageView imageView, boolean z) {
        if (imageView.isEnabled() == z) {
            return;
        }
        imageView.setEnabled(z);
        imageView.setAlpha(z ? 1.0f : 0.3f);
    }

    public static void U4(p630 p630Var, final View view, final Runnable runnable, int i) {
        if ((i & 2) != 0) {
            runnable = null;
        }
        final boolean z = (i & 4) == 0;
        view.animate().withEndAction(new Runnable() { // from class: xsna.n630
            @Override // java.lang.Runnable
            public final void run() {
                boolean z2 = z;
                View view2 = view;
                if (z2) {
                    f4m.j(view2);
                } else {
                    view2.setVisibility(4);
                }
                view2.setAlpha(1.0f);
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        }).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).start();
    }

    private final a630 getMusicTrackModel() {
        return (a630) this.B.getValue();
    }

    private final u2b0 getPlayerModel() {
        return (u2b0) this.A.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAdvertisementMode$lambda$11(p630 p630Var) {
        p630Var.v.setText(p630Var.getContext().getString(R.string.audio_ad_title));
        d3m.c(p630Var.v, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    private final void setCurrentPlayerMode(MusicTrack musicTrack) {
        this.C = xo9.l(musicTrack);
    }

    @Override // xsna.too0
    public final void Ng() {
        abg0 abg0Var = dhr0.t;
        this.E = abg0Var.b(R.drawable.vk_icon_play_24, R.attr.vk_ui_icon_accent);
        this.F = abg0Var.b(R.drawable.vk_icon_pause_24, R.attr.vk_ui_icon_accent);
        this.G = abg0Var.b(R.drawable.vk_icon_skip_next_24, R.attr.vk_ui_icon_accent);
        this.H = abg0Var.b(R.drawable.vk_icon_forward_15_24, R.attr.vk_ui_icon_accent);
        this.I = abg0Var.b(R.drawable.vk_icon_cancel_24, R.attr.vk_ui_icon_secondary);
        this.J = abg0Var.b(R.drawable.vk_icon_more_vertical_24, R.attr.vk_ui_icon_accent);
        this.K = abg0Var.b(R.drawable.vk_icon_add_24, R.attr.vk_ui_icon_accent);
        this.L = abg0Var.b(R.drawable.vk_icon_done_24, R.attr.vk_ui_icon_accent);
    }

    public final void V4() {
        T4(this.z, this.M);
        T4(this.u, true);
        U4(this, this.y, null, 7);
    }

    public final void X4() {
        V4();
        Y4(null, getPlayerModel().h(), true);
        com.vk.music.player.f H = getPlayerModel().H();
        boolean z = H != null && H.l(PlayerAction.more);
        this.M = z;
        T4(this.z, z);
        PlayerMode playerMode = this.C;
        PlayerMode playerMode2 = PlayerMode.ADVERTISEMENT;
        if (playerMode == playerMode2) {
            return;
        }
        this.D = null;
        this.C = playerMode2;
        U4(this, this.x, null, 3);
        U4(this, this.v, new tn9(this, 9), 5);
        U4(this, this.w, null, 3);
        if (getVisibility() == 8) {
            setVisibility(4);
        }
    }

    public final void Y4(MusicTrack musicTrack, boolean z, boolean z2) {
        baf0 baf0Var;
        int i;
        baf0 baf0Var2 = z ? this.F : this.E;
        ImageView imageView = this.u;
        imageView.setImageDrawable(baf0Var2);
        imageView.setContentDescription(imageView.getContext().getString(z ? R.string.music_talkback_pause : R.string.music_talkback_play));
        if (z2) {
            baf0Var = this.J;
        } else {
            PlayerMode playerMode = this.C;
            if (playerMode == PlayerMode.STREAM) {
                baf0Var = this.I;
            } else if (z) {
                int i2 = b.$EnumSwitchMapping$0[playerMode.ordinal()];
                if (i2 != 3 && i2 != 4) {
                    if (i2 == 6) {
                        baf0Var = getMusicTrackModel().i0(musicTrack) ? this.L : this.K;
                    } else if (i2 != 7 && i2 != 8) {
                        baf0Var = this.G;
                    }
                }
                baf0Var = this.H;
            } else {
                baf0Var = this.I;
            }
        }
        ImageView imageView2 = this.z;
        imageView2.setImageDrawable(baf0Var);
        Context context = imageView2.getContext();
        if (z2) {
            i = R.string.music_talkback_more;
        } else {
            PlayerMode playerMode2 = this.C;
            if (playerMode2 != PlayerMode.STREAM && z) {
                int i3 = b.$EnumSwitchMapping$0[playerMode2.ordinal()];
                if (i3 != 3 && i3 != 4) {
                    if (i3 == 6) {
                        i = getMusicTrackModel().i0(musicTrack) ? R.string.music_radio_talkback_unfollow : R.string.music_radio_talkback_follow;
                    } else if (i3 != 7 && i3 != 8) {
                        i = R.string.music_talkback_next;
                    }
                }
                i = R.string.accessibility_rewind_on_15_sec_forward;
            } else {
                i = R.string.ui_accessibility_close;
            }
        }
        imageView2.setContentDescription(context.getString(i));
    }

    public final void Z4() {
        String str;
        CharSequence j;
        V4();
        MusicTrack b2 = getPlayerModel().b();
        if (b2 == null) {
            return;
        }
        setCurrentPlayerMode(b2);
        boolean z = false;
        Y4(b2, getPlayerModel().h(), false);
        if (!b2.Tb() ? !b2.Wb() || !getPlayerModel().h() || getMusicTrackModel().i0(b2) || getMusicTrackModel().i(b2) : !getPlayerModel().h() || !getPlayerModel().J0()) {
            z = true;
        }
        this.M = z;
        T4(this.z, z);
        if (b2.equals(this.D)) {
            return;
        }
        this.D = b2;
        U4(this, this.v, new aw(5, this, b2), 5);
        boolean Wb = b2.Wb();
        TextView textView = this.x;
        if (Wb) {
            j = getContext().getString(R.string.auido_radiostation_artist);
        } else {
            float textSize = textView.getTextSize();
            ucp ucpVar = ucp.a;
            StringBuilder sb = new StringBuilder();
            List<Artist> list = b2.t;
            if (list != null) {
                str = s490.i(list);
            } else {
                str = b2.h;
                if (str == null) {
                    str = "";
                }
            }
            sb.append(str);
            sb.append(' ');
            sb.append(s490.c(b2.u));
            j = ucp.j(drm0.p0(sb.toString()).toString(), Float.valueOf(textSize));
        }
        int i = 3;
        if (drm0.N(j)) {
            U4(this, textView, null, 3);
        } else {
            U4(this, textView, new aaq(i, this, j), 5);
        }
        U4(this, this.w, new ugr(2, b2, this), 1);
        if (getVisibility() == 8) {
            setVisibility(4);
        }
    }

    public final void a5() {
        switch (b.$EnumSwitchMapping$0[this.C.ordinal()]) {
            case 1:
                X4();
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                Z4();
                return;
            case 9:
                PlayerMode playerMode = this.C;
                PlayerMode playerMode2 = PlayerMode.LOADING;
                if (playerMode == playerMode2) {
                    return;
                }
                V4();
                this.C = playerMode2;
                this.D = null;
                Y4(null, getPlayerModel().h(), false);
                this.M = false;
                T4(this.z, false);
                T4(this.u, false);
                U4(this, this.x, null, 7);
                U4(this, this.v, null, 7);
                U4(this, this.w, null, 3);
                d3m.c(this.y, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (getVisibility() == 8) {
                    setVisibility(4);
                    return;
                }
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final a getListener() {
        return this.N;
    }

    @Override // xsna.pel0
    public View getView() {
        return this.t;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MusicTrack musicTrack;
        MusicTrack musicTrack2;
        MusicTrack musicTrack3;
        if (isEnabled() && view != null) {
            int id = view.getId();
            if (id == R.id.music_small_player_iv_play_pause) {
                getPlayerModel().w1(new PlaybackActionMeta(6, 0L, 2, null));
                return;
            }
            if (id != R.id.music_small_player_iv_next_close) {
                a aVar = this.N;
                if (aVar != null) {
                    aVar.b();
                    return;
                }
                fl4 g = lyd.g();
                Context context = getContext();
                int i = fl4.a;
                g.x(context, false);
                return;
            }
            PlayerMode playerMode = this.C;
            if (playerMode == PlayerMode.ADVERTISEMENT) {
                com.vk.music.player.f H = getPlayerModel().H();
                if (H != null) {
                    H.o(AdvertisementInfo.Action.AD_CHOICE_CLICK);
                    return;
                }
                return;
            }
            if (playerMode == PlayerMode.STREAM) {
                getPlayerModel().stop(32);
                return;
            }
            if (!getPlayerModel().h()) {
                getPlayerModel().stop(32);
                return;
            }
            if (b.$EnumSwitchMapping$0[this.C.ordinal()] == 6) {
                MusicTrack b2 = getPlayerModel().b();
                if (b2 == null || b2.b == 0) {
                    return;
                }
                if (getMusicTrackModel().i0(b2)) {
                    itg0.m(a630.h0(getMusicTrackModel(), b2.b, null, 6));
                    return;
                } else {
                    itg0.m(a630.L1(getMusicTrackModel(), b2.b, null, 6));
                    return;
                }
            }
            MusicTrack musicTrack4 = this.D;
            if (musicTrack4 == null || !musicTrack4.Wb()) {
                MusicTrack musicTrack5 = this.D;
                if ((musicTrack5 == null || !musicTrack5.Vb()) && (((musicTrack = this.D) == null || !musicTrack.Ub()) && (((musicTrack2 = this.D) == null || !musicTrack2.Mb()) && ((musicTrack3 = this.D) == null || !musicTrack3.Qb())))) {
                    getPlayerModel().s0(new PlaybackActionMeta(7, 0L, 2, null));
                } else {
                    getPlayerModel().b1(new PlaybackActionMeta(20, 0L, 2, null));
                }
            }
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (view == null) {
            return false;
        }
        a aVar = this.N;
        if (aVar == null) {
            return true;
        }
        aVar.a();
        return true;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        T4(this.z, z && this.M);
        T4(this.u, z);
    }

    public final void setListener(a aVar) {
        this.N = aVar;
    }
}
