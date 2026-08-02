package com.ybsdk.feature.pin.internal.screens.checkpin;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import defpackage.dhb;
import defpackage.em3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.phb;
import defpackage.pz40;
import defpackage.tis0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinViewModel$onCreateView$1", f = "CheckPinViewModel.kt", l = {128}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CheckPinViewModel$onCreateView$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckPinViewModel$onCreateView$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckPinViewModel$onCreateView$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckPinViewModel$onCreateView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            this.label = 1;
            b = bVar.B.getCheckType().isEnterOrValidateOnReturn$feature_pin_release() ? bVar.E.b(this) : Boolean.FALSE;
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = obj;
        }
        Boolean bool = (Boolean) b;
        boolean booleanValue = bool.booleanValue();
        pz40 Y = this.this$0.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, phb.a((phb) value, booleanValue, false, null, null, null, null, null, null, false, null, 4094)));
        if (booleanValue) {
            this.this$0.z0();
        }
        tis0 tis0Var = this.this$0.R;
        AppAnalyticsReporter appAnalyticsReporter = (AppAnalyticsReporter) tis0Var.w;
        CheckType checkType = (CheckType) tis0Var.c;
        int i2 = dhb.a[checkType.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            em3 em3Var = appAnalyticsReporter.S;
            String name = checkType.name();
            Boolean valueOf = Boolean.valueOf(tis0Var.b);
            LinkedHashMap linkedHashMap = new LinkedHashMap(3);
            linkedHashMap.put("isBiometryEnabled", bool);
            if (name != null) {
                linkedHashMap.put("check_type", name);
            }
            linkedHashMap.put("drop_screens_on_return", valueOf);
            em3Var.a.a("enter_pin.show", linkedHashMap);
        } else if (i2 == 4) {
            appAnalyticsReporter.S.a.a("enable_biometry.start", null);
            appAnalyticsReporter.S.a.a("enable_biometry.show_enter_code", null);
        } else {
            if (i2 != 5) {
                w511.b();
                return null;
            }
            appAnalyticsReporter.S.a.a("change_pin.start", null);
            appAnalyticsReporter.S.a.a("change_pin.show_enter_code", null);
        }
        return zy11.a;
    }
}
