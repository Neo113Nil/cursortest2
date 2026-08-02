package defpackage;

import com.yandex.xplat.payment.sdk.AvailableMethods;
import java.util.ArrayList;

/* loaded from: classes13.dex */
public class o9a0 implements y9a0 {
    public final ArrayList a = new ArrayList();

    @Override // defpackage.y9a0
    public final md51 a(AvailableMethods availableMethods) {
        return b(this.a, availableMethods);
    }

    public final md51 b(ArrayList arrayList, AvailableMethods availableMethods) {
        return arrayList.size() == 0 ? zmx.d(availableMethods) : ((y9a0) arrayList.get(0)).a(availableMethods).g(new ww90(1, this, arrayList));
    }
}
