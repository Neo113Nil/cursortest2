package com.yandex.go.inapp_calls.repository.defaultoutgoingcall;

import com.yandex.go.inapp_calls.api.defaultoutgoingcall.DefaultOutgoingCallType;
import defpackage.b8h;
import defpackage.c8h;
import defpackage.k4o;
import defpackage.kw;
import defpackage.ny61;
import defpackage.t2r0;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ kw b;
    public final /* synthetic */ g c;

    public e(vpr vprVar, kw kwVar, g gVar) {
        this.a = vprVar;
        this.b = kwVar;
        this.c = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SetDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$2$1 setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$2$1;
        int i;
        String str;
        if (continuation instanceof SetDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$2$1) {
            setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$2$1 = (SetDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$2$1) continuation;
            int i2 = setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    DefaultOutgoingCallType defaultOutgoingCallType = (DefaultOutgoingCallType) obj;
                    kw kwVar = this.b;
                    String str2 = kwVar.a;
                    k4o<DefaultOutgoingCallType> a = DefaultOutgoingCallType.a();
                    ArrayList arrayList = new ArrayList(tcc.n(a, 10));
                    for (DefaultOutgoingCallType defaultOutgoingCallType2 : a) {
                        this.c.getClass();
                        int i3 = t2r0.a[defaultOutgoingCallType2.ordinal()];
                        if (i3 == 1) {
                            str = kwVar.c;
                        } else if (i3 == 2) {
                            str = kwVar.b;
                        } else {
                            if (i3 != 3) {
                                w511.b();
                                return null;
                            }
                            str = kwVar.d;
                        }
                        arrayList.add(new c8h(defaultOutgoingCallType2, str, defaultOutgoingCallType2 == defaultOutgoingCallType));
                    }
                    b8h b8hVar = new b8h(str2, arrayList);
                    setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$2$1.L$0 = null;
                    setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$2$1.L$1 = null;
                    setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$2$1.L$2 = null;
                    setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$2$1.L$3 = null;
                    setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(b8hVar, setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$2$1 = new SetDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$2$1(this, continuation);
        Object obj22 = setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = setDefaultOutgoingCallTypeInteractor$getDefaultCallTypeUiStateFlowInner$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
