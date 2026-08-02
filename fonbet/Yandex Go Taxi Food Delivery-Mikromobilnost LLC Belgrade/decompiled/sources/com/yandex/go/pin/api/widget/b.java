package com.yandex.go.pin.api.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.yandex.go.coroutines.h;
import com.yandex.go.pin.api.v2.PinV2Component;
import defpackage.a0c0;
import defpackage.b3h0;
import defpackage.c0c0;
import defpackage.eco;
import defpackage.ewb0;
import defpackage.f0c0;
import defpackage.fvb0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.i1c0;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.p0c0;
import defpackage.r0c0;
import defpackage.rq00;
import defpackage.sjh;
import defpackage.sls;
import defpackage.sq00;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.map.SourceOnMapControl;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class b {
    public final Context a;
    public final e b;
    public final a c;
    public final tt2 d;
    public final r0c0 e;
    public final eco f;
    public final h3y g;
    public final h h = new h(new PinMapKitImageFactory$pinHolder$1(this, null));
    public final h i = new h(new PinMapKitImageFactory$pinV2$1(this, null));
    public final kotlinx.coroutines.sync.a j = gtq0.a();
    public final i3y k = kotlin.a.a(new fvb0(12));

    public b(Context context, e eVar, a aVar, tt2 tt2Var, r0c0 r0c0Var, eco ecoVar, h3y h3yVar) {
        this.a = context;
        this.b = eVar;
        this.c = aVar;
        this.d = tt2Var;
        this.e = r0c0Var;
        this.f = ecoVar;
        this.g = h3yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, sq00 sq00Var, boolean z, ContinuationImpl continuationImpl) {
        PinMapKitImageFactory$pinV2State$1 pinMapKitImageFactory$pinV2State$1;
        int i;
        f0c0 f0c0Var;
        boolean z2;
        BitmapDrawable bitmapDrawable;
        sq00 sq00Var2 = sq00Var;
        bVar.getClass();
        i3y i3yVar = bVar.k;
        if (continuationImpl instanceof PinMapKitImageFactory$pinV2State$1) {
            pinMapKitImageFactory$pinV2State$1 = (PinMapKitImageFactory$pinV2State$1) continuationImpl;
            int i2 = pinMapKitImageFactory$pinV2State$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinMapKitImageFactory$pinV2State$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinMapKitImageFactory$pinV2State$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinMapKitImageFactory$pinV2State$1.label;
                SourceOnMapControl.a.C0122a c0122a = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f0c0Var = sq00Var2.b;
                    if (f0c0Var == null) {
                        Integer num = sq00Var2.d;
                        if (num != null) {
                            f0c0Var = num.intValue() <= 0 ? a0c0.c : new a0c0(String.valueOf(num.intValue()), num);
                        } else {
                            String str = sq00Var2.e;
                            if (str == null) {
                                z2 = z;
                                f0c0Var = null;
                                if (f0c0Var == null) {
                                    r0c0 r0c0Var = bVar.e;
                                    f0c0Var = z2 ? r0c0Var.h() : r0c0Var.b();
                                }
                                f0c0 f0c0Var2 = f0c0Var;
                                String str2 = sq00Var2.f;
                                String str3 = sq00Var2.g;
                                boolean z3 = sq00Var2.h;
                                boolean z4 = sq00Var2.i;
                                rq00 rq00Var = sq00Var2.j;
                                return new SourceOnMapControl.a(f0c0Var2, str3, str2, z3, z4, rq00Var != null ? new ru.yandex.taxi.widget.map.b(new ru.yandex.taxi.widget.map.a((sls) i3yVar.getValue(), rq00Var.a), new ru.yandex.taxi.widget.map.a((sls) i3yVar.getValue(), rq00Var.b)) : null, c0122a, 432);
                            }
                            e eVar = bVar.b;
                            pinMapKitImageFactory$pinV2State$1.L$0 = sq00Var2;
                            z2 = z;
                            pinMapKitImageFactory$pinV2State$1.Z$0 = z2;
                            pinMapKitImageFactory$pinV2State$1.label = 1;
                            obj = e.f(eVar, str, null, pinMapKitImageFactory$pinV2State$1, 6);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    z2 = z;
                    if (f0c0Var == null) {
                    }
                    f0c0 f0c0Var22 = f0c0Var;
                    String str22 = sq00Var2.f;
                    String str32 = sq00Var2.g;
                    boolean z32 = sq00Var2.h;
                    boolean z42 = sq00Var2.i;
                    rq00 rq00Var2 = sq00Var2.j;
                    return new SourceOnMapControl.a(f0c0Var22, str32, str22, z32, z42, rq00Var2 != null ? new ru.yandex.taxi.widget.map.b(new ru.yandex.taxi.widget.map.a((sls) i3yVar.getValue(), rq00Var2.a), new ru.yandex.taxi.widget.map.a((sls) i3yVar.getValue(), rq00Var2.b)) : null, c0122a, 432);
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z5 = pinMapKitImageFactory$pinV2State$1.Z$0;
                sq00 sq00Var3 = (sq00) pinMapKitImageFactory$pinV2State$1.L$0;
                kotlin.b.b(obj);
                z2 = z5;
                sq00Var2 = sq00Var3;
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable != null) {
                    f0c0Var = new c0c0(bitmapDrawable);
                    if (f0c0Var == null) {
                    }
                    f0c0 f0c0Var222 = f0c0Var;
                    String str222 = sq00Var2.f;
                    String str322 = sq00Var2.g;
                    boolean z322 = sq00Var2.h;
                    boolean z422 = sq00Var2.i;
                    rq00 rq00Var22 = sq00Var2.j;
                    return new SourceOnMapControl.a(f0c0Var222, str322, str222, z322, z422, rq00Var22 != null ? new ru.yandex.taxi.widget.map.b(new ru.yandex.taxi.widget.map.a((sls) i3yVar.getValue(), rq00Var22.a), new ru.yandex.taxi.widget.map.a((sls) i3yVar.getValue(), rq00Var22.b)) : null, c0122a, 432);
                }
                f0c0Var = null;
                if (f0c0Var == null) {
                }
                f0c0 f0c0Var2222 = f0c0Var;
                String str2222 = sq00Var2.f;
                String str3222 = sq00Var2.g;
                boolean z3222 = sq00Var2.h;
                boolean z4222 = sq00Var2.i;
                rq00 rq00Var222 = sq00Var2.j;
                return new SourceOnMapControl.a(f0c0Var2222, str3222, str2222, z3222, z4222, rq00Var222 != null ? new ru.yandex.taxi.widget.map.b(new ru.yandex.taxi.widget.map.a((sls) i3yVar.getValue(), rq00Var222.a), new ru.yandex.taxi.widget.map.a((sls) i3yVar.getValue(), rq00Var222.b)) : null, c0122a, 432);
            }
        }
        pinMapKitImageFactory$pinV2State$1 = new PinMapKitImageFactory$pinV2State$1(bVar, continuationImpl);
        Object obj2 = pinMapKitImageFactory$pinV2State$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinMapKitImageFactory$pinV2State$1.label;
        SourceOnMapControl.a.C0122a c0122a2 = null;
        if (i != 0) {
        }
        bitmapDrawable = (BitmapDrawable) obj2;
        if (bitmapDrawable != null) {
        }
        f0c0Var = null;
        if (f0c0Var == null) {
        }
        f0c0 f0c0Var22222 = f0c0Var;
        String str22222 = sq00Var2.f;
        String str32222 = sq00Var2.g;
        boolean z32222 = sq00Var2.h;
        boolean z42222 = sq00Var2.i;
        rq00 rq00Var2222 = sq00Var2.j;
        return new SourceOnMapControl.a(f0c0Var22222, str32222, str22222, z32222, z42222, rq00Var2222 != null ? new ru.yandex.taxi.widget.map.b(new ru.yandex.taxi.widget.map.a((sls) i3yVar.getValue(), rq00Var2222.a), new ru.yandex.taxi.widget.map.a((sls) i3yVar.getValue(), rq00Var2222.b)) : null, c0122a2, 432);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        PinMapKitImageFactory$ambulanceDestinationPin$1 pinMapKitImageFactory$ambulanceDestinationPin$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        b bVar;
        g050 g050Var;
        PinV2Component pinV2Component;
        g050 g050Var2;
        if (continuationImpl instanceof PinMapKitImageFactory$ambulanceDestinationPin$1) {
            pinMapKitImageFactory$ambulanceDestinationPin$1 = (PinMapKitImageFactory$ambulanceDestinationPin$1) continuationImpl;
            int i2 = pinMapKitImageFactory$ambulanceDestinationPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinMapKitImageFactory$ambulanceDestinationPin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinMapKitImageFactory$ambulanceDestinationPin$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinMapKitImageFactory$ambulanceDestinationPin$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinMapKitImageFactory$ambulanceDestinationPin$1.L$0 = this;
                    pinMapKitImageFactory$ambulanceDestinationPin$1.label = 1;
                    obj = this.i.a(pinMapKitImageFactory$ambulanceDestinationPin$1);
                    if (obj != coroutineSingletons) {
                        bVar = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var2 = (g050) pinMapKitImageFactory$ambulanceDestinationPin$1.L$2;
                        try {
                            kotlin.b.b(obj);
                            g050Var2.d(null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            g050Var2.d(null);
                            throw th;
                        }
                    }
                    g050Var = (g050) pinMapKitImageFactory$ambulanceDestinationPin$1.L$2;
                    pinV2Component = (PinV2Component) pinMapKitImageFactory$ambulanceDestinationPin$1.L$1;
                    bVar = (b) pinMapKitImageFactory$ambulanceDestinationPin$1.L$0;
                    kotlin.b.b(obj);
                    try {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        bVar.d.getClass();
                        sjh sjhVar = uyj.a;
                        PinMapKitImageFactory$ambulanceDestinationPin$$inlined$renderPinV2Content$1 pinMapKitImageFactory$ambulanceDestinationPin$$inlined$renderPinV2Content$1 = new PinMapKitImageFactory$ambulanceDestinationPin$$inlined$renderPinV2Content$1(pinV2Component, null, this);
                        pinMapKitImageFactory$ambulanceDestinationPin$1.L$0 = null;
                        pinMapKitImageFactory$ambulanceDestinationPin$1.L$1 = null;
                        pinMapKitImageFactory$ambulanceDestinationPin$1.L$2 = g050Var;
                        pinMapKitImageFactory$ambulanceDestinationPin$1.label = 3;
                        obj = tje.k0(sjhVar, pinMapKitImageFactory$ambulanceDestinationPin$$inlined$renderPinV2Content$1, pinMapKitImageFactory$ambulanceDestinationPin$1);
                        if (obj != coroutineSingletons) {
                            g050Var2 = g050Var;
                            g050Var2.d(null);
                            return obj;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th3) {
                        th = th3;
                        g050Var2 = g050Var;
                        g050Var2.d(null);
                        throw th;
                    }
                }
                b bVar2 = (b) pinMapKitImageFactory$ambulanceDestinationPin$1.L$0;
                kotlin.b.b(obj);
                bVar = bVar2;
                PinV2Component pinV2Component2 = (PinV2Component) obj;
                g050Var = bVar.j;
                pinMapKitImageFactory$ambulanceDestinationPin$1.L$0 = bVar;
                pinMapKitImageFactory$ambulanceDestinationPin$1.L$1 = pinV2Component2;
                pinMapKitImageFactory$ambulanceDestinationPin$1.L$2 = g050Var;
                pinMapKitImageFactory$ambulanceDestinationPin$1.label = 2;
                if (g050Var.a(pinMapKitImageFactory$ambulanceDestinationPin$1) != coroutineSingletons) {
                    pinV2Component = pinV2Component2;
                    bVar.d.getClass();
                    sjh sjhVar2 = uyj.a;
                    PinMapKitImageFactory$ambulanceDestinationPin$$inlined$renderPinV2Content$1 pinMapKitImageFactory$ambulanceDestinationPin$$inlined$renderPinV2Content$12 = new PinMapKitImageFactory$ambulanceDestinationPin$$inlined$renderPinV2Content$1(pinV2Component, null, this);
                    pinMapKitImageFactory$ambulanceDestinationPin$1.L$0 = null;
                    pinMapKitImageFactory$ambulanceDestinationPin$1.L$1 = null;
                    pinMapKitImageFactory$ambulanceDestinationPin$1.L$2 = g050Var;
                    pinMapKitImageFactory$ambulanceDestinationPin$1.label = 3;
                    obj = tje.k0(sjhVar2, pinMapKitImageFactory$ambulanceDestinationPin$$inlined$renderPinV2Content$12, pinMapKitImageFactory$ambulanceDestinationPin$1);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        pinMapKitImageFactory$ambulanceDestinationPin$1 = new PinMapKitImageFactory$ambulanceDestinationPin$1(this, continuationImpl);
        Object obj2 = pinMapKitImageFactory$ambulanceDestinationPin$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinMapKitImageFactory$ambulanceDestinationPin$1.label;
        if (i != 0) {
        }
        PinV2Component pinV2Component22 = (PinV2Component) obj2;
        g050Var = bVar.j;
        pinMapKitImageFactory$ambulanceDestinationPin$1.L$0 = bVar;
        pinMapKitImageFactory$ambulanceDestinationPin$1.L$1 = pinV2Component22;
        pinMapKitImageFactory$ambulanceDestinationPin$1.L$2 = g050Var;
        pinMapKitImageFactory$ambulanceDestinationPin$1.label = 2;
        if (g050Var.a(pinMapKitImageFactory$ambulanceDestinationPin$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        PinMapKitImageFactory$checkInZonePin$1 pinMapKitImageFactory$checkInZonePin$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        b bVar;
        Drawable drawable;
        g050 g050Var;
        ewb0 ewb0Var;
        Throwable th;
        g050 g050Var2;
        if (continuationImpl instanceof PinMapKitImageFactory$checkInZonePin$1) {
            pinMapKitImageFactory$checkInZonePin$1 = (PinMapKitImageFactory$checkInZonePin$1) continuationImpl;
            int i2 = pinMapKitImageFactory$checkInZonePin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinMapKitImageFactory$checkInZonePin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pinMapKitImageFactory$checkInZonePin$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinMapKitImageFactory$checkInZonePin$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Drawable y = tje.y(b3h0.ic_pin_check_in_zone_24, this.a);
                    pinMapKitImageFactory$checkInZonePin$1.L$0 = y;
                    pinMapKitImageFactory$checkInZonePin$1.L$1 = this;
                    pinMapKitImageFactory$checkInZonePin$1.label = 1;
                    Object a = this.h.a(pinMapKitImageFactory$checkInZonePin$1);
                    if (a != coroutineSingletons) {
                        bVar = this;
                        drawable = y;
                        obj = a;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var2 = (g050) pinMapKitImageFactory$checkInZonePin$1.L$3;
                        try {
                            kotlin.b.b(obj);
                            g050Var2.d(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var2.d(null);
                            throw th;
                        }
                    }
                    g050Var = (g050) pinMapKitImageFactory$checkInZonePin$1.L$3;
                    ewb0 ewb0Var2 = (ewb0) pinMapKitImageFactory$checkInZonePin$1.L$2;
                    bVar = (b) pinMapKitImageFactory$checkInZonePin$1.L$1;
                    drawable = (Drawable) pinMapKitImageFactory$checkInZonePin$1.L$0;
                    kotlin.b.b(obj);
                    ewb0Var = ewb0Var2;
                    Drawable drawable2 = drawable;
                    try {
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        bVar.d.getClass();
                        sjh sjhVar = uyj.a;
                        PinMapKitImageFactory$checkInZonePin$$inlined$renderPinContent$1 pinMapKitImageFactory$checkInZonePin$$inlined$renderPinContent$1 = new PinMapKitImageFactory$checkInZonePin$$inlined$renderPinContent$1(ewb0Var, null, this, drawable2, drawable2);
                        pinMapKitImageFactory$checkInZonePin$1.L$0 = null;
                        pinMapKitImageFactory$checkInZonePin$1.L$1 = null;
                        pinMapKitImageFactory$checkInZonePin$1.L$2 = null;
                        pinMapKitImageFactory$checkInZonePin$1.L$3 = g050Var;
                        pinMapKitImageFactory$checkInZonePin$1.label = 3;
                        obj = tje.k0(sjhVar, pinMapKitImageFactory$checkInZonePin$$inlined$renderPinContent$1, pinMapKitImageFactory$checkInZonePin$1);
                        if (obj != coroutineSingletons) {
                            g050Var2 = g050Var;
                            g050Var2.d(null);
                            return obj;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th4) {
                        th = th4;
                        g050Var2 = g050Var;
                        g050Var2.d(null);
                        throw th;
                    }
                }
                b bVar2 = (b) pinMapKitImageFactory$checkInZonePin$1.L$1;
                Drawable drawable3 = (Drawable) pinMapKitImageFactory$checkInZonePin$1.L$0;
                kotlin.b.b(obj);
                drawable = drawable3;
                bVar = bVar2;
                ewb0 ewb0Var3 = (ewb0) obj;
                g050Var = bVar.j;
                pinMapKitImageFactory$checkInZonePin$1.L$0 = drawable;
                pinMapKitImageFactory$checkInZonePin$1.L$1 = bVar;
                pinMapKitImageFactory$checkInZonePin$1.L$2 = ewb0Var3;
                pinMapKitImageFactory$checkInZonePin$1.L$3 = g050Var;
                pinMapKitImageFactory$checkInZonePin$1.label = 2;
                if (g050Var.a(pinMapKitImageFactory$checkInZonePin$1) != coroutineSingletons) {
                    ewb0Var = ewb0Var3;
                    Drawable drawable22 = drawable;
                    bVar.d.getClass();
                    sjh sjhVar2 = uyj.a;
                    PinMapKitImageFactory$checkInZonePin$$inlined$renderPinContent$1 pinMapKitImageFactory$checkInZonePin$$inlined$renderPinContent$12 = new PinMapKitImageFactory$checkInZonePin$$inlined$renderPinContent$1(ewb0Var, null, this, drawable22, drawable22);
                    pinMapKitImageFactory$checkInZonePin$1.L$0 = null;
                    pinMapKitImageFactory$checkInZonePin$1.L$1 = null;
                    pinMapKitImageFactory$checkInZonePin$1.L$2 = null;
                    pinMapKitImageFactory$checkInZonePin$1.L$3 = g050Var;
                    pinMapKitImageFactory$checkInZonePin$1.label = 3;
                    obj = tje.k0(sjhVar2, pinMapKitImageFactory$checkInZonePin$$inlined$renderPinContent$12, pinMapKitImageFactory$checkInZonePin$1);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        pinMapKitImageFactory$checkInZonePin$1 = new PinMapKitImageFactory$checkInZonePin$1(this, continuationImpl);
        Object obj2 = pinMapKitImageFactory$checkInZonePin$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinMapKitImageFactory$checkInZonePin$1.label;
        if (i != 0) {
        }
        ewb0 ewb0Var32 = (ewb0) obj2;
        g050Var = bVar.j;
        pinMapKitImageFactory$checkInZonePin$1.L$0 = drawable;
        pinMapKitImageFactory$checkInZonePin$1.L$1 = bVar;
        pinMapKitImageFactory$checkInZonePin$1.L$2 = ewb0Var32;
        pinMapKitImageFactory$checkInZonePin$1.L$3 = g050Var;
        pinMapKitImageFactory$checkInZonePin$1.label = 2;
        if (g050Var.a(pinMapKitImageFactory$checkInZonePin$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c0, code lost:
    
        if (r1 == r3) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r0v10, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        PinMapKitImageFactory$commonDeliveryPin$1 pinMapKitImageFactory$commonDeliveryPin$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        i1c0 c;
        i1c0 i1c0Var;
        SourceOnMapControl.a aVar;
        kotlinx.coroutines.sync.a aVar2;
        SourceOnMapControl.a aVar3;
        PinV2Component pinV2Component;
        g050 g050Var;
        b bVar = this;
        if (continuationImpl instanceof PinMapKitImageFactory$commonDeliveryPin$1) {
            pinMapKitImageFactory$commonDeliveryPin$1 = (PinMapKitImageFactory$commonDeliveryPin$1) continuationImpl;
            int i2 = pinMapKitImageFactory$commonDeliveryPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinMapKitImageFactory$commonDeliveryPin$1.label = i2 - Integer.MIN_VALUE;
                obj = pinMapKitImageFactory$commonDeliveryPin$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinMapKitImageFactory$commonDeliveryPin$1.label;
                r0c0 r0c0Var = bVar.e;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c = r0c0Var.c();
                    pinMapKitImageFactory$commonDeliveryPin$1.L$0 = null;
                    pinMapKitImageFactory$commonDeliveryPin$1.L$1 = c;
                    pinMapKitImageFactory$commonDeliveryPin$1.label = 1;
                    obj = e.k(bVar.b, str, null, pinMapKitImageFactory$commonDeliveryPin$1, 14);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            bVar = (b) pinMapKitImageFactory$commonDeliveryPin$1.L$4;
                            aVar = (SourceOnMapControl.a) pinMapKitImageFactory$commonDeliveryPin$1.L$3;
                            i1c0 i1c0Var2 = (i1c0) pinMapKitImageFactory$commonDeliveryPin$1.L$1;
                            kotlin.b.b(obj);
                            i1c0Var = i1c0Var2;
                            PinV2Component pinV2Component2 = (PinV2Component) obj;
                            aVar2 = bVar.j;
                            pinMapKitImageFactory$commonDeliveryPin$1.L$0 = null;
                            pinMapKitImageFactory$commonDeliveryPin$1.L$1 = i1c0Var;
                            pinMapKitImageFactory$commonDeliveryPin$1.L$2 = null;
                            pinMapKitImageFactory$commonDeliveryPin$1.L$3 = aVar;
                            pinMapKitImageFactory$commonDeliveryPin$1.L$4 = bVar;
                            pinMapKitImageFactory$commonDeliveryPin$1.L$5 = pinV2Component2;
                            pinMapKitImageFactory$commonDeliveryPin$1.L$6 = aVar2;
                            pinMapKitImageFactory$commonDeliveryPin$1.label = 3;
                            if (aVar2.a(pinMapKitImageFactory$commonDeliveryPin$1) != coroutineSingletons) {
                                aVar3 = aVar;
                                pinV2Component = pinV2Component2;
                                bVar.d.getClass();
                                sjh sjhVar = uyj.a;
                                PinMapKitImageFactory$commonDeliveryPin$$inlined$renderPinV2Content$1 pinMapKitImageFactory$commonDeliveryPin$$inlined$renderPinV2Content$1 = new PinMapKitImageFactory$commonDeliveryPin$$inlined$renderPinV2Content$1(pinV2Component, null, i1c0Var, aVar3);
                                pinMapKitImageFactory$commonDeliveryPin$1.L$0 = null;
                                pinMapKitImageFactory$commonDeliveryPin$1.L$1 = null;
                                pinMapKitImageFactory$commonDeliveryPin$1.L$2 = null;
                                pinMapKitImageFactory$commonDeliveryPin$1.L$3 = null;
                                pinMapKitImageFactory$commonDeliveryPin$1.L$4 = null;
                                pinMapKitImageFactory$commonDeliveryPin$1.L$5 = null;
                                pinMapKitImageFactory$commonDeliveryPin$1.L$6 = aVar2;
                                pinMapKitImageFactory$commonDeliveryPin$1.label = 4;
                                obj = tje.k0(sjhVar, pinMapKitImageFactory$commonDeliveryPin$$inlined$renderPinV2Content$1, pinMapKitImageFactory$commonDeliveryPin$1);
                                if (obj != coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) pinMapKitImageFactory$commonDeliveryPin$1.L$6;
                            try {
                                kotlin.b.b(obj);
                                g050Var.d(null);
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r0 = (g050) pinMapKitImageFactory$commonDeliveryPin$1.L$6;
                        pinV2Component = (PinV2Component) pinMapKitImageFactory$commonDeliveryPin$1.L$5;
                        b bVar2 = (b) pinMapKitImageFactory$commonDeliveryPin$1.L$4;
                        aVar3 = (SourceOnMapControl.a) pinMapKitImageFactory$commonDeliveryPin$1.L$3;
                        i1c0Var = (i1c0) pinMapKitImageFactory$commonDeliveryPin$1.L$1;
                        kotlin.b.b(obj);
                        aVar2 = r0;
                        bVar = bVar2;
                        try {
                            bVar.d.getClass();
                            sjh sjhVar2 = uyj.a;
                            PinMapKitImageFactory$commonDeliveryPin$$inlined$renderPinV2Content$1 pinMapKitImageFactory$commonDeliveryPin$$inlined$renderPinV2Content$12 = new PinMapKitImageFactory$commonDeliveryPin$$inlined$renderPinV2Content$1(pinV2Component, null, i1c0Var, aVar3);
                            pinMapKitImageFactory$commonDeliveryPin$1.L$0 = null;
                            pinMapKitImageFactory$commonDeliveryPin$1.L$1 = null;
                            pinMapKitImageFactory$commonDeliveryPin$1.L$2 = null;
                            pinMapKitImageFactory$commonDeliveryPin$1.L$3 = null;
                            pinMapKitImageFactory$commonDeliveryPin$1.L$4 = null;
                            pinMapKitImageFactory$commonDeliveryPin$1.L$5 = null;
                            pinMapKitImageFactory$commonDeliveryPin$1.L$6 = aVar2;
                            pinMapKitImageFactory$commonDeliveryPin$1.label = 4;
                            obj = tje.k0(sjhVar2, pinMapKitImageFactory$commonDeliveryPin$$inlined$renderPinV2Content$12, pinMapKitImageFactory$commonDeliveryPin$1);
                            if (obj != coroutineSingletons) {
                                g050Var = aVar2;
                                g050Var.d(null);
                                return obj;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th2) {
                            th = th2;
                            g050Var = aVar2;
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    c = (i1c0) pinMapKitImageFactory$commonDeliveryPin$1.L$1;
                    kotlin.b.b(obj);
                }
                BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
                SourceOnMapControl.a aVar4 = new SourceOnMapControl.a(bitmapDrawable == null ? new c0c0(bitmapDrawable) : r0c0Var.b(), null, null, false, false, null, null, 2046);
                pinMapKitImageFactory$commonDeliveryPin$1.L$0 = null;
                pinMapKitImageFactory$commonDeliveryPin$1.L$1 = c;
                pinMapKitImageFactory$commonDeliveryPin$1.L$2 = null;
                pinMapKitImageFactory$commonDeliveryPin$1.L$3 = aVar4;
                pinMapKitImageFactory$commonDeliveryPin$1.L$4 = bVar;
                pinMapKitImageFactory$commonDeliveryPin$1.label = 2;
                obj = bVar.i.a(pinMapKitImageFactory$commonDeliveryPin$1);
                if (obj != coroutineSingletons) {
                    i1c0Var = c;
                    aVar = aVar4;
                    PinV2Component pinV2Component22 = (PinV2Component) obj;
                    aVar2 = bVar.j;
                    pinMapKitImageFactory$commonDeliveryPin$1.L$0 = null;
                    pinMapKitImageFactory$commonDeliveryPin$1.L$1 = i1c0Var;
                    pinMapKitImageFactory$commonDeliveryPin$1.L$2 = null;
                    pinMapKitImageFactory$commonDeliveryPin$1.L$3 = aVar;
                    pinMapKitImageFactory$commonDeliveryPin$1.L$4 = bVar;
                    pinMapKitImageFactory$commonDeliveryPin$1.L$5 = pinV2Component22;
                    pinMapKitImageFactory$commonDeliveryPin$1.L$6 = aVar2;
                    pinMapKitImageFactory$commonDeliveryPin$1.label = 3;
                    if (aVar2.a(pinMapKitImageFactory$commonDeliveryPin$1) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        pinMapKitImageFactory$commonDeliveryPin$1 = new PinMapKitImageFactory$commonDeliveryPin$1(bVar, continuationImpl);
        obj = pinMapKitImageFactory$commonDeliveryPin$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinMapKitImageFactory$commonDeliveryPin$1.label;
        r0c0 r0c0Var2 = bVar.e;
        if (i != 0) {
        }
        BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj;
        SourceOnMapControl.a aVar42 = new SourceOnMapControl.a(bitmapDrawable2 == null ? new c0c0(bitmapDrawable2) : r0c0Var2.b(), null, null, false, false, null, null, 2046);
        pinMapKitImageFactory$commonDeliveryPin$1.L$0 = null;
        pinMapKitImageFactory$commonDeliveryPin$1.L$1 = c;
        pinMapKitImageFactory$commonDeliveryPin$1.L$2 = null;
        pinMapKitImageFactory$commonDeliveryPin$1.L$3 = aVar42;
        pinMapKitImageFactory$commonDeliveryPin$1.L$4 = bVar;
        pinMapKitImageFactory$commonDeliveryPin$1.label = 2;
        obj = bVar.i.a(pinMapKitImageFactory$commonDeliveryPin$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r1v17, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(sq00 sq00Var, Continuation continuation) {
        PinMapKitImageFactory$destinationPin$1 pinMapKitImageFactory$destinationPin$1;
        PinMapKitImageFactory$destinationPin$1 pinMapKitImageFactory$destinationPin$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        b bVar;
        sq00 sq00Var2;
        ewb0 ewb0Var;
        kotlinx.coroutines.sync.a aVar;
        kotlinx.coroutines.sync.a aVar2;
        sq00 sq00Var3;
        g050 g050Var;
        if (continuation instanceof PinMapKitImageFactory$destinationPin$1) {
            pinMapKitImageFactory$destinationPin$1 = (PinMapKitImageFactory$destinationPin$1) continuation;
            int i2 = pinMapKitImageFactory$destinationPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinMapKitImageFactory$destinationPin$1.label = i2 - Integer.MIN_VALUE;
                pinMapKitImageFactory$destinationPin$12 = pinMapKitImageFactory$destinationPin$1;
                Object obj = pinMapKitImageFactory$destinationPin$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinMapKitImageFactory$destinationPin$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinMapKitImageFactory$destinationPin$12.L$0 = sq00Var;
                    pinMapKitImageFactory$destinationPin$12.L$1 = this;
                    pinMapKitImageFactory$destinationPin$12.label = 1;
                    a = this.h.a(pinMapKitImageFactory$destinationPin$12);
                    if (a != coroutineSingletons) {
                        bVar = this;
                        sq00Var2 = sq00Var;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) pinMapKitImageFactory$destinationPin$12.L$3;
                        try {
                            kotlin.b.b(obj);
                            g050Var.d(null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    ?? r1 = (g050) pinMapKitImageFactory$destinationPin$12.L$3;
                    ewb0 ewb0Var2 = (ewb0) pinMapKitImageFactory$destinationPin$12.L$2;
                    bVar = (b) pinMapKitImageFactory$destinationPin$12.L$1;
                    sq00Var3 = (sq00) pinMapKitImageFactory$destinationPin$12.L$0;
                    kotlin.b.b(obj);
                    aVar2 = r1;
                    ewb0Var = ewb0Var2;
                    try {
                        bVar.d.getClass();
                        sjh sjhVar = uyj.a;
                        PinMapKitImageFactory$destinationPin$$inlined$renderPinContent$1 pinMapKitImageFactory$destinationPin$$inlined$renderPinContent$1 = new PinMapKitImageFactory$destinationPin$$inlined$renderPinContent$1(ewb0Var, null, this, sq00Var3, sq00Var3);
                        pinMapKitImageFactory$destinationPin$12.L$0 = null;
                        pinMapKitImageFactory$destinationPin$12.L$1 = null;
                        pinMapKitImageFactory$destinationPin$12.L$2 = null;
                        pinMapKitImageFactory$destinationPin$12.L$3 = aVar2;
                        pinMapKitImageFactory$destinationPin$12.label = 3;
                        obj = tje.k0(sjhVar, pinMapKitImageFactory$destinationPin$$inlined$renderPinContent$1, pinMapKitImageFactory$destinationPin$12);
                        if (obj != coroutineSingletons) {
                            g050Var = aVar2;
                            g050Var.d(null);
                            return obj;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        g050Var = aVar2;
                        g050Var.d(null);
                        throw th;
                    }
                }
                b bVar2 = (b) pinMapKitImageFactory$destinationPin$12.L$1;
                sq00 sq00Var4 = (sq00) pinMapKitImageFactory$destinationPin$12.L$0;
                kotlin.b.b(obj);
                a = obj;
                sq00Var2 = sq00Var4;
                bVar = bVar2;
                ewb0Var = (ewb0) a;
                aVar = bVar.j;
                pinMapKitImageFactory$destinationPin$12.L$0 = sq00Var2;
                pinMapKitImageFactory$destinationPin$12.L$1 = bVar;
                pinMapKitImageFactory$destinationPin$12.L$2 = ewb0Var;
                pinMapKitImageFactory$destinationPin$12.L$3 = aVar;
                pinMapKitImageFactory$destinationPin$12.label = 2;
                if (aVar.a(pinMapKitImageFactory$destinationPin$12) != coroutineSingletons) {
                    aVar2 = aVar;
                    sq00Var3 = sq00Var2;
                    bVar.d.getClass();
                    sjh sjhVar2 = uyj.a;
                    PinMapKitImageFactory$destinationPin$$inlined$renderPinContent$1 pinMapKitImageFactory$destinationPin$$inlined$renderPinContent$12 = new PinMapKitImageFactory$destinationPin$$inlined$renderPinContent$1(ewb0Var, null, this, sq00Var3, sq00Var3);
                    pinMapKitImageFactory$destinationPin$12.L$0 = null;
                    pinMapKitImageFactory$destinationPin$12.L$1 = null;
                    pinMapKitImageFactory$destinationPin$12.L$2 = null;
                    pinMapKitImageFactory$destinationPin$12.L$3 = aVar2;
                    pinMapKitImageFactory$destinationPin$12.label = 3;
                    obj = tje.k0(sjhVar2, pinMapKitImageFactory$destinationPin$$inlined$renderPinContent$12, pinMapKitImageFactory$destinationPin$12);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        pinMapKitImageFactory$destinationPin$1 = new PinMapKitImageFactory$destinationPin$1(this, continuation);
        pinMapKitImageFactory$destinationPin$12 = pinMapKitImageFactory$destinationPin$1;
        Object obj2 = pinMapKitImageFactory$destinationPin$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinMapKitImageFactory$destinationPin$12.label;
        if (i != 0) {
        }
        ewb0Var = (ewb0) a;
        aVar = bVar.j;
        pinMapKitImageFactory$destinationPin$12.L$0 = sq00Var2;
        pinMapKitImageFactory$destinationPin$12.L$1 = bVar;
        pinMapKitImageFactory$destinationPin$12.L$2 = ewb0Var;
        pinMapKitImageFactory$destinationPin$12.L$3 = aVar;
        pinMapKitImageFactory$destinationPin$12.label = 2;
        if (aVar.a(pinMapKitImageFactory$destinationPin$12) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r1v17, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(p0c0 p0c0Var, ContinuationImpl continuationImpl) {
        PinMapKitImageFactory$loadingPin$1 pinMapKitImageFactory$loadingPin$1;
        PinMapKitImageFactory$loadingPin$1 pinMapKitImageFactory$loadingPin$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        b bVar;
        p0c0 p0c0Var2;
        ewb0 ewb0Var;
        kotlinx.coroutines.sync.a aVar;
        kotlinx.coroutines.sync.a aVar2;
        p0c0 p0c0Var3;
        g050 g050Var;
        if (continuationImpl instanceof PinMapKitImageFactory$loadingPin$1) {
            pinMapKitImageFactory$loadingPin$1 = (PinMapKitImageFactory$loadingPin$1) continuationImpl;
            int i2 = pinMapKitImageFactory$loadingPin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinMapKitImageFactory$loadingPin$1.label = i2 - Integer.MIN_VALUE;
                pinMapKitImageFactory$loadingPin$12 = pinMapKitImageFactory$loadingPin$1;
                Object obj = pinMapKitImageFactory$loadingPin$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinMapKitImageFactory$loadingPin$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinMapKitImageFactory$loadingPin$12.L$0 = p0c0Var;
                    pinMapKitImageFactory$loadingPin$12.L$1 = this;
                    pinMapKitImageFactory$loadingPin$12.label = 1;
                    a = this.h.a(pinMapKitImageFactory$loadingPin$12);
                    if (a != coroutineSingletons) {
                        bVar = this;
                        p0c0Var2 = p0c0Var;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) pinMapKitImageFactory$loadingPin$12.L$3;
                        try {
                            kotlin.b.b(obj);
                            g050Var.d(null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    ?? r1 = (g050) pinMapKitImageFactory$loadingPin$12.L$3;
                    ewb0 ewb0Var2 = (ewb0) pinMapKitImageFactory$loadingPin$12.L$2;
                    bVar = (b) pinMapKitImageFactory$loadingPin$12.L$1;
                    p0c0Var3 = (p0c0) pinMapKitImageFactory$loadingPin$12.L$0;
                    kotlin.b.b(obj);
                    aVar2 = r1;
                    ewb0Var = ewb0Var2;
                    try {
                        bVar.d.getClass();
                        sjh sjhVar = uyj.a;
                        PinMapKitImageFactory$loadingPin$$inlined$renderPinContent$1 pinMapKitImageFactory$loadingPin$$inlined$renderPinContent$1 = new PinMapKitImageFactory$loadingPin$$inlined$renderPinContent$1(ewb0Var, null, this, p0c0Var3, p0c0Var3);
                        pinMapKitImageFactory$loadingPin$12.L$0 = null;
                        pinMapKitImageFactory$loadingPin$12.L$1 = null;
                        pinMapKitImageFactory$loadingPin$12.L$2 = null;
                        pinMapKitImageFactory$loadingPin$12.L$3 = aVar2;
                        pinMapKitImageFactory$loadingPin$12.label = 3;
                        obj = tje.k0(sjhVar, pinMapKitImageFactory$loadingPin$$inlined$renderPinContent$1, pinMapKitImageFactory$loadingPin$12);
                        if (obj != coroutineSingletons) {
                            g050Var = aVar2;
                            g050Var.d(null);
                            return obj;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        g050Var = aVar2;
                        g050Var.d(null);
                        throw th;
                    }
                }
                b bVar2 = (b) pinMapKitImageFactory$loadingPin$12.L$1;
                p0c0 p0c0Var4 = (p0c0) pinMapKitImageFactory$loadingPin$12.L$0;
                kotlin.b.b(obj);
                a = obj;
                p0c0Var2 = p0c0Var4;
                bVar = bVar2;
                ewb0Var = (ewb0) a;
                aVar = bVar.j;
                pinMapKitImageFactory$loadingPin$12.L$0 = p0c0Var2;
                pinMapKitImageFactory$loadingPin$12.L$1 = bVar;
                pinMapKitImageFactory$loadingPin$12.L$2 = ewb0Var;
                pinMapKitImageFactory$loadingPin$12.L$3 = aVar;
                pinMapKitImageFactory$loadingPin$12.label = 2;
                if (aVar.a(pinMapKitImageFactory$loadingPin$12) != coroutineSingletons) {
                    aVar2 = aVar;
                    p0c0Var3 = p0c0Var2;
                    bVar.d.getClass();
                    sjh sjhVar2 = uyj.a;
                    PinMapKitImageFactory$loadingPin$$inlined$renderPinContent$1 pinMapKitImageFactory$loadingPin$$inlined$renderPinContent$12 = new PinMapKitImageFactory$loadingPin$$inlined$renderPinContent$1(ewb0Var, null, this, p0c0Var3, p0c0Var3);
                    pinMapKitImageFactory$loadingPin$12.L$0 = null;
                    pinMapKitImageFactory$loadingPin$12.L$1 = null;
                    pinMapKitImageFactory$loadingPin$12.L$2 = null;
                    pinMapKitImageFactory$loadingPin$12.L$3 = aVar2;
                    pinMapKitImageFactory$loadingPin$12.label = 3;
                    obj = tje.k0(sjhVar2, pinMapKitImageFactory$loadingPin$$inlined$renderPinContent$12, pinMapKitImageFactory$loadingPin$12);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        pinMapKitImageFactory$loadingPin$1 = new PinMapKitImageFactory$loadingPin$1(this, continuationImpl);
        pinMapKitImageFactory$loadingPin$12 = pinMapKitImageFactory$loadingPin$1;
        Object obj2 = pinMapKitImageFactory$loadingPin$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinMapKitImageFactory$loadingPin$12.label;
        if (i != 0) {
        }
        ewb0Var = (ewb0) a;
        aVar = bVar.j;
        pinMapKitImageFactory$loadingPin$12.L$0 = p0c0Var2;
        pinMapKitImageFactory$loadingPin$12.L$1 = bVar;
        pinMapKitImageFactory$loadingPin$12.L$2 = ewb0Var;
        pinMapKitImageFactory$loadingPin$12.L$3 = aVar;
        pinMapKitImageFactory$loadingPin$12.label = 2;
        if (aVar.a(pinMapKitImageFactory$loadingPin$12) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r1v16, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, Bitmap bitmap, String str2, ContinuationImpl continuationImpl) {
        PinMapKitImageFactory$orderBubblePin$1 pinMapKitImageFactory$orderBubblePin$1;
        PinMapKitImageFactory$orderBubblePin$1 pinMapKitImageFactory$orderBubblePin$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        Bitmap bitmap2;
        Object obj;
        String str3;
        b bVar;
        String str4;
        kotlinx.coroutines.sync.a aVar;
        Bitmap bitmap3;
        PinV2Component pinV2Component;
        String str5;
        b bVar2;
        g050 g050Var;
        if (continuationImpl instanceof PinMapKitImageFactory$orderBubblePin$1) {
            pinMapKitImageFactory$orderBubblePin$1 = (PinMapKitImageFactory$orderBubblePin$1) continuationImpl;
            int i2 = pinMapKitImageFactory$orderBubblePin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinMapKitImageFactory$orderBubblePin$1.label = i2 - Integer.MIN_VALUE;
                pinMapKitImageFactory$orderBubblePin$12 = pinMapKitImageFactory$orderBubblePin$1;
                Object obj2 = pinMapKitImageFactory$orderBubblePin$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinMapKitImageFactory$orderBubblePin$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    pinMapKitImageFactory$orderBubblePin$12.L$0 = str;
                    bitmap2 = bitmap;
                    pinMapKitImageFactory$orderBubblePin$12.L$1 = bitmap2;
                    pinMapKitImageFactory$orderBubblePin$12.L$2 = str2;
                    pinMapKitImageFactory$orderBubblePin$12.L$3 = this;
                    pinMapKitImageFactory$orderBubblePin$12.label = 1;
                    Object a = this.i.a(pinMapKitImageFactory$orderBubblePin$12);
                    if (a != coroutineSingletons) {
                        obj = a;
                        str3 = str2;
                        bVar = this;
                        str4 = str;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) pinMapKitImageFactory$orderBubblePin$12.L$5;
                        try {
                            kotlin.b.b(obj2);
                            g050Var.d(null);
                            return obj2;
                        } catch (Throwable th) {
                            th = th;
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    ?? r1 = (g050) pinMapKitImageFactory$orderBubblePin$12.L$5;
                    PinV2Component pinV2Component2 = (PinV2Component) pinMapKitImageFactory$orderBubblePin$12.L$4;
                    bVar2 = (b) pinMapKitImageFactory$orderBubblePin$12.L$3;
                    str5 = (String) pinMapKitImageFactory$orderBubblePin$12.L$2;
                    bitmap3 = (Bitmap) pinMapKitImageFactory$orderBubblePin$12.L$1;
                    String str6 = (String) pinMapKitImageFactory$orderBubblePin$12.L$0;
                    kotlin.b.b(obj2);
                    str4 = str6;
                    aVar = r1;
                    pinV2Component = pinV2Component2;
                    try {
                        bVar2.d.getClass();
                        sjh sjhVar = uyj.a;
                        PinMapKitImageFactory$orderBubblePin$$inlined$renderPinV2Content$1 pinMapKitImageFactory$orderBubblePin$$inlined$renderPinV2Content$1 = new PinMapKitImageFactory$orderBubblePin$$inlined$renderPinV2Content$1(pinV2Component, null, this, str5, bitmap3, str4);
                        pinMapKitImageFactory$orderBubblePin$12.L$0 = null;
                        pinMapKitImageFactory$orderBubblePin$12.L$1 = null;
                        pinMapKitImageFactory$orderBubblePin$12.L$2 = null;
                        pinMapKitImageFactory$orderBubblePin$12.L$3 = null;
                        pinMapKitImageFactory$orderBubblePin$12.L$4 = null;
                        pinMapKitImageFactory$orderBubblePin$12.L$5 = aVar;
                        pinMapKitImageFactory$orderBubblePin$12.label = 3;
                        obj2 = tje.k0(sjhVar, pinMapKitImageFactory$orderBubblePin$$inlined$renderPinV2Content$1, pinMapKitImageFactory$orderBubblePin$12);
                        if (obj2 != coroutineSingletons) {
                            g050Var = aVar;
                            g050Var.d(null);
                            return obj2;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        g050Var = aVar;
                        g050Var.d(null);
                        throw th;
                    }
                }
                b bVar3 = (b) pinMapKitImageFactory$orderBubblePin$12.L$3;
                str3 = (String) pinMapKitImageFactory$orderBubblePin$12.L$2;
                Bitmap bitmap4 = (Bitmap) pinMapKitImageFactory$orderBubblePin$12.L$1;
                String str7 = (String) pinMapKitImageFactory$orderBubblePin$12.L$0;
                kotlin.b.b(obj2);
                obj = obj2;
                str4 = str7;
                bVar = bVar3;
                bitmap2 = bitmap4;
                PinV2Component pinV2Component3 = (PinV2Component) obj;
                aVar = bVar.j;
                pinMapKitImageFactory$orderBubblePin$12.L$0 = str4;
                pinMapKitImageFactory$orderBubblePin$12.L$1 = bitmap2;
                pinMapKitImageFactory$orderBubblePin$12.L$2 = str3;
                pinMapKitImageFactory$orderBubblePin$12.L$3 = bVar;
                pinMapKitImageFactory$orderBubblePin$12.L$4 = pinV2Component3;
                pinMapKitImageFactory$orderBubblePin$12.L$5 = aVar;
                pinMapKitImageFactory$orderBubblePin$12.label = 2;
                if (aVar.a(pinMapKitImageFactory$orderBubblePin$12) != coroutineSingletons) {
                    b bVar4 = bVar;
                    bitmap3 = bitmap2;
                    pinV2Component = pinV2Component3;
                    str5 = str3;
                    bVar2 = bVar4;
                    bVar2.d.getClass();
                    sjh sjhVar2 = uyj.a;
                    PinMapKitImageFactory$orderBubblePin$$inlined$renderPinV2Content$1 pinMapKitImageFactory$orderBubblePin$$inlined$renderPinV2Content$12 = new PinMapKitImageFactory$orderBubblePin$$inlined$renderPinV2Content$1(pinV2Component, null, this, str5, bitmap3, str4);
                    pinMapKitImageFactory$orderBubblePin$12.L$0 = null;
                    pinMapKitImageFactory$orderBubblePin$12.L$1 = null;
                    pinMapKitImageFactory$orderBubblePin$12.L$2 = null;
                    pinMapKitImageFactory$orderBubblePin$12.L$3 = null;
                    pinMapKitImageFactory$orderBubblePin$12.L$4 = null;
                    pinMapKitImageFactory$orderBubblePin$12.L$5 = aVar;
                    pinMapKitImageFactory$orderBubblePin$12.label = 3;
                    obj2 = tje.k0(sjhVar2, pinMapKitImageFactory$orderBubblePin$$inlined$renderPinV2Content$12, pinMapKitImageFactory$orderBubblePin$12);
                    if (obj2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        pinMapKitImageFactory$orderBubblePin$1 = new PinMapKitImageFactory$orderBubblePin$1(this, continuationImpl);
        pinMapKitImageFactory$orderBubblePin$12 = pinMapKitImageFactory$orderBubblePin$1;
        Object obj22 = pinMapKitImageFactory$orderBubblePin$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinMapKitImageFactory$orderBubblePin$12.label;
        if (i != 0) {
        }
        PinV2Component pinV2Component32 = (PinV2Component) obj;
        aVar = bVar.j;
        pinMapKitImageFactory$orderBubblePin$12.L$0 = str4;
        pinMapKitImageFactory$orderBubblePin$12.L$1 = bitmap2;
        pinMapKitImageFactory$orderBubblePin$12.L$2 = str3;
        pinMapKitImageFactory$orderBubblePin$12.L$3 = bVar;
        pinMapKitImageFactory$orderBubblePin$12.L$4 = pinV2Component32;
        pinMapKitImageFactory$orderBubblePin$12.L$5 = aVar;
        pinMapKitImageFactory$orderBubblePin$12.label = 2;
        if (aVar.a(pinMapKitImageFactory$orderBubblePin$12) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r1v17, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(sq00 sq00Var, ContinuationImpl continuationImpl) {
        PinMapKitImageFactory$sourcePin$1 pinMapKitImageFactory$sourcePin$1;
        PinMapKitImageFactory$sourcePin$1 pinMapKitImageFactory$sourcePin$12;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        b bVar;
        sq00 sq00Var2;
        ewb0 ewb0Var;
        kotlinx.coroutines.sync.a aVar;
        kotlinx.coroutines.sync.a aVar2;
        sq00 sq00Var3;
        g050 g050Var;
        if (continuationImpl instanceof PinMapKitImageFactory$sourcePin$1) {
            pinMapKitImageFactory$sourcePin$1 = (PinMapKitImageFactory$sourcePin$1) continuationImpl;
            int i2 = pinMapKitImageFactory$sourcePin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pinMapKitImageFactory$sourcePin$1.label = i2 - Integer.MIN_VALUE;
                pinMapKitImageFactory$sourcePin$12 = pinMapKitImageFactory$sourcePin$1;
                Object obj = pinMapKitImageFactory$sourcePin$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pinMapKitImageFactory$sourcePin$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pinMapKitImageFactory$sourcePin$12.L$0 = sq00Var;
                    pinMapKitImageFactory$sourcePin$12.L$1 = this;
                    pinMapKitImageFactory$sourcePin$12.label = 1;
                    a = this.h.a(pinMapKitImageFactory$sourcePin$12);
                    if (a != coroutineSingletons) {
                        bVar = this;
                        sq00Var2 = sq00Var;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) pinMapKitImageFactory$sourcePin$12.L$3;
                        try {
                            kotlin.b.b(obj);
                            g050Var.d(null);
                            return obj;
                        } catch (Throwable th) {
                            th = th;
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    ?? r1 = (g050) pinMapKitImageFactory$sourcePin$12.L$3;
                    ewb0 ewb0Var2 = (ewb0) pinMapKitImageFactory$sourcePin$12.L$2;
                    bVar = (b) pinMapKitImageFactory$sourcePin$12.L$1;
                    sq00Var3 = (sq00) pinMapKitImageFactory$sourcePin$12.L$0;
                    kotlin.b.b(obj);
                    aVar2 = r1;
                    ewb0Var = ewb0Var2;
                    try {
                        bVar.d.getClass();
                        sjh sjhVar = uyj.a;
                        PinMapKitImageFactory$sourcePin$$inlined$renderPinContent$1 pinMapKitImageFactory$sourcePin$$inlined$renderPinContent$1 = new PinMapKitImageFactory$sourcePin$$inlined$renderPinContent$1(ewb0Var, null, this, sq00Var3, sq00Var3);
                        pinMapKitImageFactory$sourcePin$12.L$0 = null;
                        pinMapKitImageFactory$sourcePin$12.L$1 = null;
                        pinMapKitImageFactory$sourcePin$12.L$2 = null;
                        pinMapKitImageFactory$sourcePin$12.L$3 = aVar2;
                        pinMapKitImageFactory$sourcePin$12.label = 3;
                        obj = tje.k0(sjhVar, pinMapKitImageFactory$sourcePin$$inlined$renderPinContent$1, pinMapKitImageFactory$sourcePin$12);
                        if (obj != coroutineSingletons) {
                            g050Var = aVar2;
                            g050Var.d(null);
                            return obj;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        g050Var = aVar2;
                        g050Var.d(null);
                        throw th;
                    }
                }
                b bVar2 = (b) pinMapKitImageFactory$sourcePin$12.L$1;
                sq00 sq00Var4 = (sq00) pinMapKitImageFactory$sourcePin$12.L$0;
                kotlin.b.b(obj);
                a = obj;
                sq00Var2 = sq00Var4;
                bVar = bVar2;
                ewb0Var = (ewb0) a;
                aVar = bVar.j;
                pinMapKitImageFactory$sourcePin$12.L$0 = sq00Var2;
                pinMapKitImageFactory$sourcePin$12.L$1 = bVar;
                pinMapKitImageFactory$sourcePin$12.L$2 = ewb0Var;
                pinMapKitImageFactory$sourcePin$12.L$3 = aVar;
                pinMapKitImageFactory$sourcePin$12.label = 2;
                if (aVar.a(pinMapKitImageFactory$sourcePin$12) != coroutineSingletons) {
                    aVar2 = aVar;
                    sq00Var3 = sq00Var2;
                    bVar.d.getClass();
                    sjh sjhVar2 = uyj.a;
                    PinMapKitImageFactory$sourcePin$$inlined$renderPinContent$1 pinMapKitImageFactory$sourcePin$$inlined$renderPinContent$12 = new PinMapKitImageFactory$sourcePin$$inlined$renderPinContent$1(ewb0Var, null, this, sq00Var3, sq00Var3);
                    pinMapKitImageFactory$sourcePin$12.L$0 = null;
                    pinMapKitImageFactory$sourcePin$12.L$1 = null;
                    pinMapKitImageFactory$sourcePin$12.L$2 = null;
                    pinMapKitImageFactory$sourcePin$12.L$3 = aVar2;
                    pinMapKitImageFactory$sourcePin$12.label = 3;
                    obj = tje.k0(sjhVar2, pinMapKitImageFactory$sourcePin$$inlined$renderPinContent$12, pinMapKitImageFactory$sourcePin$12);
                    if (obj != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        pinMapKitImageFactory$sourcePin$1 = new PinMapKitImageFactory$sourcePin$1(this, continuationImpl);
        pinMapKitImageFactory$sourcePin$12 = pinMapKitImageFactory$sourcePin$1;
        Object obj2 = pinMapKitImageFactory$sourcePin$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pinMapKitImageFactory$sourcePin$12.label;
        if (i != 0) {
        }
        ewb0Var = (ewb0) a;
        aVar = bVar.j;
        pinMapKitImageFactory$sourcePin$12.L$0 = sq00Var2;
        pinMapKitImageFactory$sourcePin$12.L$1 = bVar;
        pinMapKitImageFactory$sourcePin$12.L$2 = ewb0Var;
        pinMapKitImageFactory$sourcePin$12.L$3 = aVar;
        pinMapKitImageFactory$sourcePin$12.label = 2;
        if (aVar.a(pinMapKitImageFactory$sourcePin$12) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
