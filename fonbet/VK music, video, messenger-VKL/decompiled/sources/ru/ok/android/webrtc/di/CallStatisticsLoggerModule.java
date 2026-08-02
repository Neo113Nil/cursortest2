package ru.ok.android.webrtc.di;

import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.stat.call.CallStatisticsLogger;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;

@CallInternalApi
/* loaded from: classes9.dex */
public interface CallStatisticsLoggerModule {
    CallEventualStatSender getCallEventualStatSender();

    CallStatisticsLogger getCallStatisticsLogger();
}
