package com.yandex.mobile.drive.sdk.map;

import com.yandex.mapkit.geometry.BoundingBoxHelper;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.search.SearchManager;
import com.yandex.mapkit.search.SuggestOptions;
import com.yandex.mapkit.search.SuggestSession;
import defpackage.bv0;
import defpackage.dvw;
import defpackage.j1;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/mapkit/search/SuggestItem;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.sdk.map.AddressHandler$requestSuggestion$2", f = "AddressHandler.kt", l = {229}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AddressHandler$requestSuggestion$2 extends SuspendLambda implements wls {
    final /* synthetic */ Point $point;
    final /* synthetic */ String $query;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressHandler$requestSuggestion$2(a aVar, String str, Point point, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$query = str;
        this.$point = point;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressHandler$requestSuggestion$2(this.this$0, this.$query, this.$point, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressHandler$requestSuggestion$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        String str = this.$query;
        Point point = this.$point;
        this.L$0 = aVar;
        this.L$1 = str;
        this.L$2 = point;
        this.I$0 = 0;
        this.label = 1;
        j18 j18Var = new j18(1, dvw.b(this));
        j18Var.u();
        SuggestSession createSuggestSession = ((SearchManager) aVar.b.getValue()).createSuggestSession();
        createSuggestSession.suggest(str, BoundingBoxHelper.getBounds(point), new SuggestOptions(), new bv0(j18Var));
        j18Var.w(new j1(1, createSuggestSession));
        Object s = j18Var.s();
        return s == coroutineSingletons ? coroutineSingletons : s;
    }
}
