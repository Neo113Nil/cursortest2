package com.yandex.go.payments.shared;

import android.net.Uri;
import com.yandex.go.payments.shared.family.experiments.FamilyGroupV2Experiment;
import com.yandex.go.sharedpayments.api.model.SharedAccountScreen;
import defpackage.ea70;
import defpackage.fa70;
import defpackage.ga70;
import defpackage.ha70;
import defpackage.jl40;
import defpackage.jst;
import defpackage.kap;
import defpackage.ny61;
import defpackage.pmr0;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.snr0;
import defpackage.tje;
import defpackage.tmr0;
import defpackage.tt2;
import defpackage.uap;
import defpackage.uyj;
import defpackage.w511;
import defpackage.xby;
import defpackage.yor0;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

/* loaded from: classes8.dex */
public final class z {
    public final v a;
    public final f b;
    public final uap c;
    public final kap d;
    public final tt2 e;
    public final g f;
    public pzt0 g;

    public z(v vVar, f fVar, uap uapVar, kap kapVar, tt2 tt2Var, g gVar) {
        this.a = vVar;
        this.b = fVar;
        this.c = uapVar;
        this.d = kapVar;
        this.e = tt2Var;
        this.f = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
    
        if (r2 == r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(z zVar, String str, Uri uri, yor0 yor0Var, ContinuationImpl continuationImpl) {
        SharedPaymentsDeeplinkRouter$openResolvedAccount$1 sharedPaymentsDeeplinkRouter$openResolvedAccount$1;
        int i;
        Uri uri2;
        yor0 yor0Var2;
        ha70 ha70Var;
        String str2 = str;
        zVar.getClass();
        if (continuationImpl instanceof SharedPaymentsDeeplinkRouter$openResolvedAccount$1) {
            sharedPaymentsDeeplinkRouter$openResolvedAccount$1 = (SharedPaymentsDeeplinkRouter$openResolvedAccount$1) continuationImpl;
            int i2 = sharedPaymentsDeeplinkRouter$openResolvedAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedPaymentsDeeplinkRouter$openResolvedAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sharedPaymentsDeeplinkRouter$openResolvedAccount$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedPaymentsDeeplinkRouter$openResolvedAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f fVar = zVar.b;
                    sharedPaymentsDeeplinkRouter$openResolvedAccount$1.L$0 = str2;
                    uri2 = uri;
                    sharedPaymentsDeeplinkRouter$openResolvedAccount$1.L$1 = uri2;
                    yor0Var2 = yor0Var;
                    sharedPaymentsDeeplinkRouter$openResolvedAccount$1.L$2 = yor0Var2;
                    sharedPaymentsDeeplinkRouter$openResolvedAccount$1.label = 1;
                    obj = fVar.a(str2, sharedPaymentsDeeplinkRouter$openResolvedAccount$1);
                } else {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    yor0 yor0Var3 = (yor0) sharedPaymentsDeeplinkRouter$openResolvedAccount$1.L$2;
                    uri2 = (Uri) sharedPaymentsDeeplinkRouter$openResolvedAccount$1.L$1;
                    String str3 = (String) sharedPaymentsDeeplinkRouter$openResolvedAccount$1.L$0;
                    kotlin.b.b(obj);
                    yor0Var2 = yor0Var3;
                    str2 = str3;
                }
                ha70Var = (ha70) obj;
                if (!(ha70Var instanceof ea70)) {
                    snr0 a = ((ea70) ha70Var).a();
                    SharedAccountScreen.Companion.getClass();
                    yor0Var2.b(a, pmr0.a(uri2));
                    return zy11.a;
                }
                if (ha70Var instanceof fa70) {
                    xby.l(jst.e, "B2B.TOKEN_ERROR:DEEPLINK_OPEN_ACCOUNT", null, ((fa70) ha70Var).a(), "Failed to open shared account from deeplink", 2);
                    sharedPaymentsDeeplinkRouter$openResolvedAccount$1.L$0 = null;
                    sharedPaymentsDeeplinkRouter$openResolvedAccount$1.L$1 = null;
                    sharedPaymentsDeeplinkRouter$openResolvedAccount$1.L$2 = null;
                    sharedPaymentsDeeplinkRouter$openResolvedAccount$1.L$3 = null;
                    sharedPaymentsDeeplinkRouter$openResolvedAccount$1.label = 2;
                    Object b = zVar.b(str2, yor0Var2, sharedPaymentsDeeplinkRouter$openResolvedAccount$1);
                    if (b != obj2) {
                        return b;
                    }
                } else {
                    if (!jl40.l(ha70Var, ga70.a)) {
                        w511.b();
                        return null;
                    }
                    sharedPaymentsDeeplinkRouter$openResolvedAccount$1.L$0 = null;
                    sharedPaymentsDeeplinkRouter$openResolvedAccount$1.L$1 = null;
                    sharedPaymentsDeeplinkRouter$openResolvedAccount$1.L$2 = null;
                    sharedPaymentsDeeplinkRouter$openResolvedAccount$1.L$3 = null;
                    sharedPaymentsDeeplinkRouter$openResolvedAccount$1.label = 3;
                    Object b2 = zVar.b(str2, yor0Var2, sharedPaymentsDeeplinkRouter$openResolvedAccount$1);
                    if (b2 != obj2) {
                        return b2;
                    }
                }
                return obj2;
            }
        }
        sharedPaymentsDeeplinkRouter$openResolvedAccount$1 = new SharedPaymentsDeeplinkRouter$openResolvedAccount$1(zVar, continuationImpl);
        Object obj3 = sharedPaymentsDeeplinkRouter$openResolvedAccount$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedPaymentsDeeplinkRouter$openResolvedAccount$1.label;
        if (i != 0) {
        }
        ha70Var = (ha70) obj3;
        if (!(ha70Var instanceof ea70)) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|(2:14|(1:16)(1:17))|18|19))|30|6|7|(0)(0)|12|(0)|18|19|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        throw r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[Catch: all -> 0x0066, CancellationException -> 0x0069, TryCatch #2 {CancellationException -> 0x0069, all -> 0x0066, blocks: (B:11:0x002d, B:12:0x0053, B:14:0x0057, B:16:0x005f, B:17:0x0063, B:24:0x003a), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, yor0 yor0Var, ContinuationImpl continuationImpl) {
        SharedPaymentsDeeplinkRouter$openCreateSharedAccount$1 sharedPaymentsDeeplinkRouter$openCreateSharedAccount$1;
        int i;
        tmr0 tmr0Var;
        if (continuationImpl instanceof SharedPaymentsDeeplinkRouter$openCreateSharedAccount$1) {
            sharedPaymentsDeeplinkRouter$openCreateSharedAccount$1 = (SharedPaymentsDeeplinkRouter$openCreateSharedAccount$1) continuationImpl;
            int i2 = sharedPaymentsDeeplinkRouter$openCreateSharedAccount$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedPaymentsDeeplinkRouter$openCreateSharedAccount$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sharedPaymentsDeeplinkRouter$openCreateSharedAccount$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedPaymentsDeeplinkRouter$openCreateSharedAccount$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.e.getClass();
                    sjh sjhVar = uyj.a;
                    SharedPaymentsDeeplinkRouter$openCreateSharedAccount$2$type$1 sharedPaymentsDeeplinkRouter$openCreateSharedAccount$2$type$1 = new SharedPaymentsDeeplinkRouter$openCreateSharedAccount$2$type$1(this, str, null);
                    sharedPaymentsDeeplinkRouter$openCreateSharedAccount$1.L$0 = null;
                    sharedPaymentsDeeplinkRouter$openCreateSharedAccount$1.L$1 = yor0Var;
                    sharedPaymentsDeeplinkRouter$openCreateSharedAccount$1.label = 1;
                    obj = tje.k0(sjhVar, sharedPaymentsDeeplinkRouter$openCreateSharedAccount$2$type$1, sharedPaymentsDeeplinkRouter$openCreateSharedAccount$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yor0Var = (yor0) sharedPaymentsDeeplinkRouter$openCreateSharedAccount$1.L$1;
                    kotlin.b.b(obj);
                }
                tmr0Var = (tmr0) obj;
                if (tmr0Var != null) {
                    snr0 j = this.a.j(tmr0Var);
                    if (j != null) {
                        yor0Var.a(j, tmr0Var);
                    } else {
                        yor0Var.c(tmr0Var);
                    }
                }
                return zy11.a;
            }
        }
        sharedPaymentsDeeplinkRouter$openCreateSharedAccount$1 = new SharedPaymentsDeeplinkRouter$openCreateSharedAccount$1(this, continuationImpl);
        Object obj2 = sharedPaymentsDeeplinkRouter$openCreateSharedAccount$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedPaymentsDeeplinkRouter$openCreateSharedAccount$1.label;
        if (i != 0) {
        }
        tmr0Var = (tmr0) obj2;
        if (tmr0Var != null) {
        }
        return zy11.a;
    }

    public final void c(Uri uri, DeeplinkSource deeplinkSource, yor0 yor0Var) {
        String queryParameter = uri.getQueryParameter("type");
        if (queryParameter == null) {
            jst.e.r(String.format("can't open deeplink: %s", Arrays.copyOf(new Object[]{uri.toString()}, 1)), new RuntimeException("no type parameter"));
            return;
        }
        FamilyGroupV2Experiment familyGroupV2Experiment = (FamilyGroupV2Experiment) this.c.a.b();
        FamilyGroupV2Experiment.Companion.getClass();
        boolean l = jl40.l(familyGroupV2Experiment, FamilyGroupV2Experiment.g);
        boolean z = !l;
        if (!l && familyGroupV2Experiment.b && queryParameter.equals(SharedAccountType.FAMILY.getTypeId())) {
            String str = familyGroupV2Experiment.e;
            String uri2 = uri.toString();
            boolean isInternal = deeplinkSource.getIsInternal();
            this.d.getClass();
            yor0Var.d(kap.a(str, uri2, isInternal));
            return;
        }
        pzt0 pzt0Var = this.g;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.g = g.a(this.f, new SharedPaymentsDeeplinkRouter$processSharedPaymentsUri$1(z, queryParameter, this, uri, deeplinkSource, yor0Var, null));
    }
}
