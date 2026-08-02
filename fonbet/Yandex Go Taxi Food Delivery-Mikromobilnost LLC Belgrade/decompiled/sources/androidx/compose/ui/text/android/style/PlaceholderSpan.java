package androidx.compose.ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import defpackage.fwi;
import defpackage.jxv;
import defpackage.ny61;
import defpackage.uh6;
import defpackage.w3c0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 32\u00020\u0001:\u00014BA\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fB9\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u000fJ;\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0017¢\u0006\u0004\b\u0018\u0010\u0019JY\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R$\u0010(\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00168\u0006@BX\u0086.¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R$\u0010,\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&R$\u0010.\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u0010&R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Landroidx/compose/ui/text/android/style/PlaceholderSpan;", "Landroid/text/style/ReplacementSpan;", "", "width", "", "widthUnit", "height", "heightUnit", "widthAsSpInPx", "heightAsSpInPx", "verticalAlign", "<init>", "(FIFIFFI)V", "Lfwi;", "density", "(FIFILfwi;I)V", "Landroid/graphics/Paint;", "paint", "", "text", "start", "end", "Landroid/graphics/Paint$FontMetricsInt;", "fm", "getSize", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I", "Landroid/graphics/Canvas;", "canvas", RemoteBioParameters.X, "top", RemoteBioParameters.Y, "bottom", "Lzy11;", "draw", "(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V", "F", CA20Status.STATUS_USER_I, "getVerticalAlign", "()I", "value", "fontMetrics", "Landroid/graphics/Paint$FontMetricsInt;", "getFontMetrics", "()Landroid/graphics/Paint$FontMetricsInt;", "widthPx", "getWidthPx", "heightPx", "getHeightPx", "", "isLaidOut", "Z", "Companion", "w3c0", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PlaceholderSpan extends ReplacementSpan {
    public static final int $stable = 8;
    public static final int ALIGN_ABOVE_BASELINE = 0;
    public static final int ALIGN_BOTTOM = 2;
    public static final int ALIGN_CENTER = 3;
    public static final int ALIGN_TEXT_BOTTOM = 5;
    public static final int ALIGN_TEXT_CENTER = 6;
    public static final int ALIGN_TEXT_TOP = 4;
    public static final int ALIGN_TOP = 1;
    public static final w3c0 Companion = new w3c0();
    public static final int UNIT_EM = 1;
    public static final int UNIT_SP = 0;
    public static final int UNIT_UNSPECIFIED = 2;
    private Paint.FontMetricsInt fontMetrics;
    private final float height;
    private final float heightAsSpInPx;
    private int heightPx;
    private final int heightUnit;
    private boolean isLaidOut;
    private final int verticalAlign;
    private final float width;
    private final float widthAsSpInPx;
    private int widthPx;
    private final int widthUnit;

    public PlaceholderSpan(float f, int i, float f2, int i2, fwi fwiVar, int i3) {
        this(f, i, f2, i2, i == 0 ? fwiVar.i0(uh6.K(f, 4294967296L)) : 0.0f, i2 == 0 ? fwiVar.i0(uh6.K(f2, 4294967296L)) : 0.0f, i3);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
    }

    public final Paint.FontMetricsInt getFontMetrics() {
        Paint.FontMetricsInt fontMetricsInt = this.fontMetrics;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        return null;
    }

    public final int getHeightPx() {
        if (!this.isLaidOut) {
            jxv.c("PlaceholderSpan is not laid out yet.");
        }
        return this.heightPx;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) {
        float f;
        float f2;
        this.isLaidOut = true;
        float textSize = paint.getTextSize();
        this.fontMetrics = paint.getFontMetricsInt();
        if (getFontMetrics().descent <= getFontMetrics().ascent) {
            jxv.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i = this.widthUnit;
        if (i == 0) {
            f = this.widthAsSpInPx;
        } else {
            if (i != 1) {
                jxv.b("Unsupported unit.");
                ny61.A();
                return 0;
            }
            f = this.width * textSize;
        }
        this.widthPx = (int) Math.ceil(f);
        int i2 = this.heightUnit;
        if (i2 == 0) {
            f2 = this.heightAsSpInPx;
        } else {
            if (i2 != 1) {
                jxv.b("Unsupported unit.");
                ny61.A();
                return 0;
            }
            f2 = this.height * textSize;
        }
        this.heightPx = (int) Math.ceil(f2);
        if (fm != null) {
            fm.ascent = getFontMetrics().ascent;
            fm.descent = getFontMetrics().descent;
            fm.leading = getFontMetrics().leading;
            switch (this.verticalAlign) {
                case 0:
                    if (fm.ascent > (-getHeightPx())) {
                        fm.ascent = -getHeightPx();
                        break;
                    }
                    break;
                case 1:
                case 4:
                    if (getHeightPx() + fm.ascent > fm.descent) {
                        fm.descent = getHeightPx() + fm.ascent;
                        break;
                    }
                    break;
                case 2:
                case 5:
                    if (fm.ascent > fm.descent - getHeightPx()) {
                        fm.ascent = fm.descent - getHeightPx();
                        break;
                    }
                    break;
                case 3:
                case 6:
                    if (fm.descent - fm.ascent < getHeightPx()) {
                        int heightPx = fm.ascent - ((getHeightPx() - (fm.descent - fm.ascent)) / 2);
                        fm.ascent = heightPx;
                        fm.descent = getHeightPx() + heightPx;
                        break;
                    }
                    break;
                default:
                    jxv.a("Unknown verticalAlign.");
                    break;
            }
            fm.top = Math.min(getFontMetrics().top, fm.ascent);
            fm.bottom = Math.max(getFontMetrics().bottom, fm.descent);
        }
        return getWidthPx();
    }

    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    public final int getWidthPx() {
        if (!this.isLaidOut) {
            jxv.c("PlaceholderSpan is not laid out yet.");
        }
        return this.widthPx;
    }

    private PlaceholderSpan(float f, int i, float f2, int i2, float f3, float f4, int i3) {
        this.width = f;
        this.widthUnit = i;
        this.height = f2;
        this.heightUnit = i2;
        this.widthAsSpInPx = f3;
        this.heightAsSpInPx = f4;
        this.verticalAlign = i3;
    }
}
