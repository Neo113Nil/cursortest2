package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.z;
import androidx.compose.foundation.text.selection.j;
import defpackage.hwd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.yly0;
import defpackage.zqe;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1", f = "CoreTextField.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class CoreTextFieldKt$TextFieldCursorHandle$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ j $manager;
    final /* synthetic */ yly0 $observer;
    final /* synthetic */ hwd0 $this_pointerInput;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1", f = "CoreTextField.kt", l = {1074}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ yly0 $observer;
        final /* synthetic */ hwd0 $this_pointerInput;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(hwd0 hwd0Var, yly0 yly0Var, Continuation continuation) {
            super(2, continuation);
            this.$this_pointerInput = hwd0Var;
            this.$observer = yly0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$this_pointerInput, this.$observer, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                hwd0 hwd0Var = this.$this_pointerInput;
                yly0 yly0Var = this.$observer;
                this.label = 1;
                if (c.e(hwd0Var, yly0Var, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2", f = "CoreTextField.kt", l = {1077}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$2$1$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ j $manager;
        final /* synthetic */ hwd0 $this_pointerInput;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(hwd0 hwd0Var, j jVar, Continuation continuation) {
            super(2, continuation);
            this.$this_pointerInput = hwd0Var;
            this.$manager = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.$this_pointerInput, this.$manager, continuation);
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
                hwd0 hwd0Var = this.$this_pointerInput;
                zqe zqeVar = new zqe(this.$manager, 1);
                this.label = 1;
                if (z.f(hwd0Var, null, null, zqeVar, this, 7) == coroutineSingletons) {
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
    public CoreTextFieldKt$TextFieldCursorHandle$2$1$1(hwd0 hwd0Var, yly0 yly0Var, j jVar, Continuation continuation) {
        super(2, continuation);
        this.$this_pointerInput = hwd0Var;
        this.$observer = yly0Var;
        this.$manager = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CoreTextFieldKt$TextFieldCursorHandle$2$1$1 coreTextFieldKt$TextFieldCursorHandle$2$1$1 = new CoreTextFieldKt$TextFieldCursorHandle$2$1$1(this.$this_pointerInput, this.$observer, this.$manager, continuation);
        coreTextFieldKt$TextFieldCursorHandle$2$1$1.L$0 = obj;
        return coreTextFieldKt$TextFieldCursorHandle$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CoreTextFieldKt$TextFieldCursorHandle$2$1$1 coreTextFieldKt$TextFieldCursorHandle$2$1$1 = (CoreTextFieldKt$TextFieldCursorHandle$2$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        coreTextFieldKt$TextFieldCursorHandle$2$1$1.invokeSuspend(zy11Var);
        return zy11Var;
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
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        tje.N(tseVar, null, coroutineStart, new AnonymousClass1(this.$this_pointerInput, this.$observer, null), 1);
        tje.N(tseVar, null, coroutineStart, new AnonymousClass2(this.$this_pointerInput, this.$manager, null), 1);
        return zy11.a;
    }
}
