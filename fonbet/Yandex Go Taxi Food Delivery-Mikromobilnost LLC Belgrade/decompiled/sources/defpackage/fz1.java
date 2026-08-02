package defpackage;

import com.yandex.go.layers.domain.FinalizeAddressObjectsInteractor$waitToCameraMove$$inlined$suspendCallbackApi$2;
import ru.yandex.taxi.altpins.map.a;

/* loaded from: classes5.dex */
public final class fz1 implements gr7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fz1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gr7
    public final void a8() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                a.b((a) obj);
                break;
            default:
                ((FinalizeAddressObjectsInteractor$waitToCameraMove$$inlined$suspendCallbackApi$2) obj).invoke(zy11.a);
                break;
        }
    }
}
