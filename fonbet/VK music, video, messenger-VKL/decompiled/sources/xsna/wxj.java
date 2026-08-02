package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.stat.scheme.SchemeStat$TypeUniversalWidget;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.uniwidgets.blocks.BaseBlock;
import com.vk.superapp.ui.uniwidgets.blocks.CounterBlock;
import com.vk.superapp.ui.uniwidgets.blocks.TextBlock;
import com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge;
import com.vk.superapp.ui.uniwidgets.dto.CounterUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.UniversalWidget;
import com.vk.superapp.ui.views.NoTrackingGridLayoutManager;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.g4q0;
import xsna.j3q0;
import xsna.u7n0;
import xsna.w1w0;

/* compiled from: CounterUniConstructor.kt */
/* loaded from: classes6.dex */
public final class wxj extends j3q0<CounterUniWidget> {
    public final g4q0.a h;
    public final w1w0.a i;
    public View j;
    public RecyclerView k;
    public View l;

    /* compiled from: CounterUniConstructor.kt */
    public static final class a extends qfh0<CounterBlock, b> {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return 3;
        }

        @Override // xsna.qfh0
        public final pfh0 x0(LinearLayout linearLayout, int i) {
            boolean z = getItemCount() < 3;
            j3q0<? extends UniversalWidget> j3q0Var = this.e;
            if (j3q0Var == null) {
                j3q0Var = null;
            }
            u7n0 u7n0Var = this.f;
            return new b(linearLayout, z, j3q0Var, u7n0Var != null ? u7n0Var : null);
        }
    }

    /* compiled from: CounterUniConstructor.kt */
    public static final class b extends pfh0<CounterBlock> {
        public final LinearLayout m;
        public final boolean n;
        public final j3q0<? extends UniversalWidget> o;
        public final u7n0 p;
        public WebAction q;

        /* compiled from: CounterUniConstructor.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CounterBlock.Order.values().length];
                try {
                    iArr[CounterBlock.Order.CLASSIC.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CounterBlock.Order.CENTERED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CounterBlock.Order.INVERSE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b(LinearLayout linearLayout, boolean z, j3q0<? extends UniversalWidget> j3q0Var, u7n0 u7n0Var) {
            super(linearLayout);
            this.m = linearLayout;
            this.n = z;
            this.o = j3q0Var;
            this.p = u7n0Var;
            float f = 6;
            linearLayout.setPadding(iah0.a(12), iah0.a(f), iah0.a(10), iah0.a(f));
            linearLayout.setGravity(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.pfh0
        public final void V5(CounterBlock counterBlock, UniversalWidget universalWidget, j3q0 j3q0Var, u7n0 u7n0Var) {
            ArrayList a2;
            CounterBlock counterBlock2 = counterBlock;
            this.q = counterBlock2.f;
            int a3 = this.n ? -1 : iah0.a(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
            LinearLayout linearLayout = this.m;
            linearLayout.removeAllViews();
            SuperappTextStylesBridge superappTextStylesBridge = m3q0.c;
            if (superappTextStylesBridge == null) {
                superappTextStylesBridge = null;
            }
            Pair pair = new Pair(counterBlock2.c, superappTextStylesBridge.b());
            TextBlock textBlock = counterBlock2.d;
            SuperappTextStylesBridge superappTextStylesBridge2 = m3q0.c;
            if (superappTextStylesBridge2 == null) {
                superappTextStylesBridge2 = null;
            }
            Pair pair2 = new Pair(textBlock, superappTextStylesBridge2.f());
            TextBlock textBlock2 = counterBlock2.e;
            SuperappTextStylesBridge superappTextStylesBridge3 = m3q0.c;
            if (superappTextStylesBridge3 == null) {
                superappTextStylesBridge3 = null;
            }
            Pair pair3 = new Pair(textBlock2, superappTextStylesBridge3.g());
            int i = a.$EnumSwitchMapping$0[counterBlock2.b.ordinal()];
            if (i == 1) {
                a2 = e43.a(pair, pair2, pair3);
            } else if (i == 2) {
                a2 = e43.a(pair2, pair, pair3);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                a2 = e43.a(pair2, pair3, pair);
            }
            Iterator it = j5g.W0(a2).iterator();
            while (true) {
                ztw ztwVar = (ztw) it;
                if (!ztwVar.b.hasNext()) {
                    break;
                }
                T t = ((xtw) ztwVar.next()).b;
                TextBlock textBlock3 = (TextBlock) ((Pair) t).i();
                if (textBlock3 != null) {
                    TextView textView = new TextView(linearLayout.getContext());
                    textView.setId(R.id.vk_uni_widget_counter_text);
                    textView.setLayoutParams(new LinearLayout.LayoutParams(a3, -2));
                    textView.setMaxLines(1);
                    this.o.i(textView, textBlock3, (SuperappTextStylesBridge.a) ((Pair) t).j());
                    linearLayout.addView(textView);
                }
            }
            boolean z = this.q != null;
            ViewGroup viewGroup = this.l;
            if (z) {
                viewGroup.setBackgroundResource(R.drawable.vk_highlight_radius_8);
            } else {
                viewGroup.setBackground(null);
            }
            l3q0.a(linearLayout, this.q, new u7n0.a(universalWidget, SchemeStat$TypeUniversalWidget.ElementUiType.ITEM, getAdapterPosition(), 8), this.p);
        }
    }

    public wxj(g4q0.a aVar, w1w0.a aVar2) {
        this.h = aVar;
        this.i = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.constraintlayout.widget.b] */
    /* JADX WARN: Type inference failed for: r11v0, types: [xsna.j3q0, xsna.j3q0<? extends com.vk.superapp.ui.uniwidgets.dto.UniversalWidget>, xsna.wxj] */
    @Override // xsna.j3q0
    public final cpx0 k(Context context) {
        RecyclerView.o linearLayoutManager;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.vk_uni_widget_counter);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        a(constraintLayout);
        b(constraintLayout);
        Object obj = this.b;
        BaseBlock baseBlock = ((CounterUniWidget) (obj != null ? obj : null)).s;
        Object obj2 = obj;
        if (obj == null) {
            obj2 = null;
        }
        j3q0.b t = t(baseBlock, ((CounterUniWidget) obj2).v, context, constraintLayout);
        this.j = t.a;
        ?? bVar = new androidx.constraintlayout.widget.b();
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.vk_uni_widget_recycler);
        recyclerView.setLayoutParams(new ConstraintLayout.b(-1, -2));
        Object obj3 = this.b;
        if (obj3 == null) {
            obj3 = null;
        }
        List<CounterBlock> list = ((CounterUniWidget) obj3).t;
        a aVar = new a();
        aVar.c = list;
        UniversalWidget universalWidget = this.b;
        if (universalWidget == null) {
            universalWidget = null;
        }
        aVar.d = universalWidget;
        aVar.e = this;
        aVar.f = this.i;
        recyclerView.setAdapter(aVar);
        recyclerView.setPadding(0, 0, 0, 0);
        Object obj4 = this.b;
        if (obj4 == null) {
            obj4 = null;
        }
        if (((CounterUniWidget) obj4).t.size() < 3) {
            Object obj5 = this.b;
            if (obj5 == null) {
                obj5 = null;
            }
            linearLayoutManager = new NoTrackingGridLayoutManager(((CounterUniWidget) obj5).t.size(), 1);
        } else {
            linearLayoutManager = new LinearLayoutManager(0, false);
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        constraintLayout.addView(recyclerView);
        bVar.i(constraintLayout);
        int id = recyclerView.getId();
        View view = this.j;
        if (view == null) {
            view = null;
        }
        bVar.k(id, 3, view.getId(), 4);
        bVar.k(recyclerView.getId(), 6, 0, 6);
        bVar.k(recyclerView.getId(), 7, 0, 7);
        bVar.b(constraintLayout);
        float f = 4;
        awt0.b(iah0.a(f), recyclerView);
        awt0.a(iah0.a(f), recyclerView);
        this.k = recyclerView;
        Object obj6 = this.b;
        BaseBlock baseBlock2 = ((CounterUniWidget) (obj6 != null ? obj6 : null)).u;
        Object obj7 = obj6;
        if (obj6 == null) {
            obj7 = null;
        }
        this.l = s(baseBlock2, context, constraintLayout, ((CounterUniWidget) obj7).r.f.d, true);
        androidx.constraintlayout.widget.b a2 = pq.a(constraintLayout);
        View view2 = this.l;
        if (view2 == null) {
            view2 = null;
        }
        int id2 = view2.getId();
        RecyclerView recyclerView2 = this.k;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        a2.k(id2, 3, recyclerView2.getId(), 4);
        a2.b(constraintLayout);
        View view3 = this.j;
        return new cpx0(constraintLayout, view3 == null ? null : view3, t.b, t.c, null);
    }

    @Override // xsna.j3q0
    public final u7n0 o() {
        return this.i;
    }

    @Override // xsna.j3q0
    public final g4q0.a r() {
        return this.h;
    }
}
