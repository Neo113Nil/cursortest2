package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ru.yandex.taxi.order.OrderFragment;

/* loaded from: classes6.dex */
public final class ow70 {
    public final /* synthetic */ OrderFragment a;

    public ow70(OrderFragment orderFragment) {
        this.a = orderFragment;
    }

    public final ViewGroup a() {
        View view = this.a.getView();
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }
}
