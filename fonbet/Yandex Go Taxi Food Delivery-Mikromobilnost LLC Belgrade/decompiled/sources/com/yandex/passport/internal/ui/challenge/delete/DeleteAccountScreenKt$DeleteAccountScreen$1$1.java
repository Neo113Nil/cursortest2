package com.yandex.passport.internal.ui.challenge.delete;

import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.api.ProgressAnimation;
import com.yandex.passport.api.ProgressBackground;
import com.yandex.passport.api.ProgressSize;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.properties.VisualProperties;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.w511;
import defpackage.wls;
import defpackage.yd00;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/passport/internal/ui/challenge/delete/s;", "effect", "Lzy11;", "<anonymous>", "(Lcom/yandex/passport/internal/ui/challenge/delete/s;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.challenge.delete.DeleteAccountScreenKt$DeleteAccountScreen$1$1", f = "DeleteAccountScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DeleteAccountScreenKt$DeleteAccountScreen$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ b $component;
    final /* synthetic */ yd00 $reloginLauncher;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteAccountScreenKt$DeleteAccountScreen$1$1(yd00 yd00Var, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$reloginLauncher = yd00Var;
        this.$component = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeleteAccountScreenKt$DeleteAccountScreen$1$1 deleteAccountScreenKt$DeleteAccountScreen$1$1 = new DeleteAccountScreenKt$DeleteAccountScreen$1$1(this.$reloginLauncher, this.$component, continuation);
        deleteAccountScreenKt$DeleteAccountScreen$1$1.L$0 = obj;
        return deleteAccountScreenKt$DeleteAccountScreen$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeleteAccountScreenKt$DeleteAccountScreen$1$1 deleteAccountScreenKt$DeleteAccountScreen$1$1 = (DeleteAccountScreenKt$DeleteAccountScreen$1$1) create((s) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deleteAccountScreenKt$DeleteAccountScreen$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProgressAnimation lottie;
        ProgressSize progressSize;
        ProgressBackground custom;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        s sVar = (s) this.L$0;
        if (sVar == null) {
            w511.b();
            return null;
        }
        yd00 yd00Var = this.$reloginLauncher;
        Uid uid = sVar.a;
        boolean z = sVar.b;
        com.yandex.passport.common.ui.progress.g gVar = this.$component.getProperties().b;
        LoginProperties.a aVar = new LoginProperties.a();
        Filter.a aVar2 = new Filter.a();
        aVar2.a = com.yandex.passport.internal.util.p.x(uid.getEnvironment());
        if (z) {
            aVar2.c(PassportAccountType.PHONISH);
        }
        aVar.b = aVar2.a();
        VisualProperties.a aVar3 = new VisualProperties.a();
        ProgressPropertiesImpl.a aVar4 = new ProgressPropertiesImpl.a();
        com.yandex.passport.common.ui.progress.c cVar = gVar.a;
        if (cVar instanceof com.yandex.passport.common.ui.progress.a) {
            lottie = new ProgressAnimation.Default(((com.yandex.passport.common.ui.progress.a) cVar).a);
        } else {
            if (!(cVar instanceof com.yandex.passport.common.ui.progress.b)) {
                w511.b();
                return null;
            }
            lottie = new ProgressAnimation.Lottie(((com.yandex.passport.common.ui.progress.b) cVar).a);
        }
        aVar4.a = lottie;
        com.yandex.passport.common.ui.progress.u uVar = gVar.b;
        if (uVar instanceof com.yandex.passport.common.ui.progress.r) {
            progressSize = ProgressSize.Default.INSTANCE;
        } else if (uVar instanceof com.yandex.passport.common.ui.progress.q) {
            com.yandex.passport.common.ui.progress.q qVar = (com.yandex.passport.common.ui.progress.q) uVar;
            progressSize = new ProgressSize.Custom(qVar.a, qVar.b);
        } else if (uVar instanceof com.yandex.passport.common.ui.progress.s) {
            progressSize = ProgressSize.FullSize.INSTANCE;
        } else {
            if (!(uVar instanceof com.yandex.passport.common.ui.progress.t)) {
                w511.b();
                return null;
            }
            progressSize = ProgressSize.WrapContent.INSTANCE;
        }
        aVar4.b = progressSize;
        com.yandex.passport.common.ui.progress.f fVar = gVar.c;
        if (fVar instanceof com.yandex.passport.common.ui.progress.e) {
            custom = ProgressBackground.Default.INSTANCE;
        } else {
            if (!(fVar instanceof com.yandex.passport.common.ui.progress.d)) {
                w511.b();
                return null;
            }
            custom = new ProgressBackground.Custom(((com.yandex.passport.common.ui.progress.d) fVar).a);
        }
        aVar4.c = custom;
        aVar4.w = gVar.d;
        ProgressPropertiesImpl.Companion.getClass();
        aVar3.G = com.yandex.passport.internal.properties.m.b(aVar4);
        VisualProperties.Companion.getClass();
        aVar.H = com.yandex.passport.internal.properties.b0.a(aVar3);
        aVar.A = com.yandex.passport.internal.util.p.A(uid);
        LoginProperties.Companion.getClass();
        yd00Var.a(com.yandex.passport.internal.a0.b0(com.yandex.passport.internal.properties.i.b(aVar)));
        return zy11.a;
    }
}
