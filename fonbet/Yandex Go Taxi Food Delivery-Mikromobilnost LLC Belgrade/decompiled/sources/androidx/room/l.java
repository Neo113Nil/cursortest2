package androidx.room;

import defpackage.j18;
import defpackage.tje;
import defpackage.wls;
import defpackage.x4c;

/* loaded from: classes10.dex */
public final class l implements Runnable {
    public final /* synthetic */ j18 a;
    public final /* synthetic */ RoomDatabase b;
    public final /* synthetic */ wls c;

    public l(j18 j18Var, RoomDatabase roomDatabase, wls wlsVar) {
        this.a = j18Var;
        this.b = roomDatabase;
        this.c = wlsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j18 j18Var = this.a;
        try {
            tje.Y(j18Var.x.minusKey(x4c.K), new RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1(this.b, j18Var, this.c, null));
        } catch (Throwable th) {
            j18Var.b(th);
        }
    }
}
