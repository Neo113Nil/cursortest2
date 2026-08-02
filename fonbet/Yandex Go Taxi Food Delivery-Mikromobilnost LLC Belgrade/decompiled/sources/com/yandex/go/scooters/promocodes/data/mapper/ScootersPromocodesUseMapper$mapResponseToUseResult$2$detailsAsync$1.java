package com.yandex.go.scooters.promocodes.data.mapper;

import com.yandex.go.scooters.promocodes.data.model.ScootersPromocodesUseResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.promocodes.data.mapper.ScootersPromocodesUseMapper$mapResponseToUseResult$2$detailsAsync$1", f = "ScootersPromocodesUseMapper.kt", l = {22}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPromocodesUseMapper$mapResponseToUseResult$2$detailsAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersPromocodesUseResponse $response;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPromocodesUseMapper$mapResponseToUseResult$2$detailsAsync$1(a aVar, ScootersPromocodesUseResponse scootersPromocodesUseResponse, Continuation continuation) {
        super(2, continuation);
        this.$response = scootersPromocodesUseResponse;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPromocodesUseMapper$mapResponseToUseResult$2$detailsAsync$1(this.this$0, this.$response, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPromocodesUseMapper$mapResponseToUseResult$2$detailsAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0053  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0074 -> B:5:0x0075). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Collection arrayList;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            List list = this.$response.b;
            a aVar2 = this.this$0;
            aVar = aVar2;
            arrayList = new ArrayList(tcc.n(list, 10));
            it = list.iterator();
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = (Collection) this.L$7;
            it = (Iterator) this.L$4;
            Collection collection = (Collection) this.L$3;
            aVar = (a) this.L$1;
            b.b(obj);
            arrayList.add((CharSequence) obj);
            arrayList = collection;
            if (it.hasNext()) {
                FormattedText formattedText = (FormattedText) it.next();
                e eVar = aVar.b;
                this.L$0 = null;
                this.L$1 = aVar;
                this.L$2 = null;
                this.L$3 = arrayList;
                this.L$4 = it;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = arrayList;
                this.label = 1;
                obj = eVar.t(formattedText, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                collection = arrayList;
                arrayList.add((CharSequence) obj);
                arrayList = collection;
                if (it.hasNext()) {
                    return (List) arrayList;
                }
            }
        }
    }
}
