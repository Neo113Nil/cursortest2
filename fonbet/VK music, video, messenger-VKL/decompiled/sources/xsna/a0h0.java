package xsna;

import com.google.gson.Gson;
import com.vk.stat.sak.scheme.SchemeStatSak$EventProductMain;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import xsna.m0q;

/* compiled from: SakEventGenerator.kt */
/* loaded from: classes11.dex */
public final class a0h0 implements zyp {
    public final bpn0 a = new bpn0(new p03(7));

    @Override // xsna.zyp
    public final qyp a(long j, rrk0 rrk0Var, m0q m0qVar) {
        try {
            return rrk0Var instanceof e0h0 ? b(j, (e0h0) rrk0Var, m0qVar) : new qyp("", new eta0("SAK"));
        } catch (Throwable th) {
            th.printStackTrace();
            return new qyp("", new eta0("SAK"));
        }
    }

    public final qyp b(long j, e0h0 e0h0Var, m0q m0qVar) {
        int a = m0qVar.a();
        String valueOf = String.valueOf(j * 1000);
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = e0h0Var.a;
        m0q.a aVar = m0qVar.b;
        int i = aVar != null ? aVar.a : 0;
        m0q.a aVar2 = m0qVar.c;
        SchemeStatSak$EventProductMain schemeStatSak$EventProductMain = new SchemeStatSak$EventProductMain(a, valueOf, schemeStatSak$EventScreen, i, aVar2 != null ? aVar2.a : 0, SchemeStatSak$EventProductMain.Type.TYPE_ACTION, e0h0Var.b, null);
        m0qVar.b = new m0q.a(schemeStatSak$EventProductMain.a(), schemeStatSak$EventProductMain.b());
        return new qyp(((Gson) this.a.getValue()).toJson(schemeStatSak$EventProductMain), new eta0("SAK"));
    }
}
