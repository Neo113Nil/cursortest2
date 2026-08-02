package defpackage;

import kotlinx.serialization.modules.a;

/* loaded from: classes9.dex */
public final class ph2 implements r1m {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object d;

    public ph2(hxk hxkVar, sul sulVar) {
        this.b = sulVar;
        this.c = new vit(hxkVar);
        this.d = new cot(hxkVar);
    }

    @Override // defpackage.r1m
    public final void extendDocumentParser(a aVar) {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                aVar.g(qoi0.a(tg2.class), new li2((fj2) obj2, (mi2) obj3, (seu) obj));
                break;
            default:
                sul sulVar = (sul) obj2;
                aVar.g(qoi0.a(n5o.class), new p5o((vit) obj3, sulVar));
                aVar.g(qoi0.a(q5o.class), new r5o((cot) obj, sulVar));
                break;
        }
    }

    public ph2(fj2 fj2Var, mi2 mi2Var, seu seuVar) {
        this.b = fj2Var;
        this.c = mi2Var;
        this.d = seuVar;
    }
}
