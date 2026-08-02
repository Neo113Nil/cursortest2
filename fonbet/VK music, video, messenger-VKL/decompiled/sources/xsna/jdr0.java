package xsna;

import android.location.Location;
import com.google.android.gms.location.LocationResult;

/* compiled from: VKLocationCallback.kt */
/* loaded from: classes3.dex */
public final class jdr0 extends kxz {
    public final fzz b;

    public jdr0(fzz fzzVar) {
        this.b = fzzVar;
    }

    @Override // xsna.kxz
    public final void onLocationResult(LocationResult locationResult) {
        Location i = locationResult.i();
        if (i == null) {
            return;
        }
        this.b.a(i);
    }
}
