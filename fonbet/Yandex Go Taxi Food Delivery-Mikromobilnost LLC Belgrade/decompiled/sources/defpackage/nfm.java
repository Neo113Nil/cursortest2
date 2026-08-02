package defpackage;

import ru.yandex.taxi.map_common.map.n;

/* loaded from: classes.dex */
public final /* synthetic */ class nfm implements kx4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nfm(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kx4
    public final void a(yb20 yb20Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((tls) obj).invoke(yb20Var);
                break;
            case 1:
                ((tls) obj).invoke(yb20Var);
                break;
            default:
                ((n) obj).l(yb20Var);
                break;
        }
    }
}
