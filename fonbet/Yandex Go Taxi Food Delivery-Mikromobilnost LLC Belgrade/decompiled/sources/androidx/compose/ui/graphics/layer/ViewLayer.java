package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.cma1;
import defpackage.fwi;
import defpackage.i28;
import defpackage.k28;
import defpackage.l28;
import defpackage.m0u;
import defpackage.nfh;
import defpackage.s72;
import defpackage.tls;
import defpackage.wr31;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001f\b\u0001\u0018\u0000 @2\u00020\u0001:\u0001AB#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b \u0010!J7\u0010(\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020#H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0016H\u0016¢\u0006\u0004\b*\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00101R\"\u00102\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b2\u0010\u001d\"\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R*\u00109\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u00103\u001a\u0004\b:\u0010\u001d\"\u0004\b;\u00105R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010<R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010=R\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010>R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010?¨\u0006B"}, d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayer;", "Landroid/view/View;", "ownerView", "Ll28;", "canvasHolder", "Lk28;", "canvasDrawScope", "<init>", "(Landroid/view/View;Ll28;Lk28;)V", "Landroid/graphics/Outline;", "outline", "", "setLayerOutline", "(Landroid/graphics/Outline;)Z", "Lfwi;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/a;", "parentLayer", "Lkotlin/Function1;", "Lqam;", "Lzy11;", "drawBlock", "setDrawParams", "(Lfwi;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/graphics/layer/a;Ltls;)V", "invalidate", "()V", "hasOverlappingRendering", "()Z", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "forceLayout", "Landroid/view/View;", "getOwnerView", "()Landroid/view/View;", "Ll28;", "getCanvasHolder", "()Ll28;", "Lk28;", "isInvalidated", "Z", "setInvalidated", "(Z)V", "layerOutline", "Landroid/graphics/Outline;", "value", "canUseCompositingLayer", "getCanUseCompositingLayer$ui_graphics", "setCanUseCompositingLayer$ui_graphics", "Lfwi;", "Landroidx/compose/ui/unit/LayoutDirection;", "Ltls;", "Landroidx/compose/ui/graphics/layer/a;", "Companion", "wr31", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ViewLayer extends View {
    public static final int $stable = 8;
    public static final wr31 Companion = new wr31();
    private static final ViewOutlineProvider LayerOutlineProvider = new ViewOutlineProvider() { // from class: androidx.compose.ui.graphics.layer.ViewLayer$Companion$LayerOutlineProvider$1
        /* JADX WARN: Code restructure failed: missing block: B:3:0x0004, code lost:
        
            r0 = ((androidx.compose.ui.graphics.layer.ViewLayer) r1).layerOutline;
         */
        @Override // android.view.ViewOutlineProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof ViewLayer) || outline2 == null) {
                return;
            }
            outline.set(outline2);
        }
    };
    private boolean canUseCompositingLayer;
    private final k28 canvasDrawScope;
    private final l28 canvasHolder;
    private fwi density;
    private tls drawBlock;
    private boolean isInvalidated;
    private Outline layerOutline;
    private LayoutDirection layoutDirection;
    private final View ownerView;
    private a parentLayer;

    public ViewLayer(View view, l28 l28Var, k28 k28Var) {
        super(view.getContext());
        this.ownerView = view;
        this.canvasHolder = l28Var;
        this.canvasDrawScope = k28Var;
        setOutlineProvider(LayerOutlineProvider);
        this.canUseCompositingLayer = true;
        this.density = cma1.b;
        this.layoutDirection = LayoutDirection.Ltr;
        m0u.a.getClass();
        this.drawBlock = GraphicsLayerImpl$Companion$DefaultDrawBlock$1.w;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        l28 l28Var = this.canvasHolder;
        s72 s72Var = l28Var.a;
        Canvas canvas2 = s72Var.a;
        s72Var.a = canvas;
        k28 k28Var = this.canvasDrawScope;
        fwi fwiVar = this.density;
        LayoutDirection layoutDirection = this.layoutDirection;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(width) << 32);
        a aVar = this.parentLayer;
        tls tlsVar = this.drawBlock;
        fwi r = k28Var.N().r();
        LayoutDirection t = k28Var.N().t();
        i28 q = k28Var.N().q();
        long v = k28Var.N().v();
        a aVar2 = (a) k28Var.N().b;
        nfh N = k28Var.N();
        N.B(fwiVar);
        N.D(layoutDirection);
        N.A(s72Var);
        N.E(floatToRawIntBits);
        N.b = aVar;
        s72Var.save();
        try {
            tlsVar.invoke(k28Var);
            s72Var.n();
            nfh N2 = k28Var.N();
            N2.B(r);
            N2.D(t);
            N2.A(q);
            N2.E(v);
            N2.b = aVar2;
            l28Var.a.a = canvas2;
            this.isInvalidated = false;
        } catch (Throwable th) {
            s72Var.n();
            nfh N3 = k28Var.N();
            N3.B(r);
            N3.D(t);
            N3.A(q);
            N3.E(v);
            N3.b = aVar2;
            throw th;
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    /* renamed from: getCanUseCompositingLayer$ui_graphics, reason: from getter */
    public final boolean getCanUseCompositingLayer() {
        return this.canUseCompositingLayer;
    }

    public final l28 getCanvasHolder() {
        return this.canvasHolder;
    }

    public final View getOwnerView() {
        return this.ownerView;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.canUseCompositingLayer;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        this.isInvalidated = true;
        super.invalidate();
    }

    /* renamed from: isInvalidated, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.canUseCompositingLayer != z) {
            this.canUseCompositingLayer = z;
            invalidate();
        }
    }

    public final void setDrawParams(fwi density, LayoutDirection layoutDirection, a parentLayer, tls drawBlock) {
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = drawBlock;
        this.parentLayer = parentLayer;
    }

    public final void setInvalidated(boolean z) {
        this.isInvalidated = z;
    }

    public final boolean setLayerOutline(Outline outline) {
        this.layerOutline = outline;
        invalidateOutline();
        return true;
    }

    public /* synthetic */ ViewLayer(View view, l28 l28Var, k28 k28Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i & 2) != 0 ? new l28() : l28Var, (i & 4) != 0 ? new k28() : k28Var);
    }
}
