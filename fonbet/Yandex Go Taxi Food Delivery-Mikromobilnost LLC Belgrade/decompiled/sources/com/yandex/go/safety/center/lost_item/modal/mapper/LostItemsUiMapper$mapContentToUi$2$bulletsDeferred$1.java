package com.yandex.go.safety.center.lost_item.modal.mapper;

import defpackage.bvf0;
import defpackage.erz;
import defpackage.mrz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.orz;
import defpackage.tcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lerz;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.lost_item.modal.mapper.LostItemsUiMapper$mapContentToUi$2$bulletsDeferred$1", f = "LostItemsUiMapper.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LostItemsUiMapper$mapContentToUi$2$bulletsDeferred$1 extends SuspendLambda implements wls {
    final /* synthetic */ orz $content;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LostItemsUiMapper$mapContentToUi$2$bulletsDeferred$1(orz orzVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$content = orzVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LostItemsUiMapper$mapContentToUi$2$bulletsDeferred$1(this.$content, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LostItemsUiMapper$mapContentToUi$2$bulletsDeferred$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0083 -> B:5:0x0084). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Collection arrayList;
        orz orzVar;
        a aVar;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            orz orzVar2 = this.$content;
            List list = orzVar2.d;
            a aVar2 = this.this$0;
            arrayList = new ArrayList(tcc.n(list, 10));
            orzVar = orzVar2;
            aVar = aVar2;
            it = list.iterator();
            r1 = arrayList;
            if (it.hasNext()) {
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Collection collection = (Collection) this.L$8;
            it = (Iterator) this.L$5;
            arrayList = (Collection) this.L$4;
            orzVar = (orz) this.L$2;
            aVar = (a) this.L$1;
            b.b(obj);
            collection.add((erz) obj);
            collection = arrayList;
            if (it.hasNext()) {
                mrz mrzVar = (mrz) it.next();
                Map map = orzVar.f;
                this.L$0 = null;
                this.L$1 = aVar;
                this.L$2 = orzVar;
                this.L$3 = null;
                this.L$4 = collection;
                this.L$5 = it;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = collection;
                this.label = 1;
                aVar.getClass();
                obj = bvf0.n(new LostItemsUiMapper$mapBulletToUi$2(aVar, mrzVar, map, null), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                arrayList = collection;
                collection.add((erz) obj);
                collection = arrayList;
                if (it.hasNext()) {
                    return (List) collection;
                }
            }
        }
    }
}
