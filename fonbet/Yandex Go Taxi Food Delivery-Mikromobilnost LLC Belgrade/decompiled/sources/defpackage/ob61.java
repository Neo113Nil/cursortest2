package defpackage;

import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.model.g;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.yandex.taxi.requirements.models.net.PersistenceTypeDto;
import ru.yandex.taxi.requirements.models.net.c;

/* loaded from: classes15.dex */
public final /* synthetic */ class ob61 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ ob61(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                org orgVar = (org) obj;
                org.k(orgVar);
                ooc.f(orgVar, LicenseUtility.SEPARATOR);
                org.m(orgVar);
                return zy11Var;
            case 1:
                int a = e8m.a(48);
                xn50 xn50Var = ((yn50) ((g9v) obj)).b;
                xn50Var.i = a;
                xn50Var.j = e8m.a(48);
                return zy11Var;
            case 2:
                return Boolean.TRUE;
            case 3:
                g gVar = Zone.Companion;
                f1b0 f1b0Var = ((c) obj).u;
                return Boolean.valueOf((f1b0Var != null ? f1b0Var.a : null) == PersistenceTypeDto.LOCAL);
            default:
                g gVar2 = Zone.Companion;
                f1b0 f1b0Var2 = ((c) obj).u;
                return Boolean.valueOf((f1b0Var2 != null ? f1b0Var2.a : null) == PersistenceTypeDto.LOCAL);
        }
    }
}
