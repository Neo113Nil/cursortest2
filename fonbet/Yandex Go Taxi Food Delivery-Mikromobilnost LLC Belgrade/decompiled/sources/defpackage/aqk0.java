package defpackage;

import androidx.compose.ui.semantics.f;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public final class aqk0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ aqk0(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                f.q((mnq0) obj, z);
                break;
            default:
                qam.z((qam) obj, z ? eq2.c : gq2.b, 0.0f, 0L, 0.0f, null, 0, HProv.PP_DELETE_SAVED_PASSWD);
                break;
        }
        return zy11Var;
    }
}
