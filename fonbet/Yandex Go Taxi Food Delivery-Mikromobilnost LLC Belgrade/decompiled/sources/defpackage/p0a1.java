package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.b;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.measurement.internal.zzfz;
import com.google.android.gms.measurement.internal.zzgb;
import com.google.android.gms.measurement.internal.zznf;

/* loaded from: classes11.dex */
public final class p0a1 extends a {
    public p0a1(Context context, Looper looper, zznf zznfVar, zznf zznfVar2) {
        super(context, looper, vkt.a(context), b.b, 93, zznfVar, zznfVar2, null);
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof zzgb ? (zzgb) queryLocalInterface : new zzfz(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.om2
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String j() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String k() {
        return "com.google.android.gms.measurement.START";
    }
}
