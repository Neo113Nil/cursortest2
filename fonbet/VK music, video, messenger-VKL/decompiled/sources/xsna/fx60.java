package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.ey60;
import xsna.jm50;

/* compiled from: NewsfeedSearchExternalEventsTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class fx60 extends evg0<xx60, on50, ey60.a, ey60, vx60, sx60> {
    public final jq60 f;
    public final Lazy g;
    public final Object h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fx60(es60 es60Var, rvu rvuVar, nn50 nn50Var) {
        super(r5, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = new jq60(es60Var.d, es60Var.e, es60Var.l, es60Var.h, aVar, new eht(this, rvuVar));
        this.g = es60Var.e;
        this.h = msy.a(LazyThreadSafetyMode.NONE, new r010(this, 14));
        int[] iArr = p9x.a;
        new qg50(1).g(Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        ey60.a aVar = (ey60.a) hn50Var;
        if (!(aVar instanceof ey60.a.C2840a)) {
            throw new NoWhenBranchMatchedException();
        }
        return this.f.d(((ey60.a.C2840a) aVar).b);
    }
}
