package com.yandex.go.something_wrong_screen.repository;

import com.yandex.go.something_wrong_screen.domain.entities.SomethingWrongScreenToggleTapSource;
import com.yandex.go.something_wrong_screen.experiment.DeeplinkConfig;
import com.yandex.go.something_wrong_screen.experiment.ShakeConfig;
import com.yandex.go.something_wrong_screen.experiment.SomethingWrongScreenExperiment;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import defpackage.bvf0;
import defpackage.chr0;
import defpackage.cne0;
import defpackage.d6z;
import defpackage.dne0;
import defpackage.f8t0;
import defpackage.g8t0;
import defpackage.gci0;
import defpackage.gtq0;
import defpackage.j5z;
import defpackage.k8t0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.ukr0;
import defpackage.uyj;
import defpackage.w511;
import defpackage.y8t0;
import defpackage.yce;
import defpackage.z8t0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class b {
    public final k8t0 a;
    public final g8t0 b;
    public final tt2 c;
    public final cne0 d;
    public final kotlinx.coroutines.sync.a e = gtq0.a();
    public final String f;
    public final String g;
    public final r0 h;
    public final gci0 i;
    public final r0 j;
    public final gci0 k;

    public b(k8t0 k8t0Var, g8t0 g8t0Var, dne0 dne0Var, tt2 tt2Var, o oVar, j5z j5zVar) {
        this.a = k8t0Var;
        this.b = g8t0Var;
        this.c = tt2Var;
        this.d = dne0Var.a("SomethingWrongScreenPrefs");
        Zone g = oVar.g();
        this.f = g != null ? g.B : null;
        this.g = j5zVar.b();
        r0 c = bvf0.c(z8t0.i);
        this.h = c;
        this.i = e.d(c);
        r0 c2 = bvf0.c(f8t0.c);
        this.j = c2;
        this.k = e.d(c2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, SomethingWrongScreenExperiment somethingWrongScreenExperiment, ContinuationImpl continuationImpl) {
        SomethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1 somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1;
        int i;
        SomethingWrongScreenExperiment somethingWrongScreenExperiment2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        bVar.getClass();
        if (continuationImpl instanceof SomethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1) {
            somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1 = (SomethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1) continuationImpl;
            int i2 = somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String c = somethingWrongScreenExperiment.c(bVar.g, bVar.f);
                    DeeplinkConfig deeplinkConfig = somethingWrongScreenExperiment.e;
                    if (c == null) {
                        c = "";
                    }
                    String Y = d6z.Y(somethingWrongScreenExperiment, deeplinkConfig.a);
                    String Y2 = d6z.Y(somethingWrongScreenExperiment, deeplinkConfig.b);
                    String Y3 = d6z.Y(somethingWrongScreenExperiment, deeplinkConfig.c);
                    String Y4 = d6z.Y(somethingWrongScreenExperiment, deeplinkConfig.d);
                    somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1.L$0 = somethingWrongScreenExperiment;
                    somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1.L$1 = c;
                    somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1.L$2 = Y;
                    somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1.L$3 = Y2;
                    somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1.L$4 = Y3;
                    somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1.L$5 = Y4;
                    somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1.label = 1;
                    Object e = bVar.e(bVar.d, new ukr0(29), somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1);
                    if (e == obj2) {
                        return obj2;
                    }
                    somethingWrongScreenExperiment2 = somethingWrongScreenExperiment;
                    str = Y;
                    str2 = Y3;
                    str3 = c;
                    str4 = Y4;
                    str5 = Y2;
                    obj = e;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str6 = (String) somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1.L$5;
                    String str7 = (String) somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1.L$4;
                    String str8 = (String) somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1.L$3;
                    String str9 = (String) somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1.L$2;
                    String str10 = (String) somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1.L$1;
                    SomethingWrongScreenExperiment somethingWrongScreenExperiment3 = (SomethingWrongScreenExperiment) somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1.L$0;
                    kotlin.b.b(obj);
                    str4 = str6;
                    str3 = str10;
                    str2 = str7;
                    somethingWrongScreenExperiment2 = somethingWrongScreenExperiment3;
                    str = str9;
                    str5 = str8;
                }
                return new z8t0(str, ((Boolean) obj).booleanValue(), str5, str2, str4, d6z.Y(somethingWrongScreenExperiment2, somethingWrongScreenExperiment2.e.e), str3, somethingWrongScreenExperiment2.h);
            }
        }
        somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1 = new SomethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1(bVar, continuationImpl);
        Object obj3 = somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = somethingWrongScreenRepositoryImpl$getDeeplinkScreenUiState$1.label;
        if (i != 0) {
        }
        return new z8t0(str, ((Boolean) obj3).booleanValue(), str5, str2, str4, d6z.Y(somethingWrongScreenExperiment2, somethingWrongScreenExperiment2.e.e), str3, somethingWrongScreenExperiment2.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, SomethingWrongScreenExperiment somethingWrongScreenExperiment, ContinuationImpl continuationImpl) {
        SomethingWrongScreenRepositoryImpl$getShakeScreenUiState$1 somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1;
        int i;
        SomethingWrongScreenExperiment somethingWrongScreenExperiment2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        bVar.getClass();
        if (continuationImpl instanceof SomethingWrongScreenRepositoryImpl$getShakeScreenUiState$1) {
            somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1 = (SomethingWrongScreenRepositoryImpl$getShakeScreenUiState$1) continuationImpl;
            int i2 = somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String c = somethingWrongScreenExperiment.c(bVar.g, bVar.f);
                    ShakeConfig shakeConfig = somethingWrongScreenExperiment.d;
                    if (c == null) {
                        c = "";
                    }
                    String Y = d6z.Y(somethingWrongScreenExperiment, shakeConfig.a);
                    String Y2 = d6z.Y(somethingWrongScreenExperiment, shakeConfig.b);
                    String Y3 = d6z.Y(somethingWrongScreenExperiment, shakeConfig.getC());
                    String Y4 = d6z.Y(somethingWrongScreenExperiment, shakeConfig.getD());
                    somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1.L$0 = somethingWrongScreenExperiment;
                    somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1.L$1 = c;
                    somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1.L$2 = Y;
                    somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1.L$3 = Y2;
                    somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1.L$4 = Y3;
                    somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1.L$5 = Y4;
                    somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1.label = 1;
                    Object e = bVar.e(bVar.d, new ukr0(29), somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1);
                    if (e == obj2) {
                        return obj2;
                    }
                    somethingWrongScreenExperiment2 = somethingWrongScreenExperiment;
                    str = Y;
                    str2 = Y3;
                    str3 = c;
                    str4 = Y4;
                    str5 = Y2;
                    obj = e;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str6 = (String) somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1.L$5;
                    String str7 = (String) somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1.L$4;
                    String str8 = (String) somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1.L$3;
                    String str9 = (String) somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1.L$2;
                    String str10 = (String) somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1.L$1;
                    SomethingWrongScreenExperiment somethingWrongScreenExperiment3 = (SomethingWrongScreenExperiment) somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1.L$0;
                    kotlin.b.b(obj);
                    str4 = str6;
                    str3 = str10;
                    str2 = str7;
                    somethingWrongScreenExperiment2 = somethingWrongScreenExperiment3;
                    str = str9;
                    str5 = str8;
                }
                return new z8t0(str, ((Boolean) obj).booleanValue(), str5, str2, str4, d6z.Y(somethingWrongScreenExperiment2, somethingWrongScreenExperiment2.d.e), str3, somethingWrongScreenExperiment2.h);
            }
        }
        somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1 = new SomethingWrongScreenRepositoryImpl$getShakeScreenUiState$1(bVar, continuationImpl);
        Object obj3 = somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = somethingWrongScreenRepositoryImpl$getShakeScreenUiState$1.label;
        if (i != 0) {
        }
        return new z8t0(str, ((Boolean) obj3).booleanValue(), str5, str2, str4, d6z.Y(somethingWrongScreenExperiment2, somethingWrongScreenExperiment2.d.e), str3, somethingWrongScreenExperiment2.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        SomethingWrongScreenRepositoryImpl$getShakeToggleState$1 somethingWrongScreenRepositoryImpl$getShakeToggleState$1;
        int i;
        boolean z;
        if (continuationImpl instanceof SomethingWrongScreenRepositoryImpl$getShakeToggleState$1) {
            somethingWrongScreenRepositoryImpl$getShakeToggleState$1 = (SomethingWrongScreenRepositoryImpl$getShakeToggleState$1) continuationImpl;
            int i2 = somethingWrongScreenRepositoryImpl$getShakeToggleState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                somethingWrongScreenRepositoryImpl$getShakeToggleState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = somethingWrongScreenRepositoryImpl$getShakeToggleState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = somethingWrongScreenRepositoryImpl$getShakeToggleState$1.label;
                k8t0 k8t0Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z2 = ((SomethingWrongScreenExperiment) k8t0Var.a().b()).b;
                    somethingWrongScreenRepositoryImpl$getShakeToggleState$1.Z$0 = z2;
                    somethingWrongScreenRepositoryImpl$getShakeToggleState$1.label = 1;
                    Object e = e(this.d, new ukr0(29), somethingWrongScreenRepositoryImpl$getShakeToggleState$1);
                    if (e == obj2) {
                        return obj2;
                    }
                    obj = e;
                    z = z2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = somethingWrongScreenRepositoryImpl$getShakeToggleState$1.Z$0;
                    kotlin.b.b(obj);
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SomethingWrongScreenExperiment somethingWrongScreenExperiment = (SomethingWrongScreenExperiment) k8t0Var.a().b();
                String Y = d6z.Y(somethingWrongScreenExperiment, somethingWrongScreenExperiment.d.getC());
                SomethingWrongScreenExperiment somethingWrongScreenExperiment2 = (SomethingWrongScreenExperiment) k8t0Var.a().b();
                return new chr0(z, booleanValue, Y, d6z.Y(somethingWrongScreenExperiment2, somethingWrongScreenExperiment2.d.getD()));
            }
        }
        somethingWrongScreenRepositoryImpl$getShakeToggleState$1 = new SomethingWrongScreenRepositoryImpl$getShakeToggleState$1(this, continuationImpl);
        Object obj3 = somethingWrongScreenRepositoryImpl$getShakeToggleState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = somethingWrongScreenRepositoryImpl$getShakeToggleState$1.label;
        k8t0 k8t0Var2 = this.a;
        if (i != 0) {
        }
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        SomethingWrongScreenExperiment somethingWrongScreenExperiment3 = (SomethingWrongScreenExperiment) k8t0Var2.a().b();
        String Y2 = d6z.Y(somethingWrongScreenExperiment3, somethingWrongScreenExperiment3.d.getC());
        SomethingWrongScreenExperiment somethingWrongScreenExperiment22 = (SomethingWrongScreenExperiment) k8t0Var2.a().b();
        return new chr0(z, booleanValue2, Y2, d6z.Y(somethingWrongScreenExperiment22, somethingWrongScreenExperiment22.d.getD()));
    }

    public final Object d(boolean z, SomethingWrongScreenToggleTapSource somethingWrongScreenToggleTapSource, SuspendLambda suspendLambda) {
        String str;
        Boolean valueOf = Boolean.valueOf(z);
        int i = y8t0.b[somethingWrongScreenToggleTapSource.ordinal()];
        if (i == 1) {
            str = "modal_view";
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            str = "safety_center";
        }
        g8t0 g8t0Var = this.b;
        g8t0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("is_on", valueOf);
        hashMap.put("source", str);
        g8t0Var.a.a("SomethingWrongScreen.ToggleTapped", hashMap, 1, new HashMap());
        Object e = e(this.d, new yce(z, 28), suspendLambda);
        return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : zy11.a;
    }

    public final Object e(cne0 cne0Var, tls tlsVar, ContinuationImpl continuationImpl) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new SomethingWrongScreenRepositoryImpl$use$2(this, tlsVar, cne0Var, null), continuationImpl);
    }
}
