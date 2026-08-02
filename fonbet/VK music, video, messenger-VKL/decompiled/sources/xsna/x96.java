package xsna;

import com.vk.im.engine.exceptions.ApiAccessDeniedException;
import xsna.ea6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class x96 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;

    public /* synthetic */ x96(long j) {
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                Throwable th = (Throwable) obj;
                return ((th.getCause() instanceof ApiAccessDeniedException) && o25.b(o25.a())) ? io.reactivex.rxjava3.core.x.k(ea6.e.a.a) : ea6.d(th) ? io.reactivex.rxjava3.core.x.k(new ea6.e.b(this.c)) : io.reactivex.rxjava3.core.x.i(th);
            default:
                return Boolean.valueOf(((r480) obj).c.c.get(Long.valueOf(this.c)) != null);
        }
    }

    public /* synthetic */ x96(g9u0 g9u0Var, long j) {
        this.c = j;
    }
}
