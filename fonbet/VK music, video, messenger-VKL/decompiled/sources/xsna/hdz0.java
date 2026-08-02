package xsna;

import java.util.concurrent.CountDownLatch;
import xsna.niz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class hdz0 implements niz0.a {
    public final /* synthetic */ dbz0 a;
    public final /* synthetic */ CountDownLatch b;
    public final /* synthetic */ wdz0 c;
    public final /* synthetic */ String d;

    public hdz0(dbz0 dbz0Var, CountDownLatch countDownLatch, wdz0 wdz0Var, String str) {
        this.a = dbz0Var;
        this.b = countDownLatch;
        this.c = wdz0Var;
        this.d = str;
    }

    @Override // xsna.niz0.a
    public final void a(Object obj) {
        this.a.d = (String) obj;
        this.b.countDown();
    }

    @Override // xsna.niz0.a
    public final void a() {
        this.a.d = null;
        this.b.countDown();
        this.c.b.g(0, 4001, "audioUrl=" + this.d);
    }
}
