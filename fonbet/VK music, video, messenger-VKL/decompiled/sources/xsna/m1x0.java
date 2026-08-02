package xsna;

import com.vk.log.L;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class m1x0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ m1x0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                L.C("VoipShareLinkPagerDelegate", th);
                zk70.e(th);
                return s3q0.a;
            case 1:
                return Boolean.valueOf(((a6r) obj) instanceof zgw0);
            default:
                return s3q0.a;
        }
    }
}
