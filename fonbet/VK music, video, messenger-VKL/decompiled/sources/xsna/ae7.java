package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;

/* compiled from: BlacklistAdapter.kt */
/* loaded from: classes18.dex */
public final class ae7 extends androidx.recyclerview.widget.x<ge7, com.vk.feed.blacklist.impl.presentation.blacklist.c> implements vic {
    public final t34 c;
    public final do3 d;

    /* compiled from: BlacklistAdapter.kt */
    public static final class a extends m.e<ge7> {
        public final Object a = new Object();

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(ge7 ge7Var, ge7 ge7Var2) {
            return ge7Var.equals(ge7Var2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(ge7 ge7Var, ge7 ge7Var2) {
            return epx.f(ge7Var.a, ge7Var2.a);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final Object getChangePayload(ge7 ge7Var, ge7 ge7Var2) {
            return this.a;
        }
    }

    public ae7(t34 t34Var, do3 do3Var) {
        super(new a());
        this.c = t34Var;
        this.d = do3Var;
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        submitList(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        com.vk.feed.blacklist.impl.presentation.blacklist.c cVar = (com.vk.feed.blacklist.impl.presentation.blacklist.c) e0Var;
        cVar.V5(getCurrentList().get(i));
        cVar.o = this.c;
        cVar.p = this.d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new com.vk.feed.blacklist.impl.presentation.blacklist.c(viewGroup);
    }
}
