package one.video.controls.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.vkontakte.android.R;
import xsna.anj;
import xsna.s3e0;
import xsna.y3j;

/* compiled from: ProgressView.kt */
/* loaded from: classes8.dex */
public final class ProgressView extends ProgressBar {
    public static final /* synthetic */ int c = 0;
    public final y3j b;

    public ProgressView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public ProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ ProgressView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        setIndeterminateTintList(anj.b(R.color.one_video_white, context));
        this.b = new y3j(new s3e0(this, 0));
    }
}
