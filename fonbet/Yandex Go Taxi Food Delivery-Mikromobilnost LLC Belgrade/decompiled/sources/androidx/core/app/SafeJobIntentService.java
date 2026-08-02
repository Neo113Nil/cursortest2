package androidx.core.app;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import defpackage.a3y0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \u00072\u00020\u0001:\u0002\b\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Landroidx/core/app/SafeJobIntentService;", "Landroidx/core/app/JobIntentService;", "<init>", "()V", "Landroidx/core/app/i;", "dequeueWork", "()Landroidx/core/app/i;", "Companion", "androidx/core/app/c1", "androidx/core/app/b1", "feedback_common"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class SafeJobIntentService extends JobIntentService {
    public static final b1 Companion = new b1();
    private static final a3y0 logger = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "SafeJobIntentService");

    /* JADX INFO: Access modifiers changed from: private */
    public static final String dequeueWork$lambda$0() {
        return "TaxiJobIntentService dequeue work error";
    }

    @Override // androidx.core.app.JobIntentService
    public i dequeueWork() {
        i iVar;
        try {
            iVar = super.dequeueWork();
        } catch (Exception e) {
            logger.b("dequeueWork", e, new a1(0));
            iVar = null;
        }
        return iVar != null ? new c1(iVar) : iVar;
    }
}
