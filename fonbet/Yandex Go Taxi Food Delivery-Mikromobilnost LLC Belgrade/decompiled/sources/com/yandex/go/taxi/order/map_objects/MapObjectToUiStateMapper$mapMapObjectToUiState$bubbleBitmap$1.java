package com.yandex.go.taxi.order.map_objects;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.go.taxi.order.models.api.objects.MapObject;
import defpackage.bdc;
import defpackage.cdc;
import defpackage.evu0;
import defpackage.fz70;
import defpackage.g7h;
import defpackage.gz70;
import defpackage.i3y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pdc;
import defpackage.qje;
import defpackage.s8o;
import defpackage.tje;
import defpackage.tse;
import defpackage.ufu;
import defpackage.wls;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Direction;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Position;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/Bitmap;", "<anonymous>", "(Ltse;)Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.map_objects.MapObjectToUiStateMapper$mapMapObjectToUiState$bubbleBitmap$1", f = "MapObjectToUiStateMapper.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class MapObjectToUiStateMapper$mapMapObjectToUiState$bubbleBitmap$1 extends SuspendLambda implements wls {
    final /* synthetic */ MapObject $mapObject;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapObjectToUiStateMapper$mapMapObjectToUiState$bubbleBitmap$1(a aVar, MapObject mapObject, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$mapObject = mapObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapObjectToUiStateMapper$mapMapObjectToUiState$bubbleBitmap$1(this.this$0, this.$mapObject, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapObjectToUiStateMapper$mapMapObjectToUiState$bubbleBitmap$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        gz70 gz70Var = this.this$0.a;
        MapObject.Style style = this.$mapObject.d;
        String str = style.a;
        String str2 = style.d;
        String str3 = style.c;
        MapObject.AlignType alignType = style.b;
        pdc pdcVar = gz70Var.b;
        i3y i3yVar = gz70Var.e;
        i3y i3yVar2 = gz70Var.d;
        Context context = gz70Var.a;
        if (!evu0.J(str)) {
            if (!gz70Var.a().isAttachedToWindow()) {
                g7h g7hVar = (g7h) i3yVar.getValue();
                g7hVar.o(DefaultBubbleDecorator$Direction.UP);
                g7hVar.p(DefaultBubbleDecorator$Position.CENTER, 0.0f);
                g7hVar.b(new bdc(xng0.bgInvert));
                BubbleComponent bubbleComponent = (BubbleComponent) i3yVar2.getValue();
                bubbleComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                bubbleComponent.setDecorator(bubbleComponent.getDecorator());
                bubbleComponent.addView(gz70Var.a());
            }
            if (fz70.a[alignType.ordinal()] == 1) {
                ((g7h) i3yVar.getValue()).o(DefaultBubbleDecorator$Direction.UP);
                gz70Var.a().setMaxWidth(tje.u(HProv.PP_CONTAINER_EXTENSION_DEL, context));
                gz70Var.a().setTextLineHeight((int) tje.b0(context, 12.0f));
                OrderMapBubbleView a = gz70Var.a();
                int u = tje.u(8, context);
                a.setPadding(u, u, u, u);
                ufu ufuVar = (ufu) pdcVar;
                gz70Var.a().setTextColor(s8o.m(ufuVar.h(new cdc(qje.u(context.getTheme(), xng0.textInvert)), str2), context));
                gz70Var.a().setTitle(str);
                ((BubbleComponent) i3yVar2.getValue()).setDecorator((g7h) i3yVar.getValue());
                ((BubbleComponent) i3yVar2.getValue()).setBubbleColor(ufuVar.a(new cdc(qje.u(context.getTheme(), xng0.bgInvert)), str3));
                return xw31.s((BubbleComponent) i3yVar2.getValue());
            }
        }
        return null;
    }
}
