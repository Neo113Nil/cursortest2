package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.z;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.f;
import defpackage.hwd0;
import defpackage.kx91;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.tse;
import defpackage.tvd0;
import defpackage.wls;
import defpackage.wu60;
import defpackage.zvd0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", f = "LazyLayoutPager.kt", l = {296}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class LazyLayoutPagerKt$dragDirectionDetector$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ d $state;
    final /* synthetic */ hwd0 $this_pointerInput;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", f = "LazyLayoutPager.kt", l = {298, 302}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends RestrictedSuspendLambda implements wls {
        final /* synthetic */ d $state;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d dVar, Continuation continuation) {
            super(2, continuation);
            this.$state = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
        
            if (r12 == r0) goto L17;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0084 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0072  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0060 -> B:6:0x0064). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            f fVar;
            zvd0 zvd0Var;
            f fVar2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zvd0 zvd0Var2 = null;
            if (i == 0) {
                kotlin.b.b(obj);
                fVar = (f) this.L$0;
                PointerEventPass pointerEventPass = PointerEventPass.Initial;
                this.L$0 = fVar;
                this.label = 1;
                obj = z.a(fVar, false, pointerEventPass, this);
            } else if (i == 1) {
                fVar = (f) this.L$0;
                kotlin.b.b(obj);
            } else {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zvd0 zvd0Var3 = (zvd0) this.L$2;
                zvd0 zvd0Var4 = (zvd0) this.L$1;
                fVar2 = (f) this.L$0;
                kotlin.b.b(obj);
                tvd0 tvd0Var = (tvd0) obj;
                List list = tvd0Var.a;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        zvd0 zvd0Var5 = zvd0Var4;
                        zvd0Var2 = (zvd0) tvd0Var.a.get(0);
                        zvd0Var = zvd0Var5;
                        break;
                    }
                    if (!kx91.c((zvd0) list.get(i2))) {
                        zvd0Var = zvd0Var4;
                        zvd0Var2 = zvd0Var3;
                        break;
                    }
                    i2++;
                }
                if (zvd0Var2 == null) {
                    PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                    this.L$0 = fVar2;
                    this.L$1 = zvd0Var;
                    this.L$2 = zvd0Var2;
                    this.label = 2;
                    Object a = fVar2.a(pointerEventPass2, this);
                    if (a != coroutineSingletons) {
                        zvd0 zvd0Var6 = zvd0Var2;
                        zvd0Var4 = zvd0Var;
                        obj = a;
                        zvd0Var3 = zvd0Var6;
                        tvd0 tvd0Var2 = (tvd0) obj;
                        List list2 = tvd0Var2.a;
                        int size2 = list2.size();
                        int i22 = 0;
                        while (true) {
                            if (i22 >= size2) {
                            }
                            i22++;
                        }
                        if (zvd0Var2 == null) {
                            nzs.i(wu60.e(zvd0Var2.c, zvd0Var.c), this.$state.c);
                            return zy11.a;
                        }
                    }
                    return coroutineSingletons;
                }
            }
            zvd0Var = (zvd0) obj;
            nzs.i(0L, this.$state.c);
            fVar2 = fVar;
            if (zvd0Var2 == null) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutPagerKt$dragDirectionDetector$1$1(hwd0 hwd0Var, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$this_pointerInput = hwd0Var;
        this.$state = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyLayoutPagerKt$dragDirectionDetector$1$1(this.$this_pointerInput, this.$state, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyLayoutPagerKt$dragDirectionDetector$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            hwd0 hwd0Var = this.$this_pointerInput;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$state, null);
            this.label = 1;
            if (androidx.compose.foundation.gestures.c.l(hwd0Var, anonymousClass1, this) == coroutineSingletons) {
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
