package com.yandex.go.scooters.insurance.data;

import defpackage.bvf0;
import defpackage.c5w;
import defpackage.c6z;
import defpackage.cvu0;
import defpackage.d6z;
import defpackage.evu0;
import defpackage.fef;
import defpackage.h5w;
import defpackage.m7n0;
import defpackage.ny61;
import defpackage.t7s;
import defpackage.xdf;
import defpackage.y1b1;
import java.text.NumberFormat;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.scooters.experiments.ScootersClientInsuranceNewExperiment;

/* loaded from: classes13.dex */
public final class b {
    public final xdf a;
    public final ru.yandex.taxi.widget.c b;
    public final h c;
    public final m7n0 d;

    public b(xdf xdfVar, ru.yandex.taxi.widget.c cVar, h hVar, m7n0 m7n0Var) {
        this.a = xdfVar;
        this.b = cVar;
        this.c = hVar;
        this.d = m7n0Var;
    }

    public final String a(long j, String str) {
        fef fefVar = this.c.a().f;
        double d = j / 100.0d;
        String b = this.a.b(new fef(fefVar.a, fefVar.b, str, fefVar.d), Double.valueOf(d));
        NumberFormat numberFormat = t7s.c;
        return cvu0.v(cvu0.v(b, "$INSURANCE_PRICE$", numberFormat.format(d), false), "$INSURANCE_COVERAGE$", numberFormat.format(d), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        ScootersInsuranceExperimentRepository$getDescriptionKey$1 scootersInsuranceExperimentRepository$getDescriptionKey$1;
        int i;
        h5w h5wVar;
        if (continuationImpl instanceof ScootersInsuranceExperimentRepository$getDescriptionKey$1) {
            scootersInsuranceExperimentRepository$getDescriptionKey$1 = (ScootersInsuranceExperimentRepository$getDescriptionKey$1) continuationImpl;
            int i2 = scootersInsuranceExperimentRepository$getDescriptionKey$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceExperimentRepository$getDescriptionKey$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersInsuranceExperimentRepository$getDescriptionKey$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceExperimentRepository$getDescriptionKey$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersInsuranceExperimentRepository$getDescriptionKey$1.label = 1;
                    obj = this.d.a.b(scootersInsuranceExperimentRepository$getDescriptionKey$1);
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
                ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment = (ScootersClientInsuranceNewExperiment) obj;
                h5wVar = scootersClientInsuranceNewExperiment.h;
                c5w c5wVar = scootersClientInsuranceNewExperiment.g;
                if (!y1b1.a(h5wVar)) {
                    h5w h5wVar2 = scootersClientInsuranceNewExperiment.h;
                    if (h5wVar2 != null) {
                        return h5wVar2.b;
                    }
                } else if (y1b1.a(c5wVar) && c5wVar != null) {
                    return c5wVar.b;
                }
                return null;
            }
        }
        scootersInsuranceExperimentRepository$getDescriptionKey$1 = new ScootersInsuranceExperimentRepository$getDescriptionKey$1(this, continuationImpl);
        Object obj2 = scootersInsuranceExperimentRepository$getDescriptionKey$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceExperimentRepository$getDescriptionKey$1.label;
        if (i != 0) {
        }
        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment2 = (ScootersClientInsuranceNewExperiment) obj2;
        h5wVar = scootersClientInsuranceNewExperiment2.h;
        c5w c5wVar2 = scootersClientInsuranceNewExperiment2.g;
        if (!y1b1.a(h5wVar)) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ScootersInsuranceExperimentRepository$getIconTag$1 scootersInsuranceExperimentRepository$getIconTag$1;
        int i;
        h5w h5wVar;
        if (continuationImpl instanceof ScootersInsuranceExperimentRepository$getIconTag$1) {
            scootersInsuranceExperimentRepository$getIconTag$1 = (ScootersInsuranceExperimentRepository$getIconTag$1) continuationImpl;
            int i2 = scootersInsuranceExperimentRepository$getIconTag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceExperimentRepository$getIconTag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersInsuranceExperimentRepository$getIconTag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceExperimentRepository$getIconTag$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersInsuranceExperimentRepository$getIconTag$1.label = 1;
                    obj = this.d.a.b(scootersInsuranceExperimentRepository$getIconTag$1);
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
                ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment = (ScootersClientInsuranceNewExperiment) obj;
                h5wVar = scootersClientInsuranceNewExperiment.h;
                c5w c5wVar = scootersClientInsuranceNewExperiment.g;
                if (!y1b1.a(h5wVar)) {
                    h5w h5wVar2 = scootersClientInsuranceNewExperiment.h;
                    if (h5wVar2 != null) {
                        return h5wVar2.c;
                    }
                } else if (y1b1.a(c5wVar) && c5wVar != null) {
                    return c5wVar.c;
                }
                return null;
            }
        }
        scootersInsuranceExperimentRepository$getIconTag$1 = new ScootersInsuranceExperimentRepository$getIconTag$1(this, continuationImpl);
        Object obj2 = scootersInsuranceExperimentRepository$getIconTag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceExperimentRepository$getIconTag$1.label;
        if (i != 0) {
        }
        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment2 = (ScootersClientInsuranceNewExperiment) obj2;
        h5wVar = scootersClientInsuranceNewExperiment2.h;
        c5w c5wVar2 = scootersClientInsuranceNewExperiment2.g;
        if (!y1b1.a(h5wVar)) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004a, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ScootersInsuranceExperimentRepository$getInsuranceDescription$1 scootersInsuranceExperimentRepository$getInsuranceDescription$1;
        Object obj;
        int i;
        Object b;
        c6z c6zVar;
        String str;
        if (continuationImpl instanceof ScootersInsuranceExperimentRepository$getInsuranceDescription$1) {
            scootersInsuranceExperimentRepository$getInsuranceDescription$1 = (ScootersInsuranceExperimentRepository$getInsuranceDescription$1) continuationImpl;
            int i2 = scootersInsuranceExperimentRepository$getInsuranceDescription$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceExperimentRepository$getInsuranceDescription$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersInsuranceExperimentRepository$getInsuranceDescription$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceExperimentRepository$getInsuranceDescription$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    scootersInsuranceExperimentRepository$getInsuranceDescription$1.label = 1;
                    obj2 = this.d.a.b(scootersInsuranceExperimentRepository$getInsuranceDescription$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c6zVar = (c6z) scootersInsuranceExperimentRepository$getInsuranceDescription$1.L$1;
                        kotlin.b.b(obj2);
                        str = (String) obj2;
                        if (str == null) {
                            str = "";
                        }
                        return a(this.c.a().g.c, d6z.Y(c6zVar, str));
                    }
                    kotlin.b.b(obj2);
                }
                ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment = (ScootersClientInsuranceNewExperiment) obj2;
                scootersInsuranceExperimentRepository$getInsuranceDescription$1.L$0 = null;
                scootersInsuranceExperimentRepository$getInsuranceDescription$1.L$1 = scootersClientInsuranceNewExperiment;
                scootersInsuranceExperimentRepository$getInsuranceDescription$1.label = 2;
                b = b(scootersInsuranceExperimentRepository$getInsuranceDescription$1);
                if (b != obj) {
                    c6zVar = scootersClientInsuranceNewExperiment;
                    obj2 = b;
                    str = (String) obj2;
                    if (str == null) {
                    }
                    return a(this.c.a().g.c, d6z.Y(c6zVar, str));
                }
                return obj;
            }
        }
        scootersInsuranceExperimentRepository$getInsuranceDescription$1 = new ScootersInsuranceExperimentRepository$getInsuranceDescription$1(this, continuationImpl);
        Object obj22 = scootersInsuranceExperimentRepository$getInsuranceDescription$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceExperimentRepository$getInsuranceDescription$1.label;
        if (i != 0) {
        }
        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment2 = (ScootersClientInsuranceNewExperiment) obj22;
        scootersInsuranceExperimentRepository$getInsuranceDescription$1.L$0 = null;
        scootersInsuranceExperimentRepository$getInsuranceDescription$1.L$1 = scootersClientInsuranceNewExperiment2;
        scootersInsuranceExperimentRepository$getInsuranceDescription$1.label = 2;
        b = b(scootersInsuranceExperimentRepository$getInsuranceDescription$1);
        if (b != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x004a, code lost:
    
        if (r7 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        ScootersInsuranceExperimentRepository$getInsuranceDisableConfig$1 scootersInsuranceExperimentRepository$getInsuranceDisableConfig$1;
        int i;
        ScootersClientInsuranceNewExperiment.a aVar;
        if (continuationImpl instanceof ScootersInsuranceExperimentRepository$getInsuranceDisableConfig$1) {
            scootersInsuranceExperimentRepository$getInsuranceDisableConfig$1 = (ScootersInsuranceExperimentRepository$getInsuranceDisableConfig$1) continuationImpl;
            int i2 = scootersInsuranceExperimentRepository$getInsuranceDisableConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceExperimentRepository$getInsuranceDisableConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersInsuranceExperimentRepository$getInsuranceDisableConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceExperimentRepository$getInsuranceDisableConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersInsuranceExperimentRepository$getInsuranceDisableConfig$1.label = 1;
                    obj = this.d.a.b(scootersInsuranceExperimentRepository$getInsuranceDisableConfig$1);
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
                ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment = (ScootersClientInsuranceNewExperiment) obj;
                aVar = scootersClientInsuranceNewExperiment.i;
                if (aVar != null) {
                    if (!aVar.a) {
                        aVar = null;
                    }
                    if (aVar != null) {
                        if (evu0.J(aVar.b)) {
                            aVar = null;
                        }
                        if (aVar != null) {
                            if (aVar.c.a.isEmpty() || aVar.d.a.isEmpty() || aVar.e.a.isEmpty()) {
                                aVar = null;
                            }
                            if (aVar != null) {
                                ScootersInsuranceExperimentRepository$getInsuranceDisableConfig$2 scootersInsuranceExperimentRepository$getInsuranceDisableConfig$2 = new ScootersInsuranceExperimentRepository$getInsuranceDisableConfig$2(this, null, aVar, scootersClientInsuranceNewExperiment);
                                scootersInsuranceExperimentRepository$getInsuranceDisableConfig$1.L$0 = null;
                                scootersInsuranceExperimentRepository$getInsuranceDisableConfig$1.L$1 = null;
                                scootersInsuranceExperimentRepository$getInsuranceDisableConfig$1.label = 2;
                                Object n = bvf0.n(scootersInsuranceExperimentRepository$getInsuranceDisableConfig$2, scootersInsuranceExperimentRepository$getInsuranceDisableConfig$1);
                                return n == coroutineSingletons ? coroutineSingletons : n;
                            }
                        }
                    }
                }
                return null;
            }
        }
        scootersInsuranceExperimentRepository$getInsuranceDisableConfig$1 = new ScootersInsuranceExperimentRepository$getInsuranceDisableConfig$1(this, continuationImpl);
        Object obj2 = scootersInsuranceExperimentRepository$getInsuranceDisableConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceExperimentRepository$getInsuranceDisableConfig$1.label;
        if (i != 0) {
        }
        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment2 = (ScootersClientInsuranceNewExperiment) obj2;
        aVar = scootersClientInsuranceNewExperiment2.i;
        if (aVar != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        ScootersInsuranceExperimentRepository$getPriceText$1 scootersInsuranceExperimentRepository$getPriceText$1;
        int i;
        String Y;
        if (continuationImpl instanceof ScootersInsuranceExperimentRepository$getPriceText$1) {
            scootersInsuranceExperimentRepository$getPriceText$1 = (ScootersInsuranceExperimentRepository$getPriceText$1) continuationImpl;
            int i2 = scootersInsuranceExperimentRepository$getPriceText$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersInsuranceExperimentRepository$getPriceText$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersInsuranceExperimentRepository$getPriceText$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersInsuranceExperimentRepository$getPriceText$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersInsuranceExperimentRepository$getPriceText$1.label = 1;
                    obj = this.d.a.b(scootersInsuranceExperimentRepository$getPriceText$1);
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
                ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment = (ScootersClientInsuranceNewExperiment) obj;
                String str = scootersClientInsuranceNewExperiment.e;
                Y = str != null ? d6z.Y(scootersClientInsuranceNewExperiment, str) : null;
                if (Y == null) {
                    Y = "";
                }
                return a(this.c.a().g.b, Y);
            }
        }
        scootersInsuranceExperimentRepository$getPriceText$1 = new ScootersInsuranceExperimentRepository$getPriceText$1(this, continuationImpl);
        Object obj2 = scootersInsuranceExperimentRepository$getPriceText$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersInsuranceExperimentRepository$getPriceText$1.label;
        if (i != 0) {
        }
        ScootersClientInsuranceNewExperiment scootersClientInsuranceNewExperiment2 = (ScootersClientInsuranceNewExperiment) obj2;
        String str2 = scootersClientInsuranceNewExperiment2.e;
        if (str2 != null) {
        }
        if (Y == null) {
        }
        return a(this.c.a().g.b, Y);
    }
}
