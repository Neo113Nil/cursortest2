package com.yandex.messaging.internal.urlpreview;

import com.yandex.messaging.core.net.entities.GetUrlPreviewRequestParam;
import com.yandex.messaging.core.net.entities.GetUrlPreviewResponse;
import com.yandex.messaging.domain.k;
import com.yandex.messaging.internal.authorized.j;
import defpackage.c9v;
import defpackage.cl21;
import defpackage.d9g;
import defpackage.g6u;
import defpackage.gbb1;
import defpackage.jl40;
import defpackage.jl41;
import defpackage.kse;
import defpackage.n43;
import defpackage.ny61;
import defpackage.th21;
import defpackage.tje;
import defpackage.v3k0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;

/* loaded from: classes15.dex */
public final class a extends k {
    public final kse b;
    public final j c;
    public final g6u d;
    public final c9v e;

    public a(kse kseVar, j jVar) {
        super(kseVar.b);
        this.b = kseVar;
        this.c = jVar;
        this.d = kseVar.e;
        this.e = new c9v(1000);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fc, code lost:
    
        if (r12 != r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(a aVar, th21 th21Var, ContinuationImpl continuationImpl) {
        GetUrlPreviewUseCase$getUrlPreviewInternal$1 getUrlPreviewUseCase$getUrlPreviewInternal$1;
        int i;
        GetUrlPreviewRequestParam getUrlPreviewRequestParam;
        List list;
        aVar.getClass();
        if (continuationImpl instanceof GetUrlPreviewUseCase$getUrlPreviewInternal$1) {
            getUrlPreviewUseCase$getUrlPreviewInternal$1 = (GetUrlPreviewUseCase$getUrlPreviewInternal$1) continuationImpl;
            int i2 = getUrlPreviewUseCase$getUrlPreviewInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getUrlPreviewUseCase$getUrlPreviewInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getUrlPreviewUseCase$getUrlPreviewInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getUrlPreviewUseCase$getUrlPreviewInternal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = th21Var.c;
                    if (str == null) {
                        String str2 = th21Var.a;
                        kse.a(aVar.b);
                        v3k0 v3k0Var = new v3k0();
                        v3k0Var.g = new int[str2.length()];
                        v3k0Var.a(str2);
                        str = (String) v3k0Var.b.poll();
                        if (str == null) {
                            int i3 = 0;
                            String[] strArr = (String[]) new Regex("[\\s()]+").l(0, str2).toArray(new String[0]);
                            if (strArr.length == 0) {
                                list = EmptyList.a;
                            } else {
                                ArrayList arrayList = new ArrayList(new n43(strArr, false));
                                Collections.reverse(arrayList);
                                list = arrayList;
                            }
                            int size = list.size();
                            while (true) {
                                if (i3 >= size) {
                                    str = null;
                                    break;
                                }
                                String str3 = (String) list.get(i3);
                                String lowerCase = str3.toLowerCase(Locale.getDefault());
                                Matcher matcher = jl41.a.matcher(lowerCase);
                                if (matcher.find() && matcher.start() == 0 && matcher.end() == lowerCase.length()) {
                                    str = str3;
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                    if (str == null) {
                        GetUrlPreviewResponse.INSTANCE.getClass();
                        return GetUrlPreviewResponse.noResponse;
                    }
                    GetUrlPreviewRequestParam getUrlPreviewRequestParam2 = new GetUrlPreviewRequestParam(str, "full");
                    j jVar = aVar.c;
                    getUrlPreviewUseCase$getUrlPreviewInternal$1.L$0 = getUrlPreviewRequestParam2;
                    getUrlPreviewUseCase$getUrlPreviewInternal$1.label = 1;
                    obj = gbb1.c(jVar, getUrlPreviewUseCase$getUrlPreviewInternal$1);
                    if (obj != coroutineSingletons) {
                        getUrlPreviewRequestParam = getUrlPreviewRequestParam2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    GetUrlPreviewResponse getUrlPreviewResponse = (GetUrlPreviewResponse) obj;
                    if (getUrlPreviewResponse != null) {
                        return getUrlPreviewResponse;
                    }
                    GetUrlPreviewResponse.INSTANCE.getClass();
                    return GetUrlPreviewResponse.noResponse;
                }
                getUrlPreviewRequestParam = (GetUrlPreviewRequestParam) getUrlPreviewUseCase$getUrlPreviewInternal$1.L$0;
                kotlin.b.b(obj);
                b bVar = (b) ((d9g) ((cl21) obj)).w0.get();
                getUrlPreviewUseCase$getUrlPreviewInternal$1.L$0 = null;
                getUrlPreviewUseCase$getUrlPreviewInternal$1.label = 2;
                obj = bVar.a(getUrlPreviewRequestParam, getUrlPreviewUseCase$getUrlPreviewInternal$1);
            }
        }
        getUrlPreviewUseCase$getUrlPreviewInternal$1 = new GetUrlPreviewUseCase$getUrlPreviewInternal$1(aVar, continuationImpl);
        Object obj2 = getUrlPreviewUseCase$getUrlPreviewInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getUrlPreviewUseCase$getUrlPreviewInternal$1.label;
        if (i != 0) {
        }
        b bVar2 = (b) ((d9g) ((cl21) obj2)).w0.get();
        getUrlPreviewUseCase$getUrlPreviewInternal$1.L$0 = null;
        getUrlPreviewUseCase$getUrlPreviewInternal$1.label = 2;
        obj2 = bVar2.a(getUrlPreviewRequestParam, getUrlPreviewUseCase$getUrlPreviewInternal$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.messaging.domain.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(th21 th21Var, ContinuationImpl continuationImpl) {
        GetUrlPreviewUseCase$run$1 getUrlPreviewUseCase$run$1;
        int i;
        GetUrlPreviewResponse getUrlPreviewResponse;
        String str;
        if (continuationImpl instanceof GetUrlPreviewUseCase$run$1) {
            getUrlPreviewUseCase$run$1 = (GetUrlPreviewUseCase$run$1) continuationImpl;
            int i2 = getUrlPreviewUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getUrlPreviewUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getUrlPreviewUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getUrlPreviewUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (th21Var.a.length() <= 0 && ((str = th21Var.c) == null || str.length() <= 0)) {
                        GetUrlPreviewResponse.INSTANCE.getClass();
                        return GetUrlPreviewResponse.noResponse;
                    }
                    getUrlPreviewResponse = (GetUrlPreviewResponse) this.e.j(th21Var);
                    if (getUrlPreviewResponse == null) {
                        GetUrlPreviewUseCase$run$2 getUrlPreviewUseCase$run$2 = new GetUrlPreviewUseCase$run$2(this, th21Var, null);
                        getUrlPreviewUseCase$run$1.L$0 = this;
                        getUrlPreviewUseCase$run$1.L$1 = th21Var;
                        getUrlPreviewUseCase$run$1.label = 1;
                        obj = tje.k0(this.d, getUrlPreviewUseCase$run$2, getUrlPreviewUseCase$run$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return getUrlPreviewResponse;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th21Var = (th21) getUrlPreviewUseCase$run$1.L$1;
                this = (a) getUrlPreviewUseCase$run$1.L$0;
                kotlin.b.b(obj);
                getUrlPreviewResponse = (GetUrlPreviewResponse) obj;
                if (th21Var.b) {
                    GetUrlPreviewResponse.INSTANCE.getClass();
                    if (!jl40.l(getUrlPreviewResponse, GetUrlPreviewResponse.noResponse)) {
                        this.e.y(th21Var, getUrlPreviewResponse);
                    }
                }
                return getUrlPreviewResponse;
            }
        }
        getUrlPreviewUseCase$run$1 = new GetUrlPreviewUseCase$run$1(this, continuationImpl);
        Object obj2 = getUrlPreviewUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getUrlPreviewUseCase$run$1.label;
        if (i != 0) {
        }
        getUrlPreviewResponse = (GetUrlPreviewResponse) obj2;
        if (th21Var.b) {
        }
        return getUrlPreviewResponse;
    }
}
