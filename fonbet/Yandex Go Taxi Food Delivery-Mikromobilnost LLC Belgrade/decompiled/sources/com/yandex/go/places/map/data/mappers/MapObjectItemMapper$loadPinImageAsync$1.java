package com.yandex.go.places.map.data.mappers;

import android.graphics.Bitmap;
import defpackage.ao00;
import defpackage.bo00;
import defpackage.co00;
import defpackage.do00;
import defpackage.eo00;
import defpackage.evu0;
import defpackage.fo00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ofc0;
import defpackage.tse;
import defpackage.un00;
import defpackage.vn00;
import defpackage.w511;
import defpackage.wls;
import defpackage.wn00;
import defpackage.xn00;
import defpackage.yn00;
import defpackage.zn00;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Ltse;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.data.mappers.MapObjectItemMapper$loadPinImageAsync$1", f = "MapObjectItemMapper.kt", l = {625}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MapObjectItemMapper$loadPinImageAsync$1 extends SuspendLambda implements wls {
    final /* synthetic */ fo00 $style;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectItemMapper$loadPinImageAsync$1(fo00 fo00Var, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$style = fo00Var;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapObjectItemMapper$loadPinImageAsync$1(this.$style, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectItemMapper$loadPinImageAsync$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            fo00 fo00Var = this.$style;
            if (!(fo00Var instanceof un00) && !(fo00Var instanceof do00) && !(fo00Var instanceof co00) && !(fo00Var instanceof bo00) && !(fo00Var instanceof eo00) && !(fo00Var instanceof vn00) && !(fo00Var instanceof xn00) && !(fo00Var instanceof yn00) && !(fo00Var instanceof zn00) && !(fo00Var instanceof ao00)) {
                if (fo00Var instanceof wn00) {
                    a aVar = this.this$0;
                    String str = ((wn00) fo00Var).a.a.a;
                    ofc0 ofc0Var = aVar.i;
                    int i2 = ofc0Var.a;
                    int i3 = ofc0Var.b;
                    this.label = 1;
                    obj = (str == null || evu0.J(str)) ? null : ru.yandex.taxi.utils.a.b(aVar.b.b().b(str).g(i2, i3), this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    w511.b();
                }
            }
            return null;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        return (Bitmap) obj;
    }
}
