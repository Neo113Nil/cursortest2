package xsna;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionFilter;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dw20;

/* compiled from: ShowFiltersBottomSheet.kt */
/* loaded from: classes16.dex */
public final class bij0 extends dw20 {
    public a.C2610a f1;

    /* compiled from: ShowFiltersBottomSheet.kt */
    public static final class a extends dw20.b {
        public final C2610a e;

        /* compiled from: ShowFiltersBottomSheet.kt */
        /* renamed from: xsna.bij0$a$a, reason: collision with other inner class name */
        public static final class C2610a {
            public final UIBlockList a;
            public final b5a b;
            public final q3a c;

            public C2610a(UIBlockList uIBlockList, b5a b5aVar, q3a q3aVar) {
                this.a = uIBlockList;
                this.b = b5aVar;
                this.c = q3aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2610a)) {
                    return false;
                }
                C2610a c2610a = (C2610a) obj;
                return epx.f(this.a, c2610a.a) && epx.f(this.b, c2610a.b) && epx.f(this.c, c2610a.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "Params(filters=" + this.a + ", eventBus=" + this.b + ", commandBus=" + this.c + ')';
            }
        }

        public a(Context context, C2610a c2610a) {
            super(context, null);
            this.e = c2610a;
            this.d.r = 0;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            bij0 bij0Var = new bij0();
            bij0Var.f1 = this.e;
            return bij0Var;
        }
    }

    /* compiled from: ShowFiltersBottomSheet.kt */
    public static final class b {
        public final wtm0 a;
        public final f b;

        public b(wtm0 wtm0Var, f fVar) {
            this.a = wtm0Var;
            this.b = fVar;
        }
    }

    /* compiled from: ShowFiltersBottomSheet.kt */
    public static final class c extends gf6<d> {
        public final b e;

        public c(b bVar) {
            super((com.vk.lists.a) null, 3);
            this.e = bVar;
        }

        @Override // xsna.gf6
        public final hf6 K0(int i, View view) {
            return new e(view, this.e);
        }
    }

    /* compiled from: ShowFiltersBottomSheet.kt */
    public static final class d extends zif0 {
        public final UIBlockActionFilter a;

        public d(UIBlockActionFilter uIBlockActionFilter) {
            this.a = uIBlockActionFilter;
        }

        @Override // xsna.zif0
        public final int b() {
            return R.layout.catalog_horizontal_list_show_filters_item;
        }
    }

    /* compiled from: ShowFiltersBottomSheet.kt */
    public static final class e extends hf6<d> {
        public final b m;
        public final TextView n;
        public final ImageView o;

        public e(View view, b bVar) {
            super(view);
            this.m = bVar;
            this.n = (TextView) this.itemView.findViewById(R.id.option_name);
            this.o = (ImageView) this.itemView.findViewById(R.id.option_selected);
        }

        @Override // xsna.hf6
        public final void W5(d dVar) {
            d dVar2 = dVar;
            UIBlockActionFilter uIBlockActionFilter = dVar2.a;
            this.n.setText(uIBlockActionFilter.z.c);
            this.o.setVisibility(uIBlockActionFilter.z.e ? 0 : 8);
            bwt0.i0(this.itemView, new whi0(1, this, dVar2));
        }
    }

    /* compiled from: ShowFiltersBottomSheet.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((bij0) this.receiver).tn();
            return s3q0.a;
        }
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        a.C2610a c2610a = this.f1;
        if (c2610a == null) {
            return super.yn(bundle);
        }
        Context requireContext = requireContext();
        c cVar = new c(new b(new wtm0(c2610a.c, c2610a.b, (eda) null, 12), new f(0, this, bij0.class, "dismissAllowingStateLoss", "dismissAllowingStateLoss()V", 0)));
        RecyclerView recyclerView = new RecyclerView(requireContext);
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setAdapter(cVar);
        ArrayList<UIBlock> arrayList = c2610a.a.y;
        ArrayList arrayList2 = new ArrayList();
        for (UIBlock uIBlock : arrayList) {
            UIBlockActionFilter uIBlockActionFilter = uIBlock instanceof UIBlockActionFilter ? (UIBlockActionFilter) uIBlock : null;
            if (uIBlockActionFilter != null) {
                arrayList2.add(uIBlockActionFilter);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(new d((UIBlockActionFilter) it.next()));
        }
        cVar.setItems(arrayList3);
        com.vk.core.ui.bottomsheet.internal.e Hn = Hn();
        Hn.Y = recyclerView;
        Hn.Z = true;
        Dialog yn = super.yn(bundle);
        ViewGroup Ln = Ln();
        if (Ln != null) {
            int b2 = cn70.b(10);
            int b3 = cn70.b(8);
            f4m.u(Ln, b2, 0, b2, b2);
            int i = b3 * 2;
            Ln.setPadding(b3, i, b3, i);
            Ln.setBackground(gu9.c(R.attr.vk_ui_background_contrast_themed, requireContext()));
        }
        return yn;
    }
}
