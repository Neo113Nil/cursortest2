package defpackage;

import com.yandex.payment.divkit.sbp.a;

/* loaded from: classes2.dex */
public final /* synthetic */ class luf implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ fq4 c;

    public /* synthetic */ luf(a aVar, fq4 fq4Var, int i) {
        this.a = i;
        this.b = aVar;
        this.c = fq4Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        fq4 fq4Var = this.c;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.Z((sm0) obj, fq4Var);
                break;
            case 1:
                a.W(aVar, (qyj0) obj, fq4Var);
                break;
            default:
                a.W(aVar, (qyj0) obj, fq4Var);
                break;
        }
        return zy11Var;
    }
}
