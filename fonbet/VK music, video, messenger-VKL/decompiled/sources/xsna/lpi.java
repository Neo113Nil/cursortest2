package xsna;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.ui.unit.LayoutDirection;
import xsna.er9;

/* compiled from: ComposeDragShadowBuilder.android.kt */
/* loaded from: classes11.dex */
public final class lpi extends View.DragShadowBuilder {
    public final dzl a;
    public final long b;
    public final izs<oio, s3q0> c;

    public lpi(dzl dzlVar, long j, izs izsVar) {
        this.a = dzlVar;
        this.b = j;
        this.c = izsVar;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        er9 er9Var = new er9();
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        Canvas canvas2 = e52.a;
        d52 d52Var = new d52();
        d52Var.a = canvas;
        er9.a aVar = er9Var.b;
        azl azlVar = aVar.a;
        LayoutDirection layoutDirection2 = aVar.b;
        yq9 yq9Var = aVar.c;
        long j = aVar.d;
        aVar.a = this.a;
        aVar.b = layoutDirection;
        aVar.c = d52Var;
        aVar.d = this.b;
        d52Var.e();
        this.c.invoke(er9Var);
        d52Var.a();
        aVar.a = azlVar;
        aVar.b = layoutDirection2;
        aVar.c = yq9Var;
        aVar.d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.b;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        dzl dzlVar = this.a;
        point.set(dzlVar.r0(intBitsToFloat / dzlVar.getDensity()), dzlVar.r0(Float.intBitsToFloat((int) (j & 4294967295L)) / dzlVar.getDensity()));
        point2.set(point.x / 2, point.y / 2);
    }
}
