package defpackage;

import com.ybsdk.feature.qr.payments.internal.screens.result.data.entities.ResultStatus;

/* loaded from: classes3.dex */
public final /* synthetic */ class dag0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9g0 b;

    public /* synthetic */ dag0(e9g0 e9g0Var, int i) {
        this.a = i;
        this.b = e9g0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        vzj0 vzj0Var;
        vzj0 vzj0Var2;
        vzj0 vzj0Var3;
        int i = this.a;
        e9g0 e9g0Var = this.b;
        e9g0 e9g0Var2 = (e9g0) obj;
        switch (i) {
            case 0:
                tzj0 tzj0Var = e9g0Var2.k;
                vzj0 vzj0Var4 = tzj0Var.c;
                if (vzj0Var4 != null) {
                    v1v0 v1v0Var = vzj0Var4.a;
                    vzj0Var = vzj0.a(vzj0Var4, v1v0Var != null ? v1v0.a(v1v0Var, false, false, false, 19) : null);
                } else {
                    vzj0Var = null;
                }
                return e9g0.c(e9g0Var, tzj0.a(tzj0Var, null, null, vzj0Var, null, 11), null, null, 31743);
            case 1:
                tzj0 tzj0Var2 = e9g0Var2.k;
                vzj0 vzj0Var5 = tzj0Var2.c;
                if (vzj0Var5 != null) {
                    v1v0 v1v0Var2 = vzj0Var5.a;
                    vzj0Var2 = vzj0.a(vzj0Var5, v1v0Var2 != null ? v1v0.a(v1v0Var2, true, true, false, 19) : null);
                } else {
                    vzj0Var2 = null;
                }
                return e9g0.c(e9g0Var, tzj0.a(tzj0Var2, null, null, vzj0Var2, null, 11), null, null, 31743);
            case 2:
                return e9g0.c(e9g0Var, tzj0.a(e9g0Var2.k, ResultStatus.ERROR, null, null, null, 14), null, null, 29695);
            default:
                tzj0 tzj0Var3 = e9g0Var2.k;
                vzj0 vzj0Var6 = tzj0Var3.c;
                if (vzj0Var6 != null) {
                    v1v0 v1v0Var3 = vzj0Var6.a;
                    vzj0Var3 = vzj0.a(vzj0Var6, v1v0Var3 != null ? v1v0.a(v1v0Var3, false, false, true, 3) : null);
                } else {
                    vzj0Var3 = null;
                }
                return e9g0.c(e9g0Var, tzj0.a(tzj0Var3, null, null, vzj0Var3, null, 11), null, null, 27647);
        }
    }
}
