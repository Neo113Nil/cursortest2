package com.yandex.go.payments.porttech.navigation;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.yandex.go.payments.domain.l0;
import com.yandex.go.payments.porttech.domain.PaymentMethodResponse;
import com.yandex.go.payments.porttech.domain.PorttechJsNativeApi;
import com.yandex.go.payments.porttech.domain.SelectPaymentMethodRequest;
import com.yandex.go.payments.porttech.navigation.d;
import com.yandex.go.payments.superapp.payment.b;
import defpackage.ace0;
import defpackage.aq80;
import defpackage.bia0;
import defpackage.by90;
import defpackage.cce0;
import defpackage.dce0;
import defpackage.ffx;
import defpackage.gf41;
import defpackage.h0a0;
import defpackage.h55;
import defpackage.i3y;
import defpackage.lea0;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.rea0;
import defpackage.sea0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wi0;
import defpackage.yvf0;
import defpackage.zi0;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class d extends h55 {
    public final tt2 D;
    public final zuj0 E;
    public final gf41 F;
    public final yvf0 G;
    public final ace0 H;
    public final wi0 I;
    public final rea0 J;
    public final com.yandex.go.payments.porttech.data.a K;
    public final com.yandex.go.payments.superapp.payment.b L;
    public final aq80 M;
    public final Context N;
    public volatile dce0 O;
    public zi0 P;
    public final i3y Q;
    public final i3y R;
    public final i3y S;

    public d(tt2 tt2Var, zuj0 zuj0Var, gf41 gf41Var, yvf0 yvf0Var, ace0 ace0Var, wi0 wi0Var, rea0 rea0Var, com.yandex.go.payments.porttech.data.a aVar, com.yandex.go.payments.superapp.payment.b bVar, aq80 aq80Var, Context context) {
        super(null);
        this.D = tt2Var;
        this.E = zuj0Var;
        this.F = gf41Var;
        this.G = yvf0Var;
        this.H = ace0Var;
        this.I = wi0Var;
        this.J = rea0Var;
        this.K = aVar;
        this.L = bVar;
        this.M = aq80Var;
        this.N = context;
        final int i = 0;
        this.Q = kotlin.a.a(new sls(this) { // from class: ece0
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                d dVar = this.b;
                switch (i2) {
                    case 0:
                        return dVar.F.a();
                    case 1:
                        return ((scg) ((ff41) dVar.Q.getValue())).b();
                    default:
                        b bVar2 = dVar.L;
                        u32.a.getClass();
                        return bVar2.a("porttech", t32.b, new l90(), uba0.g);
                }
            }
        });
        final int i2 = 1;
        this.R = kotlin.a.a(new sls(this) { // from class: ece0
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        return dVar.F.a();
                    case 1:
                        return ((scg) ((ff41) dVar.Q.getValue())).b();
                    default:
                        b bVar2 = dVar.L;
                        u32.a.getClass();
                        return bVar2.a("porttech", t32.b, new l90(), uba0.g);
                }
            }
        });
        final int i3 = 2;
        this.S = kotlin.a.a(new sls(this) { // from class: ece0
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                d dVar = this.b;
                switch (i22) {
                    case 0:
                        return dVar.F.a();
                    case 1:
                        return ((scg) ((ff41) dVar.Q.getValue())).b();
                    default:
                        b bVar2 = dVar.L;
                        u32.a.getClass();
                        return bVar2.a("porttech", t32.b, new l90(), uba0.g);
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x012f, code lost:
    
        if (r4 == r7) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(d dVar, String str, SelectPaymentMethodRequest selectPaymentMethodRequest, PorttechJsNativeApi porttechJsNativeApi, cce0 cce0Var, ContinuationImpl continuationImpl) {
        PorttechWebViewRouter$handleGetSelectedPaymentMethod$1 porttechWebViewRouter$handleGetSelectedPaymentMethod$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        lea0 lea0Var;
        String str2;
        d dVar2;
        lea0 lea0Var2;
        PorttechJsNativeApi porttechJsNativeApi2;
        String str3;
        String id;
        String str4 = str;
        PorttechJsNativeApi porttechJsNativeApi3 = porttechJsNativeApi;
        dVar.getClass();
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof PorttechWebViewRouter$handleGetSelectedPaymentMethod$1) {
            porttechWebViewRouter$handleGetSelectedPaymentMethod$1 = (PorttechWebViewRouter$handleGetSelectedPaymentMethod$1) continuationImpl;
            int i2 = porttechWebViewRouter$handleGetSelectedPaymentMethod$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                porttechWebViewRouter$handleGetSelectedPaymentMethod$1.label = i2 - Integer.MIN_VALUE;
                obj = porttechWebViewRouter$handleGetSelectedPaymentMethod$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = porttechWebViewRouter$handleGetSelectedPaymentMethod$1.label;
                String str5 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dce0 dce0Var = dVar.O;
                    if (dce0Var != null) {
                        porttechJsNativeApi3.resolveGetSelectedPaymentMethod(str4, new PaymentMethodResponse(dce0Var.a, dce0Var.b.getCode(), dce0Var.c, dce0Var.d));
                        return zy11Var;
                    }
                    h0a0 h0a0Var = new h0a0(selectPaymentMethodRequest.a.size() >= 2 ? new zzs(((Number) selectPaymentMethodRequest.a.get(1)).doubleValue(), ((Number) selectPaymentMethodRequest.a.get(0)).doubleValue(), 0, null, null, 28) : cce0Var.b, null);
                    porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$0 = str4;
                    porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$1 = null;
                    porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$2 = porttechJsNativeApi3;
                    porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$3 = null;
                    porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$4 = null;
                    porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$5 = null;
                    porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$6 = null;
                    porttechWebViewRouter$handleGetSelectedPaymentMethod$1.label = 1;
                    obj = dVar.S(h0a0Var, porttechWebViewRouter$handleGetSelectedPaymentMethod$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            lea0Var2 = (lea0) porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$8;
                            porttechJsNativeApi2 = (PorttechJsNativeApi) porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$2;
                            str3 = (String) porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$0;
                            kotlin.b.b(obj);
                            str5 = (String) obj;
                            str2 = str3;
                            porttechJsNativeApi3 = porttechJsNativeApi2;
                            lea0Var = lea0Var2;
                            String a = ((sea0) dVar.J).a(dVar.N, lea0Var);
                            id = lea0Var.getId();
                            if (id == null) {
                                id = "";
                            }
                            porttechJsNativeApi3.resolveGetSelectedPaymentMethod(str2, new PaymentMethodResponse(id, lea0Var.c().getCode(), str5, a));
                            return zy11Var;
                        }
                        dVar2 = (d) porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$9;
                        lea0Var = (lea0) porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$8;
                        porttechJsNativeApi3 = (PorttechJsNativeApi) porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$2;
                        str2 = (String) porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$0;
                        kotlin.b.b(obj);
                        dVar2.O = (dce0) obj;
                        if (lea0Var != null) {
                            porttechJsNativeApi3.resolveGetSelectedPaymentMethod(str2, null);
                            return zy11Var;
                        }
                        Drawable a2 = bia0.a(dVar.R().c(), dVar.N, lea0Var);
                        Bitmap d0 = a2 != null ? ffx.d0(a2, 0, 0, 7) : null;
                        if (d0 != null) {
                            porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$0 = str2;
                            porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$1 = null;
                            porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$2 = porttechJsNativeApi3;
                            porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$3 = null;
                            porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$4 = null;
                            porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$5 = null;
                            porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$6 = null;
                            porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$7 = null;
                            porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$8 = lea0Var;
                            porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$9 = null;
                            porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$10 = null;
                            porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$11 = null;
                            porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$12 = null;
                            porttechWebViewRouter$handleGetSelectedPaymentMethod$1.label = 3;
                            dVar.D.getClass();
                            obj = tje.k0(uyj.a, new PorttechWebViewRouter$bitmapToBase64$2(d0, null), porttechWebViewRouter$handleGetSelectedPaymentMethod$1);
                            if (obj != coroutineSingletons) {
                                lea0Var2 = lea0Var;
                                porttechJsNativeApi2 = porttechJsNativeApi3;
                                str3 = str2;
                                str5 = (String) obj;
                                str2 = str3;
                                porttechJsNativeApi3 = porttechJsNativeApi2;
                                lea0Var = lea0Var2;
                            }
                            return coroutineSingletons;
                        }
                        String a3 = ((sea0) dVar.J).a(dVar.N, lea0Var);
                        id = lea0Var.getId();
                        if (id == null) {
                        }
                        porttechJsNativeApi3.resolveGetSelectedPaymentMethod(str2, new PaymentMethodResponse(id, lea0Var.c().getCode(), str5, a3));
                        return zy11Var;
                    }
                    PorttechJsNativeApi porttechJsNativeApi4 = (PorttechJsNativeApi) porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$2;
                    String str6 = (String) porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$0;
                    kotlin.b.b(obj);
                    porttechJsNativeApi3 = porttechJsNativeApi4;
                    str4 = str6;
                }
                lea0Var = ((oea0) obj).c;
                porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$0 = str4;
                porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$1 = null;
                porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$2 = porttechJsNativeApi3;
                porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$3 = null;
                porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$4 = null;
                porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$5 = null;
                porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$6 = null;
                porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$7 = null;
                porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$8 = lea0Var;
                porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$9 = dVar;
                porttechWebViewRouter$handleGetSelectedPaymentMethod$1.label = 2;
                obj = dVar.Q(lea0Var, porttechWebViewRouter$handleGetSelectedPaymentMethod$1);
                if (obj != coroutineSingletons) {
                    str2 = str4;
                    dVar2 = dVar;
                    dVar2.O = (dce0) obj;
                    if (lea0Var != null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        porttechWebViewRouter$handleGetSelectedPaymentMethod$1 = new PorttechWebViewRouter$handleGetSelectedPaymentMethod$1(dVar, continuationImpl);
        obj = porttechWebViewRouter$handleGetSelectedPaymentMethod$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = porttechWebViewRouter$handleGetSelectedPaymentMethod$1.label;
        String str52 = null;
        if (i != 0) {
        }
        lea0Var = ((oea0) obj).c;
        porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$0 = str4;
        porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$1 = null;
        porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$2 = porttechJsNativeApi3;
        porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$3 = null;
        porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$4 = null;
        porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$5 = null;
        porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$6 = null;
        porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$7 = null;
        porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$8 = lea0Var;
        porttechWebViewRouter$handleGetSelectedPaymentMethod$1.L$9 = dVar;
        porttechWebViewRouter$handleGetSelectedPaymentMethod$1.label = 2;
        obj = dVar.Q(lea0Var, porttechWebViewRouter$handleGetSelectedPaymentMethod$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        if (this.S.isInitialized()) {
            R().dispose();
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new PorttechWebViewRouter$onLaunch$1(this, (cce0) obj, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(lea0 lea0Var, ContinuationImpl continuationImpl) {
        PorttechWebViewRouter$convertToPorttechPaymentMethod$1 porttechWebViewRouter$convertToPorttechPaymentMethod$1;
        int i;
        String id;
        if (continuationImpl instanceof PorttechWebViewRouter$convertToPorttechPaymentMethod$1) {
            porttechWebViewRouter$convertToPorttechPaymentMethod$1 = (PorttechWebViewRouter$convertToPorttechPaymentMethod$1) continuationImpl;
            int i2 = porttechWebViewRouter$convertToPorttechPaymentMethod$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                porttechWebViewRouter$convertToPorttechPaymentMethod$1.label = i2 - Integer.MIN_VALUE;
                Object obj = porttechWebViewRouter$convertToPorttechPaymentMethod$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = porttechWebViewRouter$convertToPorttechPaymentMethod$1.label;
                Context context = this.N;
                String str = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (lea0Var == null) {
                        return null;
                    }
                    Drawable a = bia0.a(R().c(), context, lea0Var);
                    Bitmap d0 = a != null ? ffx.d0(a, 0, 0, 7) : null;
                    if (d0 != null) {
                        porttechWebViewRouter$convertToPorttechPaymentMethod$1.L$0 = lea0Var;
                        porttechWebViewRouter$convertToPorttechPaymentMethod$1.L$1 = null;
                        porttechWebViewRouter$convertToPorttechPaymentMethod$1.L$2 = null;
                        porttechWebViewRouter$convertToPorttechPaymentMethod$1.L$3 = null;
                        porttechWebViewRouter$convertToPorttechPaymentMethod$1.label = 1;
                        this.D.getClass();
                        obj = tje.k0(uyj.a, new PorttechWebViewRouter$bitmapToBase64$2(d0, null), porttechWebViewRouter$convertToPorttechPaymentMethod$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    id = lea0Var.getId();
                    if (id == null) {
                        id = "";
                    }
                    return new dce0(id, str, ((sea0) this.J).a(context, lea0Var), lea0Var.c());
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lea0Var = (lea0) porttechWebViewRouter$convertToPorttechPaymentMethod$1.L$0;
                kotlin.b.b(obj);
                str = (String) obj;
                id = lea0Var.getId();
                if (id == null) {
                }
                return new dce0(id, str, ((sea0) this.J).a(context, lea0Var), lea0Var.c());
            }
        }
        porttechWebViewRouter$convertToPorttechPaymentMethod$1 = new PorttechWebViewRouter$convertToPorttechPaymentMethod$1(this, continuationImpl);
        Object obj2 = porttechWebViewRouter$convertToPorttechPaymentMethod$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = porttechWebViewRouter$convertToPorttechPaymentMethod$1.label;
        Context context2 = this.N;
        String str2 = null;
        if (i != 0) {
        }
        str2 = (String) obj2;
        id = lea0Var.getId();
        if (id == null) {
        }
        return new dce0(id, str2, ((sea0) this.J).a(context2, lea0Var), lea0Var.c());
    }

    public final by90 R() {
        return (by90) this.S.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(h0a0 h0a0Var, ContinuationImpl continuationImpl) {
        PorttechWebViewRouter$getPaymentModels$1 porttechWebViewRouter$getPaymentModels$1;
        int i;
        if (continuationImpl instanceof PorttechWebViewRouter$getPaymentModels$1) {
            porttechWebViewRouter$getPaymentModels$1 = (PorttechWebViewRouter$getPaymentModels$1) continuationImpl;
            int i2 = porttechWebViewRouter$getPaymentModels$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                porttechWebViewRouter$getPaymentModels$1.label = i2 - Integer.MIN_VALUE;
                Object obj = porttechWebViewRouter$getPaymentModels$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = porttechWebViewRouter$getPaymentModels$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l0 b = R().b();
                    porttechWebViewRouter$getPaymentModels$1.L$0 = null;
                    porttechWebViewRouter$getPaymentModels$1.L$1 = null;
                    porttechWebViewRouter$getPaymentModels$1.L$2 = null;
                    porttechWebViewRouter$getPaymentModels$1.label = 1;
                    obj = b.c(h0a0Var, "no_feature", false, porttechWebViewRouter$getPaymentModels$1);
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
                return (oea0) obj;
            }
        }
        porttechWebViewRouter$getPaymentModels$1 = new PorttechWebViewRouter$getPaymentModels$1(this, continuationImpl);
        Object obj2 = porttechWebViewRouter$getPaymentModels$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = porttechWebViewRouter$getPaymentModels$1.label;
        if (i != 0) {
        }
        return (oea0) obj2;
    }
}
