package xsna;

import android.content.Context;
import xsna.h8z0;
import xsna.hjz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ccd implements wut0, h8z0.b {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ccd(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.h8z0.b
    public void a() {
        xyy0 xyy0Var = (xyy0) this.b;
        xey0 xey0Var = (xey0) this.c;
        hjz0.a aVar = xyy0Var.a;
        String str = xey0Var.F;
        yil0.d(aVar);
    }

    @Override // xsna.wut0
    public vut0 create(Context context) {
        return new hcd((Context) this.b, (dcd) this.c);
    }
}
