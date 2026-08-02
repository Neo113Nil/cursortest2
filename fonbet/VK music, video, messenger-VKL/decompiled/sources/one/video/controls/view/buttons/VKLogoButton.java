package one.video.controls.view.buttons;

import android.content.Context;
import android.util.AttributeSet;
import com.vkontakte.android.R;
import one.video.controls.view.buttons.VKLogoButton;
import xsna.o7j;
import xsna.oqj;
import xsna.y3j;

/* compiled from: VKLogoButton.kt */
/* loaded from: classes8.dex */
public final class VKLogoButton extends oqj {
    public static final /* synthetic */ int c = 0;
    public final y3j b;

    public VKLogoButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.drawable.one_video_icon_logo_vk_24, 0);
        this.b = new y3j(new o7j() { // from class: xsna.kdr0
            @Override // xsna.o7j
            public final void accept(Object obj) {
                int i = VKLogoButton.c;
                VKLogoButton.this.setVisibility(((ldr0) obj).a ? 0 : 8);
            }
        });
    }
}
