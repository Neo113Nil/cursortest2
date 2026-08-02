package com.yandex.go.navigator.map_interactions.long_taps;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.runtime.image.ImageProvider;
import defpackage.avj0;
import defpackage.bl00;
import defpackage.dh00;
import defpackage.f1h0;
import defpackage.f4c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u8b1;
import defpackage.vng;
import defpackage.wls;
import defpackage.xm00;
import defpackage.xnz;
import defpackage.ynz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.map_interactions.long_taps.LongTapPresenter$focusOnPoint$1", f = "LongTapPresenter.kt", l = {HProv.PP_CIPHEROID, 105}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class LongTapPresenter$focusOnPoint$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ynz this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongTapPresenter$focusOnPoint$1(ynz ynzVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ynzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LongTapPresenter$focusOnPoint$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LongTapPresenter$focusOnPoint$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b4, code lost:
    
        if (r8.awaitFocusRectReady(r7) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b6, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        if (r8 == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f4c0 r;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            r = ((xm00) this.this$0.E.getValue()).r(this.this$0.x);
            com.yandex.go.navigator.providers.a aVar = this.this$0.B;
            this.L$0 = r;
            this.L$1 = r;
            this.label = 1;
            obj = aVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                ynz ynzVar = this.this$0;
                dh00.a(ynzVar.A, ynzVar.x, 0.0f, null, null, HProv.PP_DELETE_SAVED_PASSWD);
                return zy11.a;
            }
            r = (f4c0) this.L$1;
            kotlin.b.b(obj);
        }
        bl00 bl00Var = (bl00) obj;
        r.y(bl00Var.a);
        r.D(bl00Var.b);
        IconStyle iconStyle = r.m;
        if (iconStyle != null) {
            iconStyle.setAnchor(new PointF(0.5f, 0.9f));
        }
        IconStyle iconStyle2 = r.m;
        if (iconStyle2 != null) {
            iconStyle2.setZIndex(new Float(20.0f));
        }
        f4c0 r2 = ((xm00) this.this$0.E.getValue()).r(this.this$0.x);
        Drawable t = vng.t(f1h0.route_end_point, ((avj0) this.this$0.D).a);
        if (t != null) {
            r2.y(ImageProvider.fromBitmap(u8b1.g(t)));
        }
        xnz xnzVar = (xnz) this.this$0.Dg();
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
