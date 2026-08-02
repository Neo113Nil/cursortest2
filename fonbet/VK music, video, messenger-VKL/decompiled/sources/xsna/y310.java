package xsna;

import com.vk.core.preference.Preference;
import com.vk.ecomm.design.compose.product_info.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class y310 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ y310(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                this.c.invoke((Throwable) obj);
                break;
            case 1:
                this.c.invoke(new f.b((String) obj));
                break;
            case 2:
                this.c.invoke(new fiq0(false));
                break;
            default:
                Boolean bool = (Boolean) obj;
                Preference.I("vendor", "rustore_services_available", bool.booleanValue());
                this.c.invoke(bool);
                break;
        }
        return s3q0.a;
    }
}
