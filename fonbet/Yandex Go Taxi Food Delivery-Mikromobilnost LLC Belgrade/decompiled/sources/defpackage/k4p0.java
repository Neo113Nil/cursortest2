package defpackage;

import com.yandex.go.scooters.b;
import java.util.List;

/* loaded from: classes13.dex */
public final /* synthetic */ class k4p0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ zzs c;

    public /* synthetic */ k4p0(List list, zzs zzsVar, int i) {
        this.a = i;
        this.b = list;
        this.c = zzsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        zzs zzsVar = this.c;
        List list = this.b;
        switch (i) {
            case 0:
                olo0 olo0Var = (olo0) obj;
                b bVar = olo0Var.a;
                bVar.e0 = null;
                bVar.r(new zdk0(28, list, olo0Var.b, zzsVar));
                break;
            default:
                ((l4p0) obj).a.r(new k4p0(list, zzsVar, 0));
                break;
        }
        return zy11Var;
    }
}
