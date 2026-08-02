package defpackage;

import ru.yandex.taxi.preorder.tollroad.compose.navigation.b;

/* loaded from: classes6.dex */
public final /* synthetic */ class auk0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ auk0(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                return new buk0(bVar);
            default:
                bVar.H.e(cuk0.a, (ztk0) bVar.M.getValue());
                return zy11.a;
        }
    }
}
