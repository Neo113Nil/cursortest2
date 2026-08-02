package com.yandex.go.multimodal_route.ui.rate_route.repository;

import com.yandex.go.multimodal_route.network.MultimodalRoutesApi;
import com.yandex.go.multimodal_route.network.models.CommitFeedbackDtoRequest;
import com.yandex.go.multimodal_route.network.models.CommitFeedbackDtoResponse;
import defpackage.cmt;
import defpackage.i3y;
import defpackage.lr40;
import defpackage.ny61;
import defpackage.on2;
import defpackage.zy11;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final i3y a;

    public a(on2 on2Var) {
        this.a = kotlin.a.a(new lr40(on2Var, 0));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|27|6|7|(0)(0)|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        defpackage.jst.e.k(r5, "Multimodal commit feedback request error");
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Integer num, List list, String str2, ContinuationImpl continuationImpl) {
        MultimodalCommitFeedbackRepository$commitFeedback$1 multimodalCommitFeedbackRepository$commitFeedback$1;
        int i;
        if (continuationImpl instanceof MultimodalCommitFeedbackRepository$commitFeedback$1) {
            multimodalCommitFeedbackRepository$commitFeedback$1 = (MultimodalCommitFeedbackRepository$commitFeedback$1) continuationImpl;
            int i2 = multimodalCommitFeedbackRepository$commitFeedback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalCommitFeedbackRepository$commitFeedback$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multimodalCommitFeedbackRepository$commitFeedback$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalCommitFeedbackRepository$commitFeedback$1.label;
                if (i != 0) {
                    b.b(obj);
                    cmt<CommitFeedbackDtoResponse> d = ((MultimodalRoutesApi) this.a.getValue()).d(new CommitFeedbackDtoRequest(str, num, str2, list));
                    multimodalCommitFeedbackRepository$commitFeedback$1.L$0 = null;
                    multimodalCommitFeedbackRepository$commitFeedback$1.L$1 = null;
                    multimodalCommitFeedbackRepository$commitFeedback$1.L$2 = null;
                    multimodalCommitFeedbackRepository$commitFeedback$1.L$3 = null;
                    multimodalCommitFeedbackRepository$commitFeedback$1.label = 1;
                    if (ru.yandex.taxi.network.api.a.a(d, null, multimodalCommitFeedbackRepository$commitFeedback$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        multimodalCommitFeedbackRepository$commitFeedback$1 = new MultimodalCommitFeedbackRepository$commitFeedback$1(this, continuationImpl);
        Object obj2 = multimodalCommitFeedbackRepository$commitFeedback$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalCommitFeedbackRepository$commitFeedback$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
