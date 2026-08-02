package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class mpu implements b70 {
    public static final mpu a = new mpu();
    public static final List b = scc.g("configuration", "darkConfiguration");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        ipu ipuVar = (ipu) obj;
        bfxVar.A1("configuration");
        kpu kpuVar = kpu.a;
        foe foeVar = l80.a;
        gpu gpuVar = ipuVar.a;
        boolean z = bfxVar instanceof ek00;
        if (z) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            kpuVar.a(bfxVar, cVar, gpuVar);
            ek00Var.y();
        } else {
            ek00 ek00Var2 = new ek00();
            ek00Var2.u();
            kpuVar.a(ek00Var2, cVar, gpuVar);
            ek00Var2.y();
            uga1.f(bfxVar, ek00Var2.c());
        }
        bfxVar.A1("darkConfiguration");
        lpu lpuVar = lpu.a;
        hpu hpuVar = ipuVar.b;
        if (z) {
            ek00 ek00Var3 = (ek00) bfxVar;
            ek00Var3.u();
            lpuVar.a(bfxVar, cVar, hpuVar);
            ek00Var3.y();
            return;
        }
        ek00 ek00Var4 = new ek00();
        ek00Var4.u();
        lpuVar.a(ek00Var4, cVar, hpuVar);
        ek00Var4.y();
        uga1.f(bfxVar, ek00Var4.c());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        gpu gpuVar = null;
        hpu hpuVar = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                kpu kpuVar = kpu.a;
                foe foeVar = l80.a;
                gpuVar = (gpu) new ep60(kpuVar, true).b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new ipu(gpuVar, hpuVar);
                }
                lpu lpuVar = lpu.a;
                foe foeVar2 = l80.a;
                hpuVar = (hpu) new ep60(lpuVar, true).b(xdxVar, cVar);
            }
        }
    }
}
