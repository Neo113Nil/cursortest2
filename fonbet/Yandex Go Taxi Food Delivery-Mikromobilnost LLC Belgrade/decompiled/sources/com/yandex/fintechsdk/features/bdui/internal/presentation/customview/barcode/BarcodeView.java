package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.barcode;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.zxing.EncodeHintType;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.iv4;
import defpackage.jl40;
import defpackage.ml40;
import defpackage.vz5;
import defpackage.wv4;
import defpackage.zkw0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000f\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001(B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010$\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0014H\u0014¢\u0006\u0004\b$\u0010%R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&¨\u0006)"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/barcode/BarcodeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Liv4;", "props", "<init>", "(Landroid/content/Context;Liv4;)V", "Lzy11;", "generateBarcode", "(Liv4;)V", "Lvz5;", "bitMatrix", "Landroid/graphics/Bitmap;", "createBitmap", "(Lvz5;)Landroid/graphics/Bitmap;", "source", "trimWhiteBorders", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "bitmap", "", "cornerRadiusDp", "paddingDp", "addRoundedBackground", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "dp", "", "density", "dpToPx", "(IF)F", "bind", "()V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Liv4;", "Companion", "wv4", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BarcodeView extends AppCompatImageView {
    private static final wv4 Companion = new wv4();

    @Deprecated
    public static final int DEFAULT_HEIGHT = 200;

    @Deprecated
    public static final int DEFAULT_WIDTH = 200;

    @Deprecated
    public static final int WHITE_THRESHOLD = 250;
    private final iv4 props;

    public BarcodeView(Context context, iv4 iv4Var) {
        super(context);
        this.props = iv4Var;
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        setAdjustViewBounds(true);
    }

    private final Bitmap addRoundedBackground(Bitmap bitmap, int cornerRadiusDp, int paddingDp) {
        float f = getResources().getDisplayMetrics().density;
        float dpToPx = dpToPx(cornerRadiusDp, f);
        float dpToPx2 = dpToPx(paddingDp, f);
        int i = (int) (2.0f * dpToPx2);
        int width = bitmap.getWidth() + i;
        int height = bitmap.getHeight() + i;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, width, height), dpToPx, dpToPx, paint);
        canvas.drawBitmap(bitmap, dpToPx2, dpToPx2, (Paint) null);
        return createBitmap;
    }

    private final Bitmap createBitmap(vz5 bitMatrix) {
        int i = bitMatrix.a;
        int i2 = bitMatrix.b;
        int[] iArr = new int[i * i2];
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                iArr[(i3 * i) + i4] = bitMatrix.b(i4, i3) ? ModalContentViewContainer.BASE_SHADOW_COLOR : -1;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
        return createBitmap;
    }

    private final float dpToPx(int dp, float density) {
        return dp * density;
    }

    private final void generateBarcode(iv4 props) {
        Object obj;
        zkw0 zkw0Var = SupportedBarcodeFormat.Companion;
        String str = props.a;
        int i = props.d;
        int i2 = props.c;
        zkw0Var.getClass();
        Iterator<E> it = SupportedBarcodeFormat.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((SupportedBarcodeFormat) obj).getKey(), str.toLowerCase(Locale.ROOT))) {
                    break;
                }
            }
        }
        SupportedBarcodeFormat supportedBarcodeFormat = (SupportedBarcodeFormat) obj;
        if (supportedBarcodeFormat == null) {
            return;
        }
        int width = getWidth() > 0 ? getWidth() : 200;
        int height = getHeight() > 0 ? getHeight() : 200;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(EncodeHintType.MARGIN, 0);
            Bitmap createBitmap = createBitmap(new ml40().a(props.b, supportedBarcodeFormat.getZxingFormat(), width, height, linkedHashMap));
            if (i2 > 0 || i > 0) {
                createBitmap = addRoundedBackground(trimWhiteBorders(createBitmap), i2, i);
                setClipToOutline(true);
            }
            setImageBitmap(createBitmap);
        } catch (Exception unused) {
        }
    }

    private final Bitmap trimWhiteBorders(Bitmap source) {
        int width = source.getWidth();
        int height = source.getHeight();
        int[] iArr = new int[width * height];
        source.getPixels(iArr, 0, width, 0, 0, width, height);
        int i = 0;
        int i2 = 0;
        int i3 = width;
        int i4 = height;
        for (int i5 = 0; i5 < height; i5++) {
            for (int i6 = 0; i6 < width; i6++) {
                int i7 = iArr[(i5 * width) + i6];
                int red = Color.red(i7);
                int green = Color.green(i7);
                int blue = Color.blue(i7);
                if (red <= 250 || green <= 250 || blue <= 250) {
                    i3 = Math.min(i3, i6);
                    i = Math.max(i, i6);
                    i4 = Math.min(i4, i5);
                    i2 = Math.max(i2, i5);
                }
            }
        }
        return (i3 > i || i4 > i2) ? source : Bitmap.createBitmap(source, i3, i4, (i - i3) + 1, (i2 - i4) + 1);
    }

    public final void bind() {
        iv4 iv4Var = this.props;
        if (iv4Var != null) {
            generateBarcode(iv4Var);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        iv4 iv4Var;
        super.onSizeChanged(w, h, oldw, oldh);
        if (w <= 0 || h <= 0 || (iv4Var = this.props) == null) {
            return;
        }
        generateBarcode(iv4Var);
    }
}
