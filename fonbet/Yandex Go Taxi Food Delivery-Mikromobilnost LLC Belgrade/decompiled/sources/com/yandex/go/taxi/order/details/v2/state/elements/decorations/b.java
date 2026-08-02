package com.yandex.go.taxi.order.details.v2.state.elements.decorations;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.taxi.order.models.api.response.RideCardInfoResponse;
import defpackage.jgv;
import defpackage.mpk0;
import defpackage.ny61;
import defpackage.pkf;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class b {
    public final ru.yandex.taxi.widget.utils.e a;
    public final jgv b;

    public b(ru.yandex.taxi.widget.utils.e eVar, jgv jgvVar) {
        this.a = eVar;
        this.b = jgvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007d, code lost:
    
        if (r10 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r10 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        if (r10 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(RideCardInfoResponse.PresentationsDto.DecorationsDto decorationsDto, ContinuationImpl continuationImpl) {
        RideCardDecorationsMapper$mapDecorations$1 rideCardDecorationsMapper$mapDecorations$1;
        int i;
        String a;
        BitmapDrawable bitmapDrawable;
        if (continuationImpl instanceof RideCardDecorationsMapper$mapDecorations$1) {
            rideCardDecorationsMapper$mapDecorations$1 = (RideCardDecorationsMapper$mapDecorations$1) continuationImpl;
            int i2 = rideCardDecorationsMapper$mapDecorations$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardDecorationsMapper$mapDecorations$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardDecorationsMapper$mapDecorations$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardDecorationsMapper$mapDecorations$1.label;
                ru.yandex.taxi.widget.utils.e eVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    RideCardInfoResponse.PresentationsDto.DecorationsDto.TopDecoration topDecoration = decorationsDto.a;
                    a = this.b.a(topDecoration != null ? topDecoration.a : null);
                    if (a != null) {
                        rideCardDecorationsMapper$mapDecorations$1.L$0 = null;
                        rideCardDecorationsMapper$mapDecorations$1.L$1 = a;
                        rideCardDecorationsMapper$mapDecorations$1.label = 1;
                        obj = ru.yandex.taxi.widget.utils.e.o(eVar, a, null, rideCardDecorationsMapper$mapDecorations$1, 14);
                    }
                    return null;
                }
                if (i == 1) {
                    a = (String) rideCardDecorationsMapper$mapDecorations$1.L$1;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a = (String) rideCardDecorationsMapper$mapDecorations$1.L$1;
                    kotlin.b.b(obj);
                    bitmapDrawable = (BitmapDrawable) obj;
                }
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable == null) {
                    rideCardDecorationsMapper$mapDecorations$1.L$0 = null;
                    rideCardDecorationsMapper$mapDecorations$1.L$1 = a;
                    rideCardDecorationsMapper$mapDecorations$1.label = 2;
                    obj = ru.yandex.taxi.widget.utils.e.k(eVar, a, null, rideCardDecorationsMapper$mapDecorations$1, 14);
                }
                return new mpk0(pkf.g(bitmapDrawable, a, null));
            }
        }
        rideCardDecorationsMapper$mapDecorations$1 = new RideCardDecorationsMapper$mapDecorations$1(this, continuationImpl);
        Object obj2 = rideCardDecorationsMapper$mapDecorations$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardDecorationsMapper$mapDecorations$1.label;
        ru.yandex.taxi.widget.utils.e eVar2 = this.a;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable == null) {
        }
        return new mpk0(pkf.g(bitmapDrawable, a, null));
    }
}
