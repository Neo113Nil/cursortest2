package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.b;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.RoundedCornersImageView;

/* loaded from: classes13.dex */
public final class l47 {
    public final ViewGroup a;
    public final RoundedCornersImageView b;
    public final ViewGroup c;
    public final ImageView d;
    public final BadgeView e;
    public final RobotoTextView f;
    public String g;

    public l47(ViewGroup viewGroup) {
        this.a = viewGroup;
        int i = u7h0.turbo_button_icon;
        WeakHashMap weakHashMap = b.a;
        this.b = (RoundedCornersImageView) ((View) rp31.d(viewGroup, i));
        this.c = (ViewGroup) ((View) rp31.d(viewGroup, u7h0.turbo_button_icon_container));
        this.d = (ImageView) ((View) rp31.d(viewGroup, u7h0.turbo_button_extended_icon));
        this.e = (BadgeView) ((View) rp31.d(viewGroup, u7h0.turbo_button_label));
        this.f = (RobotoTextView) ((View) rp31.d(viewGroup, u7h0.turbo_button_text));
    }
}
