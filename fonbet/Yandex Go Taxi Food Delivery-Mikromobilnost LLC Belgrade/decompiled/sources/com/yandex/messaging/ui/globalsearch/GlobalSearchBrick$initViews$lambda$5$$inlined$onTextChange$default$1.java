package com.yandex.messaging.ui.globalsearch;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import defpackage.kjt;
import defpackage.mvg;
import defpackage.nka1;
import defpackage.pj91;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010¸\u0006\u0000"}, d2 = {"com/yandex/dsl/views/TextViewKt$onTextChange$1", "Landroid/text/TextWatcher;", "", "s", "", "start", "before", "count", "Lzy11;", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "after", "beforeTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "core-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GlobalSearchBrick$initViews$lambda$5$$inlined$onTextChange$default$1 implements TextWatcher {
    final /* synthetic */ TextView $this_onTextChange;
    final /* synthetic */ boolean $useCoroutine;
    final /* synthetic */ kjt this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V", "com/yandex/dsl/views/TextViewKt$onTextChange$1$onTextChanged$1"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.ui.globalsearch.GlobalSearchBrick$initViews$lambda$5$$inlined$onTextChange$default$1$1", f = "GlobalSearchBrick.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.ui.globalsearch.GlobalSearchBrick$initViews$lambda$5$$inlined$onTextChange$default$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ CharSequence $s;
        int label;
        final /* synthetic */ kjt this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CharSequence charSequence, Continuation continuation) {
            super(2, continuation);
            this.$s = charSequence;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$s, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            this.$s.toString();
            int i = kjt.a;
            throw null;
        }
    }

    public GlobalSearchBrick$initViews$lambda$5$$inlined$onTextChange$default$1(boolean z, TextView textView, kjt kjtVar) {
        this.$useCoroutine = z;
        this.$this_onTextChange = textView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (this.$useCoroutine) {
            tje.N(nka1.c(pj91.f(this.$this_onTextChange)), null, null, new AnonymousClass1(s, null), 3);
        } else {
            s.toString();
            int i = kjt.a;
            throw null;
        }
    }
}
