package com.yandex.go.morphlex.router;

import android.content.Context;
import com.yandex.go.morphlex.api.MorphlexScreenPayload$PresentType;
import com.yandex.go.morphlex.data.dto.MorphlexDimension;
import com.yandex.go.morphlex.experiments.MorphlexConfigurationsExperiment;
import com.yandex.go.morphlex.network.MorphlexApi;
import com.yandex.go.morphlex.network.MorphlexScenarioContextParam;
import com.yandex.go.morphlex.network.MorphlexScenarioContextResponse;
import defpackage.bvf0;
import defpackage.c830;
import defpackage.cmt;
import defpackage.dl1;
import defpackage.evu0;
import defpackage.h3y;
import defpackage.h55;
import defpackage.h830;
import defpackage.i6z0;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.m730;
import defpackage.m950;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qn11;
import defpackage.qu;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tje;
import defpackage.xes0;
import defpackage.yvf0;
import defpackage.z0j;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

/* loaded from: classes12.dex */
public final class a extends h55 {
    public final yvf0 D;
    public final h3y E;
    public final com.yandex.go.route.interactor.b F;
    public final Context G;
    public final po21 H;
    public final z0j I;
    public final xes0 J;
    public final t1b0 K;

    public a(rqo rqoVar, yvf0 yvf0Var, h3y h3yVar, com.yandex.go.route.interactor.b bVar, Context context, po21 po21Var, z0j z0jVar, xes0 xes0Var) {
        super(null);
        this.D = yvf0Var;
        this.E = h3yVar;
        this.F = bVar;
        this.G = context;
        this.H = po21Var;
        this.I = z0jVar;
        this.J = xes0Var;
        MorphlexConfigurationsExperiment.Companion.getClass();
        this.K = ((jbh) rqoVar).e(MorphlexConfigurationsExperiment.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.yandex.go.morphlex.router.a, h55, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [h830] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, m730 m730Var, ContinuationImpl continuationImpl) {
        MorphlexDeeplinkRouter$openMorphlexScreen$1 morphlexDeeplinkRouter$openMorphlexScreen$1;
        int i;
        i6z0 i6z0Var;
        String str;
        MorphlexConfigurationsExperiment.MorphlexScreenConfig morphlexScreenConfig;
        Map map;
        String str2;
        MorphlexScreenPayload$PresentType b;
        m730 m730Var2 = m730Var;
        aVar.getClass();
        if (continuationImpl instanceof MorphlexDeeplinkRouter$openMorphlexScreen$1) {
            morphlexDeeplinkRouter$openMorphlexScreen$1 = (MorphlexDeeplinkRouter$openMorphlexScreen$1) continuationImpl;
            int i2 = morphlexDeeplinkRouter$openMorphlexScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                morphlexDeeplinkRouter$openMorphlexScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = morphlexDeeplinkRouter$openMorphlexScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = morphlexDeeplinkRouter$openMorphlexScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str3 = m730Var2.a;
                    morphlexDeeplinkRouter$openMorphlexScreen$1.L$0 = m730Var2;
                    morphlexDeeplinkRouter$openMorphlexScreen$1.label = 1;
                    obj = aVar.Q(str3, morphlexDeeplinkRouter$openMorphlexScreen$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m730Var2 = (m730) morphlexDeeplinkRouter$openMorphlexScreen$1.L$0;
                    kotlin.b.b(obj);
                }
                str = m730Var2.a;
                morphlexScreenConfig = (MorphlexConfigurationsExperiment.MorphlexScreenConfig) ((MorphlexConfigurationsExperiment) obj).b.get(str);
                map = m730Var2.b;
                str2 = m730Var2.c;
                if (morphlexScreenConfig != null && (b = c830.b(morphlexScreenConfig.e)) != null) {
                    String str4 = morphlexScreenConfig.a;
                    String str5 = !evu0.J(str4) ? str : str4;
                    String str6 = morphlexScreenConfig.b;
                    List list = morphlexScreenConfig.c;
                    ArrayList a = list == null ? c830.a(list) : null;
                    boolean z = morphlexScreenConfig.g;
                    String str7 = morphlexScreenConfig.d;
                    MorphlexDimension morphlexDimension = morphlexScreenConfig.h;
                    i6z0Var = new h830(str5, str6, b, map, a, null, str7, z, morphlexDimension != null ? new i6z0(morphlexDimension.a, morphlexDimension.b, 8) : null, morphlexScreenConfig.i, str2, 32);
                }
                zy11 zy11Var = zy11.a;
                if (i6z0Var != null) {
                    aVar.r(new qu(9));
                    return zy11Var;
                }
                aVar.A((m950) aVar.D.get(), i6z0Var, new dl1(23, aVar));
                return zy11Var;
            }
        }
        morphlexDeeplinkRouter$openMorphlexScreen$1 = new MorphlexDeeplinkRouter$openMorphlexScreen$1(aVar, continuationImpl);
        Object obj2 = morphlexDeeplinkRouter$openMorphlexScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = morphlexDeeplinkRouter$openMorphlexScreen$1.label;
        if (i != 0) {
        }
        str = m730Var2.a;
        morphlexScreenConfig = (MorphlexConfigurationsExperiment.MorphlexScreenConfig) ((MorphlexConfigurationsExperiment) obj2).b.get(str);
        map = m730Var2.b;
        str2 = m730Var2.c;
        if (morphlexScreenConfig != null) {
            String str42 = morphlexScreenConfig.a;
            if (!evu0.J(str42)) {
            }
            String str62 = morphlexScreenConfig.b;
            List list2 = morphlexScreenConfig.c;
            if (list2 == null) {
            }
            boolean z2 = morphlexScreenConfig.g;
            String str72 = morphlexScreenConfig.d;
            MorphlexDimension morphlexDimension2 = morphlexScreenConfig.h;
            i6z0Var = new h830(str5, str62, b, map, a, null, str72, z2, morphlexDimension2 != null ? new i6z0(morphlexDimension2.a, morphlexDimension2.b, 8) : null, morphlexScreenConfig.i, str2, 32);
        }
        zy11 zy11Var2 = zy11.a;
        if (i6z0Var != null) {
        }
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.I.c(this);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.I.a(this);
        tje.N(o(), null, null, new MorphlexDeeplinkRouter$onLaunch$1(this, (m730) obj, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0051, code lost:
    
        if (r9 == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(String str, ContinuationImpl continuationImpl) {
        MorphlexDeeplinkRouter$getMorphlexConfigExperiment$1 morphlexDeeplinkRouter$getMorphlexConfigExperiment$1;
        int i;
        MorphlexConfigurationsExperiment morphlexConfigurationsExperiment;
        SimpleSpinnerModalView simpleSpinnerModalView;
        qn11 b;
        try {
            if (continuationImpl instanceof MorphlexDeeplinkRouter$getMorphlexConfigExperiment$1) {
                morphlexDeeplinkRouter$getMorphlexConfigExperiment$1 = (MorphlexDeeplinkRouter$getMorphlexConfigExperiment$1) continuationImpl;
                int i2 = morphlexDeeplinkRouter$getMorphlexConfigExperiment$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    morphlexDeeplinkRouter$getMorphlexConfigExperiment$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = morphlexDeeplinkRouter$getMorphlexConfigExperiment$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = morphlexDeeplinkRouter$getMorphlexConfigExperiment$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        morphlexDeeplinkRouter$getMorphlexConfigExperiment$1.L$0 = str;
                        morphlexDeeplinkRouter$getMorphlexConfigExperiment$1.label = 1;
                        obj = this.K.b(morphlexDeeplinkRouter$getMorphlexConfigExperiment$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            simpleSpinnerModalView = (SimpleSpinnerModalView) morphlexDeeplinkRouter$getMorphlexConfigExperiment$1.L$1;
                            try {
                                kotlin.b.b(obj);
                                MorphlexConfigurationsExperiment.Companion.getClass();
                                qn11 qn11Var = MorphlexConfigurationsExperiment.d;
                                b = ((MorphlexScenarioContextResponse) obj).b(MorphlexConfigurationsExperiment.class);
                                if (b == null) {
                                    qn11Var = b;
                                }
                                MorphlexConfigurationsExperiment morphlexConfigurationsExperiment2 = (MorphlexConfigurationsExperiment) qn11Var;
                                simpleSpinnerModalView.dismiss();
                                return morphlexConfigurationsExperiment2;
                            } catch (CancellationException e) {
                                throw e;
                            } catch (Throwable unused) {
                                MorphlexConfigurationsExperiment.Companion.getClass();
                                MorphlexConfigurationsExperiment morphlexConfigurationsExperiment3 = MorphlexConfigurationsExperiment.d;
                                simpleSpinnerModalView.dismiss();
                                return morphlexConfigurationsExperiment3;
                            }
                        }
                        str = (String) morphlexDeeplinkRouter$getMorphlexConfigExperiment$1.L$0;
                        kotlin.b.b(obj);
                    }
                    morphlexConfigurationsExperiment = (MorphlexConfigurationsExperiment) obj;
                    MorphlexConfigurationsExperiment.Companion.getClass();
                    if (jl40.l(morphlexConfigurationsExperiment, MorphlexConfigurationsExperiment.d)) {
                        return morphlexConfigurationsExperiment;
                    }
                    SimpleSpinnerModalView a = this.J.a();
                    try {
                        morphlexDeeplinkRouter$getMorphlexConfigExperiment$1.L$0 = null;
                        morphlexDeeplinkRouter$getMorphlexConfigExperiment$1.L$1 = a;
                        morphlexDeeplinkRouter$getMorphlexConfigExperiment$1.label = 2;
                        Object R = R(str, morphlexDeeplinkRouter$getMorphlexConfigExperiment$1);
                        if (R != coroutineSingletons) {
                            obj = R;
                            simpleSpinnerModalView = a;
                            MorphlexConfigurationsExperiment.Companion.getClass();
                            qn11 qn11Var2 = MorphlexConfigurationsExperiment.d;
                            b = ((MorphlexScenarioContextResponse) obj).b(MorphlexConfigurationsExperiment.class);
                            if (b == null) {
                            }
                            MorphlexConfigurationsExperiment morphlexConfigurationsExperiment22 = (MorphlexConfigurationsExperiment) qn11Var2;
                            simpleSpinnerModalView.dismiss();
                            return morphlexConfigurationsExperiment22;
                        }
                        return coroutineSingletons;
                    } catch (CancellationException e2) {
                        throw e2;
                    } catch (Throwable unused2) {
                        simpleSpinnerModalView = a;
                        MorphlexConfigurationsExperiment.Companion.getClass();
                        MorphlexConfigurationsExperiment morphlexConfigurationsExperiment32 = MorphlexConfigurationsExperiment.d;
                        simpleSpinnerModalView.dismiss();
                        return morphlexConfigurationsExperiment32;
                    }
                }
            }
            if (i != 0) {
            }
            morphlexConfigurationsExperiment = (MorphlexConfigurationsExperiment) obj;
            MorphlexConfigurationsExperiment.Companion.getClass();
            if (jl40.l(morphlexConfigurationsExperiment, MorphlexConfigurationsExperiment.d)) {
            }
        } catch (Throwable th) {
            dismiss();
            throw th;
        }
        morphlexDeeplinkRouter$getMorphlexConfigExperiment$1 = new MorphlexDeeplinkRouter$getMorphlexConfigExperiment$1(this, continuationImpl);
        Object obj2 = morphlexDeeplinkRouter$getMorphlexConfigExperiment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = morphlexDeeplinkRouter$getMorphlexConfigExperiment$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object R(String str, ContinuationImpl continuationImpl) {
        MorphlexDeeplinkRouter$requestScenarioContext$1 morphlexDeeplinkRouter$requestScenarioContext$1;
        int i;
        if (continuationImpl instanceof MorphlexDeeplinkRouter$requestScenarioContext$1) {
            morphlexDeeplinkRouter$requestScenarioContext$1 = (MorphlexDeeplinkRouter$requestScenarioContext$1) continuationImpl;
            int i2 = morphlexDeeplinkRouter$requestScenarioContext$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                morphlexDeeplinkRouter$requestScenarioContext$1.label = i2 - Integer.MIN_VALUE;
                Object obj = morphlexDeeplinkRouter$requestScenarioContext$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = morphlexDeeplinkRouter$requestScenarioContext$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MorphlexDeeplinkRouter$requestScenarioContext$param$1 morphlexDeeplinkRouter$requestScenarioContext$param$1 = new MorphlexDeeplinkRouter$requestScenarioContext$param$1(this, str, null);
                    morphlexDeeplinkRouter$requestScenarioContext$1.L$0 = null;
                    morphlexDeeplinkRouter$requestScenarioContext$1.label = 1;
                    obj = bvf0.n(morphlexDeeplinkRouter$requestScenarioContext$param$1, morphlexDeeplinkRouter$requestScenarioContext$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                cmt<MorphlexScenarioContextResponse> a = ((MorphlexApi) this.E.get()).a((MorphlexScenarioContextParam) obj);
                morphlexDeeplinkRouter$requestScenarioContext$1.L$0 = null;
                morphlexDeeplinkRouter$requestScenarioContext$1.L$1 = null;
                morphlexDeeplinkRouter$requestScenarioContext$1.L$2 = null;
                morphlexDeeplinkRouter$requestScenarioContext$1.label = 2;
                Object a2 = ru.yandex.taxi.network.api.a.a(a, null, morphlexDeeplinkRouter$requestScenarioContext$1);
                return a2 != coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        morphlexDeeplinkRouter$requestScenarioContext$1 = new MorphlexDeeplinkRouter$requestScenarioContext$1(this, continuationImpl);
        Object obj2 = morphlexDeeplinkRouter$requestScenarioContext$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = morphlexDeeplinkRouter$requestScenarioContext$1.label;
        if (i != 0) {
        }
        cmt<MorphlexScenarioContextResponse> a3 = ((MorphlexApi) this.E.get()).a((MorphlexScenarioContextParam) obj2);
        morphlexDeeplinkRouter$requestScenarioContext$1.L$0 = null;
        morphlexDeeplinkRouter$requestScenarioContext$1.L$1 = null;
        morphlexDeeplinkRouter$requestScenarioContext$1.L$2 = null;
        morphlexDeeplinkRouter$requestScenarioContext$1.label = 2;
        Object a22 = ru.yandex.taxi.network.api.a.a(a3, null, morphlexDeeplinkRouter$requestScenarioContext$1);
        if (a22 != coroutineSingletons2) {
        }
    }
}
