package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.dto.common.LinkButton;
import com.vk.dto.discover.carousel.Carousel;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;

/* compiled from: CarouselHolder.kt */
/* loaded from: classes4.dex */
public abstract class vu9<T extends Carousel<?>> extends qi6<T> {
    public static final int I = iah0.a(8);
    public final RecyclerView.Adapter<?> C;
    public final TextView D;
    public final VkSimpleButton E;
    public final RecyclerView F;
    public final int G;
    public final uu9 H;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vu9(ViewGroup viewGroup, int i, RecyclerView.Adapter adapter) {
        this(viewGroup, i, adapter, new LinearLayoutManager(0, false));
        viewGroup.getContext();
    }

    public final void R6(T t) {
        TextView textView = this.D;
        if (textView != null) {
            textView.setText(t.getTitle());
        }
        VkSimpleButton vkSimpleButton = this.E;
        if (vkSimpleButton != null) {
            LinkButton linkButton = t.i;
            vkSimpleButton.setText(linkButton != null ? linkButton.b : null);
        }
        s1c0 s1c0Var = this.x;
        if (s1c0Var == null || !s1c0Var.c) {
            b.d dVar = new b.d("view_block");
            dVar.b = true;
            dVar.c = true;
            StringBuilder sb = new StringBuilder("carousel|");
            sb.append(getAdapterPosition());
            sb.append('|');
            xuo0.a.getClass();
            sb.append(xuo0.c());
            sb.append("|discover_full|");
            sb.append(t.l);
            dVar.b(sb.toString(), "blocks");
            dVar.e();
        }
    }

    public vu9(ViewGroup viewGroup, int i, RecyclerView.Adapter adapter, LinearLayoutManager linearLayoutManager) {
        super(i, viewGroup);
        this.C = adapter;
        this.D = (TextView) this.itemView.findViewById(R.id.tv_title);
        VkSimpleButton vkSimpleButton = (VkSimpleButton) this.itemView.findViewById(R.id.btn_show_all);
        this.E = vkSimpleButton;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.recycler);
        this.F = recyclerView;
        this.G = I;
        uu9 uu9Var = new uu9(this);
        this.H = uu9Var;
        bwt0.e0(this.itemView, 0, 0, 0, 0);
        this.itemView.setBackground(null);
        if (vkSimpleButton != null) {
            vkSimpleButton.setOnClickListener(new q01(this, 1));
        }
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(uu9Var);
    }
}
