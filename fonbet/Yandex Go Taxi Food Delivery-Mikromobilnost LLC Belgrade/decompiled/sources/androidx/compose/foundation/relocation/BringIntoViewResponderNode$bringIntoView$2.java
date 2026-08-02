package androidx.compose.foundation.relocation;

import androidx.compose.foundation.gestures.f;
import defpackage.cvw;
import defpackage.d6w;
import defpackage.dvw;
import defpackage.gge;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ok6;
import defpackage.rzx;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.w04;
import defpackage.wls;
import defpackage.wz40;
import defpackage.y6i0;
import defpackage.zii0;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", f = "BringIntoViewResponder.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class BringIntoViewResponderNode$bringIntoView$2 extends SuspendLambda implements wls {
    final /* synthetic */ sls $boundsProvider;
    final /* synthetic */ rzx $childCoordinates;
    final /* synthetic */ sls $parentRect;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", f = "BringIntoViewResponder.kt", l = {183}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ sls $boundsProvider;
        final /* synthetic */ rzx $childCoordinates;
        int label;
        final /* synthetic */ b this$0;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C00011 extends FunctionReferenceImpl implements sls {
            final /* synthetic */ sls $boundsProvider;
            final /* synthetic */ rzx $childCoordinates;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00011(b bVar, rzx rzxVar, sls slsVar) {
                super(0, 0, cvw.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;");
                this.this$0 = bVar;
                this.$childCoordinates = rzxVar;
                this.$boundsProvider = slsVar;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return b.E0(this.this$0, this.$childCoordinates, this.$boundsProvider);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, rzx rzxVar, sls slsVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$childCoordinates = rzxVar;
            this.$boundsProvider = slsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x00d4, code lost:
        
            if (r12 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L41;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i != 0) {
                if (i == 1) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            f fVar = this.this$0.a;
            C00011 c00011 = new C00011(this.this$0, this.$childCoordinates, this.$boundsProvider);
            this.label = 1;
            fVar.getClass();
            zii0 zii0Var = (zii0) c00011.invoke();
            if (zii0Var != null && !f.G0(fVar, zii0Var, 0L, 0L, 3)) {
                j18 j18Var = new j18(1, dvw.b(this));
                j18Var.u();
                gge ggeVar = new gge(j18Var, c00011);
                ok6 ok6Var = fVar.y;
                wz40 wz40Var = ok6Var.a;
                zii0 zii0Var2 = (zii0) c00011.invoke();
                if (zii0Var2 == null) {
                    j18Var.resumeWith(zy11Var);
                } else {
                    j18Var.w(new w04(19, ok6Var, ggeVar));
                    d6w n = y6i0.n(0, wz40Var.c);
                    int i2 = n.a;
                    int i3 = n.b;
                    if (i2 <= i3) {
                        while (true) {
                            zii0 zii0Var3 = (zii0) ((C00011) ((gge) wz40Var.a[i3]).a).invoke();
                            if (zii0Var3 != null) {
                                zii0 f = zii0Var2.f(zii0Var3);
                                if (f.equals(zii0Var2)) {
                                    wz40Var.a(i3 + 1, ggeVar);
                                    break;
                                }
                                if (!f.equals(zii0Var3)) {
                                    CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                    int i4 = wz40Var.c - 1;
                                    if (i4 <= i3) {
                                        while (true) {
                                            ((gge) wz40Var.a[i3]).b.b(cancellationException);
                                            if (i4 == i3) {
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                }
                            }
                            if (i3 == i2) {
                                break;
                            }
                            i3--;
                        }
                    }
                    wz40Var.a(0, ggeVar);
                    if (!fVar.B) {
                        fVar.H0(0L);
                    }
                }
                obj2 = j18Var.s();
            }
            obj2 = zy11Var;
            return obj2 == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", f = "BringIntoViewResponder.kt", l = {191}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ sls $parentRect;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(b bVar, sls slsVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$parentRect = slsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$parentRect, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                sls slsVar = this.$parentRect;
                this.label = 1;
                if (androidx.compose.ui.relocation.a.a(bVar, slsVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderNode$bringIntoView$2(b bVar, rzx rzxVar, sls slsVar, sls slsVar2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$childCoordinates = rzxVar;
        this.$boundsProvider = slsVar;
        this.$parentRect = slsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BringIntoViewResponderNode$bringIntoView$2 bringIntoViewResponderNode$bringIntoView$2 = new BringIntoViewResponderNode$bringIntoView$2(this.this$0, this.$childCoordinates, this.$boundsProvider, this.$parentRect, continuation);
        bringIntoViewResponderNode$bringIntoView$2.L$0 = obj;
        return bringIntoViewResponderNode$bringIntoView$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BringIntoViewResponderNode$bringIntoView$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tse tseVar = (tse) this.L$0;
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, null), 3);
        return tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, this.$parentRect, null), 3);
    }
}
