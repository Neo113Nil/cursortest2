package defpackage;

import androidx.recyclerview.widget.c;
import java.util.List;

/* loaded from: classes.dex */
public final class oa3 implements Runnable {
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Runnable w;
    public final /* synthetic */ c x;

    public oa3(c cVar, List list, List list2, int i, Runnable runnable) {
        this.x = cVar;
        this.a = list;
        this.b = list2;
        this.c = i;
        this.w = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.x.c.execute(new na3(0, this, kp50.f(new ma3(this), true)));
    }
}
