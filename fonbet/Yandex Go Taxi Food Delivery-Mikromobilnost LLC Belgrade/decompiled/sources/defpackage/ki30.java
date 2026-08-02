package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.masstransit.api.model.OpenReason;
import ru.yandex.taxi.masstransit.overlay.a;
import ru.yandex.taxi.masstransit.router.b;

/* loaded from: classes6.dex */
public final class ki30 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ ki30(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                q010 q010Var = (q010) obj;
                if (!(q010Var instanceof o010)) {
                    if (q010Var instanceof p010) {
                        p010 p010Var = (p010) q010Var;
                        String str = p010Var.a;
                        zzs zzsVar = p010Var.b;
                        String str2 = p010Var.c;
                        OpenReason openReason = OpenReason.REASON_SUPER_APP_DISCOVERY_MAP;
                        bVar.getClass();
                        bVar.P(new dp30(zzsVar, new i140(new igu0(str, zzsVar, str2, openReason))));
                        break;
                    }
                } else {
                    String str3 = ((o010) q010Var).a;
                    bVar.getClass();
                    bVar.P(new dp30(null, new j140(null, new d4l0("", str3))));
                    break;
                }
                break;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    a aVar = bVar.V;
                    if (aVar != null) {
                        aVar.detach();
                        break;
                    }
                } else {
                    a aVar2 = bVar.V;
                    if (aVar2 != null) {
                        aVar2.attach();
                        break;
                    }
                }
                break;
        }
        return zy11Var;
    }
}
