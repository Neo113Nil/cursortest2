package defpackage;

import kotlin.collections.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class m6p implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ i6p b;
    public final /* synthetic */ n6u c;

    public /* synthetic */ m6p(i6p i6pVar, n6u n6uVar, int i) {
        this.a = i;
        this.b = i6pVar;
        this.c = n6uVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        n6u n6uVar = this.c;
        i6p i6pVar = this.b;
        switch (i) {
            case 0:
                kr krVar = i6pVar.j;
                if (krVar != null) {
                    n6uVar.c.b(krVar, n6uVar.b, b.f());
                    break;
                }
                break;
            default:
                kr krVar2 = i6pVar.k;
                if (krVar2 != null) {
                    n6uVar.c.b(krVar2, n6uVar.b, b.f());
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
