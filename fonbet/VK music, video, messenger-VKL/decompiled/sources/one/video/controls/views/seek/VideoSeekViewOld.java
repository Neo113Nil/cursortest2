package one.video.controls.views.seek;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import one.video.controls.models.UIPlayerSeek;
import one.video.controls.views.preview.VideoPreview;
import xsna.akw;
import xsna.an10;
import xsna.b0u0;
import xsna.c5g;
import xsna.dp2;
import xsna.epx;
import xsna.hpt0;
import xsna.iut0;
import xsna.j5g;
import xsna.lox;
import xsna.lui;
import xsna.mox;
import xsna.oqs0;
import xsna.ozl;
import xsna.swe0;
import xsna.zjq;
import xsna.zwo0;

/* compiled from: VideoSeekViewOld.kt */
@ozl
/* loaded from: classes8.dex */
public final class VideoSeekViewOld extends ConstraintLayout implements UIPlayerSeek {
    public static final /* synthetic */ int J = 0;
    public boolean A;
    public boolean B;
    public final Guideline C;
    public long D;
    public long E;
    public long F;
    public boolean G;
    public zwo0 H;
    public final one.video.controls.views.seek.a I;
    public final b t;
    public final lui u;
    public final VideoPreview v;
    public boolean w;
    public final TextView x;
    public final AppCompatSeekBar y;
    public final TextView z;

    /* compiled from: VideoSeekViewOld.kt */
    public static final class a {
        public static float a(View view, SeekBar seekBar) {
            Rect bounds;
            int paddingStart = seekBar.getPaddingStart();
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (!view.isLaidOut() || !view.isAttachedToWindow()) {
                return paddingStart;
            }
            Drawable thumb = seekBar.getThumb();
            int i = (thumb == null || (bounds = thumb.getBounds()) == null) ? 0 : bounds.left;
            int width = view.getWidth() / 2;
            if (view.getLeft() > 0) {
                width += view.getLeft();
            }
            return (view.getLeft() < 0 ? Math.abs(view.getLeft()) + paddingStart : paddingStart) > (view.getLeft() > 0 ? ((seekBar.getRight() - view.getRight()) - view.getLeft()) - paddingStart : ((seekBar.getRight() - seekBar.getPaddingEnd()) - view.getWidth()) - view.getLeft()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : swe0.g((i - width) + r3, r3, r6);
        }
    }

    /* compiled from: VideoSeekViewOld.kt */
    public final class b extends Property<Drawable, Integer> {
        @Override // android.util.Property
        public final Integer get(Drawable drawable) {
            return Integer.valueOf(drawable.getAlpha());
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, Integer num) {
            drawable.setAlpha(num.intValue());
        }
    }

    public VideoSeekViewOld(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.t = new b(Integer.TYPE, "thumbAlpha");
        lui luiVar = new lui();
        this.u = luiVar;
        this.D = -1L;
        this.E = -1L;
        LayoutInflater.from(context).inflate(R.layout.one_video_seek_view, (ViewGroup) this, true);
        setClipChildren(false);
        this.x = (TextView) findViewById(R.id.current_progress);
        this.z = (TextView) findViewById(R.id.preview_progress);
        this.v = (VideoPreview) findViewById(R.id.preview);
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) findViewById(R.id.seek_bar);
        this.y = appCompatSeekBar;
        this.C = (Guideline) findViewById(R.id.seek_bar_guideline_top);
        one.video.controls.views.seek.a aVar = new one.video.controls.views.seek.a(appCompatSeekBar, (TextView) findViewById(R.id.current_interval_title), (TextView) findViewById(R.id.interval_counter), (TextView) findViewById(R.id.preview_interval_title));
        this.I = aVar;
        LinkedHashSet linkedHashSet = luiVar.b;
        linkedHashSet.add(aVar);
        linkedHashSet.add(new one.video.controls.views.seek.b(this));
        appCompatSeekBar.setOnSeekBarChangeListener(luiVar);
        if (isInEditMode()) {
            setBackgroundColor(context.getColor(R.color.one_video_gray_old));
        }
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final void C3(long j, long j2) {
        if (this.w || j2 == 0) {
            return;
        }
        long j3 = 1000;
        long j4 = j2 / j3;
        if (getCurrentVideoDurationSeconds() != j4) {
            setCurrentVideoDurationSeconds(j4);
        }
        long j5 = j / j3;
        if (getVisibility() == 0) {
            this.y.setProgress((int) j5);
        }
        if (getPreviousPositionSeconds() == j5) {
            return;
        }
        this.D = j5;
        if (getVisibility() == 0) {
            P4(j5, j4);
        }
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final void H3(int i, ArrayList arrayList) {
        one.video.controls.views.seek.a aVar = this.I;
        AppCompatSeekBar appCompatSeekBar = aVar.b;
        if (epx.f(aVar.h, arrayList)) {
            return;
        }
        aVar.h = arrayList;
        if (arrayList.isEmpty()) {
            aVar.l(aVar.f);
            appCompatSeekBar.setProgressDrawable(aVar.g);
        } else {
            aVar.i = one.video.controls.views.seek.a.h(appCompatSeekBar.getProgress(), arrayList);
            AppCompatSeekBar appCompatSeekBar2 = aVar.b;
            int width = (appCompatSeekBar2.getWidth() - appCompatSeekBar2.getPaddingStart()) - appCompatSeekBar2.getPaddingEnd();
            TextView textView = aVar.e;
            if (width != textView.getMaxWidth()) {
                textView.setMaxWidth(width);
            }
            aVar.a();
            aVar.l((int) appCompatSeekBar.getContext().getResources().getDimension(R.dimen.one_video_seek_view_progress_height_expanded));
            Context context = appCompatSeekBar.getContext();
            float dimension = context.getResources().getDimension(R.dimen.one_video_seek_view_progress_height_collapsed);
            float dimension2 = context.getResources().getDimension(R.dimen.one_video_seek_view_progress_height_expanded);
            mox moxVar = new mox(new lox(dimension, dimension2, context.getColor(R.color.one_video_progress_background)), new lox(dimension, dimension2, context.getColor(R.color.one_video_secondary_progress)), new lox(dimension, dimension2, context.getColor(R.color.one_video_progress)), (int) context.getResources().getDimension(R.dimen.one_video_seek_view_progress_margin), (int) context.getResources().getDimension(R.dimen.one_video_seek_view_progress_min_width));
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Float.valueOf((float) Math.floor(10000 * (((oqs0) it.next()).a / i))));
            }
            if (!epx.d((Float) j5g.a0(arrayList2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
                arrayList2 = j5g.u0(arrayList2, Collections.singletonList(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
            }
            moxVar.d = arrayList2;
            moxVar.onBoundsChange(moxVar.getBounds());
            appCompatSeekBar.setProgressDrawable(moxVar);
        }
        aVar.g(false);
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final boolean K3() {
        return this.G;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final void O3(int i) {
        this.y.setSecondaryProgress(an10.b((i / 100.0f) * r0.getMax()));
    }

    public final void P4(long j, long j2) {
        long min = Math.min(j2, j);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) hpt0.k(min));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) " / ");
        spannableStringBuilder.append((CharSequence) hpt0.k(j2));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getContext().getColor(R.color.one_video_white_alpha60)), length, spannableStringBuilder.length(), 33);
        this.x.setText(new SpannedString(spannableStringBuilder));
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final void U1(UIPlayerSeek.c cVar) {
        boolean z = this.A;
        boolean z2 = cVar.a;
        if (z != z2) {
            this.A = z2;
            AppCompatSeekBar appCompatSeekBar = this.y;
            appCompatSeekBar.setEnabled(!z2);
            int i = 0;
            if (!z2 && cVar.b) {
                Drawable mutate = appCompatSeekBar.getThumb().mutate();
                if (!this.B && !z2) {
                    i = 255;
                }
                ObjectAnimator ofInt = ObjectAnimator.ofInt(mutate, this.t, i);
                ofInt.setDuration(300L);
                ofInt.start();
            } else {
                Drawable mutate2 = appCompatSeekBar.getThumb().mutate();
                if (!this.B && !z2) {
                    i = 255;
                }
                mutate2.setAlpha(i);
            }
            if (z2) {
                setAlpha(1.0f);
                dp2.b(this, null, 31);
            }
        }
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final void W1(UIPlayerSeek.a aVar) {
        boolean z = aVar.d;
        this.B = z;
        AppCompatSeekBar appCompatSeekBar = this.y;
        appCompatSeekBar.setEnabled(!z);
        appCompatSeekBar.getThumb().mutate().setAlpha(z ? 0 : 255);
        appCompatSeekBar.setVisibility(aVar.b ? 0 : 4);
        this.x.setVisibility(aVar.c ? 0 : 8);
    }

    public long getCurrentVideoDurationSeconds() {
        return this.E;
    }

    public long getCurrentVideoPosition() {
        return this.F;
    }

    public akw getImageLoader() {
        return this.v.getImageLoader();
    }

    public final VideoPreview getPreview() {
        return this.v;
    }

    public long getPreviousPositionSeconds() {
        return this.D;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public int getSeekBarHeight() {
        AppCompatSeekBar appCompatSeekBar = this.y;
        return appCompatSeekBar.getMeasuredHeight() > 0 ? appCompatSeekBar.getMeasuredHeight() : ((ConstraintLayout.b) this.C.getLayoutParams()).b;
    }

    public int getSeekBarTop() {
        return this.y.getTop() + getTop();
    }

    public zwo0 getTimelineThumbs() {
        return this.H;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        this.I.g(false);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        if (i == 0) {
            this.y.setProgress((int) getPreviousPositionSeconds());
            P4(getPreviousPositionSeconds(), getCurrentVideoDurationSeconds());
        }
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setButtonsClickListener(View.OnClickListener onClickListener) {
        one.video.controls.views.seek.a aVar = this.I;
        aVar.d.setOnClickListener(onClickListener);
        aVar.c.setOnClickListener(onClickListener);
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setCurrentVideoDurationSeconds(long j) {
        if (this.E == j) {
            return;
        }
        this.E = j;
        P4(getCurrentVideoPosition(), getCurrentVideoDurationSeconds());
        setDuration((int) getCurrentVideoDurationSeconds());
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setCurrentVideoPosition(long j) {
        if (this.F == j) {
            return;
        }
        this.F = j;
        P4(j, getCurrentVideoDurationSeconds());
    }

    public final void setDuration(int i) {
        this.y.setMax(i);
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setExtendSeekBarEnabled(boolean z) {
        this.G = z;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setImageLoader(akw akwVar) {
        if (akwVar == null) {
            akwVar = new zjq();
        }
        this.v.setImageLoader(akwVar);
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setIntervalsDisplayConfig(UIPlayerSeek.IntervalsDisplayConfig intervalsDisplayConfig) {
        one.video.controls.views.seek.a aVar = this.I;
        if (epx.f(aVar.k, intervalsDisplayConfig)) {
            return;
        }
        aVar.k = intervalsDisplayConfig;
        if (aVar.h.isEmpty()) {
            return;
        }
        aVar.a();
        aVar.g(false);
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setPreviewPlaceholder(Drawable drawable) {
        this.v.setPlaceholder(drawable);
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setTimelineThumbs(zwo0 zwo0Var) {
        this.H = zwo0Var;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final View W3(Context context) {
        return this;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public /* bridge */ /* synthetic */ void setExtendSeekBarListener(UIPlayerSeek.b bVar) {
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setSeekBarAlwaysVisible(boolean z) {
    }
}
