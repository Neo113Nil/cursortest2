package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.yandex.messaging.domain.g;
import com.yandex.messaging.domain.statuses.e;
import com.yandex.messaging.internal.team.gaps.a;
import com.yandex.messaging.internal.view.chat.input.b;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes15.dex */
public final class ej10 extends RecyclerView.Adapter {
    public final q0k a;
    public final a b;
    public final e c;
    public final h3y w;
    public final g x;
    public final k200 y;
    public final dj10 z = new dj10(this);
    public List A = EmptyList.a;

    public ej10(q0k q0kVar, a aVar, e eVar, h3y h3yVar, g gVar, k200 k200Var) {
        this.a = q0kVar;
        this.b = aVar;
        this.c = eVar;
        this.w = h3yVar;
        this.x = gVar;
        this.y = k200Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.A.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        ((b) x0Var).c(this.A.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new b(g8a1.g(viewGroup, olh0.msg_vh_mention_suggest_item_view), this.a, this.b, this.c, this.x, this.w, new xbb(2, this.y));
    }
}
