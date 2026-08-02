package com.ybsdk.feature.trackid.push.internal.data;

import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.trackid.push.internal.network.TrackIdPushApi;
import com.ybsdk.feature.trackid.push.internal.network.dto.AnalyticsDto;
import com.ybsdk.feature.trackid.push.internal.network.dto.GetCodeRequest;
import com.ybsdk.feature.trackid.push.internal.network.dto.GetCodeResponse;
import defpackage.d5t;
import defpackage.k32;
import defpackage.ny61;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final TrackIdPushApi a;

    public a(TrackIdPushApi trackIdPushApi) {
        this.a = trackIdPushApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        TrackIdPushRepository$getCode$1 trackIdPushRepository$getCode$1;
        int i;
        Object c;
        if (continuationImpl instanceof TrackIdPushRepository$getCode$1) {
            trackIdPushRepository$getCode$1 = (TrackIdPushRepository$getCode$1) continuationImpl;
            int i2 = trackIdPushRepository$getCode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                trackIdPushRepository$getCode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = trackIdPushRepository$getCode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = trackIdPushRepository$getCode$1.label;
                if (i != 0) {
                    b.b(obj);
                    TrackIdPushRepository$getCode$2 trackIdPushRepository$getCode$2 = new TrackIdPushRepository$getCode$2(this, new GetCodeRequest(str), null);
                    trackIdPushRepository$getCode$1.label = 1;
                    c = c.c(trackIdPushRepository$getCode$2, trackIdPushRepository$getCode$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    c = ((Result) obj).getValue();
                }
                if (!(c instanceof Result.Failure)) {
                    return c;
                }
                GetCodeResponse getCodeResponse = (GetCodeResponse) c;
                List<AnalyticsDto> analytics = getCodeResponse.getAnalytics();
                ArrayList arrayList = new ArrayList(tcc.n(analytics, 10));
                for (AnalyticsDto analyticsDto : analytics) {
                    arrayList.add(new k32(analyticsDto.getEventName(), analyticsDto.getParams()));
                }
                return new d5t(getCodeResponse.getOverrideData().getDeeplink(), getCodeResponse.getOverrideData().getTitle(), getCodeResponse.getOverrideData().getSubtitle(), arrayList);
            }
        }
        trackIdPushRepository$getCode$1 = new TrackIdPushRepository$getCode$1(this, continuationImpl);
        Object obj2 = trackIdPushRepository$getCode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = trackIdPushRepository$getCode$1.label;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
    }
}
