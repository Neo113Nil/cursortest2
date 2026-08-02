package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;

/* compiled from: CreateVkEmailSuggestsAdapter.kt */
/* loaded from: classes15.dex */
public final class yak extends RecyclerView.Adapter<a> {
    public final rak c;

    /* compiled from: CreateVkEmailSuggestsAdapter.kt */
    public static final class a extends RecyclerView.e0 {
        public final TextView l;

        public a(ViewGroup viewGroup, zak zakVar) {
            super(tf3.b(viewGroup, R.layout.vk_create_email_suggest_item, viewGroup, false));
            this.l = (TextView) this.itemView.findViewById(R.id.vk_create_email_suggest_item_text);
            this.itemView.setOnClickListener(new ina(1, zakVar, this));
        }
    }

    public yak(rak rakVar) {
        this.c = rakVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.y();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i) {
        this.c.f0(aVar, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(viewGroup, new zak(1, this.c, rak.class, "onSuggestItemClick", "onSuggestItemClick(I)V", 0));
    }
}
