package com.yandex.go.requirements.comment.summary.ui.v3.domain;

import com.yandex.go.requirements.comment.summary.ui.v3.data.experiment.SuggestForCommentExperiment;
import defpackage.ha2;
import defpackage.ny61;
import defpackage.rz0;
import defpackage.wiq0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class t {
    public static final /* synthetic */ int d = 0;
    public final com.yandex.go.requirements.comment.summary.ui.v3.data.c a;
    public final s b;
    public final rz0 c;

    static {
        int i = com.yandex.go.requirements.comment.summary.ui.v3.data.c.e;
    }

    public t(com.yandex.go.requirements.comment.summary.ui.v3.data.c cVar, s sVar, rz0 rz0Var) {
        this.a = cVar;
        this.b = sVar;
        this.c = rz0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(1:18))(4:22|(2:24|(2:26|21))|13|14)|19))|30|6|7|(0)(0)|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r6.a((com.yandex.go.requirements.comment.summary.ui.v3.data.net.request.SuggestCommentRequestDto) r7, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
    
        throw r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UpdateSuggestInteractor$loadSuggests$1 updateSuggestInteractor$loadSuggests$1;
        int i;
        if (continuationImpl instanceof UpdateSuggestInteractor$loadSuggests$1) {
            updateSuggestInteractor$loadSuggests$1 = (UpdateSuggestInteractor$loadSuggests$1) continuationImpl;
            int i2 = updateSuggestInteractor$loadSuggests$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateSuggestInteractor$loadSuggests$1.label = i2 - Integer.MIN_VALUE;
                Object obj = updateSuggestInteractor$loadSuggests$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateSuggestInteractor$loadSuggests$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (((SuggestForCommentExperiment) this.c.b.b()).b) {
                        ha2 b = b();
                        updateSuggestInteractor$loadSuggests$1.label = 1;
                        obj = kotlinx.coroutines.flow.e.y(b, updateSuggestInteractor$loadSuggests$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                kotlin.b.b(obj);
                com.yandex.go.requirements.comment.summary.ui.v3.data.c cVar = this.a;
                updateSuggestInteractor$loadSuggests$1.L$0 = null;
                updateSuggestInteractor$loadSuggests$1.label = 2;
            }
        }
        updateSuggestInteractor$loadSuggests$1 = new UpdateSuggestInteractor$loadSuggests$1(this, continuationImpl);
        Object obj2 = updateSuggestInteractor$loadSuggests$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateSuggestInteractor$loadSuggests$1.label;
        if (i != 0) {
        }
        com.yandex.go.requirements.comment.summary.ui.v3.data.c cVar2 = this.a;
        updateSuggestInteractor$loadSuggests$1.L$0 = null;
        updateSuggestInteractor$loadSuggests$1.label = 2;
    }

    public final ha2 b() {
        s sVar = this.b;
        com.yandex.go.route.interactor.b bVar = sVar.c;
        h hVar = new h(new f(bVar.k()));
        r rVar = new r(new p(new n(bVar.k())));
        wiq0 wiq0Var = sVar.b;
        return kotlinx.coroutines.flow.e.l(hVar, rVar, new j(((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).j.b()), new l(((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).j.b()), sVar.a(), new UpdateSuggestInteractor$requestParamFlow$1(null));
    }
}
