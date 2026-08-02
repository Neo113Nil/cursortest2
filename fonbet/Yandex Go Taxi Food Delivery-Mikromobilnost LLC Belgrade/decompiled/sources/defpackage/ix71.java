package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.monetization.ads.core.identifiers.ad.gms.service.GmsServiceAdvertisingInfoReader;
import java.util.concurrent.TimeUnit;
import yads.jy0;

/* loaded from: classes7.dex */
public final class ix71 {
    public static vc71 a(jy0 jy0Var) {
        try {
            IBinder iBinder = (IBinder) jy0Var.a.poll(5L, TimeUnit.SECONDS);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                GmsServiceAdvertisingInfoReader gmsServiceAdvertisingInfoReader = queryLocalInterface instanceof GmsServiceAdvertisingInfoReader ? (GmsServiceAdvertisingInfoReader) queryLocalInterface : null;
                if (gmsServiceAdvertisingInfoReader == null) {
                    gmsServiceAdvertisingInfoReader = new GmsServiceAdvertisingInfoReader(iBinder);
                }
                String readAdvertisingId = gmsServiceAdvertisingInfoReader.readAdvertisingId();
                Boolean readAdTrackingLimited = gmsServiceAdvertisingInfoReader.readAdTrackingLimited();
                if (readAdTrackingLimited != null && readAdvertisingId != null) {
                    return new vc71(readAdvertisingId, readAdTrackingLimited.booleanValue());
                }
            }
        } catch (InterruptedException unused) {
        }
        return null;
    }
}
