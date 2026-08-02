package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public final class oj51 implements tsr, zeo, ca20 {
    public static yeo c;
    public static final HashMap w = new HashMap();
    public ea20 a;
    public afo b;

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        tt5 tt5Var = ssrVar.c;
        ea20 ea20Var = new ea20(tt5Var, "yx_logger_methods");
        this.a = ea20Var;
        ea20Var.b(this);
        afo afoVar = new afo(tt5Var, "yx_logger_events");
        this.b = afoVar;
        afoVar.a(this);
    }

    @Override // defpackage.zeo
    public final void onCancel(Object obj) {
        c = null;
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ea20 ea20Var = this.a;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
        afo afoVar = this.b;
        if (afoVar == null) {
            afoVar = null;
        }
        afoVar.a(null);
        c = null;
    }

    @Override // defpackage.zeo
    public final void onListen(Object obj, xeo xeoVar) {
        c = (yeo) xeoVar;
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        if (!jl40.l(x920Var.a, "setLevels")) {
            ((ba20) da20Var).notImplemented();
            return;
        }
        for (Map.Entry entry : ((Map) x920Var.b).entrySet()) {
            String str = (String) entry.getKey();
            Map map = (Map) entry.getValue();
            oby obyVar = new oby((String) map.get("name"), ((Integer) map.get("value")).intValue());
            fq60 b = aw91.b(str);
            b.a = obyVar;
            Iterator it = b.b.iterator();
            while (it.hasNext()) {
                ((tls) it.next()).invoke(obyVar);
            }
        }
        ((ba20) da20Var).success(null);
    }
}
