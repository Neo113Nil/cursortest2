package xsna;

import xsna.qt1;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class nt1 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nt1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                qt1.a.remove((qt1.a) this.c);
                break;
            case 1:
                ((com.vk.music.notifications.restriction.a) this.c).d.b(null);
                break;
            case 2:
                ((bq60) this.c).a(yo60.e.a.a);
                break;
            case 3:
                qyr qyrVar = (qyr) this.c;
                if (qyrVar.g.decrementAndGet() == 0) {
                    qyrVar.f.e();
                    break;
                }
                break;
            case 4:
                yk60.b((yk60) this.c, null, 3);
                break;
            case 5:
                ((dea0) this.c).i = false;
                break;
            default:
                ((ozs0) this.c).g(true);
                break;
        }
    }
}
