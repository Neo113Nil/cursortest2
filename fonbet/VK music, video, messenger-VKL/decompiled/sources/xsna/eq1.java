package xsna;

import com.vk.lists.c;
import com.vk.log.L;
import xsna.czt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class eq1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ c.k d;

    public /* synthetic */ eq1(c.k kVar, boolean z, int i) {
        this.b = i;
        this.d = kVar;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((gq1) this.d).g.invoke((Throwable) obj, Boolean.valueOf(this.c));
                break;
            default:
                zyt zytVar = (zyt) this.d;
                Throwable th = (Throwable) obj;
                czt cztVar = zytVar.b;
                cztVar.d = false;
                cztVar.c = new czt.a(th, this.c);
                zytVar.f.invoke(Boolean.FALSE, Boolean.TRUE);
                L.E(th, new Object[0]);
                break;
        }
        return s3q0.a;
    }
}
