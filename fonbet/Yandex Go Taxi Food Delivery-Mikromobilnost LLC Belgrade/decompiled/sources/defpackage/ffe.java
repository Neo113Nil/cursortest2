package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import java.util.WeakHashMap;
import ru.yandex.taxi.activity.ContentContainer$ZOrder;

/* loaded from: classes9.dex */
public class ffe {
    public final ViewGroup a;

    public ffe(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final void a(View view, ContentContainer$ZOrder contentContainer$ZOrder) {
        if (!jl40.l(view.getParent(), this.a) && view.getParent() != null) {
            jst.e.v("ContentContainer", new IllegalArgumentException("child should be child of container"));
            return;
        }
        float ordinal = contentContainer$ZOrder.ordinal();
        WeakHashMap weakHashMap = b.a;
        ViewCompat$Api21Impl.r(view, ordinal);
    }
}
