package one.video.controls.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.vkontakte.android.R;
import xsna.gzs;
import xsna.k9q0;
import xsna.s3q0;
import xsna.wn80;
import xsna.x01;

/* compiled from: VideoEndView.kt */
/* loaded from: classes8.dex */
public final class VideoEndView extends FrameLayout {
    public gzs<s3q0> b;

    public VideoEndView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final gzs<s3q0> getButtonClickListener() {
        return this.b;
    }

    public final void setButtonClickListener(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    public VideoEndView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public VideoEndView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ VideoEndView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public VideoEndView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.one_video_end_view, this);
        AppCompatImageView appCompatImageView = (AppCompatImageView) k9q0.j(R.id.end_view_action_button, this);
        if (appCompatImageView != null) {
            int i3 = wn80.a;
            appCompatImageView.setBackgroundResource(R.drawable.one_video_button_drawable);
            appCompatImageView.setImageResource(R.drawable.one_video_icon_play_button_64);
            appCompatImageView.setOnClickListener(new x01(this, 9));
            return;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(R.id.end_view_action_button)));
    }
}
