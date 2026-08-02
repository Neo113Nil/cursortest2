package com.yandex.go.feedback_common.services;

import android.content.Context;
import android.content.Intent;
import com.yandex.go.feedback_common.data.model.FeedbackParam;
import defpackage.lvq;
import defpackage.ny61;
import defpackage.ytq;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class c {
    public final b a;

    public c(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(FeedbackParam feedbackParam, ContinuationImpl continuationImpl) {
        FeedbackTaskQueueInteractor$enqueue$1 feedbackTaskQueueInteractor$enqueue$1;
        int i;
        if (continuationImpl instanceof FeedbackTaskQueueInteractor$enqueue$1) {
            feedbackTaskQueueInteractor$enqueue$1 = (FeedbackTaskQueueInteractor$enqueue$1) continuationImpl;
            int i2 = feedbackTaskQueueInteractor$enqueue$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedbackTaskQueueInteractor$enqueue$1.label = i2 - Integer.MIN_VALUE;
                Object obj = feedbackTaskQueueInteractor$enqueue$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = feedbackTaskQueueInteractor$enqueue$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    feedbackTaskQueueInteractor$enqueue$1.L$0 = feedbackParam;
                    feedbackTaskQueueInteractor$enqueue$1.label = 1;
                    obj = this.a.e.a(feedbackTaskQueueInteractor$enqueue$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    feedbackParam = (FeedbackParam) feedbackTaskQueueInteractor$enqueue$1.L$0;
                    kotlin.b.b(obj);
                }
                ((lvq) obj).f(new FeedbackTask(feedbackParam));
                return zy11.a;
            }
        }
        feedbackTaskQueueInteractor$enqueue$1 = new FeedbackTaskQueueInteractor$enqueue$1(this, continuationImpl);
        Object obj2 = feedbackTaskQueueInteractor$enqueue$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedbackTaskQueueInteractor$enqueue$1.label;
        if (i != 0) {
        }
        ((lvq) obj2).f(new FeedbackTask(feedbackParam));
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        FeedbackTaskQueueInteractor$hasFeedbackInQueue$1 feedbackTaskQueueInteractor$hasFeedbackInQueue$1;
        int i;
        if (continuationImpl instanceof FeedbackTaskQueueInteractor$hasFeedbackInQueue$1) {
            feedbackTaskQueueInteractor$hasFeedbackInQueue$1 = (FeedbackTaskQueueInteractor$hasFeedbackInQueue$1) continuationImpl;
            int i2 = feedbackTaskQueueInteractor$hasFeedbackInQueue$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedbackTaskQueueInteractor$hasFeedbackInQueue$1.label = i2 - Integer.MIN_VALUE;
                Object obj = feedbackTaskQueueInteractor$hasFeedbackInQueue$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = feedbackTaskQueueInteractor$hasFeedbackInQueue$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    feedbackTaskQueueInteractor$hasFeedbackInQueue$1.L$0 = str;
                    feedbackTaskQueueInteractor$hasFeedbackInQueue$1.label = 1;
                    obj = this.a.e.a(feedbackTaskQueueInteractor$hasFeedbackInQueue$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) feedbackTaskQueueInteractor$hasFeedbackInQueue$1.L$0;
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(((lvq) obj).c.contains(str));
            }
        }
        feedbackTaskQueueInteractor$hasFeedbackInQueue$1 = new FeedbackTaskQueueInteractor$hasFeedbackInQueue$1(this, continuationImpl);
        Object obj2 = feedbackTaskQueueInteractor$hasFeedbackInQueue$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedbackTaskQueueInteractor$hasFeedbackInQueue$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((lvq) obj2).c.contains(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Context context, ContinuationImpl continuationImpl) {
        FeedbackTaskQueueInteractor$startServiceIfNeeded$1 feedbackTaskQueueInteractor$startServiceIfNeeded$1;
        Object obj;
        int i;
        if (continuationImpl instanceof FeedbackTaskQueueInteractor$startServiceIfNeeded$1) {
            feedbackTaskQueueInteractor$startServiceIfNeeded$1 = (FeedbackTaskQueueInteractor$startServiceIfNeeded$1) continuationImpl;
            int i2 = feedbackTaskQueueInteractor$startServiceIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                feedbackTaskQueueInteractor$startServiceIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                obj = feedbackTaskQueueInteractor$startServiceIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = feedbackTaskQueueInteractor$startServiceIfNeeded$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    feedbackTaskQueueInteractor$startServiceIfNeeded$1.L$0 = context;
                    feedbackTaskQueueInteractor$startServiceIfNeeded$1.label = 1;
                    obj = this.a.e.a(feedbackTaskQueueInteractor$startServiceIfNeeded$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = (Context) feedbackTaskQueueInteractor$startServiceIfNeeded$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((lvq) obj).a.size() > 0) {
                    ytq ytqVar = FeedbackQueueService.Companion;
                    Intent intent = new Intent();
                    ytqVar.getClass();
                    ytq.a(context, intent);
                }
                return zy11.a;
            }
        }
        feedbackTaskQueueInteractor$startServiceIfNeeded$1 = new FeedbackTaskQueueInteractor$startServiceIfNeeded$1(this, continuationImpl);
        obj = feedbackTaskQueueInteractor$startServiceIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = feedbackTaskQueueInteractor$startServiceIfNeeded$1.label;
        if (i != 0) {
        }
        if (((lvq) obj).a.size() > 0) {
        }
        return zy11.a;
    }
}
