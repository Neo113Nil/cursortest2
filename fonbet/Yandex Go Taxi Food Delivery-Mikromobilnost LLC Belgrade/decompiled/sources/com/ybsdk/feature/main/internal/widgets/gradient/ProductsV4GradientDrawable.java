package com.ybsdk.feature.main.internal.widgets.gradient;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.fbf0;
import defpackage.gbf0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.scc;
import defpackage.t5w;
import defpackage.tcc;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 >2\u00020\u0001:\u0002\n?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J%\u0010\u0013\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001aH\u0017¢\u0006\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010(R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00104\u001a\b\u0012\u0004\u0012\u0002010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010(R\u0018\u00105\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\u001a0\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010(R(\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u00108\u001a\u0004\u0018\u00010\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u00109\u001a\u0004\b:\u0010;R0\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lcom/ybsdk/feature/main/internal/widgets/gradient/ProductsV4GradientDrawable;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "Landroid/graphics/Rect;", "bounds", "Lzy11;", "rebuildShaders", "(Landroid/graphics/Rect;)V", "updateShaderMatrices", "Lgbf0;", "mainLayer", "", "overlayLayers", "", "shouldRebuildShaders", "(Lgbf0;Ljava/util/List;)Z", "updateStaticHashes", "ensureCollections", "setParams", "(Lgbf0;Ljava/util/List;)V", "onBoundsChange", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "", CaretView.ALPHA_PROPERTY, "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "Landroid/graphics/Paint;", "mainPaint", "Landroid/graphics/Paint;", "overlayPaints", "Ljava/util/List;", "Landroid/graphics/Path;", "clipPath", "Landroid/graphics/Path;", "Landroid/graphics/RadialGradient;", "mainShader", "Landroid/graphics/RadialGradient;", "", "overlayShaders", "Landroid/graphics/Matrix;", "mainShaderMatrix", "Landroid/graphics/Matrix;", "overlayShaderMatrices", "lastMainStaticHash", "Ljava/lang/Integer;", "lastOverlayStaticHashes", "value", "Lgbf0;", "getMainLayer", "()Lgbf0;", "getOverlayLayers", "()Ljava/util/List;", "Companion", "fbf0", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductsV4GradientDrawable extends Drawable {
    private static final fbf0 Companion = new fbf0();

    @Deprecated
    public static final int HASH_MULTIPLIER = 31;

    @Deprecated
    public static final float INTERPOLATION_FACTOR = 0.35f;
    private final Path clipPath;
    private Integer lastMainStaticHash;
    private List<Integer> lastOverlayStaticHashes;
    private gbf0 mainLayer;
    private final Paint mainPaint;
    private RadialGradient mainShader;
    private final Matrix mainShaderMatrix;
    private List<gbf0> overlayLayers;
    private List<? extends Paint> overlayPaints;
    private List<? extends Matrix> overlayShaderMatrices;
    private List<RadialGradient> overlayShaders;

    public ProductsV4GradientDrawable() {
        Paint paint = new Paint(1);
        paint.setDither(true);
        this.mainPaint = paint;
        EmptyList emptyList = EmptyList.a;
        this.overlayPaints = emptyList;
        this.clipPath = new Path();
        this.overlayShaders = new ArrayList();
        this.mainShaderMatrix = new Matrix();
        this.overlayShaderMatrices = emptyList;
        this.lastOverlayStaticHashes = emptyList;
        this.overlayLayers = emptyList;
    }

    private final void ensureCollections() {
        if (this.overlayPaints.size() != this.overlayLayers.size()) {
            int size = this.overlayLayers.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Paint paint = new Paint(1);
                paint.setDither(true);
                arrayList.add(paint);
            }
            this.overlayPaints = arrayList;
        }
        if (this.overlayShaderMatrices.size() != this.overlayLayers.size()) {
            int size2 = this.overlayLayers.size();
            ArrayList arrayList2 = new ArrayList(size2);
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(new Matrix());
            }
            this.overlayShaderMatrices = arrayList2;
        }
        if (this.overlayShaders.size() != this.overlayLayers.size()) {
            int size3 = this.overlayLayers.size();
            ArrayList arrayList3 = new ArrayList(size3);
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList3.add(null);
            }
            this.overlayShaders = arrayList3;
        }
    }

    private final void rebuildShaders(Rect bounds) {
        gbf0 gbf0Var = this.mainLayer;
        if (gbf0Var == null) {
            return;
        }
        int[] iArr = gbf0Var.a;
        float width = bounds.width();
        float height = bounds.height();
        if (width == 0.0f || height == 0.0f) {
            return;
        }
        if (iArr.length == 0) {
            this.mainShader = null;
            this.mainPaint.setShader(null);
        } else {
            RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, 1.0f, iArr, gbf0Var.b, Shader.TileMode.CLAMP);
            this.mainShader = radialGradient;
            this.mainPaint.setShader(radialGradient);
        }
        int i = 0;
        for (Object obj : this.overlayLayers) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            gbf0 gbf0Var2 = (gbf0) obj;
            if (gbf0Var2.a.length == 0) {
                this.overlayShaders.set(i, null);
                this.overlayPaints.get(i).setShader(null);
            } else {
                RadialGradient radialGradient2 = new RadialGradient(0.0f, 0.0f, 1.0f, gbf0Var2.a, gbf0Var2.b, Shader.TileMode.CLAMP);
                this.overlayShaders.set(i, radialGradient2);
                this.overlayPaints.get(i).setShader(radialGradient2);
            }
            i = i2;
        }
        updateStaticHashes();
        updateShaderMatrices(bounds);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean shouldRebuildShaders(gbf0 mainLayer, List<gbf0> overlayLayers) {
        boolean z;
        if (overlayLayers.size() == this.lastOverlayStaticHashes.size()) {
            Iterable e = scc.e(overlayLayers);
            if (!(e instanceof Collection) || !((Collection) e).isEmpty()) {
                Iterator it = e.iterator();
                while (it.hasNext()) {
                    int nextInt = ((t5w) it).nextInt();
                    if (overlayLayers.get(nextInt).b() != this.lastOverlayStaticHashes.get(nextInt).intValue()) {
                    }
                }
            }
            z = false;
            return jl40.l(mainLayer == null ? Integer.valueOf(mainLayer.b()) : null, this.lastMainStaticHash) || z;
        }
        z = true;
        if (jl40.l(mainLayer == null ? Integer.valueOf(mainLayer.b()) : null, this.lastMainStaticHash)) {
        }
    }

    private final void updateShaderMatrices(Rect bounds) {
        gbf0 gbf0Var = this.mainLayer;
        if (gbf0Var == null) {
            return;
        }
        float width = bounds.width();
        float height = bounds.height();
        if (width == 0.0f || height == 0.0f) {
            return;
        }
        float max = ((Math.max(width, height) - height) * 0.35f) + height;
        RadialGradient radialGradient = this.mainShader;
        if (radialGradient != null) {
            float f = gbf0Var.e * max;
            float f2 = gbf0Var.c * width;
            float f3 = gbf0Var.d * height;
            this.mainShaderMatrix.reset();
            this.mainShaderMatrix.postScale(f, f);
            this.mainShaderMatrix.postScale(width / height, 1.0f);
            this.mainShaderMatrix.postTranslate(f2, f3);
            radialGradient.setLocalMatrix(this.mainShaderMatrix);
        }
        int i = 0;
        for (Object obj : this.overlayLayers) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            gbf0 gbf0Var2 = (gbf0) obj;
            RadialGradient radialGradient2 = (RadialGradient) a.S(i, this.overlayShaders);
            if (radialGradient2 != null) {
                Matrix matrix = this.overlayShaderMatrices.get(i);
                float f4 = gbf0Var2.e * max;
                float f5 = gbf0Var2.c * width;
                float f6 = gbf0Var2.d * height;
                matrix.reset();
                matrix.postScale(f4, f4);
                matrix.postTranslate(f5, f6);
                radialGradient2.setLocalMatrix(matrix);
            }
            i = i2;
        }
    }

    private final void updateStaticHashes() {
        gbf0 gbf0Var = this.mainLayer;
        this.lastMainStaticHash = gbf0Var != null ? Integer.valueOf(gbf0Var.b()) : null;
        List<gbf0> list = this.overlayLayers;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((gbf0) it.next()).b()));
        }
        this.lastOverlayStaticHashes = arrayList;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        gbf0 gbf0Var = this.mainLayer;
        if (gbf0Var == null || gbf0Var.a.length == 0) {
            return;
        }
        Rect bounds = getBounds();
        Path path = this.clipPath;
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.mainPaint);
            int i = 0;
            for (Object obj : this.overlayLayers) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                if (((gbf0) obj).a.length != 0) {
                    canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.overlayPaints.get(i));
                }
                i = i2;
            }
            canvas.restoreToCount(save);
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public final gbf0 getMainLayer() {
        return this.mainLayer;
    }

    @Override // android.graphics.drawable.Drawable
    @jxi
    public int getOpacity() {
        return -3;
    }

    public final List<gbf0> getOverlayLayers() {
        return this.overlayLayers;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        float min = Math.min(bounds.width(), bounds.height()) / 2.0f;
        this.clipPath.reset();
        this.clipPath.addRoundRect(bounds.left, bounds.top, bounds.right, bounds.bottom, min, min, Path.Direction.CW);
        rebuildShaders(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.mainPaint.setAlpha(alpha);
        Iterator<T> it = this.overlayPaints.iterator();
        while (it.hasNext()) {
            ((Paint) it.next()).setAlpha(alpha);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mainPaint.setColorFilter(colorFilter);
        Iterator<T> it = this.overlayPaints.iterator();
        while (it.hasNext()) {
            ((Paint) it.next()).setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    public final void setParams(gbf0 mainLayer, List<gbf0> overlayLayers) {
        boolean shouldRebuildShaders = shouldRebuildShaders(mainLayer, overlayLayers);
        this.mainLayer = mainLayer;
        this.overlayLayers = overlayLayers;
        ensureCollections();
        if (shouldRebuildShaders) {
            rebuildShaders(getBounds());
        } else {
            updateShaderMatrices(getBounds());
        }
        invalidateSelf();
    }
}
