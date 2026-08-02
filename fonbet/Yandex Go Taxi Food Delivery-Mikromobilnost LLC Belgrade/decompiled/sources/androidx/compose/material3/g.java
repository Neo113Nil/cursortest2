package androidx.compose.material3;

import defpackage.agc;
import defpackage.ay40;
import defpackage.dgc;
import defpackage.ehr0;
import defpackage.fud;
import defpackage.gau;
import defpackage.gl11;
import defpackage.gtq0;
import defpackage.h8w;
import defpackage.imy0;
import defpackage.ldc;
import defpackage.lqh;
import defpackage.npb1;
import defpackage.osy0;
import defpackage.psy0;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.xur;
import defpackage.y7m;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes10.dex */
public final class g extends lqh implements fud {
    public boolean A;
    public pzt0 B;
    public imy0 C;
    public androidx.compose.animation.core.a D;
    public ehr0 E;
    public final androidx.compose.animation.core.a F;
    public final androidx.compose.ui.draw.a G;
    public boolean c;
    public boolean w;
    public h8w x;
    public float y;
    public float z;

    public g(boolean z, boolean z2, h8w h8wVar, imy0 imy0Var, ehr0 ehr0Var, float f, float f2) {
        this.c = z;
        this.w = z2;
        this.x = h8wVar;
        this.y = f;
        this.z = f2;
        this.C = imy0Var;
        this.E = ehr0Var;
        this.F = new androidx.compose.animation.core.a(new y7m((this.A && z) ? f : f2), gtq0.h, (Object) null, 12);
        androidx.compose.ui.draw.a aVar = new androidx.compose.ui.draw.a(new androidx.compose.ui.draw.b(), new gau(14, this));
        E0(aVar);
        this.G = aVar;
    }

    public static final Object H0(g gVar, SuspendLambda suspendLambda) {
        gVar.A = false;
        ArrayList arrayList = new ArrayList();
        n0 n0Var = ((ay40) gVar.x).a;
        xur xurVar = new xur(6, arrayList, gVar);
        n0Var.getClass();
        CoroutineSingletons m = n0.m(n0Var, xurVar, suspendLambda);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : zy11.a;
    }

    public final void I0() {
        tje.N(getCoroutineScope(), null, null, new IndicatorLineNode$invalidateIndicator$1(this, null), 3);
        tje.N(getCoroutineScope(), null, null, new IndicatorLineNode$invalidateIndicator$2(this, null), 3);
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.e530
    public final void onAttach() {
        this.B = tje.N(getCoroutineScope(), null, null, new IndicatorLineNode$onAttach$1(this, null), 3);
        if (this.D == null) {
            imy0 imy0Var = this.C;
            if (imy0Var == null) {
                imy0Var = t.f((agc) npb1.c(this, dgc.a), (osy0) npb1.c(this, psy0.a));
            }
            long c = imy0Var.c(this.c, this.w, this.A);
            ldc ldcVar = new ldc(c);
            int i = ldc.n;
            this.D = new androidx.compose.animation.core.a(ldcVar, (gl11) androidx.compose.animation.h.a().invoke(ldc.f(c)), (Object) null, 12);
        }
    }
}
