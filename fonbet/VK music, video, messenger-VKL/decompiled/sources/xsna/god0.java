package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dw20;
import xsna.tlo0;

/* compiled from: ProductFilterDialog.kt */
/* loaded from: classes18.dex */
public final class god0 implements eb10<vcr<?>> {
    public final op5 a = new op5(2, false);
    public ncr<vcr<?>> b;

    /* compiled from: ProductFilterDialog.kt */
    public static final class a {
        public final VkSimpleButton a;
        public List<? extends vcr<?>> b = EmptyList.b;

        public a(VkSimpleButton vkSimpleButton) {
            this.a = vkSimpleButton;
        }

        public final void a(List<? extends vcr<?>> list) {
            boolean z;
            if (list != null) {
                this.b = list;
            }
            List<? extends vcr<?>> list2 = this.b;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    vcr vcrVar = (vcr) it.next();
                    Object d = vcrVar.d();
                    if (!epx.f(d, vcrVar.b()) && d != null) {
                        if (vcrVar.c() == 2 && (d instanceof p6d0)) {
                            p6d0 p6d0Var = (p6d0) d;
                            if (p6d0Var.a == null && p6d0Var.b == null) {
                            }
                        }
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            int i = z ? 8 : 0;
            VkSimpleButton vkSimpleButton = this.a;
            vkSimpleButton.setVisibility(i);
            vkSimpleButton.setEnabled(!z);
        }
    }

    /* compiled from: ProductFilterDialog.kt */
    public static final class b implements mcr<vcr<?>> {
        public final /* synthetic */ RecyclerView a;
        public final /* synthetic */ Ref$ObjectRef<aod0> b;
        public final /* synthetic */ a c;
        public final /* synthetic */ god0 d;

        public b(RecyclerView recyclerView, Ref$ObjectRef<aod0> ref$ObjectRef, a aVar, god0 god0Var) {
            this.a = recyclerView;
            this.b = ref$ObjectRef;
            this.c = aVar;
            this.d = god0Var;
        }

        @Override // xsna.mcr
        public final void a(ncr<vcr<?>> ncrVar) {
            this.d.b = ncrVar;
        }

        @Override // xsna.mcr
        public final void b(List<? extends vcr<?>> list) {
            this.a.post(new r0a(this.b, list, this.c, 7));
        }
    }

    public static wqd0 c(wqd0 wqd0Var, int i) {
        if (wqd0Var.a == i) {
            return wqd0Var;
        }
        ArrayList<wqd0> arrayList = wqd0Var.e;
        if (arrayList == null) {
            return null;
        }
        Iterator<wqd0> it = arrayList.iterator();
        while (it.hasNext()) {
            wqd0 c = c(it.next(), i);
            if (c != null) {
                return c;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, androidx.recyclerview.widget.RecyclerView$Adapter, xsna.aod0] */
    @Override // xsna.eb10
    public final mcr<vcr<?>> a(FragmentActivity fragmentActivity) {
        op5 op5Var = this.a;
        op5Var.i();
        View inflate = fragmentActivity.getLayoutInflater().inflate(R.layout.product_filter, (ViewGroup) null);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.top_bar);
        vkTopBar.setBefore(new VkTopBar.c.d(tq.h(tlo0.Companion, R.string.close), new sy50(this, 20), null, com.vk.core.compose.component.semantics.b.a(null, new e750(9), 3), 4));
        com.vk.core.compose.component.semantics.a a2 = com.vk.core.compose.component.semantics.b.a(null, new tcu(21), 3);
        VkTopBar.Middle.Text.c cVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.f(R.string.catalog_market_title_filters), null, null, null, a2, 14), cVar, objArr, objArr2, 14));
        VkSimpleButton vkSimpleButton = (VkSimpleButton) inflate.findViewById(R.id.clear_button);
        a aVar = new a(vkSimpleButton);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.items);
        ?? aod0Var = new aod0(new jct(this, fragmentActivity, ref$ObjectRef, aVar, 2), new g22(27, this, aVar));
        ref$ObjectRef.element = aod0Var;
        recyclerView.setAdapter(aod0Var);
        ((VkButton) inflate.findViewById(R.id.apply_filter_button)).setOnClickListener(new ko3(this, 9));
        vkSimpleButton.setOnClickListener(new lo3(this, 4));
        op5Var.e(fragmentActivity, b(fragmentActivity, inflate));
        return new b(recyclerView, ref$ObjectRef, aVar, this);
    }

    public final dw20 b(FragmentActivity fragmentActivity, View view) {
        omo omoVar = new omo(fragmentActivity, this.a);
        return ((dw20.b) new dw20.b(fragmentActivity, null).I(true).G0().D0(view, false)).x(0).u(0).c(new d5j(view)).F0(true).O().X(new jw30(omoVar, 20)).c0(new b56(omoVar, 1)).m(R.attr.vk_ui_background_content).a();
    }

    public final void d(FragmentActivity fragmentActivity, String str, List list, ar80 ar80Var) {
        View inflate = fragmentActivity.getLayoutInflater().inflate(R.layout.product_filter_dropdown, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.title)).setText(str);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.items);
        jod0 jod0Var = new jod0(new ea3(ar80Var, this, fragmentActivity, 8));
        jod0Var.setItems(list);
        recyclerView.setAdapter(jod0Var);
        ((ImageView) inflate.findViewById(R.id.close_button)).setOnClickListener(new fod0(this, fragmentActivity, 0));
        this.a.e(fragmentActivity, b(fragmentActivity, inflate));
    }
}
