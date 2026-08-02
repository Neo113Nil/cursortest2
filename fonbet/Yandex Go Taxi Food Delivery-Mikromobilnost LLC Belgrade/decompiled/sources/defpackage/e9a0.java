package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import androidx.recyclerview.widget.y;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import com.yandex.plus.ui.core.theme.PlusTheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes2.dex */
public final class e9a0 extends y {
    public final /* synthetic */ int a = 0;
    public final PlusTheme b;
    public final b5d0 c;
    public final tls w;
    public final tls x;

    public e9a0(PlusTheme plusTheme, b5d0 b5d0Var, gv40 gv40Var, tls tlsVar) {
        super(c9a0.a);
        this.b = plusTheme;
        this.c = b5d0Var;
        this.x = gv40Var;
        this.w = tlsVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        switch (this.a) {
            case 0:
                b9a0 b9a0Var = (b9a0) getItem(i);
                if (b9a0Var instanceof a9a0) {
                    return hmh0.pay_sdk_item_plus_points;
                }
                if (b9a0Var instanceof z8a0) {
                    return hmh0.pay_sdk_item_payment_method;
                }
                w511.b();
                return 0;
            default:
                return super.getItemViewType(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        switch (this.a) {
            case 0:
                d9a0 d9a0Var = (d9a0) x0Var;
                d9a0Var.W((b9a0) getItem(d9a0Var.F()), i != getItemCount() - 1);
                break;
            default:
                kjb kjbVar = (kjb) getItem(i);
                led0 led0Var = ((xaa0) x0Var).N;
                String str = kjbVar.a;
                wv5 wv5Var = led0Var.b;
                kgx[] kgxVarArr = led0.g;
                ((TextView) wv5Var.a(kgxVarArr[1])).setText(str);
                List list = kjbVar.b;
                ((ProgressView) led0Var.a.a(kgxVarArr[0])).setVisibility(8);
                ((RecyclerView) led0Var.c.a(kgxVarArr[2])).setVisibility(0);
                e9a0 e9a0Var = led0Var.e;
                ListBuilder a = rcc.a();
                List list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new z8a0((ked0) it.next()));
                }
                a.addAll(arrayList);
                e9a0Var.submitList(a.j());
                List<Object> list3 = kjbVar.c;
                ((RecyclerView) led0Var.d.a(led0.g[3])).setVisibility(0);
                led0Var.f.submitList(list3);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (this.a) {
            case 0:
                View f = oo31.f(viewGroup, i, viewGroup, false);
                if (i == hmh0.pay_sdk_item_plus_points) {
                    return new hj21(f, this.w);
                }
                if (i == hmh0.pay_sdk_item_payment_method) {
                    return new n8a0(f, this.b, this.c, (gv40) this.x);
                }
                ny61.r(qv10.g(i, "Unexpected view type: "));
                return null;
            default:
                return new xaa0(LayoutInflater.from(viewGroup.getContext()).inflate(imh0.pay_sdk_item_payment_methods_group, viewGroup, false), this.b, this.c, this.w, this.x);
        }
    }

    public e9a0(PlusTheme plusTheme, b5d0 b5d0Var, tls tlsVar, tls tlsVar2) {
        super(waa0.a);
        this.b = plusTheme;
        this.c = b5d0Var;
        this.w = tlsVar;
        this.x = tlsVar2;
    }
}
