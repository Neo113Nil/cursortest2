package ru.ok.android.externcalls.sdk.stat.mldownload;

import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.sdk.stat.internal.SingleShotStat;
import ru.ok.android.webrtc.stat.call.methods.eventual.CallEventualStatSender;
import ru.ok.android.webrtc.stat.scheme.CallEventualStatName;
import xsna.gzs;
import xsna.mh4;
import xsna.s3q0;
import xsna.wb00;

/* compiled from: MLDownloadStat.kt */
/* loaded from: classes9.dex */
public final class MLDownloadStat extends SingleShotStat {
    public MLDownloadStat(gzs<? extends CallEventualStatSender> gzsVar) {
        super(gzsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 error$lambda$0(String str, String str2, CallEventualStatSender callEventualStatSender) {
        EventItemValue eventItemValue = str != null ? EventItemValueKt.toEventItemValue(str) : null;
        EventItemsMap eventItemsMap = new EventItemsMap();
        eventItemsMap.set("source", str2);
        s3q0 s3q0Var = s3q0.a;
        callEventualStatSender.send(CallEventualStatName.ML_ERROR, eventItemValue, eventItemsMap);
        return s3q0.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 readyToUse$lambda$0(long j, String str, CallEventualStatSender callEventualStatSender) {
        EventItemValue eventItemValue = EventItemValueKt.toEventItemValue(j);
        EventItemsMap eventItemsMap = new EventItemsMap();
        eventItemsMap.set("source", str);
        s3q0 s3q0Var = s3q0.a;
        callEventualStatSender.send(CallEventualStatName.ML_READY_TO_USE, eventItemValue, eventItemsMap);
        return s3q0.a;
    }

    public final void error(String str, String str2) {
        reportOnce(new mh4(19, str2, str));
    }

    public final void readyToUse(String str, long j) {
        reportOnce(new wb00(j, str));
    }
}
