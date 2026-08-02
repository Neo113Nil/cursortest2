package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import defpackage.eb2;
import defpackage.gji0;
import defpackage.gz40;
import defpackage.i28;
import defpackage.j390;
import defpackage.jw01;
import defpackage.ka90;
import defpackage.l28;
import defpackage.m2k0;
import defpackage.n810;
import defpackage.nx80;
import defpackage.nxx;
import defpackage.qke;
import defpackage.ri91;
import defpackage.rq90;
import defpackage.rzo;
import defpackage.s72;
import defpackage.si91;
import defpackage.sls;
import defpackage.ti91;
import defpackage.vez0;
import defpackage.vr31;
import defpackage.wls;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u008c\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u008d\u0001\u008e\u0001BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010 J!\u0010'\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010-J7\u00104\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u00152\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020/2\u0006\u00102\u001a\u00020/2\u0006\u00103\u001a\u00020/H\u0014¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000bH\u0016¢\u0006\u0004\b6\u0010-J\u000f\u00107\u001a\u00020\u000bH\u0016¢\u0006\u0004\b7\u0010-J\u000f\u00108\u001a\u00020\u000bH\u0016¢\u0006\u0004\b8\u0010-J\u001f\u0010=\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u0015H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010@\u001a\u00020\u000b2\u0006\u0010?\u001a\u00020>2\u0006\u0010:\u001a\u00020\u0015H\u0016¢\u0006\u0004\b@\u0010AJ9\u0010B\u001a\u00020\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010H\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bI\u0010GJ\u000f\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u000bH\u0002¢\u0006\u0004\bN\u0010-J\u000f\u0010O\u001a\u00020\u000bH\u0002¢\u0006\u0004\bO\u0010-R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010S\u001a\u0004\bT\u0010UR,\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010VR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R*\u0010a\u001a\u00020\u00152\u0006\u0010`\u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010\\\u001a\u0004\ba\u0010\u0017\"\u0004\bb\u0010cR\u0018\u0010d\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010\\R\u0014\u0010h\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00010j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\"\u0010n\u001a\u00020m8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\"\u0010t\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bt\u0010\\\u001a\u0004\bt\u0010\u0017\"\u0004\bu\u0010cR\u0016\u0010w\u001a\u00020v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010y\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010\\R\u001a\u0010{\u001a\u00020z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b{\u0010x\u001a\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0017\u0010\u0082\u0001\u001a\u00020D8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0016\u0010\u0084\u0001\u001a\u00020z8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010}R'\u0010\u0087\u0001\u001a\u00020m2\u0006\u0010`\u001a\u00020m8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0085\u0001\u0010q\"\u0005\b\u0086\u0001\u0010sR\u001a\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0088\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001¨\u0006\u008f\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Lj390;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/DrawChildContainer;", "container", "Lkotlin/Function2;", "Li28;", "Landroidx/compose/ui/graphics/layer/a;", "Lzy11;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lwls;Lsls;)V", "Lm2k0;", "scope", "updateLayerProperties", "(Lm2k0;)V", "", "hasOverlappingRendering", "()Z", "Lwu60;", "position", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Lk6w;", "size", "resize-ozmzZPI", "(J)V", "resize", "Lz5w;", "move--gyyYBs", "move", "canvas", "parentLayer", "drawLayer", "(Li28;Landroidx/compose/ui/graphics/layer/a;)V", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "invalidate", "()V", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "destroy", "updateDisplayList", "forceLayout", IssuingDistributionPointExtension.POINT, "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Lgz40;", "rect", "mapBounds", "(Lgz40;Z)V", "reuseLayer", "(Lwls;Lsls;)V", "Ln810;", "matrix", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", "Lka90;", "obtainLayerPaint", "()Lka90;", "updateOutlineResolver", "resetClipBounds", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "Lwls;", "Lsls;", "Lnx80;", "outlineResolver", "Lnx80;", "clipToBounds", "Z", "Landroid/graphics/Rect;", "clipBoundsCache", "Landroid/graphics/Rect;", "value", "isInvalidated", "setInvalidated", "(Z)V", "layerPaint", "Lka90;", "drawnWithZ", "Ll28;", "canvasHolder", "Ll28;", "Lnxx;", "matrixCache", "Lnxx;", "", "frameRate", "F", "getFrameRate", "()F", "setFrameRate", "(F)V", "isFrameRateFromParent", "setFrameRateFromParent", "Ljw01;", "mTransformOrigin", "J", "mHasOverlappingRendering", "", "layerId", "getLayerId", "()J", "mutatedFields", CA20Status.STATUS_USER_I, "getUnderlyingMatrix-sQKQjiQ", "()[F", "underlyingMatrix", "getOwnerViewId", "ownerViewId", "getCameraDistancePx", "setCameraDistancePx", "cameraDistancePx", "Lrq90;", "getManualClipPath", "()Lrq90;", "manualClipPath", "Companion", "ri91", "vr31", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ViewLayer extends View implements j390 {
    public static final int $stable = 8;
    private static boolean hasRetrievedMethod;
    private static Field recreateDisplayList;
    private static boolean shouldUseDispatchDraw;
    private static Method updateDisplayListIfDirtyMethod;
    private final l28 canvasHolder;
    private Rect clipBoundsCache;
    private boolean clipToBounds;
    private final DrawChildContainer container;
    private wls drawBlock;
    private boolean drawnWithZ;
    private float frameRate;
    private sls invalidateParentLayer;
    private boolean isFrameRateFromParent;
    private boolean isInvalidated;
    private final long layerId;
    private ka90 layerPaint;
    private boolean mHasOverlappingRendering;
    private long mTransformOrigin;
    private final nxx matrixCache;
    private int mutatedFields;
    private final nx80 outlineResolver;
    private final AndroidComposeView ownerView;
    public static final vr31 Companion = new vr31();
    private static final wls getMatrix = ViewLayer$Companion$getMatrix$1.w;
    private static final ViewOutlineProvider OutlineProvider = new ViewOutlineProvider() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$OutlineProvider$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            nx80 nx80Var;
            nx80Var = ((ViewLayer) view).outlineResolver;
            outline.set(nx80Var.b());
        }
    };

    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, wls wlsVar, sls slsVar) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.drawBlock = wlsVar;
        this.invalidateParentLayer = slsVar;
        this.outlineResolver = new nx80();
        this.canvasHolder = new l28();
        this.matrixCache = new nxx(getMatrix);
        this.mTransformOrigin = jw01.b;
        this.mHasOverlappingRendering = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.layerId = View.generateViewId();
    }

    private final rq90 getManualClipPath() {
        if (!getClipToOutline() || this.outlineResolver.e()) {
            return null;
        }
        return this.outlineResolver.d();
    }

    private final ka90 obtainLayerPaint() {
        ka90 ka90Var = this.layerPaint;
        if (ka90Var != null) {
            return ka90Var;
        }
        eb2 eb2Var = new eb2();
        this.layerPaint = eb2Var;
        return eb2Var;
    }

    private final void resetClipBounds() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void setInvalidated(boolean z) {
        if (z != this.isInvalidated) {
            this.isInvalidated = z;
            this.ownerView.notifyLayerIsDirty$ui(this, z);
        }
    }

    private final void updateOutlineResolver() {
        setOutlineProvider(this.outlineResolver.b() != null ? OutlineProvider : null);
    }

    @Override // defpackage.j390
    public void destroy() {
        setInvalidated(false);
        this.ownerView.requestClearInvalidObservations();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.recycle$ui(this);
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z;
        l28 l28Var = this.canvasHolder;
        s72 s72Var = l28Var.a;
        Canvas canvas2 = s72Var.a;
        s72Var.a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z = false;
        } else {
            s72Var.save();
            this.outlineResolver.a(s72Var);
            z = true;
        }
        wls wlsVar = this.drawBlock;
        if (wlsVar != null) {
            wlsVar.invoke(s72Var, null);
        }
        if (z) {
            s72Var.n();
        }
        l28Var.a.a = canvas2;
        setInvalidated(false);
    }

    @Override // defpackage.j390
    public void drawLayer(i28 canvas, androidx.compose.ui.graphics.layer.a parentLayer) {
        boolean z = getElevation() > 0.0f;
        this.drawnWithZ = z;
        if (z) {
            canvas.o();
        }
        this.container.drawChild$ui(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.f();
        }
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final DrawChildContainer getContainer() {
        return this.container;
    }

    public float getFrameRate() {
        return this.frameRate;
    }

    public long getLayerId() {
        return this.layerId;
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public long getOwnerViewId() {
        return ri91.c(this.ownerView);
    }

    @Override // defpackage.j390
    /* renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    public float[] mo78getUnderlyingMatrixsQKQjiQ() {
        return this.matrixCache.b(this);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // android.view.View, defpackage.j390
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // defpackage.j390
    /* renamed from: inverseTransform-58bKbWc, reason: not valid java name */
    public void mo79inverseTransform58bKbWc(float[] matrix) {
        float[] a = this.matrixCache.a(this);
        if (a != null) {
            n810.f(matrix, a);
        }
    }

    /* renamed from: isFrameRateFromParent, reason: from getter */
    public boolean getIsFrameRateFromParent() {
        return this.isFrameRateFromParent;
    }

    @Override // defpackage.j390
    /* renamed from: isInLayer-k-4lQ0M, reason: not valid java name */
    public boolean mo80isInLayerk4lQ0M(long position) {
        float intBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & position));
        if (this.clipToBounds) {
            return 0.0f <= intBitsToFloat && intBitsToFloat < ((float) getWidth()) && 0.0f <= intBitsToFloat2 && intBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.f(position);
        }
        return true;
    }

    /* renamed from: isInvalidated, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    @Override // defpackage.j390
    public void mapBounds(gz40 rect, boolean inverse) {
        nxx nxxVar = this.matrixCache;
        if (inverse) {
            nxxVar.f(this, rect);
        } else {
            nxxVar.d(this, rect);
        }
    }

    @Override // defpackage.j390
    /* renamed from: mapOffset-8S9VItk, reason: not valid java name */
    public long mo81mapOffset8S9VItk(long point, boolean inverse) {
        nxx nxxVar = this.matrixCache;
        return inverse ? nxxVar.g(this, point) : nxxVar.e(this, point);
    }

    @Override // defpackage.j390
    /* renamed from: move--gyyYBs, reason: not valid java name */
    public void mo82movegyyYBs(long position) {
        int i = (int) (position >> 32);
        if (i != getLeft()) {
            offsetLeftAndRight(i - getLeft());
            this.matrixCache.c();
        }
        int i2 = (int) (position & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        if (i2 != getTop()) {
            offsetTopAndBottom(i2 - getTop());
            this.matrixCache.c();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int l, int t, int r, int b) {
    }

    @Override // defpackage.j390
    /* renamed from: resize-ozmzZPI, reason: not valid java name */
    public void mo83resizeozmzZPI(long size) {
        int i = (int) (size >> 32);
        int i2 = (int) (size & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        if (i == getWidth() && i2 == getHeight()) {
            return;
        }
        long j = this.mTransformOrigin;
        int i3 = jw01.c;
        setPivotX(Float.intBitsToFloat((int) (j >> 32)) * i);
        setPivotY(Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & this.mTransformOrigin)) * i2);
        updateOutlineResolver();
        layout(getLeft(), getTop(), getLeft() + i, getTop() + i2);
        resetClipBounds();
        this.matrixCache.c();
    }

    @Override // defpackage.j390
    public void reuseLayer(wls drawBlock, sls invalidateParentLayer) {
        this.container.addView(this);
        this.matrixCache.h();
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = jw01.b;
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
        setInvalidated(false);
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }

    public void setFrameRate(float f) {
        this.frameRate = f;
    }

    public void setFrameRateFromParent(boolean z) {
        this.isFrameRateFromParent = z;
    }

    @Override // defpackage.j390
    /* renamed from: transform-58bKbWc, reason: not valid java name */
    public void mo84transform58bKbWc(float[] matrix) {
        n810.f(matrix, this.matrixCache.b(this));
    }

    @Override // defpackage.j390
    public void updateDisplayList() {
        if (!this.isInvalidated || shouldUseDispatchDraw) {
            return;
        }
        Companion.getClass();
        try {
            if (!hasRetrievedMethod) {
                hasRetrievedMethod = true;
                updateDisplayListIfDirtyMethod = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                recreateDisplayList = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                Method method = updateDisplayListIfDirtyMethod;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = recreateDisplayList;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = recreateDisplayList;
            if (field2 != null) {
                field2.setBoolean(this, true);
            }
            Method method2 = updateDisplayListIfDirtyMethod;
            if (method2 != null) {
                method2.invoke(this, null);
            }
        } catch (Throwable unused) {
            shouldUseDispatchDraw = true;
        }
        setInvalidated(false);
    }

    @Override // defpackage.j390
    public void updateLayerProperties(m2k0 scope) {
        sls slsVar;
        gji0 gji0Var = qke.q;
        int i = scope.a | this.mutatedFields;
        if ((i & 4096) != 0) {
            long j = scope.F;
            this.mTransformOrigin = j;
            int i2 = jw01.c;
            setPivotX(Float.intBitsToFloat((int) (j >> 32)) * getWidth());
            setPivotY(Float.intBitsToFloat((int) (this.mTransformOrigin & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * getHeight());
        }
        if ((i & 1) != 0) {
            setScaleX(scope.b);
        }
        if ((i & 2) != 0) {
            setScaleY(scope.c);
        }
        if ((i & 4) != 0) {
            setAlpha(scope.w);
        }
        if ((i & 8) != 0) {
            setTranslationX(scope.x);
        }
        if ((i & 16) != 0) {
            setTranslationY(scope.y);
        }
        if ((i & 32) != 0) {
            setElevation(scope.z);
        }
        if ((i & 1024) != 0) {
            setRotation(scope.D);
        }
        if ((i & 256) != 0) {
            setRotationX(scope.C);
        }
        if ((i & 512) != 0) {
            setRotationY(0.0f);
        }
        if ((i & 2048) != 0) {
            setCameraDistancePx(scope.E);
        }
        boolean z = false;
        boolean z2 = getManualClipPath() != null;
        boolean z3 = scope.H;
        boolean z4 = z3 && scope.G != gji0Var;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) != 0) {
            this.clipToBounds = z3 && scope.G == gji0Var;
            resetClipBounds();
            setClipToOutline(z4);
        }
        boolean g = this.outlineResolver.g(scope.N, scope.w, z4, scope.z, scope.J);
        if (this.outlineResolver.c()) {
            updateOutlineResolver();
        }
        boolean z5 = getManualClipPath() != null;
        if (z2 != z5 || (z5 && g)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (slsVar = this.invalidateParentLayer) != null) {
            slsVar.invoke();
        }
        if ((i & 7963) != 0) {
            this.matrixCache.c();
        }
        if ((i & 64) != 0) {
            si91.p(this, rzo.X(scope.A));
        }
        if ((i & 128) != 0) {
            si91.q(this, rzo.X(scope.B));
        }
        Paint paint = null;
        if (Build.VERSION.SDK_INT >= 31 && (131072 & i) != 0) {
            ti91.d(this, null);
        }
        boolean z6 = ((262144 & i) == 0 && (524288 & i) == 0) ? false : true;
        if ((i & 32768) != 0 || z6) {
            int i3 = z6 ? 1 : scope.I;
            if (i3 == 1) {
                if (z6) {
                    eb2 eb2Var = (eb2) obtainLayerPaint();
                    eb2Var.g(null);
                    eb2Var.e(scope.M);
                    paint = vez0.B(eb2Var);
                }
                setLayerType(2, paint);
            } else if (i3 == 2) {
                setLayerType(0, null);
                this.mHasOverlappingRendering = z;
            } else {
                setLayerType(0, null);
            }
            z = true;
            this.mHasOverlappingRendering = z;
        }
        this.mutatedFields = scope.a;
    }
}
