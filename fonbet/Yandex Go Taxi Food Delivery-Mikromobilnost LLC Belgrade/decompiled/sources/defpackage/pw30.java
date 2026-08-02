package defpackage;

import com.yandex.mapkit.transport.masstransit.Session;

/* loaded from: classes14.dex */
public final class pw30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Session b;

    public /* synthetic */ pw30(Session session, int i) {
        this.a = i;
        this.b = session;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.cancel();
                break;
            case 1:
                qyy0.b(new pw30(this.b, 0));
                break;
            case 2:
                this.b.cancel();
                break;
            case 3:
                qyy0.b(new pw30(this.b, 2));
                break;
            case 4:
                this.b.cancel();
                break;
            case 5:
                qyy0.b(new pw30(this.b, 4));
                break;
            case 6:
                this.b.cancel();
                break;
            case 7:
                qyy0.b(new pw30(this.b, 6));
                break;
            case 8:
                this.b.cancel();
                break;
            case 9:
                this.b.cancel();
                break;
            case 10:
                qyy0.b(new pw30(this.b, 9));
                break;
            case 11:
                this.b.cancel();
                break;
            case 12:
                qyy0.b(new pw30(this.b, 11));
                break;
            case 13:
                this.b.cancel();
                break;
            default:
                qyy0.b(new pw30(this.b, 13));
                break;
        }
    }
}
