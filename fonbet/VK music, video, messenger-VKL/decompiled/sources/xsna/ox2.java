package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vkontakte.android.R;
import java.io.IOException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class ox2 implements io.reactivex.rxjava3.core.s {
    public final /* synthetic */ sdx0 b;
    public final /* synthetic */ nx2 c;
    public final /* synthetic */ l7r0 d;
    public final /* synthetic */ String e;

    public /* synthetic */ ox2(String str, nx2 nx2Var, l7r0 l7r0Var, rdx0 rdx0Var, sdx0 sdx0Var) {
        this.b = sdx0Var;
        this.c = nx2Var;
        this.d = l7r0Var;
        this.e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.core.s
    public final void subscribe(io.reactivex.rxjava3.core.r rVar) {
        sdx0 sdx0Var;
        boolean z;
        sdx0 sdx0Var2;
        ox2 ox2Var = this;
        nx2 nx2Var = ox2Var.c;
        l7r0 l7r0Var = ox2Var.d;
        String str = ox2Var.e;
        sdx0 sdx0Var3 = ox2Var.b;
        rVar.a(sdx0Var3);
        sdx0Var3.d = Thread.currentThread();
        sdx0Var3.c = true;
        try {
            try {
                try {
                    try {
                        Object f = nx2Var.f(l7r0Var);
                        sdx0Var3.c = false;
                        rVar.a(null);
                        sdx0Var3.d = null;
                        if (!rVar.h()) {
                            rVar.onNext(f);
                            rVar.onComplete();
                        }
                    } catch (IOException e) {
                        xgx0.a.getClass();
                        xgx0.d(e);
                        try {
                            throw new VKApiExecutionException(-1, str, true, l7r0Var.a.a.getString(R.string.vk_common_network_error), null, null, null, null, 0, null, null, null, 4080);
                        } catch (Throwable th) {
                            th = th;
                            sdx0Var = sdx0Var3;
                            z = 0;
                            sdx0Var2 = sdx0Var;
                            try {
                                sdx0Var2.c = z;
                                rVar.a(null);
                                sdx0Var2.d = null;
                                rVar.b(th);
                                rVar.h();
                            } finally {
                                Thread.interrupted();
                            }
                        }
                    }
                } catch (VKApiExecutionException e2) {
                    throw e2;
                }
            } catch (Throwable th2) {
                th = th2;
                sdx0Var2 = ox2Var;
                z = l7r0Var;
                sdx0Var2.c = z;
                rVar.a(null);
                sdx0Var2.d = null;
                rVar.b(th);
                rVar.h();
            }
        } catch (Throwable th3) {
            th = th3;
            sdx0Var = sdx0Var3;
            z = 0;
            sdx0Var2 = sdx0Var;
            sdx0Var2.c = z;
            rVar.a(null);
            sdx0Var2.d = null;
            rVar.b(th);
            rVar.h();
        }
    }
}
