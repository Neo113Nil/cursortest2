package com.yandex.go.safety.center.lost_item.modal.interactor;

import com.yandex.go.safety.center.analytics.SafetyCenterAnalytics$LostItemsAnalyticsError;
import com.yandex.go.safety.center.lost_item.data.Image$ImageType;
import com.yandex.go.safety.center.lost_item.network.LostItemsApiResponse;
import com.yandex.go.safety.center.lost_item.network.LostItemsApiResponse$Modal$Button$ActionDto$CallToDriverButtonActionDto;
import com.yandex.go.safety.center.lost_item.network.e;
import com.yandex.go.safety.center.lost_item.network.g;
import com.yandex.go.safety.center.lost_item.network.h;
import com.ybsdk.widgets.common.MoneyInputEditView;
import defpackage.dqk0;
import defpackage.evu0;
import defpackage.f7v;
import defpackage.fef;
import defpackage.g8e;
import defpackage.gwk0;
import defpackage.h7v;
import defpackage.hjy0;
import defpackage.ief;
import defpackage.ijy0;
import defpackage.jjy0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.krz;
import defpackage.kyh0;
import defpackage.lrz;
import defpackage.mrz;
import defpackage.nrz;
import defpackage.ny61;
import defpackage.orz;
import defpackage.ppl0;
import defpackage.prz;
import defpackage.pwy0;
import defpackage.q3h0;
import defpackage.qrz;
import defpackage.rol0;
import defpackage.tcc;
import defpackage.tqz;
import defpackage.tt2;
import defpackage.uqz;
import defpackage.vqz;
import defpackage.w511;
import defpackage.wqz;
import defpackage.xby;
import defpackage.xpk0;
import defpackage.ypk0;
import defpackage.yqg;
import defpackage.zqg;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.o;

/* loaded from: classes13.dex */
public final class c {
    public final com.yandex.go.safety.center.lost_item.data.a a;
    public final ypk0 b;
    public final lrz c;
    public final com.yandex.go.safety.center.lost_item.modal.mapper.a d;
    public final pwy0 e;
    public final ppl0 f;
    public final yqg g;
    public final tt2 h;

    public c(com.yandex.go.safety.center.lost_item.data.a aVar, ypk0 ypk0Var, lrz lrzVar, com.yandex.go.safety.center.lost_item.modal.mapper.a aVar2, pwy0 pwy0Var, ppl0 ppl0Var, yqg yqgVar, tt2 tt2Var) {
        this.a = aVar;
        this.b = ypk0Var;
        this.c = lrzVar;
        this.d = aVar2;
        this.e = pwy0Var;
        this.f = ppl0Var;
        this.g = yqgVar;
        this.h = tt2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x015d, code lost:
    
        if (r15 == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x015f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x005a, code lost:
    
        if (r15 == r1) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, dqk0 dqk0Var, ContinuationImpl continuationImpl) {
        LostItemsUiStateInteractor$getDomainState$1 lostItemsUiStateInteractor$getDomainState$1;
        int i;
        Object a;
        Throwable a2;
        h7v h7vVar;
        wqz wqzVar;
        Image$ImageType image$ImageType;
        cVar.getClass();
        if (continuationImpl instanceof LostItemsUiStateInteractor$getDomainState$1) {
            lostItemsUiStateInteractor$getDomainState$1 = (LostItemsUiStateInteractor$getDomainState$1) continuationImpl;
            int i2 = lostItemsUiStateInteractor$getDomainState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lostItemsUiStateInteractor$getDomainState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = lostItemsUiStateInteractor$getDomainState$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lostItemsUiStateInteractor$getDomainState$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.safety.center.lost_item.data.a aVar = cVar.a;
                    String str = dqk0Var.a;
                    lostItemsUiStateInteractor$getDomainState$1.L$0 = dqk0Var;
                    lostItemsUiStateInteractor$getDomainState$1.label = 1;
                    a = aVar.a(str, lostItemsUiStateInteractor$getDomainState$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return (qrz) obj;
                    }
                    dqk0Var = (dqk0) lostItemsUiStateInteractor$getDomainState$1.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                a2 = Result.a(a);
                if (a2 != null) {
                    LostItemsApiResponse lostItemsApiResponse = (LostItemsApiResponse) a;
                    lrz lrzVar = cVar.c;
                    lrzVar.getClass();
                    LostItemsApiResponse.Modal modal = lostItemsApiResponse.a;
                    ief iefVar = lostItemsApiResponse.b;
                    fef h = iefVar != null ? gwk0.h(iefVar) : null;
                    LostItemsApiResponse.Modal.Header header = modal.a;
                    if (header != null) {
                        String str2 = header.a;
                        int i3 = krz.a[header.b.ordinal()];
                        if (i3 == 1) {
                            image$ImageType = Image$ImageType.IMAGE;
                        } else if (i3 == 2) {
                            image$ImageType = Image$ImageType.ICON;
                        } else {
                            if (i3 != 3) {
                                w511.b();
                                return null;
                            }
                            image$ImageType = Image$ImageType.UNKNOWN;
                        }
                        h7vVar = new h7v(str2, image$ImageType);
                    } else {
                        h7vVar = null;
                    }
                    ijy0 ijy0Var = new ijy0(modal.b);
                    ijy0 ijy0Var2 = new ijy0(modal.c);
                    List<LostItemsApiResponse.Modal.Bullet> list = modal.d;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    for (LostItemsApiResponse.Modal.Bullet bullet : list) {
                        ijy0 ijy0Var3 = new ijy0(bullet.b);
                        ijy0 ijy0Var4 = new ijy0(bullet.c);
                        String str3 = bullet.a;
                        arrayList.add(new mrz(ijy0Var3, ijy0Var4, str3 != null ? new h7v(str3, Image$ImageType.ICON) : null));
                    }
                    LostItemsApiResponse.Modal.Button button = modal.e;
                    h hVar = button.a;
                    if (hVar instanceof LostItemsApiResponse$Modal$Button$ActionDto$CallToDriverButtonActionDto) {
                        wqzVar = new tqz(((LostItemsApiResponse$Modal$Button$ActionDto$CallToDriverButtonActionDto) hVar).a);
                    } else if (jl40.l(hVar, e.INSTANCE)) {
                        wqzVar = vqz.a;
                    } else {
                        if (!jl40.l(hVar, g.INSTANCE)) {
                            w511.b();
                            return null;
                        }
                        wqzVar = uqz.a;
                    }
                    String str4 = button.c;
                    return new orz(h7vVar, ijy0Var, ijy0Var2, arrayList, new nrz(str4 != null ? new h7v(str4, Image$ImageType.ICON) : null, new jjy0(button.b), wqzVar), h != null ? lrzVar.a.f(h) : kotlin.collections.b.f());
                }
                jst.e.k(a2, "LOST_ITEM");
                lostItemsUiStateInteractor$getDomainState$1.L$0 = null;
                lostItemsUiStateInteractor$getDomainState$1.L$1 = null;
                lostItemsUiStateInteractor$getDomainState$1.L$2 = null;
                lostItemsUiStateInteractor$getDomainState$1.label = 2;
                obj = cVar.e(dqk0Var, lostItemsUiStateInteractor$getDomainState$1);
            }
        }
        lostItemsUiStateInteractor$getDomainState$1 = new LostItemsUiStateInteractor$getDomainState$1(cVar, continuationImpl);
        Object obj3 = lostItemsUiStateInteractor$getDomainState$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lostItemsUiStateInteractor$getDomainState$1.label;
        if (i != 0) {
        }
        a2 = Result.a(a);
        if (a2 != null) {
        }
    }

    public final String b(xpk0 xpk0Var) {
        Date c;
        Calendar calendar = xpk0Var.c;
        yqg yqgVar = this.g;
        yqgVar.getClass();
        String a = zqg.a(calendar);
        String str = null;
        if (a != null && (c = yqgVar.d.c(a)) != null) {
            ThreadLocal threadLocal = yqgVar.b;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new SimpleDateFormat("dd MMMM", yqgVar.a.a());
                threadLocal.set(obj);
            }
            str = ((DateFormat) obj).format(c);
        }
        return g8e.p(str, " · ", g8e.p(evu0.N(MoneyInputEditView.DEFAULT_VALUE, 2, String.valueOf(calendar.get(11))), ":", evu0.N(MoneyInputEditView.DEFAULT_VALUE, 2, String.valueOf(calendar.get(12)))));
    }

    public final o c(dqk0 dqk0Var) {
        return new o(new rol0(new LostItemsUiStateInteractor$getUiStateFlow$1(this, dqk0Var, null)), new LostItemsUiStateInteractor$getUiStateFlow$2(this, dqk0Var, null));
    }

    public final void d(String str, Throwable th) {
        SafetyCenterAnalytics$LostItemsAnalyticsError safetyCenterAnalytics$LostItemsAnalyticsError = th instanceof LostItemsUiStateInteractor$NoDriverPhoneFoundException ? SafetyCenterAnalytics$LostItemsAnalyticsError.NoCallMode : SafetyCenterAnalytics$LostItemsAnalyticsError.Internal;
        ppl0 ppl0Var = this.f;
        ppl0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        hashMap.put("error", safetyCenterAnalytics$LostItemsAnalyticsError.getEventValue());
        ppl0Var.a.a("SafetyCenter.LostItemsModalCardContent.LoadingFailed", hashMap, 1, new HashMap());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[Catch: RuntimeException -> 0x0034, TryCatch #0 {RuntimeException -> 0x0034, blocks: (B:11:0x0030, B:12:0x0050, B:14:0x0054, B:16:0x0058, B:18:0x0060, B:21:0x00bc, B:22:0x00c3, B:23:0x00c4, B:24:0x00de, B:25:0x00df, B:26:0x00f5, B:30:0x0041), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df A[Catch: RuntimeException -> 0x0034, TryCatch #0 {RuntimeException -> 0x0034, blocks: (B:11:0x0030, B:12:0x0050, B:14:0x0054, B:16:0x0058, B:18:0x0060, B:21:0x00bc, B:22:0x00c3, B:23:0x00c4, B:24:0x00de, B:25:0x00df, B:26:0x00f5, B:30:0x0041), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(dqk0 dqk0Var, ContinuationImpl continuationImpl) {
        LostItemsUiStateInteractor$tryFallbackOrReturnError$1 lostItemsUiStateInteractor$tryFallbackOrReturnError$1;
        int i;
        xpk0 xpk0Var;
        dqk0 dqk0Var2 = dqk0Var;
        try {
            if (continuationImpl instanceof LostItemsUiStateInteractor$tryFallbackOrReturnError$1) {
                lostItemsUiStateInteractor$tryFallbackOrReturnError$1 = (LostItemsUiStateInteractor$tryFallbackOrReturnError$1) continuationImpl;
                int i2 = lostItemsUiStateInteractor$tryFallbackOrReturnError$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    lostItemsUiStateInteractor$tryFallbackOrReturnError$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = lostItemsUiStateInteractor$tryFallbackOrReturnError$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = lostItemsUiStateInteractor$tryFallbackOrReturnError$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ypk0 ypk0Var = this.b;
                        lostItemsUiStateInteractor$tryFallbackOrReturnError$1.L$0 = dqk0Var2;
                        lostItemsUiStateInteractor$tryFallbackOrReturnError$1.label = 1;
                        obj = ((ru.yandex.taxi.data.a) ypk0Var).a(dqk0Var2, lostItemsUiStateInteractor$tryFallbackOrReturnError$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dqk0Var2 = (dqk0) lostItemsUiStateInteractor$tryFallbackOrReturnError$1.L$0;
                        kotlin.b.b(obj);
                    }
                    xpk0Var = (xpk0) obj;
                    if (xpk0Var != null) {
                        throw new IllegalStateException("Order " + dqk0Var2 + " not found in ride history");
                    }
                    String str = xpk0Var.b;
                    if (str == null) {
                        throw new LostItemsUiStateInteractor$NoDriverPhoneFoundException("Driver phone not found for order " + dqk0Var2.a + ". It may have not been returned from the API.");
                    }
                    String b = b(xpk0Var);
                    String str2 = xpk0Var.e;
                    if (str2 == null) {
                        throw new IllegalArgumentException("Lost item modal must show only on completed orders and destination should be set");
                    }
                    return new orz(null, new hjy0(kyh0.forgotten_items_modal_title), new hjy0(kyh0.forgotten_items_modal_subtitle), Collections.singletonList(new mrz(new jjy0(b), new jjy0(xpk0Var.d + " — " + str2), new f7v(q3h0.ic_taxicar, Image$ImageType.ICON))), new nrz(null, new hjy0(kyh0.forgotten_items_modal_call_driver), new tqz(str)), kotlin.collections.b.f());
                }
            }
            if (i != 0) {
            }
            xpk0Var = (xpk0) obj;
            if (xpk0Var != null) {
            }
        } catch (RuntimeException e) {
            xby.l(jst.e, "LOST_ITEM", null, e, "Failed to get ride for lost item", 2);
            d(dqk0Var2.a, e);
            return prz.a;
        }
        lostItemsUiStateInteractor$tryFallbackOrReturnError$1 = new LostItemsUiStateInteractor$tryFallbackOrReturnError$1(this, continuationImpl);
        Object obj2 = lostItemsUiStateInteractor$tryFallbackOrReturnError$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lostItemsUiStateInteractor$tryFallbackOrReturnError$1.label;
    }
}
