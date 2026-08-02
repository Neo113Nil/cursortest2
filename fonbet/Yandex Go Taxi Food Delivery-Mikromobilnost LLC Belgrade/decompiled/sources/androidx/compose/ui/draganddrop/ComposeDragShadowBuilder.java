package androidx.compose.ui.draganddrop;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.fwi;
import defpackage.i28;
import defpackage.j28;
import defpackage.k28;
import defpackage.s72;
import defpackage.t72;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/draganddrop/ComposeDragShadowBuilder;", "Landroid/view/View$DragShadowBuilder;", "Lfwi;", "density", "Lcjs0;", "decorationSize", "Lkotlin/Function1;", "Lqam;", "Lzy11;", "drawDragDecoration", "<init>", "(Lfwi;JLtls;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/graphics/Point;", "outShadowSize", "outShadowTouchPoint", "onProvideShadowMetrics", "(Landroid/graphics/Point;Landroid/graphics/Point;)V", "Landroid/graphics/Canvas;", "canvas", "onDrawShadow", "(Landroid/graphics/Canvas;)V", "Lfwi;", "J", "Ltls;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ComposeDragShadowBuilder extends View.DragShadowBuilder {
    public static final int $stable = 8;
    private final long decorationSize;
    private final fwi density;
    private final tls drawDragDecoration;

    private ComposeDragShadowBuilder(fwi fwiVar, long j, tls tlsVar) {
        this.density = fwiVar;
        this.decorationSize = j;
        this.drawDragDecoration = tlsVar;
    }

    @Override // android.view.View.DragShadowBuilder
    public void onDrawShadow(Canvas canvas) {
        k28 k28Var = new k28();
        fwi fwiVar = this.density;
        long j = this.decorationSize;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        Canvas canvas2 = t72.a;
        s72 s72Var = new s72();
        s72Var.a = canvas;
        tls tlsVar = this.drawDragDecoration;
        j28 j28Var = k28Var.a;
        fwi fwiVar2 = j28Var.a;
        LayoutDirection layoutDirection2 = j28Var.b;
        i28 i28Var = j28Var.c;
        long j2 = j28Var.d;
        j28Var.a = fwiVar;
        j28Var.b = layoutDirection;
        j28Var.c = s72Var;
        j28Var.d = j;
        s72Var.save();
        tlsVar.invoke(k28Var);
        s72Var.n();
        j28Var.a = fwiVar2;
        j28Var.b = layoutDirection2;
        j28Var.c = i28Var;
        j28Var.d = j2;
    }

    @Override // android.view.View.DragShadowBuilder
    public void onProvideShadowMetrics(Point outShadowSize, Point outShadowTouchPoint) {
        fwi fwiVar = this.density;
        outShadowSize.set(fwiVar.f0(fwiVar.I(Float.intBitsToFloat((int) (this.decorationSize >> 32)))), fwiVar.f0(fwiVar.I(Float.intBitsToFloat((int) (this.decorationSize & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)))));
        outShadowTouchPoint.set(outShadowSize.x / 2, outShadowSize.y / 2);
    }

    public /* synthetic */ ComposeDragShadowBuilder(fwi fwiVar, long j, tls tlsVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fwiVar, j, tlsVar);
    }
}
