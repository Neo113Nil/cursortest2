package defpackage;

/* loaded from: classes13.dex */
public final class cvn0 implements cwn0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ cvn0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.cwn0
    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((dvn0) obj).Fg(Boolean.TRUE);
                break;
            default:
                ((a850) obj).i("scooters_offer_card", true);
                break;
        }
    }

    @Override // defpackage.cwn0
    public final void onDismiss() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((dvn0) obj).Fg(Boolean.FALSE);
                break;
            default:
                ((a850) obj).i("#none#", true);
                break;
        }
    }
}
