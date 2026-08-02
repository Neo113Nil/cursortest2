package com.yandex.go.taxi.intercity.dashboard.impl.data.repository;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.taxi.intercity.dashboard.impl.data.api.IntercityDashboardApi;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.IntercityDashboardRequestDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.IntercityDashboardResponseDto;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.on2;
import defpackage.xfw;
import defpackage.yfw;
import defpackage.zn1;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes14.dex */
public final class a {
    public final i3y a;
    public final r0 b;
    public final r0 c;
    public volatile ZoneAddress d;
    public volatile Address e;

    public a(on2 on2Var) {
        this.a = kotlin.a.a(new zn1(on2Var, 20));
        r0 c = bvf0.c(new yfw(null, null, null, null, null, null, HProv.PP_VERSION_TIMESTAMP));
        this.b = c;
        this.c = c;
    }

    public final yfw a() {
        return (yfw) this.b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(IntercityDashboardRequestDto intercityDashboardRequestDto, ContinuationImpl continuationImpl) {
        IntercityDashboardRepository$requestDashboardContent$1 intercityDashboardRepository$requestDashboardContent$1;
        int i;
        if (continuationImpl instanceof IntercityDashboardRepository$requestDashboardContent$1) {
            intercityDashboardRepository$requestDashboardContent$1 = (IntercityDashboardRepository$requestDashboardContent$1) continuationImpl;
            int i2 = intercityDashboardRepository$requestDashboardContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardRepository$requestDashboardContent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intercityDashboardRepository$requestDashboardContent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardRepository$requestDashboardContent$1.label;
                if (i != 0) {
                    b.b(obj);
                    cmt<IntercityDashboardResponseDto> a = ((IntercityDashboardApi) this.a.getValue()).a(intercityDashboardRequestDto);
                    intercityDashboardRepository$requestDashboardContent$1.L$0 = null;
                    intercityDashboardRepository$requestDashboardContent$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(a, null, intercityDashboardRepository$requestDashboardContent$1);
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
                return (IntercityDashboardResponseDto) obj;
            }
        }
        intercityDashboardRepository$requestDashboardContent$1 = new IntercityDashboardRepository$requestDashboardContent$1(this, continuationImpl);
        Object obj2 = intercityDashboardRepository$requestDashboardContent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardRepository$requestDashboardContent$1.label;
        if (i != 0) {
        }
        return (IntercityDashboardResponseDto) obj2;
    }

    public final void c(String str, String str2) {
        r0 r0Var;
        Object value;
        do {
            r0Var = this.b;
            value = r0Var.getValue();
        } while (!r0Var.k(value, yfw.a((yfw) value, new xfw(str, str2), null, null, null, null, null, HProv.PP_DELETE_SAVED_PASSWD)));
    }
}
