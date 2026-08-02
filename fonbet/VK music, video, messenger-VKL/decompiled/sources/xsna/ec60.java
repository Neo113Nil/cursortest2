package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.api.data.NewsfeedList;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NewsListsAdapter.kt */
/* loaded from: classes4.dex */
public final class ec60 extends zoj0<ls60, RecyclerView.e0> {
    public int e;
    public NewsfeedList f;
    public vob g;
    public vbv h;

    /* compiled from: NewsListsAdapter.kt */
    public static final class a extends vif0<s3q0> {
        public final View n;

        public a(ViewGroup viewGroup) {
            super(viewGroup, R.layout.newsfeed_menu_lists_footer, 0);
            this.n = this.itemView.findViewById(R.id.dot);
        }

        @Override // xsna.vif0
        public final void i6(s3q0 s3q0Var) {
            ce60.b.getClass();
            bwt0.p0(this.n, !ce60.f.isEmpty());
        }
    }

    /* compiled from: NewsListsAdapter.kt */
    public static final class b extends vif0<ls60> {
        public final ImageView n;
        public final TextView o;
        public final View p;

        public b(ViewGroup viewGroup) {
            super(viewGroup, R.layout.newsfeed_menu_lists_item, 0);
            this.n = (ImageView) this.itemView.findViewById(R.id.icon);
            this.o = (TextView) this.itemView.findViewById(R.id.title);
            this.p = this.itemView.findViewById(R.id.check);
        }

        @Override // xsna.vif0
        public final void i6(ls60 ls60Var) {
            ls60 ls60Var2 = ls60Var;
            this.o.setText(ls60Var2.a.d);
            this.n.setImageResource(ls60Var2.b);
        }
    }

    public final NewsfeedList K0() {
        return this.f;
    }

    public final void L0(int i, ArrayList arrayList) {
        this.e = i;
        if (i <= -10) {
            this.e = 0;
        }
        setItems(arrayList);
    }

    public final void N0(vbv vbvVar) {
        this.h = vbvVar;
    }

    public final void O0(vob vobVar) {
        this.g = vobVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        if (!(e0Var instanceof b)) {
            if (e0Var instanceof a) {
                ((a) e0Var).V5(s3q0.a);
                return;
            }
            return;
        }
        ls60 ls60Var = (ls60) this.c.c(i);
        if (ls60Var == null) {
            return;
        }
        b bVar = (b) e0Var;
        boolean f = epx.f(this.f, ls60Var.a);
        bVar.V5(ls60Var);
        bwt0.p0(bVar.p, f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.e0 aVar;
        if (i == 0) {
            aVar = new b(viewGroup);
            bwt0.i0(aVar.itemView, new mm1(19, this, aVar));
        } else {
            aVar = new a(viewGroup);
            bwt0.i0(aVar.itemView, new nl30(this, 7));
        }
        bwt0.V(aVar.itemView, new fg1(20, aVar.itemView.getContext(), aVar));
        return aVar;
    }

    @Override // xsna.zoj0, xsna.uuk
    public final void setItems(List<ls60> list) {
        Object obj;
        if (this.f == null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((ls60) obj).a.b == this.e) {
                        break;
                    }
                }
            }
            ls60 ls60Var = (ls60) obj;
            this.f = ls60Var != null ? ls60Var.a : null;
        }
        super.setItems(list);
    }
}
