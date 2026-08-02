package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.impl.checkout.fragment.CheckoutFragment;

/* compiled from: CheckoutRouterImpl.kt */
/* loaded from: classes18.dex */
public final class f8c implements e8c {
    @Override // xsna.e8c
    public final void a(Context context, UserId userId, Long l) {
        CheckoutFragment.a aVar = new CheckoutFragment.a(CheckoutFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putParcelable("group_id", userId);
        if (l != null) {
            bundle.putLong("item_id", l.longValue());
        }
        aVar.k(context);
    }
}
