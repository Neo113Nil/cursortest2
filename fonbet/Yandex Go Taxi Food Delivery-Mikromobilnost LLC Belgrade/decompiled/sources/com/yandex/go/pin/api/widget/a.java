package com.yandex.go.pin.api.widget;

import android.content.Context;
import com.yandex.go.pin.api.v1.PinV1Component;
import com.yandex.go.pin.api.v2.PinV2Component;
import defpackage.ewb0;
import defpackage.fwb0;
import defpackage.h1c0;
import defpackage.ny61;
import defpackage.w0c0;
import defpackage.w511;
import defpackage.yvb0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final Context a;
    public final w0c0 b;
    public final yvb0 c;
    public final ru.yandex.taxi.design.utils.b d;

    public a(Context context, w0c0 w0c0Var, yvb0 yvb0Var, ru.yandex.taxi.design.utils.b bVar) {
        this.a = context;
        this.b = w0c0Var;
        this.c = yvb0Var;
        this.d = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0040, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PinHolderFactory$create$1 pinHolderFactory$create$1;
        int i;
        int i2;
        if (continuationImpl instanceof PinHolderFactory$create$1) {
            pinHolderFactory$create$1 = (PinHolderFactory$create$1) continuationImpl;
            int i3 = pinHolderFactory$create$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pinHolderFactory$create$1.label = i3 - Integer.MIN_VALUE;
                Object obj = pinHolderFactory$create$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinHolderFactory$create$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinHolderFactory$create$1.label = 1;
                    obj = this.b.a(pinHolderFactory$create$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return new ewb0(null, (PinV2Component) obj);
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                i2 = fwb0.a[((PinTypeRepository$PinType) obj).ordinal()];
                if (i2 != 1) {
                    return new ewb0(new PinV1Component(this.a, this.c), null);
                }
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                pinHolderFactory$create$1.label = 2;
                obj = b(pinHolderFactory$create$1);
            }
        }
        pinHolderFactory$create$1 = new PinHolderFactory$create$1(this, continuationImpl);
        Object obj3 = pinHolderFactory$create$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinHolderFactory$create$1.label;
        if (i != 0) {
        }
        i2 = fwb0.a[((PinTypeRepository$PinType) obj3).ordinal()];
        if (i2 != 1) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PinHolderFactory$createPinV2$1 pinHolderFactory$createPinV2$1;
        int i;
        Context context;
        if (continuationImpl instanceof PinHolderFactory$createPinV2$1) {
            pinHolderFactory$createPinV2$1 = (PinHolderFactory$createPinV2$1) continuationImpl;
            int i2 = pinHolderFactory$createPinV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinHolderFactory$createPinV2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinHolderFactory$createPinV2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinHolderFactory$createPinV2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Context context2 = this.a;
                    pinHolderFactory$createPinV2$1.L$0 = context2;
                    pinHolderFactory$createPinV2$1.label = 1;
                    Object c = this.d.c(pinHolderFactory$createPinV2$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = c;
                    context = context2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = (Context) pinHolderFactory$createPinV2$1.L$0;
                    kotlin.b.b(obj);
                }
                return new PinV2Component(context, (h1c0) obj);
            }
        }
        pinHolderFactory$createPinV2$1 = new PinHolderFactory$createPinV2$1(this, continuationImpl);
        Object obj2 = pinHolderFactory$createPinV2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinHolderFactory$createPinV2$1.label;
        if (i != 0) {
        }
        return new PinV2Component(context, (h1c0) obj2);
    }
}
