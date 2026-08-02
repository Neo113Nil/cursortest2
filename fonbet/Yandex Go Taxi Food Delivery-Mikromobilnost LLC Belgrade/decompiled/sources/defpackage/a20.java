package defpackage;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public abstract class a20 {
    public final a3y0 a = new a3y0(TaxiOrderLogGroup.CHANGE_ORDER.getTag(), "SimpleDelegate");
    public Object b;

    public abstract String a();

    public void b(Object obj, Throwable th) {
        this.a.b("onFail", th, new j0(9, this, obj));
    }

    public void c(Object obj) {
        this.a.getClass();
        a3y0.h(new String[]{"onUpdate"});
        hst hstVar = jst.e;
    }

    public abstract Object d(String str, Object obj, Continuation continuation);
}
