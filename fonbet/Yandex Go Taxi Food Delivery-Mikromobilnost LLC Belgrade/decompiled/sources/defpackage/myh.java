package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import ru.yandex.taxi.design.utils.a;

/* loaded from: classes12.dex */
public final class myh implements czh {
    public final /* synthetic */ int a = 0;
    public Object b;
    public final /* synthetic */ h55 c;

    public myh(w030 w030Var, lzh lzhVar) {
        this.c = lzhVar;
        this.b = new zzh(w030Var, lzhVar.E, (a3v) lzhVar.I, (a) lzhVar.J);
    }

    @Override // defpackage.czh
    public final void b(izh izhVar, omy0 omy0Var) {
        int i = this.a;
        hxx hxxVar = hxx.a;
        h55 h55Var = this.c;
        switch (i) {
            case 0:
                com.yandex.go.logistics.cargo_flow.a aVar = (com.yandex.go.logistics.cargo_flow.a) h55Var;
                ConcurrentHashMap concurrentHashMap = aVar.E;
                String str = izhVar.k;
                g0i g0iVar = (g0i) concurrentHashMap.get(str);
                if (g0iVar == null) {
                    g0iVar = (g0i) aVar.D.invoke();
                    concurrentHashMap.put(str, g0iVar);
                }
                this.b = str;
                aVar.E(g0iVar, izhVar, new d0i(omy0Var, new amh(8, g0iVar)), hxxVar);
                break;
            case 1:
                lzh lzhVar = (lzh) h55Var;
                lzhVar.A((zzh) this.b, izhVar, new d0i(omy0Var, new amh(9, lzhVar)));
                break;
            case 2:
                ((r5i) h55Var).A((zzh) this.b, izhVar, new d0i(omy0Var, new bgc(12)));
                break;
            default:
                ((lui) h55Var).E((g0i) this.b, izhVar, new d0i(omy0Var, new amh(15, this)), hxxVar);
                break;
        }
    }

    @Override // defpackage.czh
    public final void dismiss() {
        int i = this.a;
        h55 h55Var = this.c;
        switch (i) {
            case 0:
                g0i g0iVar = (g0i) ((com.yandex.go.logistics.cargo_flow.a) h55Var).E.get((String) this.b);
                if (g0iVar != null) {
                    g0iVar.i();
                    break;
                }
                break;
            case 1:
                ((zzh) this.b).i();
                ((lzh) h55Var).i();
                break;
            case 2:
                ((r5i) h55Var).j(new epb((zzh) this.b));
                break;
            default:
                ((g0i) this.b).i();
                break;
        }
    }

    public myh(lui luiVar) {
        this.c = luiVar;
        this.b = (g0i) ((gw7) luiVar.J).get();
    }

    public myh(com.yandex.go.logistics.cargo_flow.a aVar) {
        this.c = aVar;
    }

    public myh(r5i r5iVar) {
        this.c = r5iVar;
        this.b = (zzh) r5iVar.Z.get();
    }
}
