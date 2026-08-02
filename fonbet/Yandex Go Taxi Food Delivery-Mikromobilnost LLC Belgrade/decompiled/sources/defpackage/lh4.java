package defpackage;

/* loaded from: classes5.dex */
public final /* synthetic */ class lh4 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tg4 b;
    public final /* synthetic */ j690 c;
    public final /* synthetic */ int w;

    public /* synthetic */ lh4(tg4 tg4Var, j690 j690Var, int i, int i2) {
        this.a = i2;
        this.b = tg4Var;
        this.c = j690Var;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        j690 j690Var = this.c;
        tg4 tg4Var = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                s3b1.d(tg4Var, j690Var, fidVar, vng.O(i2 | 1));
                break;
            default:
                s3b1.h(tg4Var, j690Var, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
