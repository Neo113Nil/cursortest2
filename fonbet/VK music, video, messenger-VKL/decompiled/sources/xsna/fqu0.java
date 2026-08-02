package xsna;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.mcj;

/* compiled from: VkDialogsHeaderComponent.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class fqu0 extends FunctionReferenceImpl implements izs<mcj.a, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(mcj.a aVar) {
        mcj.a aVar2 = aVar;
        equ0 equ0Var = (equ0) this.receiver;
        gqu0 gqu0Var = equ0Var.n;
        if (gqu0Var == null) {
            gqu0Var = null;
        }
        View view = gqu0Var.i;
        RectF rectF = view != null ? new RectF(bwt0.C(view)) : null;
        if (rectF != null) {
            rcj rcjVar = (rcj) equ0Var.p.getValue();
            ArrayList arrayList = aVar2.a;
            rcjVar.a(rectF, arrayList, aVar2.b - arrayList.size());
        }
        return s3q0.a;
    }
}
