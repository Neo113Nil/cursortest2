package defpackage;

import com.yandex.mapkit.transport.masstransit.LineSession;

/* loaded from: classes6.dex */
public final class fn30 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ LineSession b;

    public /* synthetic */ fn30(LineSession lineSession, int i) {
        this.a = i;
        this.b = lineSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.cancel();
                break;
            default:
                qyy0.b(new fn30(this.b, 0));
                break;
        }
    }
}
