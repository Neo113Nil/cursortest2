package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class akb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ akb(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((gkb) this.d).b.e(this.c, ((bdb) obj).i);
                return s3q0.a;
            default:
                return new eag0((WebApiApplication) this.d, (nex0) obj, this.c);
        }
    }
}
