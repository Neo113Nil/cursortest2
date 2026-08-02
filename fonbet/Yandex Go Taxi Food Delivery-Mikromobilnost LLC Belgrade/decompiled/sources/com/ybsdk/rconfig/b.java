package com.ybsdk.rconfig;

import android.content.Context;
import android.content.SharedPreferences;
import com.squareup.moshi.Moshi;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.KycOnlinePhotoConfig;
import com.ybsdk.rconfig.configs.KycOnlinePhotoImagesConfig;
import com.ybsdk.rconfig.configs.OrientationAwareRecyclerConfig;
import com.ybsdk.rconfig.configs.QrReaderContentConfig;
import com.ybsdk.rconfig.configs.RotationConfiguration;
import com.ybsdk.rconfig.configs.SavingsAccountImages;
import com.ybsdk.rconfig.configs.ShimmersConfigImpl;
import com.ybsdk.rconfig.configs.WebViewRedirectStallRetryConfig;
import com.ybsdk.rconfig.configs.YbDivkitSkeletonsConfig;
import com.ybsdk.rconfig.configs.YbMobileTabBarConfig;
import defpackage.avi0;
import defpackage.bvi0;
import defpackage.bxk0;
import defpackage.dfr;
import defpackage.fnx;
import defpackage.g2z;
import defpackage.gq80;
import defpackage.gw00;
import defpackage.ike;
import defpackage.in2;
import defpackage.kg51;
import defpackage.kqe0;
import defpackage.lpc;
import defpackage.n4m0;
import defpackage.nbp0;
import defpackage.oz51;
import defpackage.qui0;
import defpackage.sui0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.uui0;
import defpackage.vbg0;
import defpackage.vw51;
import defpackage.w4o;
import defpackage.w511;
import defpackage.wlp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes8.dex */
public final class b {
    public final bvi0 a;
    public final g2z b;
    public final Moshi c;
    public final Context d;
    public final boolean e;
    public final w4o f;
    public final nbp0 g;
    public final uui0 h;
    public final a i;
    public sui0 m;
    public sui0 n;
    public final LinkedHashMap k = new LinkedHashMap();
    public final Object l = new Object();
    public final LinkedHashMap j = j(ExperimentApplyType.COLD_START);

    public b(bvi0 bvi0Var, g2z g2zVar, Moshi moshi, Context context, kg51 kg51Var, boolean z, w4o w4oVar, nbp0 nbp0Var, uui0 uui0Var) {
        this.a = bvi0Var;
        this.b = g2zVar;
        this.c = moshi;
        this.d = context;
        this.e = z;
        this.f = w4oVar;
        this.g = nbp0Var;
        this.h = uui0Var;
        this.i = new a(context, w4oVar);
        o();
    }

    public final CommonFeatureFlag a() {
        return (CommonFeatureFlag) d(wlp.J0).getData();
    }

    public final DashboardSkinSelection b() {
        return (DashboardSkinSelection) d(this.i.l).getData();
    }

    public final LinkedHashMap c() {
        List<dfr> list = this.i.u;
        int d = gw00.d(tcc.n(list, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (dfr dfrVar : list) {
            Pair pair = new Pair(dfrVar.a, this.c.adapter(dfrVar.b).toJson(d(dfrVar)));
            linkedHashMap.put(pair.c(), pair.f());
        }
        return linkedHashMap;
    }

    public final CommonExperiment d(dfr dfrVar) {
        CommonExperiment commonExperiment;
        CommonExperiment commonExperiment2;
        int i = qui0.a[dfrVar.c.getApplyType().ordinal()];
        if (i == 1) {
            Object obj = this.j.get(dfrVar.a);
            commonExperiment = obj instanceof CommonExperiment ? (CommonExperiment) obj : null;
            return commonExperiment == null ? dfrVar.c : commonExperiment;
        }
        if (i != 2) {
            if (i == 3) {
                return (CommonExperiment) i(dfrVar);
            }
            w511.b();
            return null;
        }
        synchronized (this.l) {
            Object obj2 = this.k.get(dfrVar.a);
            commonExperiment2 = obj2 instanceof CommonExperiment ? (CommonExperiment) obj2 : null;
        }
        if (commonExperiment2 != null) {
            return commonExperiment2;
        }
        Object obj3 = this.j.get(dfrVar.a);
        commonExperiment = obj3 instanceof CommonExperiment ? (CommonExperiment) obj3 : null;
        return commonExperiment == null ? dfrVar.c : commonExperiment;
    }

    public final KycOnlinePhotoConfig e() {
        return (KycOnlinePhotoConfig) d(fnx.a).getData();
    }

    public final KycOnlinePhotoImagesConfig f() {
        return (KycOnlinePhotoImagesConfig) d(fnx.b).getData();
    }

    public final OrientationAwareRecyclerConfig g() {
        return (OrientationAwareRecyclerConfig) d(gq80.a).getData();
    }

    public final QrReaderContentConfig h() {
        return (QrReaderContentConfig) d(vbg0.a).getData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v4, types: [T, java.lang.String] */
    public final Object i(dfr dfrVar) {
        Object obj;
        bvi0 bvi0Var = this.a;
        ike ikeVar = this.g.a;
        boolean z = this.e;
        uui0 uui0Var = this.h;
        SharedPreferences sharedPreferences = this.b.a;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object obj2 = null;
        try {
            ?? string = sharedPreferences.getString(dfrVar.a, null);
            ref$ObjectRef.element = string;
            obj = uui0Var.a(dfrVar, string, new kqe0(7, dfrVar, this, ref$ObjectRef));
        } catch (Exception e) {
            if (z) {
                tje.N(ikeVar, null, null, new RemoteConfig$readLatestValue$localValue$2(this, dfrVar, null), 3);
            }
            sharedPreferences.edit().remove(dfrVar.a).apply();
            sui0 sui0Var = this.m;
            if (sui0Var != null) {
                sui0Var.invoke(dfrVar.a, ref$ObjectRef.element, e);
            }
            obj = null;
        }
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        try {
            ?? string2 = ((avi0) bvi0Var).a.getString(dfrVar.a, null);
            ref$ObjectRef2.element = string2;
            obj2 = uui0Var.a(dfrVar, string2, new in2(20, dfrVar, this, ref$ObjectRef2));
        } catch (Exception e2) {
            if (z) {
                tje.N(ikeVar, null, null, new RemoteConfig$readLatestValue$remoteValue$2(this, dfrVar, null), 3);
            }
            ((avi0) bvi0Var).a.edit().remove(dfrVar.a).apply();
            sui0 sui0Var2 = this.n;
            if (sui0Var2 != null) {
                sui0Var2.invoke(dfrVar.a, ref$ObjectRef2.element, e2);
            }
        }
        return obj == null ? obj2 == null ? dfrVar.c : obj2 : obj;
    }

    public final LinkedHashMap j(ExperimentApplyType experimentApplyType) {
        List list = this.i.u;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((dfr) obj).c.getApplyType() == experimentApplyType) {
                arrayList.add(obj);
            }
        }
        int d = gw00.d(tcc.n(arrayList, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dfr dfrVar = (dfr) it.next();
            Pair pair = new Pair(dfrVar.a, i(dfrVar));
            linkedHashMap.put(pair.c(), pair.f());
        }
        return linkedHashMap;
    }

    public final RotationConfiguration k() {
        return (RotationConfiguration) d(bxk0.a).getData();
    }

    public final SavingsAccountImages l() {
        return (SavingsAccountImages) d(n4m0.d).getData();
    }

    public final ShimmersConfigImpl m() {
        return (ShimmersConfigImpl) d(lpc.a).getData();
    }

    public final CommonFeatureFlag n() {
        return (CommonFeatureFlag) d(wlp.Q).getData();
    }

    public final void o() {
        LinkedHashMap j = j(ExperimentApplyType.HOT_START);
        synchronized (this.l) {
            this.k.clear();
            this.k.putAll(j);
        }
    }

    public final WebViewRedirectStallRetryConfig p() {
        return (WebViewRedirectStallRetryConfig) d(oz51.a).getData();
    }

    public final YbMobileTabBarConfig q() {
        return (YbMobileTabBarConfig) d(this.i.q).getData();
    }

    public final YbDivkitSkeletonsConfig r() {
        return (YbDivkitSkeletonsConfig) d(vw51.a).getData();
    }
}
