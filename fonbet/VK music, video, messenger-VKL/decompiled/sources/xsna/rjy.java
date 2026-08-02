package xsna;

import xsna.wjy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class rjy implements izs {
    public final /* synthetic */ wjy.a b;
    public final /* synthetic */ ojy c;

    public /* synthetic */ rjy(wjy.a aVar, ojy ojyVar) {
        this.b = aVar;
        this.c = ojyVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str = (String) obj;
        int i = this.b.u;
        ojy ojyVar = this.c;
        if (i <= 0) {
            return (String) ojyVar.invoke(str);
        }
        String str2 = (String) ojyVar.invoke(str);
        return str2.substring(0, Math.min(i, str2.length()));
    }
}
