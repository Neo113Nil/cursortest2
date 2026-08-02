package com.yandex.go.scooters.qr.preview.data.mapper;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import defpackage.c6z;
import defpackage.d8p0;
import defpackage.ero0;
import defpackage.f9s;
import defpackage.fro0;
import defpackage.hro0;
import defpackage.jl40;
import defpackage.krl0;
import defpackage.kyh0;
import defpackage.m7p0;
import defpackage.n7p0;
import defpackage.ny61;
import defpackage.o7p0;
import defpackage.omo0;
import defpackage.pmo0;
import defpackage.qmo0;
import defpackage.r7p0;
import defpackage.rmo0;
import defpackage.tcc;
import defpackage.tmo0;
import defpackage.ukn0;
import defpackage.umo0;
import defpackage.vmo0;
import defpackage.w511;
import defpackage.wmo0;
import defpackage.xmo0;
import defpackage.y0o0;
import defpackage.ymo0;
import defpackage.zmo0;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.data.q;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;
import ru.yandex.taxi.scooters.experiments.ScootersMultiOrderExperiment;
import ru.yandex.taxi.scooters.experiments.g0;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class a {
    public final e a;
    public final ukn0 b;
    public final com.yandex.go.scooters.qr.preview.data.a c;
    public final q d;

    public a(e eVar, ukn0 ukn0Var, com.yandex.go.scooters.qr.preview.data.a aVar, q qVar) {
        this.a = eVar;
        this.b = ukn0Var;
        this.c = aVar;
        this.d = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersPreviewStateMapper$getErrorIconImage$1 scootersPreviewStateMapper$getErrorIconImage$1;
        int i;
        ScootersMultiOrderExperiment.Camera.ScooterPreview scooterPreview;
        ScootersMultiOrderExperiment.Camera.ScooterPreview.b bVar;
        String str;
        if (continuationImpl instanceof ScootersPreviewStateMapper$getErrorIconImage$1) {
            scootersPreviewStateMapper$getErrorIconImage$1 = (ScootersPreviewStateMapper$getErrorIconImage$1) continuationImpl;
            int i2 = scootersPreviewStateMapper$getErrorIconImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPreviewStateMapper$getErrorIconImage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPreviewStateMapper$getErrorIconImage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPreviewStateMapper$getErrorIconImage$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersPreviewStateMapper$getErrorIconImage$1.label = 1;
                    obj = this.d.d(scootersPreviewStateMapper$getErrorIconImage$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    b.b(obj);
                }
                scooterPreview = (ScootersMultiOrderExperiment.Camera.ScooterPreview) obj;
                if (scooterPreview != null || (bVar = scooterPreview.d) == null || (str = bVar.b) == null) {
                    return null;
                }
                scootersPreviewStateMapper$getErrorIconImage$1.L$0 = null;
                scootersPreviewStateMapper$getErrorIconImage$1.label = 2;
                Object f = e.f(this.a, str, null, scootersPreviewStateMapper$getErrorIconImage$1, 6);
                return f == coroutineSingletons ? coroutineSingletons : f;
            }
        }
        scootersPreviewStateMapper$getErrorIconImage$1 = new ScootersPreviewStateMapper$getErrorIconImage$1(this, continuationImpl);
        Object obj2 = scootersPreviewStateMapper$getErrorIconImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPreviewStateMapper$getErrorIconImage$1.label;
        if (i != 0) {
        }
        scooterPreview = (ScootersMultiOrderExperiment.Camera.ScooterPreview) obj2;
        if (scooterPreview != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
    
        if (r7 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ScootersPreviewStateMapper$getSuccessImage$1 scootersPreviewStateMapper$getSuccessImage$1;
        int i;
        ScootersMultiOrderExperiment.Camera.ScooterPreview scooterPreview;
        ScootersMultiOrderExperiment.Camera.ScooterPreview.b bVar;
        String str;
        if (continuationImpl instanceof ScootersPreviewStateMapper$getSuccessImage$1) {
            scootersPreviewStateMapper$getSuccessImage$1 = (ScootersPreviewStateMapper$getSuccessImage$1) continuationImpl;
            int i2 = scootersPreviewStateMapper$getSuccessImage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPreviewStateMapper$getSuccessImage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPreviewStateMapper$getSuccessImage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPreviewStateMapper$getSuccessImage$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersPreviewStateMapper$getSuccessImage$1.label = 1;
                    obj = this.d.d(scootersPreviewStateMapper$getSuccessImage$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return obj;
                    }
                    b.b(obj);
                }
                scooterPreview = (ScootersMultiOrderExperiment.Camera.ScooterPreview) obj;
                if (scooterPreview != null || (bVar = scooterPreview.d) == null || (str = bVar.a) == null) {
                    return null;
                }
                scootersPreviewStateMapper$getSuccessImage$1.L$0 = null;
                scootersPreviewStateMapper$getSuccessImage$1.label = 2;
                Object f = e.f(this.a, str, null, scootersPreviewStateMapper$getSuccessImage$1, 6);
                return f == coroutineSingletons ? coroutineSingletons : f;
            }
        }
        scootersPreviewStateMapper$getSuccessImage$1 = new ScootersPreviewStateMapper$getSuccessImage$1(this, continuationImpl);
        Object obj2 = scootersPreviewStateMapper$getSuccessImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPreviewStateMapper$getSuccessImage$1.label;
        if (i != 0) {
        }
        scooterPreview = (ScootersMultiOrderExperiment.Camera.ScooterPreview) obj2;
        if (scooterPreview != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0132, code lost:
    
        if (r8 == r3) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(r7p0 r7p0Var, o7p0 o7p0Var, int i, ContinuationImpl continuationImpl) {
        ScootersPreviewStateMapper$handleOurScooter$1 scootersPreviewStateMapper$handleOurScooter$1;
        r7p0 r7p0Var2;
        o7p0 o7p0Var2;
        int i2;
        Object b;
        r7p0 r7p0Var3;
        g0 g0Var;
        o7p0 o7p0Var3;
        int i3;
        r7p0 r7p0Var4;
        r7p0 r7p0Var5;
        o7p0 o7p0Var4;
        g0 g0Var2;
        zzs zzsVar;
        int i4;
        Object b2;
        List list;
        r7p0 r7p0Var6;
        o7p0 o7p0Var5;
        krl0 krl0Var;
        CharSequence string;
        krl0 krl0Var2;
        CharSequence string2;
        Object a;
        qmo0 qmo0Var;
        CharSequence charSequence;
        Object b3;
        BitmapDrawable bitmapDrawable;
        CharSequence charSequence2;
        qmo0 qmo0Var2;
        Object b4;
        List list2;
        r7p0 r7p0Var7;
        if (continuationImpl instanceof ScootersPreviewStateMapper$handleOurScooter$1) {
            scootersPreviewStateMapper$handleOurScooter$1 = (ScootersPreviewStateMapper$handleOurScooter$1) continuationImpl;
            int i5 = scootersPreviewStateMapper$handleOurScooter$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                scootersPreviewStateMapper$handleOurScooter$1.label = i5 - Integer.MIN_VALUE;
                Object obj = scootersPreviewStateMapper$handleOurScooter$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (scootersPreviewStateMapper$handleOurScooter$1.label) {
                    case 0:
                        b.b(obj);
                        r7p0Var2 = r7p0Var;
                        scootersPreviewStateMapper$handleOurScooter$1.L$0 = r7p0Var2;
                        o7p0Var2 = o7p0Var;
                        scootersPreviewStateMapper$handleOurScooter$1.L$1 = o7p0Var2;
                        i2 = i;
                        scootersPreviewStateMapper$handleOurScooter$1.I$0 = i2;
                        scootersPreviewStateMapper$handleOurScooter$1.label = 1;
                        b = this.b.a.b(scootersPreviewStateMapper$handleOurScooter$1);
                        break;
                    case 1:
                        int i6 = scootersPreviewStateMapper$handleOurScooter$1.I$0;
                        o7p0 o7p0Var6 = (o7p0) scootersPreviewStateMapper$handleOurScooter$1.L$1;
                        r7p0 r7p0Var8 = (r7p0) scootersPreviewStateMapper$handleOurScooter$1.L$0;
                        b.b(obj);
                        b = obj;
                        r7p0Var2 = r7p0Var8;
                        i2 = i6;
                        o7p0Var2 = o7p0Var6;
                        g0 g0Var3 = (g0) b;
                        if (o7p0Var2 instanceof m7p0) {
                            zzs zzsVar2 = ((m7p0) o7p0Var2).a;
                            scootersPreviewStateMapper$handleOurScooter$1.L$0 = null;
                            scootersPreviewStateMapper$handleOurScooter$1.L$1 = o7p0Var2;
                            scootersPreviewStateMapper$handleOurScooter$1.L$2 = g0Var3;
                            scootersPreviewStateMapper$handleOurScooter$1.L$3 = r7p0Var2;
                            scootersPreviewStateMapper$handleOurScooter$1.L$4 = zzsVar2;
                            scootersPreviewStateMapper$handleOurScooter$1.I$0 = i2;
                            scootersPreviewStateMapper$handleOurScooter$1.label = 2;
                            Object g = g(i2, scootersPreviewStateMapper$handleOurScooter$1);
                            if (g != obj2) {
                                int i7 = i2;
                                r7p0Var5 = r7p0Var2;
                                obj = g;
                                o7p0Var4 = o7p0Var2;
                                g0Var2 = g0Var3;
                                zzsVar = zzsVar2;
                                i4 = i7;
                                List list3 = (List) obj;
                                scootersPreviewStateMapper$handleOurScooter$1.L$0 = null;
                                scootersPreviewStateMapper$handleOurScooter$1.L$1 = o7p0Var4;
                                scootersPreviewStateMapper$handleOurScooter$1.L$2 = g0Var2;
                                scootersPreviewStateMapper$handleOurScooter$1.L$3 = r7p0Var5;
                                scootersPreviewStateMapper$handleOurScooter$1.L$4 = zzsVar;
                                scootersPreviewStateMapper$handleOurScooter$1.L$5 = list3;
                                scootersPreviewStateMapper$handleOurScooter$1.I$0 = i4;
                                scootersPreviewStateMapper$handleOurScooter$1.label = 3;
                                b2 = b(scootersPreviewStateMapper$handleOurScooter$1);
                                if (b2 != obj2) {
                                    list = list3;
                                    r7p0Var6 = r7p0Var5;
                                    o7p0Var5 = o7p0Var4;
                                    obj = b2;
                                    ScootersCardV2 scootersCardV2 = g0Var2.k;
                                    ScootersCardV2.ChargeConfig chargeConfig = scootersCardV2.b;
                                    return new xmo0(r7p0Var6, list, (BitmapDrawable) obj, chargeConfig, chargeConfig.a, scootersCardV2.a, ((m7p0) o7p0Var5).b);
                                }
                            }
                        } else if (o7p0Var2 instanceof n7p0) {
                            y0o0 y0o0Var = ((n7p0) o7p0Var2).c;
                            scootersPreviewStateMapper$handleOurScooter$1.L$0 = r7p0Var2;
                            scootersPreviewStateMapper$handleOurScooter$1.L$1 = o7p0Var2;
                            scootersPreviewStateMapper$handleOurScooter$1.L$2 = null;
                            scootersPreviewStateMapper$handleOurScooter$1.I$0 = i2;
                            scootersPreviewStateMapper$handleOurScooter$1.label = 4;
                            Object e = e(y0o0Var, scootersPreviewStateMapper$handleOurScooter$1);
                            if (e != obj2) {
                                int i8 = i2;
                                o7p0Var3 = o7p0Var2;
                                i3 = i8;
                                r7p0Var4 = r7p0Var2;
                                obj = e;
                                qmo0 qmo0Var3 = (qmo0) obj;
                                n7p0 n7p0Var = (n7p0) o7p0Var3;
                                krl0Var = n7p0Var.b;
                                e eVar = this.a;
                                if (krl0Var != null || (string = (CharSequence) krl0Var.a) == null) {
                                    string = eVar.a.getString(kyh0.scooters_preview_error_title);
                                }
                                krl0Var2 = n7p0Var.b;
                                if (krl0Var2 != null || (string2 = (CharSequence) krl0Var2.b) == null) {
                                    string2 = eVar.a.getString(kyh0.scooters_preview_error_unknown);
                                }
                                scootersPreviewStateMapper$handleOurScooter$1.L$0 = r7p0Var4;
                                scootersPreviewStateMapper$handleOurScooter$1.L$1 = null;
                                scootersPreviewStateMapper$handleOurScooter$1.L$2 = null;
                                scootersPreviewStateMapper$handleOurScooter$1.L$3 = qmo0Var3;
                                scootersPreviewStateMapper$handleOurScooter$1.L$4 = string;
                                scootersPreviewStateMapper$handleOurScooter$1.L$5 = string2;
                                scootersPreviewStateMapper$handleOurScooter$1.I$0 = i3;
                                scootersPreviewStateMapper$handleOurScooter$1.label = 5;
                                a = a(scootersPreviewStateMapper$handleOurScooter$1);
                                if (a != obj2) {
                                    qmo0Var = qmo0Var3;
                                    obj = a;
                                    CharSequence charSequence3 = string;
                                    int i9 = i3;
                                    charSequence = charSequence3;
                                    BitmapDrawable bitmapDrawable2 = (BitmapDrawable) obj;
                                    boolean z = qmo0Var != null;
                                    scootersPreviewStateMapper$handleOurScooter$1.L$0 = r7p0Var4;
                                    scootersPreviewStateMapper$handleOurScooter$1.L$1 = null;
                                    scootersPreviewStateMapper$handleOurScooter$1.L$2 = null;
                                    scootersPreviewStateMapper$handleOurScooter$1.L$3 = qmo0Var;
                                    scootersPreviewStateMapper$handleOurScooter$1.L$4 = charSequence;
                                    scootersPreviewStateMapper$handleOurScooter$1.L$5 = string2;
                                    scootersPreviewStateMapper$handleOurScooter$1.L$6 = bitmapDrawable2;
                                    scootersPreviewStateMapper$handleOurScooter$1.I$0 = i9;
                                    scootersPreviewStateMapper$handleOurScooter$1.label = 6;
                                    b3 = this.c.b(z, scootersPreviewStateMapper$handleOurScooter$1);
                                    if (b3 != obj2) {
                                        bitmapDrawable = bitmapDrawable2;
                                        charSequence2 = string2;
                                        qmo0Var2 = qmo0Var;
                                        obj = b3;
                                        return new pmo0(charSequence, charSequence2, bitmapDrawable, (Drawable) obj, qmo0Var2);
                                    }
                                }
                            }
                        } else {
                            if (o7p0Var2 != null) {
                                w511.b();
                                return null;
                            }
                            scootersPreviewStateMapper$handleOurScooter$1.L$0 = null;
                            scootersPreviewStateMapper$handleOurScooter$1.L$1 = null;
                            scootersPreviewStateMapper$handleOurScooter$1.L$2 = g0Var3;
                            scootersPreviewStateMapper$handleOurScooter$1.L$3 = r7p0Var2;
                            scootersPreviewStateMapper$handleOurScooter$1.I$0 = i2;
                            scootersPreviewStateMapper$handleOurScooter$1.label = 7;
                            Object g2 = g(i2, scootersPreviewStateMapper$handleOurScooter$1);
                            if (g2 != obj2) {
                                r7p0Var3 = r7p0Var2;
                                obj = g2;
                                g0Var = g0Var3;
                                List list4 = (List) obj;
                                scootersPreviewStateMapper$handleOurScooter$1.L$0 = null;
                                scootersPreviewStateMapper$handleOurScooter$1.L$1 = null;
                                scootersPreviewStateMapper$handleOurScooter$1.L$2 = g0Var;
                                scootersPreviewStateMapper$handleOurScooter$1.L$3 = r7p0Var3;
                                scootersPreviewStateMapper$handleOurScooter$1.L$4 = list4;
                                scootersPreviewStateMapper$handleOurScooter$1.I$0 = i2;
                                scootersPreviewStateMapper$handleOurScooter$1.label = 8;
                                b4 = b(scootersPreviewStateMapper$handleOurScooter$1);
                                if (b4 != obj2) {
                                    list2 = list4;
                                    r7p0Var7 = r7p0Var3;
                                    obj = b4;
                                    ScootersCardV2 scootersCardV22 = g0Var.k;
                                    ScootersCardV2.ChargeConfig chargeConfig2 = scootersCardV22.b;
                                    return new xmo0(r7p0Var7, list2, (BitmapDrawable) obj, chargeConfig2, chargeConfig2.a, scootersCardV22.a, null);
                                }
                            }
                        }
                        return obj2;
                    case 2:
                        int i10 = scootersPreviewStateMapper$handleOurScooter$1.I$0;
                        zzs zzsVar3 = (zzs) scootersPreviewStateMapper$handleOurScooter$1.L$4;
                        r7p0Var5 = (r7p0) scootersPreviewStateMapper$handleOurScooter$1.L$3;
                        g0 g0Var4 = (g0) scootersPreviewStateMapper$handleOurScooter$1.L$2;
                        o7p0Var4 = (o7p0) scootersPreviewStateMapper$handleOurScooter$1.L$1;
                        b.b(obj);
                        i4 = i10;
                        g0Var2 = g0Var4;
                        zzsVar = zzsVar3;
                        List list32 = (List) obj;
                        scootersPreviewStateMapper$handleOurScooter$1.L$0 = null;
                        scootersPreviewStateMapper$handleOurScooter$1.L$1 = o7p0Var4;
                        scootersPreviewStateMapper$handleOurScooter$1.L$2 = g0Var2;
                        scootersPreviewStateMapper$handleOurScooter$1.L$3 = r7p0Var5;
                        scootersPreviewStateMapper$handleOurScooter$1.L$4 = zzsVar;
                        scootersPreviewStateMapper$handleOurScooter$1.L$5 = list32;
                        scootersPreviewStateMapper$handleOurScooter$1.I$0 = i4;
                        scootersPreviewStateMapper$handleOurScooter$1.label = 3;
                        b2 = b(scootersPreviewStateMapper$handleOurScooter$1);
                        if (b2 != obj2) {
                        }
                        return obj2;
                    case 3:
                        List list5 = (List) scootersPreviewStateMapper$handleOurScooter$1.L$5;
                        r7p0 r7p0Var9 = (r7p0) scootersPreviewStateMapper$handleOurScooter$1.L$3;
                        g0Var2 = (g0) scootersPreviewStateMapper$handleOurScooter$1.L$2;
                        o7p0Var5 = (o7p0) scootersPreviewStateMapper$handleOurScooter$1.L$1;
                        b.b(obj);
                        list = list5;
                        r7p0Var6 = r7p0Var9;
                        ScootersCardV2 scootersCardV23 = g0Var2.k;
                        ScootersCardV2.ChargeConfig chargeConfig3 = scootersCardV23.b;
                        return new xmo0(r7p0Var6, list, (BitmapDrawable) obj, chargeConfig3, chargeConfig3.a, scootersCardV23.a, ((m7p0) o7p0Var5).b);
                    case 4:
                        i3 = scootersPreviewStateMapper$handleOurScooter$1.I$0;
                        o7p0Var3 = (o7p0) scootersPreviewStateMapper$handleOurScooter$1.L$1;
                        r7p0 r7p0Var10 = (r7p0) scootersPreviewStateMapper$handleOurScooter$1.L$0;
                        b.b(obj);
                        r7p0Var4 = r7p0Var10;
                        qmo0 qmo0Var32 = (qmo0) obj;
                        n7p0 n7p0Var2 = (n7p0) o7p0Var3;
                        krl0Var = n7p0Var2.b;
                        e eVar2 = this.a;
                        if (krl0Var != null) {
                            break;
                        }
                        string = eVar2.a.getString(kyh0.scooters_preview_error_title);
                        krl0Var2 = n7p0Var2.b;
                        if (krl0Var2 != null) {
                            break;
                        }
                        string2 = eVar2.a.getString(kyh0.scooters_preview_error_unknown);
                        scootersPreviewStateMapper$handleOurScooter$1.L$0 = r7p0Var4;
                        scootersPreviewStateMapper$handleOurScooter$1.L$1 = null;
                        scootersPreviewStateMapper$handleOurScooter$1.L$2 = null;
                        scootersPreviewStateMapper$handleOurScooter$1.L$3 = qmo0Var32;
                        scootersPreviewStateMapper$handleOurScooter$1.L$4 = string;
                        scootersPreviewStateMapper$handleOurScooter$1.L$5 = string2;
                        scootersPreviewStateMapper$handleOurScooter$1.I$0 = i3;
                        scootersPreviewStateMapper$handleOurScooter$1.label = 5;
                        a = a(scootersPreviewStateMapper$handleOurScooter$1);
                        if (a != obj2) {
                        }
                        return obj2;
                    case 5:
                        i3 = scootersPreviewStateMapper$handleOurScooter$1.I$0;
                        string2 = (CharSequence) scootersPreviewStateMapper$handleOurScooter$1.L$5;
                        string = (CharSequence) scootersPreviewStateMapper$handleOurScooter$1.L$4;
                        qmo0Var = (qmo0) scootersPreviewStateMapper$handleOurScooter$1.L$3;
                        r7p0Var4 = (r7p0) scootersPreviewStateMapper$handleOurScooter$1.L$0;
                        b.b(obj);
                        CharSequence charSequence32 = string;
                        int i92 = i3;
                        charSequence = charSequence32;
                        BitmapDrawable bitmapDrawable22 = (BitmapDrawable) obj;
                        if (qmo0Var != null) {
                        }
                        scootersPreviewStateMapper$handleOurScooter$1.L$0 = r7p0Var4;
                        scootersPreviewStateMapper$handleOurScooter$1.L$1 = null;
                        scootersPreviewStateMapper$handleOurScooter$1.L$2 = null;
                        scootersPreviewStateMapper$handleOurScooter$1.L$3 = qmo0Var;
                        scootersPreviewStateMapper$handleOurScooter$1.L$4 = charSequence;
                        scootersPreviewStateMapper$handleOurScooter$1.L$5 = string2;
                        scootersPreviewStateMapper$handleOurScooter$1.L$6 = bitmapDrawable22;
                        scootersPreviewStateMapper$handleOurScooter$1.I$0 = i92;
                        scootersPreviewStateMapper$handleOurScooter$1.label = 6;
                        b3 = this.c.b(z, scootersPreviewStateMapper$handleOurScooter$1);
                        if (b3 != obj2) {
                        }
                        return obj2;
                    case 6:
                        BitmapDrawable bitmapDrawable3 = (BitmapDrawable) scootersPreviewStateMapper$handleOurScooter$1.L$6;
                        CharSequence charSequence4 = (CharSequence) scootersPreviewStateMapper$handleOurScooter$1.L$5;
                        charSequence = (CharSequence) scootersPreviewStateMapper$handleOurScooter$1.L$4;
                        qmo0 qmo0Var4 = (qmo0) scootersPreviewStateMapper$handleOurScooter$1.L$3;
                        b.b(obj);
                        bitmapDrawable = bitmapDrawable3;
                        charSequence2 = charSequence4;
                        qmo0Var2 = qmo0Var4;
                        return new pmo0(charSequence, charSequence2, bitmapDrawable, (Drawable) obj, qmo0Var2);
                    case 7:
                        int i11 = scootersPreviewStateMapper$handleOurScooter$1.I$0;
                        r7p0Var3 = (r7p0) scootersPreviewStateMapper$handleOurScooter$1.L$3;
                        g0 g0Var5 = (g0) scootersPreviewStateMapper$handleOurScooter$1.L$2;
                        b.b(obj);
                        i2 = i11;
                        g0Var = g0Var5;
                        List list42 = (List) obj;
                        scootersPreviewStateMapper$handleOurScooter$1.L$0 = null;
                        scootersPreviewStateMapper$handleOurScooter$1.L$1 = null;
                        scootersPreviewStateMapper$handleOurScooter$1.L$2 = g0Var;
                        scootersPreviewStateMapper$handleOurScooter$1.L$3 = r7p0Var3;
                        scootersPreviewStateMapper$handleOurScooter$1.L$4 = list42;
                        scootersPreviewStateMapper$handleOurScooter$1.I$0 = i2;
                        scootersPreviewStateMapper$handleOurScooter$1.label = 8;
                        b4 = b(scootersPreviewStateMapper$handleOurScooter$1);
                        if (b4 != obj2) {
                        }
                        return obj2;
                    case 8:
                        List list6 = (List) scootersPreviewStateMapper$handleOurScooter$1.L$4;
                        r7p0 r7p0Var11 = (r7p0) scootersPreviewStateMapper$handleOurScooter$1.L$3;
                        g0Var = (g0) scootersPreviewStateMapper$handleOurScooter$1.L$2;
                        b.b(obj);
                        list2 = list6;
                        r7p0Var7 = r7p0Var11;
                        ScootersCardV2 scootersCardV222 = g0Var.k;
                        ScootersCardV2.ChargeConfig chargeConfig22 = scootersCardV222.b;
                        return new xmo0(r7p0Var7, list2, (BitmapDrawable) obj, chargeConfig22, chargeConfig22.a, scootersCardV222.a, null);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        scootersPreviewStateMapper$handleOurScooter$1 = new ScootersPreviewStateMapper$handleOurScooter$1(this, continuationImpl);
        Object obj3 = scootersPreviewStateMapper$handleOurScooter$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (scootersPreviewStateMapper$handleOurScooter$1.label) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(FormattedText formattedText, ContinuationImpl continuationImpl) {
        ScootersPreviewStateMapper$mapButtonText$1 scootersPreviewStateMapper$mapButtonText$1;
        int i;
        e eVar;
        if (continuationImpl instanceof ScootersPreviewStateMapper$mapButtonText$1) {
            scootersPreviewStateMapper$mapButtonText$1 = (ScootersPreviewStateMapper$mapButtonText$1) continuationImpl;
            int i2 = scootersPreviewStateMapper$mapButtonText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPreviewStateMapper$mapButtonText$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPreviewStateMapper$mapButtonText$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPreviewStateMapper$mapButtonText$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersPreviewStateMapper$mapButtonText$1.L$0 = null;
                    e eVar2 = this.a;
                    scootersPreviewStateMapper$mapButtonText$1.L$1 = eVar2;
                    scootersPreviewStateMapper$mapButtonText$1.L$2 = formattedText;
                    scootersPreviewStateMapper$mapButtonText$1.label = 1;
                    Object b = this.d.a.b(scootersPreviewStateMapper$mapButtonText$1);
                    if (b != coroutineSingletons) {
                        obj = b;
                        eVar = eVar2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return obj;
                }
                formattedText = (FormattedText) scootersPreviewStateMapper$mapButtonText$1.L$2;
                eVar = (e) scootersPreviewStateMapper$mapButtonText$1.L$1;
                b.b(obj);
                FormattedText e = f9s.e(formattedText, (c6z) obj);
                scootersPreviewStateMapper$mapButtonText$1.L$0 = null;
                scootersPreviewStateMapper$mapButtonText$1.L$1 = null;
                scootersPreviewStateMapper$mapButtonText$1.L$2 = null;
                scootersPreviewStateMapper$mapButtonText$1.label = 2;
                Object t = eVar.t(e, scootersPreviewStateMapper$mapButtonText$1);
                return t != coroutineSingletons ? coroutineSingletons : t;
            }
        }
        scootersPreviewStateMapper$mapButtonText$1 = new ScootersPreviewStateMapper$mapButtonText$1(this, continuationImpl);
        Object obj2 = scootersPreviewStateMapper$mapButtonText$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPreviewStateMapper$mapButtonText$1.label;
        if (i != 0) {
        }
        FormattedText e2 = f9s.e(formattedText, (c6z) obj2);
        scootersPreviewStateMapper$mapButtonText$1.L$0 = null;
        scootersPreviewStateMapper$mapButtonText$1.L$1 = null;
        scootersPreviewStateMapper$mapButtonText$1.L$2 = null;
        scootersPreviewStateMapper$mapButtonText$1.label = 2;
        Object t2 = eVar.t(e2, scootersPreviewStateMapper$mapButtonText$1);
        if (t2 != coroutineSingletons2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0054, code lost:
    
        if (ru.yandex.taxi.widget.utils.e.f(r9, r11, null, r0, 6) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(y0o0 y0o0Var, ContinuationImpl continuationImpl) {
        ScootersPreviewStateMapper$mapNearestScooterItem$1 scootersPreviewStateMapper$mapNearestScooterItem$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        e eVar;
        r7p0 r7p0Var;
        String str;
        Object f;
        r7p0 r7p0Var2;
        if (continuationImpl instanceof ScootersPreviewStateMapper$mapNearestScooterItem$1) {
            scootersPreviewStateMapper$mapNearestScooterItem$1 = (ScootersPreviewStateMapper$mapNearestScooterItem$1) continuationImpl;
            int i2 = scootersPreviewStateMapper$mapNearestScooterItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPreviewStateMapper$mapNearestScooterItem$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPreviewStateMapper$mapNearestScooterItem$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPreviewStateMapper$mapNearestScooterItem$1.label;
                eVar = this.a;
                BitmapDrawable bitmapDrawable = null;
                if (i != 0) {
                    b.b(obj);
                    if (y0o0Var == null) {
                        return null;
                    }
                    String str2 = y0o0Var.c;
                    scootersPreviewStateMapper$mapNearestScooterItem$1.L$0 = y0o0Var;
                    scootersPreviewStateMapper$mapNearestScooterItem$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r7p0Var2 = (r7p0) scootersPreviewStateMapper$mapNearestScooterItem$1.L$1;
                        y0o0Var = (y0o0) scootersPreviewStateMapper$mapNearestScooterItem$1.L$0;
                        b.b(obj);
                        bitmapDrawable = (BitmapDrawable) obj;
                        r7p0Var = r7p0Var2;
                        return new qmo0(r7p0Var, bitmapDrawable, y0o0Var.d);
                    }
                    y0o0Var = (y0o0) scootersPreviewStateMapper$mapNearestScooterItem$1.L$0;
                    b.b(obj);
                }
                String str3 = y0o0Var.a;
                str = y0o0Var.c;
                r7p0Var = new r7p0(d8p0.a, str3);
                if (str != null && str.length() != 0) {
                    scootersPreviewStateMapper$mapNearestScooterItem$1.L$0 = y0o0Var;
                    scootersPreviewStateMapper$mapNearestScooterItem$1.L$1 = r7p0Var;
                    scootersPreviewStateMapper$mapNearestScooterItem$1.label = 2;
                    f = e.f(eVar, str, null, scootersPreviewStateMapper$mapNearestScooterItem$1, 6);
                    if (f != coroutineSingletons) {
                        obj = f;
                        r7p0Var2 = r7p0Var;
                        bitmapDrawable = (BitmapDrawable) obj;
                        r7p0Var = r7p0Var2;
                    }
                    return coroutineSingletons;
                }
                return new qmo0(r7p0Var, bitmapDrawable, y0o0Var.d);
            }
        }
        scootersPreviewStateMapper$mapNearestScooterItem$1 = new ScootersPreviewStateMapper$mapNearestScooterItem$1(this, continuationImpl);
        Object obj2 = scootersPreviewStateMapper$mapNearestScooterItem$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPreviewStateMapper$mapNearestScooterItem$1.label;
        eVar = this.a;
        BitmapDrawable bitmapDrawable2 = null;
        if (i != 0) {
        }
        String str32 = y0o0Var.a;
        str = y0o0Var.c;
        r7p0Var = new r7p0(d8p0.a, str32);
        if (str != null) {
            scootersPreviewStateMapper$mapNearestScooterItem$1.L$0 = y0o0Var;
            scootersPreviewStateMapper$mapNearestScooterItem$1.L$1 = r7p0Var;
            scootersPreviewStateMapper$mapNearestScooterItem$1.label = 2;
            f = e.f(eVar, str, null, scootersPreviewStateMapper$mapNearestScooterItem$1, 6);
            if (f != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        return new qmo0(r7p0Var, bitmapDrawable2, y0o0Var.d);
    }

    public final Object f(hro0 hro0Var, int i, o7p0 o7p0Var, Continuation continuation) {
        if (hro0Var instanceof ero0) {
            return c(((ero0) hro0Var).a, o7p0Var, i, (ContinuationImpl) continuation);
        }
        if (jl40.l(hro0Var, fro0.a)) {
            Object h = h(o7p0Var, (ContinuationImpl) continuation);
            return h == CoroutineSingletons.COROUTINE_SUSPENDED ? h : (ymo0) h;
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0133, code lost:
    
        if (r12 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0095, code lost:
    
        if (r12 == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ed -> B:19:0x00ee). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i, ContinuationImpl continuationImpl) {
        ScootersPreviewStateMapper$prepareActions$1 scootersPreviewStateMapper$prepareActions$1;
        int i2;
        ScootersMultiOrderExperiment.Camera.ScooterPreview scooterPreview;
        Collection arrayList;
        Iterator it;
        Collection collection;
        wmo0 umo0Var;
        if (continuationImpl instanceof ScootersPreviewStateMapper$prepareActions$1) {
            scootersPreviewStateMapper$prepareActions$1 = (ScootersPreviewStateMapper$prepareActions$1) continuationImpl;
            int i3 = scootersPreviewStateMapper$prepareActions$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersPreviewStateMapper$prepareActions$1.label = i3 - Integer.MIN_VALUE;
                Object obj = scootersPreviewStateMapper$prepareActions$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = scootersPreviewStateMapper$prepareActions$1.label;
                if (i2 != 0) {
                    b.b(obj);
                    scootersPreviewStateMapper$prepareActions$1.I$0 = i;
                    scootersPreviewStateMapper$prepareActions$1.label = 1;
                    obj = this.d.d(scootersPreviewStateMapper$prepareActions$1);
                } else if (i2 == 1) {
                    i = scootersPreviewStateMapper$prepareActions$1.I$0;
                    b.b(obj);
                } else if (i2 == 2) {
                    i = scootersPreviewStateMapper$prepareActions$1.I$0;
                    arrayList = (Collection) scootersPreviewStateMapper$prepareActions$1.L$7;
                    it = (Iterator) scootersPreviewStateMapper$prepareActions$1.L$4;
                    collection = (Collection) scootersPreviewStateMapper$prepareActions$1.L$3;
                    b.b(obj);
                    umo0Var = new umo0((CharSequence) obj);
                    arrayList.add(umo0Var);
                    arrayList = collection;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        return Collections.singletonList(new umo0((CharSequence) obj));
                    }
                    i = scootersPreviewStateMapper$prepareActions$1.I$0;
                    arrayList = (Collection) scootersPreviewStateMapper$prepareActions$1.L$7;
                    it = (Iterator) scootersPreviewStateMapper$prepareActions$1.L$4;
                    collection = (Collection) scootersPreviewStateMapper$prepareActions$1.L$3;
                    b.b(obj);
                    umo0Var = new vmo0((CharSequence) obj);
                    arrayList.add(umo0Var);
                    arrayList = collection;
                    if (it.hasNext()) {
                        ScootersMultiOrderExperiment.Camera.ScooterPreview.a aVar = (ScootersMultiOrderExperiment.Camera.ScooterPreview.a) it.next();
                        ScootersMultiOrderExperiment.Camera.ScooterPreview.ButtonType buttonType = aVar.a;
                        FormattedText formattedText = aVar.c;
                        int i4 = zmo0.a[buttonType.ordinal()];
                        if (i4 == 1) {
                            scootersPreviewStateMapper$prepareActions$1.L$0 = null;
                            scootersPreviewStateMapper$prepareActions$1.L$1 = null;
                            scootersPreviewStateMapper$prepareActions$1.L$2 = null;
                            scootersPreviewStateMapper$prepareActions$1.L$3 = arrayList;
                            scootersPreviewStateMapper$prepareActions$1.L$4 = it;
                            scootersPreviewStateMapper$prepareActions$1.L$5 = null;
                            scootersPreviewStateMapper$prepareActions$1.L$6 = null;
                            scootersPreviewStateMapper$prepareActions$1.L$7 = arrayList;
                            scootersPreviewStateMapper$prepareActions$1.I$0 = i;
                            scootersPreviewStateMapper$prepareActions$1.label = 2;
                            Object d = d(formattedText, scootersPreviewStateMapper$prepareActions$1);
                            if (d != obj2) {
                                collection = arrayList;
                                umo0Var = new umo0((CharSequence) d);
                                arrayList.add(umo0Var);
                                arrayList = collection;
                                if (it.hasNext()) {
                                    return (List) arrayList;
                                }
                            }
                        } else {
                            if (i4 != 2) {
                                w511.b();
                                return null;
                            }
                            scootersPreviewStateMapper$prepareActions$1.L$0 = null;
                            scootersPreviewStateMapper$prepareActions$1.L$1 = null;
                            scootersPreviewStateMapper$prepareActions$1.L$2 = null;
                            scootersPreviewStateMapper$prepareActions$1.L$3 = arrayList;
                            scootersPreviewStateMapper$prepareActions$1.L$4 = it;
                            scootersPreviewStateMapper$prepareActions$1.L$5 = null;
                            scootersPreviewStateMapper$prepareActions$1.L$6 = null;
                            scootersPreviewStateMapper$prepareActions$1.L$7 = arrayList;
                            scootersPreviewStateMapper$prepareActions$1.I$0 = i;
                            scootersPreviewStateMapper$prepareActions$1.label = 3;
                            obj = d(formattedText, scootersPreviewStateMapper$prepareActions$1);
                            if (obj != obj2) {
                                collection = arrayList;
                                umo0Var = new vmo0((CharSequence) obj);
                                arrayList.add(umo0Var);
                                arrayList = collection;
                                if (it.hasNext()) {
                                }
                            }
                        }
                        return obj2;
                    }
                }
                scooterPreview = (ScootersMultiOrderExperiment.Camera.ScooterPreview) obj;
                if (scooterPreview != null) {
                    return EmptyList.a;
                }
                if (i == 1) {
                    List list = scooterPreview.b;
                    arrayList = new ArrayList(tcc.n(list, 10));
                    it = list.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    FormattedText formattedText2 = scooterPreview.c.c;
                    scootersPreviewStateMapper$prepareActions$1.L$0 = null;
                    scootersPreviewStateMapper$prepareActions$1.I$0 = i;
                    scootersPreviewStateMapper$prepareActions$1.label = 4;
                    obj = d(formattedText2, scootersPreviewStateMapper$prepareActions$1);
                }
            }
        }
        scootersPreviewStateMapper$prepareActions$1 = new ScootersPreviewStateMapper$prepareActions$1(this, continuationImpl);
        Object obj3 = scootersPreviewStateMapper$prepareActions$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = scootersPreviewStateMapper$prepareActions$1.label;
        if (i2 != 0) {
        }
        scooterPreview = (ScootersMultiOrderExperiment.Camera.ScooterPreview) obj3;
        if (scooterPreview != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0091, code lost:
    
        if (r13 == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(o7p0 o7p0Var, ContinuationImpl continuationImpl) {
        ScootersPreviewStateMapper$prepareAlienScooter$1 scootersPreviewStateMapper$prepareAlienScooter$1;
        Object obj;
        int i;
        n7p0 n7p0Var;
        CharSequence string;
        CharSequence string2;
        Object a;
        qmo0 qmo0Var;
        CharSequence charSequence;
        krl0 krl0Var;
        krl0 krl0Var2;
        Object b;
        BitmapDrawable bitmapDrawable;
        CharSequence charSequence2;
        qmo0 qmo0Var2;
        if (continuationImpl instanceof ScootersPreviewStateMapper$prepareAlienScooter$1) {
            scootersPreviewStateMapper$prepareAlienScooter$1 = (ScootersPreviewStateMapper$prepareAlienScooter$1) continuationImpl;
            int i2 = scootersPreviewStateMapper$prepareAlienScooter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPreviewStateMapper$prepareAlienScooter$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersPreviewStateMapper$prepareAlienScooter$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPreviewStateMapper$prepareAlienScooter$1.label;
                if (i != 0) {
                    b.b(obj2);
                    n7p0Var = o7p0Var instanceof n7p0 ? (n7p0) o7p0Var : null;
                    y0o0 y0o0Var = n7p0Var != null ? n7p0Var.c : null;
                    scootersPreviewStateMapper$prepareAlienScooter$1.L$0 = null;
                    scootersPreviewStateMapper$prepareAlienScooter$1.L$1 = n7p0Var;
                    scootersPreviewStateMapper$prepareAlienScooter$1.label = 1;
                    obj2 = e(y0o0Var, scootersPreviewStateMapper$prepareAlienScooter$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            BitmapDrawable bitmapDrawable2 = (BitmapDrawable) scootersPreviewStateMapper$prepareAlienScooter$1.L$5;
                            string2 = (CharSequence) scootersPreviewStateMapper$prepareAlienScooter$1.L$4;
                            CharSequence charSequence3 = (CharSequence) scootersPreviewStateMapper$prepareAlienScooter$1.L$3;
                            qmo0 qmo0Var3 = (qmo0) scootersPreviewStateMapper$prepareAlienScooter$1.L$2;
                            b.b(obj2);
                            bitmapDrawable = bitmapDrawable2;
                            charSequence2 = charSequence3;
                            qmo0Var2 = qmo0Var3;
                            return new omo0(charSequence2, string2, bitmapDrawable, (Drawable) obj2, qmo0Var2);
                        }
                        string2 = (CharSequence) scootersPreviewStateMapper$prepareAlienScooter$1.L$4;
                        charSequence = (CharSequence) scootersPreviewStateMapper$prepareAlienScooter$1.L$3;
                        qmo0Var = (qmo0) scootersPreviewStateMapper$prepareAlienScooter$1.L$2;
                        b.b(obj2);
                        BitmapDrawable bitmapDrawable3 = (BitmapDrawable) obj2;
                        boolean z = qmo0Var != null;
                        scootersPreviewStateMapper$prepareAlienScooter$1.L$0 = null;
                        scootersPreviewStateMapper$prepareAlienScooter$1.L$1 = null;
                        scootersPreviewStateMapper$prepareAlienScooter$1.L$2 = qmo0Var;
                        scootersPreviewStateMapper$prepareAlienScooter$1.L$3 = charSequence;
                        scootersPreviewStateMapper$prepareAlienScooter$1.L$4 = string2;
                        scootersPreviewStateMapper$prepareAlienScooter$1.L$5 = bitmapDrawable3;
                        scootersPreviewStateMapper$prepareAlienScooter$1.label = 3;
                        b = this.c.b(z, scootersPreviewStateMapper$prepareAlienScooter$1);
                        if (b != obj) {
                            bitmapDrawable = bitmapDrawable3;
                            charSequence2 = charSequence;
                            qmo0Var2 = qmo0Var;
                            obj2 = b;
                            return new omo0(charSequence2, string2, bitmapDrawable, (Drawable) obj2, qmo0Var2);
                        }
                        return obj;
                    }
                    n7p0Var = (n7p0) scootersPreviewStateMapper$prepareAlienScooter$1.L$1;
                    b.b(obj2);
                }
                qmo0 qmo0Var4 = (qmo0) obj2;
                e eVar = this.a;
                if (n7p0Var != null || (krl0Var2 = n7p0Var.b) == null || (string = (CharSequence) krl0Var2.a) == null) {
                    string = eVar.a.getString(kyh0.scooters_preview_error_title);
                }
                if (n7p0Var != null || (krl0Var = n7p0Var.b) == null || (string2 = (CharSequence) krl0Var.b) == null) {
                    string2 = eVar.a.getString(kyh0.scooters_preview_error_alien);
                }
                scootersPreviewStateMapper$prepareAlienScooter$1.L$0 = null;
                scootersPreviewStateMapper$prepareAlienScooter$1.L$1 = null;
                scootersPreviewStateMapper$prepareAlienScooter$1.L$2 = qmo0Var4;
                scootersPreviewStateMapper$prepareAlienScooter$1.L$3 = string;
                scootersPreviewStateMapper$prepareAlienScooter$1.L$4 = string2;
                scootersPreviewStateMapper$prepareAlienScooter$1.label = 2;
                a = a(scootersPreviewStateMapper$prepareAlienScooter$1);
                if (a != obj) {
                    qmo0Var = qmo0Var4;
                    obj2 = a;
                    charSequence = string;
                    BitmapDrawable bitmapDrawable32 = (BitmapDrawable) obj2;
                    if (qmo0Var != null) {
                    }
                    scootersPreviewStateMapper$prepareAlienScooter$1.L$0 = null;
                    scootersPreviewStateMapper$prepareAlienScooter$1.L$1 = null;
                    scootersPreviewStateMapper$prepareAlienScooter$1.L$2 = qmo0Var;
                    scootersPreviewStateMapper$prepareAlienScooter$1.L$3 = charSequence;
                    scootersPreviewStateMapper$prepareAlienScooter$1.L$4 = string2;
                    scootersPreviewStateMapper$prepareAlienScooter$1.L$5 = bitmapDrawable32;
                    scootersPreviewStateMapper$prepareAlienScooter$1.label = 3;
                    b = this.c.b(z, scootersPreviewStateMapper$prepareAlienScooter$1);
                    if (b != obj) {
                    }
                }
                return obj;
            }
        }
        scootersPreviewStateMapper$prepareAlienScooter$1 = new ScootersPreviewStateMapper$prepareAlienScooter$1(this, continuationImpl);
        Object obj22 = scootersPreviewStateMapper$prepareAlienScooter$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPreviewStateMapper$prepareAlienScooter$1.label;
        if (i != 0) {
        }
        qmo0 qmo0Var42 = (qmo0) obj22;
        e eVar2 = this.a;
        if (n7p0Var != null) {
        }
        string = eVar2.a.getString(kyh0.scooters_preview_error_title);
        if (n7p0Var != null) {
        }
        string2 = eVar2.a.getString(kyh0.scooters_preview_error_alien);
        scootersPreviewStateMapper$prepareAlienScooter$1.L$0 = null;
        scootersPreviewStateMapper$prepareAlienScooter$1.L$1 = null;
        scootersPreviewStateMapper$prepareAlienScooter$1.L$2 = qmo0Var42;
        scootersPreviewStateMapper$prepareAlienScooter$1.L$3 = string;
        scootersPreviewStateMapper$prepareAlienScooter$1.L$4 = string2;
        scootersPreviewStateMapper$prepareAlienScooter$1.label = 2;
        a = a(scootersPreviewStateMapper$prepareAlienScooter$1);
        if (a != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ContinuationImpl continuationImpl) {
        ScootersPreviewStateMapper$prepareAlreadyAdded$1 scootersPreviewStateMapper$prepareAlreadyAdded$1;
        int i;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (continuationImpl instanceof ScootersPreviewStateMapper$prepareAlreadyAdded$1) {
            scootersPreviewStateMapper$prepareAlreadyAdded$1 = (ScootersPreviewStateMapper$prepareAlreadyAdded$1) continuationImpl;
            int i2 = scootersPreviewStateMapper$prepareAlreadyAdded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPreviewStateMapper$prepareAlreadyAdded$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPreviewStateMapper$prepareAlreadyAdded$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPreviewStateMapper$prepareAlreadyAdded$1.label;
                if (i != 0) {
                    b.b(obj);
                    int i3 = kyh0.scooters_preview_error_title;
                    e eVar = this.a;
                    String string = eVar.a.getString(i3);
                    String string2 = eVar.a.getString(kyh0.scooters_preview_error_already_added);
                    scootersPreviewStateMapper$prepareAlreadyAdded$1.L$0 = string;
                    scootersPreviewStateMapper$prepareAlreadyAdded$1.L$1 = string2;
                    scootersPreviewStateMapper$prepareAlreadyAdded$1.label = 1;
                    Object a = a(scootersPreviewStateMapper$prepareAlreadyAdded$1);
                    if (a == obj2) {
                        return obj2;
                    }
                    charSequence = string;
                    obj = a;
                    charSequence2 = string2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence2 = (CharSequence) scootersPreviewStateMapper$prepareAlreadyAdded$1.L$1;
                    charSequence = (CharSequence) scootersPreviewStateMapper$prepareAlreadyAdded$1.L$0;
                    b.b(obj);
                }
                return new rmo0(charSequence, charSequence2, (BitmapDrawable) obj);
            }
        }
        scootersPreviewStateMapper$prepareAlreadyAdded$1 = new ScootersPreviewStateMapper$prepareAlreadyAdded$1(this, continuationImpl);
        Object obj3 = scootersPreviewStateMapper$prepareAlreadyAdded$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPreviewStateMapper$prepareAlreadyAdded$1.label;
        if (i != 0) {
        }
        return new rmo0(charSequence, charSequence2, (BitmapDrawable) obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(r7p0 r7p0Var, ContinuationImpl continuationImpl) {
        ScootersPreviewStateMapper$prepareLoading$1 scootersPreviewStateMapper$prepareLoading$1;
        int i;
        if (continuationImpl instanceof ScootersPreviewStateMapper$prepareLoading$1) {
            scootersPreviewStateMapper$prepareLoading$1 = (ScootersPreviewStateMapper$prepareLoading$1) continuationImpl;
            int i2 = scootersPreviewStateMapper$prepareLoading$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPreviewStateMapper$prepareLoading$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPreviewStateMapper$prepareLoading$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPreviewStateMapper$prepareLoading$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersPreviewStateMapper$prepareLoading$1.L$0 = null;
                    scootersPreviewStateMapper$prepareLoading$1.L$1 = r7p0Var;
                    scootersPreviewStateMapper$prepareLoading$1.label = 1;
                    obj = b(scootersPreviewStateMapper$prepareLoading$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r7p0Var = (r7p0) scootersPreviewStateMapper$prepareLoading$1.L$1;
                    b.b(obj);
                }
                return new tmo0(r7p0Var, (BitmapDrawable) obj);
            }
        }
        scootersPreviewStateMapper$prepareLoading$1 = new ScootersPreviewStateMapper$prepareLoading$1(this, continuationImpl);
        Object obj3 = scootersPreviewStateMapper$prepareLoading$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPreviewStateMapper$prepareLoading$1.label;
        if (i != 0) {
        }
        return new tmo0(r7p0Var, (BitmapDrawable) obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(int i, ContinuationImpl continuationImpl) {
        ScootersPreviewStateMapper$prepareMaxCountReached$1 scootersPreviewStateMapper$prepareMaxCountReached$1;
        int i2;
        CharSequence charSequence;
        CharSequence charSequence2;
        if (continuationImpl instanceof ScootersPreviewStateMapper$prepareMaxCountReached$1) {
            scootersPreviewStateMapper$prepareMaxCountReached$1 = (ScootersPreviewStateMapper$prepareMaxCountReached$1) continuationImpl;
            int i3 = scootersPreviewStateMapper$prepareMaxCountReached$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersPreviewStateMapper$prepareMaxCountReached$1.label = i3 - Integer.MIN_VALUE;
                Object obj = scootersPreviewStateMapper$prepareMaxCountReached$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = scootersPreviewStateMapper$prepareMaxCountReached$1.label;
                if (i2 != 0) {
                    b.b(obj);
                    int i4 = kyh0.scooters_preview_error_title;
                    e eVar = this.a;
                    String string = eVar.a.getString(i4);
                    String format = String.format(eVar.a.getString(kyh0.scooters_preview_error_no_more_than), Arrays.copyOf(new Object[]{String.valueOf(i)}, 1));
                    scootersPreviewStateMapper$prepareMaxCountReached$1.L$0 = string;
                    scootersPreviewStateMapper$prepareMaxCountReached$1.L$1 = format;
                    scootersPreviewStateMapper$prepareMaxCountReached$1.I$0 = i;
                    scootersPreviewStateMapper$prepareMaxCountReached$1.label = 1;
                    Object a = a(scootersPreviewStateMapper$prepareMaxCountReached$1);
                    if (a == obj2) {
                        return obj2;
                    }
                    charSequence = string;
                    obj = a;
                    charSequence2 = format;
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence2 = (CharSequence) scootersPreviewStateMapper$prepareMaxCountReached$1.L$1;
                    charSequence = (CharSequence) scootersPreviewStateMapper$prepareMaxCountReached$1.L$0;
                    b.b(obj);
                }
                return new rmo0(charSequence, charSequence2, (BitmapDrawable) obj);
            }
        }
        scootersPreviewStateMapper$prepareMaxCountReached$1 = new ScootersPreviewStateMapper$prepareMaxCountReached$1(this, continuationImpl);
        Object obj3 = scootersPreviewStateMapper$prepareMaxCountReached$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = scootersPreviewStateMapper$prepareMaxCountReached$1.label;
        if (i2 != 0) {
        }
        return new rmo0(charSequence, charSequence2, (BitmapDrawable) obj3);
    }
}
