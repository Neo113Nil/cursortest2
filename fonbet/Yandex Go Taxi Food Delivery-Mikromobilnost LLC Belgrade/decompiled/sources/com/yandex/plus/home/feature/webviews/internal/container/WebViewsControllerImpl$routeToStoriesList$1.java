package com.yandex.plus.home.feature.webviews.internal.container;

import com.yandex.plus.log.api.LogPriority;
import defpackage.dtt;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.q230;
import defpackage.szg;
import defpackage.tse;
import defpackage.u1w;
import defpackage.wk41;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.container.WebViewsControllerImpl$routeToStoriesList$1", f = "WebViewsControllerImpl.kt", l = {307, 308, 318}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class WebViewsControllerImpl$routeToStoriesList$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $from;
    final /* synthetic */ Map<String, String> $payload;
    final /* synthetic */ String $place;
    final /* synthetic */ List<wk41> $storyEntries;
    final /* synthetic */ boolean $validateWhitelist;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewsControllerImpl$routeToStoriesList$1(a aVar, List list, String str, String str2, Map map, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$storyEntries = list;
        this.$from = str;
        this.$place = str2;
        this.$payload = map;
        this.$validateWhitelist = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewsControllerImpl$routeToStoriesList$1(this.this$0, this.$storyEntries, this.$from, this.$place, this.$payload, this.$validateWhitelist, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewsControllerImpl$routeToStoriesList$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e9, code lost:
    
        if (com.yandex.plus.home.feature.webviews.internal.container.a.h(r0, r3, r2, r3, r11, r5, r6, r7, r16) == r9) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00eb, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r2 == r9) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r0 == r9) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        dtt dttVar;
        Object y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            pgz pgzVar = this.this$0.w;
            List<wk41> list = this.$storyEntries;
            boolean z = this.$validateWhitelist;
            LogPriority logPriority = LogPriority.DEBUG;
            if (pgzVar.e(logPriority)) {
                pgzVar.a(logPriority, "WebViewsControllerImpl", "routeToStoriesList(storyEntries=" + list + ", validateWhitelist=" + z);
            }
            com.yandex.plus.home.payment.google.a aVar = this.this$0.l;
            this.label = 1;
            b = aVar.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                dttVar = (dtt) this.L$0;
                kotlin.b.b(obj);
                y = obj;
                dtt dttVar2 = dttVar;
                u1w u1wVar = (u1w) y;
                a aVar2 = this.this$0;
                q230 q230Var = new q230(aVar2.o, aVar2.p, null, null, null);
                List<wk41> list2 = this.$storyEntries;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    szg szgVar = ((wk41) obj2).a;
                    arrayList.add(obj2);
                }
                if (!arrayList.isEmpty()) {
                    String str = this.$from;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    a aVar3 = this.this$0;
                    List<wk41> list3 = this.$storyEntries;
                    String str3 = this.$place;
                    Map<String, String> map = this.$payload;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 3;
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
            b = obj;
        }
        dttVar = (dtt) b;
        mth mthVar = new mth(this.this$0.L, 6);
        this.L$0 = dttVar;
        this.label = 2;
        y = e.y(mthVar, this);
    }
}
