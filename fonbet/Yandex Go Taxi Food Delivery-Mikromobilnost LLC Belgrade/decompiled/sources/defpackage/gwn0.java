package defpackage;

import java.util.Collections;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;

/* loaded from: classes13.dex */
public final class gwn0 extends bys {
    public final ScootersCardV2.ChargeConfig z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gwn0(pav pavVar, iin0 iin0Var, ScootersCardV2.ChargeConfig chargeConfig) {
        super(r0, Collections.singletonList(new zxs(r10.a(), 0, null, EmptyList.a, null, new t7l0(16, pavVar, chargeConfig))));
        txc txcVar = new txc(6, iin0Var);
        int i = wpm0.U;
        g0c a = qoi0.a(bpm0.class);
        this.z = chargeConfig;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:
    
        if (r7.e == r8.e) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (r7.d == r8.d) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        if (r7.c == r8.c) goto L10;
     */
    @Override // defpackage.bys
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean j(Object obj, Object obj2) {
        boolean z;
        bpm0 bpm0Var = (bpm0) obj;
        bpm0 bpm0Var2 = (bpm0) obj2;
        int i = fwn0.a[this.z.c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        w511.b();
                        return false;
                    }
                }
                z = true;
            }
        }
        return jl40.l(bpm0Var.b, bpm0Var2.b) && z;
    }

    @Override // defpackage.bys
    public final boolean k(Object obj, Object obj2) {
        return ((bpm0) obj).a.equals(((bpm0) obj2).a);
    }
}
