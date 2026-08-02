package yads;

import android.os.IBinder;
import android.os.IInterface;
import com.monetization.ads.core.identifiers.ad.gms.service.GmsServiceAdvertisingInfoReader;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class d01 {
    public final ud a;
    public final yz0 b;

    public /* synthetic */ d01() {
        this(new ud(), new yz0());
    }

    public final td a(zz0 zz0Var) {
        try {
            IBinder iBinder = (IBinder) zz0Var.a.poll(5L, TimeUnit.SECONDS);
            if (iBinder == null) {
                return null;
            }
            this.b.getClass();
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            ce ceVar = queryLocalInterface instanceof ce ? (ce) queryLocalInterface : null;
            if (ceVar == null) {
                ceVar = new GmsServiceAdvertisingInfoReader(iBinder);
            }
            String readAdvertisingId = ceVar.readAdvertisingId();
            Boolean readAdTrackingLimited = ceVar.readAdTrackingLimited();
            this.a.getClass();
            if (readAdTrackingLimited == null || readAdvertisingId == null) {
                return null;
            }
            return new td(readAdvertisingId, readAdTrackingLimited.booleanValue());
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public d01(ud udVar, yz0 yz0Var) {
        this.a = udVar;
        this.b = yz0Var;
    }
}
