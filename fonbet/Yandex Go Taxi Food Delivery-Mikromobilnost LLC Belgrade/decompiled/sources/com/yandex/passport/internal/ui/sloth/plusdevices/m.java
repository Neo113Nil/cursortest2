package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.common.properties.CommonWebProperties;
import com.yandex.passport.data.exceptions.DeviceValidationException;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.ManagingPlusDevicesPropertiesImpl;
import com.yandex.passport.internal.usecase.p1;
import com.yandex.passport.sloth.data.SlothParams;
import defpackage.bvf0;
import defpackage.ds31;
import defpackage.ny61;
import defpackage.tje;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class m extends yr31 {
    public final PassportProcessGlobalComponent b;
    public final p1 c;
    public final com.yandex.passport.internal.usecase.k0 w;
    public final r0 x;

    public m() {
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        this.b = a;
        this.c = a.getTryAddPlusDeviceUseCase();
        this.w = a.getGetLocationIdUseCase();
        this.x = bvf0.c(g.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
    
        if (r1 == r3) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object W(m mVar, ManagingPlusDevicesPropertiesImpl managingPlusDevicesPropertiesImpl, ContinuationImpl continuationImpl) {
        ManagingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1 managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1;
        int i;
        ManagingPlusDevicesPropertiesImpl managingPlusDevicesPropertiesImpl2;
        Object value;
        m mVar2;
        Object obj;
        Throwable a;
        m mVar3 = mVar;
        mVar3.getClass();
        if (continuationImpl instanceof ManagingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1) {
            managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1 = (ManagingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1) continuationImpl;
            int i2 = managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.passport.internal.usecase.k0 k0Var = mVar3.w;
                    Uid B = com.yandex.passport.internal.util.p.B(managingPlusDevicesPropertiesImpl.getUid());
                    managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1.L$0 = mVar3;
                    managingPlusDevicesPropertiesImpl2 = managingPlusDevicesPropertiesImpl;
                    managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1.L$1 = managingPlusDevicesPropertiesImpl2;
                    managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1.label = 1;
                    obj2 = k0Var.a(B, managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                kotlin.b.b(obj2);
                                return zy11Var;
                            }
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1.L$1;
                        mVar2 = (m) managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1.L$0;
                        kotlin.b.b(obj2);
                        value = obj;
                        mVar3 = mVar2;
                        a = Result.a(value);
                        if (a != null) {
                            r0 r0Var = mVar3.x;
                            f fVar = new f(a instanceof DeviceValidationException ? 1111 : ((a instanceof InvalidTokenException) || (a instanceof PassportAccountNotFoundException)) ? 401 : 1112);
                            managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1.L$0 = value;
                            managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1.L$1 = null;
                            managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1.label = 3;
                            r0Var.emit(fVar, managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1);
                            if (zy11Var == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11Var;
                    }
                    ManagingPlusDevicesPropertiesImpl managingPlusDevicesPropertiesImpl3 = (ManagingPlusDevicesPropertiesImpl) managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1.L$1;
                    m mVar4 = (m) managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1.L$0;
                    kotlin.b.b(obj2);
                    managingPlusDevicesPropertiesImpl2 = managingPlusDevicesPropertiesImpl3;
                    mVar3 = mVar4;
                }
                value = ((Result) obj2).getValue();
                if (!(value instanceof Result.Failure)) {
                    SlothParams slothParams = new SlothParams(new com.yandex.passport.sloth.data.q(com.yandex.passport.internal.util.p.B(managingPlusDevicesPropertiesImpl2.getUid()), ((Number) value).longValue(), com.yandex.passport.internal.properties.u.W(managingPlusDevicesPropertiesImpl2.getTheme()), managingPlusDevicesPropertiesImpl2.getService(), managingPlusDevicesPropertiesImpl2.getBrand()), com.yandex.passport.internal.util.p.B(managingPlusDevicesPropertiesImpl2.getUid()).getEnvironment(), null, new CommonWebProperties(false, null, false, false, 15, null), 4, null);
                    r0 r0Var2 = mVar3.x;
                    h hVar = new h(slothParams);
                    managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1.L$0 = mVar3;
                    managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1.L$1 = value;
                    managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1.label = 2;
                    r0Var2.emit(hVar, managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1);
                    if (zy11Var != coroutineSingletons) {
                        mVar2 = mVar3;
                        obj = value;
                        value = obj;
                        mVar3 = mVar2;
                    }
                    return coroutineSingletons;
                }
                a = Result.a(value);
                if (a != null) {
                }
                return zy11Var;
            }
        }
        managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1 = new ManagingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1(mVar3, continuationImpl);
        Object obj22 = managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = managingPlusDevicesHelperViewModel$showManagingPlusDevicesOrError$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        value = ((Result) obj22).getValue();
        if (!(value instanceof Result.Failure)) {
        }
        a = Result.a(value);
        if (a != null) {
        }
        return zy11Var2;
    }

    public final void X(l lVar) {
        tje.N(ds31.a(this), null, null, new ManagingPlusDevicesHelperViewModel$wishMapper$1(lVar, this, null), 3);
    }
}
