package defpackage;

import com.yandex.mapkit.geometry.Point;
import java.util.List;
import ru.yandex.taxi.map.c;

/* loaded from: classes5.dex */
public final class g641 extends r8 {
    public final gzx c;
    public final h641 w;
    public final eym0 x;
    public final j741 y;

    public g641(gzx gzxVar, h641 h641Var, ah00 ah00Var, qcg qcgVar) {
        super(5, ah00Var);
        this.c = gzxVar;
        this.w = h641Var;
        this.x = new eym0(4, this);
        this.y = (j741) qcgVar.get();
    }

    public final void Hg(String str, zzs zzsVar, qur qurVar) {
        h641 h641Var = this.w;
        h641Var.C = zzsVar;
        h641Var.D = str;
        h641Var.B = qurVar;
        this.c.attach();
        h641Var.Bg(new f641(this));
        ((gh00) ((ah00) this.b)).e(this.x);
    }

    public final void Ig(qur qurVar) {
        this.w.B = qurVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Jg(boolean z) {
        Object t69Var;
        h641 h641Var = this.w;
        if (h641Var.c) {
            u641 u641Var = h641Var.A.d;
            List list = u641Var.b;
            nb60 nb60Var = nb60.f;
            if (list != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    t69Var = new s69(list);
                    if (!t69Var.equals(nb60Var)) {
                        if (t69Var instanceof s69) {
                            ((n641) h641Var.Dg()).v(((s69) t69Var).f);
                            return true;
                        }
                        if (!(t69Var instanceof t69)) {
                            w511.b();
                            return false;
                        }
                        if (z) {
                            ((n641) h641Var.Dg()).F(((t69) t69Var).f);
                            return true;
                        }
                    }
                }
            }
            zzs zzsVar = u641Var.a;
            t69Var = zzsVar != null ? new t69(new Point(zzsVar.a, zzsVar.b)) : nb60Var;
            if (!t69Var.equals(nb60Var)) {
            }
        }
        return false;
    }

    public final void Lg() {
        this.w.B = null;
    }

    public final void detach() {
        ((gh00) ((ah00) this.b)).u(this.x);
        this.w.Cg();
        this.c.detach();
        ((c) this.y).a();
    }
}
