package com.yandex.go.taxi.order.details.v2.state.elements.driver.avatar;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import defpackage.ggk0;
import defpackage.hgk0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lhgk0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.driver.avatar.RideCardDriverAvatarDataSource$collectAvatarState$1", f = "RideCardDriverAvatarDataSource.kt", l = {31, 36, 39, 41, 44}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardDriverAvatarDataSource$collectAvatarState$1 extends SuspendLambda implements wls {
    final /* synthetic */ n7v $driverImage;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardDriverAvatarDataSource$collectAvatarState$1(n7v n7vVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$driverImage = n7vVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardDriverAvatarDataSource$collectAvatarState$1 rideCardDriverAvatarDataSource$collectAvatarState$1 = new RideCardDriverAvatarDataSource$collectAvatarState$1(this.$driverImage, this.this$0, continuation);
        rideCardDriverAvatarDataSource$collectAvatarState$1.L$0 = obj;
        return rideCardDriverAvatarDataSource$collectAvatarState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardDriverAvatarDataSource$collectAvatarState$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        if (r12 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String a;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            if (i != 2) {
                if (i == 3) {
                    a = (String) this.L$1;
                    b.b(obj);
                } else {
                    if (i != 4 && i != 5) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
            }
            b.b(obj);
            return zy11Var;
        }
        b.b(obj);
        n7v n7vVar = this.$driverImage;
        if (n7vVar == null) {
            hgk0 hgk0Var = hgk0.c;
            this.L$0 = null;
            this.label = 1;
            return vprVar.emit(hgk0Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        a = this.this$0.d.a(n7vVar);
        a aVar = this.this$0;
        if (a == null) {
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            aVar.getClass();
            if (vprVar.emit(new hgk0(false, aVar.c()), this) == coroutineSingletons) {
            }
        } else {
            ggk0 ggk0Var = aVar.a;
            this.L$0 = vprVar;
            this.L$1 = a;
            this.label = 3;
            ggk0Var.a.getClass();
            sjh sjhVar = uyj.a;
            obj = tje.k0(mdh.b, new RideCardDriverAvatarRepository$takeAvatarFromCache$2(ggk0Var, a, null), this);
        }
        Bitmap bitmap = (Bitmap) obj;
        a aVar2 = this.this$0;
        if (bitmap == null) {
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 4;
            if (a.a(aVar2, vprVar, a, this) == coroutineSingletons) {
            }
        } else {
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 5;
            aVar2.getClass();
            if (vprVar.emit(new hgk0(false, pkf.g(new BitmapDrawable(aVar2.e.getResources(), bitmap), a, null)), this) == coroutineSingletons) {
            }
        }
    }
}
