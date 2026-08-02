package one.video.controls.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.vkontakte.android.R;
import one.video.controls.view.SoundOnlyView;
import xsna.lup0;
import xsna.o7j;
import xsna.x5r0;
import xsna.y3j;

/* compiled from: SoundOnlyView.kt */
/* loaded from: classes8.dex */
public final class SoundOnlyView extends AppCompatTextView {
    public static final /* synthetic */ int c = 0;
    public final y3j b;

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    public SoundOnlyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBackgroundResource(R.drawable.one_video_sound_only_bg);
        setCompoundDrawablesWithIntrinsicBounds(R.drawable.one_video_icon_sound_only_16, 0, 0, 0);
        ?? r2 = x5r0.d;
        setCompoundDrawablePadding(((Number) r2.getValue()).intValue());
        int c2 = x5r0.c();
        int intValue = ((Number) r2.getValue()).intValue();
        setPadding(c2, intValue, c2, intValue);
        setText(R.string.one_video_sound_only);
        setTextColor(-1);
        setTypeface((Typeface) lup0.a.getValue());
        setTextSize(13.0f);
        this.b = new y3j(new o7j() { // from class: xsna.yfk0
            @Override // xsna.o7j
            public final void accept(Object obj) {
                int i = SoundOnlyView.c;
                SoundOnlyView.this.setVisibility(((zfk0) obj).a ? 0 : 8);
            }
        });
    }
}
