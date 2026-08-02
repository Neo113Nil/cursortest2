package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class dia implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ CharSequence c;
    public final /* synthetic */ int w;

    public /* synthetic */ dia(int i, int i2, CharSequence charSequence, CharSequence charSequence2) {
        this.w = i;
        this.b = charSequence;
        this.c = charSequence2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        CharSequence charSequence = this.c;
        CharSequence charSequence2 = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                bjb1.d(i2, charSequence2, charSequence, fidVar, vng.O(1));
                break;
            default:
                num.intValue();
                ed40.o(charSequence2, charSequence, fidVar, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ dia(CharSequence charSequence, CharSequence charSequence2, int i) {
        this.b = charSequence;
        this.c = charSequence2;
        this.w = i;
    }
}
