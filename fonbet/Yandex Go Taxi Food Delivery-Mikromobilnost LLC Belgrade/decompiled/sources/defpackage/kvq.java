package defpackage;

import androidx.compose.animation.core.e;

/* loaded from: classes12.dex */
public final /* synthetic */ class kvq implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tse b;

    public /* synthetic */ kvq(tse tseVar, int i) {
        this.a = i;
        this.b = tseVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        tse tseVar = this.b;
        switch (i) {
            case 0:
                return "Got error while sending feedback. Delay processing queue. Params: " + tseVar;
            default:
                return Float.valueOf(e.h(tseVar.getCoroutineContext()));
        }
    }
}
