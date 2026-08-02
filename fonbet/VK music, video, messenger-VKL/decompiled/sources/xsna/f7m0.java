package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.airbnb.lottie.LottieAnimationView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.preference.Preference;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.stickers.api.styles.MusicStickerStyle;
import com.vk.stories.design.view.editor.SelectRangeWaveFormView;
import com.vk.stories.design.view.editor.StoryStylePickerView;
import com.vk.stories.design.view.stickers.music.MusicStickerStyleSwitchingView;
import com.vk.toggle.features.StoriesFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.h7u0;
import xsna.nim0;

/* compiled from: StoryMusicDialog.kt */
/* loaded from: classes16.dex */
public final class f7m0 extends tyl0<Object> implements d7m0 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final float y;
    public static final float z;
    public final float f;
    public final float g;
    public final boolean h;
    public SelectRangeWaveFormView i;
    public ProgressBar j;
    public ImageView k;
    public TextView l;
    public MusicStickerStyleSwitchingView m;
    public View n;
    public ImageView o;
    public View p;
    public View q;
    public View r;
    public LottieAnimationView s;
    public View t;
    public StoryStylePickerView u;
    public final wm80 v;
    public boolean w;
    public final n7m0 x;

    /* compiled from: StoryMusicDialog.kt */
    public static final class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            i0q0.i(5000L, new ixb0(1, f7m0.this.v));
        }
    }

    static {
        iah0.b(13.0f);
        y = iah0.b(6.0f);
        z = iah0.b(2.0f);
        A = iah0.a(8);
        B = iah0.a(4);
        C = iah0.a(48);
        D = iah0.a(12);
        E = iah0.a(68);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f7m0(Context context, kh6 kh6Var, MusicTrack musicTrack, c7m0 c7m0Var, v3l0 v3l0Var, float f, float f2) {
        super(r3.inflate(com.vk.toggle.b.A.a(r0) ? R.layout.story_music_dialog_redesign_with_style_tabs : R.layout.story_music_dialog_redesign, (ViewGroup) null), true, v3l0Var);
        LayoutInflater from = LayoutInflater.from(context);
        c7m0Var.getClass();
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_TAB_STYLE_PICKER;
        storiesFeatures.getClass();
        this.f = f;
        this.g = f2;
        this.h = false;
        this.v = new wm80(this, 24);
        n7m0 n7m0Var = new n7m0(this, kh6Var, c7m0Var, Float.valueOf(y));
        this.x = n7m0Var;
        if (musicTrack != null) {
            n7m0Var.e0(musicTrack);
        }
    }

    public static void i(View view, boolean z2) {
        bwt0.p0(view, !z2);
        if (z2) {
            xo2.d(29, 200L, view);
        } else {
            xo2.e(view, 200L, null, 13);
        }
    }

    @Override // xsna.d7m0
    public final void M5(MusicStickerStyle musicStickerStyle) {
        MusicStickerStyleSwitchingView musicStickerStyleSwitchingView = this.m;
        if (musicStickerStyleSwitchingView != null) {
            musicStickerStyleSwitchingView.setCurrentStyle(musicStickerStyle);
        }
    }

    @Override // xsna.d7m0
    public final void Sg(int i, int i2) {
        TextView textView = this.l;
        if (textView != null) {
            textView.setText(String.format(y8g0.e(R.string.dialog_duration_title), Arrays.copyOf(new Object[]{String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf((i2 - i) / 1000.0f)}, 1))}, 1)));
        }
    }

    @Override // xsna.d7m0
    public final void Vd(StoryMusicInfo storyMusicInfo) {
        MusicStickerStyleSwitchingView musicStickerStyleSwitchingView = this.m;
        if (musicStickerStyleSwitchingView != null) {
            i(musicStickerStyleSwitchingView, true);
        }
        MusicStickerStyleSwitchingView musicStickerStyleSwitchingView2 = this.m;
        if (musicStickerStyleSwitchingView2 != null) {
            musicStickerStyleSwitchingView2.setCurrentInfo(storyMusicInfo);
        }
    }

    @Override // xsna.d7m0
    public final void Xk(boolean z2) {
        SelectRangeWaveFormView selectRangeWaveFormView = this.i;
        if (selectRangeWaveFormView == null) {
            selectRangeWaveFormView = null;
        }
        selectRangeWaveFormView.setDarkBackground(z2);
    }

    @Override // xsna.d7m0
    public final void Z3() {
        int i;
        int i2;
        MusicStickerStyleSwitchingView musicStickerStyleSwitchingView = this.m;
        if (musicStickerStyleSwitchingView == null) {
            return;
        }
        List<MusicStickerStyle> availableStyles = musicStickerStyleSwitchingView.getAvailableStyles();
        int indexOf = availableStyles.indexOf(musicStickerStyleSwitchingView.getCurrentStyle());
        StoryStylePickerView storyStylePickerView = this.u;
        if (storyStylePickerView != null) {
            List<MusicStickerStyle> list = availableStyles;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (MusicStickerStyle musicStickerStyle : list) {
                int[] iArr = nim0.a.$EnumSwitchMapping$4;
                int i3 = iArr[musicStickerStyle.ordinal()];
                if (i3 == 1) {
                    i = R.drawable.vk_icon_horizontal_rectangle_16x9_outline_20;
                } else if (i3 == 2) {
                    i = R.drawable.vk_icon_square_outline_24;
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.drawable.vk_icon_music_note_wave_outline_24;
                }
                Integer valueOf = Integer.valueOf(i);
                int i4 = iArr[musicStickerStyle.ordinal()];
                if (i4 == 1) {
                    i2 = R.string.sticker_music_redesign_horizonal_tab_description;
                } else if (i4 == 2) {
                    i2 = R.string.sticker_music_redesign_album_tab_description;
                } else {
                    if (i4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = R.string.sticker_music_redesign_only_music_tab_description;
                }
                arrayList.add(new mim0(valueOf, Integer.valueOf(i2)));
            }
            storyStylePickerView.a(indexOf, arrayList, new z6f0(this, 15));
        }
        StoryStylePickerView storyStylePickerView2 = this.u;
        if (storyStylePickerView2 != null) {
            storyStylePickerView2.setVisibility(0);
        }
    }

    @Override // xsna.tyl0
    public final void b(ViewGroup viewGroup) {
        this.i = (SelectRangeWaveFormView) viewGroup.findViewById(R.id.story_music_dialog_range_waveform);
        this.j = (ProgressBar) viewGroup.findViewById(R.id.story_music_progress_bar);
        this.k = (ImageView) viewGroup.findViewById(R.id.story_music_track_play_image);
        this.l = (TextView) viewGroup.findViewById(R.id.story_music_dialog_timeline_range);
        View findViewById = viewGroup.findViewById(R.id.story_music_dialog_layout);
        View view = null;
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        } else {
            findViewById = null;
        }
        this.n = findViewById;
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.story_music_track_close);
        if (imageView != null) {
            bwt0.h0(this, imageView);
        } else {
            imageView = null;
        }
        this.o = imageView;
        View findViewById2 = viewGroup.findViewById(R.id.story_music_dialog_root);
        if (findViewById2 != null) {
            StoriesFeatures storiesFeatures = StoriesFeatures.ST_TAB_STYLE_PICKER;
            storiesFeatures.getClass();
            if (!com.vk.toggle.b.A.a(storiesFeatures)) {
                bwt0.h0(this, findViewById2);
            }
        }
        MusicStickerStyleSwitchingView musicStickerStyleSwitchingView = (MusicStickerStyleSwitchingView) viewGroup.findViewById(R.id.music_sticker);
        if (musicStickerStyleSwitchingView != null) {
            musicStickerStyleSwitchingView.setPreloadStyles(true);
            StoriesFeatures storiesFeatures2 = StoriesFeatures.ST_TAB_STYLE_PICKER;
            storiesFeatures2.getClass();
            if (!com.vk.toggle.b.A.a(storiesFeatures2)) {
                bwt0.h0(this, musicStickerStyleSwitchingView);
            }
            musicStickerStyleSwitchingView.setImportantForAccessibility(1);
        } else {
            musicStickerStyleSwitchingView = null;
        }
        this.m = musicStickerStyleSwitchingView;
        View findViewById3 = viewGroup.findViewById(R.id.btn_change_track);
        if (findViewById3 != null) {
            bwt0.p0(findViewById3, false);
            bwt0.h0(this, findViewById3);
        } else {
            findViewById3 = null;
        }
        this.p = findViewById3;
        View findViewById4 = viewGroup.findViewById(R.id.btn_delete_track);
        if (findViewById4 != null) {
            bwt0.p0(findViewById4, false);
            bwt0.h0(this, findViewById4);
        } else {
            findViewById4 = null;
        }
        this.q = findViewById4;
        View findViewById5 = viewGroup.findViewById(R.id.onboarding);
        if (findViewById5 != null) {
            bwt0.p0(findViewById5, !Preference.e(0L, "story_common_control_tips_pref").getBoolean("music_sticker_onboarding_shown", false));
            view = findViewById5;
        }
        this.r = view;
        this.s = (LottieAnimationView) viewGroup.findViewById(R.id.onboarding_animation);
        this.t = viewGroup.findViewById(R.id.bottom_buttons);
        this.u = (StoryStylePickerView) viewGroup.findViewById(R.id.music_style_picker);
    }

    public final void f() {
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_TAB_STYLE_PICKER;
        storiesFeatures.getClass();
        if (com.vk.toggle.b.A.a(storiesFeatures)) {
            return;
        }
        boolean z2 = this.w;
        int i = A;
        float f = this.f;
        if (!z2) {
            int i2 = ((int) f) + i;
            SelectRangeWaveFormView selectRangeWaveFormView = this.i;
            if (selectRangeWaveFormView == null) {
                selectRangeWaveFormView = null;
            }
            f4m.q(i2, selectRangeWaveFormView);
            ProgressBar progressBar = this.j;
            f4m.q(i2, progressBar != null ? progressBar : null);
            return;
        }
        float f2 = E;
        int i3 = C;
        if (f < f2) {
            int i4 = ((int) f) + D;
            View view = this.t;
            if (view != null) {
                f4m.q(i4, view);
            }
            int i5 = i4 + i3 + i;
            SelectRangeWaveFormView selectRangeWaveFormView2 = this.i;
            if (selectRangeWaveFormView2 == null) {
                selectRangeWaveFormView2 = null;
            }
            f4m.q(i5, selectRangeWaveFormView2);
            ProgressBar progressBar2 = this.j;
            f4m.q(i5, progressBar2 != null ? progressBar2 : null);
            return;
        }
        float f3 = f - i3;
        View view2 = this.t;
        if (view2 != null) {
            float f4 = 2;
            f4m.q((int) ((f3 / f4) + f4), view2);
        }
        int i6 = ((int) f) + i;
        SelectRangeWaveFormView selectRangeWaveFormView3 = this.i;
        if (selectRangeWaveFormView3 == null) {
            selectRangeWaveFormView3 = null;
        }
        f4m.q(i6, selectRangeWaveFormView3);
        ProgressBar progressBar3 = this.j;
        f4m.q(i6, progressBar3 != null ? progressBar3 : null);
    }

    @Override // xsna.d7m0
    public final void f2(boolean z2) {
        ProgressBar progressBar = this.j;
        if (progressBar == null) {
            progressBar = null;
        }
        if (bwt0.K(progressBar) == z2) {
            return;
        }
        ProgressBar progressBar2 = this.j;
        if (progressBar2 == null) {
            progressBar2 = null;
        }
        progressBar2.setAlpha(z2 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
        ProgressBar progressBar3 = this.j;
        if (progressBar3 == null) {
            progressBar3 = null;
        }
        bwt0.p0(progressBar3, z2);
        ProgressBar progressBar4 = this.j;
        i(progressBar4 != null ? progressBar4 : null, z2);
    }

    @Override // xsna.d7m0
    public final void f9() {
        SelectRangeWaveFormView selectRangeWaveFormView = this.i;
        if (selectRangeWaveFormView == null) {
            selectRangeWaveFormView = null;
        }
        selectRangeWaveFormView.setMinSelectorWidth(null);
    }

    @Override // xsna.d7m0
    public final void fb(boolean z2) {
        this.w = z2;
        View view = this.q;
        if (view != null) {
            bwt0.p0(view, z2);
        }
        View view2 = this.p;
        if (view2 != null) {
            bwt0.p0(view2, z2);
        }
        if (this.h) {
            return;
        }
        f();
    }

    @Override // xsna.dc6
    public final cc6 getPresenter() {
        return this.x;
    }

    @Override // xsna.d7m0
    public final void gn(int i) {
        SelectRangeWaveFormView selectRangeWaveFormView = this.i;
        if (selectRangeWaveFormView == null) {
            selectRangeWaveFormView = null;
        }
        selectRangeWaveFormView.s(i);
    }

    public final void h() {
        n7m0 n7m0Var;
        StoriesFeatures storiesFeatures = StoriesFeatures.ST_TAB_STYLE_PICKER;
        storiesFeatures.getClass();
        if (com.vk.toggle.b.A.a(storiesFeatures)) {
            return;
        }
        View view = this.r;
        if (view != null && bwt0.K(view)) {
            View view2 = this.r;
            if (view2 != null) {
                bwt0.p0(view2, false);
            }
            LottieAnimationView lottieAnimationView = this.s;
            if (lottieAnimationView != null) {
                lottieAnimationView.W();
            }
            LottieAnimationView lottieAnimationView2 = this.s;
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.removeCallbacks(new z27(this.v, 12));
            }
            qaj0.c(Preference.e(0L, "story_common_control_tips_pref"), "music_sticker_onboarding_shown", Boolean.TRUE);
        }
        MusicStickerStyleSwitchingView musicStickerStyleSwitchingView = this.m;
        if (musicStickerStyleSwitchingView != null) {
            MusicStickerStyle musicStickerStyle = musicStickerStyleSwitchingView.f.get((musicStickerStyleSwitchingView.f.indexOf(musicStickerStyleSwitchingView.g) + 1) % musicStickerStyleSwitchingView.f.size());
            musicStickerStyleSwitchingView.setCurrentStyle(musicStickerStyle);
            if (musicStickerStyle == null || (n7m0Var = this.x) == null) {
                return;
            }
            n7m0Var.w = musicStickerStyle;
        }
    }

    @Override // xsna.d7m0
    public final void h1() {
        Toast toast = new Toast(getContext());
        toast.setGravity(49, 0, iah0.a(16));
        toast.setView(getLayoutInflater().inflate(R.layout.music_recommended_time_toast, (ViewGroup) null));
        toast.setDuration(0);
        toast.show();
    }

    @Override // xsna.d7m0
    public final void j4() {
        StoryStylePickerView storyStylePickerView = this.u;
        if (storyStylePickerView != null) {
            storyStylePickerView.setVisibility(8);
        }
        View view = this.q;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.p;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    @Override // xsna.d7m0
    public final void ja(int i) {
        SelectRangeWaveFormView selectRangeWaveFormView = this.i;
        if (selectRangeWaveFormView == null) {
            selectRangeWaveFormView = null;
        }
        selectRangeWaveFormView.setRecommendedTime(i);
    }

    @Override // xsna.d7m0
    public final void l3(boolean z2) {
        if (this.h) {
            SelectRangeWaveFormView selectRangeWaveFormView = this.i;
            if (selectRangeWaveFormView == null) {
                selectRangeWaveFormView = null;
            }
            selectRangeWaveFormView.c = z2;
            selectRangeWaveFormView.d = z2;
            selectRangeWaveFormView.invalidate();
        }
    }

    @Override // xsna.d7m0
    public final void mg(boolean z2) {
        ImageView imageView = this.k;
        if (imageView != null) {
            i(imageView, z2);
        }
    }

    @Override // xsna.d7m0
    public final void ml(boolean z2) {
        if (this.h) {
            SelectRangeWaveFormView selectRangeWaveFormView = this.i;
            if (selectRangeWaveFormView == null) {
                selectRangeWaveFormView = null;
            }
            selectRangeWaveFormView.setWithRecommendedTime(z2);
        }
    }

    @Override // xsna.d7m0
    public final void ng(boolean z2) {
        SelectRangeWaveFormView selectRangeWaveFormView = this.i;
        if (selectRangeWaveFormView == null) {
            selectRangeWaveFormView = null;
        }
        selectRangeWaveFormView.setWithBoundsOffset(z2);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        n7m0 n7m0Var = this.x;
        if (n7m0Var != null) {
            n7m0Var.o();
        }
    }

    @Override // xsna.tyl0, android.view.View.OnClickListener
    public final void onClick(View view) {
        super.onClick(view);
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        n7m0 n7m0Var = this.x;
        if (valueOf != null && valueOf.intValue() == R.id.story_music_track_close) {
            if (n7m0Var != null) {
                n7m0Var.o();
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.story_music_dialog_root) {
            h();
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.story_music_dialog_layout) {
            if (n7m0Var != null) {
                c7m0 c7m0Var = n7m0Var.e;
                if (n7m0Var.n) {
                    c7m0Var.e();
                } else {
                    c7m0Var.h();
                }
                n7m0Var.n = !n7m0Var.n;
                return;
            }
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.music_sticker) {
            h();
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.btn_change_track) {
            if (n7m0Var != null) {
                n7m0Var.d.a();
            }
        } else if (valueOf != null && valueOf.intValue() == R.id.btn_delete_track) {
            h7u0.a c = new or1(getContext()).c();
            c.g0(R.string.story_music_delete_alert_title);
            c.U(R.string.story_music_delete_alert_message);
            c.W(R.string.cancel, new sq80(1));
            c.c0(R.string.delete, new p1j(this, 1));
            c.m();
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        if (!this.h) {
            Window window = getWindow();
            if (window != null) {
                window.setStatusBarColor(-16777216);
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.clearFlags(1024);
            }
            MusicStickerStyleSwitchingView musicStickerStyleSwitchingView = this.m;
            if (musicStickerStyleSwitchingView != null) {
                musicStickerStyleSwitchingView.setAnimateChanges(true);
            }
            MusicStickerStyleSwitchingView musicStickerStyleSwitchingView2 = this.m;
            if (musicStickerStyleSwitchingView2 != null) {
                musicStickerStyleSwitchingView2.setAvailableStyles(e43.l(MusicStickerStyle.Horizontal, MusicStickerStyle.Album, MusicStickerStyle.HeaderMeta));
            }
            SelectRangeWaveFormView selectRangeWaveFormView = this.i;
            if (selectRangeWaveFormView == null) {
                selectRangeWaveFormView = null;
            }
            l7s u = bwt0.u(selectRangeWaveFormView.getContext());
            e3m.a aVar = e3m.a;
            int color = u.getColor(R.color.vk_black_alpha45);
            selectRangeWaveFormView.s = Integer.valueOf(color);
            selectRangeWaveFormView.y.setColor(color);
            selectRangeWaveFormView.invalidate();
            selectRangeWaveFormView.c = true;
            selectRangeWaveFormView.d = false;
            selectRangeWaveFormView.invalidate();
            selectRangeWaveFormView.setWithRecommendedTime(true);
            selectRangeWaveFormView.setDrawRecommendedTimeBubble(false);
            selectRangeWaveFormView.setLinesWidth(z);
            selectRangeWaveFormView.setLinesSpace(y);
            int f = e3m.f(R.attr.vk_ui_text_primary, u);
            TextPaint textPaint = selectRangeWaveFormView.A;
            textPaint.setColor(f);
            textPaint.setAlpha(153);
            selectRangeWaveFormView.invalidate();
            Paint paint = selectRangeWaveFormView.v;
            paint.setColor(-1);
            paint.setAlpha(50);
            selectRangeWaveFormView.invalidate();
            Paint paint2 = selectRangeWaveFormView.u;
            paint2.setColor(-1);
            paint2.setAlpha(50);
            selectRangeWaveFormView.invalidate();
            selectRangeWaveFormView.setIsOffsetTimeMarks(false);
            selectRangeWaveFormView.setPerformHapticFeedback(true);
            selectRangeWaveFormView.setActiveLineColor(e3m.f(R.attr.vk_ui_background_contrast, u));
            selectRangeWaveFormView.setBoundsColor(e3m.f(R.attr.vk_ui_icon_accent, u));
            StoriesFeatures storiesFeatures = StoriesFeatures.ST_TAB_STYLE_PICKER;
            storiesFeatures.getClass();
            if (!com.vk.toggle.b.A.a(storiesFeatures)) {
                int i = ((int) this.g) + B;
                ImageView imageView = this.o;
                if (imageView != null) {
                    f4m.t(i, imageView);
                }
                f4m.t(i, this.e);
            }
            f();
        }
        SelectRangeWaveFormView selectRangeWaveFormView2 = this.i;
        (selectRangeWaveFormView2 != null ? selectRangeWaveFormView2 : null).setListener(this.x);
        LottieAnimationView lottieAnimationView = this.s;
        if (lottieAnimationView != null) {
            lottieAnimationView.U(new a());
        }
        this.v.invoke();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        i0q0.g(new hv2(this.v, 13));
        LottieAnimationView lottieAnimationView = this.s;
        if (lottieAnimationView != null) {
            lottieAnimationView.o0();
        }
    }

    @Override // xsna.d7m0
    public final void qj(byte[] bArr) {
        SelectRangeWaveFormView selectRangeWaveFormView = this.i;
        if (selectRangeWaveFormView == null) {
            selectRangeWaveFormView = null;
        }
        selectRangeWaveFormView.setWaveForm(bArr);
    }

    @Override // xsna.d7m0
    public final void r6(boolean z2) {
        SelectRangeWaveFormView selectRangeWaveFormView = this.i;
        if (selectRangeWaveFormView == null) {
            selectRangeWaveFormView = null;
        }
        if (bwt0.K(selectRangeWaveFormView) == z2) {
            return;
        }
        SelectRangeWaveFormView selectRangeWaveFormView2 = this.i;
        if (selectRangeWaveFormView2 == null) {
            selectRangeWaveFormView2 = null;
        }
        selectRangeWaveFormView2.setAlpha(z2 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : 1.0f);
        SelectRangeWaveFormView selectRangeWaveFormView3 = this.i;
        if (selectRangeWaveFormView3 == null) {
            selectRangeWaveFormView3 = null;
        }
        bwt0.p0(selectRangeWaveFormView3, z2);
        SelectRangeWaveFormView selectRangeWaveFormView4 = this.i;
        i(selectRangeWaveFormView4 != null ? selectRangeWaveFormView4 : null, z2);
    }

    @Override // xsna.d7m0
    public final void setActive(boolean z2) {
        if (z2) {
            ImageView imageView = this.o;
            if (imageView != null) {
                imageView.setEnabled(true);
            }
            ImageView imageView2 = this.o;
            if (imageView2 != null) {
                imageView2.setAlpha(1.0f);
                return;
            }
            return;
        }
        MusicStickerStyleSwitchingView musicStickerStyleSwitchingView = this.m;
        if (musicStickerStyleSwitchingView != null) {
            musicStickerStyleSwitchingView.setCurrentInfo(null);
        }
        MusicStickerStyleSwitchingView musicStickerStyleSwitchingView2 = this.m;
        if (musicStickerStyleSwitchingView2 != null) {
            bwt0.p0(musicStickerStyleSwitchingView2, false);
        }
        jb(false);
        ImageView imageView3 = this.o;
        if (imageView3 != null) {
            imageView3.setEnabled(false);
        }
        ImageView imageView4 = this.o;
        if (imageView4 != null) {
            imageView4.setAlpha(0.5f);
        }
    }

    @Override // xsna.d7m0
    public final void sl(int i, int i2) {
        TextView textView = this.l;
        if (textView != null) {
            textView.setText(String.format(y8g0.e(R.string.dialog_duration_title), Arrays.copyOf(new Object[]{String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf((i2 - i) / 1000.0f)}, 1))}, 1)));
        }
    }

    @Override // xsna.d7m0
    public final void u6() {
        SelectRangeWaveFormView selectRangeWaveFormView = this.i;
        if (selectRangeWaveFormView == null) {
            selectRangeWaveFormView = null;
        }
        selectRangeWaveFormView.setMaxSelectorWidth(null);
    }

    @Override // xsna.d7m0
    public final void u7(int i, int i2, int i3) {
        SelectRangeWaveFormView selectRangeWaveFormView = this.i;
        if (selectRangeWaveFormView == null) {
            selectRangeWaveFormView = null;
        }
        selectRangeWaveFormView.q(i, i2, i3);
        TextView textView = this.l;
        if (textView != null) {
            textView.setText(String.format(y8g0.e(R.string.dialog_duration_title), Arrays.copyOf(new Object[]{String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf((i3 - i2) / 1000.0f)}, 1))}, 1)));
        }
    }

    @Override // xsna.d7m0
    public final void uh() {
        SelectRangeWaveFormView selectRangeWaveFormView = this.i;
        if (selectRangeWaveFormView == null) {
            selectRangeWaveFormView = null;
        }
        float[] fArr = selectRangeWaveFormView.J;
        selectRangeWaveFormView.N = fArr[0] - selectRangeWaveFormView.k;
        Float Q = rl3.Q(fArr.length - 2, fArr);
        selectRangeWaveFormView.O = (Q != null ? Q.floatValue() : selectRangeWaveFormView.N) + selectRangeWaveFormView.k;
        selectRangeWaveFormView.u();
        selectRangeWaveFormView.invalidate();
    }

    @Override // xsna.d7m0
    public final void w5(int i, int i2) {
        SelectRangeWaveFormView selectRangeWaveFormView = this.i;
        if (selectRangeWaveFormView == null) {
            selectRangeWaveFormView = null;
        }
        selectRangeWaveFormView.r(i, i2);
    }
}
