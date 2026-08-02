package defpackage;

import android.net.Uri;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes14.dex */
public final /* synthetic */ class ajw0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ miw0 b;

    public /* synthetic */ ajw0(miw0 miw0Var, int i) {
        this.a = i;
        this.b = miw0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        miw0 miw0Var = this.b;
        switch (i) {
            case 0:
                ekw0 ekw0Var = (ekw0) obj;
                gkw0.P(ekw0Var.a, ekw0Var, miw0Var, ekw0Var.b, ekw0Var.c);
                break;
            case 1:
                fkw0 fkw0Var = (fkw0) obj;
                gkw0.P(fkw0Var.a, fkw0Var, miw0Var, fkw0Var.b, fkw0Var.c);
                break;
            default:
                dfk0 dfk0Var = (dfk0) obj;
                String str = ((iiw0) miw0Var).a;
                switch (dfk0Var.a) {
                    case 0:
                        p0h p0hVar = (p0h) ((ifk0) dfk0Var.b).O.get();
                        p0hVar.getClass();
                        p0hVar.a.a(Uri.parse(str), DeeplinkSource.UNSPECIFIED);
                        break;
                    default:
                        f9a f9aVar = (f9a) dfk0Var.b;
                        f9aVar.r(new qu(9));
                        ((oiw0) f9aVar.H).invoke(str);
                        break;
                }
        }
        return zy11Var;
    }
}
