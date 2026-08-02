package com.yandex.go.superapp.web.domain;

import com.yandex.go.proxyprovision.GoEndpointDescriptionResult;
import com.yandex.go.proxyprovision.GoEndpointDescriptionResultHeader;
import com.yandex.go.proxyprovision.GoEndpointDescriptionResultQuery;
import defpackage.ck7;
import defpackage.evu0;
import defpackage.g8a1;
import defpackage.iq20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pot;
import defpackage.q0o;
import defpackage.t0o;
import defpackage.tcc;
import defpackage.tse;
import defpackage.ug7;
import defpackage.w0o;
import defpackage.wls;
import defpackage.z0o;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.proxy.ProxyProvisionNativeApi;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lck7;", "Lt0o;", "<anonymous>", "(Ltse;)Lck7;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.web.domain.MobEndpointDescriptionProvider$requestEndpointDescription$2", f = "MobEndpointDescriptionProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MobEndpointDescriptionProvider$requestEndpointDescription$2 extends SuspendLambda implements wls {
    final /* synthetic */ q0o $params;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobEndpointDescriptionProvider$requestEndpointDescription$2(q0o q0oVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$params = q0oVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobEndpointDescriptionProvider$requestEndpointDescription$2(this.$params, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MobEndpointDescriptionProvider$requestEndpointDescription$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        String str = this.$params.a;
        if (str == null || evu0.J(str)) {
            this.this$0.getClass();
            return new ck7(null, new ug7("endpoint_description_no_api_name_param", ProxyProvisionNativeApi.INCORRECT_PARAMS_DESCRIPTION));
        }
        iq20 b = ((pot) this.this$0.b).a.b(str);
        a aVar = this.this$0;
        if (b == null) {
            aVar.getClass();
            return new ck7(null, new ug7("endpoint_description_not_found_proxies", ProxyProvisionNativeApi.NOT_FOUND_PROXIES_DESCRIPTION.concat(str)));
        }
        aVar.getClass();
        GoEndpointDescriptionResult c = g8a1.c(b);
        String str2 = c.a;
        List<GoEndpointDescriptionResultHeader> list = c.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (GoEndpointDescriptionResultHeader goEndpointDescriptionResultHeader : list) {
            arrayList.add(new w0o(goEndpointDescriptionResultHeader.a, goEndpointDescriptionResultHeader.b));
        }
        List<GoEndpointDescriptionResultQuery> list2 = c.c;
        ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
        for (GoEndpointDescriptionResultQuery goEndpointDescriptionResultQuery : list2) {
            arrayList2.add(new z0o(goEndpointDescriptionResultQuery.a, goEndpointDescriptionResultQuery.b));
        }
        return new ck7(new t0o(str2, arrayList, arrayList2), null);
    }
}
