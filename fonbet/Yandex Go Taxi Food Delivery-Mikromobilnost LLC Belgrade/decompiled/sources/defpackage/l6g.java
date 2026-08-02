package defpackage;

import android.content.Context;

/* loaded from: classes14.dex */
public final class l6g implements xvf0 {
    public final /* synthetic */ int a;
    public final wrr b;

    public /* synthetic */ l6g(wrr wrrVar, int i) {
        this.a = i;
        this.b = wrrVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        wrr wrrVar = this.b;
        switch (i) {
            case 0:
                return (jwh) wrrVar.A;
            case 1:
                Context context = (Context) wrrVar.b;
                q5z.h(context);
                return context;
            case 2:
                return (dci) wrrVar.y;
            case 3:
                czi0 czi0Var = (czi0) wrrVar.z;
                q5z.h(czi0Var);
                return czi0Var;
            case 4:
                return (qcp0) wrrVar.c;
            case 5:
                return (hjz) wrrVar.x;
            default:
                return (hwy0) wrrVar.w;
        }
    }
}
