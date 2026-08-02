package defpackage;

/* loaded from: classes11.dex */
public final /* synthetic */ class ip30 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ tls c;

    public /* synthetic */ ip30(CharSequence charSequence, tls tlsVar, int i, int i2) {
        this.a = i2;
        this.b = charSequence;
        this.c = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        CharSequence charSequence = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                uob1.h(charSequence, tlsVar, fidVar, vng.O(1));
                break;
            default:
                twa1.b(charSequence, tlsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
