package androidx.compose.foundation.gestures;

import defpackage.bvf0;
import defpackage.j9m;
import defpackage.k9m;
import defpackage.l9m;
import defpackage.m9m;
import defpackage.mvg;
import defpackage.n9m;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", l = {508, 510, 512, 519, 521, 524}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class DragGestureNode$startListeningForEvents$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ k this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Lk9m;", "Lzy11;", "processDelta", "<anonymous>", "(Ltls;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", l = {515}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ Ref$ObjectRef<n9m> $event;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref$ObjectRef ref$ObjectRef, k kVar, Continuation continuation) {
            super(2, continuation);
            this.$event = ref$ObjectRef;
            this.this$0 = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$event, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tls) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004f -> B:5:0x0052). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0055 -> B:6:0x0056). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            tls tlsVar;
            n9m n9mVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                tlsVar = (tls) this.L$0;
                n9mVar = this.$event.element;
                if (n9mVar instanceof m9m) {
                }
                return zy11.a;
            }
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Ref$ObjectRef<n9m> ref$ObjectRef = (Ref$ObjectRef) this.L$1;
            tlsVar = (tls) this.L$0;
            kotlin.b.b(obj);
            T t = (n9m) obj;
            ref$ObjectRef.element = t;
            n9mVar = this.$event.element;
            if (!(n9mVar instanceof m9m) || (n9mVar instanceof j9m)) {
                return zy11.a;
            }
            k9m k9mVar = n9mVar instanceof k9m ? (k9m) n9mVar : null;
            if (k9mVar != null) {
                tlsVar.invoke(k9mVar);
            }
            ref$ObjectRef = this.$event;
            kotlinx.coroutines.channels.a aVar = this.this$0.A;
            if (aVar == null) {
                t = 0;
                ref$ObjectRef.element = t;
                n9mVar = this.$event.element;
                if (n9mVar instanceof m9m) {
                }
                return zy11.a;
            }
            this.L$0 = tlsVar;
            this.L$1 = ref$ObjectRef;
            this.label = 1;
            obj = kotlinx.coroutines.channels.a.J(aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            T t2 = (n9m) obj;
            ref$ObjectRef.element = t2;
            n9mVar = this.$event.element;
            if (n9mVar instanceof m9m) {
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$startListeningForEvents$1(k kVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = new DragGestureNode$startListeningForEvents$1(this.this$0, continuation);
        dragGestureNode$startListeningForEvents$1.L$0 = obj;
        return dragGestureNode$startListeningForEvents$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureNode$startListeningForEvents$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
    
        if (r7.L0(r4, r6) != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e0, code lost:
    
        if (androidx.compose.foundation.gestures.k.H0(r7, r6) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f0, code lost:
    
        if (androidx.compose.foundation.gestures.k.H0(r7, r6) != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:30:0x00cf, B:27:0x00bb], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0088 -> B:8:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ca -> B:8:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d1 -> B:8:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e0 -> B:8:0x005a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00f0 -> B:7:0x0023). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Ref$ObjectRef ref$ObjectRef3;
        tse tseVar2;
        tse tseVar3;
        T t;
        T t2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                tseVar = (tse) this.L$0;
                if (bvf0.D(tseVar)) {
                    ref$ObjectRef = new Ref$ObjectRef();
                    kotlinx.coroutines.channels.a aVar = this.this$0.A;
                    if (aVar != null) {
                        this.L$0 = tseVar;
                        this.L$1 = ref$ObjectRef;
                        this.L$2 = ref$ObjectRef;
                        this.label = 1;
                        obj = kotlinx.coroutines.channels.a.J(aVar, this);
                        if (obj != coroutineSingletons) {
                            ref$ObjectRef2 = ref$ObjectRef;
                            t = (n9m) obj;
                            ref$ObjectRef.element = t;
                            t2 = ref$ObjectRef2.element;
                            if (t2 instanceof l9m) {
                                this.L$0 = tseVar;
                                this.L$1 = ref$ObjectRef2;
                                this.L$2 = null;
                                this.label = 2;
                                if (k.I0(this.this$0, (l9m) t2, this) != coroutineSingletons) {
                                    ref$ObjectRef3 = ref$ObjectRef2;
                                    tseVar2 = tseVar;
                                    k kVar = this.this$0;
                                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(ref$ObjectRef3, kVar, null);
                                    this.L$0 = tseVar2;
                                    this.L$1 = ref$ObjectRef3;
                                    this.label = 3;
                                    break;
                                }
                            }
                            if (bvf0.D(tseVar)) {
                                return zy11.a;
                            }
                        }
                        return coroutineSingletons;
                    }
                    ref$ObjectRef2 = ref$ObjectRef;
                    t = 0;
                    ref$ObjectRef.element = t;
                    t2 = ref$ObjectRef2.element;
                    if (t2 instanceof l9m) {
                    }
                    if (bvf0.D(tseVar)) {
                    }
                }
            case 1:
                ref$ObjectRef = (Ref$ObjectRef) this.L$2;
                ref$ObjectRef2 = (Ref$ObjectRef) this.L$1;
                tseVar = (tse) this.L$0;
                kotlin.b.b(obj);
                t = (n9m) obj;
                ref$ObjectRef.element = t;
                t2 = ref$ObjectRef2.element;
                if (t2 instanceof l9m) {
                }
                if (bvf0.D(tseVar)) {
                }
                break;
            case 2:
                ref$ObjectRef3 = (Ref$ObjectRef) this.L$1;
                tseVar2 = (tse) this.L$0;
                kotlin.b.b(obj);
                k kVar2 = this.this$0;
                AnonymousClass1 anonymousClass12 = new AnonymousClass1(ref$ObjectRef3, kVar2, null);
                this.L$0 = tseVar2;
                this.L$1 = ref$ObjectRef3;
                this.label = 3;
                break;
            case 3:
                ref$ObjectRef3 = (Ref$ObjectRef) this.L$1;
                tseVar2 = (tse) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (CancellationException unused) {
                    tseVar3 = tseVar2;
                    k kVar3 = this.this$0;
                    this.L$0 = tseVar3;
                    this.L$1 = null;
                    this.label = 6;
                    break;
                }
                tseVar = tseVar2;
                try {
                } catch (CancellationException unused2) {
                    tseVar3 = tseVar;
                    k kVar32 = this.this$0;
                    this.L$0 = tseVar3;
                    this.L$1 = null;
                    this.label = 6;
                }
                T t3 = ref$ObjectRef3.element;
                if (t3 instanceof m9m) {
                    this.L$0 = tseVar;
                    this.L$1 = null;
                    this.label = 4;
                    if (k.J0(this.this$0, (m9m) t3, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (bvf0.D(tseVar)) {
                    }
                } else {
                    if (t3 instanceof j9m) {
                        k kVar4 = this.this$0;
                        this.L$0 = tseVar;
                        this.L$1 = null;
                        this.label = 5;
                        break;
                    }
                    if (bvf0.D(tseVar)) {
                    }
                }
                break;
            case 4:
                tseVar3 = (tse) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (CancellationException unused3) {
                    k kVar322 = this.this$0;
                    this.L$0 = tseVar3;
                    this.L$1 = null;
                    this.label = 6;
                    break;
                }
                tseVar = tseVar3;
                if (bvf0.D(tseVar)) {
                }
                break;
            case 5:
                tseVar3 = (tse) this.L$0;
                kotlin.b.b(obj);
                tseVar = tseVar3;
                if (bvf0.D(tseVar)) {
                }
                break;
            case 6:
                tseVar3 = (tse) this.L$0;
                kotlin.b.b(obj);
                tseVar = tseVar3;
                if (bvf0.D(tseVar)) {
                }
                break;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
