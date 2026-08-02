package xsna;

import android.content.Intent;
import android.os.Bundle;
import com.vk.superapp.api.exceptions.AuthException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c45 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ c45(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                if (!(th instanceof AuthException.NeedCheckSilentTokenException)) {
                    return io.reactivex.rxjava3.core.q.H(th);
                }
                AuthException.NeedCheckSilentTokenException needCheckSilentTokenException = (AuthException.NeedCheckSilentTokenException) th;
                com.vk.superapp.core.api.models.a d = needCheckSilentTokenException.d();
                try {
                    q55 q55Var = q55.a;
                    Bundle bundle = q55.c().a.K;
                    str = bundle != null ? bundle.getString("white_label_flow_input_sat") : null;
                } catch (Throwable unused) {
                    str = null;
                }
                l55 l55Var = l55.a;
                vdx0 vdx0Var = e370.e;
                io.reactivex.rxjava3.internal.operators.observable.m1 b = (vdx0Var != null ? vdx0Var : null).e().b(needCheckSilentTokenException.g(), d.d(), d.e(), d.c(), str);
                String f = d.f();
                l55Var.getClass();
                int i = 0;
                return new io.reactivex.rxjava3.internal.operators.observable.o1(b, new rt0(new r45(f, i), 2)).U(new o7(new s45(f, i), 3)).U(new y33(new p45(th, 0)));
            default:
                c0b0.j(new n1d((Intent) obj, 25));
                return s3q0.a;
        }
    }
}
