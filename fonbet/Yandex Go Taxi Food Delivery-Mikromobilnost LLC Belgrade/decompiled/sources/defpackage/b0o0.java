package defpackage;

import com.yandex.go.scooters.tariff_fix.selection.a;

/* loaded from: classes13.dex */
public final class b0o0 implements kzn0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b0o0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void n1() {
    }

    private final void o1() {
    }

    private final void p1() {
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
    }

    @Override // defpackage.kzn0
    public final void onCancel() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((a) this.b).invoke();
                break;
        }
    }

    @Override // defpackage.kzn0
    public final void v0() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((c0o0) obj).r(new qu(9));
                break;
            default:
                ((a) obj).invoke();
                break;
        }
    }
}
