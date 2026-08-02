package defpackage;

import android.content.Context;
import com.google.android.gms.internal.identity.a;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.tasks.zzw;

/* loaded from: classes11.dex */
public final class ih91 extends ust implements j7u {
    public ih91(Context context) {
        super(context, null, k991.k, mm2.V0, sst.c);
    }

    public final zzw e(LocationSettingsRequest locationSettingsRequest) {
        ysx0 a = zsx0.a();
        a.a = new a(2, locationSettingsRequest);
        a.d = 2426;
        return d(0, a.a());
    }
}
