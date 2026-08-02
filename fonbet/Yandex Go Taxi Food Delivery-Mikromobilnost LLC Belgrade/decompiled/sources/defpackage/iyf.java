package defpackage;

import android.content.Context;

/* loaded from: classes5.dex */
public final class iyf implements xvf0 {
    public final /* synthetic */ int a;
    public final apf b;

    public /* synthetic */ iyf(apf apfVar, int i) {
        this.a = i;
        this.b = apfVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        apf apfVar = this.b;
        switch (i) {
            case 0:
                Context context = (Context) apfVar.b;
                q5z.h(context);
                return context;
            case 1:
                return (dci) apfVar.w;
            case 2:
                return (qcp0) apfVar.c;
            default:
                return (hwy0) apfVar.x;
        }
    }
}
