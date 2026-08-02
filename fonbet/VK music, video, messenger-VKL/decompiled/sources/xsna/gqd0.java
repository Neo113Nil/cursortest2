package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.product_list.router.ProductListInternalParams;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.rpd0;

/* compiled from: ProductListMviTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.product_list.presentation.ProductListMviTaskExecutor$trackOpenProduct$1", f = "ProductListMviTaskExecutor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class gqd0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $fullId;
    int label;
    final /* synthetic */ com.vk.ecomm.product_list.presentation.o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqd0(com.vk.ecomm.product_list.presentation.o oVar, String str, spj<? super gqd0> spjVar) {
        super(2, spjVar);
        this.this$0 = oVar;
        this.$fullId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new gqd0(this.this$0, this.$fullId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((gqd0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        List<vpd0> list = ((aqd0) this.this$0.b.getCurrentState()).e;
        String str = this.$fullId;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (epx.f(((vpd0) obj2).s, str)) {
                break;
            }
        }
        vpd0 vpd0Var = (vpd0) obj2;
        if (vpd0Var != null) {
            com.vk.ecomm.product_list.presentation.o oVar = this.this$0;
            rpd0 rpd0Var = oVar.j;
            ProductListInternalParams productListInternalParams = ((aqd0) oVar.b.getCurrentState()).b;
            rpd0Var.getClass();
            UserId userId = vpd0Var.b;
            long j = vpd0Var.a;
            int i = rpd0.a.$EnumSwitchMapping$0[productListInternalParams.f.ordinal()];
            if (i == 1) {
                String str2 = productListInternalParams.i;
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(j), Long.valueOf(userId.b), null, null, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick(MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick.EntryPoint.PRODUCT_TILE, null, str2), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
            } else if (i == 2) {
                SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(j), Long.valueOf(userId.b), null, productListInternalParams.i, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick(MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick.EntryPoint.PRODUCT_TILE, null, null), 2);
                UiTracker uiTracker2 = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
                uzp0 uzp0Var2 = UiTracker.h;
                uzp0Var2.getClass();
                new bjc(c2, b2, uzp0Var2.a).q();
            } else if (i == 3) {
                SchemeStat$TypeClick b3 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(j), Long.valueOf(userId.b), null, null, null, 40, null), new MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick(MobileOfficialAppsFeedStat$TypeFeedOpenMarketItemClick.EntryPoint.PRODUCT_TILE, null, null), 2);
                UiTracker uiTracker3 = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c3 = UiTracker.c();
                uzp0 uzp0Var3 = UiTracker.h;
                uzp0Var3.getClass();
                new bjc(c3, b3, uzp0Var3.a).q();
            }
        }
        return s3q0.a;
    }
}
