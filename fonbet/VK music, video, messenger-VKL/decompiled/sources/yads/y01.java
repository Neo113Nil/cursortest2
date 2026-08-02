package yads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class y01 implements be {
    public final ht2 a;
    public final Context b;
    public final a11 c;
    public final b11 d;

    public /* synthetic */ y01(Context context) {
        this(context, new ht2());
    }

    @Override // yads.be
    public final td a() {
        ResolveInfo resolveInfo;
        td tdVar;
        OpenDeviceIdentifierService openDeviceIdentifierService;
        this.d.getClass();
        Intent a = b11.a();
        ht2 ht2Var = this.a;
        Context context = this.b;
        ht2Var.getClass();
        try {
            resolveInfo = context.getPackageManager().resolveService(a, 0);
        } catch (Throwable unused) {
            resolveInfo = null;
        }
        if (resolveInfo == null) {
            return null;
        }
        try {
            com.monetization.ads.core.identifiers.ad.huawei.a aVar = new com.monetization.ads.core.identifiers.ad.huawei.a();
            if (!this.b.bindService(a, aVar, 1)) {
                return null;
            }
            a11 a11Var = this.c;
            a11Var.getClass();
            try {
                openDeviceIdentifierService = (OpenDeviceIdentifierService) aVar.a.poll(5L, TimeUnit.SECONDS);
            } catch (Exception unused2) {
            }
            if (openDeviceIdentifierService != null) {
                String oaid = openDeviceIdentifierService.getOaid();
                boolean oaidTrackLimited = openDeviceIdentifierService.getOaidTrackLimited();
                a11Var.a.getClass();
                if (oaid != null) {
                    tdVar = new td(oaid, oaidTrackLimited);
                    this.b.unbindService(aVar);
                    return tdVar;
                }
            }
            tdVar = null;
            this.b.unbindService(aVar);
            return tdVar;
        } catch (Throwable unused3) {
            return null;
        }
    }

    public y01(Context context, ht2 ht2Var) {
        this.a = ht2Var;
        this.b = context.getApplicationContext();
        this.c = new a11();
        this.d = new b11();
    }
}
