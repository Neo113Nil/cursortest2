package xsna;

import android.content.Context;
import android.location.Location;
import com.vk.location.common.LocationCommon;
import java.util.concurrent.atomic.AtomicReference;
import xsna.cxl;

/* compiled from: DeliveryPointsMapOneTimeEventHandler.kt */
/* loaded from: classes18.dex */
public final class oxl implements gzs<s3q0> {
    public final /* synthetic */ Context b;
    public final /* synthetic */ mxl c;

    public oxl(Context context, mxl mxlVar) {
        this.b = context;
        this.c = mxlVar;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        LocationCommon.a.getClass();
        Context context = this.b;
        if (!LocationCommon.b(context)) {
            AtomicReference<Location> atomicReference = oxz.a;
            oxz.i(context);
            this.c.a.invoke(cxl.m.b);
        }
        return s3q0.a;
    }
}
