package com.yandex.go.superapp_carts.domain.loading;

import com.yandex.go.flex.main_screen.api.query.DocumentQueryFactory$prepareDocumentQuery$1;
import defpackage.h3y;
import defpackage.ny61;
import defpackage.p9w0;
import defpackage.rol0;
import defpackage.u1m;
import defpackage.ute0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final b a;
    public final h3y b;
    public final h3y c;
    public final com.yandex.div.core.expression.variables.a d;
    public final String e;

    public a(p9w0 p9w0Var, b bVar, h3y h3yVar, h3y h3yVar2, com.yandex.div.core.expression.variables.a aVar) {
        this.a = bVar;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = aVar;
        this.e = p9w0Var.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        SuperappCartLoadingInteractor$createQuery$1 superappCartLoadingInteractor$createQuery$1;
        int i;
        String str = aVar.e;
        if (continuationImpl instanceof SuperappCartLoadingInteractor$createQuery$1) {
            superappCartLoadingInteractor$createQuery$1 = (SuperappCartLoadingInteractor$createQuery$1) continuationImpl;
            int i2 = superappCartLoadingInteractor$createQuery$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappCartLoadingInteractor$createQuery$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappCartLoadingInteractor$createQuery$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappCartLoadingInteractor$createQuery$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.flex.main_screen.api.query.a aVar2 = (com.yandex.go.flex.main_screen.api.query.a) aVar.b.get();
                    superappCartLoadingInteractor$createQuery$1.label = 1;
                    obj = ((com.yandex.go.flex.main_screen.interactors.b) aVar2).b("bdui/v1/superapp/cart", null, EmptyList.a, DocumentQueryFactory$prepareDocumentQuery$1.b, false, false, superappCartLoadingInteractor$createQuery$1);
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
                u1m u1mVar = ((ute0) obj).a;
                if (str != null) {
                    return u1mVar;
                }
                Map map = u1mVar.c;
                LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
                linkedHashMap.put("search_session_id", str);
                return u1m.a(u1mVar, linkedHashMap);
            }
        }
        superappCartLoadingInteractor$createQuery$1 = new SuperappCartLoadingInteractor$createQuery$1(aVar, continuationImpl);
        Object obj2 = superappCartLoadingInteractor$createQuery$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappCartLoadingInteractor$createQuery$1.label;
        if (i != 0) {
        }
        u1m u1mVar2 = ((ute0) obj2).a;
        if (str != null) {
        }
    }

    public final rol0 b(boolean z) {
        return new rol0(new SuperappCartLoadingInteractor$createPreviewAndLoadActions$1(this, z, null));
    }
}
