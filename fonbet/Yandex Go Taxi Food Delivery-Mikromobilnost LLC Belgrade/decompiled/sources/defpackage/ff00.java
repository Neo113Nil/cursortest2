package defpackage;

import android.content.Context;

/* loaded from: classes5.dex */
public final class ff00 implements v7p {
    public final /* synthetic */ int a = 0;
    public final n3w b;
    public final ibg c;
    public final ibg d;
    public final gbg e;

    public ff00(n3w n3wVar, ibg ibgVar, gbg gbgVar, ibg ibgVar2) {
        this.b = n3wVar;
        this.c = ibgVar;
        this.e = gbgVar;
        this.d = ibgVar2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        gbg gbgVar = this.e;
        ibg ibgVar = this.d;
        ibg ibgVar2 = this.c;
        n3w n3wVar = this.b;
        switch (i) {
            case 0:
                return new ef00((Context) n3wVar.a, (qcp0) ibgVar2.get(), (jwh) gbgVar.get(), (hwy0) ibgVar.get());
            default:
                return new ef00((Context) n3wVar.a, (qcp0) ibgVar2.get(), (hwy0) ibgVar.get(), (jwh) gbgVar.get());
        }
    }

    public ff00(n3w n3wVar, ibg ibgVar, ibg ibgVar2, gbg gbgVar) {
        this.b = n3wVar;
        this.c = ibgVar;
        this.d = ibgVar2;
        this.e = gbgVar;
    }
}
