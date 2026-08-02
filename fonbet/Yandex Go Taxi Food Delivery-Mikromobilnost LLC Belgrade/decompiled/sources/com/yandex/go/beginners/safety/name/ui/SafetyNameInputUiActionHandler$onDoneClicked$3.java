package com.yandex.go.beginners.safety.name.ui;

import com.yandex.go.beginners.safety.name.domain.model.SafetyNameInputScreenState$Type;
import defpackage.aye0;
import defpackage.epl0;
import defpackage.mvg;
import defpackage.mwl0;
import defpackage.nwl0;
import defpackage.ny61;
import defpackage.owl0;
import defpackage.oy7;
import defpackage.rvl0;
import defpackage.tse;
import defpackage.uvl0;
import defpackage.vvl0;
import defpackage.w511;
import defpackage.wls;
import defpackage.z0l0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.beginners.safety.name.ui.SafetyNameInputUiActionHandler$onDoneClicked$3", f = "SafetyNameInputUiActionHandler.kt", l = {85}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SafetyNameInputUiActionHandler$onDoneClicked$3 extends SuspendLambda implements wls {
    final /* synthetic */ rvl0 $navigator;
    final /* synthetic */ String $normalized;
    final /* synthetic */ vvl0 $screenStateRepository;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyNameInputUiActionHandler$onDoneClicked$3(a aVar, String str, rvl0 rvl0Var, vvl0 vvl0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$normalized = str;
        this.$navigator = rvl0Var;
        this.$screenStateRepository = vvl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyNameInputUiActionHandler$onDoneClicked$3(this.this$0, this.$normalized, this.$navigator, this.$screenStateRepository, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyNameInputUiActionHandler$onDoneClicked$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.beginners.safety.name.domain.a aVar = this.this$0.a;
            String str = this.$normalized;
            this.label = 1;
            obj = aVar.a(str, this);
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
        owl0 owl0Var = (owl0) obj;
        if (owl0Var instanceof nwl0) {
            epl0 epl0Var = this.this$0.b;
            epl0Var.getClass();
            epl0Var.a.a("SafeNewbies.NameInput.Success", new HashMap(), 1, new HashMap());
            ((oy7) ((aye0) this.$navigator).b).r(new z0l0(23));
        } else {
            if (!(owl0Var instanceof mwl0)) {
                w511.b();
                return null;
            }
            r0 r0Var = this.$screenStateRepository.a;
            do {
                value = r0Var.getValue();
            } while (!r0Var.k(value, uvl0.a((uvl0) value, SafetyNameInputScreenState$Type.NETWORK_ERROR_STATE)));
        }
        return zy11.a;
    }
}
