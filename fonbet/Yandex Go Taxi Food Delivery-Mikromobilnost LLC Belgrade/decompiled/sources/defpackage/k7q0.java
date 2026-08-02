package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.internal.view.timeline.common.a;
import com.yandex.messaging.internal.view.timeline.e;
import com.yandex.messaging.internal.view.timeline.g0;

/* loaded from: classes15.dex */
public final class k7q0 implements dcz0 {
    public final RecyclerView a;
    public final a b;
    public final bqe0 c;
    public long d = -1;
    public boolean e;

    public k7q0(RecyclerView recyclerView, g0 g0Var, w3c w3cVar, a aVar) {
        this.a = recyclerView;
        this.b = aVar;
        this.c = new bqe0(g0Var, w3cVar);
    }

    @Override // defpackage.dcz0
    public final void a(View view) {
        Long l;
        if (this.e) {
            x0 childViewHolder = this.a.getChildViewHolder(view);
            e eVar = childViewHolder instanceof e ? (e) childViewHolder : null;
            if (eVar != null && (l = eVar.i0) != null && l.longValue() >= 0 && this.d < l.longValue()) {
                this.d = l.longValue();
                if (eVar.F() == 0) {
                    x4e.z(0, this.b.c, null);
                }
                this.c.c(new abz0(l.longValue()));
            }
        }
    }
}
