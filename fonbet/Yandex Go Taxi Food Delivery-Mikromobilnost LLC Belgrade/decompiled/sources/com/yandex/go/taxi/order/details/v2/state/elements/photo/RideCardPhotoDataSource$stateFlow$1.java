package com.yandex.go.taxi.order.details.v2.state.elements.photo;

import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$Photo;
import defpackage.avj0;
import defpackage.ijk0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.plk0;
import defpackage.qlk0;
import defpackage.rlk0;
import defpackage.tje;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lzjk0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.photo.RideCardPhotoDataSource$stateFlow$1", f = "RideCardPhotoDataSource.kt", l = {31, 43, 52, 54, 64}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardPhotoDataSource$stateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ RideCardItemDto$Photo $item;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardPhotoDataSource$stateFlow$1(a aVar, RideCardItemDto$Photo rideCardItemDto$Photo, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$item = rideCardItemDto$Photo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RideCardPhotoDataSource$stateFlow$1 rideCardPhotoDataSource$stateFlow$1 = new RideCardPhotoDataSource$stateFlow$1(this.this$0, this.$item, continuation);
        rideCardPhotoDataSource$stateFlow$1.L$0 = obj;
        return rideCardPhotoDataSource$stateFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardPhotoDataSource$stateFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        if (r7 == r2) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        if (r1.emit(r9, r17) == r2) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String a;
        int w;
        Object a2;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            RideCardItemDto$Photo rideCardItemDto$Photo = this.$item;
            aVar.getClass();
            if (!ijk0.b(rideCardItemDto$Photo) || (a = aVar.c.a(rideCardItemDto$Photo.d)) == null || a.length() == 0 || rideCardItemDto$Photo.e <= 0) {
                RideCardItemDto$Photo rideCardItemDto$Photo2 = this.$item;
                qlk0 qlk0Var = new qlk0(rideCardItemDto$Photo2.a, rideCardItemDto$Photo2.b, rideCardItemDto$Photo2.e, rideCardItemDto$Photo2.c);
                this.L$0 = null;
                this.label = 1;
                if (vprVar.emit(qlk0Var, this) == coroutineSingletons) {
                }
            } else {
                w = (int) tje.w(this.$item.e, ((avj0) this.this$0.d).a);
                RideCardItemDto$Photo rideCardItemDto$Photo3 = this.$item;
                rlk0 rlk0Var = new rlk0(rideCardItemDto$Photo3.a, rideCardItemDto$Photo3.b, w, rideCardItemDto$Photo3.c);
                this.L$0 = vprVar;
                this.I$0 = w;
                this.label = 2;
            }
        }
        if (i == 1) {
            b.b(obj);
            return zy11Var;
        }
        if (i == 2) {
            w = this.I$0;
            b.b(obj);
        } else {
            if (i != 3) {
                if (i != 4 && i != 5) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return zy11Var;
            }
            w = this.I$0;
            b.b(obj);
            a2 = obj;
            int i2 = w;
            Drawable drawable = (Drawable) a2;
            RideCardItemDto$Photo rideCardItemDto$Photo4 = this.$item;
            if (drawable != null) {
                String str = rideCardItemDto$Photo4.a;
                String str2 = rideCardItemDto$Photo4.b;
                String str3 = rideCardItemDto$Photo4.c;
                if (str3 == null) {
                    str3 = "";
                }
                plk0 plk0Var = new plk0(str, str2, i2, drawable, str3);
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = i2;
                this.label = 4;
                return vprVar.emit(plk0Var, this) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            qlk0 qlk0Var2 = new qlk0(rideCardItemDto$Photo4.a, rideCardItemDto$Photo4.b, i2, rideCardItemDto$Photo4.c);
            this.L$0 = null;
            this.L$1 = null;
            this.I$0 = i2;
            this.label = 5;
            if (vprVar.emit(qlk0Var2, this) == coroutineSingletons) {
            }
        }
        a aVar2 = this.this$0;
        RideCardItemDto$Photo rideCardItemDto$Photo5 = this.$item;
        this.L$0 = vprVar;
        this.I$0 = w;
        this.label = 3;
        a2 = a.a(aVar2, rideCardItemDto$Photo5, w, this);
    }
}
