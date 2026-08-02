package defpackage;

import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class mhs implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ m3u0 c;

    public /* synthetic */ mhs(long j, tx01 tx01Var, int i) {
        this.a = i;
        this.b = j;
        this.c = tx01Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        m3u0 m3u0Var = this.c;
        switch (i) {
            case 0:
                long j = this.b;
                qam.t0((qam) obj, ldc.b(j, ((Number) m3u0Var.getValue()).floatValue() * ldc.d(j), 0.0f, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, HProv.PP_DELETE_SAVED_PASSWD);
                break;
            default:
                long j2 = this.b;
                qam.t0((qam) obj, ldc.b(j2, ((Number) m3u0Var.getValue()).floatValue() * ldc.d(j2), 0.0f, 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, HProv.PP_DELETE_SAVED_PASSWD);
                break;
        }
        return zy11Var;
    }
}
