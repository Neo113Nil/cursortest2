package com.yandex.go.promocodes.referral.impl.provider;

import com.yandex.go.promocodes.referral.impl.net.ReferralApi;
import com.yandex.go.promocodes.referral.impl.net.dto.GetReferralParam;
import com.yandex.go.promocodes.referral.impl.net.dto.ReferralCodeResponse;
import com.yandex.go.promocodes.referral.impl.net.dto.ReferralCodes;
import defpackage.as21;
import defpackage.bvf0;
import defpackage.ck;
import defpackage.cmt;
import defpackage.g050;
import defpackage.g8e;
import defpackage.gtq0;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.jst;
import defpackage.lxx;
import defpackage.mdh;
import defpackage.mni0;
import defpackage.nni0;
import defpackage.ny61;
import defpackage.on2;
import defpackage.owx;
import defpackage.pav;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class k implements nni0, lxx {
    public final ru.yandex.taxi.startup.launch.h a;
    public final pav b;
    public final h3y c;
    public final mni0 d;
    public final i3y e;
    public final f f;
    public String h;
    public final r0 g = bvf0.c(ReferralCodes.c);
    public final kotlinx.coroutines.sync.a i = gtq0.a();
    public final String j = "REFERRAL_CODES";

    public k(on2 on2Var, as21 as21Var, ru.yandex.taxi.startup.launch.h hVar, pav pavVar, h3y h3yVar, tt2 tt2Var, mni0 mni0Var) {
        this.a = hVar;
        this.b = pavVar;
        this.c = h3yVar;
        this.d = mni0Var;
        this.e = kotlin.a.a(new ck(on2Var, 24));
        this.f = new f(tt2Var, as21Var);
    }

    public final jqr a() {
        return new jqr(new j(new h(new n(this.g, new ReferralCodesProviderImpl$referralCodeFlow$1(this, null)), this)), new ReferralCodesProviderImpl$referralCodeFlow$4(this, null), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|97|6|7|8|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01a9, code lost:
    
        if (r3.a(r4) == r5) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0142, code lost:
    
        if (r3.a(r4) == r5) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0072, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b8, code lost:
    
        r4.L$0 = null;
        r4.L$1 = r3;
        r4.L$2 = null;
        r4.L$3 = r10;
        r4.label = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01c7, code lost:
    
        if (r3.a(r4) != r5) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x009f, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b7, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x009c, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0151, code lost:
    
        defpackage.jst.e.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015a, code lost:
    
        if ((r10 instanceof ru.yandex.taxi.network.api.models.GoApiHttpException) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0162, code lost:
    
        if (r10.getCode() == 406) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x016b, code lost:
    
        if (r7 != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x016d, code lost:
    
        r10 = com.yandex.go.promocodes.referral.impl.net.dto.ReferralCodes.d;
        r4.L$0 = null;
        r4.L$1 = null;
        r4.L$2 = r10;
        r4.L$3 = null;
        r4.label = 5;
        r1.c = r10;
        r1.b.getClass();
        r11 = defpackage.uyj.a;
        r11 = defpackage.tje.k0(defpackage.mdh.b, new com.yandex.go.promocodes.referral.impl.provider.ReferralCodesProviderImpl$ReferralCodesCache$update$2(r1, r10, null), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0190, code lost:
    
        if (r11 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0194, code lost:
    
        if (r11 == r5) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0193, code lost:
    
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0165, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0167, code lost:
    
        r7 = defpackage.jx81.A(406, r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d2 A[Catch: all -> 0x00db, TRY_LEAVE, TryCatch #4 {all -> 0x00db, blocks: (B:61:0x00ca, B:63:0x00d2, B:66:0x00de), top: B:60:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de A[Catch: all -> 0x00db, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00db, blocks: (B:61:0x00ca, B:63:0x00d2, B:66:0x00de), top: B:60:0x00ca }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        ReferralCodesProviderImpl$requestUpdateWithoutCheck$2 referralCodesProviderImpl$requestUpdateWithoutCheck$2;
        g050 g050Var;
        ReferralCodes a;
        Object k0;
        r0 r0Var = this.g;
        f fVar = this.f;
        zy11 zy11Var = zy11.a;
        g050 g050Var2 = this.i;
        if (continuationImpl instanceof ReferralCodesProviderImpl$requestUpdateWithoutCheck$2) {
            referralCodesProviderImpl$requestUpdateWithoutCheck$2 = (ReferralCodesProviderImpl$requestUpdateWithoutCheck$2) continuationImpl;
            int i = referralCodesProviderImpl$requestUpdateWithoutCheck$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                referralCodesProviderImpl$requestUpdateWithoutCheck$2.label = i - Integer.MIN_VALUE;
                Object obj = referralCodesProviderImpl$requestUpdateWithoutCheck$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                boolean z = true;
                switch (referralCodesProviderImpl$requestUpdateWithoutCheck$2.label) {
                    case 0:
                        kotlin.b.b(obj);
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$0 = str;
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$1 = g050Var2;
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.label = 1;
                        if (g050Var2.a(referralCodesProviderImpl$requestUpdateWithoutCheck$2) != coroutineSingletons) {
                            g050Var = g050Var2;
                            try {
                                if (!jl40.l(this.h, str)) {
                                    jst.e.getClass();
                                    return zy11Var;
                                }
                                this.h = str;
                                cmt<List<ReferralCodeResponse>> a2 = ((ReferralApi) this.e.getValue()).a(new GetReferralParam(str));
                                referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$0 = null;
                                referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$1 = null;
                                referralCodesProviderImpl$requestUpdateWithoutCheck$2.label = 2;
                                obj = ru.yandex.taxi.network.api.a.d(a2, referralCodesProviderImpl$requestUpdateWithoutCheck$2);
                                if (obj == coroutineSingletons) {
                                }
                                a = this.d.a((List) obj);
                                referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$0 = null;
                                referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$1 = null;
                                referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$2 = a;
                                referralCodesProviderImpl$requestUpdateWithoutCheck$2.label = 3;
                                fVar.c = a;
                                fVar.b.getClass();
                                sjh sjhVar = uyj.a;
                                k0 = tje.k0(mdh.b, new ReferralCodesProviderImpl$ReferralCodesCache$update$2(fVar, a, null), referralCodesProviderImpl$requestUpdateWithoutCheck$2);
                                if (k0 == coroutineSingletons) {
                                    k0 = zy11Var;
                                }
                                if (k0 == coroutineSingletons) {
                                }
                                r0Var.l(a);
                                referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$0 = null;
                                referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$1 = g050Var2;
                                referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$2 = null;
                                referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$3 = zy11Var;
                                referralCodesProviderImpl$requestUpdateWithoutCheck$2.label = 4;
                                break;
                            } finally {
                            }
                        }
                        return coroutineSingletons;
                    case 1:
                        g050 g050Var3 = (g050) referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$1;
                        String str2 = (String) referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$0;
                        kotlin.b.b(obj);
                        g050Var = g050Var3;
                        str = str2;
                        if (!jl40.l(this.h, str)) {
                        }
                        break;
                    case 2:
                        kotlin.b.b(obj);
                        a = this.d.a((List) obj);
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$0 = null;
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$1 = null;
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$2 = a;
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.label = 3;
                        fVar.c = a;
                        fVar.b.getClass();
                        sjh sjhVar2 = uyj.a;
                        k0 = tje.k0(mdh.b, new ReferralCodesProviderImpl$ReferralCodesCache$update$2(fVar, a, null), referralCodesProviderImpl$requestUpdateWithoutCheck$2);
                        if (k0 == coroutineSingletons) {
                        }
                        if (k0 == coroutineSingletons) {
                        }
                        r0Var.l(a);
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$0 = null;
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$1 = g050Var2;
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$2 = null;
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$3 = zy11Var;
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.label = 4;
                        break;
                    case 3:
                        a = (ReferralCodes) referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$2;
                        kotlin.b.b(obj);
                        r0Var.l(a);
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$0 = null;
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$1 = g050Var2;
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$2 = null;
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$3 = zy11Var;
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.label = 4;
                        break;
                    case 4:
                        g050Var2 = (g050) referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$1;
                        kotlin.b.b(obj);
                        try {
                            this.h = null;
                            return zy11Var;
                        } finally {
                        }
                    case 5:
                        ReferralCodes referralCodes = (ReferralCodes) referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$2;
                        kotlin.b.b(obj);
                        r0Var.l(referralCodes);
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$0 = null;
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$1 = g050Var2;
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$2 = null;
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$3 = zy11Var;
                        referralCodesProviderImpl$requestUpdateWithoutCheck$2.label = 6;
                        break;
                    case 6:
                        g050Var2 = (g050) referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$1;
                        kotlin.b.b(obj);
                        try {
                            this.h = null;
                            return zy11Var;
                        } finally {
                        }
                    case 7:
                        th = (Throwable) referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$3;
                        g050Var2 = (g050) referralCodesProviderImpl$requestUpdateWithoutCheck$2.L$1;
                        kotlin.b.b(obj);
                        try {
                            this.h = null;
                            throw th;
                        } finally {
                        }
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        referralCodesProviderImpl$requestUpdateWithoutCheck$2 = new ReferralCodesProviderImpl$requestUpdateWithoutCheck$2(this, continuationImpl);
        Object obj2 = referralCodesProviderImpl$requestUpdateWithoutCheck$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        boolean z2 = true;
        switch (referralCodesProviderImpl$requestUpdateWithoutCheck$2.label) {
        }
    }

    @Override // defpackage.lxx
    public final Object e(owx owxVar, Continuation continuation) {
        String str = owxVar.g;
        boolean z = owxVar.d;
        SuspendLambda suspendLambda = (SuspendLambda) continuation;
        zy11 zy11Var = zy11.a;
        if (!z) {
            jst.e.getClass();
            return zy11Var;
        }
        if (str != null) {
            return b(str, suspendLambda);
        }
        g8e.C("User unauthorized but canGenerateReferrals=true. Skipping update", jst.e);
        return zy11Var;
    }

    @Override // defpackage.j35
    public final String getName() {
        return this.j;
    }
}
