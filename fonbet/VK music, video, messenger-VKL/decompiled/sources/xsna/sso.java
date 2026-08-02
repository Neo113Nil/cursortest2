package xsna;

import com.vk.instantjobs.InstantJob;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class sso implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ sso(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tso.n((tgi0) obj, this.c);
                return s3q0.a;
            default:
                InstantJob instantJob = (InstantJob) obj;
                boolean z = instantJob instanceof ny30;
                int i = this.c;
                return Boolean.valueOf((z && ((ny30) instantJob).d == i) || ((instantJob instanceof zy30) && ((zy30) instantJob).d == i));
        }
    }
}
