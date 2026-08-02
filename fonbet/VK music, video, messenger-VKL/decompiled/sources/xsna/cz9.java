package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import com.vkontakte.android.R;

/* compiled from: CasperIndicatorDrawable.kt */
/* loaded from: classes2.dex */
public final class cz9 extends LayerDrawable {
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public cz9(Context context, int i, int i2, int i3) {
        super(new Drawable[]{r2, r3, r0});
        GradientDrawable a = ful0.a(1);
        a.setColor(e3m.f(R.attr.vk_legacy_background_content, context));
        s3q0 s3q0Var = s3q0.a;
        GradientDrawable a2 = ful0.a(1);
        a2.setColor(e3m.f(R.attr.vk_legacy_accent, context));
        Drawable a3 = m33.a(i, context);
        if (a3 != null) {
            a3.setTint(-1);
        } else {
            a3 = null;
        }
        setLayerInset(1, i2, i2, i2, i2);
        setLayerInset(2, i3, i3, i3, i3);
    }
}
