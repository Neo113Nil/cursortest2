package com.yandex.go.tariffcard.ui;

import defpackage.l1f;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tix0;
import defpackage.vpr;
import defpackage.wl4;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class n implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ tix0 b;

    public n(vpr vprVar, tix0 tix0Var) {
        this.a = vprVar;
        this.b = tix0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f3, code lost:
    
        if (r7.emit(r9, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00be -> B:17:0x00bf). Please report as a decompilation issue!!! */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1 tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        Iterator it;
        Collection collection;
        if (continuation instanceof TariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1) {
            tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1 = (TariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1) continuation;
            int i2 = tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    Iterator it2 = list.iterator();
                    vprVar = this.a;
                    it = it2;
                    collection = arrayList;
                    if (it.hasNext()) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                collection = (Collection) tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$13;
                it = (Iterator) tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$10;
                Collection collection2 = (Collection) tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$9;
                vprVar = (vpr) tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                collection.add(new l1f((CharSequence) obj2));
                collection = collection2;
                if (it.hasNext()) {
                    wl4 wl4Var = (wl4) it.next();
                    ru.yandex.taxi.widget.c cVar = this.b.n;
                    FormattedText formattedText = wl4Var.b;
                    tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$0 = null;
                    tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$1 = null;
                    tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$2 = null;
                    tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$3 = null;
                    tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$4 = vprVar;
                    tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$5 = null;
                    tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$6 = null;
                    tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$7 = null;
                    tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$8 = null;
                    tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$9 = collection;
                    tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$10 = it;
                    tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$11 = null;
                    tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$12 = null;
                    tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$13 = collection;
                    tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.label = 1;
                    obj2 = ru.yandex.taxi.widget.c.i(cVar, formattedText, null, tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1, 30);
                    if (obj2 != coroutineSingletons) {
                        collection2 = collection;
                        collection.add(new l1f((CharSequence) obj2));
                        collection = collection2;
                        if (it.hasNext()) {
                            Object R = kotlin.collections.a.R((List) collection);
                            tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$0 = null;
                            tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$1 = null;
                            tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$2 = null;
                            tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$3 = null;
                            tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$4 = null;
                            tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$5 = null;
                            tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$6 = null;
                            tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$7 = null;
                            tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$8 = null;
                            tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$9 = null;
                            tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$10 = null;
                            tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$11 = null;
                            tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$12 = null;
                            tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.L$13 = null;
                            tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.label = 2;
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1 = new TariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffOptionsCardStateInteractor$couponFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
    }
}
