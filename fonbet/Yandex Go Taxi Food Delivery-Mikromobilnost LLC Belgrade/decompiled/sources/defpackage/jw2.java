package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.ContextThemeWrapper;
import com.yandex.runtime.image.ImageProvider;
import ru.yandex.taxi.widget.pin.FixedPinView;

/* loaded from: classes5.dex */
public final class jw2 {
    public final Activity a;

    public ImageProvider a(int i, int i2, int i3) {
        Activity activity = this.a;
        Drawable t = vng.t(i2, new ContextThemeWrapper(activity, i3));
        if (t == null) {
            w511.f(oyr.j(i2, "Drawable resource ", " not found"));
            return null;
        }
        int color = activity.getColor(i);
        FixedPinView fixedPinView = doa1.a;
        if (fixedPinView == null) {
            fixedPinView = (FixedPinView) LayoutInflater.from(activity).inflate(tqh0.fixed_map_pin, (ViewGroup) new FrameLayout(activity), false);
            int i4 = fixedPinView.getLayoutParams().width;
            int i5 = fixedPinView.getLayoutParams().height;
            fixedPinView.measure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
            fixedPinView.layout(0, 0, i4, i5);
            doa1.a = fixedPinView;
        }
        fixedPinView.setIcon(t);
        fixedPinView.setPinColor(color);
        return fixedPinView.imageProviderForCurrentState();
    }
}
