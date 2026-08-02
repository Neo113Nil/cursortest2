package com.yandex.passport.internal.flags;

import defpackage.auu0;
import defpackage.k8u;
import defpackage.pnz;
import defpackage.qke;
import defpackage.tls;
import defpackage.uza;
import defpackage.z96;
import defpackage.zcx;
import java.util.Map;

/* loaded from: classes8.dex */
public final class c implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ c(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                zcx zcxVar = com.yandex.passport.data.network.core.m.a;
                zcxVar.getClass();
                auu0 auu0Var = auu0.a;
                return zcxVar.c((Map) obj, new k8u(auu0Var, qke.n(auu0Var), 1)).getBytes(uza.a);
            case 1:
                zcx zcxVar2 = com.yandex.passport.data.network.core.m.a;
                zcxVar2.getClass();
                auu0 auu0Var2 = auu0.a;
                return (Map) zcxVar2.b(new k8u(auu0Var2, qke.n(auu0Var2), 1), new String((byte[]) obj, uza.a));
            case 2:
                zcx zcxVar3 = com.yandex.passport.data.network.core.m.a;
                zcxVar3.getClass();
                auu0 auu0Var3 = auu0.a;
                return zcxVar3.c((Map) obj, new k8u(auu0Var3, auu0Var3, 1)).getBytes(uza.a);
            case 3:
                zcx zcxVar4 = com.yandex.passport.data.network.core.m.a;
                zcxVar4.getClass();
                auu0 auu0Var4 = auu0.a;
                return (Map) zcxVar4.b(new k8u(auu0Var4, auu0Var4, 1), new String((byte[]) obj, uza.a));
            case 4:
                zcx zcxVar5 = com.yandex.passport.data.network.core.m.a;
                zcxVar5.getClass();
                return zcxVar5.c((Map) obj, new k8u(auu0.a, pnz.a, 1)).getBytes(uza.a);
            case 5:
                zcx zcxVar6 = com.yandex.passport.data.network.core.m.a;
                zcxVar6.getClass();
                return (Map) zcxVar6.b(new k8u(auu0.a, pnz.a, 1), new String((byte[]) obj, uza.a));
            case 6:
                zcx zcxVar7 = com.yandex.passport.data.network.core.m.a;
                zcxVar7.getClass();
                return zcxVar7.c((Map) obj, new k8u(auu0.a, z96.a, 1)).getBytes(uza.a);
            case 7:
                zcx zcxVar8 = com.yandex.passport.data.network.core.m.a;
                zcxVar8.getClass();
                return (Map) zcxVar8.b(new k8u(auu0.a, z96.a, 1), new String((byte[]) obj, uza.a));
            case 8:
                zcx zcxVar9 = com.yandex.passport.data.network.core.m.a;
                zcxVar9.getClass();
                return zcxVar9.c((Map) obj, new k8u(auu0.a, pnz.a, 1)).getBytes(uza.a);
            default:
                zcx zcxVar10 = com.yandex.passport.data.network.core.m.a;
                zcxVar10.getClass();
                return (Map) zcxVar10.b(new k8u(auu0.a, pnz.a, 1), new String((byte[]) obj, uza.a));
        }
    }
}
