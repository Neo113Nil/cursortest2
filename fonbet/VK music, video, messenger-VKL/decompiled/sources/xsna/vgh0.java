package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.image.VKImageController;
import com.vk.stat.scheme.SchemeStat$TypeUniversalWidget;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.bridges.SuperappUiDesignBridge;
import com.vk.superapp.ui.uniwidgets.blocks.BadgeBlock;
import com.vk.superapp.ui.uniwidgets.blocks.BaseBlock;
import com.vk.superapp.ui.uniwidgets.blocks.HorizontalAlignment;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ScrollItemBlock;
import com.vk.superapp.ui.uniwidgets.blocks.TextBlock;
import com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge;
import com.vk.superapp.ui.uniwidgets.dto.ScrollUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.UniversalWidget;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.g4q0;
import xsna.j3q0;
import xsna.u7n0;
import xsna.w1w0;

/* compiled from: ScrollUniConstructor.kt */
/* loaded from: classes6.dex */
public final class vgh0 extends j3q0<ScrollUniWidget> {
    public final g4q0.a h;
    public final w1w0.a i;
    public View j;
    public RecyclerView k;
    public View l;

    /* compiled from: ScrollUniConstructor.kt */
    public static final class a extends qfh0<ScrollItemBlock, c> {
        public final ScrollItemBlock.Style g;

        public a(ScrollItemBlock.Style style) {
            this.g = style;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return this.g.b == ScrollItemBlock.Size.REGULAR ? 1 : 2;
        }

        @Override // xsna.qfh0, androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            ConstraintLayout constraintLayout = new ConstraintLayout(viewGroup.getContext());
            constraintLayout.setLayoutParams(new ConstraintLayout.b(-2, -2));
            return new c(constraintLayout, i == 2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.qfh0
        public final pfh0 x0(LinearLayout linearLayout, int i) {
            return new c((ConstraintLayout) linearLayout, i == 2);
        }

        @Override // xsna.qfh0
        /* renamed from: y0 */
        public final pfh0 onCreateViewHolder(int i, ViewGroup viewGroup) {
            ConstraintLayout constraintLayout = new ConstraintLayout(viewGroup.getContext());
            constraintLayout.setLayoutParams(new ConstraintLayout.b(-2, -2));
            return new c(constraintLayout, i == 2);
        }
    }

    /* compiled from: ScrollUniConstructor.kt */
    public static final class b implements f13 {
    }

    /* compiled from: ScrollUniConstructor.kt */
    public static final class c extends pfh0<ScrollItemBlock> {
        public static final int x;
        public static final int y;
        public final ConstraintLayout m;
        public final View n;
        public final TextView o;
        public final VKImageController<View> p;
        public final TextView q;
        public final TextView r;
        public WebAction s;
        public final VKImageController<View> t;
        public final SuperappTextStylesBridge.a u;
        public j3q0<? extends UniversalWidget> v;
        public u7n0 w;

        /* compiled from: ScrollUniConstructor.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HorizontalAlignment.values().length];
                try {
                    iArr[HorizontalAlignment.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HorizontalAlignment.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HorizontalAlignment.RIGHT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        static {
            thn0 thn0Var = m3q0.b;
            if (thn0Var == null) {
                thn0Var = null;
            }
            x = iah0.a(thn0Var.a.b.c.a);
            y = iah0.a((m3q0.b != null ? r0 : null).a.b.b.a + 8);
        }

        public c(ConstraintLayout constraintLayout, boolean z) {
            super(constraintLayout);
            SuperappTextStylesBridge.a c;
            int i;
            this.m = constraintLayout;
            if (z) {
                SuperappTextStylesBridge superappTextStylesBridge = m3q0.c;
                c = (superappTextStylesBridge == null ? null : superappTextStylesBridge).g();
            } else {
                SuperappTextStylesBridge superappTextStylesBridge2 = m3q0.c;
                c = (superappTextStylesBridge2 == null ? null : superappTextStylesBridge2).c();
            }
            this.u = c;
            int a2 = iah0.a(z ? 6 : 4);
            ifx0 ifx0Var = e370.c;
            VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(constraintLayout.getContext());
            this.t = create;
            ifx0 ifx0Var2 = e370.c;
            VKImageController<View> create2 = (ifx0Var2 == null ? null : ifx0Var2).b().create(constraintLayout.getContext());
            this.p = create2;
            View view = ((com.vk.core.ui.image.c) create).getView();
            view.setId(R.id.vk_uni_widget_scroll_item_icon);
            constraintLayout.addView(view);
            androidx.constraintlayout.widget.b a3 = pq.a(constraintLayout);
            a3.l(view.getId(), 6, 0, 6, a2);
            a3.l(view.getId(), 7, 0, 7, a2);
            a3.l(view.getId(), 3, 0, 3, 0);
            a3.k(view.getId(), 4, R.id.vk_uni_widget_scroll_item_title, 3);
            a3.D(view.getId(), 4, 0);
            a3.b(constraintLayout);
            this.n = view;
            int i2 = j3q0.d;
            TextView c2 = j3q0.a.c(constraintLayout.getContext());
            int a4 = iah0.a(z ? 2 : 4);
            if (z) {
                thn0 thn0Var = m3q0.b;
                i = (thn0Var == null ? null : thn0Var).a.b.c.a - 8;
            } else {
                thn0 thn0Var2 = m3q0.b;
                i = (thn0Var2 == null ? null : thn0Var2).a.b.b.a;
            }
            int a5 = iah0.a(i);
            constraintLayout.addView(c2);
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.i(constraintLayout);
            bVar.l(c2.getId(), 3, view.getId(), 3, j3q0.f);
            bVar.l(c2.getId(), 7, 0, 7, a4);
            bVar.l(c2.getId(), 6, 0, 6, a4);
            bVar.m(c2.getId(), 1);
            bVar.o(c2.getId(), a5);
            bVar.b(constraintLayout);
            this.o = c2;
            View view2 = ((com.vk.core.ui.image.c) create2).getView();
            view2.setId(R.id.vk_uni_widget_scroll_item_icon_badge);
            constraintLayout.addView(view2);
            androidx.constraintlayout.widget.b a6 = pq.a(constraintLayout);
            a6.l(view2.getId(), 6, view.getId(), 6, 0);
            a6.l(view2.getId(), 7, view.getId(), 7, 0);
            a6.l(view2.getId(), 3, view.getId(), 3, 0);
            a6.l(view2.getId(), 4, view.getId(), 4, 0);
            a6.p(view2.getId(), 0);
            a6.n(view2.getId(), 0);
            a6.b(constraintLayout);
            int i3 = z ? x : y;
            TextView textView = new TextView(constraintLayout.getContext());
            textView.setId(R.id.vk_uni_widget_scroll_item_title);
            textView.setLayoutParams(new LinearLayout.LayoutParams(i3, -2));
            textView.setMaxLines(2);
            gfx0 gfx0Var = e370.b;
            (gfx0Var == null ? null : gfx0Var).b(textView, SuperappUiDesignBridge.FontFamily.REGULAR);
            int a7 = iah0.a(z ? 9 : 6);
            constraintLayout.addView(textView);
            androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
            bVar2.i(constraintLayout);
            bVar2.p(textView.getId(), i3);
            bVar2.l(textView.getId(), 6, 0, 6, a2);
            bVar2.l(textView.getId(), 7, 0, 7, a2);
            bVar2.l(textView.getId(), 3, view.getId(), 4, a7);
            bVar2.k(textView.getId(), 4, 0, 4);
            bVar2.b(constraintLayout);
            this.q = textView;
            TextView textView2 = new TextView(constraintLayout.getContext());
            textView2.setId(R.id.vk_uni_widget_scroll_item_desc);
            textView2.setLayoutParams(new LinearLayout.LayoutParams(i3, -2));
            textView2.setMaxLines(2);
            gfx0 gfx0Var2 = e370.b;
            (gfx0Var2 == null ? null : gfx0Var2).b(textView2, SuperappUiDesignBridge.FontFamily.REGULAR);
            constraintLayout.addView(textView2);
            androidx.constraintlayout.widget.b bVar3 = new androidx.constraintlayout.widget.b();
            bVar3.i(constraintLayout);
            bVar3.p(textView2.getId(), i3);
            bVar3.l(textView2.getId(), 6, 0, 6, a2);
            bVar3.l(textView2.getId(), 7, 0, 7, a2);
            bVar3.k(textView2.getId(), 3, textView.getId(), 4);
            bVar3.b(constraintLayout);
            this.r = textView2;
        }

        @Override // xsna.pfh0
        public final void V5(ScrollItemBlock scrollItemBlock, UniversalWidget universalWidget, j3q0 j3q0Var, u7n0 u7n0Var) {
            ScrollItemBlock scrollItemBlock2 = scrollItemBlock;
            this.s = scrollItemBlock2.f;
            this.v = j3q0Var;
            this.w = u7n0Var;
            ImageBlock imageBlock = scrollItemBlock2.b;
            int i = j3q0.d;
            ImageBlock.Style style = imageBlock.e;
            View view = this.n;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = z6j.f(style);
            layoutParams.height = iah0.a(z6j.e(style.b, z6j.c(style)) != null ? r1.b : 0);
            view.setLayoutParams(layoutParams);
            j3q0<? extends UniversalWidget> j3q0Var2 = this.v;
            j3q0.h(j3q0Var2 == null ? null : j3q0Var2, this.t, imageBlock, null, null, 12);
            BadgeBlock badgeBlock = scrollItemBlock2.e;
            int f = z6j.f(style);
            float d = z6j.d(style);
            ConstraintLayout constraintLayout = this.m;
            VKImageController<View> vKImageController = this.p;
            TextView textView = this.o;
            if (badgeBlock != null) {
                j3q0<? extends UniversalWidget> j3q0Var3 = this.v;
                if (j3q0Var3 == null) {
                    j3q0Var3 = null;
                }
                j3q0.c cVar = new j3q0.c(f, d);
                j3q0Var3.getClass();
                j3q0.c(badgeBlock, vKImageController, textView, constraintLayout, cVar);
            } else {
                f4m.j(textView);
                vKImageController.clear();
            }
            HorizontalAlignment horizontalAlignment = ((ScrollUniWidget) universalWidget).t.c;
            TextBlock textBlock = scrollItemBlock2.c;
            TextView textView2 = this.q;
            W5(textView2, textBlock, horizontalAlignment);
            W5(this.r, scrollItemBlock2.d, horizontalAlignment);
            textView2.setMinLines(2);
            u7n0 u7n0Var2 = this.w;
            l3q0.a(constraintLayout, this.s, new u7n0.a(universalWidget, SchemeStat$TypeUniversalWidget.ElementUiType.ITEM, getAdapterPosition(), true), u7n0Var2 != null ? u7n0Var2 : null);
        }

        public final void W5(TextView textView, TextBlock textBlock, HorizontalAlignment horizontalAlignment) {
            if (textBlock == null) {
                textView.setVisibility(8);
                return;
            }
            int i = a.$EnumSwitchMapping$0[horizontalAlignment.ordinal()];
            int i2 = 3;
            if (i != 1) {
                if (i == 2) {
                    i2 = 1;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 5;
                }
            }
            textView.setGravity(i2);
            j3q0<? extends UniversalWidget> j3q0Var = this.v;
            if (j3q0Var == null) {
                j3q0Var = null;
            }
            j3q0Var.i(textView, textBlock, this.u);
        }
    }

    public vgh0(g4q0.a aVar, w1w0.a aVar2) {
        this.h = aVar;
        this.i = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.constraintlayout.widget.b] */
    /* JADX WARN: Type inference failed for: r14v0, types: [xsna.j3q0, xsna.j3q0<? extends com.vk.superapp.ui.uniwidgets.dto.UniversalWidget>, xsna.vgh0] */
    /* JADX WARN: Type inference failed for: r3v5, types: [T extends com.vk.superapp.ui.uniwidgets.dto.UniversalWidget] */
    @Override // xsna.j3q0
    public final cpx0 k(Context context) {
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.vk_uni_widget_scroll);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        a(constraintLayout);
        b(constraintLayout);
        Object obj = this.b;
        BaseBlock baseBlock = ((ScrollUniWidget) (obj != null ? obj : null)).s;
        Object obj2 = obj;
        if (obj == null) {
            obj2 = null;
        }
        j3q0.b t = t(baseBlock, ((ScrollUniWidget) obj2).w, context, constraintLayout);
        this.j = t.a;
        ?? bVar = new androidx.constraintlayout.widget.b();
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.vk_uni_widget_recycler);
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutParams(new ConstraintLayout.b(-1, -2));
        Object obj3 = this.b;
        if (obj3 == null) {
            obj3 = null;
        }
        a aVar = new a(((ScrollUniWidget) obj3).t);
        ?? r3 = this.b;
        aVar.c = (r3 != 0 ? r3 : null).u;
        UniversalWidget universalWidget = r3;
        if (r3 == 0) {
            universalWidget = null;
        }
        aVar.d = universalWidget;
        aVar.e = this;
        aVar.f = this.i;
        recyclerView.setAdapter(aVar);
        Object obj4 = this.b;
        if (obj4 == null) {
            obj4 = null;
        }
        int a2 = iah0.a(((ScrollUniWidget) obj4).t.b == ScrollItemBlock.Size.REGULAR ? 4 : 6);
        recyclerView.setPadding(a2, 0, a2, iah0.a(2));
        int i = this.h.b;
        a aVar2 = (a) recyclerView.getAdapter();
        aVar2.getClass();
        int i2 = c.x;
        boolean z = aVar2.g.b == ScrollItemBlock.Size.LARGE;
        recyclerView.addItemDecoration(new ofh0(i, (iah0.a(z ? 6 : 4) * 2) + (z ? c.x : c.y), a2));
        awt0.g(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
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
        awt0.b(iah0.a(10), recyclerView);
        awt0.a(iah0.a(4), recyclerView);
        this.k = recyclerView;
        Object obj5 = this.b;
        BaseBlock baseBlock2 = ((ScrollUniWidget) (obj5 != null ? obj5 : null)).v;
        Object obj6 = obj5;
        if (obj5 == null) {
            obj6 = null;
        }
        View s = s(baseBlock2, context, constraintLayout, ((ScrollUniWidget) obj6).r.g.d, true);
        this.l = s;
        androidx.constraintlayout.widget.b a3 = pq.a(constraintLayout);
        RecyclerView recyclerView2 = this.k;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        a3.h(recyclerView2.getId(), 4);
        int id2 = s.getId();
        RecyclerView recyclerView3 = this.k;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        a3.k(id2, 3, recyclerView3.getId(), 4);
        a3.b(constraintLayout);
        View view2 = this.j;
        return new cpx0(constraintLayout, view2 == null ? null : view2, t.b, t.c, new b());
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
