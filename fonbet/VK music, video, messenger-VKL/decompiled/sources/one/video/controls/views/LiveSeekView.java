package one.video.controls.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.Slider;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.ArrayList;
import one.video.controls.models.UIPlayerSeek;
import one.video.controls.views.LiveSeekView;
import xsna.akw;
import xsna.anj;
import xsna.hpt0;
import xsna.ozl;
import xsna.sg0;
import xsna.ui6;
import xsna.zwo0;

/* compiled from: LiveSeekView.kt */
@ozl
/* loaded from: classes8.dex */
public final class LiveSeekView extends LinearLayout implements UIPlayerSeek {
    public static final /* synthetic */ int n = 0;
    public b b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final TextView e;
    public final Slider f;
    public final TextView g;
    public boolean h;
    public final long i;
    public long j;
    public long k;
    public boolean l;
    public zwo0 m;

    /* compiled from: LiveSeekView.kt */
    public static final class a implements ui6 {
        public a() {
        }

        @Override // xsna.ui6
        public final void a(BaseSlider baseSlider) {
            LiveSeekView.this.h = true;
        }

        @Override // xsna.ui6
        public final void b(BaseSlider baseSlider) {
            Slider slider = (Slider) baseSlider;
            LiveSeekView liveSeekView = LiveSeekView.this;
            liveSeekView.h = false;
            b listener = liveSeekView.getListener();
            if (listener != null) {
                listener.b((long) slider.getValue());
            }
        }
    }

    /* compiled from: LiveSeekView.kt */
    public interface b {
        void b(long j);
    }

    public LiveSeekView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = anj.b(R.color.one_video_red, context);
        this.d = ColorStateList.valueOf(-1);
        setVisibility(8);
        setOrientation(0);
        setGravity(16);
        View.inflate(context, R.layout.one_video_live_seek, this);
        this.e = (TextView) findViewById(R.id.live_seek_elapsed_time);
        Slider slider = (Slider) findViewById(R.id.live_seek_slider);
        this.f = slider;
        TextView textView = (TextView) findViewById(R.id.live_seek_badge);
        this.g = textView;
        slider.setValue(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        slider.o.add(new a());
        slider.a(new Slider.a() { // from class: xsna.hlz
            @Override // xsna.ti6
            public final void F0(BaseSlider baseSlider, float f, boolean z) {
                int i = LiveSeekView.n;
                LiveSeekView liveSeekView = LiveSeekView.this;
                if (z) {
                    liveSeekView.e.setText("-".concat(hpt0.k(Math.abs(((long) f) / 1000))));
                }
                liveSeekView.c();
                liveSeekView.b();
            }
        });
        textView.setOnClickListener(new sg0(this, 10));
        this.i = -1L;
        this.j = -1L;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final void C3(long j, long j2) {
        a(j);
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final boolean K3() {
        return this.l;
    }

    public final void a(long j) {
        if (this.h) {
            return;
        }
        this.e.setText("-".concat(hpt0.k(Math.abs(j / 1000))));
        float f = j;
        Slider slider = this.f;
        if (f <= slider.getValueFrom()) {
            return;
        }
        slider.setValue(f);
        c();
        b();
    }

    public final void b() {
        boolean z = ((long) this.f.getValue()) == 0;
        TextView textView = this.g;
        textView.setEnabled(!z);
        textView.setActivated(z);
    }

    public final void c() {
        Slider slider = this.f;
        ColorStateList colorStateList = ((long) slider.getValue()) == 0 ? this.c : this.d;
        if (colorStateList != null) {
            slider.setTrackActiveTintList(colorStateList);
        }
    }

    public long getCurrentVideoDurationSeconds() {
        return this.j;
    }

    public long getCurrentVideoPosition() {
        return this.k;
    }

    public akw getImageLoader() {
        return null;
    }

    public final b getListener() {
        return this.b;
    }

    public long getPreviousPositionSeconds() {
        return this.i;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public int getSeekBarHeight() {
        return this.f.getHeight();
    }

    public int getSeekBarTop() {
        return this.f.getTop() + getTop();
    }

    public zwo0 getTimelineThumbs() {
        return this.m;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setCurrentVideoDurationSeconds(long j) {
        this.j = j;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setCurrentVideoPosition(long j) {
        this.k = j;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setExtendSeekBarEnabled(boolean z) {
        this.l = z;
    }

    public final void setListener(b bVar) {
        this.b = bVar;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setTimelineThumbs(zwo0 zwo0Var) {
        this.m = zwo0Var;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final void O3(int i) {
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final void U1(UIPlayerSeek.c cVar) {
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final void W1(UIPlayerSeek.a aVar) {
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final View W3(Context context) {
        return this;
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public /* bridge */ /* synthetic */ void setButtonsClickListener(View.OnClickListener onClickListener) {
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public /* bridge */ /* synthetic */ void setExtendSeekBarListener(UIPlayerSeek.b bVar) {
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setImageLoader(akw akwVar) {
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setIntervalsDisplayConfig(UIPlayerSeek.IntervalsDisplayConfig intervalsDisplayConfig) {
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public /* bridge */ /* synthetic */ void setPreviewPlaceholder(Drawable drawable) {
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public void setSeekBarAlwaysVisible(boolean z) {
    }

    @Override // one.video.controls.models.UIPlayerSeek
    public final void H3(int i, ArrayList arrayList) {
    }
}
