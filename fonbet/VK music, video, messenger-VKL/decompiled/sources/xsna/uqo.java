package xsna;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* compiled from: DynamicTheme.kt */
/* loaded from: classes17.dex */
public final class uqo {
    public static final /* synthetic */ int a = 0;

    /* compiled from: DynamicTheme.kt */
    public static final class a extends Property<View, Integer> {
        @Override // android.util.Property
        public final Integer get(View view) {
            Drawable background = view.getBackground();
            return Integer.valueOf(background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0);
        }

        @Override // android.util.Property
        public final void set(View view, Integer num) {
            view.setBackgroundColor(num.intValue());
        }
    }

    /* compiled from: DynamicTheme.kt */
    public static final class b extends Property<Drawable, Integer> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ Integer get(Drawable drawable) {
            return 0;
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, Integer num) {
            drawable.setTint(num.intValue());
        }
    }

    /* compiled from: DynamicTheme.kt */
    public static final class c extends Property<TextView, Integer> {
        @Override // android.util.Property
        public final Integer get(TextView textView) {
            return Integer.valueOf(textView.getCurrentTextColor());
        }

        @Override // android.util.Property
        public final void set(TextView textView, Integer num) {
            textView.setTextColor(num.intValue());
        }
    }

    static {
        Class cls = Integer.TYPE;
        new c(cls, "textColor");
        new b(cls, "color");
        new a(cls, TtmlNode.ATTR_TTS_BACKGROUND_COLOR);
    }
}
