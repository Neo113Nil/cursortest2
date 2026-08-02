package com.yandex.go.taxi.order.details.v1.elements.driver;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.avj0;
import defpackage.f1h0;
import defpackage.gs70;
import defpackage.k7x0;
import defpackage.mb4;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vng;
import defpackage.vpr;
import defpackage.yhm;
import defpackage.zhm;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.FormattedTextConverter$EmptyDrawable;

/* loaded from: classes14.dex */
public final class e implements zhm {
    public final gs70 a;
    public final yhm b;
    public final k7x0 c;
    public final zuj0 d;
    public final Context e;

    public e(gs70 gs70Var, yhm yhmVar, k7x0 k7x0Var, zuj0 zuj0Var, Context context) {
        this.a = gs70Var;
        this.b = yhmVar;
        this.c = k7x0Var;
        this.d = zuj0Var;
        this.e = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        if (r8.emit(r2, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, vpr vprVar, String str, TaxiOrder taxiOrder, ContinuationImpl continuationImpl) {
        DriverAvatarStateMapperImpl$downloadAvatar$1 driverAvatarStateMapperImpl$downloadAvatar$1;
        int i;
        vpr vprVar2;
        eVar.getClass();
        if (continuationImpl instanceof DriverAvatarStateMapperImpl$downloadAvatar$1) {
            driverAvatarStateMapperImpl$downloadAvatar$1 = (DriverAvatarStateMapperImpl$downloadAvatar$1) continuationImpl;
            int i2 = driverAvatarStateMapperImpl$downloadAvatar$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driverAvatarStateMapperImpl$downloadAvatar$1.label = i2 - Integer.MIN_VALUE;
                Object obj = driverAvatarStateMapperImpl$downloadAvatar$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driverAvatarStateMapperImpl$downloadAvatar$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Drawable t = vng.t(f1h0.driver_avatar_fallback, ((avj0) eVar.d).a);
                    if (t == null) {
                        t = new FormattedTextConverter$EmptyDrawable();
                    }
                    mb4 mb4Var = new mb4(t, true);
                    driverAvatarStateMapperImpl$downloadAvatar$1.L$0 = vprVar;
                    driverAvatarStateMapperImpl$downloadAvatar$1.L$1 = str;
                    driverAvatarStateMapperImpl$downloadAvatar$1.L$2 = taxiOrder;
                    driverAvatarStateMapperImpl$downloadAvatar$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        vprVar2 = (vpr) driverAvatarStateMapperImpl$downloadAvatar$1.L$3;
                        kotlin.b.b(obj);
                        driverAvatarStateMapperImpl$downloadAvatar$1.L$0 = null;
                        driverAvatarStateMapperImpl$downloadAvatar$1.L$1 = null;
                        driverAvatarStateMapperImpl$downloadAvatar$1.L$2 = null;
                        driverAvatarStateMapperImpl$downloadAvatar$1.L$3 = null;
                        driverAvatarStateMapperImpl$downloadAvatar$1.label = 3;
                        Object emit = vprVar2.emit(obj, driverAvatarStateMapperImpl$downloadAvatar$1);
                        return emit != obj2 ? obj2 : emit;
                    }
                    taxiOrder = (TaxiOrder) driverAvatarStateMapperImpl$downloadAvatar$1.L$2;
                    str = (String) driverAvatarStateMapperImpl$downloadAvatar$1.L$1;
                    vprVar = (vpr) driverAvatarStateMapperImpl$downloadAvatar$1.L$0;
                    kotlin.b.b(obj);
                }
                if (taxiOrder.b().a != null) {
                    return zy11.a;
                }
                driverAvatarStateMapperImpl$downloadAvatar$1.L$0 = null;
                driverAvatarStateMapperImpl$downloadAvatar$1.L$1 = null;
                driverAvatarStateMapperImpl$downloadAvatar$1.L$2 = null;
                driverAvatarStateMapperImpl$downloadAvatar$1.L$3 = vprVar;
                driverAvatarStateMapperImpl$downloadAvatar$1.label = 2;
                obj = eVar.b(str, driverAvatarStateMapperImpl$downloadAvatar$1);
                if (obj != obj2) {
                    vprVar2 = vprVar;
                    driverAvatarStateMapperImpl$downloadAvatar$1.L$0 = null;
                    driverAvatarStateMapperImpl$downloadAvatar$1.L$1 = null;
                    driverAvatarStateMapperImpl$downloadAvatar$1.L$2 = null;
                    driverAvatarStateMapperImpl$downloadAvatar$1.L$3 = null;
                    driverAvatarStateMapperImpl$downloadAvatar$1.label = 3;
                    Object emit2 = vprVar2.emit(obj, driverAvatarStateMapperImpl$downloadAvatar$1);
                    if (emit2 != obj2) {
                    }
                }
            }
        }
        driverAvatarStateMapperImpl$downloadAvatar$1 = new DriverAvatarStateMapperImpl$downloadAvatar$1(eVar, continuationImpl);
        Object obj3 = driverAvatarStateMapperImpl$downloadAvatar$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driverAvatarStateMapperImpl$downloadAvatar$1.label;
        if (i != 0) {
        }
        if (taxiOrder.b().a != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        DriverAvatarStateMapperImpl$loadDriverAvatar$1 driverAvatarStateMapperImpl$loadDriverAvatar$1;
        int i;
        Drawable bitmapDrawable;
        if (continuationImpl instanceof DriverAvatarStateMapperImpl$loadDriverAvatar$1) {
            driverAvatarStateMapperImpl$loadDriverAvatar$1 = (DriverAvatarStateMapperImpl$loadDriverAvatar$1) continuationImpl;
            int i2 = driverAvatarStateMapperImpl$loadDriverAvatar$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                driverAvatarStateMapperImpl$loadDriverAvatar$1.label = i2 - Integer.MIN_VALUE;
                Object obj = driverAvatarStateMapperImpl$loadDriverAvatar$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = driverAvatarStateMapperImpl$loadDriverAvatar$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    driverAvatarStateMapperImpl$loadDriverAvatar$1.L$0 = null;
                    driverAvatarStateMapperImpl$loadDriverAvatar$1.label = 1;
                    yhm yhmVar = this.b;
                    yhmVar.a.getClass();
                    sjh sjhVar = uyj.a;
                    obj = tje.k0(mdh.b, new DriverAvatarRepository$loadAvatar$2(yhmVar, str, null), driverAvatarStateMapperImpl$loadDriverAvatar$1);
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
                Bitmap bitmap = (Bitmap) obj;
                bitmapDrawable = bitmap == null ? new BitmapDrawable(this.e.getResources(), bitmap) : vng.t(f1h0.driver_avatar_fallback, ((avj0) this.d).a);
                if (bitmapDrawable == null) {
                    bitmapDrawable = new FormattedTextConverter$EmptyDrawable();
                }
                return new mb4(bitmapDrawable, false);
            }
        }
        driverAvatarStateMapperImpl$loadDriverAvatar$1 = new DriverAvatarStateMapperImpl$loadDriverAvatar$1(this, continuationImpl);
        Object obj2 = driverAvatarStateMapperImpl$loadDriverAvatar$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = driverAvatarStateMapperImpl$loadDriverAvatar$1.label;
        if (i != 0) {
        }
        Bitmap bitmap2 = (Bitmap) obj2;
        if (bitmap2 == null) {
        }
        if (bitmapDrawable == null) {
        }
        return new mb4(bitmapDrawable, false);
    }

    public final rol0 c(TaxiOrder taxiOrder) {
        return new rol0(new DriverAvatarStateMapperImpl$mapAvatar$1(this, taxiOrder, null));
    }
}
