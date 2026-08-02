package xsna;

import com.vk.ecomm.design.compose.product_info.f;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ybr implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ ybr(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                String i = ((l2v0) obj).i();
                if (i != null) {
                    this.c.invoke(new com.vk.profile.design.compose.header.sink.h(i));
                    break;
                } else {
                    break;
                }
            default:
                this.c.invoke(new f.b((String) obj));
                break;
        }
        return s3q0.a;
    }
}
