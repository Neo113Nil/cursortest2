package defpackage;

import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;

/* loaded from: classes6.dex */
public interface gr7 extends hr7 {
    void a8();

    @Override // defpackage.hr7
    default void h(CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        a8();
    }
}
