package com.ybsdk.feature.stories.internal.data;

import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.stories.internal.network.StoriesApi;
import defpackage.f5j0;
import defpackage.fdr;
import defpackage.n860;
import defpackage.ny61;
import java.util.Map;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final StoriesApi a;
    public final n860 b;
    public final f5j0 c;
    public final fdr d;

    public a(StoriesApi storiesApi, n860 n860Var, f5j0 f5j0Var, fdr fdrVar) {
        this.a = storiesApi;
        this.b = n860Var;
        this.c = f5j0Var;
        this.d = fdrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, Map map, ContinuationImpl continuationImpl) {
        StoriesRepository$getStories$1 storiesRepository$getStories$1;
        int i;
        if (continuationImpl instanceof StoriesRepository$getStories$1) {
            storiesRepository$getStories$1 = (StoriesRepository$getStories$1) continuationImpl;
            int i2 = storiesRepository$getStories$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storiesRepository$getStories$1.label = i2 - Integer.MIN_VALUE;
                Object obj = storiesRepository$getStories$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storiesRepository$getStories$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                StoriesRepository$getStories$2 storiesRepository$getStories$2 = new StoriesRepository$getStories$2(this, str, str2, map, null);
                storiesRepository$getStories$1.label = 1;
                Object c = c.c(storiesRepository$getStories$2, storiesRepository$getStories$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        storiesRepository$getStories$1 = new StoriesRepository$getStories$1(this, continuationImpl);
        Object obj2 = storiesRepository$getStories$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storiesRepository$getStories$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        StoriesRepository$getVerticalStories$1 storiesRepository$getVerticalStories$1;
        int i;
        if (continuationImpl instanceof StoriesRepository$getVerticalStories$1) {
            storiesRepository$getVerticalStories$1 = (StoriesRepository$getVerticalStories$1) continuationImpl;
            int i2 = storiesRepository$getVerticalStories$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                storiesRepository$getVerticalStories$1.label = i2 - Integer.MIN_VALUE;
                Object obj = storiesRepository$getVerticalStories$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = storiesRepository$getVerticalStories$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                StoriesRepository$getVerticalStories$2 storiesRepository$getVerticalStories$2 = new StoriesRepository$getVerticalStories$2(this, str, null);
                storiesRepository$getVerticalStories$1.label = 1;
                Object c = c.c(storiesRepository$getVerticalStories$2, storiesRepository$getVerticalStories$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        storiesRepository$getVerticalStories$1 = new StoriesRepository$getVerticalStories$1(this, continuationImpl);
        Object obj2 = storiesRepository$getVerticalStories$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = storiesRepository$getVerticalStories$1.label;
        if (i == 0) {
        }
    }
}
