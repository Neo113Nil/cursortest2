package one.video.controls.views.seek;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;
import one.video.controls.models.UIPlayerSeek;
import one.video.controls.views.seek.VideoSeekViewOld;
import xsna.bft0;
import xsna.cft0;
import xsna.dft0;
import xsna.drm0;
import xsna.e43;
import xsna.hpt0;
import xsna.j5g;
import xsna.mox;
import xsna.oqs0;
import xsna.ozl;
import xsna.s3q0;
import xsna.x5r0;

/* compiled from: VideoSeekIntervalsDelegate.kt */
@ozl
/* loaded from: classes8.dex */
public final class a implements SeekBar.OnSeekBarChangeListener {
    public final AppCompatSeekBar b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final int f;
    public final Drawable g;
    public boolean j;
    public List<oqs0> h = EmptyList.b;
    public int i = -1;
    public UIPlayerSeek.IntervalsDisplayConfig k = new UIPlayerSeek.IntervalsDisplayConfig(new UIPlayerSeek.IntervalsDisplayConfig.a(6), 3);
    public final bft0 l = new ViewTreeObserver.OnPreDrawListener() { // from class: xsna.bft0
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            one.video.controls.views.seek.a aVar = one.video.controls.views.seek.a.this;
            if (!aVar.j) {
                return true;
            }
            TextView textView = aVar.e;
            int i = VideoSeekViewOld.J;
            textView.setTranslationX(VideoSeekViewOld.a.a(textView, aVar.b));
            return true;
        }
    };

    /* compiled from: VideoSeekIntervalsDelegate.kt */
    /* renamed from: one.video.controls.views.seek.a$a, reason: collision with other inner class name */
    public static final class ViewOnAttachStateChangeListenerC2177a implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC2177a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnPreDrawListener(a.this.l);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            view.getViewTreeObserver().removeOnPreDrawListener(a.this.l);
        }
    }

    static {
        x5r0.a(12, 1);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [xsna.bft0] */
    public a(AppCompatSeekBar appCompatSeekBar, TextView textView, TextView textView2, TextView textView3) {
        this.b = appCompatSeekBar;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = (int) appCompatSeekBar.getContext().getResources().getDimension(R.dimen.one_video_seek_default_seek_size);
        this.g = appCompatSeekBar.getProgressDrawable();
        ViewOnAttachStateChangeListenerC2177a viewOnAttachStateChangeListenerC2177a = new ViewOnAttachStateChangeListenerC2177a();
        textView.setTag("intervals");
        textView2.setTag("intervals");
        textView3.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC2177a);
        appCompatSeekBar.addOnLayoutChangeListener(new cft0(this, 0));
    }

    public static int h(int i, List list) {
        int h = e43.h(list);
        int i2 = 0;
        while (h > i2) {
            int i3 = (i2 + h) / 2;
            int i4 = i3 + 1;
            if (((oqs0) list.get(i4)).a <= i) {
                i2 = i4;
            } else {
                h = i3;
            }
        }
        return h;
    }

    public final void a() {
        String str;
        oqs0 oqs0Var = (oqs0) j5g.b0(this.i, this.h);
        SpannedString spannedString = null;
        if (oqs0Var == null || (str = oqs0Var.b) == null || drm0.N(str)) {
            str = null;
        }
        this.e.setText(str);
        this.d.setText(String.format("%s/%s", Arrays.copyOf(new Object[]{Integer.valueOf(this.i + 1), Integer.valueOf(this.h.size())}, 2)));
        UIPlayerSeek.IntervalsDisplayConfig.a aVar = this.k.c;
        if (str != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i = aVar.b;
            Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
            newSpannable.setSpan(new dft0(i), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) newSpannable);
            spannableStringBuilder.append(aVar.a, new ForegroundColorSpan(this.b.getContext().getColor(R.color.one_video_white_alpha60)), 33);
            int i2 = aVar.c;
            Spannable newSpannable2 = Spannable.Factory.getInstance().newSpannable(" ");
            newSpannable2.setSpan(new dft0(i2), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) newSpannable2);
            spannableStringBuilder.append((CharSequence) str);
            spannedString = new SpannedString(spannableStringBuilder);
        }
        this.c.setText(spannedString);
    }

    public final void g(boolean z) {
        int i = this.b.getContext().getResources().getConfiguration().orientation;
        boolean z2 = j() && !this.j && this.k.b.contains((i == 0 || i == 1) ? UIPlayerSeek.IntervalsDisplayConfig.Orientation.PORTRAIT : UIPlayerSeek.IntervalsDisplayConfig.Orientation.LANDSCAPE);
        hpt0.v(this.d, z2 && this.k.a, z);
        TextView textView = this.c;
        hpt0.v(textView, z2 && !drm0.N(textView.getText()), z);
        boolean j = j();
        TextView textView2 = this.e;
        hpt0.v(textView2, j && this.j && !drm0.N(textView2.getText()), z);
    }

    public final boolean j() {
        return !this.h.isEmpty();
    }

    public final void l(int i) {
        int i2 = Build.VERSION.SDK_INT;
        AppCompatSeekBar appCompatSeekBar = this.b;
        if (i2 >= 29) {
            appCompatSeekBar.setMaxHeight(i);
            return;
        }
        try {
            Field declaredField = ProgressBar.class.getDeclaredField("mMaxHeight");
            declaredField.setAccessible(true);
            declaredField.set(appCompatSeekBar, Integer.valueOf(i));
            s3q0 s3q0Var = s3q0.a;
        } catch (Exception e) {
            Log.e("OVSeekBar", "Cannot set height of seekBarView", e);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (j()) {
            int i2 = this.i;
            int h = h(i, this.h);
            this.i = h;
            if (z && i2 != h && seekBar.isHapticFeedbackEnabled()) {
                seekBar.performHapticFeedback(11);
            }
            a();
            g(false);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (j()) {
            this.j = true;
            Drawable progressDrawable = seekBar.getProgressDrawable();
            mox moxVar = progressDrawable instanceof mox ? (mox) progressDrawable : null;
            if (moxVar != null) {
                moxVar.h = true;
                moxVar.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            }
            this.i = h(seekBar.getProgress(), this.h);
            a();
            g(true);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        if (j()) {
            this.j = false;
            Drawable progressDrawable = seekBar.getProgressDrawable();
            mox moxVar = progressDrawable instanceof mox ? (mox) progressDrawable : null;
            if (moxVar != null) {
                moxVar.h = false;
                moxVar.a(moxVar.f.get(0).f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            g(true);
        }
    }
}
