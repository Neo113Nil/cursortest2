package com.yandex.go.flex.main_screen.presentation.feed;

import com.yandex.go.flex.main_screen.data.DocumentSourceVariableFactory$Companion$DocumentSource;
import defpackage.gci0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\n"}, d2 = {"T", "Lvpr;", "value", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.presentation.feed.FeedScroller$waitForFeedLoadingFinished$1", f = "FeedScroller.kt", l = {35, 36, 37}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class FeedScroller$waitForFeedLoadingFinished$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.feed.FeedScroller$waitForFeedLoadingFinished$1$1, reason: invalid class name */
    /* loaded from: classes12.dex */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements wls {
        public AnonymousClass1(DocumentSourceVariableFactory$Companion$DocumentSource documentSourceVariableFactory$Companion$DocumentSource) {
            super(2, documentSourceVariableFactory$Companion$DocumentSource, DocumentSourceVariableFactory$Companion$DocumentSource.class, "equals", "equals(Ljava/lang/Object;)Z", 4);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(((DocumentSourceVariableFactory$Companion$DocumentSource) this.receiver).equals(obj));
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.flex.main_screen.presentation.feed.FeedScroller$waitForFeedLoadingFinished$1$2, reason: invalid class name */
    /* loaded from: classes12.dex */
    final /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements wls {
        public AnonymousClass2(FeedState feedState) {
            super(2, feedState, FeedState.class, "equals", "equals(Ljava/lang/Object;)Z", 4);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(((FeedState) this.receiver).equals(obj));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedScroller$waitForFeedLoadingFinished$1(b bVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FeedScroller$waitForFeedLoadingFinished$1 feedScroller$waitForFeedLoadingFinished$1 = new FeedScroller$waitForFeedLoadingFinished$1(this.this$0, (Continuation) obj3);
        feedScroller$waitForFeedLoadingFinished$1.L$0 = (vpr) obj;
        feedScroller$waitForFeedLoadingFinished$1.L$1 = obj2;
        return feedScroller$waitForFeedLoadingFinished$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        if (r0.emit(r1, r9) == r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
    
        if (kotlinx.coroutines.flow.e.x(r10, r3, r9) == r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (kotlinx.coroutines.flow.e.x(r10, r3, r9) == r2) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            gci0 gci0Var = this.this$0.c.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(DocumentSourceVariableFactory$Companion$DocumentSource.NETWORK);
            this.L$0 = vprVar;
            this.L$1 = obj2;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        gci0 gci0Var2 = this.this$0.b.g;
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(FeedState.LOADING_FINISHED);
        this.L$0 = vprVar;
        this.L$1 = obj2;
        this.label = 2;
    }
}
