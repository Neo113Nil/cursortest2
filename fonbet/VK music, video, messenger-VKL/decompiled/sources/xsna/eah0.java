package xsna;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: ScopesAdapter.kt */
/* loaded from: classes15.dex */
public final class eah0 extends RecyclerView.Adapter<a> {
    public final ArrayList c = new ArrayList();

    /* compiled from: ScopesAdapter.kt */
    public static final class a extends RecyclerView.e0 {
        public final ImageView l;
        public final TextView m;
        public final TextView n;

        public a(ViewGroup viewGroup) {
            super(tf3.b(viewGroup, R.layout.vk_scope_item, viewGroup, false));
            this.l = (ImageView) this.itemView.findViewById(R.id.vk_scope_item_icon);
            this.m = (TextView) this.itemView.findViewById(R.id.vk_scope_item_title);
            this.n = (TextView) this.itemView.findViewById(R.id.vk_scope_item_description);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        cnu0 cnu0Var = (cnu0) this.c.get(i);
        TextView textView = aVar2.n;
        ImageView imageView = aVar2.l;
        Integer num = cnu0Var.c;
        if (num == null) {
            f4m.j(imageView);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(num.intValue());
        }
        aVar2.m.setText(cnu0Var.a);
        String str = cnu0Var.b;
        if (str == null) {
            f4m.j(textView);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(viewGroup);
    }
}
