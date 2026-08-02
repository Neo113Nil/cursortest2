package defpackage;

import com.yandex.go.performance_class.DevicePerformanceClassRepositoryImpl$start$$inlined$collectLatestIn$1;
import com.yandex.go.performance_class.a;
import kotlinx.coroutines.flow.e;

/* loaded from: classes8.dex */
public final class mbj implements yw60 {
    public final a a;

    public mbj(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.yw60
    public final void a(boolean z) {
        a aVar = this.a;
        aVar.h.f();
        tje.N(aVar.h, null, null, new DevicePerformanceClassRepositoryImpl$start$$inlined$collectLatestIn$1(e.t(aVar.a.a.a()), null, aVar), 3);
    }

    @Override // defpackage.yw60
    public final void b() {
        this.a.h.b();
    }

    @Override // defpackage.s150
    public final String getName() {
        return "DevicePerformanceClassAppLifecycleListener";
    }

    @Override // defpackage.yw60
    public final void l() {
        this.a.h.b();
    }
}
