package defpackage;

import com.yandex.mapkit.transport.masstransit.Session;
import com.yandex.runtime.Error;
import java.util.List;
import kotlin.Result;

/* loaded from: classes6.dex */
public final class iuo0 implements Session.RouteListener {
    public final /* synthetic */ j18 a;

    public iuo0(j18 j18Var) {
        this.a = j18Var;
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session.RouteListener
    public final void onMasstransitRoutes(List list) {
        this.a.resumeWith(list);
    }

    @Override // com.yandex.mapkit.transport.masstransit.Session.RouteListener
    public final void onMasstransitRoutesError(Error error) {
        this.a.resumeWith(new Result.Failure(new RuntimeException(error.toString())));
    }
}
