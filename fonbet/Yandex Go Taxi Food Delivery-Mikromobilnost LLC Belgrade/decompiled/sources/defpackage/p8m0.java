package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class p8m0 implements v7p {
    public final /* synthetic */ int a = 0;
    public final k6g b;
    public final g7g c;
    public final g7g d;

    public p8m0(g7g g7gVar, k6g k6gVar, g7g g7gVar2) {
        this.c = g7gVar;
        this.b = k6gVar;
        this.d = g7gVar2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        g7g g7gVar = this.d;
        g7g g7gVar2 = this.c;
        k6g k6gVar = this.b;
        switch (i) {
            case 0:
                return new o8m0((mdm0) g7gVar2.get(), (Context) k6gVar.get(), (w530) g7gVar.get());
            default:
                Context context = (Context) k6gVar.get();
                g7gVar2.get();
                return new acm0(context, (w530) g7gVar.get());
        }
    }

    public p8m0(k6g k6gVar, g7g g7gVar, g7g g7gVar2) {
        this.b = k6gVar;
        this.c = g7gVar;
        this.d = g7gVar2;
    }
}
