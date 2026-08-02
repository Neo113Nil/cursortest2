package com.yandex.go.scooters.data;

import com.yandex.go.scooters.data.model.ScootersLegalTermsExperiment;
import defpackage.awn0;
import defpackage.c8p0;
import defpackage.d6z;
import defpackage.d8p0;
import defpackage.dab1;
import defpackage.e8p0;
import defpackage.jbh;
import defpackage.jl40;
import defpackage.msb1;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.tpr;
import defpackage.xpb1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes13.dex */
public final class e implements q {
    public final /* synthetic */ q a;

    public e(rqo rqoVar) {
        ScootersLegalTermsExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(ScootersLegalTermsExperiment.f);
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (ScootersLegalTermsExperiment) this.a.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        if (r2 != null) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(ContinuationImpl continuationImpl) {
        ScootersLegalTermsExperimentRepository$getLegalTerms$1 scootersLegalTermsExperimentRepository$getLegalTerms$1;
        int i;
        ScootersLegalTermsExperiment scootersLegalTermsExperiment;
        List<ScootersLegalTermsExperiment.LegalTerms> list;
        e8p0 e8p0Var;
        if (continuationImpl instanceof ScootersLegalTermsExperimentRepository$getLegalTerms$1) {
            scootersLegalTermsExperimentRepository$getLegalTerms$1 = (ScootersLegalTermsExperimentRepository$getLegalTerms$1) continuationImpl;
            int i2 = scootersLegalTermsExperimentRepository$getLegalTerms$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersLegalTermsExperimentRepository$getLegalTerms$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersLegalTermsExperimentRepository$getLegalTerms$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersLegalTermsExperimentRepository$getLegalTerms$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersLegalTermsExperimentRepository$getLegalTerms$1.label = 1;
                    obj = this.a.b(scootersLegalTermsExperimentRepository$getLegalTerms$1);
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
                ScootersLegalTermsExperiment scootersLegalTermsExperiment2 = (ScootersLegalTermsExperiment) obj;
                scootersLegalTermsExperiment = !scootersLegalTermsExperiment2.h() ? scootersLegalTermsExperiment2 : null;
                if (scootersLegalTermsExperiment != null || (list = scootersLegalTermsExperiment.d) == null) {
                    return EmptyList.a;
                }
                ArrayList arrayList = new ArrayList();
                for (ScootersLegalTermsExperiment.LegalTerms legalTerms : list) {
                    String str = legalTerms.c;
                    if (jl40.l(str, "yandex")) {
                        e8p0Var = d8p0.a;
                    } else {
                        e8p0 e8p0Var2 = dab1.P;
                        if (!jl40.l(str, "jet")) {
                            e8p0Var2 = xpb1.Q;
                            if (!jl40.l(str, "jet_abroad")) {
                                e8p0Var2 = msb1.S;
                                if (!jl40.l(str, "velobike")) {
                                    if (str != null) {
                                        if (str.length() <= 0) {
                                            str = null;
                                        }
                                    }
                                    str = null;
                                    if (str != null) {
                                        e8p0Var2 = new c8p0(str);
                                    } else {
                                        e8p0Var = null;
                                    }
                                }
                            }
                        }
                        e8p0Var = e8p0Var2;
                    }
                    awn0 awn0Var = e8p0Var == null ? null : new awn0(d6z.Y(scootersLegalTermsExperiment2, legalTerms.a), legalTerms.b, e8p0Var);
                    if (awn0Var != null) {
                        arrayList.add(awn0Var);
                    }
                }
                return arrayList;
            }
        }
        scootersLegalTermsExperimentRepository$getLegalTerms$1 = new ScootersLegalTermsExperimentRepository$getLegalTerms$1(this, continuationImpl);
        Object obj2 = scootersLegalTermsExperimentRepository$getLegalTerms$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersLegalTermsExperimentRepository$getLegalTerms$1.label;
        if (i != 0) {
        }
        ScootersLegalTermsExperiment scootersLegalTermsExperiment22 = (ScootersLegalTermsExperiment) obj2;
        if (!scootersLegalTermsExperiment22.h()) {
        }
        if (scootersLegalTermsExperiment != null) {
        }
        return EmptyList.a;
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
