package defpackage;

import android.content.Context;
import com.yandex.go.pickup_from_photo.data.PickupFromPhotoGyroscopeRepository;

/* loaded from: classes13.dex */
public final class cjb0 implements v7p {
    public final /* synthetic */ int a;
    public final z4g b;

    public /* synthetic */ cjb0(z4g z4gVar, int i) {
        this.a = i;
        this.b = z4gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        z4g z4gVar = this.b;
        switch (i) {
            case 0:
                return new bjb0((Context) z4gVar.get());
            default:
                return new PickupFromPhotoGyroscopeRepository((Context) z4gVar.get());
        }
    }
}
