package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.data.exceptions.DeviceValidationException;
import com.yandex.passport.internal.properties.ManagingPlusDevicesPropertiesImpl;
import com.yandex.passport.internal.usecase.o1;
import com.yandex.passport.internal.usecase.p1;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.plusdevices.ManagingPlusDevicesHelperViewModel$tryAddPlusDevice$1", f = "ManagingPlusDevicesHelperViewModel.kt", l = {42, 43, 52, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 61}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ManagingPlusDevicesHelperViewModel$tryAddPlusDevice$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isFirstRequest;
    final /* synthetic */ ManagingPlusDevicesPropertiesImpl $properties;
    Object L$0;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagingPlusDevicesHelperViewModel$tryAddPlusDevice$1(m mVar, ManagingPlusDevicesPropertiesImpl managingPlusDevicesPropertiesImpl, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$properties = managingPlusDevicesPropertiesImpl;
        this.$isFirstRequest = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ManagingPlusDevicesHelperViewModel$tryAddPlusDevice$1(this.this$0, this.$properties, this.$isFirstRequest, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ManagingPlusDevicesHelperViewModel$tryAddPlusDevice$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (r3 == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009b, code lost:
    
        if (com.yandex.passport.internal.ui.sloth.plusdevices.m.W(r9, r5, r8) == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ad, code lost:
    
        if (r3 == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        if (r9 == r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0034, code lost:
    
        if (r3 == r0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Throwable a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1112;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                kotlin.b.b(obj);
                r0 r0Var = this.this$0.x;
                g gVar = g.b;
                this.label = 1;
                r0Var.emit(gVar, this);
                break;
            case 1:
                kotlin.b.b(obj);
                p1 p1Var = this.this$0.c;
                o1 o1Var = new o1(com.yandex.passport.internal.util.p.B(this.$properties.getUid()), this.$properties.getService(), this.$properties.getBrand(), "managing_plus_devices");
                this.label = 2;
                obj = p1Var.a(o1Var, this);
                break;
            case 2:
                kotlin.b.b(obj);
                value = ((Result) obj).getValue();
                m mVar = this.this$0;
                boolean z = this.$isFirstRequest;
                ManagingPlusDevicesPropertiesImpl managingPlusDevicesPropertiesImpl = this.$properties;
                if (!(value instanceof Result.Failure)) {
                    if (!((Boolean) value).booleanValue()) {
                        if (!z) {
                            r0 r0Var2 = mVar.x;
                            f fVar = new f(1112);
                            this.L$0 = value;
                            this.label = 5;
                            r0Var2.emit(fVar, this);
                            break;
                        } else {
                            this.L$0 = value;
                            this.label = 4;
                            break;
                        }
                    } else {
                        r0 r0Var3 = mVar.x;
                        f fVar2 = new f(-1);
                        this.L$0 = value;
                        this.label = 3;
                        r0Var3.emit(fVar2, this);
                        break;
                    }
                }
                m mVar2 = this.this$0;
                a = Result.a(value);
                if (a != null) {
                    r0 r0Var4 = mVar2.x;
                    if (a instanceof DeviceValidationException) {
                        i2 = 1111;
                    } else if ((a instanceof InvalidTokenException) || (a instanceof PassportAccountNotFoundException)) {
                        i2 = 401;
                    }
                    f fVar3 = new f(i2);
                    this.L$0 = value;
                    this.label = 6;
                    r0Var4.emit(fVar3, this);
                    if (zy11Var == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            case 3:
            case 4:
            case 5:
                value = this.L$0;
                kotlin.b.b(obj);
                m mVar22 = this.this$0;
                a = Result.a(value);
                if (a != null) {
                }
                return zy11Var;
            case 6:
                kotlin.b.b(obj);
                return zy11Var;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
