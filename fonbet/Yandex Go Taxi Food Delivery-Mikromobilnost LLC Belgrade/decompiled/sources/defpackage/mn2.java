package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;
import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public final /* synthetic */ class mn2 implements xf7, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ OkHttpClient b;

    public /* synthetic */ mn2(OkHttpClient okHttpClient, int i) {
        this.a = i;
        this.b = okHttpClient;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof xf7) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof xf7) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
        }
        return new FunctionReferenceImpl(1, this.b, OkHttpClient.class, "newCall", "newCall(Lokhttp3/Request;)Lokhttp3/Call;", 0);
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }

    @Override // defpackage.xf7
    public final yf7 newCall(d5j0 d5j0Var) {
        int i = this.a;
        OkHttpClient okHttpClient = this.b;
        switch (i) {
        }
        return okHttpClient.newCall(d5j0Var);
    }
}
