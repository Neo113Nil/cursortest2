package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.widget.c;

/* loaded from: classes6.dex */
public final class cnu0 extends RecyclerView.Adapter {
    public String A;
    public final koc B;
    public final int a;
    public final Integer b;
    public final Integer c;
    public final c w;
    public List x = EmptyList.a;
    public final dl40 y = new dl40(0);
    public l7s0 z;

    public cnu0(int i, Integer num, Integer num2, pav pavVar, c cVar) {
        this.a = i;
        this.b = num;
        this.c = num2;
        this.w = cVar;
        this.B = new koc(pavVar);
    }

    public final int f(String str) {
        if (str == null) {
            return -1;
        }
        Iterator it = this.x.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (jl40.l(((rpu0) it.next()).a, str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        bnu0 bnu0Var = (bnu0) x0Var;
        rpu0 rpu0Var = (rpu0) this.x.get(i);
        bnu0Var.N.setData(rpu0Var, jl40.l(rpu0Var.a, this.A), this.B, this.w);
        bnu0Var.N.setOnClickListener(new wtn(this, i, 7));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.a, viewGroup, false);
        bnu0 bnu0Var = new bnu0(inflate);
        bnu0Var.N.setMultiClickHandler(this.y);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        Integer num = this.b;
        if (num != null) {
            layoutParams.height = num.intValue();
        }
        Integer num2 = this.c;
        if (num2 != null) {
            layoutParams.width = num2.intValue();
        }
        inflate.setLayoutParams(layoutParams);
        return bnu0Var;
    }
}
