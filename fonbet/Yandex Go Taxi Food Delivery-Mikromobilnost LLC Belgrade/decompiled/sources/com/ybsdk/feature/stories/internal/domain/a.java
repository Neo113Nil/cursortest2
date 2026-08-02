package com.ybsdk.feature.stories.internal.domain;

import defpackage.ny61;
import java.util.Map;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final com.ybsdk.feature.stories.internal.data.a a;

    public a(com.ybsdk.feature.stories.internal.data.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, Map map, ContinuationImpl continuationImpl) {
        StoriesInteractor$getStories$1 storiesInteractor$getStories$1;
        int i;
        if (continuationImpl instanceof StoriesInteractor$getStories$1) {
            storiesInteractor$getStories$1 = (StoriesInteractor$getStories$1) continuationImpl;
            int i2 = storiesInteractor$getStories$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storiesInteractor$getStories$1.label = i2 - Integer.MIN_VALUE;
                Object obj = storiesInteractor$getStories$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storiesInteractor$getStories$1.label;
                if (i != 0) {
                    b.b(obj);
                    storiesInteractor$getStories$1.label = 1;
                    Object a = this.a.a(str, str2, map, storiesInteractor$getStories$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        storiesInteractor$getStories$1 = new StoriesInteractor$getStories$1(this, continuationImpl);
        Object obj2 = storiesInteractor$getStories$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storiesInteractor$getStories$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        StoriesInteractor$getVerticalStories$1 storiesInteractor$getVerticalStories$1;
        int i;
        if (continuationImpl instanceof StoriesInteractor$getVerticalStories$1) {
            storiesInteractor$getVerticalStories$1 = (StoriesInteractor$getVerticalStories$1) continuationImpl;
            int i2 = storiesInteractor$getVerticalStories$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storiesInteractor$getVerticalStories$1.label = i2 - Integer.MIN_VALUE;
                Object obj = storiesInteractor$getVerticalStories$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storiesInteractor$getVerticalStories$1.label;
                if (i != 0) {
                    b.b(obj);
                    storiesInteractor$getVerticalStories$1.label = 1;
                    Object b = this.a.b(str, storiesInteractor$getVerticalStories$1);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
                if (i == 1) {
                    b.b(obj);
                    return ((Result) obj).getValue();
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        storiesInteractor$getVerticalStories$1 = new StoriesInteractor$getVerticalStories$1(this, continuationImpl);
        Object obj2 = storiesInteractor$getVerticalStories$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storiesInteractor$getVerticalStories$1.label;
        if (i != 0) {
        }
    }
}
