package com.yandex.go.taxi.order.change.source.interactor;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.order.change.common.data.ConfirmChangeResponse;
import com.yandex.go.taxi.order.change.source.data.SourceChangeReason;
import com.yandex.go.taxi.order.models.api.response.OrderChangesDto;
import defpackage.fmt;
import defpackage.i3y;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.on2;
import defpackage.sjh;
import defpackage.tb90;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vyx0;
import defpackage.w511;
import defpackage.yf9;
import defpackage.zn1;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class c {
    public final tt2 a;
    public final com.yandex.go.taxi.order.change.source.data.e b;
    public final vyx0 c;
    public final i3y d;

    public c(on2 on2Var, tt2 tt2Var, com.yandex.go.taxi.order.change.source.data.e eVar, vyx0 vyx0Var) {
        this.a = tt2Var;
        this.b = eVar;
        this.c = vyx0Var;
        this.d = kotlin.a.a(new zn1(on2Var, 7));
    }

    public final Object a(String str, zzs zzsVar, Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ChangeSourcePointInteractor$checkSourcePointChange$2(this, str, zzsVar, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, Address address, SourceChangeReason sourceChangeReason, ContinuationImpl continuationImpl) {
        ChangeSourcePointInteractor$confirmSourcePointChange$1 changeSourcePointInteractor$confirmSourcePointChange$1;
        int i;
        String str3;
        Address address2;
        int i2;
        if (continuationImpl instanceof ChangeSourcePointInteractor$confirmSourcePointChange$1) {
            changeSourcePointInteractor$confirmSourcePointChange$1 = (ChangeSourcePointInteractor$confirmSourcePointChange$1) continuationImpl;
            int i3 = changeSourcePointInteractor$confirmSourcePointChange$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                changeSourcePointInteractor$confirmSourcePointChange$1.label = i3 - Integer.MIN_VALUE;
                ChangeSourcePointInteractor$confirmSourcePointChange$1 changeSourcePointInteractor$confirmSourcePointChange$12 = changeSourcePointInteractor$confirmSourcePointChange$1;
                Object obj = changeSourcePointInteractor$confirmSourcePointChange$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeSourcePointInteractor$confirmSourcePointChange$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    ChangeSourcePointInteractor$confirmSourcePointChange$response$1 changeSourcePointInteractor$confirmSourcePointChange$response$1 = new ChangeSourcePointInteractor$confirmSourcePointChange$response$1(this, str, str2, address, sourceChangeReason, null);
                    changeSourcePointInteractor$confirmSourcePointChange$12.L$0 = null;
                    changeSourcePointInteractor$confirmSourcePointChange$12.L$1 = str2;
                    changeSourcePointInteractor$confirmSourcePointChange$12.L$2 = address;
                    changeSourcePointInteractor$confirmSourcePointChange$12.L$3 = null;
                    changeSourcePointInteractor$confirmSourcePointChange$12.label = 1;
                    obj = tje.k0(mdhVar, changeSourcePointInteractor$confirmSourcePointChange$response$1, changeSourcePointInteractor$confirmSourcePointChange$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str3 = str2;
                    address2 = address;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    address2 = (Address) changeSourcePointInteractor$confirmSourcePointChange$12.L$2;
                    str3 = (String) changeSourcePointInteractor$confirmSourcePointChange$12.L$1;
                    kotlin.b.b(obj);
                }
                fmt fmtVar = (fmt) obj;
                OrderChangesDto.Status status = ((ConfirmChangeResponse) fmtVar.a).b;
                i2 = status != null ? -1 : yf9.a[status.ordinal()];
                if (i2 != -1) {
                    if (i2 == 1 || i2 == 2) {
                        vyx0 vyx0Var = this.c;
                        vyx0Var.getClass();
                        tb90 panoramaData = address2.getPanoramaData();
                        if (panoramaData != null) {
                            vyx0Var.a.d(vyx0.a(address2, str3), panoramaData);
                        }
                    } else if (i2 != 3 && i2 != 4) {
                        w511.b();
                        return null;
                    }
                }
                return fmtVar;
            }
        }
        changeSourcePointInteractor$confirmSourcePointChange$1 = new ChangeSourcePointInteractor$confirmSourcePointChange$1(this, continuationImpl);
        ChangeSourcePointInteractor$confirmSourcePointChange$1 changeSourcePointInteractor$confirmSourcePointChange$122 = changeSourcePointInteractor$confirmSourcePointChange$1;
        Object obj2 = changeSourcePointInteractor$confirmSourcePointChange$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeSourcePointInteractor$confirmSourcePointChange$122.label;
        if (i != 0) {
        }
        fmt fmtVar2 = (fmt) obj2;
        OrderChangesDto.Status status2 = ((ConfirmChangeResponse) fmtVar2.a).b;
        if (status2 != null) {
        }
        if (i2 != -1) {
        }
        return fmtVar2;
    }
}
