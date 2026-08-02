package com.ybsdk.feature.divkit.internal.domain;

import android.net.Uri;
import com.ybsdk.core.utils.c;
import com.ybsdk.core.utils.dto.DataWithStatusResponse;
import com.ybsdk.feature.divkit.internal.data.DivApi;
import com.ybsdk.feature.divkit.internal.domain.DownloadPayload;
import com.ybsdk.feature.divkit.internal.domain.hmac.HmacData;
import com.ybsdk.feature.divkit.internal.dto.DivPatch;
import com.ybsdk.feature.divkit.internal.dto.DivPatchDto;
import com.ybsdk.feature.divkit.internal.dto.DivPollingDto;
import defpackage.a0e0;
import defpackage.bvf0;
import defpackage.cvw;
import defpackage.d6v;
import defpackage.evu0;
import defpackage.ike;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.o400;
import defpackage.qhw0;
import defpackage.sjh;
import defpackage.sls;
import defpackage.snk;
import defpackage.sr51;
import defpackage.tls;
import defpackage.u2l;
import defpackage.ur51;
import defpackage.uyj;
import defpackage.vi91;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xnk;
import defpackage.xou;
import defpackage.y2l;
import defpackage.zls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b implements d6v {
    public final /* synthetic */ c a = new c();
    public final DivApi b;
    public final com.ybsdk.utils.poller.b c;
    public final xou w;
    public final ike x;

    public b(DivApi divApi, com.ybsdk.utils.poller.b bVar, xou xouVar) {
        this.b = divApi;
        this.c = bVar;
        this.w = xouVar;
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        this.x = bvf0.a(cvw.U(a, o400.a.x));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, String str, DownloadPayload downloadPayload, sr51 sr51Var, String str2, ContinuationImpl continuationImpl) {
        DivDownloader$executeWithGeneralResponse$1 divDownloader$executeWithGeneralResponse$1;
        int i;
        Object d;
        DivPatch divPatch;
        String patch;
        DivPatch divPatch2;
        bVar.getClass();
        if (continuationImpl instanceof DivDownloader$executeWithGeneralResponse$1) {
            divDownloader$executeWithGeneralResponse$1 = (DivDownloader$executeWithGeneralResponse$1) continuationImpl;
            int i2 = divDownloader$executeWithGeneralResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                divDownloader$executeWithGeneralResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = divDownloader$executeWithGeneralResponse$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = divDownloader$executeWithGeneralResponse$1.label;
                y2l y2lVar = null;
                r3 = null;
                String str3 = null;
                y2lVar = null;
                y2lVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zls divDownloader$executeWithGeneralResponse$2 = new DivDownloader$executeWithGeneralResponse$2(bVar, str, null);
                    divDownloader$executeWithGeneralResponse$1.L$0 = sr51Var;
                    divDownloader$executeWithGeneralResponse$1.label = 1;
                    d = bVar.d(downloadPayload, str2, divDownloader$executeWithGeneralResponse$2, divDownloader$executeWithGeneralResponse$1);
                    if (d == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sr51Var = (sr51) divDownloader$executeWithGeneralResponse$1.L$0;
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                if (!(d instanceof Result.Failure)) {
                    DataWithStatusResponse dataWithStatusResponse = (DataWithStatusResponse) d;
                    int i3 = xnk.b[dataWithStatusResponse.getStatus().ordinal()];
                    if (i3 == 1) {
                        DivPatchDto divPatchDto = (DivPatchDto) dataWithStatusResponse.getSuccessData();
                        if (divPatchDto != null && (divPatch = divPatchDto.getDivPatch()) != null && (patch = divPatch.getPatch()) != null) {
                            DivPatchDto divPatchDto2 = (DivPatchDto) dataWithStatusResponse.getSuccessData();
                            if (divPatchDto2 != null && (divPatch2 = divPatchDto2.getDivPatch()) != null) {
                                str3 = divPatch2.getTemplates();
                            }
                            y2lVar = e(patch, str3);
                        }
                        ((snk) sr51Var).b(y2lVar);
                    } else {
                        if (i3 != 2 && i3 != 3) {
                            w511.b();
                            return null;
                        }
                        ((snk) sr51Var).a();
                    }
                }
                if (Result.a(d) != null) {
                    ((snk) sr51Var).a();
                }
                return zy11.a;
            }
        }
        divDownloader$executeWithGeneralResponse$1 = new DivDownloader$executeWithGeneralResponse$1(bVar, continuationImpl);
        Object obj3 = divDownloader$executeWithGeneralResponse$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = divDownloader$executeWithGeneralResponse$1.label;
        y2l y2lVar2 = null;
        str3 = null;
        String str32 = null;
        y2lVar2 = null;
        y2lVar2 = null;
        if (i != 0) {
        }
        if (!(d instanceof Result.Failure)) {
        }
        if (Result.a(d) != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, String str, DownloadPayload downloadPayload, sr51 sr51Var, String str2, ContinuationImpl continuationImpl) {
        DivDownloader$executeWithRawResponse$1 divDownloader$executeWithRawResponse$1;
        int i;
        Object d;
        bVar.getClass();
        if (continuationImpl instanceof DivDownloader$executeWithRawResponse$1) {
            divDownloader$executeWithRawResponse$1 = (DivDownloader$executeWithRawResponse$1) continuationImpl;
            int i2 = divDownloader$executeWithRawResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                divDownloader$executeWithRawResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = divDownloader$executeWithRawResponse$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = divDownloader$executeWithRawResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zls divDownloader$executeWithRawResponse$2 = new DivDownloader$executeWithRawResponse$2(bVar, str, null);
                    divDownloader$executeWithRawResponse$1.L$0 = sr51Var;
                    divDownloader$executeWithRawResponse$1.label = 1;
                    d = bVar.d(downloadPayload, str2, divDownloader$executeWithRawResponse$2, divDownloader$executeWithRawResponse$1);
                    if (d == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sr51Var = (sr51) divDownloader$executeWithRawResponse$1.L$0;
                    kotlin.b.b(obj);
                    d = ((Result) obj).getValue();
                }
                if (!(d instanceof Result.Failure)) {
                    ((snk) sr51Var).b(null);
                }
                if (Result.a(d) != null) {
                    ((snk) sr51Var).a();
                }
                return zy11.a;
            }
        }
        divDownloader$executeWithRawResponse$1 = new DivDownloader$executeWithRawResponse$1(bVar, continuationImpl);
        Object obj3 = divDownloader$executeWithRawResponse$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = divDownloader$executeWithRawResponse$1.label;
        if (i != 0) {
        }
        if (!(d instanceof Result.Failure)) {
        }
        if (Result.a(d) != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(b bVar, String str, DownloadPayload downloadPayload, sr51 sr51Var, String str2, ContinuationImpl continuationImpl) {
        DivDownloader$polling$1 divDownloader$polling$1;
        int i;
        String failure;
        Object e;
        sr51 sr51Var2;
        DivPatch divPatch;
        String patch;
        bVar.getClass();
        if (continuationImpl instanceof DivDownloader$polling$1) {
            divDownloader$polling$1 = (DivDownloader$polling$1) continuationImpl;
            int i2 = divDownloader$polling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                divDownloader$polling$1.label = i2 - Integer.MIN_VALUE;
                DivDownloader$polling$1 divDownloader$polling$12 = divDownloader$polling$1;
                Object obj = divDownloader$polling$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = divDownloader$polling$12.label;
                y2l y2lVar = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.ybsdk.utils.poller.b bVar2 = bVar.c;
                    try {
                        String path = Uri.parse(str).getPath();
                        failure = path != null ? evu0.Q("/", path) : "div_downloader";
                    } catch (Throwable th) {
                        failure = new Result.Failure(th);
                    }
                    Throwable a = Result.a(failure);
                    if (a != null) {
                        x4c.g("Failed to convert URL string to URI in div downloader", a, str, null, 8);
                    }
                    com.ybsdk.utils.poller.c c = bVar2.c(new a0e0((String) (failure instanceof Result.Failure ? "div_downloader" : failure)), new DivDownloader$polling$2(2, null), new DivDownloader$polling$3(bVar, downloadPayload, str2, str, sr51Var, null));
                    divDownloader$polling$12.L$0 = sr51Var;
                    divDownloader$polling$12.label = 1;
                    e = c.e(divDownloader$polling$12);
                    if (e == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    sr51Var2 = sr51Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sr51Var2 = (sr51) divDownloader$polling$12.L$0;
                    kotlin.b.b(obj);
                    e = ((Result) obj).getValue();
                }
                if (!(e instanceof Result.Failure)) {
                    DivPollingDto divPollingDto = (DivPollingDto) e;
                    int i3 = xnk.a[divPollingDto.getStatus().ordinal()];
                    if (i3 == 1) {
                        DivPatchDto successData = divPollingDto.getSuccessData();
                        if (successData != null && (divPatch = successData.getDivPatch()) != null && (patch = divPatch.getPatch()) != null) {
                            y2lVar = e(patch, null);
                        }
                        ((snk) sr51Var2).b(y2lVar);
                    } else if (i3 == 2) {
                        ((snk) sr51Var2).a();
                    } else if (i3 != 3) {
                        w511.b();
                        return null;
                    }
                }
                if (Result.a(e) != null) {
                    ((snk) sr51Var2).a();
                }
                return zy11.a;
            }
        }
        divDownloader$polling$1 = new DivDownloader$polling$1(bVar, continuationImpl);
        DivDownloader$polling$1 divDownloader$polling$122 = divDownloader$polling$1;
        Object obj2 = divDownloader$polling$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = divDownloader$polling$122.label;
        y2l y2lVar2 = null;
        if (i != 0) {
        }
        if (!(e instanceof Result.Failure)) {
        }
        if (Result.a(e) != null) {
        }
        return zy11.a;
    }

    public static y2l e(String str, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        u2l u2lVar = new u2l(ur51.c);
        if (str2 != null) {
            u2lVar.e(new JSONObject(str2));
        }
        int i = y2l.f;
        return vi91.i(u2lVar, jSONObject);
    }

    @Override // defpackage.d6v
    public final Object B(Object obj, sls slsVar, tls tlsVar, wls wlsVar, ContinuationImpl continuationImpl) {
        Object B = this.a.B(obj, slsVar, tlsVar, wlsVar, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return B;
    }

    @Override // defpackage.d6v
    public final Object O(wls wlsVar, Object obj, Continuation continuation) {
        Object O = this.a.O(wlsVar, obj, continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return O;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.ybsdk.feature.divkit.internal.domain.b] */
    /* JADX WARN: Type inference failed for: r6v1, types: [kotlin.Result$Failure] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(DownloadPayload downloadPayload, String str, zls zlsVar, ContinuationImpl continuationImpl) {
        DivDownloader$load$1 divDownloader$load$1;
        int i;
        String str2;
        if (continuationImpl instanceof DivDownloader$load$1) {
            divDownloader$load$1 = (DivDownloader$load$1) continuationImpl;
            int i2 = divDownloader$load$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                divDownloader$load$1.label = i2 - Integer.MIN_VALUE;
                Object obj = divDownloader$load$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = divDownloader$load$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Map<String, String> headers = downloadPayload.getHeaders();
                if (headers == null) {
                    headers = kotlin.collections.b.f();
                }
                String body = downloadPayload.getBody();
                HmacData hmacData = downloadPayload.getHmacData();
                if (hmacData != null && body != null) {
                    DownloadPayload.IdempotencyData idempotency = downloadPayload.getIdempotency();
                    if (idempotency != null) {
                        str2 = this.a.i(idempotency.getOperationKey());
                    } else {
                        str2 = null;
                    }
                    com.ybsdk.feature.divkit.internal.domain.hmac.b bVar = (com.ybsdk.feature.divkit.internal.domain.hmac.b) this.w;
                    bVar.getClass();
                    try {
                        Iterator it = hmacData.getSpecs().iterator();
                        while (it.hasNext()) {
                            body = bVar.a(body, (HmacData.Spec) it.next(), str2);
                        }
                    } catch (Throwable th) {
                        body = new Result.Failure(th);
                    }
                    Throwable a = Result.a(body);
                    if (a != null) {
                        String message = a.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        x4c.g(message, a, str, null, 8);
                    }
                    Throwable a2 = Result.a(body);
                    if (a2 != null) {
                        return new Result.Failure(a2);
                    }
                    body = body;
                }
                if (downloadPayload.getIdempotency() == null) {
                    DivDownloader$load$2 divDownloader$load$2 = new DivDownloader$load$2(zlsVar, body, headers, null);
                    divDownloader$load$1.label = 1;
                    Object c = com.ybsdk.core.utils.ext.c.c(divDownloader$load$2, divDownloader$load$1);
                    if (c != coroutineSingletons) {
                        return c;
                    }
                } else {
                    String operationKey = downloadPayload.getIdempotency().getOperationKey();
                    DivDownloader$load$3 divDownloader$load$3 = new DivDownloader$load$3(zlsVar, body, headers, null);
                    divDownloader$load$1.label = 2;
                    Object O = O(divDownloader$load$3, operationKey, divDownloader$load$1);
                    if (O != coroutineSingletons) {
                        return O;
                    }
                }
                return coroutineSingletons;
            }
        }
        divDownloader$load$1 = new DivDownloader$load$1(this, continuationImpl);
        Object obj2 = divDownloader$load$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = divDownloader$load$1.label;
        if (i == 0) {
        }
    }

    @Override // defpackage.d6v
    public final String i(String str) {
        return this.a.i(str);
    }
}
