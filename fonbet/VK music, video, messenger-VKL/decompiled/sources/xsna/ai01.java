package xsna;

import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import ru.ok.tracer.base.deviceid.DeviceIdUtils;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class ai01 extends kj01 {
    public final HashMap g;
    public final u901 h;
    public final u901 i;
    public final u901 j;
    public final u901 k;
    public final u901 l;

    public ai01(qj01 qj01Var) {
        super(qj01Var);
        this.g = new HashMap();
        x901 x901Var = ((mb01) this.b).i;
        mb01.i(x901Var);
        this.h = new u901(x901Var, "last_delete_stale", 0L);
        x901 x901Var2 = ((mb01) this.b).i;
        mb01.i(x901Var2);
        this.i = new u901(x901Var2, "backoff", 0L);
        x901 x901Var3 = ((mb01) this.b).i;
        mb01.i(x901Var3);
        this.j = new u901(x901Var3, "last_upload", 0L);
        x901 x901Var4 = ((mb01) this.b).i;
        mb01.i(x901Var4);
        this.k = new u901(x901Var4, "last_upload_attempt", 0L);
        x901 x901Var5 = ((mb01) this.b).i;
        mb01.i(x901Var5);
        this.l = new u901(x901Var5, "midnight_offset", 0L);
    }

    @Deprecated
    public final Pair o(String str) {
        zh01 zh01Var;
        AdvertisingIdClient.Info advertisingIdInfo;
        k();
        mb01 mb01Var = (mb01) this.b;
        mb01Var.o.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.g;
        zh01 zh01Var2 = (zh01) hashMap.get(str);
        if (zh01Var2 != null && elapsedRealtime < zh01Var2.c) {
            return new Pair(zh01Var2.a, Boolean.valueOf(zh01Var2.b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long q = mb01Var.h.q(str, s701.c) + elapsedRealtime;
        try {
            advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(mb01Var.b);
        } catch (Exception e) {
            k901 k901Var = mb01Var.j;
            mb01.k(k901Var);
            k901Var.p.b(e, "Unable to get advertising id");
            zh01Var = new zh01(q, "", false);
        }
        if (advertisingIdInfo == null) {
            return new Pair("", Boolean.FALSE);
        }
        String id = advertisingIdInfo.getId();
        zh01Var = id != null ? new zh01(q, id, advertisingIdInfo.isLimitAdTrackingEnabled()) : new zh01(q, "", advertisingIdInfo.isLimitAdTrackingEnabled());
        hashMap.put(str, zh01Var);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(zh01Var.a, Boolean.valueOf(zh01Var.b));
    }

    @Deprecated
    public final String p(String str, boolean z) {
        k();
        String str2 = z ? (String) o(str).first : DeviceIdUtils.NULL_UUID;
        MessageDigest r = sk01.r();
        if (r == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, r.digest(str2.getBytes())));
    }

    @Override // xsna.kj01
    public final void n() {
    }
}
