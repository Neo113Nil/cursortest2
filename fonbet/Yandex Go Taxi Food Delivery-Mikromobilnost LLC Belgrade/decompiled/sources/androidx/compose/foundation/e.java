package androidx.compose.foundation;

import defpackage.c1y;
import defpackage.e530;
import defpackage.h8w;
import defpackage.k28;
import defpackage.ldc;
import defpackage.pam;
import defpackage.qam;
import defpackage.tje;

/* loaded from: classes10.dex */
public final class e extends e530 implements pam {
    public final h8w a;
    public boolean b;
    public boolean c;
    public boolean w;

    public e(h8w h8wVar) {
        this.a = h8wVar;
    }

    @Override // defpackage.pam
    public final void d(c1y c1yVar) {
        c1yVar.a();
        k28 k28Var = c1yVar.a;
        if (this.b) {
            qam.t0(c1yVar, ldc.b(ldc.b, 0.3f, 0.0f, 0.0f, 0.0f, 14), 0L, k28Var.c(), 0.0f, null, 122);
        } else if (this.c || this.w) {
            qam.t0(c1yVar, ldc.b(ldc.b, 0.1f, 0.0f, 0.0f, 0.0f, 14), 0L, k28Var.c(), 0.0f, null, 122);
        }
    }

    @Override // defpackage.e530
    public final void onAttach() {
        tje.N(getCoroutineScope(), null, null, new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this, null), 3);
    }
}
