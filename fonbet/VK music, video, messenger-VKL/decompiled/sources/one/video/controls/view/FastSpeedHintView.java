package one.video.controls.view;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import xsna.cs8;
import xsna.lup0;
import xsna.x5r0;
import xsna.y3j;

/* compiled from: FastSpeedHintView.kt */
/* loaded from: classes8.dex */
public final class FastSpeedHintView extends AppCompatTextView {
    public static final /* synthetic */ int c = 0;
    public final y3j b;

    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    public FastSpeedHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        setBackgroundResource(com.vkontakte.android.R.drawable.one_video_hint_bg);
        setCompoundDrawablePadding(((Number) x5r0.c.getValue()).intValue());
        setCompoundDrawablesWithIntrinsicBounds(0, 0, com.vkontakte.android.R.drawable.one_video_skip_next_16, 0);
        int intValue = ((Number) x5r0.d.getValue()).intValue();
        int intValue2 = ((Number) x5r0.h.getValue()).intValue();
        setPadding(intValue2, intValue, intValue2, intValue);
        setText(com.vkontakte.android.R.string.one_video_2x_speed);
        setTextColor(-1);
        setTypeface((Typeface) lup0.b.getValue());
        setTextSize(13.0f);
        this.b = new y3j(new cs8(this, 1));
    }
}
