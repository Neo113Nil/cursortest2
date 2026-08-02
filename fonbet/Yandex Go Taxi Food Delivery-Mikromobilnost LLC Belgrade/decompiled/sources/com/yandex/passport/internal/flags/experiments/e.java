package com.yandex.passport.internal.flags.experiments;

import android.text.TextUtils;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.network.c2;
import com.yandex.passport.data.network.d2;
import com.yandex.passport.data.network.l2;
import com.yandex.passport.data.network.m2;
import com.yandex.passport.internal.report.f7;
import com.yandex.passport.internal.report.g7;
import com.yandex.passport.internal.report.h7;
import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.pd;
import com.yandex.passport.internal.report.reporters.b0;
import com.yandex.passport.internal.report.yd;
import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.ffx;
import defpackage.ny61;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.n0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes8.dex */
public final class e {
    public final m2 a;
    public final g b;
    public final com.yandex.passport.data.network.k c;
    public final b0 d;
    public final com.yandex.passport.common.analytics.d e;
    public final com.yandex.passport.internal.network.mappers.b f;
    public final n0 g = ffx.c(1, 0, null, 6);

    public e(m2 m2Var, g gVar, com.yandex.passport.data.network.k kVar, b0 b0Var, com.yandex.passport.common.analytics.d dVar, com.yandex.passport.internal.network.mappers.b bVar) {
        this.a = m2Var;
        this.b = gVar;
        this.c = kVar;
        this.d = b0Var;
        this.e = dVar;
        this.f = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x00ba, code lost:
    
        if (r1 == r3) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Environment environment, ContinuationImpl continuationImpl) {
        ExperimentsFetcher$fetchExperiments$1 experimentsFetcher$fetchExperiments$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object value;
        zy11 zy11Var;
        n0 n0Var;
        Result result;
        e eVar;
        Result result2;
        zy11 zy11Var2;
        int i2;
        Throwable a;
        e eVar2 = this;
        if (continuationImpl instanceof ExperimentsFetcher$fetchExperiments$1) {
            experimentsFetcher$fetchExperiments$1 = (ExperimentsFetcher$fetchExperiments$1) continuationImpl;
            int i3 = experimentsFetcher$fetchExperiments$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                experimentsFetcher$fetchExperiments$1.label = i3 - Integer.MIN_VALUE;
                Object obj = experimentsFetcher$fetchExperiments$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = experimentsFetcher$fetchExperiments$1.label;
                zy11 zy11Var3 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "fetchExperiments()", 8);
                    }
                    String str = eVar2.e.b().a;
                    if (str == null) {
                        str = null;
                    }
                    if (str == null) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "Unknown device id, experiments will be updated later", 8);
                        }
                        Exception exc = new Exception("Unknown device id, experiments will be updated later");
                        b0 b0Var = eVar2.d;
                        b0Var.getClass();
                        b0Var.f(g7.w, new yd(exc), new ld(exc));
                        return zy11Var3;
                    }
                    eVar2.f.getClass();
                    d2 d2Var = new d2(com.yandex.passport.internal.network.mappers.b.a(environment), str);
                    experimentsFetcher$fetchExperiments$1.L$0 = eVar2;
                    experimentsFetcher$fetchExperiments$1.label = 1;
                    obj = eVar2.a.a(d2Var, experimentsFetcher$fetchExperiments$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        result2 = (Result) experimentsFetcher$fetchExperiments$1.L$1;
                        eVar = (e) experimentsFetcher$fetchExperiments$1.L$0;
                        kotlin.b.b(obj);
                        zy11Var = zy11Var3;
                        Object value2 = result2.getValue();
                        a = Result.a(value2);
                        if (a != null) {
                            a aVar = (a) value2;
                            eVar.b.a(aVar);
                            b0 b0Var2 = eVar.d;
                            String str2 = aVar.c;
                            b0Var2.getClass();
                            h7 h7Var = h7.w;
                            if (str2 == null) {
                                str2 = "0";
                            }
                            b0Var2.f(h7Var, new com.yandex.passport.internal.report.f("server_date", str2));
                        } else {
                            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "fetchExperiments()", a);
                            }
                            b0 b0Var3 = eVar.d;
                            b0Var3.getClass();
                            b0Var3.f(g7.w, new yd(a), new ld(a));
                        }
                        return zy11Var;
                    }
                    eVar2 = (e) experimentsFetcher$fetchExperiments$1.L$0;
                    kotlin.b.b(obj);
                }
                Object obj2 = obj;
                e eVar3 = eVar2;
                value = ((Result) obj2).getValue();
                com.yandex.passport.data.network.k kVar = eVar3.c;
                if (!(value instanceof Result.Failure)) {
                    com.yandex.passport.data.models.h hVar = (com.yandex.passport.data.models.h) value;
                    b0 b0Var4 = (b0) kVar.a;
                    l2 l2Var = hVar.a;
                    if (TextUtils.equals(l2Var.a, WriteBlocks.OK)) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        List list = l2Var.b;
                        int size = list.size();
                        int i4 = 1;
                        int i5 = 0;
                        while (i5 < size) {
                            try {
                                List list2 = ((c2) list.get(i5)).b.a;
                                ArrayList arrayList = new ArrayList();
                                Iterator it = list2.iterator();
                                int i6 = i4;
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    if (com.yandex.passport.data.network.k.b(str3, "appID")) {
                                        com.yandex.passport.data.network.k.d(str3, linkedHashMap2, arrayList);
                                    } else if (com.yandex.passport.data.network.k.b(str3, "am_version")) {
                                        com.yandex.passport.data.network.k.c(str3, linkedHashMap2, arrayList);
                                    } else {
                                        if (i6 == 0) {
                                            arrayList.clear();
                                            i6 = i4;
                                        }
                                        Iterator it2 = it;
                                        zy11Var2 = zy11Var3;
                                        try {
                                            String[] strArr = (String[]) new Regex("=").l(2, str3).toArray(new String[0]);
                                            arrayList.add(strArr[0]);
                                            linkedHashMap.put(strArr[0], strArr[i4]);
                                            it = it2;
                                            zy11Var3 = zy11Var2;
                                        } catch (Exception e) {
                                            e = e;
                                            b0Var4.getClass();
                                            f7 f7Var = f7.w;
                                            i2 = size;
                                            pd[] pdVarArr = new pd[i4];
                                            pdVarArr[0] = new md("flags", 12, false);
                                            b0Var4.f(f7Var, pdVarArr);
                                            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                                com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "parseExperimentsResponse()", e);
                                            }
                                            i5++;
                                            size = i2;
                                            zy11Var3 = zy11Var2;
                                            i4 = 1;
                                        }
                                    }
                                    i6 = 0;
                                }
                                zy11Var2 = zy11Var3;
                                i2 = size;
                            } catch (Exception e2) {
                                e = e2;
                                zy11Var2 = zy11Var3;
                            }
                            i5++;
                            size = i2;
                            zy11Var3 = zy11Var2;
                            i4 = 1;
                        }
                        zy11Var = zy11Var3;
                        value = new a(linkedHashMap, hVar.b, linkedHashMap2);
                        Result result3 = new Result(value);
                        Object value3 = result3.getValue();
                        n0Var = eVar3.g;
                        result = new Result(value3);
                        experimentsFetcher$fetchExperiments$1.L$0 = eVar3;
                        experimentsFetcher$fetchExperiments$1.L$1 = result3;
                        experimentsFetcher$fetchExperiments$1.label = 2;
                        if (n0Var.emit(result, experimentsFetcher$fetchExperiments$1) != coroutineSingletons) {
                            eVar = eVar3;
                            result2 = result3;
                            Object value22 = result2.getValue();
                            a = Result.a(value22);
                            if (a != null) {
                            }
                            return zy11Var;
                        }
                        return coroutineSingletons;
                    }
                    b0Var4.getClass();
                    b0Var4.f(f7.w, new md(ACSPConstants.STATUS, 12, false));
                    value = new a(kotlin.collections.b.f(), null, kotlin.collections.b.f());
                }
                zy11Var = zy11Var3;
                Result result32 = new Result(value);
                Object value32 = result32.getValue();
                n0Var = eVar3.g;
                result = new Result(value32);
                experimentsFetcher$fetchExperiments$1.L$0 = eVar3;
                experimentsFetcher$fetchExperiments$1.L$1 = result32;
                experimentsFetcher$fetchExperiments$1.label = 2;
                if (n0Var.emit(result, experimentsFetcher$fetchExperiments$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        experimentsFetcher$fetchExperiments$1 = new ExperimentsFetcher$fetchExperiments$1(eVar2, continuationImpl);
        Object obj3 = experimentsFetcher$fetchExperiments$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = experimentsFetcher$fetchExperiments$1.label;
        zy11 zy11Var32 = zy11.a;
        if (i != 0) {
        }
        Object obj22 = obj3;
        e eVar32 = eVar2;
        value = ((Result) obj22).getValue();
        com.yandex.passport.data.network.k kVar2 = eVar32.c;
        if (!(value instanceof Result.Failure)) {
        }
        zy11Var = zy11Var32;
        Result result322 = new Result(value);
        Object value322 = result322.getValue();
        n0Var = eVar32.g;
        result = new Result(value322);
        experimentsFetcher$fetchExperiments$1.L$0 = eVar32;
        experimentsFetcher$fetchExperiments$1.L$1 = result322;
        experimentsFetcher$fetchExperiments$1.label = 2;
        if (n0Var.emit(result, experimentsFetcher$fetchExperiments$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
