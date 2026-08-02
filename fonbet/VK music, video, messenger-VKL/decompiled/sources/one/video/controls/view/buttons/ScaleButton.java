package one.video.controls.view.buttons;

import android.content.Context;
import android.util.AttributeSet;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import one.video.controls.view.buttons.ScaleButton;
import one.video.transform.TransformController;
import xsna.o7j;
import xsna.oqj;
import xsna.y3j;

/* compiled from: ScaleButton.kt */
/* loaded from: classes8.dex */
public final class ScaleButton extends oqj {
    public static final /* synthetic */ int c = 0;
    public final y3j b;

    /* compiled from: ScaleButton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransformController.ScaleType.values().length];
            try {
                iArr[TransformController.ScaleType.FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransformController.ScaleType.CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ScaleButton(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.drawable.one_video_icon_video_scale_fit_24, R.string.one_video_controls_button_scale_fit);
        this.b = new y3j(new o7j() { // from class: xsna.j4h0
            @Override // xsna.o7j
            public final void accept(Object obj) {
                k4h0 k4h0Var = (k4h0) obj;
                int i = ScaleButton.c;
                int i2 = k4h0Var.a ? 0 : 8;
                ScaleButton scaleButton = ScaleButton.this;
                scaleButton.setVisibility(i2);
                if (scaleButton.getVisibility() == 0) {
                    int i3 = ScaleButton.a.$EnumSwitchMapping$0[k4h0Var.b.ordinal()];
                    Context context2 = context;
                    if (i3 == 1) {
                        scaleButton.setContentDescription(context2.getString(R.string.one_video_controls_button_scale_fit));
                        scaleButton.setImageResource(R.drawable.one_video_icon_video_scale_fit_24);
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        scaleButton.setContentDescription(context2.getString(R.string.one_video_controls_button_scale_crop));
                        scaleButton.setImageResource(R.drawable.one_video_icon_video_scale_crop_24);
                    }
                }
            }
        });
    }
}
