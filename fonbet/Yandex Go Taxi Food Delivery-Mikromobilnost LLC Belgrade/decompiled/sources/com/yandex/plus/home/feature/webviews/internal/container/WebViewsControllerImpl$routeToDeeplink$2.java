package com.yandex.plus.home.feature.webviews.internal.container;

import defpackage.dtt;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.nzg;
import defpackage.ozg;
import defpackage.pzg;
import defpackage.q230;
import defpackage.qzg;
import defpackage.rzg;
import defpackage.szg;
import defpackage.tse;
import defpackage.tzg;
import defpackage.u1w;
import defpackage.vzg;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.CryptoPro.ssl.cl_88;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.container.WebViewsControllerImpl$routeToDeeplink$2", f = "WebViewsControllerImpl.kt", l = {231, 232, 242, 252, cl_88.n, 272}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebViewsControllerImpl$routeToDeeplink$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $data;
    final /* synthetic */ vzg $deeplink;
    final /* synthetic */ String $from;
    final /* synthetic */ Map<String, String> $payload;
    final /* synthetic */ String $place;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewsControllerImpl$routeToDeeplink$2(a aVar, vzg vzgVar, String str, String str2, Map map, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$deeplink = vzgVar;
        this.$from = str;
        this.$place = str2;
        this.$payload = map;
        this.$data = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewsControllerImpl$routeToDeeplink$2(this.this$0, this.$deeplink, this.$from, this.$place, this.$payload, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewsControllerImpl$routeToDeeplink$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0097, code lost:
    
        if (com.yandex.plus.home.feature.webviews.internal.container.a.e(r0, r1, r8, r3, r4, r5, r7, r6, r17) == r10) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x010a, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        if (com.yandex.plus.home.feature.webviews.internal.container.a.g(r0, r1, r8, r3, r4, r5, r6, r17) == r10) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e2, code lost:
    
        if (com.yandex.plus.home.feature.webviews.internal.container.a.i(r0, r1, r8, r3, r4, r5, r5, r7, r6, r17) == r10) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0108, code lost:
    
        if (com.yandex.plus.home.feature.webviews.internal.container.a.f(r0, r3, r12, r4, r4, r5, r6, r7, r8, r17) == r10) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0059, code lost:
    
        if (r3 == r10) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0041, code lost:
    
        if (r0 == r10) goto L51;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        dtt dttVar;
        Object y;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (this.label) {
            case 0:
                kotlin.b.b(obj);
                com.yandex.plus.home.payment.google.a aVar = this.this$0.l;
                this.label = 1;
                b = aVar.b(this);
                break;
            case 1:
                kotlin.b.b(obj);
                b = obj;
                dttVar = (dtt) b;
                mth mthVar = new mth(this.this$0.L, 6);
                this.L$0 = dttVar;
                this.label = 2;
                y = e.y(mthVar, this);
                break;
            case 2:
                dttVar = (dtt) this.L$0;
                kotlin.b.b(obj);
                y = obj;
                dtt dttVar2 = dttVar;
                u1w u1wVar = (u1w) y;
                a aVar2 = this.this$0;
                q230 q230Var = new q230(aVar2.o, aVar2.p, null, null, null);
                vzg vzgVar = this.$deeplink;
                if (vzgVar instanceof ozg) {
                    ozg ozgVar = (ozg) vzgVar;
                    String str2 = this.$from;
                    str = str2 != null ? str2 : "";
                    String str3 = this.$place;
                    Map<String, String> map = this.$payload;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 3;
                    break;
                } else if (vzgVar instanceof rzg) {
                    rzg rzgVar = (rzg) vzgVar;
                    String str4 = this.$from;
                    str = str4 != null ? str4 : "";
                    String str5 = this.$place;
                    Map<String, String> map2 = this.$payload;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    break;
                } else {
                    if (!(vzgVar instanceof szg)) {
                        if (vzgVar instanceof qzg) {
                            qzg qzgVar = (qzg) vzgVar;
                            String str6 = this.$from;
                            str = str6 != null ? str6 : "";
                            String str7 = this.$place;
                            Map<String, String> map3 = this.$payload;
                            String str8 = str;
                            boolean z = qzgVar.b;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 6;
                            break;
                        } else if (vzgVar instanceof nzg) {
                            aVar2.M.removeView(aVar2.N);
                            this.this$0.p(u1wVar, null);
                        } else if (vzgVar instanceof pzg) {
                            aVar2.o(((pzg) vzgVar).a);
                        } else {
                            if (!(vzgVar instanceof tzg)) {
                                w511.b();
                                return null;
                            }
                            aVar2.o(((tzg) vzgVar).a);
                        }
                        return zy11.a;
                    }
                    szg szgVar = (szg) vzgVar;
                    String str9 = this.$from;
                    str = str9 != null ? str9 : "";
                    String str10 = this.$place;
                    Map<String, String> map4 = this.$payload;
                    String str11 = this.$data;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    break;
                }
            case 3:
            case 4:
            case 5:
            case 6:
                kotlin.b.b(obj);
                return zy11.a;
            default:
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
