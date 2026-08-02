package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class pr9 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ sls c;

    public /* synthetic */ pr9(CharSequence charSequence, sls slsVar, int i, int i2) {
        this.a = i2;
        this.b = charSequence;
        this.c = slsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.c;
        CharSequence charSequence = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ihb1.e(charSequence, slsVar, fidVar, vng.O(1));
                break;
            case 1:
                ksb1.d(charSequence, slsVar, fidVar, vng.O(1));
                break;
            default:
                ksb1.e(charSequence, slsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
