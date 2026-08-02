package com.yandex.go.scooters.passes.v2;

import com.yandex.go.scooters.data.model.ScootersSurgeExperiment;
import defpackage.afo0;
import defpackage.avj0;
import defpackage.bfo0;
import defpackage.c7o0;
import defpackage.d7o0;
import defpackage.e7o0;
import defpackage.f3p0;
import defpackage.igo0;
import defpackage.jgo0;
import defpackage.jl40;
import defpackage.kgo0;
import defpackage.kyh0;
import defpackage.lgo0;
import defpackage.ny61;
import defpackage.q3p0;
import defpackage.qco0;
import defpackage.rcc;
import defpackage.vj90;
import defpackage.zeo0;
import defpackage.zuj0;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class e {
    public static final /* synthetic */ int d = 0;
    public final zuj0 a;
    public final q3p0 b;
    public final f3p0 c;

    public e(zuj0 zuj0Var, q3p0 q3p0Var, f3p0 f3p0Var) {
        this.a = zuj0Var;
        this.b = q3p0Var;
        this.c = f3p0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(qco0 qco0Var, vj90 vj90Var, bfo0 bfo0Var, Continuation continuation) {
        ScootersPassesStateMapper$mapToPassesUiState$1 scootersPassesStateMapper$mapToPassesUiState$1;
        int i;
        CharSequence h;
        if (continuation instanceof ScootersPassesStateMapper$mapToPassesUiState$1) {
            scootersPassesStateMapper$mapToPassesUiState$1 = (ScootersPassesStateMapper$mapToPassesUiState$1) continuation;
            int i2 = scootersPassesStateMapper$mapToPassesUiState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassesStateMapper$mapToPassesUiState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPassesStateMapper$mapToPassesUiState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassesStateMapper$mapToPassesUiState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = vj90Var != null ? vj90Var.a : null;
                    scootersPassesStateMapper$mapToPassesUiState$1.L$0 = qco0Var;
                    scootersPassesStateMapper$mapToPassesUiState$1.L$1 = vj90Var;
                    scootersPassesStateMapper$mapToPassesUiState$1.L$2 = bfo0Var;
                    scootersPassesStateMapper$mapToPassesUiState$1.label = 1;
                    obj = b(qco0Var, str, scootersPassesStateMapper$mapToPassesUiState$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bfo0Var = (bfo0) scootersPassesStateMapper$mapToPassesUiState$1.L$2;
                    vj90Var = (vj90) scootersPassesStateMapper$mapToPassesUiState$1.L$1;
                    qco0Var = (qco0) scootersPassesStateMapper$mapToPassesUiState$1.L$0;
                    kotlin.b.b(obj);
                }
                List list = (List) obj;
                if (!(bfo0Var instanceof afo0)) {
                    return new kgo0(list);
                }
                if (bfo0Var instanceof zeo0) {
                    return new jgo0(list);
                }
                if (qco0Var.c && !qco0Var.f) {
                    return new lgo0(list);
                }
                if (vj90Var == null || (h = vj90Var.i) == null) {
                    h = ((avj0) this.a).h(kyh0.scooters_pass_type_pass_button_title);
                }
                return new igo0(h, list);
            }
        }
        scootersPassesStateMapper$mapToPassesUiState$1 = new ScootersPassesStateMapper$mapToPassesUiState$1(this, continuation);
        Object obj3 = scootersPassesStateMapper$mapToPassesUiState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassesStateMapper$mapToPassesUiState$1.label;
        if (i != 0) {
        }
        List list2 = (List) obj3;
        if (!(bfo0Var instanceof afo0)) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable b(qco0 qco0Var, String str, ContinuationImpl continuationImpl) {
        ScootersPassesStateMapper$toListItemModels$1 scootersPassesStateMapper$toListItemModels$1;
        int i;
        ListBuilder a;
        Object obj;
        Collection collection;
        String str2;
        if (continuationImpl instanceof ScootersPassesStateMapper$toListItemModels$1) {
            scootersPassesStateMapper$toListItemModels$1 = (ScootersPassesStateMapper$toListItemModels$1) continuationImpl;
            int i2 = scootersPassesStateMapper$toListItemModels$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassesStateMapper$toListItemModels$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersPassesStateMapper$toListItemModels$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassesStateMapper$toListItemModels$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    a = rcc.a();
                    CharSequence charSequence = qco0Var.d;
                    if (charSequence == null) {
                        charSequence = ((avj0) this.a).h(kyh0.scooters_packages_title);
                    }
                    a.add(new e7o0(charSequence));
                    CharSequence charSequence2 = qco0Var.e;
                    if (qco0Var.d != null && charSequence2 != null) {
                        a.add(new d7o0(charSequence2));
                    }
                    scootersPassesStateMapper$toListItemModels$1.L$0 = qco0Var;
                    scootersPassesStateMapper$toListItemModels$1.L$1 = str;
                    scootersPassesStateMapper$toListItemModels$1.L$2 = a;
                    scootersPassesStateMapper$toListItemModels$1.L$3 = a;
                    scootersPassesStateMapper$toListItemModels$1.L$4 = null;
                    scootersPassesStateMapper$toListItemModels$1.label = 1;
                    Object b = this.c.a.b(scootersPassesStateMapper$toListItemModels$1);
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = b;
                    collection = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r13 = (List) scootersPassesStateMapper$toListItemModels$1.L$3;
                    Collection collection2 = (List) scootersPassesStateMapper$toListItemModels$1.L$2;
                    String str3 = (String) scootersPassesStateMapper$toListItemModels$1.L$1;
                    qco0 qco0Var2 = (qco0) scootersPassesStateMapper$toListItemModels$1.L$0;
                    kotlin.b.b(obj2);
                    a = r13;
                    qco0Var = qco0Var2;
                    collection = collection2;
                    str = str3;
                    obj = obj2;
                }
                ScootersSurgeExperiment scootersSurgeExperiment = (ScootersSurgeExperiment) obj;
                for (vj90 vj90Var : qco0Var.h) {
                    boolean l = jl40.l(vj90Var.a, str);
                    boolean z = vj90Var.k || qco0Var.f;
                    Double d2 = vj90Var.n;
                    if (d2 != null) {
                        double doubleValue = d2.doubleValue();
                        this.b.getClass();
                        if (scootersSurgeExperiment.b) {
                            str2 = q3p0.a(doubleValue, scootersSurgeExperiment).d;
                            a.add(new c7o0(vj90Var, l, z, str2));
                        }
                    }
                    str2 = null;
                    a.add(new c7o0(vj90Var, l, z, str2));
                }
                return ((ListBuilder) collection).j();
            }
        }
        scootersPassesStateMapper$toListItemModels$1 = new ScootersPassesStateMapper$toListItemModels$1(this, continuationImpl);
        Object obj22 = scootersPassesStateMapper$toListItemModels$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassesStateMapper$toListItemModels$1.label;
        if (i != 0) {
        }
        ScootersSurgeExperiment scootersSurgeExperiment2 = (ScootersSurgeExperiment) obj;
        while (r2.hasNext()) {
        }
        return ((ListBuilder) collection).j();
    }
}
