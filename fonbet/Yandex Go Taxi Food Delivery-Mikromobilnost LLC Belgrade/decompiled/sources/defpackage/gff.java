package defpackage;

import com.ybsdk.common.InternalSdkState;
import com.ybsdk.common.c;
import com.ybsdk.common.entities.SessionEntity$Action;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import kotlin.collections.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes8.dex */
public final class gff {
    public final AppAnalyticsReporter a;
    public volatile SessionEntity$Action b;
    public final n0 c;
    public final n0 d;
    public final r0 e;
    public volatile String f;

    public gff(AppAnalyticsReporter appAnalyticsReporter) {
        this.a = appAnalyticsReporter;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.c = ffx.c(1, 0, bufferOverflow, 2);
        this.d = ffx.c(1, 0, bufferOverflow, 2);
        this.e = bvf0.c(sn90.a);
    }

    public final Object a(InternalSdkState internalSdkState, ContinuationImpl continuationImpl) {
        this.a.m0.a.a("tech.session.cache_udpate", x4e.t(2, "source", internalSdkState.getSource().toString(), ClidProvider.STATE, c.b(internalSdkState)));
        Object emit = this.c.emit(internalSdkState, continuationImpl);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11.a;
    }

    public final InternalSdkState b() {
        return (InternalSdkState) a.R(this.c.b());
    }
}
