package one.video.controls.view.buttons;

import android.content.Context;
import android.util.AttributeSet;
import com.vkontakte.android.R;
import one.video.controls.view.buttons.SettingsButton;
import xsna.o7j;
import xsna.oqj;
import xsna.y3j;

/* compiled from: SettingsButton.kt */
/* loaded from: classes8.dex */
public final class SettingsButton extends oqj {
    public static final /* synthetic */ int c = 0;
    public final y3j b;

    public SettingsButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.drawable.one_video_icon_gear_24, R.string.one_video_controls_button_settings);
        this.b = new y3j(new o7j() { // from class: xsna.u0j0
            @Override // xsna.o7j
            public final void accept(Object obj) {
                int i = SettingsButton.c;
                SettingsButton.this.setVisibility(((w0j0) obj).a ? 0 : 8);
            }
        });
    }
}
