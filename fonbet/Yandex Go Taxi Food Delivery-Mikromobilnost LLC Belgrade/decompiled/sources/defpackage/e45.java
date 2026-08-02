package defpackage;

import com.yandex.messaging.internal.view.timeline.c;

/* loaded from: classes15.dex */
public final /* synthetic */ class e45 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ e45(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                return (xav) cVar.J0.get();
            case 1:
                return ((ow10) cVar.B0.I).a(cVar.E0(), cVar.T);
            case 2:
                return Boolean.valueOf(((nm1) ((h3y) cVar.B0.E).get()).c);
            case 3:
                return Boolean.valueOf(((rbv0) ((h3y) cVar.B0.D).get()).c);
            case 4:
                try {
                    return cVar.e0();
                } catch (IllegalStateException unused) {
                    z83.i();
                    return null;
                }
            default:
                cVar.J0(cVar.H0, cVar.G0);
                return zy11.a;
        }
    }
}
