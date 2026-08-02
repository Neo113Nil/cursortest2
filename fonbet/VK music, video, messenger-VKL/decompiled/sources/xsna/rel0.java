package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: StickyContainerDelegate.kt */
/* loaded from: classes16.dex */
public final class rel0 {
    public final com.vk.catalog2.common.ui.mvp.holder.container.b a;
    public RecyclerView b;
    public FrameLayout c;
    public int d;
    public final Stack<a> e = new Stack<>();
    public final sel0 f = new sel0(this);

    /* compiled from: StickyContainerDelegate.kt */
    public static final class a {
        public final CatalogViewHolder a;
        public final View b;
        public final int c;

        public a(CatalogViewHolder catalogViewHolder, View view, int i) {
            this.a = catalogViewHolder;
            this.b = view;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HolderWithPosition(holder=");
            sb.append(this.a);
            sb.append(", view=");
            sb.append(this.b);
            sb.append(", adapterPosition=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public rel0(com.vk.catalog2.common.ui.mvp.holder.container.b bVar) {
        this.a = bVar;
    }

    public final void a(int i) {
        CatalogViewHolder w;
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            com.vk.catalog2.common.ui.mvp.holder.container.b bVar = this.a;
            if (bVar.b(i)) {
                UIBlock uIBlock = (UIBlock) ((ArrayList) bVar.a.i.y0()).get(i);
                w = bVar.b.w(uIBlock.e, uIBlock.d, uIBlock.l, uIBlock, bVar.c);
            } else {
                w = null;
            }
            if (w == null) {
                s3q0 s3q0Var = s3q0.a;
                return;
            }
            View k5 = w.k5(LayoutInflater.from(frameLayout.getContext()), frameLayout, null);
            bVar.a(w, i);
            this.e.add(new a(w, k5, i));
            c();
        }
    }

    public final void b() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int i = 0;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(0));
            this.e.clear();
            if (childAdapterPosition >= 0) {
                while (true) {
                    if (this.a.c(i)) {
                        a(i);
                    }
                    if (i == childAdapterPosition) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final s3q0 c() {
        FrameLayout frameLayout = this.c;
        if (frameLayout == null) {
            return null;
        }
        frameLayout.removeAllViews();
        Stack<a> stack = this.e;
        if (stack.isEmpty()) {
            return s3q0.a;
        }
        a peek = stack.peek();
        CatalogViewHolder catalogViewHolder = peek.a;
        View view = peek.b;
        this.a.a(catalogViewHolder, peek.c);
        frameLayout.addView(view);
        return s3q0.a;
    }
}
