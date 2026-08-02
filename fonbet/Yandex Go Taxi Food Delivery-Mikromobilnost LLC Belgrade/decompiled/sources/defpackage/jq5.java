package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class jq5 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ String c;
    public final /* synthetic */ f530 w;

    public /* synthetic */ jq5(f530 f530Var, String str, CharSequence charSequence, int i) {
        this.a = 2;
        this.w = f530Var;
        this.c = str;
        this.b = charSequence;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        CharSequence charSequence = this.b;
        String str = this.c;
        f530 f530Var = this.w;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                sq5.h(vng.O(1), fidVar, f530Var, charSequence, str);
                break;
            case 1:
                sq5.g(vng.O(1), fidVar, f530Var, charSequence, str);
                break;
            default:
                i891.c(vng.O(7), fidVar, f530Var, charSequence, str);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ jq5(CharSequence charSequence, String str, f530 f530Var, int i, int i2) {
        this.a = i2;
        this.b = charSequence;
        this.c = str;
        this.w = f530Var;
    }
}
