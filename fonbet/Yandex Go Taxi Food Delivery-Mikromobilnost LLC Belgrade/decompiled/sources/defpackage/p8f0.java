package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.google.android.material.card.MaterialCardView;
import com.yandex.plus.core.data.common.PlusThemedImage;
import com.yandex.plus.glide.b;
import com.yandex.plus.ui.core.theme.PlusTheme;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class p8f0 extends RecyclerView.Adapter {
    public final PlusTheme a;
    public final b5d0 b;
    public final Integer c;
    public final ArrayList w = new ArrayList();

    public p8f0(PlusTheme plusTheme, b5d0 b5d0Var, Integer num) {
        this.a = plusTheme;
        this.b = b5d0Var;
        this.c = num;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.w.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        o8f0 o8f0Var = (o8f0) x0Var;
        PlusThemedImage plusThemedImage = (PlusThemedImage) this.w.get(i);
        kgx[] kgxVarArr = o8f0.Q;
        p8f0 p8f0Var = o8f0Var.P;
        String str = (String) (tpd0.a(o8f0Var.a.getContext(), p8f0Var.a) ? plusThemedImage.getDark() : plusThemedImage.getLight());
        Integer num = p8f0Var.c;
        if (num != null) {
            ((MaterialCardView) o8f0Var.N.a(kgxVarArr[0])).setStrokeColor(num.intValue());
        }
        ((b) p8f0Var.b).b(str).b((ImageView) o8f0Var.O.a(kgxVarArr[1]));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new o8f0(this, LayoutInflater.from(viewGroup.getContext()).inflate(imh0.pay_sdk_item_product_logo, viewGroup, false));
    }
}
