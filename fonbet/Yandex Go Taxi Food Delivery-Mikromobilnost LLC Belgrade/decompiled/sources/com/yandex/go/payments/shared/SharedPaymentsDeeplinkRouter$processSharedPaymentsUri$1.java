package com.yandex.go.payments.shared;

import android.net.Uri;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.yandex.go.payments.shared.family.experiments.FamilyGroupV2Experiment;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.jl40;
import defpackage.kap;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.yor0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.SharedPaymentsDeeplinkRouter$processSharedPaymentsUri$1", f = "SharedPaymentsDeeplinkRouter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 67}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharedPaymentsDeeplinkRouter$processSharedPaymentsUri$1 extends SuspendLambda implements tls {
    final /* synthetic */ yor0 $callback;
    final /* synthetic */ DeeplinkSource $deeplinkSource;
    final /* synthetic */ boolean $experimentExist;
    final /* synthetic */ String $typeId;
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPaymentsDeeplinkRouter$processSharedPaymentsUri$1(boolean z, String str, z zVar, Uri uri, DeeplinkSource deeplinkSource, yor0 yor0Var, Continuation continuation) {
        super(1, continuation);
        this.$experimentExist = z;
        this.$typeId = str;
        this.this$0 = zVar;
        this.$uri = uri;
        this.$deeplinkSource = deeplinkSource;
        this.$callback = yor0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SharedPaymentsDeeplinkRouter$processSharedPaymentsUri$1(this.$experimentExist, this.$typeId, this.this$0, this.$uri, this.$deeplinkSource, this.$callback, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SharedPaymentsDeeplinkRouter$processSharedPaymentsUri$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0041, code lost:
    
        if (r7 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!this.$experimentExist && jl40.l(this.$typeId, SharedAccountType.FAMILY.getTypeId())) {
                SharedPaymentsDeeplinkRouter$processSharedPaymentsUri$1$waited$1 sharedPaymentsDeeplinkRouter$processSharedPaymentsUri$1$waited$1 = new SharedPaymentsDeeplinkRouter$processSharedPaymentsUri$1$waited$1(this.this$0, null);
                this.label = 1;
                obj = kotlinx.coroutines.a.w(DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, sharedPaymentsDeeplinkRouter$processSharedPaymentsUri$1$waited$1, this);
            }
            z zVar = this.this$0;
            String str = this.$typeId;
            Uri uri = this.$uri;
            yor0 yor0Var = this.$callback;
            this.label = 2;
            return z.a(zVar, str, uri, yor0Var, this) != coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        FamilyGroupV2Experiment familyGroupV2Experiment = (FamilyGroupV2Experiment) obj;
        if (familyGroupV2Experiment != null) {
            if (familyGroupV2Experiment.b) {
                z zVar2 = this.this$0;
                Uri uri2 = this.$uri;
                String str2 = familyGroupV2Experiment.e;
                DeeplinkSource deeplinkSource = this.$deeplinkSource;
                yor0 yor0Var2 = this.$callback;
                kap kapVar = zVar2.d;
                String uri3 = uri2.toString();
                boolean isInternal = deeplinkSource.getIsInternal();
                kapVar.getClass();
                yor0Var2.d(kap.a(str2, uri3, isInternal));
                return zy11Var;
            }
            z zVar3 = this.this$0;
            String str3 = this.$typeId;
            Uri uri4 = this.$uri;
            yor0 yor0Var3 = this.$callback;
            this.label = 2;
            if (z.a(zVar3, str3, uri4, yor0Var3, this) != coroutineSingletons) {
            }
        }
    }
}
