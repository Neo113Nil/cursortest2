package xsna;

import com.vk.metrics.trackers.my.event.ServiceEvent;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.voip.api.metrics.CallsMetricsTracker;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MyTargetCallsMetricsTracker.kt */
/* loaded from: classes11.dex */
public final class kp50 implements CallsMetricsTracker {

    /* compiled from: MyTargetCallsMetricsTracker.kt */
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CallsMetricsTracker.SingleEvent.values().length];
            try {
                iArr[CallsMetricsTracker.SingleEvent.ONE_TO_ONE_CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallsMetricsTracker.SingleEvent.GROUP_CALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CallsMetricsTracker.SingleEvent.CALL_WITH_CAMERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CallsMetricsTracker.AnyTimeEvent.values().length];
            try {
                iArr2[CallsMetricsTracker.AnyTimeEvent.ACTIVE_CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.vk.voip.api.metrics.CallsMetricsTracker
    public final void a(CallsMetricsTracker.AnyTimeEvent anyTimeEvent) {
        if (a.$EnumSwitchMapping$1[anyTimeEvent.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        jt50.f(ServiceEvent.VOIP_ACTIVE_CALL);
    }

    @Override // com.vk.voip.api.metrics.CallsMetricsTracker
    public final void b(CallsMetricsTracker.AnyTimeEvent anyTimeEvent) {
        if (a.$EnumSwitchMapping$1[anyTimeEvent.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        jt50.d(ServiceEvent.VOIP_ACTIVE_CALL);
    }

    @Override // com.vk.voip.api.metrics.CallsMetricsTracker
    public final void c(CallsMetricsTracker.SingleEvent singleEvent) {
        SingleEvent singleEvent2;
        int i = a.$EnumSwitchMapping$0[singleEvent.ordinal()];
        if (i == 1) {
            singleEvent2 = SingleEvent.VOIP_ONE_TO_ONE_CALL;
        } else if (i == 2) {
            singleEvent2 = SingleEvent.VOIP_GROUP_CALL;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            singleEvent2 = SingleEvent.VOIP_CALL_WITH_CAMERA;
        }
        jt50.a(singleEvent2);
    }
}
