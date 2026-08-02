package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutBottomsheetViewModel$start$1", f = "LogoutBottomsheetViewModel.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LogoutBottomsheetViewModel$start$1 extends SuspendLambda implements wls {
    final /* synthetic */ PassportLogoutPropertiesImpl $properties;
    int label;
    final /* synthetic */ x0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutBottomsheetViewModel$start$1(x0 x0Var, PassportLogoutPropertiesImpl passportLogoutPropertiesImpl, Continuation continuation) {
        super(2, continuation);
        this.this$0 = x0Var;
        this.$properties = passportLogoutPropertiesImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LogoutBottomsheetViewModel$start$1(this.this$0, this.$properties, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LogoutBottomsheetViewModel$start$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (com.yandex.passport.internal.ui.challenge.logout.bottomsheet.x0.W(r6, r1, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if (r6 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            LogoutBottomsheetViewModel$start$1$currentState$1 logoutBottomsheetViewModel$start$1$currentState$1 = new LogoutBottomsheetViewModel$start$1$currentState$1(this.this$0, null);
            this.label = 1;
            obj = kotlinx.coroutines.a.w(20L, logoutBottomsheetViewModel$start$1$currentState$1, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (((v0) obj) == null) {
            x0 x0Var = this.this$0;
            PassportLogoutPropertiesImpl passportLogoutPropertiesImpl = this.$properties;
            this.label = 2;
        }
        return zy11.a;
    }
}
