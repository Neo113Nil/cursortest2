package defpackage;

import com.ybsdk.feature.settings.internal.view.b;

/* loaded from: classes3.dex */
public final /* synthetic */ class o6r0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ o6r0(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                n7r0 n7r0Var = bVar.a;
                c9r0 c9r0Var = (c9r0) obj;
                String str = c9r0Var.g;
                if (str != null) {
                    h791.c((j3h) ((y7r0) n7r0Var).a.get(), str);
                }
                String str2 = c9r0Var.e;
                if (str2 != null) {
                    ((y7r0) n7r0Var).a(str2);
                    break;
                }
                break;
            default:
                String str3 = ((c9r0) obj).e;
                if (str3 != null) {
                    ((y7r0) bVar.a).a(str3);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
