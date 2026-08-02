package com.yandex.plus.experiments.impl.providers;

import defpackage.fro;
import defpackage.iro;
import defpackage.jro;
import defpackage.k2d0;
import defpackage.kro;
import defpackage.kzs;
import defpackage.l2d0;
import defpackage.lro;
import defpackage.ny61;
import defpackage.qje;
import defpackage.vf70;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b implements l2d0 {
    public final com.yandex.plus.core.graphql.internal.b a;
    public final kzs b;
    public final fro c;
    public final Map d;

    public b(com.yandex.plus.core.graphql.internal.b bVar, kzs kzsVar, fro froVar, Map map) {
        this.a = bVar;
        this.b = kzsVar;
        this.c = froVar;
        this.d = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.l2d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        GraphQlExperimentsDataSource$getExperiments$1 graphQlExperimentsDataSource$getExperiments$1;
        int i;
        Object a;
        if (continuationImpl instanceof GraphQlExperimentsDataSource$getExperiments$1) {
            graphQlExperimentsDataSource$getExperiments$1 = (GraphQlExperimentsDataSource$getExperiments$1) continuationImpl;
            int i2 = graphQlExperimentsDataSource$getExperiments$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                graphQlExperimentsDataSource$getExperiments$1.label = i2 - Integer.MIN_VALUE;
                Object obj = graphQlExperimentsDataSource$getExperiments$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = graphQlExperimentsDataSource$getExperiments$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    lro lroVar = new lro(qje.c0(this.b.a()), qje.c0(this.d), vf70.a);
                    graphQlExperimentsDataSource$getExperiments$1.L$0 = null;
                    graphQlExperimentsDataSource$getExperiments$1.label = 1;
                    a = this.a.a(lroVar, graphQlExperimentsDataSource$getExperiments$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    return a;
                }
                this.c.getClass();
                jro jroVar = ((iro) a).a;
                ArrayList<kro> arrayList = jroVar.c;
                List M = kotlin.collections.a.M(arrayList);
                HashSet hashSet = new HashSet();
                Iterator it = M.iterator();
                while (it.hasNext()) {
                    ycc.r(((kro) it.next()).a, hashSet);
                }
                String str = jroVar.a;
                String str2 = jroVar.b;
                ArrayList arrayList2 = new ArrayList();
                for (kro kroVar : arrayList) {
                    Long valueOf = kroVar != null ? Long.valueOf(kroVar.b) : null;
                    if (valueOf != null) {
                        arrayList2.add(valueOf);
                    }
                }
                return new k2d0(str, str2, arrayList2, hashSet);
            }
        }
        graphQlExperimentsDataSource$getExperiments$1 = new GraphQlExperimentsDataSource$getExperiments$1(this, continuationImpl);
        Object obj2 = graphQlExperimentsDataSource$getExperiments$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = graphQlExperimentsDataSource$getExperiments$1.label;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
    }
}
