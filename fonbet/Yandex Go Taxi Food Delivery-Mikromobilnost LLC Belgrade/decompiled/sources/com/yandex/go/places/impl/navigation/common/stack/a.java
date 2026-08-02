package com.yandex.go.places.impl.navigation.common.stack;

import defpackage.bcc0;
import defpackage.ny61;
import defpackage.scc;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public abstract class a {
    public abstract Object a(bcc0 bcc0Var, boolean z, Continuation continuation);

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, ContinuationImpl continuationImpl) {
        PlacesStackReplayer$replay$1 placesStackReplayer$replay$1;
        int i;
        Iterator it;
        int i2;
        if (continuationImpl instanceof PlacesStackReplayer$replay$1) {
            placesStackReplayer$replay$1 = (PlacesStackReplayer$replay$1) continuationImpl;
            int i3 = placesStackReplayer$replay$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                placesStackReplayer$replay$1.label = i3 - Integer.MIN_VALUE;
                Object obj = placesStackReplayer$replay$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesStackReplayer$replay$1.label;
                if (i != 0) {
                    b.b(obj);
                    it = list.iterator();
                    i2 = 0;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = placesStackReplayer$replay$1.I$0;
                    it = (Iterator) placesStackReplayer$replay$1.L$2;
                    b.b(obj);
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        scc.m();
                        throw null;
                    }
                    bcc0 bcc0Var = (bcc0) next;
                    boolean z = i2 == 0;
                    placesStackReplayer$replay$1.L$0 = null;
                    placesStackReplayer$replay$1.L$1 = null;
                    placesStackReplayer$replay$1.L$2 = it;
                    placesStackReplayer$replay$1.L$3 = null;
                    placesStackReplayer$replay$1.L$4 = null;
                    placesStackReplayer$replay$1.I$0 = i4;
                    placesStackReplayer$replay$1.I$1 = i2;
                    placesStackReplayer$replay$1.label = 1;
                    if (a(bcc0Var, z, placesStackReplayer$replay$1) == obj2) {
                        return obj2;
                    }
                    i2 = i4;
                }
                return zy11.a;
            }
        }
        placesStackReplayer$replay$1 = new PlacesStackReplayer$replay$1(this, continuationImpl);
        Object obj3 = placesStackReplayer$replay$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesStackReplayer$replay$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return zy11.a;
    }
}
