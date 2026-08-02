package androidx.compose.material3;

import androidx.compose.foundation.gestures.Orientation;
import defpackage.gn50;
import defpackage.k631;
import defpackage.ma91;
import defpackage.ny61;
import defpackage.snr;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class v implements gn50 {
    public final /* synthetic */ w a;
    public final /* synthetic */ snr b;
    public final /* synthetic */ Orientation c;

    public v(w wVar, o oVar, Orientation orientation) {
        this.a = wVar;
        this.b = oVar;
        this.c = orientation;
    }

    public final long a(float f) {
        Orientation orientation = Orientation.Horizontal;
        Orientation orientation2 = this.c;
        float f2 = orientation2 == orientation ? f : 0.0f;
        if (orientation2 != Orientation.Vertical) {
            f = 0.0f;
        }
        return (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f2) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.gn50
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo28onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1;
        int i;
        if (continuation instanceof SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) {
            sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 = (SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1) continuation;
            int i2 = sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    float c = this.c == Orientation.Horizontal ? k631.c(j2) : k631.d(j2);
                    sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.J$0 = j;
                    sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.label = 1;
                    obj = this.a.a(this.b, c, sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.J$0;
                    kotlin.b.b(obj);
                }
                return new k631(ma91.a(k631.c(j), ((Number) obj).floatValue()));
            }
        }
        sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1 = new SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1(this, (ContinuationImpl) continuation);
        Object obj2 = sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPostFling$1.label;
        if (i != 0) {
        }
        return new k631(ma91.a(k631.c(j), ((Number) obj2).floatValue()));
    }

    @Override // defpackage.gn50
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo29onPostScrollDzOQY0M(long j, long j2, int i) {
        if (i == 1) {
            return a(this.a.e.c(Float.intBitsToFloat((int) (this.c == Orientation.Horizontal ? j2 >> 32 : j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))));
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.gn50
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo33onPreFlingQWom1Mo(long j, Continuation continuation) {
        SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1;
        int i;
        w wVar = this.a;
        androidx.compose.foundation.gestures.e eVar = wVar.e;
        if (continuation instanceof SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) {
            sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 = (SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) continuation;
            int i2 = sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    float c = this.c == Orientation.Horizontal ? k631.c(j) : k631.d(j);
                    float g = eVar.g();
                    float e = eVar.d().e();
                    if (c >= 0.0f || g <= e) {
                        j = 0;
                    } else {
                        sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.J$0 = j;
                        sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.label = 1;
                        if (wVar.a(this.b, c, sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.J$0;
                    kotlin.b.b(obj);
                }
                return new k631(j);
            }
        }
        sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1 = new SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1(this, (ContinuationImpl) continuation);
        Object obj2 = sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1$onPreFling$1.label;
        if (i != 0) {
        }
        return new k631(j);
    }

    @Override // defpackage.gn50
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo34onPreScrollOzD1aCk(long j, int i) {
        float intBitsToFloat = Float.intBitsToFloat((int) (this.c == Orientation.Horizontal ? j >> 32 : j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        if (intBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        return a(this.a.e.c(intBitsToFloat));
    }
}
