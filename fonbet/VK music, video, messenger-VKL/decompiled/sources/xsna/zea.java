package xsna;

import com.vk.catalog.mvi.section.domain.CatalogReorderData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONArray;

/* compiled from: CatalogSectionRepositoryImpl.kt */
/* loaded from: classes16.dex */
public final class zea {
    public final q4a a;

    public zea(q4a q4aVar) {
        this.a = q4aVar;
    }

    public static final String a(zea zeaVar, List list) {
        zeaVar.getClass();
        List<CatalogReorderData> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (CatalogReorderData catalogReorderData : list2) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(catalogReorderData.b);
            jSONArray.put(catalogReorderData.d);
            jSONArray.put(catalogReorderData.c < catalogReorderData.e ? 1 : -1);
            arrayList.add(jSONArray);
        }
        return new JSONArray((Collection) arrayList).toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        nea neaVar;
        int i;
        if (continuationImpl instanceof nea) {
            neaVar = (nea) continuationImpl;
            int i2 = neaVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                neaVar.label = i2 - Integer.MIN_VALUE;
                Object obj = neaVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = neaVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    oea oeaVar = new oea(str, str2, this, null);
                    neaVar.L$0 = null;
                    neaVar.L$1 = null;
                    neaVar.label = 1;
                    obj = myc0.k(b, oeaVar, neaVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        neaVar = new nea(this, continuationImpl);
        Object obj2 = neaVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = neaVar.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, ContinuationImpl continuationImpl) {
        pea peaVar;
        int i;
        if (continuationImpl instanceof pea) {
            peaVar = (pea) continuationImpl;
            int i2 = peaVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                peaVar.label = i2 - Integer.MIN_VALUE;
                Object obj = peaVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = peaVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    qea qeaVar = new qea(list, this, null);
                    peaVar.L$0 = null;
                    peaVar.label = 1;
                    obj = myc0.k(b, qeaVar, peaVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        peaVar = new pea(this, continuationImpl);
        Object obj2 = peaVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = peaVar.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, ContinuationImpl continuationImpl) {
        rea reaVar;
        int i;
        if (continuationImpl instanceof rea) {
            reaVar = (rea) continuationImpl;
            int i2 = reaVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                reaVar.label = i2 - Integer.MIN_VALUE;
                Object obj = reaVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = reaVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    sea seaVar = new sea(str, str2, this, null);
                    reaVar.L$0 = null;
                    reaVar.L$1 = null;
                    reaVar.label = 1;
                    obj = myc0.k(b, seaVar, reaVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        reaVar = new rea(this, continuationImpl);
        Object obj2 = reaVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = reaVar.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        tea teaVar;
        int i;
        if (continuationImpl instanceof tea) {
            teaVar = (tea) continuationImpl;
            int i2 = teaVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                teaVar.label = i2 - Integer.MIN_VALUE;
                Object obj = teaVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = teaVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    uea ueaVar = new uea(str, null);
                    teaVar.L$0 = null;
                    teaVar.label = 1;
                    obj = myc0.k(b, ueaVar, teaVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        teaVar = new tea(this, continuationImpl);
        Object obj2 = teaVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = teaVar.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(long j, int i, Integer num, Integer num2, ContinuationImpl continuationImpl) {
        vea veaVar;
        int i2;
        if (continuationImpl instanceof vea) {
            veaVar = (vea) continuationImpl;
            int i3 = veaVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                veaVar.label = i3 - Integer.MIN_VALUE;
                Object obj = veaVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = veaVar.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    wea weaVar = new wea(i, j, num, num2, null);
                    veaVar.L$0 = null;
                    veaVar.L$1 = null;
                    veaVar.J$0 = j;
                    veaVar.I$0 = i;
                    veaVar.label = 1;
                    obj = myc0.k(b, weaVar, veaVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        veaVar = new vea(this, continuationImpl);
        Object obj2 = veaVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = veaVar.label;
        if (i2 != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, List list, ContinuationImpl continuationImpl) {
        xea xeaVar;
        int i;
        if (continuationImpl instanceof xea) {
            xeaVar = (xea) continuationImpl;
            int i2 = xeaVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xeaVar.label = i2 - Integer.MIN_VALUE;
                Object obj = xeaVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = xeaVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    yea yeaVar = new yea(str, this, list, null);
                    xeaVar.L$0 = null;
                    xeaVar.L$1 = null;
                    xeaVar.label = 1;
                    obj = myc0.k(b, yeaVar, xeaVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        xeaVar = new xea(this, continuationImpl);
        Object obj2 = xeaVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = xeaVar.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
