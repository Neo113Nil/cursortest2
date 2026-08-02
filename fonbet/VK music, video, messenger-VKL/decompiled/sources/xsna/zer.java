package xsna;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;

/* compiled from: FilteredSourcesAdapter.kt */
/* loaded from: classes18.dex */
public final class zer extends androidx.recyclerview.widget.x<yer, com.vk.feed.settings.impl.presentation.filtered.tab.a> implements vic {
    public final v34 c;
    public final e40 d;

    /* compiled from: FilteredSourcesAdapter.kt */
    public static final class a extends m.e<yer> {
        public final Object a = new Object();

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(yer yerVar, yer yerVar2) {
            return yerVar.equals(yerVar2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(yer yerVar, yer yerVar2) {
            return epx.f(yerVar.a, yerVar2.a);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final Object getChangePayload(yer yerVar, yer yerVar2) {
            return this.a;
        }
    }

    public zer(v34 v34Var, e40 e40Var) {
        super(new a());
        this.c = v34Var;
        this.d = e40Var;
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        submitList(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        com.vk.feed.settings.impl.presentation.filtered.tab.a aVar = (com.vk.feed.settings.impl.presentation.filtered.tab.a) e0Var;
        aVar.V5(getCurrentList().get(i));
        aVar.o = this.c;
        aVar.p = this.d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new com.vk.feed.settings.impl.presentation.filtered.tab.a(viewGroup);
    }
}
