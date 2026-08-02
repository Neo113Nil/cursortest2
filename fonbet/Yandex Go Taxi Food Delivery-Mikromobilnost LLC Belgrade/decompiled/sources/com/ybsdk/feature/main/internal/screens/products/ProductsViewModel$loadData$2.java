package com.ybsdk.feature.main.internal.screens.products;

import defpackage.dbf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.t400;
import defpackage.tse;
import defpackage.u8j0;
import defpackage.wls;
import defpackage.zbf0;
import defpackage.zva0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.main.internal.screens.products.ProductsViewModel$loadData$2", f = "ProductsViewModel.kt", l = {149}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductsViewModel$loadData$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isFromPullRefresh;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsViewModel$loadData$2(a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$isFromPullRefresh = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductsViewModel$loadData$2(this.this$0, this.$isFromPullRefresh, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductsViewModel$loadData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        dbf0 dbf0Var;
        Object b0;
        zva0 zva0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            boolean z = this.$isFromPullRefresh;
            pz40 Y = aVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, dbf0.a((dbf0) value, null, false, false, null, null, z, null, false, false, false, !((t400) aVar.F).c(), 4063)));
            this.this$0.C.T.a.a("products_screen.initiated", null);
            zva0 b = this.this$0.H.b("ProductsScreen.Data");
            pz40 Y2 = this.this$0.Y();
            do {
                r0Var2 = (r0) Y2;
                value2 = r0Var2.getValue();
                dbf0Var = (dbf0) value2;
            } while (!r0Var2.k(value2, dbf0.a(dbf0Var, dbf0Var.a.c(), false, false, null, null, false, null, false, false, false, false, 8190)));
            a aVar2 = this.this$0;
            this.L$0 = b;
            this.label = 1;
            b0 = a.b0(aVar2, this);
            if (b0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            zva0Var = b;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zva0 zva0Var2 = (zva0) this.L$0;
            b.b(obj);
            b0 = obj;
            zva0Var = zva0Var2;
        }
        u8j0 u8j0Var = (u8j0) b0;
        pz40 Y3 = this.this$0.Y();
        while (true) {
            r0 r0Var3 = (r0) Y3;
            Object value3 = r0Var3.getValue();
            u8j0 u8j0Var2 = u8j0Var;
            if (r0Var3.k(value3, dbf0.a((dbf0) value3, u8j0Var, false, false, null, null, false, null, false, false, false, false, 8158))) {
                break;
            }
            u8j0Var = u8j0Var2;
        }
        zva0Var.a();
        if (((dbf0) this.this$0.X()).a instanceof r8j0) {
            this.this$0.Z(zbf0.a);
            this.this$0.k0();
        }
        return zy11.a;
    }
}
