package one.video.controls.view.seekbar;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatSeekBar;
import xsna.m33;

/* compiled from: CustomSeekBar.kt */
/* loaded from: classes8.dex */
public class CustomSeekBar extends AppCompatSeekBar {
    public a c;

    /* compiled from: CustomSeekBar.kt */
    public interface a {
        void a(boolean z);
    }

    public CustomSeekBar(Context context) {
        this(context, null, 0, 14, 0);
    }

    public final a getVisibilityChangeListener$one_video_controls_components_release() {
        return this.c;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(i == 0);
        }
    }

    public final void setVisibilityChangeListener$one_video_controls_components_release(a aVar) {
        this.c = aVar;
    }

    public CustomSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public CustomSeekBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ CustomSeekBar(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.seekBarStyle : i, 0);
    }

    public CustomSeekBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        setSplitTrack(false);
        setProgressDrawable(m33.a(R.color.transparent, context));
        setThumb(m33.a(com.vkontakte.android.R.drawable.one_video_thumb, context));
    }
}
