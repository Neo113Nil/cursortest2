package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;
import xsna.svv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class wpx0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wpx0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ypx0 ypx0Var = (ypx0) this.c;
                ypx0Var.b.b((vpx0) this.d);
                break;
            default:
                v93 v93Var = (v93) this.c;
                svv0 data = ((m1w0) this.d).a.getData();
                if (data instanceof svv0.a) {
                    WebApiApplication webApiApplication = ((svv0.a) data).a;
                    if (webApiApplication.f()) {
                        v93Var.a.remove(webApiApplication.b);
                    }
                }
                break;
        }
        return s3q0.a;
    }
}
