package defpackage;

import com.ybsdk.common.RestrictedAccountFacade$RateLimitException;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class dxj0 implements jg51 {
    public final jg51 a;
    public final sls b;
    public final ArrayList c;

    public dxj0(jg51 jg51Var) {
        zfj0 zfj0Var = new zfj0(11);
        this.a = jg51Var;
        this.b = zfj0Var;
        this.c = new ArrayList();
    }

    public final boolean a() {
        long longValue = ((Number) this.b.invoke()).longValue();
        Long valueOf = Long.valueOf(longValue);
        ArrayList arrayList = this.c;
        arrayList.add(valueOf);
        arrayList.removeIf(new sdc(25, new vh10(longValue, 21)));
        return arrayList.size() < 2;
    }

    @Override // defpackage.jg51
    public final void p(lg51 lg51Var) {
        if (a()) {
            this.a.p(lg51Var);
        } else {
            ((i4u) lg51Var).d(new RestrictedAccountFacade$RateLimitException());
        }
    }

    @Override // defpackage.jg51
    public final void r(i4u i4uVar) {
        if (a()) {
            this.a.r(i4uVar);
        } else {
            i4uVar.d(new RestrictedAccountFacade$RateLimitException());
        }
    }
}
