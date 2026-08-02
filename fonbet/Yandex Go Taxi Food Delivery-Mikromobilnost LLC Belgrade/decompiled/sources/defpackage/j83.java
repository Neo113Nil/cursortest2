package defpackage;

import com.yandex.go.preorder.navigation.c;
import com.yandex.go.preorder.navigation.n;
import com.yandex.go.suggest.impl.router.d;

/* loaded from: classes13.dex */
public final class j83 implements ozi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j83(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void n1() {
    }

    private final void o1() {
    }

    private final void p1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ozi
    public final void X() {
        int i = this.a;
        ijv0 ijv0Var = null;
        Object[] objArr = 0;
        ghv0 ghv0Var = ghv0.a;
        int i2 = 9;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((e83) obj).execute();
                break;
            case 1:
                zsa zsaVar = (zsa) obj;
                zsaVar.r(new qu(i2));
                ((l7a) zsaVar.G).run();
                break;
            case 2:
                c.c0((c) obj, null, 31);
                break;
            case 3:
                pw1 pw1Var = (pw1) obj;
                pw1Var.r(new qu(i2));
                ((qht0) ((rft0) pw1Var.F)).b(ghv0Var);
                break;
            case 4:
                ((n) obj).Y(new xse0(ghv0Var, ijv0Var, objArr == true ? 1 : 0, 62));
                break;
            case 5:
                xx70 xx70Var = (xx70) obj;
                xx70Var.r(new qu(i2));
                ((ogu0) xx70Var.E).invoke();
                break;
            case 6:
                f9a.P((f9a) obj);
                break;
            default:
                d dVar = (d) obj;
                dVar.M.a(dVar.K.k(), "open_summary_from_point_on_map", true, unv0.a, new bhv0(0));
                break;
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        int i2 = 9;
        Object obj = this.b;
        switch (i) {
            case 1:
                zsa zsaVar = (zsa) obj;
                zsaVar.r(new qu(i2));
                ((v4a) zsaVar.F).run();
                break;
            case 2:
                ((c) obj).U();
                break;
            case 3:
                ((pw1) obj).r(new qu(i2));
                break;
            case 5:
                ((xx70) obj).r(new qu(i2));
                break;
            case 6:
                ((f9a) obj).Q(null);
                break;
        }
    }
}
