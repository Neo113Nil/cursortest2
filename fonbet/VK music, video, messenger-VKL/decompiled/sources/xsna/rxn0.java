package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.image.VKImageController;
import com.vk.stat.scheme.SchemeStat$TypeUniversalWidget;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.bridges.SuperappUiDesignBridge;
import com.vk.superapp.ui.uniwidgets.blocks.AvatarStackBlock;
import com.vk.superapp.ui.uniwidgets.blocks.BaseBlock;
import com.vk.superapp.ui.uniwidgets.blocks.HorizontalAlignment;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import com.vk.superapp.ui.uniwidgets.blocks.TableBlock;
import com.vk.superapp.ui.uniwidgets.blocks.TextBlock;
import com.vk.superapp.ui.uniwidgets.config.SuperappTextStylesBridge;
import com.vk.superapp.ui.uniwidgets.dto.TableRow;
import com.vk.superapp.ui.uniwidgets.dto.TableUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.UniversalWidget;
import com.vk.superapp.ui.views.NoTrackingGridLayoutManager;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.g4q0;
import xsna.j3q0;
import xsna.u7n0;
import xsna.w1w0;

/* compiled from: TableUniConstructor.kt */
/* loaded from: classes6.dex */
public final class rxn0 extends j3q0<TableUniWidget> {
    public static final int m = iah0.a(4);
    public final g4q0.a h;
    public final w1w0.a i;
    public View j;
    public RecyclerView k;
    public View l;

    /* compiled from: TableUniConstructor.kt */
    public final class a extends RecyclerView.Adapter<b> {
        public final ArrayList c;

        public a(ArrayList arrayList) {
            this.c = arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(b bVar, int i) {
            b bVar2 = bVar;
            TableBlock tableBlock = (TableBlock) this.c.get(i);
            rxn0 rxn0Var = rxn0.this;
            UniversalWidget universalWidget = rxn0Var.b;
            if (universalWidget == null) {
                universalWidget = null;
            }
            bVar2.W5(tableBlock, universalWidget, rxn0Var);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new b(new ConstraintLayout(viewGroup.getContext()), rxn0.this.i);
        }
    }

    /* compiled from: TableUniConstructor.kt */
    public static final class b extends pfh0<TableBlock> {
        public final ConstraintLayout m;
        public final u7n0 n;
        public final VKImageController<View> o;
        public WebAction p;
        public final View q;
        public final TextView r;
        public final TextView s;
        public final int t;
        public final vbn0 u;

        /* compiled from: TableUniConstructor.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[HorizontalAlignment.values().length];
                try {
                    iArr[HorizontalAlignment.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HorizontalAlignment.RIGHT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HorizontalAlignment.CENTER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[ImageBlock.Style.Outline.values().length];
                try {
                    iArr2[ImageBlock.Style.Outline.CIRCLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[ImageBlock.Style.Outline.APP.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public b(ConstraintLayout constraintLayout, w1w0.a aVar) {
            super(constraintLayout);
            this.m = constraintLayout;
            this.n = aVar;
            ifx0 ifx0Var = e370.c;
            VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(constraintLayout.getContext());
            this.o = create;
            View view = ((com.vk.core.ui.image.c) create).getView();
            view.setId(R.id.vk_uni_widget_table_icon);
            constraintLayout.addView(view);
            androidx.constraintlayout.widget.b a2 = pq.a(constraintLayout);
            a2.k(view.getId(), 3, 0, 3);
            a2.k(view.getId(), 4, 0, 4);
            a2.b(constraintLayout);
            this.q = view;
            TextView textView = new TextView(constraintLayout.getContext());
            textView.setId(R.id.vk_uni_widget_table_title);
            textView.setMaxLines(3);
            gfx0 gfx0Var = e370.b;
            (gfx0Var == null ? null : gfx0Var).b(textView, SuperappUiDesignBridge.FontFamily.REGULAR);
            constraintLayout.addView(textView);
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.i(constraintLayout);
            bVar.k(textView.getId(), 3, 0, 3);
            bVar.b(constraintLayout);
            this.r = textView;
            TextView textView2 = new TextView(constraintLayout.getContext());
            textView2.setId(R.id.vk_uni_widget_table_subtitle);
            textView2.setMaxLines(3);
            gfx0 gfx0Var2 = e370.b;
            (gfx0Var2 != null ? gfx0Var2 : null).b(textView2, SuperappUiDesignBridge.FontFamily.REGULAR);
            constraintLayout.addView(textView2);
            androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
            bVar2.i(constraintLayout);
            bVar2.k(textView2.getId(), 3, textView.getId(), 4);
            bVar2.b(constraintLayout);
            this.s = textView2;
            this.t = View.generateViewId();
            vbn0 vbn0Var = new vbn0(constraintLayout.getContext());
            vbn0Var.setId(R.id.vk_uni_widget_table_avatars);
            constraintLayout.addView(vbn0Var);
            androidx.constraintlayout.widget.b bVar3 = new androidx.constraintlayout.widget.b();
            bVar3.i(constraintLayout);
            bVar3.p(vbn0Var.getId(), 1);
            bVar3.k(vbn0Var.getId(), 3, 0, 3);
            bVar3.k(vbn0Var.getId(), 4, 0, 4);
            bVar3.b(constraintLayout);
            this.u = vbn0Var;
            int i = rxn0.m;
            constraintLayout.setPadding(i, iah0.a(7), i, iah0.a(6));
        }

        public static int a6(ImageBlock.Style style) {
            int i = a.$EnumSwitchMapping$1[style.c.ordinal()];
            if (i == 1) {
                thn0 thn0Var = m3q0.b;
                return (thn0Var != null ? thn0Var : null).c.a.a;
            }
            if (i != 2) {
                thn0 thn0Var2 = m3q0.b;
                return (thn0Var2 != null ? thn0Var2 : null).c.b.a;
            }
            thn0 thn0Var3 = m3q0.b;
            return (thn0Var3 != null ? thn0Var3 : null).c.c.a;
        }

        @Override // xsna.pfh0
        public final /* bridge */ /* synthetic */ void V5(TableBlock tableBlock, UniversalWidget universalWidget, j3q0 j3q0Var, u7n0 u7n0Var) {
            W5(tableBlock, universalWidget, j3q0Var);
        }

        public final void W5(TableBlock tableBlock, UniversalWidget universalWidget, j3q0 j3q0Var) {
            j3q0 j3q0Var2;
            View view;
            int i;
            boolean z;
            boolean z2;
            int i2;
            float f;
            WebAction webAction = tableBlock.f;
            AvatarStackBlock avatarStackBlock = tableBlock.e;
            this.p = webAction;
            ImageBlock imageBlock = tableBlock.b;
            u7n0 u7n0Var = this.n;
            ConstraintLayout constraintLayout = this.m;
            View view2 = this.q;
            if (imageBlock != null) {
                WebAction webAction2 = imageBlock.f;
                ImageBlock.Style style = imageBlock.e;
                view2.setVisibility(0);
                int a6 = a6(style);
                ImageBlock.Style.Outline outline = style.c;
                int[] iArr = a.$EnumSwitchMapping$1;
                int i3 = iArr[outline.ordinal()];
                if (i3 == 1) {
                    thn0 thn0Var = m3q0.b;
                    if (thn0Var == null) {
                        thn0Var = null;
                    }
                    i2 = thn0Var.c.a.b;
                } else if (i3 != 2) {
                    thn0 thn0Var2 = m3q0.b;
                    if (thn0Var2 == null) {
                        thn0Var2 = null;
                    }
                    i2 = thn0Var2.c.b.b;
                } else {
                    thn0 thn0Var3 = m3q0.b;
                    if (thn0Var3 == null) {
                        thn0Var3 = null;
                    }
                    i2 = thn0Var3.c.c.b;
                }
                j3q0Var.getClass();
                j3q0.u(a6, i2, view2);
                int i4 = iArr[outline.ordinal()];
                if (i4 == 1) {
                    thn0 thn0Var4 = m3q0.b;
                    if (thn0Var4 == null) {
                        thn0Var4 = null;
                    }
                    f = thn0Var4.c.a.c;
                } else if (i4 != 2) {
                    thn0 thn0Var5 = m3q0.b;
                    if (thn0Var5 == null) {
                        thn0Var5 = null;
                    }
                    f = thn0Var5.c.b.c;
                } else {
                    thn0 thn0Var6 = m3q0.b;
                    if (thn0Var6 == null) {
                        thn0Var6 = null;
                    }
                    f = thn0Var6.c.c.c;
                }
                Float valueOf = Float.valueOf(f);
                view = view2;
                i = 8;
                j3q0Var2 = j3q0Var;
                j3q0.h(j3q0Var2, this.o, imageBlock, valueOf, null, 8);
                j3q0.d(style.d, view, constraintLayout);
                if (webAction2 != null) {
                    l3q0.a(view, webAction2, new u7n0.a(universalWidget, SchemeStat$TypeUniversalWidget.ElementUiType.ITEM, getAdapterPosition(), 8), u7n0Var);
                }
            } else {
                j3q0Var2 = j3q0Var;
                view = view2;
                i = 8;
                view.setVisibility(8);
            }
            TextBlock textBlock = tableBlock.c;
            TextView textView = this.r;
            if (textBlock != null) {
                SuperappTextStylesBridge superappTextStylesBridge = m3q0.c;
                if (superappTextStylesBridge == null) {
                    superappTextStylesBridge = null;
                }
                j3q0Var2.i(textView, textBlock, superappTextStylesBridge.i());
                textView.setVisibility(0);
            } else {
                textView.setVisibility(i);
            }
            TextBlock textBlock2 = tableBlock.d;
            TextView textView2 = this.s;
            if (textBlock2 != null) {
                SuperappTextStylesBridge superappTextStylesBridge2 = m3q0.c;
                if (superappTextStylesBridge2 == null) {
                    superappTextStylesBridge2 = null;
                }
                j3q0Var2.i(textView2, textBlock2, superappTextStylesBridge2.g());
                textView2.setVisibility(0);
            } else {
                textView2.setVisibility(i);
            }
            vbn0 vbn0Var = this.u;
            if (avatarStackBlock != null) {
                view.setVisibility(i);
                textView.setVisibility(i);
                textView2.setVisibility(i);
                int i5 = j3q0.d;
                j3q0Var2.e(vbn0Var, avatarStackBlock, null);
            }
            int i6 = a.$EnumSwitchMapping$0[tableBlock.g.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    z = true;
                    androidx.constraintlayout.widget.b a2 = pq.a(constraintLayout);
                    float f2 = i;
                    a2.l(view.getId(), 7, 0, 7, iah0.a(f2));
                    textView.setGravity(8388613);
                    a2.p(textView.getId(), 0);
                    a2.l(textView.getId(), 7, view.getId(), 6, iah0.a(f2));
                    a2.k(textView.getId(), 6, 0, 6);
                    textView2.setGravity(8388613);
                    a2.p(textView2.getId(), 0);
                    a2.l(textView2.getId(), 7, view.getId(), 6, iah0.a(f2));
                    a2.k(textView2.getId(), 6, 0, 6);
                    a2.l(vbn0Var.getId(), 7, 0, 7, iah0.a(f2));
                    a2.b(constraintLayout);
                } else {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ImageBlock.Style style2 = imageBlock != null ? imageBlock.e : null;
                    androidx.constraintlayout.widget.b a3 = pq.a(constraintLayout);
                    int a4 = (!f4m.h(view) || style2 == null) ? 0 : iah0.a(a6(style2) + i);
                    z = true;
                    textView.setGravity(1);
                    a3.p(textView.getId(), 0);
                    a3.m(textView.getId(), 1);
                    a3.k(textView.getId(), 7, 0, 7);
                    a3.l(textView.getId(), 6, 0, 6, a4);
                    textView2.setGravity(1);
                    a3.p(textView2.getId(), 0);
                    a3.m(textView2.getId(), 1);
                    a3.k(textView2.getId(), 7, 0, 7);
                    a3.l(textView2.getId(), 6, 0, 6, a4);
                    a3.r(this.t, 5, 0, textView.getId(), textView2.getId());
                    float f3 = i;
                    a3.l(view.getId(), 7, this.t, 6, iah0.a(f3));
                    a3.l(view.getId(), 6, 0, 6, iah0.a(f3));
                    a3.F(1.0f, view.getId());
                    a3.k(vbn0Var.getId(), 6, 0, 6);
                    a3.k(vbn0Var.getId(), 7, 0, 7);
                    a3.b(constraintLayout);
                }
                z2 = false;
            } else {
                z = true;
                androidx.constraintlayout.widget.b a5 = pq.a(constraintLayout);
                float f4 = i;
                a5.l(view.getId(), 6, 0, 6, iah0.a(f4));
                textView.setGravity(8388611);
                z2 = false;
                a5.p(textView.getId(), 0);
                a5.l(textView.getId(), 6, view.getId(), 7, iah0.a(f4));
                a5.k(textView.getId(), 7, 0, 7);
                textView2.setGravity(8388611);
                a5.p(textView2.getId(), 0);
                a5.l(textView2.getId(), 6, view.getId(), 7, iah0.a(f4));
                a5.k(textView2.getId(), 7, 0, 7);
                a5.l(vbn0Var.getId(), 6, 0, 6, iah0.a(f4));
                a5.b(constraintLayout);
            }
            if (this.p != null) {
                z2 = z;
            }
            ViewGroup viewGroup = this.l;
            if (z2) {
                viewGroup.setBackgroundResource(R.drawable.vk_highlight_radius_8);
            } else {
                viewGroup.setBackground(null);
            }
            l3q0.a(constraintLayout, this.p, new u7n0.a(universalWidget, SchemeStat$TypeUniversalWidget.ElementUiType.ITEM, getAdapterPosition(), i), u7n0Var);
        }
    }

    public rxn0(g4q0.a aVar, w1w0.a aVar2) {
        this.h = aVar;
        this.i = aVar2;
    }

    @Override // xsna.j3q0
    public final cpx0 k(Context context) {
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.vk_uni_widget_table);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        a(constraintLayout);
        b(constraintLayout);
        Object obj = this.b;
        if (obj == null) {
            obj = null;
        }
        TableUniWidget.TableData tableData = ((TableUniWidget) obj).s;
        j3q0.b t = t(tableData.b, tableData.f, context, constraintLayout);
        this.j = t.a;
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.vk_uni_widget_recycler);
        recyclerView.setLayoutParams(new ConstraintLayout.b(-1, -2));
        Object obj2 = this.b;
        if (obj2 == null) {
            obj2 = null;
        }
        List<TableRow> list = ((TableUniWidget) obj2).s.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TableRow) it.next()).b);
        }
        recyclerView.setAdapter(new a(c5g.v(arrayList)));
        recyclerView.setClipToPadding(false);
        Object obj3 = this.b;
        if (obj3 == null) {
            obj3 = null;
        }
        int size = ((TableUniWidget) obj3).s.c.size();
        Object obj4 = this.b;
        if (obj4 == null) {
            obj4 = null;
        }
        NoTrackingGridLayoutManager noTrackingGridLayoutManager = new NoTrackingGridLayoutManager(j5g.F0(((TableUniWidget) obj4).s.c), 1);
        noTrackingGridLayoutManager.x = new sxn0(size, this);
        recyclerView.setLayoutManager(noTrackingGridLayoutManager);
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
        BaseBlock baseBlock = tableData.e;
        Object obj5 = this.b;
        if (obj5 == null) {
            obj5 = null;
        }
        this.l = s(baseBlock, context, constraintLayout, ((TableUniWidget) obj5).r.d.d, true);
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
