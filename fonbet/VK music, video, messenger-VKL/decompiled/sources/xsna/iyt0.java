package xsna;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.unit.LayoutDirection;
import xsna.er9;
import xsna.pdu;

/* compiled from: GraphicsViewLayer.android.kt */
/* loaded from: classes11.dex */
public final class iyt0 extends View {
    public static final a l = new a();
    public final qho b;
    public final ir9 c;
    public final er9 d;
    public boolean e;
    public Outline f;
    public boolean g;
    public azl h;
    public LayoutDirection i;
    public izs<? super oio, s3q0> j;
    public mdu k;

    /* compiled from: GraphicsViewLayer.android.kt */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof iyt0) || (outline2 = ((iyt0) view).f) == null) {
                return;
            }
            outline.set(outline2);
        }
    }

    public iyt0(qho qhoVar, ir9 ir9Var, er9 er9Var) {
        super(qhoVar.getContext());
        this.b = qhoVar;
        this.c = ir9Var;
        this.d = er9Var;
        setOutlineProvider(l);
        this.g = true;
        this.h = fto0.j;
        this.i = LayoutDirection.Ltr;
        pdu.a.getClass();
        this.j = pdu.a.b;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ir9 ir9Var = this.c;
        d52 d52Var = ir9Var.a;
        Canvas canvas2 = d52Var.a;
        d52Var.a = canvas;
        azl azlVar = this.h;
        LayoutDirection layoutDirection = this.i;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        mdu mduVar = this.k;
        izs<? super oio, s3q0> izsVar = this.j;
        er9 er9Var = this.d;
        azl b = er9Var.c.b();
        er9.b bVar = er9Var.c;
        LayoutDirection c = bVar.c();
        yq9 a2 = bVar.a();
        long d = bVar.d();
        mdu mduVar2 = bVar.b;
        bVar.f(azlVar);
        bVar.g(layoutDirection);
        bVar.e(d52Var);
        bVar.h(floatToRawIntBits);
        bVar.b = mduVar;
        d52Var.e();
        try {
            izsVar.invoke(er9Var);
            d52Var.a();
            bVar.f(b);
            bVar.g(c);
            bVar.e(a2);
            bVar.h(d);
            bVar.b = mduVar2;
            ir9Var.a.a = canvas2;
            this.e = false;
        } catch (Throwable th) {
            d52Var.a();
            bVar.f(b);
            bVar.g(c);
            bVar.e(a2);
            bVar.h(d);
            bVar.b = mduVar2;
            throw th;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.g;
    }

    public final ir9 getCanvasHolder() {
        return this.c;
    }

    public final View getOwnerView() {
        return this.b;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.g;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.e) {
            return;
        }
        this.e = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.g != z) {
            this.g = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.e = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
