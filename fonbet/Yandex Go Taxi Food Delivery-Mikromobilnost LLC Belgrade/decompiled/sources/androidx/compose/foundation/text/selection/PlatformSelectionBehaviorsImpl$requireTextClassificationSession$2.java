package androidx.compose.foundation.text.selection;

import android.view.textclassifier.TextClassifier;
import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 273, 282}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2 extends SuspendLambda implements wls {
    final /* synthetic */ wls $block;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1", f = "PlatformSelectionBehaviors.android.kt", l = {283}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ wls $block;
        final /* synthetic */ TextClassifier $textClassificationSession;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextClassifier textClassifier, wls wlsVar, Continuation continuation) {
            super(2, continuation);
            this.$textClassificationSession = textClassifier;
            this.$block = wlsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$textClassificationSession, this.$block, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            TextClassifier textClassifier = this.$textClassificationSession;
            if (textClassifier == null) {
                return null;
            }
            wls wlsVar = this.$block;
            this.label = 1;
            Object invoke = wlsVar.invoke(textClassifier, this);
            return invoke == coroutineSingletons ? coroutineSingletons : invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(a aVar, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$block = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2(this.this$0, this.$block, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0043, code lost:
    
        if (r10.a(r9) == r0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14, types: [g050] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [g050] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [g050] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        kotlinx.coroutines.sync.a aVar2;
        ?? r1;
        TextClassifier textClassifier;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                aVar = this.this$0;
                aVar2 = aVar.e;
                this.L$0 = aVar2;
                this.L$1 = aVar;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r1 = (g050) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        r1 = r1;
                        textClassifier = (TextClassifier) obj;
                        aVar2 = r1;
                        aVar2.d(null);
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(textClassifier, this.$block, null);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        Object w = kotlinx.coroutines.a.w(200L, anonymousClass1, this);
                        return w == coroutineSingletons ? coroutineSingletons : w;
                    } catch (Throwable th) {
                        th = th;
                        r1.d(null);
                        throw th;
                    }
                }
                aVar = (a) this.L$1;
                ?? r4 = (g050) this.L$0;
                kotlin.b.b(obj);
                aVar2 = r4;
            }
            textClassifier = aVar.f;
            if (textClassifier != null) {
                if (textClassifier.isDestroyed()) {
                }
                aVar2.d(null);
                AnonymousClass1 anonymousClass12 = new AnonymousClass1(textClassifier, this.$block, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                Object w2 = kotlinx.coroutines.a.w(200L, anonymousClass12, this);
                if (w2 == coroutineSingletons) {
                }
            }
            PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1 platformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1 = new PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1(aVar, null);
            this.L$0 = aVar2;
            this.L$1 = null;
            this.label = 2;
            Object w3 = kotlinx.coroutines.a.w(300L, platformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1, this);
            if (w3 != coroutineSingletons) {
                r1 = aVar2;
                obj = w3;
                textClassifier = (TextClassifier) obj;
                aVar2 = r1;
                aVar2.d(null);
                AnonymousClass1 anonymousClass122 = new AnonymousClass1(textClassifier, this.$block, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                Object w22 = kotlinx.coroutines.a.w(200L, anonymousClass122, this);
                if (w22 == coroutineSingletons) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            r1 = aVar2;
            r1.d(null);
            throw th;
        }
    }
}
