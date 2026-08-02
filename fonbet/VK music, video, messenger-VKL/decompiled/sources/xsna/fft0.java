package xsna;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import one.video.controls.models.UIPlayerSeek;
import one.video.controls.views.VideoButtonsView;
import one.video.controls.views.seek.extend.ExtendSeekBarView;

/* compiled from: VideoSeekViewNew.kt */
@ozl
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes8.dex */
public final class fft0 extends FrameLayout implements UIPlayerSeek {
    public boolean A;
    public long B;
    public View C;
    public final Drawable D;
    public final Drawable E;
    public final float F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public UIPlayerSeek.b N;
    public UIPlayerSeek.IntervalsDisplayConfig O;
    public int P;
    public float Q;
    public ValueAnimator R;
    public boolean S;
    public float T;
    public long b;
    public long c;
    public zwo0 d;
    public long e;
    public final int f;
    public boolean g;
    public ywp0 h;
    public final VideoButtonsView i;
    public final TextView j;
    public final TextView k;
    public final AppCompatSeekBar l;
    public final AppCompatSeekBar m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final ConstraintLayout s;
    public final ExtendSeekBarView t;
    public final ImageView u;
    public final TextView v;
    public final c w;
    public final b x;
    public List<oqs0> y;
    public UIPlayerSeek.a z;

    /* compiled from: VideoSeekViewNew.kt */
    public final class a implements ExtendSeekBarView.a {
        public a() {
        }

        @Override // one.video.controls.views.seek.extend.ExtendSeekBarView.a
        public final void a(long j) {
            fft0 fft0Var = fft0.this;
            int i = (int) j;
            fft0Var.m.setProgress(i);
            fft0Var.l.setProgress(i);
        }

        @Override // one.video.controls.views.seek.extend.ExtendSeekBarView.a
        public final void b() {
            fft0 fft0Var = fft0.this;
            fft0Var.x.onStopTrackingTouch(fft0Var.m);
        }
    }

    /* compiled from: VideoSeekViewNew.kt */
    public final class b implements SeekBar.OnSeekBarChangeListener {
        public int b = -1;

        public b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int i2;
            fft0 fft0Var = fft0.this;
            AppCompatSeekBar appCompatSeekBar = fft0Var.m;
            ywp0 controlsListener = fft0Var.getControlsListener();
            if (controlsListener != null) {
                controlsListener.onProgressChanged(seekBar, i, z);
            }
            long j = i;
            fft0Var.g(j, fft0Var.getCurrentVideoDurationSeconds());
            fft0Var.e = j;
            fft0Var.q.setText(hpt0.k(j));
            if (fft0Var.g) {
                fft0Var.t.setPositionS(i);
            }
            if (fft0Var.y.isEmpty()) {
                return;
            }
            int i3 = this.b;
            List<oqs0> list = fft0Var.y;
            Integer valueOf = Integer.valueOf(i);
            int size = list.size();
            e43.q(list.size(), size);
            int i4 = size - 1;
            int i5 = 0;
            while (true) {
                if (i5 > i4) {
                    i2 = -(i5 + 1);
                    break;
                }
                i2 = (i5 + i4) >>> 1;
                int b = jw5.b(Integer.valueOf((int) list.get(i2).a), valueOf);
                if (b >= 0) {
                    if (b <= 0) {
                        break;
                    } else {
                        i4 = i2 - 1;
                    }
                } else {
                    i5 = i2 + 1;
                }
            }
            if (i2 < 0) {
                i2 = (-i2) - 2;
            }
            this.b = i2;
            if (i3 != i2) {
                oqs0 oqs0Var = (oqs0) j5g.b0(i2, fft0Var.y);
                fft0Var.r.setText(oqs0Var != null ? oqs0Var.b : null);
                if (z && appCompatSeekBar.isHapticFeedbackEnabled()) {
                    appCompatSeekBar.performHapticFeedback(11);
                }
                if (oqs0Var != null) {
                    fft0Var.j.setText(fft0Var.c(oqs0Var));
                    fft0Var.k.setText((this.b + 1) + DomExceptionUtils.SEPARATOR + fft0Var.y.size());
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            fft0 fft0Var = fft0.this;
            ywp0 controlsListener = fft0Var.getControlsListener();
            if (controlsListener != null) {
                controlsListener.onStartTrackingTouch(seekBar);
            }
            fft0Var.m.setThumb(fft0Var.E);
            if (fft0Var.T > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            fft0.b(fft0Var, true);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            fft0 fft0Var = fft0.this;
            AppCompatSeekBar appCompatSeekBar = fft0Var.m;
            if (fft0Var.R != null) {
                return;
            }
            ywp0 controlsListener = fft0Var.getControlsListener();
            if (controlsListener != null) {
                controlsListener.onStopTrackingTouch(seekBar);
            }
            appCompatSeekBar.setThumb(fft0Var.D);
            fft0Var.l.setProgress(appCompatSeekBar.getProgress());
            if (fft0Var.T > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            fft0.b(fft0Var, false);
        }
    }

    /* compiled from: VideoSeekViewNew.kt */
    public final class c implements View.OnTouchListener {
        public float b;
        public float c;
        public boolean d;
        public boolean e;

        public c() {
        }

        public final void a(boolean z) {
            if (!this.e && z) {
                fft0 fft0Var = fft0.this;
                fft0Var.performHapticFeedback(0);
                fft0Var.B = fft0Var.l.getProgress();
            }
            this.e = z;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            float f;
            if (this.d) {
                motionEvent = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), this.c, motionEvent.getY(), motionEvent.getMetaState());
                z = true;
            } else {
                z = false;
            }
            this.c = motionEvent.getX();
            fft0 fft0Var = fft0.this;
            fft0Var.m.onTouchEvent(motionEvent);
            if (fft0Var.getHasExtendSeekBarView()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.b = motionEvent.getY();
                    a(false);
                    this.d = false;
                } else if (action == 1) {
                    if (fft0Var.S) {
                        fft0Var.d(1.0f, true);
                    } else {
                        fft0Var.p1(true);
                    }
                    this.d = false;
                } else if (action == 2 && !this.e) {
                    View view2 = fft0Var.C;
                    float f2 = fft0Var.F;
                    if (epx.f(view, view2)) {
                        f = 0.0f;
                    } else {
                        f = (fft0Var.S ? 1 - fft0Var.T : -fft0Var.T) * f2;
                    }
                    float y = (motionEvent.getY() - this.b) + f;
                    if (fft0Var.S) {
                        float f3 = f2 / 2;
                        if (y <= f3) {
                            this.d = false;
                            fft0Var.e(1.0f);
                        } else if (y <= f2) {
                            fft0Var.e(swe0.f(1.0f - ((y - f3) / f3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
                            this.d = true;
                        } else {
                            fft0Var.S = false;
                            a(true);
                            fft0Var.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                    } else {
                        float f4 = f2 / 2;
                        if (y >= (-f4)) {
                            this.d = false;
                            fft0Var.e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        } else if (y >= (-f2)) {
                            float f5 = swe0.f((-(y + f4)) / f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            this.d = true;
                            fft0Var.e(f5);
                        } else {
                            fft0Var.S = true;
                            a(true);
                            fft0Var.e(1.0f);
                        }
                    }
                }
            }
            if (z) {
                motionEvent.recycle();
            }
            return true;
        }
    }

    static {
        x5r0.a(12, 1);
    }

    public fft0(Context context) {
        super(context, null, 0);
        this.b = -1L;
        this.c = -1L;
        this.e = -1L;
        this.f = (int) getResources().getDimension(R.dimen.one_video_new_seek_height);
        c cVar = new c();
        this.w = cVar;
        b bVar = new b();
        this.x = bVar;
        a aVar = new a();
        this.y = EmptyList.b;
        this.B = -1L;
        this.D = m33.a(R.drawable.one_video_new_seek_view_thumb_inactive, context);
        this.E = m33.a(R.drawable.one_video_new_seek_view_thumb_active, context);
        this.F = getResources().getDimension(R.dimen.one_video_extend_seek_height);
        this.G = (int) getResources().getDimension(R.dimen.one_video_new_seek_thumb_padding);
        this.H = (int) getResources().getDimension(R.dimen.one_video_new_seek_fullscreen_margin);
        this.I = (int) getResources().getDimension(R.dimen.one_video_new_seek_buttons_margin);
        this.J = (int) getResources().getDimension(R.dimen.one_video_button_size);
        this.K = (int) getResources().getDimension(R.dimen.one_video_button_size_new);
        this.L = (int) getResources().getDimension(R.dimen.one_video_button_size_new_fullscreen);
        this.M = (int) getResources().getDimension(R.dimen.one_video_new_seek_thumb_height);
        this.O = new UIPlayerSeek.IntervalsDisplayConfig(new UIPlayerSeek.IntervalsDisplayConfig.a(6), 3);
        LayoutInflater.from(context).inflate(R.layout.one_video_seek_view_new, (ViewGroup) this, true);
        this.i = (VideoButtonsView) findViewById(R.id.video_buttons_view);
        AppCompatSeekBar appCompatSeekBar = (AppCompatSeekBar) findViewById(R.id.seek_bar_progress);
        appCompatSeekBar.setOnTouchListener(cVar);
        appCompatSeekBar.setPadding(0, 0, 0, 0);
        this.l = appCompatSeekBar;
        AppCompatSeekBar appCompatSeekBar2 = (AppCompatSeekBar) findViewById(R.id.seek_bar_thumb);
        appCompatSeekBar2.setOnTouchListener(cVar);
        appCompatSeekBar2.setOnSeekBarChangeListener(bVar);
        appCompatSeekBar2.setPadding(0, 0, 0, 0);
        this.m = appCompatSeekBar2;
        this.n = (TextView) findViewById(R.id.position);
        this.o = (TextView) findViewById(R.id.slash);
        this.p = (TextView) findViewById(R.id.duration);
        this.q = (TextView) findViewById(R.id.seek_time);
        this.r = (TextView) findViewById(R.id.seek_episode_title);
        this.j = (TextView) findViewById(R.id.current_interval_title);
        this.k = (TextView) findViewById(R.id.interval_counter);
        this.s = (ConstraintLayout) findViewById(R.id.views_container);
        ExtendSeekBarView extendSeekBarView = (ExtendSeekBarView) findViewById(R.id.extend_seek_bar);
        extendSeekBarView.setListener(aVar);
        this.t = extendSeekBarView;
        ImageView imageView = (ImageView) findViewById(R.id.cancel_extend_seek);
        imageView.setOnClickListener(new en9(this, 11));
        this.u = imageView;
        this.v = (TextView) findViewById(R.id.extend_seek_bar_hint);
        f(true);
        this.P = 8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        if (r2.a == true) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(fft0 fft0Var, boolean z) {
        boolean z2;
        ListBuilder e = e43.e();
        if (fft0Var.g) {
            e.add(fft0Var.v);
        }
        e.add(fft0Var.q);
        if (!fft0Var.y.isEmpty()) {
            e.add(fft0Var.r);
        }
        ListBuilder g = e.g();
        ListBuilder e2 = e43.e();
        e2.add(fft0Var.i);
        e2.add(fft0Var.n);
        e2.add(fft0Var.o);
        e2.add(fft0Var.p);
        UIPlayerSeek.a aVar = fft0Var.z;
        if (aVar != null) {
            z2 = true;
        }
        z2 = false;
        if (fft0Var.O.b.contains(z2 ? UIPlayerSeek.IntervalsDisplayConfig.Orientation.LANDSCAPE : UIPlayerSeek.IntervalsDisplayConfig.Orientation.PORTRAIT) && !fft0Var.y.isEmpty()) {
            e2.add(fft0Var.j);
            if (fft0Var.O.a) {
                e2.add(fft0Var.k);
            }
        }
        ListBuilder g2 = e2.g();
        ListIterator listIterator = g.listIterator(0);
        while (true) {
            ListBuilder.a aVar2 = (ListBuilder.a) listIterator;
            if (!aVar2.hasNext()) {
                break;
            }
            TextView textView = (TextView) aVar2.next();
            if (z) {
                dp2.b(textView, null, 31);
            } else {
                dp2.c(textView, null, false, 31);
            }
        }
        ListIterator listIterator2 = g2.listIterator(0);
        while (true) {
            ListBuilder.a aVar3 = (ListBuilder.a) listIterator2;
            if (!aVar3.hasNext()) {
                return;
            }
            View view = (View) aVar3.next();
            if (z) {
                dp2.c(view, null, false, 31);
            } else {
                dp2.b(view, null, 31);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasExtendSeekBarView() {
        return this.g && getTimelineThumbs() != null;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final void C3(long j, long j2) {
        if (j2 <= 0) {
            return;
        }
        setCurrentVideoDurationSeconds(j2 / 1000);
        setCurrentVideoPosition(swe0.i(an10.c(j / 1000.0f), 0L, getCurrentVideoDurationSeconds()));
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final void H3(int i, ArrayList arrayList) {
        if (epx.f(this.y, arrayList)) {
            return;
        }
        this.y = arrayList;
        float seekBarHeight = getSeekBarHeight();
        mox moxVar = new mox(new lox(seekBarHeight, seekBarHeight, getContext().getColor(R.color.one_video_progress_background)), new lox(seekBarHeight, seekBarHeight, getContext().getColor(R.color.one_video_secondary_progress)), new lox(seekBarHeight, seekBarHeight, getContext().getColor(R.color.one_video_progress)), (int) getContext().getResources().getDimension(R.dimen.one_video_seek_view_progress_margin), (int) getContext().getResources().getDimension(R.dimen.one_video_seek_view_progress_min_width));
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
        this.l.setProgressDrawable(moxVar);
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final boolean K3() {
        return this.g;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final void O3(int i) {
        this.l.setSecondaryProgress((int) ((i / 100.0f) * r0.getMax()));
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final void W1(UIPlayerSeek.a aVar) {
        boolean z = aVar.c;
        this.z = aVar;
        boolean z2 = this.O.b.contains(aVar.a ? UIPlayerSeek.IntervalsDisplayConfig.Orientation.LANDSCAPE : UIPlayerSeek.IntervalsDisplayConfig.Orientation.PORTRAIT) && !this.y.isEmpty();
        this.j.setVisibility(z2 ? 0 : 8);
        this.k.setVisibility((z2 && this.O.a) ? 0 : 8);
        this.n.setVisibility(z ? 0 : 8);
        this.o.setVisibility(z ? 0 : 8);
        this.p.setVisibility(z ? 0 : 8);
        setVisibility(getVisibility());
    }

    public final SpannedString c(oqs0 oqs0Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        UIPlayerSeek.IntervalsDisplayConfig.a aVar = this.O.c;
        int i = aVar.b;
        if (i > 0) {
            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
            newSpannable.setSpan(new hft0(i), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) newSpannable);
        }
        spannableStringBuilder.append((CharSequence) this.O.c.a);
        int i2 = aVar.c;
        if (i2 > 0) {
            Spannable newSpannable2 = Spannable.Factory.getInstance().newSpannable(" ");
            newSpannable2.setSpan(new hft0(i2), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) newSpannable2);
        }
        spannableStringBuilder.append((CharSequence) oqs0Var.b);
        return new SpannedString(spannableStringBuilder);
    }

    public final void d(float f, boolean z) {
        if (this.T == f) {
            return;
        }
        eft0 eft0Var = new eft0(this, f);
        if (!z) {
            eft0Var.invoke();
            return;
        }
        ValueAnimator valueAnimator = this.R;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.T, f);
        ofFloat.addUpdateListener(new ho6(this, 5));
        ofFloat.addListener(new gft0(eft0Var));
        ofFloat.setDuration(300L);
        this.R = ofFloat;
        ofFloat.start();
    }

    public final void e(float f) {
        UIPlayerSeek.b bVar = this.N;
        if (bVar != null) {
            bVar.c(f);
        }
        this.T = f;
        float f2 = (-f) * this.F;
        ExtendSeekBarView extendSeekBarView = this.t;
        extendSeekBarView.setTranslationY(f2);
        this.l.setTranslationY(f2);
        this.m.setTranslationY(f2);
        this.q.setTranslationY(f2);
        ImageView imageView = this.u;
        imageView.setAlpha(f);
        this.r.setAlpha(1 - f);
        extendSeekBarView.setAlpha(f);
        boolean z = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (getHasExtendSeekBarView()) {
            imageView.setVisibility(z ? 0 : 8);
            this.v.setVisibility(!z ? 0 : 8);
        }
        extendSeekBarView.setVisibility(z ? 0 : 8);
    }

    public final void f(boolean z) {
        Integer valueOf = Integer.valueOf(this.H);
        if (!z) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        int seekBarHeight = (this.M - getSeekBarHeight()) / 2;
        int i = this.K;
        int i2 = this.L;
        int i3 = this.J;
        int i4 = z ? (i3 - i2) / 2 : (i3 - i) / 2;
        Object obj = x5r0.a;
        x5r0.h(this.l, intValue, 0, intValue, z ? seekBarHeight : 0);
        int i5 = z ? 0 : -seekBarHeight;
        AppCompatSeekBar appCompatSeekBar = this.m;
        x5r0.d(i5, appCompatSeekBar);
        int i6 = this.G + intValue;
        appCompatSeekBar.setPadding(i6, 0, i6, 0);
        int i7 = this.I;
        int i8 = z ? i7 + i4 + seekBarHeight : i7 + i4;
        VideoButtonsView videoButtonsView = this.i;
        x5r0.d(i8, videoButtonsView);
        if (z) {
            i = i2;
        }
        videoButtonsView.setButtonsSize(i);
        if (this.g) {
            x5r0.h(this.t, intValue, z ? -seekBarHeight : 0, intValue, 0);
        }
    }

    public final void g(long j, long j2) {
        String k = hpt0.k(Math.min(j, j2));
        String k2 = hpt0.k(j2);
        this.n.setText(k);
        this.p.setText(k2);
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final void g2(View view) {
        this.C = view;
        view.setOnTouchListener(this.w);
    }

    @Override // android.view.View
    public float getAlpha() {
        return this.Q;
    }

    public final ywp0 getControlsListener() {
        return this.h;
    }

    public long getCurrentVideoDurationSeconds() {
        return this.b;
    }

    public long getCurrentVideoPosition() {
        return this.c;
    }

    public akw getImageLoader() {
        return this.t.getImageLoader();
    }

    public long getPreviousPositionSeconds() {
        return this.e;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public int getSeekBarHeight() {
        return this.f;
    }

    public int getSeekBarTop() {
        return this.l.getTop() + getTop();
    }

    public zwo0 getTimelineThumbs() {
        return this.d;
    }

    @Override // android.view.View
    public int getVisibility() {
        return this.P;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final void p1(boolean z) {
        d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z);
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.Q = f;
        this.s.setAlpha(f);
        this.m.setAlpha(f);
        if (this.A) {
            f = 1.0f;
        }
        this.l.setAlpha(f);
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setButtonsClickListener(View.OnClickListener onClickListener) {
        this.k.setOnClickListener(onClickListener);
        this.j.setOnClickListener(onClickListener);
    }

    public final void setControlsListener(ywp0 ywp0Var) {
        this.h = ywp0Var;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setCurrentVideoDurationSeconds(long j) {
        if (this.b == j) {
            return;
        }
        this.b = j;
        g(getCurrentVideoPosition(), j);
        int i = (int) j;
        this.t.setDurationS(i);
        this.l.setMax(i);
        this.m.setMax(i);
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setCurrentVideoPosition(long j) {
        if (this.c == j) {
            return;
        }
        this.c = j;
        g(j, getCurrentVideoDurationSeconds());
        int i = (int) j;
        this.l.setProgress(i);
        this.m.setProgress(i);
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setExtendSeekBarEnabled(boolean z) {
        this.g = z;
        ExtendSeekBarView extendSeekBarView = this.t;
        if (z) {
            extendSeekBarView.setTimelineThumbs(getTimelineThumbs());
        } else {
            extendSeekBarView.setTimelineThumbs(null);
        }
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setExtendSeekBarListener(UIPlayerSeek.b bVar) {
        this.N = bVar;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setImageLoader(akw akwVar) {
        this.t.setImageLoader(akwVar);
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setIntervalsDisplayConfig(UIPlayerSeek.IntervalsDisplayConfig intervalsDisplayConfig) {
        int i;
        if (epx.f(this.O, intervalsDisplayConfig)) {
            return;
        }
        this.O = intervalsDisplayConfig;
        if (this.y.isEmpty()) {
            return;
        }
        int progress = this.m.getProgress();
        List<oqs0> list = this.y;
        Integer valueOf = Integer.valueOf(progress);
        int size = list.size();
        e43.q(list.size(), size);
        int i2 = size - 1;
        int i3 = 0;
        while (true) {
            if (i3 > i2) {
                i = -(i3 + 1);
                break;
            }
            i = (i3 + i2) >>> 1;
            int b2 = jw5.b(Integer.valueOf((int) list.get(i).a), valueOf);
            if (b2 >= 0) {
                if (b2 <= 0) {
                    break;
                } else {
                    i2 = i - 1;
                }
            } else {
                i3 = i + 1;
            }
        }
        if (i < 0) {
            i = (-i) - 2;
        }
        oqs0 oqs0Var = (oqs0) j5g.b0(i, this.y);
        if (oqs0Var != null) {
            this.j.setText(c(oqs0Var));
            this.k.setText((i + 1) + DomExceptionUtils.SEPARATOR + this.y.size());
        }
        UIPlayerSeek.a aVar = this.z;
        if (aVar != null) {
            W1(aVar);
        }
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setSeekBarAlwaysVisible(boolean z) {
        boolean z2 = this.A != z;
        this.A = z;
        if (z2) {
            p1(false);
            f(!z);
            setVisibility(getVisibility());
            setAlpha(getAlpha());
        }
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setTimelineThumbs(zwo0 zwo0Var) {
        this.d = zwo0Var;
        if (this.g) {
            this.t.setTimelineThumbs(zwo0Var);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        this.P = i;
        this.s.setVisibility(i);
        UIPlayerSeek.a aVar = this.z;
        boolean z = (aVar == null || aVar.b) ? false : true;
        this.m.setVisibility(z ? 8 : i);
        if (this.A) {
            i = 0;
        } else if (z) {
            i = 8;
        }
        this.l.setVisibility(i);
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final void U1(UIPlayerSeek.c cVar) {
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final View W3(Context context) {
        return this;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public /* bridge */ /* synthetic */ void setPreviewPlaceholder(Drawable drawable) {
    }
}
