package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.address.models.PlainAddress;

/* loaded from: classes6.dex */
public final class hgq0 extends x3 {
    public final String c;
    public final PlaceType w;

    public hgq0(w4l0 w4l0Var, String str, PlaceType placeType) {
        super(14, w4l0Var);
        this.c = str;
        this.w = placeType;
    }

    @Override // defpackage.igq0
    public final void I(Address address) {
        address.M1(this.w);
        String str = this.c;
        if (str == null) {
            str = "";
        }
        PlainAddress plainAddress = (PlainAddress) address;
        plainAddress.j(str);
        ((w4l0) this.b).d(plainAddress);
    }
}
