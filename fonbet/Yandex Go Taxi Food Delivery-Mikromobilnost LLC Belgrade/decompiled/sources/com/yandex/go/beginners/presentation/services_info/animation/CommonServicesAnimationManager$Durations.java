package com.yandex.go.beginners.presentation.services_info.animation;

import com.ybsdk.widgets.common.OperationProgressView;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/beginners/presentation/services_info/animation/CommonServicesAnimationManager$Durations", "", "Lcom/yandex/go/beginners/presentation/services_info/animation/CommonServicesAnimationManager$Durations;", "", RemoteBioParameters.TIME, "J", "a", "()J", "InitialDelay", "SlidingDelay", "MoveToNextService", "MoveToFinalScreen", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CommonServicesAnimationManager$Durations {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CommonServicesAnimationManager$Durations[] $VALUES;
    public static final CommonServicesAnimationManager$Durations InitialDelay;
    public static final CommonServicesAnimationManager$Durations MoveToFinalScreen;
    public static final CommonServicesAnimationManager$Durations MoveToNextService;
    public static final CommonServicesAnimationManager$Durations SlidingDelay;
    private final long time;

    static {
        CommonServicesAnimationManager$Durations commonServicesAnimationManager$Durations = new CommonServicesAnimationManager$Durations("InitialDelay", 0, OperationProgressView.ROTATION_ANIMATION_DURATION);
        InitialDelay = commonServicesAnimationManager$Durations;
        CommonServicesAnimationManager$Durations commonServicesAnimationManager$Durations2 = new CommonServicesAnimationManager$Durations("SlidingDelay", 1, OperationProgressView.ROTATION_ANIMATION_DURATION);
        SlidingDelay = commonServicesAnimationManager$Durations2;
        CommonServicesAnimationManager$Durations commonServicesAnimationManager$Durations3 = new CommonServicesAnimationManager$Durations("MoveToNextService", 2, 500L);
        MoveToNextService = commonServicesAnimationManager$Durations3;
        CommonServicesAnimationManager$Durations commonServicesAnimationManager$Durations4 = new CommonServicesAnimationManager$Durations("MoveToFinalScreen", 3, 1800L);
        MoveToFinalScreen = commonServicesAnimationManager$Durations4;
        CommonServicesAnimationManager$Durations[] commonServicesAnimationManager$DurationsArr = {commonServicesAnimationManager$Durations, commonServicesAnimationManager$Durations2, commonServicesAnimationManager$Durations3, commonServicesAnimationManager$Durations4};
        $VALUES = commonServicesAnimationManager$DurationsArr;
        $ENTRIES = kotlin.enums.a.a(commonServicesAnimationManager$DurationsArr);
    }

    public CommonServicesAnimationManager$Durations(String str, int i, long j) {
        this.time = j;
    }

    public static CommonServicesAnimationManager$Durations valueOf(String str) {
        return (CommonServicesAnimationManager$Durations) Enum.valueOf(CommonServicesAnimationManager$Durations.class, str);
    }

    public static CommonServicesAnimationManager$Durations[] values() {
        return (CommonServicesAnimationManager$Durations[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final long getTime() {
        return this.time;
    }
}
