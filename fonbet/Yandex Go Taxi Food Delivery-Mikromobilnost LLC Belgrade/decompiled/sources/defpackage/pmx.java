package defpackage;

import retrofit2.Call;

/* loaded from: classes9.dex */
public final class pmx implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Call b;

    public /* synthetic */ pmx(Call call, int i) {
        this.a = i;
        this.b = call;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Call call = this.b;
        switch (i) {
            case 0:
                call.cancel();
                break;
            default:
                call.cancel();
                break;
        }
        return zy11Var;
    }
}
