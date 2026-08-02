package one.video.controls.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vkontakte.android.R;
import xsna.bvs;
import xsna.dp2;
import xsna.k1;
import xsna.kl2;
import xsna.ozl;
import xsna.vw0;
import xsna.x01;

/* compiled from: VideoShortActions.kt */
@ozl
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes8.dex */
public final class VideoShortActions extends ConstraintLayout {
    public static final /* synthetic */ int y = 0;
    public a t;
    public boolean u;
    public final SwitchCompat v;
    public final View w;
    public final TextView x;

    public VideoShortActions(Context context) {
        this(context, null, 0, 14, 0);
    }

    private final void setAutoplaySwitchInactive(boolean z) {
        if (this.u == z) {
            return;
        }
        this.u = z;
        SwitchCompat switchCompat = this.v;
        if (z) {
            switchCompat.setAlpha(0.4f);
        } else {
            switchCompat.setAlpha(1.0f);
        }
    }

    public final void P4(boolean z) {
        int i = z ? R.string.one_video_autoplay_enabled : R.string.one_video_autoplay_disabled;
        TextView textView = this.x;
        textView.setText(i);
        dp2.b(textView, new kl2(this, 11), 27);
    }

    public final a getListener() {
        return this.t;
    }

    public final void setAutoplayEnabled(boolean z) {
        this.v.setChecked(z);
    }

    public final void setAutoplayInactive(boolean z) {
        setAutoplaySwitchInactive(z);
    }

    public final void setAutoplayVisibility(boolean z) {
        this.v.setVisibility(z ? 0 : 8);
    }

    public final void setEnterPipVisibility(boolean z) {
        this.w.setVisibility(z ? 0 : 8);
    }

    public final void setListener(a aVar) {
        this.t = aVar;
    }

    public VideoShortActions(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public VideoShortActions(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ VideoShortActions(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public VideoShortActions(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.one_video_short_actions, (ViewGroup) this, true);
        View findViewById = findViewById(R.id.enter_pip);
        this.w = findViewById;
        findViewById.setOnClickListener(new x01(this, 10));
        int i3 = 17;
        findViewById(R.id.more).setOnClickListener(new k1(this, i3));
        this.x = (TextView) findViewById(R.id.autoplay_mode_info);
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.autoplay_switch);
        this.v = switchCompat;
        switchCompat.setOnClickListener(new vw0(this, i3));
        switchCompat.setOnTouchListener(new bvs(this, 2));
    }

    /* compiled from: VideoShortActions.kt */
    public interface a {
        void l();

        void o(boolean z);

        void p();

        default void n() {
        }
    }
}
