package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.spb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class hqb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ hqb(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ljo0 ljo0Var;
        int i = this.b;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                List list = (List) obj6;
                ph90 ph90Var = (ph90) obj5;
                spb.a aVar = (spb.a) obj4;
                int[] iArr = (int[]) obj3;
                iqb iqbVar = (iqb) obj2;
                int intValue = ((Integer) obj).intValue();
                if (!epx.f(ph90Var.b, (String) list.get(intValue))) {
                    aVar.e = iArr[intValue];
                    ph90Var.b = (String) list.get(intValue);
                    iqbVar.a.notifyDataSetChanged();
                    qus qusVar = iqbVar.f;
                    if (qusVar != null) {
                        qusVar.d(ph90Var);
                    }
                }
                break;
            default:
                uv70 uv70Var = (uv70) obj5;
                tho0 tho0Var = (tho0) obj4;
                j1z j1zVar = (j1z) obj3;
                rek0 rek0Var = (rek0) obj2;
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                float floatValue = ((vak0) ((amk) obj6).c).getFloatValue();
                if (floatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    long j = tho0Var.b;
                    int i2 = qko0.c;
                    int b = uv70Var.b((int) (j >> 32));
                    mjo0 d = j1zVar.d();
                    zhf0 zhf0Var = (d == null || (ljo0Var = d.a) == null) ? new zhf0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : ljo0Var.c(b);
                    float floor = (float) Math.floor(ggjVar.I0(pfo0.a));
                    float f = floor < 1.0f ? 1.0f : floor;
                    float f2 = f / 2;
                    float f3 = zhf0Var.a + f2;
                    float intBitsToFloat = Float.intBitsToFloat((int) (ggjVar.d() >> 32)) - f2;
                    if (f3 > intBitsToFloat) {
                        f3 = intBitsToFloat;
                    }
                    if (f3 >= f2) {
                        f2 = f3;
                    }
                    float floor2 = ((int) f) % 2 == 1 ? ((float) Math.floor(f2)) + 0.5f : (float) Math.rint(f2);
                    ggjVar.V0(rek0Var, (Float.floatToRawIntBits(zhf0Var.b) & 4294967295L) | (Float.floatToRawIntBits(floor2) << 32), (Float.floatToRawIntBits(floor2) << 32) | (Float.floatToRawIntBits(zhf0Var.d) & 4294967295L), f, (r17 & 64) != 0 ? 1.0f : floatValue);
                }
                break;
        }
        return s3q0.a;
    }
}
