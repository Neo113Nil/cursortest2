package defpackage;

import ru.yandex.taxi.fragment.BaseFragment;

/* loaded from: classes8.dex */
public final class a090 implements zu31 {
    public final u500 a;
    public final cba0 b;
    public final g90 c;
    public final i130 w;
    public final hcs x;

    public a090(u500 u500Var, cba0 cba0Var, g90 g90Var, i130 i130Var, hcs hcsVar) {
        this.a = u500Var;
        this.b = cba0Var;
        this.c = g90Var;
        this.w = i130Var;
        this.x = hcsVar;
    }

    @Override // defpackage.zu31
    public final void B8() {
        if (((ics) this.x).a() instanceof BaseFragment) {
            this.w.a().h();
        }
    }
}
