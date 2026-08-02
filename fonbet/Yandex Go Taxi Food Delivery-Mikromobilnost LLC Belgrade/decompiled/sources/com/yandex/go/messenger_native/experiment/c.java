package com.yandex.go.messenger_native.experiment;

import com.yandex.go.messenger_native.experiment.NativeMessengerOverloadedFlagsExperiment;
import defpackage.dne0;
import defpackage.ny61;
import defpackage.s66;
import defpackage.tcc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class c {
    public final s66 a;
    public final dne0 b;

    public c(s66 s66Var, dne0 dne0Var) {
        this.a = s66Var;
        this.b = dne0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        NativeMessengerOverloadedFlagsInteractor$loadOverloadedFlags$1 nativeMessengerOverloadedFlagsInteractor$loadOverloadedFlags$1;
        int i;
        List list;
        Set set;
        if (continuationImpl instanceof NativeMessengerOverloadedFlagsInteractor$loadOverloadedFlags$1) {
            nativeMessengerOverloadedFlagsInteractor$loadOverloadedFlags$1 = (NativeMessengerOverloadedFlagsInteractor$loadOverloadedFlags$1) continuationImpl;
            int i2 = nativeMessengerOverloadedFlagsInteractor$loadOverloadedFlags$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nativeMessengerOverloadedFlagsInteractor$loadOverloadedFlags$1.label = i2 - Integer.MIN_VALUE;
                Object obj = nativeMessengerOverloadedFlagsInteractor$loadOverloadedFlags$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nativeMessengerOverloadedFlagsInteractor$loadOverloadedFlags$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    nativeMessengerOverloadedFlagsInteractor$loadOverloadedFlags$1.label = 1;
                    obj = this.a.b.b(nativeMessengerOverloadedFlagsInteractor$loadOverloadedFlags$1);
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
                NativeMessengerOverloadedFlagsExperiment nativeMessengerOverloadedFlagsExperiment = (NativeMessengerOverloadedFlagsExperiment) obj;
                list = nativeMessengerOverloadedFlagsExperiment.b ? nativeMessengerOverloadedFlagsExperiment.c : null;
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((NativeMessengerOverloadedFlagsExperiment.OverloadedFlag) obj2).getB()) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((NativeMessengerOverloadedFlagsExperiment.OverloadedFlag) it.next()).getA());
                    }
                    set = kotlin.collections.a.N0(arrayList2);
                } else {
                    set = EmptySet.a;
                }
                this.b.b().t("OVERLOADED_FLAGS", set);
                return zy11.a;
            }
        }
        nativeMessengerOverloadedFlagsInteractor$loadOverloadedFlags$1 = new NativeMessengerOverloadedFlagsInteractor$loadOverloadedFlags$1(this, continuationImpl);
        Object obj3 = nativeMessengerOverloadedFlagsInteractor$loadOverloadedFlags$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nativeMessengerOverloadedFlagsInteractor$loadOverloadedFlags$1.label;
        if (i != 0) {
        }
        NativeMessengerOverloadedFlagsExperiment nativeMessengerOverloadedFlagsExperiment2 = (NativeMessengerOverloadedFlagsExperiment) obj3;
        if (nativeMessengerOverloadedFlagsExperiment2.b) {
        }
        if (list == null) {
        }
        this.b.b().t("OVERLOADED_FLAGS", set);
        return zy11.a;
    }
}
