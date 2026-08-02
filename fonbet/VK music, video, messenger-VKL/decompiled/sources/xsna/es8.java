package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.attachpicker.configuration.GalleryHeaderButtonStyle;
import com.vkontakte.android.R;

/* compiled from: ButtonsHeaderFactory.kt */
/* loaded from: classes15.dex */
public final class es8 {

    /* compiled from: ButtonsHeaderFactory.kt */
    public static final class a extends FrameLayout {
        public final float b;

        public a(Context context) {
            super(context, null, 0);
            View.inflate(context, R.layout.picker_attach_gallery_new_header, this);
            setBackground(new ColorDrawable(e3m.f(R.attr.vk_ui_background_secondary, context)));
            setContentDescription(context.getString(R.string.picker_inner_action_story_camera));
            this.b = 1.0f;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            setMinimumHeight((int) (View.MeasureSpec.getSize(i) / this.b));
            super.onMeasure(i, i2);
        }
    }

    /* compiled from: ButtonsHeaderFactory.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GalleryHeaderButtonStyle.values().length];
            try {
                iArr[GalleryHeaderButtonStyle.FULL_ROW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GalleryHeaderButtonStyle.SINGLE_SPAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
