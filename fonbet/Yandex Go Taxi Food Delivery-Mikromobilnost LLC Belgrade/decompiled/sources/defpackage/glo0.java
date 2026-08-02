package defpackage;

import com.yandex.go.scooters.b;

/* loaded from: classes13.dex */
public final /* synthetic */ class glo0 implements sy60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ glo0(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                bVar.g0 = null;
                break;
            case 1:
                bVar.l0 = null;
                break;
            default:
                bVar.r(new qu(9));
                break;
        }
    }
}
