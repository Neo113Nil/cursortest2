package defpackage;

import com.yandex.xplat.common.YSError;

/* loaded from: classes2.dex */
public final /* synthetic */ class c2e0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2e0 b;

    public /* synthetic */ c2e0(d2e0 d2e0Var, int i) {
        this.a = i;
        this.b = d2e0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        d2e0 d2e0Var = this.b;
        switch (i) {
            case 0:
                return d2e0Var.a(coa1.i(obj));
            case 1:
                return d2e0Var.a(coa1.h((YSError) obj));
            default:
                return d2e0Var.b();
        }
    }
}
