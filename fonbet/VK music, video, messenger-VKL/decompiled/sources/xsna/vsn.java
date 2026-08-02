package xsna;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

/* compiled from: DnsOverHttps.kt */
/* loaded from: classes8.dex */
public final class vsn implements lb9 {
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ CountDownLatch c;
    public final /* synthetic */ String d;
    public final /* synthetic */ ArrayList e;

    public vsn(ArrayList arrayList, CountDownLatch countDownLatch, usn usnVar, String str, ArrayList arrayList2) {
        this.b = arrayList;
        this.c = countDownLatch;
        this.d = str;
        this.e = arrayList2;
    }

    @Override // xsna.lb9
    public final void onFailure(okhttp3.d dVar, IOException iOException) {
        ArrayList arrayList = this.b;
        synchronized (arrayList) {
            arrayList.add(iOException);
        }
        this.c.countDown();
    }

    @Override // xsna.lb9
    public final void onResponse(okhttp3.d dVar, okhttp3.u uVar) {
        usn.c(uVar, this.d, this.e, this.b);
        this.c.countDown();
    }
}
