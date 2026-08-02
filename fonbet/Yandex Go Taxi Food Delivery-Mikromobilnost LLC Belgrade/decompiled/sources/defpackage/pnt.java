package defpackage;

import kotlin.Pair;

/* loaded from: classes12.dex */
public final /* synthetic */ class pnt implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ String c;

    public /* synthetic */ pnt(int i, String str, Throwable th) {
        this.a = i;
        this.b = th;
        this.c = str;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        String str = this.c;
        Throwable th = this.b;
        switch (i) {
            case 0:
                return new Pair(th, g8e.o("Action execution failed: ", str));
            case 1:
                return new Pair(th, g8e.o("Corrupted content receiver: ", str));
            case 2:
                return new Pair(th, g8e.o("Corrupted action received: ", str));
            case 3:
                return new Pair(th, g8e.o("Corrupted scaffold received: ", str));
            default:
                return new Pair(th, g8e.o("Sections operation failed: ", str));
        }
    }
}
