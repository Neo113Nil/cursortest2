package defpackage;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;

/* loaded from: classes11.dex */
public final class d5a1 implements ip60 {
    public static final d5a1 a = new d5a1();
    public static final lxq b;

    static {
        bf91 bf91Var = new bf91();
        bf91Var.a = 1;
        b = new lxq(ErrorResponseData.JSON_ERROR_CODE, x4e.u(uw51.n(sf91.class, bf91Var.a())));
    }

    @Override // defpackage.uyn
    public final void a(Object obj, Object obj2) {
        ((jp60) obj2).f(b, ((dva1) obj).a);
    }
}
