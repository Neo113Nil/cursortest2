package xsna;

import com.vk.ecomm.onlinebooking.impl.services.presentation.model.BookingServicesScreenState;
import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes18.dex */
public final class ny7 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ Object c;

    public ny7(la2 la2Var, List list) {
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return qjg.a((BookingServicesScreenState.ServiceWrapper) ((List) obj2).get(((Number) obj).intValue()));
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                frd.c.set(false);
                io.reactivex.rxjava3.subjects.e eVar = frd.a;
                io.reactivex.rxjava3.subjects.e eVar2 = frd.a;
                if (eVar2.b.get() != io.reactivex.rxjava3.subjects.e.f || eVar2.d != null) {
                    eVar2.onComplete();
                }
                ((yqd) obj2).invoke(bool);
                return s3q0.a;
        }
    }

    public ny7(yqd yqdVar) {
        io.reactivex.rxjava3.subjects.e eVar = frd.a;
        this.c = yqdVar;
    }
}
