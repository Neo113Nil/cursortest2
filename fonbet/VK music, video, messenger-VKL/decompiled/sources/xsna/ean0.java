package xsna;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.lists.ListDataSet;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.views.horizontalscroll.MiniWidgetsSpreaderLayoutManagerV2;
import com.vk.superapp.ui.widgets.miniwidgets.MiniWidgetItem;
import com.vk.superapp.ui.widgets.miniwidgets.SuperAppMiniWidget;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: SuperAppMiniWidgetsScrollHolder.kt */
/* loaded from: classes6.dex */
public final class ean0 extends ucn0<fan0> implements jr20 {
    public static final int t = iah0.a(8);
    public final ayu0 p;
    public final u7n0 q;
    public final a r;
    public final RecyclerView s;

    /* compiled from: SuperAppMiniWidgetsScrollHolder.kt */
    public final class a extends gf6<bjf0> {

        /* compiled from: SuperAppMiniWidgetsScrollHolder.kt */
        /* renamed from: xsna.ean0$a$a, reason: collision with other inner class name */
        public final class C2791a extends m.b {
            public final List<bjf0> b;
            public final ArrayList c;

            public C2791a(ListDataSet.ArrayListImpl arrayListImpl, ArrayList arrayList) {
                this.b = arrayListImpl;
                this.c = arrayList;
            }

            @Override // androidx.recyclerview.widget.m.b
            public final boolean areContentsTheSame(int i, int i2) {
                return epx.f(this.b.get(i), this.c.get(i2));
            }

            @Override // androidx.recyclerview.widget.m.b
            public final boolean areItemsTheSame(int i, int i2) {
                return epx.f(this.b.get(i).a.g(), ((bjf0) this.c.get(i2)).a.g());
            }

            @Override // androidx.recyclerview.widget.m.b
            public final int getNewListSize() {
                return this.c.size();
            }

            @Override // androidx.recyclerview.widget.m.b
            public final int getOldListSize() {
                return this.b.size();
            }
        }

        public a() {
            super(false);
        }

        @Override // xsna.gf6
        public final hf6 K0(int i, View view) {
            ean0 ean0Var = ean0.this;
            return i == R.layout.vk_super_app_exchange_mini_widget_element ? new g2q(view, ean0Var) : i == R.layout.vk_super_app_mini_widgets_settings_element ? new z2j0(view, ean0Var) : new uil(view, ean0Var.p, ean0Var);
        }
    }

    public ean0(View view, ayu0 ayu0Var, u7n0 u7n0Var) {
        super(view, null);
        this.p = ayu0Var;
        this.q = u7n0Var;
        a aVar = new a();
        this.r = aVar;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.rv_mini_widgets_scroll);
        this.itemView.getContext();
        recyclerView.setLayoutManager(new MiniWidgetsSpreaderLayoutManagerV2(0, false));
        recyclerView.addItemDecoration(new xux(t));
        recyclerView.setAdapter(aVar);
        this.s = recyclerView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.jr20
    public final void A4(WebAction webAction, int i) {
        Context context = this.itemView.getContext();
        Object obj = this.l;
        Object obj2 = obj;
        if (obj == null) {
            obj2 = null;
        }
        this.q.x(context, (z8n0) obj2, webAction, i, false);
        this.s.smoothScrollToPosition(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.jr20
    public final void P0(WebAction webAction, int i) {
        Context context = this.itemView.getContext();
        Object obj = this.l;
        Object obj2 = obj;
        if (obj == null) {
            obj2 = null;
        }
        this.q.x(context, (z8n0) obj2, webAction, i, true);
        this.s.smoothScrollToPosition(0);
    }

    @Override // xsna.hf6
    public final void W5(zif0 zif0Var) {
        SuperAppMiniWidget superAppMiniWidget = ((fan0) zif0Var).e;
        ArrayList<MiniWidgetItem> arrayList = superAppMiniWidget.n.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new bjf0((MiniWidgetItem) it.next(), superAppMiniWidget.o));
        }
        a aVar = this.r;
        ListDataSet.ArrayListImpl<T> arrayListImpl = ((ListDataSet) aVar.c).d;
        m.d a2 = androidx.recyclerview.widget.m.a(new a.C2791a(arrayListImpl, new ArrayList(arrayList2)), true);
        arrayListImpl.clear();
        arrayListImpl.addAll(arrayList2);
        a2.b(aVar);
        this.s.scrollToPosition(0);
    }

    @Override // xsna.jr20
    public final void e2(String str) {
        this.q.x0(str);
    }
}
