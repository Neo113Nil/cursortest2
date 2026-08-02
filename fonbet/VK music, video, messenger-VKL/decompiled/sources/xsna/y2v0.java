package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: VkLoginConfirmationInfoAdapter.kt */
/* loaded from: classes15.dex */
public final class y2v0 extends RecyclerView.Adapter<a> {
    public final ArrayList c = new ArrayList();

    /* compiled from: VkLoginConfirmationInfoAdapter.kt */
    public static final class a extends RecyclerView.e0 {
        public final TextView l;
        public final TextView m;

        public a(ViewGroup viewGroup) {
            super(tf3.b(viewGroup, R.layout.vk_login_confirmation_item, viewGroup, false));
            this.l = (TextView) this.itemView.findViewById(R.id.login_confirmation_info_title);
            this.m = (TextView) this.itemView.findViewById(R.id.login_confirmation_info_subtitle);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        t2v0 t2v0Var = (t2v0) this.c.get(i);
        aVar2.l.setText(t2v0Var.a);
        aVar2.m.setText(t2v0Var.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(viewGroup);
    }
}
