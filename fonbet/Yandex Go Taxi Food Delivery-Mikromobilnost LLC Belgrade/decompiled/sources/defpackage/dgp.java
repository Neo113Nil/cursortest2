package defpackage;

import android.view.View;
import androidx.core.view.b;
import androidx.recyclerview.widget.x0;
import java.util.WeakHashMap;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public final class dgp extends x0 {
    public final /* synthetic */ int N;
    public final View O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgp(View view, int i) {
        super(view);
        this.N = i;
        switch (i) {
            case 1:
                super(view);
                this.O = (ListItemComponent) view;
                break;
            case 2:
                super(view);
                int i2 = rfh0.divider;
                WeakHashMap weakHashMap = b.a;
                this.O = (View) rp31.d(view, i2);
                break;
            default:
                this.O = (ListItemComponent) view;
                break;
        }
    }
}
