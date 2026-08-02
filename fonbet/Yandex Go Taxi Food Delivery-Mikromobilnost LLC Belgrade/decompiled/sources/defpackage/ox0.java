package defpackage;

import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.SizeChangedListener;
import com.yandex.mobile.drive.sdk.map.b;
import kotlin.Pair;
import ru.yandex.taxi.fragment.preorder.AddressMapFragment;

/* loaded from: classes7.dex */
public final /* synthetic */ class ox0 implements SizeChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ox0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.yandex.mapkit.map.SizeChangedListener
    public final void onMapWindowSizeChanged(MapWindow mapWindow, final int i, final int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ((AddressMapFragment) obj).requestFocusRect();
                break;
            case 1:
                b bVar = (b) obj;
                if (i > 0 && i2 > 0) {
                    try {
                        bVar.b(false);
                        break;
                    } catch (Exception e) {
                        l0b1.h(new AssertionError("focusInternal (sizeChangedListener)", e));
                        return;
                    }
                }
                break;
            case 2:
                i4n i4nVar = (i4n) obj;
                i4nVar.a = i;
                i4nVar.b = i2;
                break;
            default:
                ((k901) obj).c(new sls() { // from class: zt00
                    @Override // defpackage.sls
                    public final Object invoke() {
                        return kotlin.collections.b.i(new Pair("width", Integer.valueOf(i)), new Pair("height", Integer.valueOf(i2)));
                    }
                });
                break;
        }
    }
}
