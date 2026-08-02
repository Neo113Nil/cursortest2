package xsna;

import com.vk.biometrics.lock.impl.presentation.base.mvi.settings.a;
import xsna.o9t;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class g97 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ g97(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((Boolean) obj).booleanValue();
                this.c.invoke(a.k.b);
                break;
            case 1:
                this.c.invoke(new o9t.b((uet) obj));
                break;
            default:
                this.c.invoke(new ds40((String) obj));
                break;
        }
        return s3q0.a;
    }
}
