package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: DraftAdapter.kt */
/* loaded from: classes16.dex */
public final class wco extends androidx.recyclerview.widget.x<ido, a> {
    public final lpj c;
    public final s55 d;

    /* compiled from: DraftAdapter.kt */
    public final class a extends RecyclerView.e0 {
        public final izs<ido, s3q0> l;
        public final VkPicture m;
        public final VkText n;
        public final View o;
        public final View p;

        public a(View view, s55 s55Var) {
            super(view);
            this.l = s55Var;
            this.m = (VkPicture) view.findViewById(R.id.clips_entry_point_draft_item_preview);
            this.n = (VkText) view.findViewById(R.id.clips_entry_point_draft_item_date);
            View findViewById = view.findViewById(R.id.clips_entry_point_shadow);
            this.o = findViewById;
            this.p = view.findViewById(R.id.clips_entry_point_draft_item_template_icon);
            findViewById.setBackground(new ieh0());
        }
    }

    public wco(lpj lpjVar, s55 s55Var) {
        super(xco.a);
        this.c = lpjVar;
        this.d = s55Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        a aVar = (a) e0Var;
        ido item = getItem(i);
        aVar.m.o0(item.b, null);
        aVar.n.setText(pvo0.j(item.c * 1000, false, false));
        awt0.v(aVar.p, item.d != null);
        bwt0.i0(aVar.itemView, new zf1(12, aVar, item));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(this.c).inflate(R.layout.clips_entry_point_draft_item, viewGroup, false), this.d);
    }
}
