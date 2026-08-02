package defpackage;

import com.yandex.messaging.internal.authorized.b;

/* loaded from: classes15.dex */
public final /* synthetic */ class n7c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ n7c(b bVar, boolean z, int i) {
        this.a = i;
        this.b = bVar;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = this.c;
        b bVar = this.b;
        switch (i) {
            case 0:
                ((i00) bVar.b.get()).a(new pvw(z));
                break;
            default:
                ((i00) bVar.b.get()).a(new v3r0(z));
                break;
        }
    }
}
