package xsna;

import java.util.HashMap;
import xsna.yl5;

/* compiled from: TransportImpl.java */
/* loaded from: classes.dex */
public final class vop0<T> implements pop0<T> {
    public final eo5 a;
    public final String b;
    public final ijp c;
    public final plp0<T, byte[]> d;
    public final zop0 e;

    public vop0(eo5 eo5Var, String str, ijp ijpVar, plp0 plp0Var, zop0 zop0Var) {
        this.a = eo5Var;
        this.b = str;
        this.c = ijpVar;
        this.d = plp0Var;
        this.e = zop0Var;
    }

    @Override // xsna.pop0
    public final void a(wxp<T> wxpVar, bpp0 bpp0Var) {
        if (wxpVar == null) {
            throw new NullPointerException("Null event");
        }
        String str = this.b;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        plp0<T, byte[]> plp0Var = this.d;
        if (plp0Var == null) {
            throw new NullPointerException("Null transformer");
        }
        sn5 sn5Var = new sn5(this.a, str, wxpVar, plp0Var, this.c);
        zop0 zop0Var = this.e;
        a8h0 a8h0Var = zop0Var.c;
        eo5 eo5Var = sn5Var.a;
        wxp<?> wxpVar2 = sn5Var.c;
        eo5 e = eo5Var.e(wxpVar2.c());
        yl5.a aVar = new yl5.a();
        aVar.f = new HashMap();
        aVar.d = Long.valueOf(zop0Var.a.C());
        aVar.e = Long.valueOf(zop0Var.b.C());
        String str2 = sn5Var.b;
        if (str2 == null) {
            throw new NullPointerException("Null transportName");
        }
        aVar.a = str2;
        aVar.c = new uip(sn5Var.e, sn5Var.d.apply(wxpVar2.b()));
        aVar.b = wxpVar2.a();
        if (wxpVar2.d() != null && wxpVar2.d().a() != null) {
            aVar.g = wxpVar2.d().a();
        }
        wxpVar2.getClass();
        a8h0Var.a(e, aVar.b(), bpp0Var);
    }

    @Override // xsna.pop0
    public final void b(wxp<T> wxpVar) {
        a(wxpVar, new sl9());
    }
}
