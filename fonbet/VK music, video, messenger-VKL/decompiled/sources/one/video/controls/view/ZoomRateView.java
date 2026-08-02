package one.video.controls.view;

import android.R;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import xsna.lup0;
import xsna.pi10;
import xsna.x5r0;
import xsna.y3j;

/* compiled from: ZoomRateView.kt */
/* loaded from: classes8.dex */
public final class ZoomRateView extends AppCompatTextView {
    public static final /* synthetic */ int c = 0;
    public final y3j b;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    public ZoomRateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        setBackgroundResource(com.vkontakte.android.R.drawable.one_video_zoom_info);
        int c2 = x5r0.c();
        ?? r0 = x5r0.c;
        setPadding(c2, ((Number) r0.getValue()).intValue(), x5r0.c(), ((Number) r0.getValue()).intValue());
        setTextColor(context.getColor(com.vkontakte.android.R.color.one_video_white));
        setTextSize(2, 13.0f);
        setTypeface((Typeface) lup0.a.getValue());
        this.b = new y3j(new pi10(this, 1));
    }
}
