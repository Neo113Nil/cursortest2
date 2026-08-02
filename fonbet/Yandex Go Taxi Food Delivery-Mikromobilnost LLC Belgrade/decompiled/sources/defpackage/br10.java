package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.authorized.chat.b;
import com.ybsdk.feature.merchants.internal.data.a;
import com.ybsdk.feature.merchants.internal.network.MerchantsApi;
import com.ybsdk.feature.merchants.internal.screens.MerchantsFragment;

/* loaded from: classes3.dex */
public final class br10 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ br10(p720 p720Var, eqh eqhVar, int i) {
        this.a = i;
        this.b = eqhVar;
    }

    public static tc9 a(tw51 tw51Var) {
        int i = 7;
        return new tc9(new dr10(), ImmutableMap.g(MerchantsFragment.class, new jl00(new x0z(new br10(i5m.b(new jl00(new j3g(tw51Var, i), 8)), 2), n3w.a(tw51Var), new j3g(tw51Var, 6), hr10.a), i)));
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new ar10((no10) xvf0Var.get());
            case 1:
                return a((tw51) xvf0Var.get());
            case 2:
                return new a((MerchantsApi) xvf0Var.get());
            case 3:
                return new su10((x22) xvf0Var.get());
            case 4:
                return new uv10((ChatRequest) xvf0Var.get());
            case 5:
                return new vv10((x22) xvf0Var.get());
            case 6:
                return new z7b((b) xvf0Var.get());
            case 7:
                return new ly10((b) xvf0Var.get());
            case 8:
                return new zz10((Context) xvf0Var.get());
            case 9:
                dc1 f0 = ((at2) xvf0Var.get()).f0();
                q5z.i(f0);
                return f0;
            case 10:
                ro6 S = ((at2) xvf0Var.get()).S();
                q5z.i(S);
                return S;
            case 11:
                uc7 p = ((at2) xvf0Var.get()).p();
                q5z.i(p);
                return p;
            case 12:
                v2b f = ((at2) xvf0Var.get()).f();
                q5z.i(f);
                return f;
            case 13:
                m5b m0 = ((at2) xvf0Var.get()).m0();
                q5z.i(m0);
                return m0;
            case 14:
                q5b K = ((at2) xvf0Var.get()).K();
                q5z.i(K);
                return K;
            case 15:
                v5b m = ((at2) xvf0Var.get()).m();
                q5z.i(m);
                return m;
            case 16:
                l6b x = ((at2) xvf0Var.get()).x();
                q5z.i(x);
                return x;
            case 17:
                w6b a0 = ((at2) xvf0Var.get()).a0();
                q5z.i(a0);
                return a0;
            case 18:
                a8b R = ((at2) xvf0Var.get()).R();
                q5z.i(R);
                return R;
            case 19:
                x8b V = ((at2) xvf0Var.get()).V();
                q5z.i(V);
                return V;
            case 20:
                meb Y = ((at2) xvf0Var.get()).Y();
                q5z.i(Y);
                return Y;
            case 21:
                ueb c = ((at2) xvf0Var.get()).c();
                q5z.i(c);
                return c;
            case 22:
                nmf j0 = ((at2) xvf0Var.get()).j0();
                q5z.i(j0);
                return j0;
            case 23:
                ikw0 startTransaction = ((at2) xvf0Var.get()).startTransaction();
                q5z.i(startTransaction);
                return startTransaction;
            case 24:
                gwr l = ((at2) xvf0Var.get()).l();
                q5z.i(l);
                return l;
            case 25:
                wgu l0 = ((at2) xvf0Var.get()).l0();
                q5z.i(l0);
                return l0;
            case 26:
                uh10 h = ((at2) xvf0Var.get()).h();
                q5z.i(h);
                return h;
            case 27:
                xu10 p0 = ((at2) xvf0Var.get()).p0();
                q5z.i(p0);
                return p0;
            case 28:
                xw10 b0 = ((at2) xvf0Var.get()).b0();
                q5z.i(b0);
                return b0;
            default:
                by10 b = ((at2) xvf0Var.get()).b();
                q5z.i(b);
                return b;
        }
    }

    public /* synthetic */ br10(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
