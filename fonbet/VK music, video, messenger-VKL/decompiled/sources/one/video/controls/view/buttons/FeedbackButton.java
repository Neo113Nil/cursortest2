package one.video.controls.view.buttons;

import android.content.Context;
import android.util.AttributeSet;
import com.vkontakte.android.R;
import one.video.controls.view.buttons.FeedbackButton;
import xsna.o7j;
import xsna.oqj;
import xsna.y3j;

/* compiled from: FeedbackButton.kt */
/* loaded from: classes8.dex */
public final class FeedbackButton extends oqj {
    public static final /* synthetic */ int c = 0;
    public final y3j b;

    public FeedbackButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.drawable.one_video_icon_rate_outline_24, R.string.one_video_controls_button_feedback);
        this.b = new y3j(new o7j() { // from class: xsna.o5r
            @Override // xsna.o7j
            public final void accept(Object obj) {
                int i = FeedbackButton.c;
                FeedbackButton.this.setVisibility(((p5r) obj).a ? 0 : 8);
            }
        });
    }
}
