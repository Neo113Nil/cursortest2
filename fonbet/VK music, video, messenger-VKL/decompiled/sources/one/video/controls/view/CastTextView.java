package one.video.controls.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import xsna.l0a;
import xsna.lup0;
import xsna.x5r0;

/* compiled from: CastTextView.kt */
/* loaded from: classes8.dex */
public final class CastTextView extends AppCompatTextView {
    public l0a b;

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    public CastTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int c = x5r0.c();
        int intValue = ((Number) x5r0.d.getValue()).intValue();
        setPadding(c, intValue, c, intValue);
        setTextColor(-1);
        setTypeface((Typeface) lup0.a.getValue());
        setTextSize(13.0f);
    }
}
