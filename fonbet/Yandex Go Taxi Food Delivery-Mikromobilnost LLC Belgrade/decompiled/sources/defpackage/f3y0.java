package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.yandex.go.taxi.order.chat.ui.chat.b;
import java.util.WeakHashMap;
import java.util.function.Consumer;

/* loaded from: classes14.dex */
public final class f3y0 extends b {
    public final pav S;
    public final ImageView T;

    public f3y0(View view, pav pavVar) {
        super(view);
        this.S = pavVar;
        int i = n8h0.map_image;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.T = (ImageView) ((View) rp31.d(view, i));
    }

    @Override // com.yandex.go.taxi.order.chat.ui.chat.b
    public final void W(jv10 jv10Var, Consumer consumer) {
        gv10 gv10Var = (gv10) jv10Var;
        super.W(gv10Var, consumer);
        ((nac) this.S.a(this.T)).c(gv10Var.D);
    }

    @Override // com.yandex.go.taxi.order.chat.ui.chat.b
    public final View X() {
        return this.T;
    }
}
