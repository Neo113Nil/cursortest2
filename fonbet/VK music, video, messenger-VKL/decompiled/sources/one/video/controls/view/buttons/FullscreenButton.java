package one.video.controls.view.buttons;

import android.content.Context;
import android.util.AttributeSet;
import com.vkontakte.android.R;
import one.video.controls.view.buttons.FullscreenButton;
import xsna.o7j;
import xsna.oqj;
import xsna.y3j;

/* compiled from: FullscreenButton.kt */
/* loaded from: classes8.dex */
public final class FullscreenButton extends oqj {
    public static final /* synthetic */ int c = 0;
    public final y3j b;

    public FullscreenButton(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.drawable.one_video_icon_fullscreen_24, R.string.one_video_controls_button_fullscreen);
        this.b = new y3j(new o7j() { // from class: xsna.rxs
            @Override // xsna.o7j
            public final void accept(Object obj) {
                sxs sxsVar = (sxs) obj;
                int i = FullscreenButton.c;
                int i2 = sxsVar.a ? 0 : 8;
                FullscreenButton fullscreenButton = FullscreenButton.this;
                fullscreenButton.setVisibility(i2);
                if (fullscreenButton.getVisibility() == 0) {
                    boolean z = sxsVar.b;
                    Context context2 = context;
                    if (z) {
                        fullscreenButton.setContentDescription(context2.getString(R.string.one_video_controls_button_fullscreen_exit));
                        fullscreenButton.setImageResource(R.drawable.one_video_icon_fullscreen_exit_24);
                    } else {
                        fullscreenButton.setContentDescription(context2.getString(R.string.one_video_controls_button_fullscreen));
                        fullscreenButton.setImageResource(R.drawable.one_video_icon_fullscreen_24);
                    }
                }
            }
        });
    }
}
