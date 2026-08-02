package com.yandex.go.taxi.order.change.due.data.repository;

import com.yandex.go.taxi.order.change.due.data.api.ChangeOrderDueApi;
import com.yandex.go.taxi.order.change.due.data.dto.ChangeDueRequest;
import com.yandex.go.taxi.order.change.due.data.dto.ChangeDueResponse;
import defpackage.cmt;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.on2;
import defpackage.zn1;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final i3y a;

    public a(on2 on2Var) {
        this.a = kotlin.a.a(new zn1(on2Var, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        ChangeOrderDueRepository$changeDue$1 changeOrderDueRepository$changeDue$1;
        int i;
        if (continuationImpl instanceof ChangeOrderDueRepository$changeDue$1) {
            changeOrderDueRepository$changeDue$1 = (ChangeOrderDueRepository$changeDue$1) continuationImpl;
            int i2 = changeOrderDueRepository$changeDue$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeOrderDueRepository$changeDue$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changeOrderDueRepository$changeDue$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeOrderDueRepository$changeDue$1.label;
                if (i != 0) {
                    b.b(obj);
                    cmt<ChangeDueResponse> a = ((ChangeOrderDueApi) this.a.getValue()).a(new ChangeDueRequest(str, str2));
                    changeOrderDueRepository$changeDue$1.L$0 = null;
                    changeOrderDueRepository$changeDue$1.L$1 = null;
                    changeOrderDueRepository$changeDue$1.L$2 = null;
                    changeOrderDueRepository$changeDue$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(a, null, changeOrderDueRepository$changeDue$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return (ChangeDueResponse) obj;
            }
        }
        changeOrderDueRepository$changeDue$1 = new ChangeOrderDueRepository$changeDue$1(this, continuationImpl);
        Object obj2 = changeOrderDueRepository$changeDue$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeOrderDueRepository$changeDue$1.label;
        if (i != 0) {
        }
        return (ChangeDueResponse) obj2;
    }
}
