package com.yandex.go.pin.repository;

import com.yandex.go.pin.api.widget.PinTypeRepository$PinType;
import defpackage.e1c0;
import defpackage.f1c0;
import defpackage.ny61;
import defpackage.w0c0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a implements w0c0 {
    public final f1c0 a;

    public a(f1c0 f1c0Var) {
        this.a = f1c0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.w0c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        DefaultPinTypeRepository$selectPinType$1 defaultPinTypeRepository$selectPinType$1;
        int i;
        if (continuationImpl instanceof DefaultPinTypeRepository$selectPinType$1) {
            defaultPinTypeRepository$selectPinType$1 = (DefaultPinTypeRepository$selectPinType$1) continuationImpl;
            int i2 = defaultPinTypeRepository$selectPinType$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                defaultPinTypeRepository$selectPinType$1.label = i2 - Integer.MIN_VALUE;
                Object obj = defaultPinTypeRepository$selectPinType$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultPinTypeRepository$selectPinType$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    defaultPinTypeRepository$selectPinType$1.label = 1;
                    obj = this.a.a(defaultPinTypeRepository$selectPinType$1);
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
                return !((e1c0) obj).b ? PinTypeRepository$PinType.V2 : PinTypeRepository$PinType.V1;
            }
        }
        defaultPinTypeRepository$selectPinType$1 = new DefaultPinTypeRepository$selectPinType$1(this, continuationImpl);
        Object obj2 = defaultPinTypeRepository$selectPinType$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultPinTypeRepository$selectPinType$1.label;
        if (i != 0) {
        }
        if (!((e1c0) obj2).b) {
        }
    }
}
