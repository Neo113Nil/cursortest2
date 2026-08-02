package com.yandex.go.suggest.impl.data.flex.document;

import com.yandex.go.flex.main_screen.api.query.DocumentQueryFactory$prepareDocumentQuery$1;
import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestExperiment;
import defpackage.bwp0;
import defpackage.f8v0;
import defpackage.fgw0;
import defpackage.ny61;
import defpackage.swp0;
import defpackage.u1m;
import defpackage.ute0;
import defpackage.zvv;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class d {
    public final com.yandex.go.flex.main_screen.api.query.a a;
    public final swp0 b;
    public final zvv c;
    public final SuperappSuggestExperiment.SearchScaffoldStyle d;

    public d(com.yandex.go.flex.main_screen.api.query.a aVar, swp0 swp0Var, zvv zvvVar, f8v0 f8v0Var) {
        this.a = aVar;
        this.b = swp0Var;
        this.c = zvvVar;
        this.d = f8v0Var.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(bwp0 bwp0Var, ContinuationImpl continuationImpl) {
        SuperappSuggestQueryInteractor$createDocumentQuery$1 superappSuggestQueryInteractor$createDocumentQuery$1;
        int i;
        if (continuationImpl instanceof SuperappSuggestQueryInteractor$createDocumentQuery$1) {
            superappSuggestQueryInteractor$createDocumentQuery$1 = (SuperappSuggestQueryInteractor$createDocumentQuery$1) continuationImpl;
            int i2 = superappSuggestQueryInteractor$createDocumentQuery$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappSuggestQueryInteractor$createDocumentQuery$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappSuggestQueryInteractor$createDocumentQuery$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappSuggestQueryInteractor$createDocumentQuery$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superappSuggestQueryInteractor$createDocumentQuery$1.L$0 = bwp0Var;
                    superappSuggestQueryInteractor$createDocumentQuery$1.label = 1;
                    obj = ((com.yandex.go.flex.main_screen.interactors.b) this.a).b("bdui/v1/superapp/search", null, EmptyList.a, DocumentQueryFactory$prepareDocumentQuery$1.b, false, false, superappSuggestQueryInteractor$createDocumentQuery$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bwp0Var = (bwp0) superappSuggestQueryInteractor$createDocumentQuery$1.L$0;
                    kotlin.b.b(obj);
                }
                u1m u1mVar = ((ute0) obj).a;
                fgw0 fgw0Var = new fgw0(0, bwp0Var, this);
                Map map = u1mVar.c;
                LinkedHashMap linkedHashMap = map == null ? new LinkedHashMap(map) : new LinkedHashMap();
                fgw0Var.invoke(linkedHashMap);
                return u1m.a(u1mVar, linkedHashMap);
            }
        }
        superappSuggestQueryInteractor$createDocumentQuery$1 = new SuperappSuggestQueryInteractor$createDocumentQuery$1(this, continuationImpl);
        Object obj2 = superappSuggestQueryInteractor$createDocumentQuery$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappSuggestQueryInteractor$createDocumentQuery$1.label;
        if (i != 0) {
        }
        u1m u1mVar2 = ((ute0) obj2).a;
        fgw0 fgw0Var2 = new fgw0(0, bwp0Var, this);
        Map map2 = u1mVar2.c;
        if (map2 == null) {
        }
        fgw0Var2.invoke(linkedHashMap);
        return u1m.a(u1mVar2, linkedHashMap);
    }
}
