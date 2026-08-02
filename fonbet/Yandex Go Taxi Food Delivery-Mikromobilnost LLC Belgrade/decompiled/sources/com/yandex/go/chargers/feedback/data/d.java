package com.yandex.go.chargers.feedback.data;

import defpackage.cmt;
import defpackage.fmt;
import defpackage.h3y;
import defpackage.ny61;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class d {
    public final h3y a;

    public d(h3y h3yVar) {
        this.a = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ChargersFeedbackRepository$getFeedbackScreen$1 chargersFeedbackRepository$getFeedbackScreen$1;
        int i;
        if (continuationImpl instanceof ChargersFeedbackRepository$getFeedbackScreen$1) {
            chargersFeedbackRepository$getFeedbackScreen$1 = (ChargersFeedbackRepository$getFeedbackScreen$1) continuationImpl;
            int i2 = chargersFeedbackRepository$getFeedbackScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersFeedbackRepository$getFeedbackScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersFeedbackRepository$getFeedbackScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersFeedbackRepository$getFeedbackScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<ChargersFeedbackResponseDto> b = ((ChargersFeedbackApi) this.a.get()).b(new ChargersFeedbackParamsDto(Collections.singletonList(str)));
                    chargersFeedbackRepository$getFeedbackScreen$1.L$0 = null;
                    chargersFeedbackRepository$getFeedbackScreen$1.label = 1;
                    obj = b.a(chargersFeedbackRepository$getFeedbackScreen$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((fmt) obj).a;
            }
        }
        chargersFeedbackRepository$getFeedbackScreen$1 = new ChargersFeedbackRepository$getFeedbackScreen$1(this, continuationImpl);
        Object obj2 = chargersFeedbackRepository$getFeedbackScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersFeedbackRepository$getFeedbackScreen$1.label;
        if (i != 0) {
        }
        return ((fmt) obj2).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Integer num, List list, ContinuationImpl continuationImpl) {
        ChargersFeedbackRepository$sendFeedback$1 chargersFeedbackRepository$sendFeedback$1;
        int i;
        if (continuationImpl instanceof ChargersFeedbackRepository$sendFeedback$1) {
            chargersFeedbackRepository$sendFeedback$1 = (ChargersFeedbackRepository$sendFeedback$1) continuationImpl;
            int i2 = chargersFeedbackRepository$sendFeedback$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersFeedbackRepository$sendFeedback$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersFeedbackRepository$sendFeedback$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersFeedbackRepository$sendFeedback$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<ChargersFeedbackSendResponseDto> a = ((ChargersFeedbackApi) this.a.get()).a(new ChargersFeedbackSendRequestDto(str, num, list));
                    chargersFeedbackRepository$sendFeedback$1.L$0 = null;
                    chargersFeedbackRepository$sendFeedback$1.L$1 = null;
                    chargersFeedbackRepository$sendFeedback$1.L$2 = null;
                    chargersFeedbackRepository$sendFeedback$1.L$3 = null;
                    chargersFeedbackRepository$sendFeedback$1.label = 1;
                    obj = a.a(chargersFeedbackRepository$sendFeedback$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((fmt) obj).a;
            }
        }
        chargersFeedbackRepository$sendFeedback$1 = new ChargersFeedbackRepository$sendFeedback$1(this, continuationImpl);
        Object obj2 = chargersFeedbackRepository$sendFeedback$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersFeedbackRepository$sendFeedback$1.label;
        if (i != 0) {
        }
        return ((fmt) obj2).a;
    }
}
