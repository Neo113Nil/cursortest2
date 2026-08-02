package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.expression.variables.a;

/* loaded from: classes.dex */
public final class kpq extends RecyclerView.g {
    public final a a;
    public String b;

    public kpq(a aVar) {
        this.a = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.getScrollState() != 1 || i2 == 0) {
            return;
        }
        String str = i2 > 0 ? "down" : "up";
        if (str.equals(this.b)) {
            return;
        }
        this.b = str;
        this.a.i(new z131("feed.scroll_direction", str));
    }
}
