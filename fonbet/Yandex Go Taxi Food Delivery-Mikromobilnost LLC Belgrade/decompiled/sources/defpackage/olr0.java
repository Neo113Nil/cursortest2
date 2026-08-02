package defpackage;

import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import com.yandex.go.trusted_contacts.share_settings.a;
import com.yandex.go.trusted_contacts.ui.error.ErrorScreenAction;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final /* synthetic */ class olr0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ olr0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                if (str != null) {
                    TrustedContactDto a = TrustedContactDto.a(aVar.G, str, null, null, 29);
                    aVar.G = a;
                    r0 r0Var = aVar.F;
                    r0Var.getClass();
                    r0Var.m(null, a);
                    break;
                }
                break;
            case 1:
                if (((ErrorScreenAction) obj) != null) {
                    aVar.Kg();
                    break;
                }
                break;
            default:
                ErrorScreenAction errorScreenAction = (ErrorScreenAction) obj;
                int i2 = errorScreenAction == null ? -1 : qlr0.a[errorScreenAction.ordinal()];
                if (i2 != -1) {
                    boolean z = true;
                    if (i2 != 1) {
                        if (i2 == 2) {
                            ((glr0) aVar.D.b).r(new yce(z, 26));
                        } else if (i2 != 3) {
                            w511.b();
                            break;
                        } else {
                            aVar.Lg();
                        }
                    }
                }
                break;
        }
        return zy11Var;
    }
}
