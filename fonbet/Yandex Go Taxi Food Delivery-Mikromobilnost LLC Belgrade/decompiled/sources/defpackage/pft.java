package defpackage;

import com.yandex.messaging.internal.net.Error;

/* loaded from: classes15.dex */
public final class pft implements vn21 {
    public final /* synthetic */ y6f0 a;

    public pft(y6f0 y6f0Var) {
        this.a = y6f0Var;
    }

    @Override // defpackage.vn21
    public final void a(in21 in21Var) {
        ((x6f0) this.a).d(new myj0(in21Var));
    }

    @Override // defpackage.vn21
    public final void onError(int i) {
        ((x6f0) this.a).d(new iyj0(i == 403 ? Error.PRIVACY_RESTRICTIONS : Error.GENERIC));
    }
}
