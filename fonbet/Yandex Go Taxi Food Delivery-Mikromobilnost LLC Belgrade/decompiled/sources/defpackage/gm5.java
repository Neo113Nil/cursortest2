package defpackage;

import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class gm5 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ gm5(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                if (mhx.a(c9y.c(((eix) obj).a), mhx.a)) {
                    tlsVar.invoke(km5.a);
                }
                return Boolean.FALSE;
            case 1:
                return tlsVar.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 2:
                tlsVar.invoke(new m240((diu0) obj));
                return zy11Var;
            case 3:
                tlsVar.invoke((od40) obj);
                return zy11Var;
            case 4:
                tlsVar.invoke(new q4b0((String) obj));
                return zy11Var;
            case 5:
                EmptyList.a.get(((Number) obj).intValue());
                throw null;
            case 6:
                tlsVar.invoke(new ib01((qb01) obj));
                return zy11Var;
            case 7:
                tlsVar.invoke(new fx41(((Number) obj).intValue()));
                return zy11Var;
            default:
                tlsVar.invoke(new ex41(((Boolean) obj).booleanValue()));
                return zy11Var;
        }
    }
}
