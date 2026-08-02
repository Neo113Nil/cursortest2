package xsna;

import android.view.View;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ycu;

/* compiled from: GraffitiDrawingView.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class dcu extends FunctionReferenceImpl implements izs<ycu.c, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(ycu.c cVar) {
        ycu.c cVar2 = cVar;
        jcu jcuVar = (jcu) this.receiver;
        View view = jcuVar.x;
        boolean z = cVar2.a;
        view.setEnabled(z);
        View view2 = jcuVar.w;
        boolean z2 = cVar2.b;
        view2.setEnabled(z2);
        if (z || z2) {
            view.setAlpha(z ? 1.0f : 0.4f);
            view2.setAlpha(z2 ? 1.0f : 0.4f);
        }
        return s3q0.a;
    }
}
