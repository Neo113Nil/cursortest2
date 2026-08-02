package xsna;

import org.json.JSONObject;
import xsna.ehz;

/* loaded from: classes12.dex */
public final class oiy0 implements Runnable {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ oiy0(ehz ehzVar, ehz.b bVar) {
        this.c = ehzVar;
        this.d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        day0 c;
        switch (this.b) {
            case 0:
                fuy0 fuy0Var = (fuy0) this.d;
                if (fuy0Var.a()) {
                    try {
                        c = s770.c(new JSONObject(fuy0Var.k.version()));
                    } catch (Exception e) {
                        ofy0.f(com.digitalturbine.ignite.authenticator.events.d.ONE_DT_GENERAL_ERROR, e);
                        vay0.d("%s: resolveIgniteServiceVersion : unable to resolve version : %s", "IgniteAuthenticationComponent", e.toString());
                    }
                    fuy0Var.j = c;
                    uiy0.b.post((lpy0) this.c);
                    return;
                }
                c = new day0(false, "");
                fuy0Var.j = c;
                uiy0.b.post((lpy0) this.c);
                return;
            default:
                ehz ehzVar = (ehz) this.c;
                ehz.b bVar = (ehz.b) this.d;
                ehz.a aVar = ehzVar.b;
                if (aVar == null) {
                    bVar.onNotifyListenerFailed();
                    return;
                }
                try {
                    bVar.notifyListener(aVar.a);
                    return;
                } catch (RuntimeException e2) {
                    bVar.onNotifyListenerFailed();
                    throw e2;
                }
        }
    }

    public oiy0(fuy0 fuy0Var, lpy0 lpy0Var) {
        this.d = fuy0Var;
        this.c = lpy0Var;
    }
}
