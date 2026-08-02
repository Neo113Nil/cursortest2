package com.yandex.go.suggest.impl.view;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import defpackage.cls;
import defpackage.fls;
import defpackage.g16;
import defpackage.kdc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pav;
import defpackage.s8o;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.AddressInputComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView$renderNormalInputField$1$1", f = "FullscreenSuperappSuggestModalView.kt", l = {445}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class FullscreenSuperappSuggestModalView$renderNormalInputField$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ AddressInputComponent $this_apply;
    final /* synthetic */ fls $uiState;
    int label;
    final /* synthetic */ FullscreenSuperappSuggestModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullscreenSuperappSuggestModalView$renderNormalInputField$1$1(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView, fls flsVar, AddressInputComponent addressInputComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fullscreenSuperappSuggestModalView;
        this.$uiState = flsVar;
        this.$this_apply = addressInputComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FullscreenSuperappSuggestModalView$renderNormalInputField$1$1(this.this$0, this.$uiState, this.$this_apply, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FullscreenSuperappSuggestModalView$renderNormalInputField$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pav pavVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pavVar = this.this$0.imageLoader;
            g16 b = pavVar.b().b(((cls) this.$uiState.f).a.a);
            this.label = 1;
            obj = ru.yandex.taxi.utils.a.b(b, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Bitmap bitmap = (Bitmap) obj;
        zy11 zy11Var = zy11.a;
        if (bitmap != null) {
            this.$this_apply.setLeadImage(bitmap);
            kdc kdcVar = ((cls) this.$uiState.f).a.c;
            if (kdcVar != null) {
                this.$this_apply.setLeadImageTint(s8o.m(kdcVar, this.$this_apply.getContext()));
            }
            kdc kdcVar2 = ((cls) this.$uiState.f).a.b;
            if (kdcVar2 != null) {
                this.$this_apply.setLeadBackground(new ColorDrawable(s8o.m(kdcVar2, this.$this_apply.getContext())));
            }
        }
        return zy11Var;
    }
}
