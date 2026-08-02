package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.cart.impl.checkout.ui.items.IslandPart;

/* compiled from: CheckoutDeliveryPointSelectItem.kt */
/* loaded from: classes18.dex */
public final class p4c implements k7r {
    public final FieldKey b;
    public final IslandPart c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public p4c(FieldKey fieldKey, IslandPart islandPart, boolean z, String str, String str2, String str3, String str4) {
        this.b = fieldKey;
        this.c = islandPart;
        this.d = z;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    @Override // xsna.k7r
    public final IslandPart U0() {
        return this.c;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    @Override // xsna.k7r
    public final FieldKey getKey() {
        return this.b;
    }
}
