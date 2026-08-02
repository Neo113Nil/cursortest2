package defpackage;

import ru.yandex.taxi.delivery.router.primary.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class m5i implements gzh {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m5i(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gzh
    public final czh create() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new myh((r5i) obj);
            case 1:
                return new tu8((a) obj, 3);
            default:
                return ((vyh) obj).create();
        }
    }
}
