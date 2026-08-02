package xsna;

import android.view.ViewGroup;
import com.vk.biometrics.lock.impl.presentation.base.mvi.pin.a;
import xsna.o3v;
import xsna.t44;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class l77 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ l77(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke(new a.f(o3v.b.a));
                return s3q0.a;
            case 1:
                return (vfz) this.c.invoke((ViewGroup) obj);
            default:
                this.c.invoke(t44.d.c.b);
                return s3q0.a;
        }
    }
}
