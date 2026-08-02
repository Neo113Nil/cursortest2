package com.yandex.go.chargers.multiorder.ui.components;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.g16;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pav;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.utils.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.multiorder.ui.components.ChargersMultiOrderTakeMoreButton$loadIcon$1", f = "ChargersMultiOrderTakeMoreButton.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class ChargersMultiOrderTakeMoreButton$loadIcon$1 extends SuspendLambda implements wls {
    final /* synthetic */ pav $imageLoader;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ ChargersMultiOrderTakeMoreButton this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersMultiOrderTakeMoreButton$loadIcon$1(pav pavVar, String str, ChargersMultiOrderTakeMoreButton chargersMultiOrderTakeMoreButton, Continuation continuation) {
        super(2, continuation);
        this.$imageLoader = pavVar;
        this.$url = str;
        this.this$0 = chargersMultiOrderTakeMoreButton;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersMultiOrderTakeMoreButton$loadIcon$1(this.$imageLoader, this.$url, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersMultiOrderTakeMoreButton$loadIcon$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            g16 b = this.$imageLoader.b().b(this.$url);
            this.label = 1;
            obj = a.b(b, this);
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
        Bitmap bitmap = (Bitmap) obj;
        ChargersMultiOrderTakeMoreButton chargersMultiOrderTakeMoreButton = this.this$0;
        chargersMultiOrderTakeMoreButton.setTextIcon(bitmap != null ? new BitmapDrawable(chargersMultiOrderTakeMoreButton.getResources(), bitmap) : null);
        return zy11.a;
    }
}
