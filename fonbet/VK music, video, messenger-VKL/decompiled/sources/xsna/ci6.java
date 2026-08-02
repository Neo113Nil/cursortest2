package xsna;

import com.vk.libvideo.bottomsheet.notifications.SubscriptionAction;
import xsna.aiq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ci6 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ ci6(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ao50 ao50Var = (ao50) obj;
                this.c.invoke(ao50Var);
                break;
            case 1:
                this.c.invoke(new aiq0.f((String) obj));
                break;
            case 2:
                this.c.invoke((SubscriptionAction) obj);
                break;
            case 3:
                Throwable th = (Throwable) obj;
                izs izsVar = this.c;
                if (izsVar != null) {
                    izsVar.invoke(th);
                }
                break;
            default:
                Throwable th2 = (Throwable) obj;
                izs izsVar2 = this.c;
                if (izsVar2 != null) {
                    izsVar2.invoke(th2);
                }
                break;
        }
        return s3q0.a;
    }
}
