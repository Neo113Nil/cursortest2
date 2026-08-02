package defpackage;

import com.yandex.go.design.view.GoFrameLayout;

/* loaded from: classes12.dex */
public final class fjr implements szl {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fjr(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void e() {
    }

    private final void f() {
    }

    @Override // defpackage.szl
    public final void a(neo neoVar, l1o l1oVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (neoVar instanceof w0m) {
                    ((GoFrameLayout) obj).setVisibility(8);
                    break;
                }
                break;
            default:
                if (!(neoVar instanceof w0m)) {
                    if (neoVar instanceof y0m) {
                        jst.e.n("Scooters BDUI Screen succeed: " + ((y0m) neoVar).b);
                        break;
                    }
                } else {
                    w0m w0mVar = (w0m) neoVar;
                    jst.e.p("Scooters BDUI Screen failed: " + w0mVar.b, w0mVar.c);
                    ((ss9) obj).r(new umm0(24));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.szl
    public final void dispose() {
        int i = this.a;
    }
}
