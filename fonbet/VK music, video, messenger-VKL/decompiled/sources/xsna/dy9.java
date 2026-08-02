package xsna;

import com.vk.ecomm.cart.impl.cart.CartFragment;
import com.vk.ecomm.cart.impl.cart.a;
import java.util.List;
import xsna.fm50;

/* compiled from: CartRenderHolder.kt */
/* loaded from: classes18.dex */
public final class dy9<R extends fm50<? extends km50>> extends jyf0<R> {
    public final wh50<R> e;

    public dy9(CartFragment cartFragment, List list, com.vk.movika.sdk.base.observable.p pVar) {
        super(cartFragment, list);
        this.e = androidx.compose.runtime.k.b(a.d.a);
        by5 by5Var = new by5(2, pVar, this);
        R r = this.d;
        if (r != null) {
            by5Var.invoke(r);
        }
        this.c = by5Var;
    }
}
