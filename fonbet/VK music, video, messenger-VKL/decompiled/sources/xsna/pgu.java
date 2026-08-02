package xsna;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.image.VKImageController;
import com.vk.stat.scheme.SchemeStat$TypeUniversalWidget;
import com.vk.superapp.api.dto.widgets.actions.WebAction;
import com.vk.superapp.ui.uniwidgets.blocks.BaseBlock;
import com.vk.superapp.ui.uniwidgets.blocks.ImageBlock;
import com.vk.superapp.ui.uniwidgets.dto.GridUniWidget;
import com.vk.superapp.ui.uniwidgets.dto.UniversalWidget;
import com.vk.superapp.ui.views.NoTrackingGridLayoutManager;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.List;
import xsna.g4q0;
import xsna.j3q0;
import xsna.u7n0;
import xsna.w1w0;

/* compiled from: GridUniConstructor.kt */
/* loaded from: classes6.dex */
public final class pgu extends j3q0<GridUniWidget> {
    public final g4q0.a h;
    public final w1w0.a i;
    public View j;
    public RecyclerView k;
    public View l;

    /* compiled from: GridUniConstructor.kt */
    public final class a extends RecyclerView.Adapter<b> {
        public final List<ImageBlock> c;
        public final boolean d;

        public a(List<ImageBlock> list, boolean z) {
            this.c = list;
            this.d = z;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            int i = this.d ? 3 : 4;
            List<ImageBlock> list = this.c;
            if (list.size() < i) {
                return list.size();
            }
            int i2 = i * 2;
            return list.size() < i2 ? i : i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(b bVar, int i) {
            b bVar2 = bVar;
            ImageBlock imageBlock = this.c.get(i);
            pgu pguVar = pgu.this;
            UniversalWidget universalWidget = pguVar.b;
            if (universalWidget == null) {
                universalWidget = null;
            }
            bVar2.W5(imageBlock, universalWidget, pguVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new b(new cnk0(viewGroup.getContext()), pgu.this.i);
        }
    }

    /* compiled from: GridUniConstructor.kt */
    public static final class b extends pfh0<ImageBlock> {
        public final cnk0 m;
        public final u7n0 n;
        public WebAction o;
        public final VKImageController<View> p;
        public final TextView q;

        public b(cnk0 cnk0Var, w1w0.a aVar) {
            super(cnk0Var);
            this.m = cnk0Var;
            this.n = aVar;
            int a = iah0.a(4);
            cnk0Var.setPadding(a, a, a, a);
            ifx0 ifx0Var = e370.c;
            VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(this.itemView.getContext());
            this.p = create;
            View view = ((com.vk.core.ui.image.c) create).getView();
            view.setId(R.id.vk_uni_widget_grid_item);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            TextView textView = new TextView(this.itemView.getContext());
            textView.setId(R.id.vk_uni_widget_counter_text);
            textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            textView.setGravity(17);
            his0.x(textView, R.color.vk_white);
            com.vk.typography.b.k(textView, FontFamily.REGULAR, Float.valueOf(20.0f), 4);
            f4m.j(textView);
            this.q = textView;
            cnk0Var.addView(view);
            cnk0Var.addView(textView);
        }

        @Override // xsna.pfh0
        public final /* bridge */ /* synthetic */ void V5(ImageBlock imageBlock, UniversalWidget universalWidget, j3q0 j3q0Var, u7n0 u7n0Var) {
            W5(imageBlock, universalWidget, j3q0Var);
        }

        public final void W5(ImageBlock imageBlock, UniversalWidget universalWidget, j3q0 j3q0Var) {
            this.o = imageBlock.f;
            j3q0.h(j3q0Var, this.p, imageBlock, null, Integer.valueOf(krv0.m(R.attr.vk_ui_image_border_alpha, this.itemView.getContext())), 4);
            u7n0.a aVar = new u7n0.a(universalWidget, SchemeStat$TypeUniversalWidget.ElementUiType.ITEM, getAdapterPosition(), 8);
            u7n0 u7n0Var = this.n;
            l3q0.a(this.m, this.o, aVar, u7n0Var);
            String str = imageBlock.g;
            TextView textView = this.q;
            ey2.i(textView, str);
            if (str == null || str.length() == 0) {
                return;
            }
            int color = this.itemView.getContext().getColor(R.color.vk_black_alpha45);
            float[] fArr = new float[8];
            Arrays.fill(fArr, iah0.b(z6j.d(imageBlock.e)));
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(color);
            shapeDrawable.setIntrinsicWidth(-1);
            shapeDrawable.setIntrinsicHeight(-1);
            textView.setBackground(shapeDrawable);
        }
    }

    public pgu(g4q0.a aVar, w1w0.a aVar2) {
        this.h = aVar;
        this.i = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [xsna.j3q0, xsna.pgu] */
    @Override // xsna.j3q0
    public final cpx0 k(Context context) {
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        constraintLayout.setId(R.id.vk_uni_widget_grid);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        a(constraintLayout);
        b(constraintLayout);
        Object obj = this.b;
        BaseBlock baseBlock = ((GridUniWidget) (obj != null ? obj : null)).t;
        Object obj2 = obj;
        if (obj == null) {
            obj2 = null;
        }
        j3q0.b t = t(baseBlock, ((GridUniWidget) obj2).u, context, constraintLayout);
        this.j = t.a;
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.vk_uni_widget_recycler);
        recyclerView.setLayoutParams(new ConstraintLayout.b(-1, -2));
        Object obj3 = this.b;
        boolean z = ((GridUniWidget) (obj3 != null ? obj3 : null)).s == GridUniWidget.Size.LARGE;
        Object obj4 = obj3;
        if (obj3 == null) {
            obj4 = null;
        }
        recyclerView.setAdapter(new a(((GridUniWidget) obj4).v, z));
        int a2 = iah0.a(8);
        recyclerView.setPadding(a2, 0, a2, 0);
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutManager(new NoTrackingGridLayoutManager(z ? 3 : 4, 1));
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
        Object obj5 = this.b;
        BaseBlock baseBlock2 = ((GridUniWidget) (obj5 != null ? obj5 : null)).w;
        Object obj6 = obj5;
        if (obj5 == null) {
            obj6 = null;
        }
        this.l = s(baseBlock2, context, constraintLayout, ((GridUniWidget) obj6).r.g.d, false);
        androidx.constraintlayout.widget.b a3 = pq.a(constraintLayout);
        View view2 = this.l;
        if (view2 == null) {
            view2 = null;
        }
        int id2 = view2.getId();
        RecyclerView recyclerView2 = this.k;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        a3.k(id2, 3, recyclerView2.getId(), 4);
        a3.b(constraintLayout);
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
