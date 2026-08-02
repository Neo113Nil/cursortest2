package defpackage;

import androidx.concurrent.futures.b;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes10.dex */
public final /* synthetic */ class hur implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mur b;
    public final /* synthetic */ long c;

    public /* synthetic */ hur(int i, long j, mur murVar) {
        this.a = i;
        this.b = murVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 0;
        long j = this.c;
        mur murVar = this.b;
        switch (i) {
            case 0:
                if (j == murVar.k) {
                    murVar.m = false;
                    ScheduledFuture scheduledFuture = murVar.j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                        murVar.j = null;
                    }
                    b bVar = murVar.t;
                    if (bVar != null) {
                        bVar.b(new nur(false));
                        murVar.t = null;
                        break;
                    }
                }
                break;
            case 1:
                murVar.b.execute(new hur(i2, j, murVar));
                break;
            case 2:
                murVar.b.execute(new hur(3, j, murVar));
                break;
            default:
                if (j == murVar.k) {
                    murVar.b(null);
                    break;
                }
                break;
        }
    }
}
