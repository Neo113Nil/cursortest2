package one.video.controls.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import one.video.controls.view.LiveLabelView;
import xsna.o7j;
import xsna.x5r0;
import xsna.y3j;

/* compiled from: LiveLabelView.kt */
/* loaded from: classes8.dex */
public final class LiveLabelView extends AppCompatTextView {
    public static final /* synthetic */ int c = 0;
    public final y3j b;

    public LiveLabelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        setGravity(17);
        setBackgroundResource(com.vkontakte.android.R.drawable.one_video_live_button_bg);
        setIncludeFontPadding(false);
        setText(com.vkontakte.android.R.string.one_video_live);
        setAllCaps(true);
        setTextColor(context.getColor(R.color.white));
        setTextSize(1, 12.0f);
        this.b = new y3j(new o7j() { // from class: xsna.njz
            @Override // xsna.o7j
            public final void accept(Object obj) {
                int i = LiveLabelView.c;
                LiveLabelView.this.setVisibility(((ojz) obj).a ? 0 : 8);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(((Number) x5r0.k.getValue()).intValue(), i), View.resolveSize(x5r0.b(), i2));
    }
}
