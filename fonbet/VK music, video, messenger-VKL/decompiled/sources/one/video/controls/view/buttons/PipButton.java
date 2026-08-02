package one.video.controls.view.buttons;

import android.content.Context;
import android.util.AttributeSet;
import com.vkontakte.android.R;
import one.video.controls.view.buttons.PipButton;
import xsna.o7j;
import xsna.oqj;
import xsna.y3j;

/* compiled from: PipButton.kt */
/* loaded from: classes8.dex */
public final class PipButton extends oqj {
    public static final /* synthetic */ int c = 0;
    public final y3j b;

    public PipButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.drawable.one_video_icon_pip_24, R.string.one_video_controls_button_pip);
        this.b = new y3j(new o7j() { // from class: xsna.voa0
            @Override // xsna.o7j
            public final void accept(Object obj) {
                int i = PipButton.c;
                PipButton.this.setVisibility(((woa0) obj).a ? 0 : 8);
            }
        });
    }
}
