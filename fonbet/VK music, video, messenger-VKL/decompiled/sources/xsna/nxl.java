package xsna;

import android.content.Context;
import android.location.Location;
import com.vk.location.common.LocationCommon;
import java.util.concurrent.atomic.AtomicReference;
import xsna.cxl;

/* compiled from: DeliveryPointsMapOneTimeEventHandler.kt */
/* loaded from: classes18.dex */
public final class nxl implements gzs<s3q0> {
    public final /* synthetic */ Context b;
    public final /* synthetic */ mxl c;
    public final /* synthetic */ Context d;

    public nxl(Context context, mxl mxlVar, Context context2) {
        this.b = context;
        this.c = mxlVar;
        this.d = context2;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        LocationCommon.a.getClass();
        Context context = this.b;
        boolean b = LocationCommon.b(context);
        mxl mxlVar = this.c;
        if (b) {
            mxlVar.a(this.d);
            mxlVar.a.invoke(cxl.o.b);
        } else {
            AtomicReference<Location> atomicReference = oxz.a;
            oxz.i(context);
            mxlVar.a.invoke(cxl.n.b);
        }
        return s3q0.a;
    }
}
