package xsna;

import com.vk.audience.api.domain.tracking.AudienceResearchTrackerCodes;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: DzenArticleMediascopeTracker.kt */
/* loaded from: classes18.dex */
public final class uro {
    public yok0 b;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final hpj c = zvj.a(d.a.a(whn0.a(), hqu0.a()));

    public static Object a(AudienceResearchTrackerCodes audienceResearchTrackerCodes, SuspendLambda suspendLambda) {
        Object k = myc0.k(hqu0.b(), new tro(audienceResearchTrackerCodes, null), suspendLambda);
        return k == CoroutineSingletons.COROUTINE_SUSPENDED ? k : s3q0.a;
    }
}
