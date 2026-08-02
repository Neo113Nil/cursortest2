package com.yandex.go.scooters.zones.legend.ui;

import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import defpackage.hap0;
import defpackage.lhc;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rcc;
import defpackage.tse;
import defpackage.wls;
import defpackage.xng0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.zones.legend.ui.ZoneItemViewHolder$setZonePolygon$1", f = "ScootersZonesLegendContentAdapter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ZoneItemViewHolder$setZonePolygon$1 extends SuspendLambda implements wls {
    final /* synthetic */ hap0 $style;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoneItemViewHolder$setZonePolygon$1(e eVar, hap0 hap0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$style = hap0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ZoneItemViewHolder$setZonePolygon$1(this.this$0, this.$style, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ZoneItemViewHolder$setZonePolygon$1 zoneItemViewHolder$setZonePolygon$1 = (ZoneItemViewHolder$setZonePolygon$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        zoneItemViewHolder$setZonePolygon$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = ru.yandex.taxi.design.utils.c.j(12, this.this$0.a);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        e eVar = this.this$0;
        hap0 hap0Var = this.$style;
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setColor(lhc.f(eVar.S.b(xng0.strokeColor, hap0Var.b), Math.abs((int) (((hap0Var.c != null ? r7.intValue() : 0) / 100.0f) * 255.0f)) & 255));
        Paint paint = shapeDrawable.getPaint();
        Float f = hap0Var.d;
        paint.setStrokeWidth(ru.yandex.taxi.design.utils.c.i(f != null ? f.floatValue() : 0.0f, eVar.a));
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RoundRectShape(fArr, null, null));
        e eVar2 = this.this$0;
        hap0 hap0Var2 = this.$style;
        shapeDrawable2.getPaint().setColor(lhc.f(eVar2.S.b(xng0.bgTransparent, hap0Var2.e), Math.abs((int) (((hap0Var2.f != null ? r1.intValue() : 0) / 100.0f) * 255.0f)) & 255));
        hap0 hap0Var3 = this.$style;
        ListBuilder a = rcc.a();
        a.add(shapeDrawable2);
        BitmapDrawable bitmapDrawable = hap0Var3.a;
        if (bitmapDrawable != null) {
            a.add(bitmapDrawable);
        }
        a.add(shapeDrawable);
        LayerDrawable layerDrawable = new LayerDrawable((Drawable[]) a.j().toArray(new Drawable[0]));
        e eVar3 = this.this$0;
        hap0 hap0Var4 = this.$style;
        int i2 = eVar3.T;
        layerDrawable.setLayerSize(0, i2, i2);
        if (hap0Var4.a != null) {
            layerDrawable.setLayerGravity(1, 17);
            int i3 = eVar3.U;
            layerDrawable.setLayerSize(1, i3, i3);
            layerDrawable.setLayerSize(2, i2, i2);
        } else {
            layerDrawable.setLayerSize(1, i2, i2);
        }
        ((ListItemComponent) ((View) this.this$0.R)).setLeadImage(layerDrawable);
        return zy11.a;
    }
}
