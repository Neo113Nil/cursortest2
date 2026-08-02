package com.ybsdk.feature.main.internal.screens.products;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.dbf0;
import defpackage.g92;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qa60;
import defpackage.ra60;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.main.internal.screens.products.ProductsFragment$onCreate$1$3", f = "ProductsFragment.kt", l = {221}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ProductsFragment$onCreate$1$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ ProductsFragment this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.main.internal.screens.products.ProductsFragment$onCreate$1$3$1", f = "ProductsFragment.kt", l = {222}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.main.internal.screens.products.ProductsFragment$onCreate$1$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ ProductsFragment this$0;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/ybsdk/feature/nfc/api/models/NfcPaymentMethod;", "tokenizedCards", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
        @mvg(c = "com.ybsdk.feature.main.internal.screens.products.ProductsFragment$onCreate$1$3$1$1", f = "ProductsFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.ybsdk.feature.main.internal.screens.products.ProductsFragment$onCreate$1$3$1$1, reason: invalid class name and collision with other inner class name */
        final class C00911 extends SuspendLambda implements wls {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ProductsFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00911(ProductsFragment productsFragment, Continuation continuation) {
                super(2, continuation);
                this.this$0 = productsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C00911 c00911 = new C00911(this.this$0, continuation);
                c00911.L$0 = obj;
                return c00911;
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                C00911 c00911 = (C00911) create((List) obj, (Continuation) obj2);
                zy11 zy11Var = zy11.a;
                c00911.invokeSuspend(zy11Var);
                return zy11Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                r0 r0Var;
                Object value;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                List list = (List) this.L$0;
                pz40 Y = ProductsFragment.access$getViewModel(this.this$0).Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, dbf0.a((dbf0) value, null, false, false, null, null, false, list, false, false, false, false, 7935)));
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProductsFragment productsFragment, Continuation continuation) {
            super(2, continuation);
            this.this$0 = productsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            qa60 qa60Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                b.b(obj);
                qa60Var = this.this$0.nfcViewFeature;
                ((ra60) qa60Var).getClass();
                g92 g92Var = new g92(2, EmptyList.a);
                C00911 c00911 = new C00911(this.this$0, null);
                this.label = 1;
                if (e.k(g92Var, c00911, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsFragment$onCreate$1$3(ProductsFragment productsFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = productsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductsFragment$onCreate$1$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductsFragment$onCreate$1$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ProductsFragment productsFragment = this.this$0;
            Lifecycle.State state = Lifecycle.State.CREATED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(productsFragment, null);
            this.label = 1;
            if (b0.a(productsFragment, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
