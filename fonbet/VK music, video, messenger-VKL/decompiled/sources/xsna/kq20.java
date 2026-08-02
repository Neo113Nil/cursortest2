package xsna;

import com.android.billingclient.api.BillingClient;
import com.vk.api.generated.store.dto.StoreGetStockItemsResponseDto;
import com.vk.api.generated.store.dto.StoreStockItemDto;
import com.vk.core.apps.BuildInfo;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MiniAppSubscriptionImpl.kt */
/* loaded from: classes3.dex */
public final class kq20 implements jq20 {

    /* compiled from: MiniAppSubscriptionImpl.kt */
    @b6l(c = "com.vk.music.subscription.impl.bridge.MiniAppSubscriptionImpl", f = "MiniAppSubscriptionImpl.kt", l = {19}, m = "canShowAlternativePayment")
    public static final class a extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return kq20.this.a(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // xsna.jq20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(spj<? super Boolean> spjVar) {
        a aVar;
        int i;
        StoreStockItemDto storeStockItemDto;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    List singletonList = Collections.singletonList(new Integer(1));
                    BuildInfo.Client client = BuildInfo.a;
                    String v = BuildInfo.v();
                    boolean z = !vx2.d.o();
                    tfx tfxVar = new tfx("store.getStockItems", new n5e0(4), new wga0(4));
                    tfx.o(tfxVar, "type", BillingClient.FeatureType.SUBSCRIPTIONS, 0, 0, 12);
                    tfx.o(tfxVar, "merchant", v, 0, 0, 12);
                    tfxVar.i("product_ids", singletonList);
                    tfxVar.j("force_inapp", true);
                    tfxVar.j("no_inapp", z);
                    iz2 A = yfb.A(tfxVar);
                    p7x p7xVar = new p7x(5);
                    aVar.label = 1;
                    xz2.o(A.b, A.j);
                    obj = myc0.k(edi.m(vx2.d.m()), new dvj(A, p7xVar, null), aVar);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                storeStockItemDto = (StoreStockItemDto) j5g.a0(((StoreGetStockItemsResponseDto) obj).d());
                if (storeStockItemDto == null) {
                    return storeStockItemDto.k();
                }
                return null;
            }
        }
        aVar = new a((ContinuationImpl) spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        storeStockItemDto = (StoreStockItemDto) j5g.a0(((StoreGetStockItemsResponseDto) obj2).d());
        if (storeStockItemDto == null) {
        }
    }
}
