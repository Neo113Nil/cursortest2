package xsna;

import com.vk.api.generated.market.dto.MarketGetContentAttachedItemsContentTypeDto;
import com.vk.api.generated.market.dto.MarketGetContentAttachedItemsResponseDto;
import com.vk.api.generated.market.dto.MarketMarketItemFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.design.compose.tile.model.ProductCtaButton;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ContentProductsInlineActor.kt */
@b6l(c = "com.vk.ecomm.contentproducts.ContentProductsInlineActor$performLoadData$1", f = "ContentProductsInlineActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class jkj extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ gkj this$0;

    /* compiled from: ContentProductsInlineActor.kt */
    @b6l(c = "com.vk.ecomm.contentproducts.ContentProductsInlineActor$performLoadData$1$1", f = "ContentProductsInlineActor.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ gkj this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gkj gkjVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = gkjVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.this$0, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            final boolean z;
            yvj yvjVar = (yvj) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            boolean z2 = true;
            try {
                if (i == 0) {
                    kotlin.a.a(obj);
                    gkj gkjVar = this.this$0;
                    iz2 A = yfb.A(gkjVar.f.f.l(gkjVar.d, (int) gkjVar.e, MarketGetContentAttachedItemsContentTypeDto.POST));
                    this.L$0 = yvjVar;
                    this.label = 1;
                    obj = evj.p(A, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                final MarketGetContentAttachedItemsResponseDto marketGetContentAttachedItemsResponseDto = (MarketGetContentAttachedItemsResponseDto) obj;
                List<MarketMarketItemFullDto> d = marketGetContentAttachedItemsResponseDto.d();
                gkj gkjVar2 = this.this$0;
                final List<hpd0> a = dkj.a(d, gkjVar2.f, (kc10) gkjVar2.h.getValue());
                List<MarketMarketItemFullDto> f = marketGetContentAttachedItemsResponseDto.f();
                gkj gkjVar3 = this.this$0;
                final List<hpd0> a2 = dkj.a(f, gkjVar3.f, (kc10) gkjVar3.h.getValue());
                ArrayList u0 = j5g.u0(a2, a);
                if (!u0.isEmpty()) {
                    Iterator it = u0.iterator();
                    while (it.hasNext()) {
                        zjk zjkVar = ((hpd0) it.next()).g;
                        if ((zjkVar != null ? zjkVar.a : null) != ProductCtaButton.Type.GoToCart) {
                            if ((zjkVar != null ? zjkVar.a : null) == ProductCtaButton.Type.AddToCart) {
                            }
                        }
                        z = true;
                    }
                }
                z = false;
                if (z) {
                    ArrayList arrayList = new ArrayList(c5g.u(u0, 10));
                    Iterator it2 = u0.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((hpd0) it2.next()).b);
                    }
                    Set S0 = j5g.S0(arrayList);
                    gkj gkjVar4 = this.this$0;
                    if (S0.size() != 1) {
                        z2 = false;
                    }
                    gkj.q(gkjVar4, z2, (UserId) j5g.Z(S0));
                }
                final gkj gkjVar5 = this.this$0;
            } catch (Exception e) {
                zvj.e(yvjVar);
                gkj gkjVar6 = this.this$0;
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkj(gkj gkjVar, spj<? super jkj> spjVar) {
        super(2, spjVar);
        this.this$0 = gkjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        jkj jkjVar = new jkj(this.this$0, spjVar);
        jkjVar.L$0 = obj;
        return jkjVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jkj) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        myc0.h(yvjVar, hqu0.b(), null, new a(this.this$0, null), 2);
        return s3q0.a;
    }
}
