package xsna;

import android.os.Parcelable;
import com.vk.log.L;
import com.vk.superapp.api.dto.menu.QueueParams;
import xsna.wxi0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e720 implements ayi0 {
    @Override // xsna.ayi0
    public final void a(uxi0 uxi0Var) {
        k720 k720Var = k720.a;
        wxi0 a = new vxi0(uxi0Var).a();
        if ((a instanceof wxi0.c) && qr.f(((wxi0.c) a).a())) {
            return;
        }
        if (a instanceof wxi0.d) {
            wxi0.d dVar = (wxi0.d) a;
            if (epx.f(dVar.b().c().b(), dVar.a().c().b())) {
                return;
            }
        }
        if (a instanceof wxi0.b) {
            return;
        }
        L.e("Clearing");
        io.reactivex.rxjava3.disposables.c cVar = k720.A;
        if (cVar != null) {
            cVar.dispose();
        }
        k720.A = null;
        io.reactivex.rxjava3.disposables.c cVar2 = k720.B;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        k720.B = null;
        io.reactivex.rxjava3.disposables.c cVar3 = k720.C;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar4 = k720.D;
        if (cVar4 != null) {
            cVar4.dispose();
        }
        k720.M.onNext(s3q0.a);
        io.reactivex.rxjava3.subjects.d<QueueParams> dVar2 = k720.T;
        Parcelable.Creator<QueueParams> creator = QueueParams.CREATOR;
        dVar2.onNext(QueueParams.a.a());
        k720.H();
        i0q0.f(new lg(20));
        k720.X(null);
        k720.Y(null);
        pro0.f(new y620(false, 0));
    }
}
