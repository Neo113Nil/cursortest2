package com.yandex.mobile.drive.sdk.map;

import com.yandex.mapkit.GeoObjectCollection;
import com.yandex.mapkit.geometry.Point;
import defpackage.da20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.sdk.map.AddressHandler$onMethodCall$2", f = "AddressHandler.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AddressHandler$onMethodCall$2 extends SuspendLambda implements wls {
    final /* synthetic */ Point $point;
    final /* synthetic */ da20 $result;
    final /* synthetic */ Integer $zoom;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressHandler$onMethodCall$2(a aVar, Point point, Integer num, da20 da20Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$point = point;
        this.$zoom = num;
        this.$result = da20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressHandler$onMethodCall$2(this.this$0, this.$point, this.$zoom, this.$result, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressHandler$onMethodCall$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        HashMap hashMap = null;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            Point point = this.$point;
            Integer num = this.$zoom;
            int intValue = num != null ? num.intValue() : 19;
            this.label = 1;
            aVar.getClass();
            obj = kotlinx.coroutines.a.w(15000L, new AddressHandler$search$2(aVar, point, intValue, null), this);
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
        List list = (List) obj;
        if (list != null) {
            a aVar2 = this.this$0;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                HashMap a = a.a(aVar2, (GeoObjectCollection.Item) it.next());
                if (a != null) {
                    hashMap = a;
                    break;
                }
            }
        }
        this.$result.success(hashMap);
        return zy11.a;
    }
}
