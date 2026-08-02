package defpackage;

import retrofit2.Call;
import retrofit2.Response;

/* loaded from: classes8.dex */
public final class g6d0 implements Call {
    public final Call a;
    public final j6d0 b = new j6d0();

    public g6d0(Call call) {
        this.a = call;
    }

    @Override // retrofit2.Call
    public final void cancel() {
        this.a.cancel();
    }

    @Override // retrofit2.Call
    public final Call clone() {
        return new g6d0(this.a.clone());
    }

    @Override // retrofit2.Call
    public final Response execute() {
        Object b;
        j6d0 j6d0Var = this.b;
        Call call = this.a;
        try {
            Response execute = call.execute();
            j6d0Var.getClass();
            b = j6d0.a(execute);
        } catch (Throwable th) {
            d5j0 k = call.k();
            j6d0Var.getClass();
            b = j6d0.b(k, th);
        }
        return Response.b(b);
    }

    @Override // retrofit2.Call
    public final d5j0 k() {
        return this.a.k();
    }

    @Override // retrofit2.Call
    public final void k0(yk7 yk7Var) {
        Call call = this.a;
        kjz kjzVar = new kjz(23, this, yk7Var);
        try {
            call.k0(kjzVar);
        } catch (Throwable th) {
            kjzVar.k(call, th);
        }
    }

    @Override // retrofit2.Call
    public final boolean l1() {
        return this.a.l1();
    }

    @Override // retrofit2.Call
    public final boolean n() {
        return this.a.n();
    }
}
