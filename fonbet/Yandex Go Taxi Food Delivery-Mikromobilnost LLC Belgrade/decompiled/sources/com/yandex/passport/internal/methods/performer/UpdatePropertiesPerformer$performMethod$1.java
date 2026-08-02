package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.PassportLatLng;
import com.yandex.passport.api.PassportLocation;
import com.yandex.passport.internal.methods.v2;
import com.yandex.passport.internal.network.UrlOverride;
import com.yandex.passport.internal.properties.UpdateableProperties;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.UpdatePropertiesPerformer$performMethod$1", f = "UpdatePropertiesPerformer.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class UpdatePropertiesPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ v2 $method;
    int label;
    final /* synthetic */ m1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdatePropertiesPerformer$performMethod$1(m1 m1Var, v2 v2Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = m1Var;
        this.$method = v2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpdatePropertiesPerformer$performMethod$1(this.this$0, this.$method, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdatePropertiesPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.passport.internal.properties.q qVar = this.this$0.a;
            UpdateableProperties updateableProperties = (UpdateableProperties) this.$method.b.c;
            kotlinx.coroutines.flow.r0 r0Var = qVar.e;
            UrlOverride urlOverride = updateableProperties.getUrlOverride();
            if (urlOverride != null) {
                kotlinx.coroutines.flow.r0 r0Var2 = qVar.a;
                r0Var2.getClass();
                r0Var2.m(null, urlOverride);
            }
            Map<PassportLocation, UrlOverride> locationsUrlOverride = updateableProperties.getLocationsUrlOverride();
            if (locationsUrlOverride != null) {
                kotlinx.coroutines.flow.r0 r0Var3 = qVar.c;
                r0Var3.getClass();
                r0Var3.m(null, locationsUrlOverride);
            }
            List<PassportLatLng> productLocation = updateableProperties.getProductLocation();
            if (productLocation == null) {
                productLocation = ((com.yandex.passport.internal.properties.c0) r0Var.getValue()).a;
            }
            List<PassportLatLng> deviceGeoLocation = updateableProperties.getDeviceGeoLocation();
            if (deviceGeoLocation == null) {
                deviceGeoLocation = ((com.yandex.passport.internal.properties.c0) r0Var.getValue()).b;
            }
            Map<String, String[]> vpnBlockerAdditionalParams = updateableProperties.getVpnBlockerAdditionalParams();
            if (vpnBlockerAdditionalParams == null) {
                vpnBlockerAdditionalParams = ((com.yandex.passport.internal.properties.c0) r0Var.getValue()).c;
            }
            com.yandex.passport.internal.properties.c0 c0Var = new com.yandex.passport.internal.properties.c0(productLocation, deviceGeoLocation, vpnBlockerAdditionalParams);
            r0Var.getClass();
            r0Var.m(null, c0Var);
            com.yandex.passport.internal.usecase.u0 u0Var = this.this$0.b;
            UpdateableProperties updateableProperties2 = (UpdateableProperties) this.$method.b.c;
            this.label = 1;
            if (u0Var.a(updateableProperties2, this) == coroutineSingletons) {
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
