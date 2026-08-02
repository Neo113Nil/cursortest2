package com.yandex.mobile.drive.sdk.map;

import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.SpannableString;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.search.SuggestItem;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.da20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zu0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.sdk.map.AddressHandler$onMethodCall$1", f = "AddressHandler.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AddressHandler$onMethodCall$1 extends SuspendLambda implements wls {
    final /* synthetic */ Point $point;
    final /* synthetic */ da20 $result;
    final /* synthetic */ String $text;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressHandler$onMethodCall$1(a aVar, Point point, String str, da20 da20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$point = point;
        this.$text = str;
        this.$result = da20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressHandler$onMethodCall$1(this.this$0, this.$point, this.$text, this.$result, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressHandler$onMethodCall$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            Point point = this.$point;
            String str = this.$text;
            this.label = 1;
            aVar.getClass();
            obj = kotlinx.coroutines.a.w(15000L, new AddressHandler$requestSuggestion$2(aVar, str, point, null), this);
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
        Iterable iterable = (List) obj;
        if (iterable == null) {
            iterable = EmptyList.a;
        }
        Iterable<SuggestItem> iterable2 = iterable;
        ArrayList arrayList = new ArrayList(tcc.n(iterable2, 10));
        for (SuggestItem suggestItem : iterable2) {
            Pair pair = new Pair("title", suggestItem.getTitle().getText());
            SpannableString subtitle = suggestItem.getSubtitle();
            Pair pair2 = new Pair("subtitle", subtitle != null ? subtitle.getText() : null);
            LocalizedValue distance = suggestItem.getDistance();
            Pair pair3 = new Pair("hint", distance != null ? distance.getText() : null);
            int i2 = zu0.a[suggestItem.getAction().ordinal()];
            arrayList.add(kotlin.collections.b.h(pair, pair2, pair3, new Pair("action", i2 != 1 ? i2 != 2 ? null : "substitute" : "search"), new Pair(LaunchBrowserActivity.KEY_URI, suggestItem.getUri())));
        }
        this.$result.success(arrayList);
        return zy11.a;
    }
}
