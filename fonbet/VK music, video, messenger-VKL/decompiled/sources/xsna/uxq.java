package xsna;

import com.vk.log.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class uxq implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ gzs c;

    public /* synthetic */ uxq(int i, gzs gzsVar) {
        this.b = i;
        this.c = gzsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                gzs gzsVar = this.c;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                break;
            default:
                L.i((Throwable) obj);
                this.c.invoke();
                break;
        }
        return s3q0.a;
    }
}
