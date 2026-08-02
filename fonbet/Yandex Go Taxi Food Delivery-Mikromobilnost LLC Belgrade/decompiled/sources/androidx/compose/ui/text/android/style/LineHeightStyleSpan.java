package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import defpackage.jxv;
import io.flutter.plugin.editing.SpellCheckPlugin;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u001d\b\u0001\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J?\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b%\u0010$R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010!R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010!R\u0016\u0010*\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010!R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010!R$\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010'R$\u0010/\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b0\u0010'¨\u00061"}, d2 = {"Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "Landroid/text/style/LineHeightSpan;", "", "lineHeight", "", SpellCheckPlugin.START_INDEX_KEY, SpellCheckPlugin.END_INDEX_KEY, "", "trimFirstLineTop", "trimLastLineBottom", "topRatio", "Lchy;", "mode", "<init>", "(FIIZZFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "Lzy11;", "calculateTargetMetrics", "(Landroid/graphics/Paint$FontMetricsInt;)V", "", "text", "start", "end", "spanStartVertical", "chooseHeight", "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V", "copy$ui_text", "(IIZ)Landroidx/compose/ui/text/android/style/LineHeightStyleSpan;", "copy", "F", "getLineHeight", "()F", CA20Status.STATUS_USER_I, "Z", "getTrimFirstLineTop", "()Z", "getTrimLastLineBottom", "getMode-lzQqcRY", "()I", "firstAscent", "ascent", "descent", "lastDescent", "value", "firstAscentDiff", "getFirstAscentDiff", "lastDescentDiff", "getLastDescentDiff", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {
    public static final int $stable = 8;
    private int ascent;
    private int descent;
    private final int endIndex;
    private int firstAscent;
    private int firstAscentDiff;
    private int lastDescent;
    private int lastDescentDiff;
    private final float lineHeight;
    private final int mode;
    private final int startIndex;
    private final float topRatio;
    private final boolean trimFirstLineTop;
    private final boolean trimLastLineBottom;

    private LineHeightStyleSpan(float f, int i, int i2, boolean z, boolean z2, float f2, int i3) {
        this.lineHeight = f;
        this.startIndex = i;
        this.endIndex = i2;
        this.trimFirstLineTop = z;
        this.trimLastLineBottom = z2;
        this.topRatio = f2;
        this.mode = i3;
        this.firstAscent = Integer.MIN_VALUE;
        this.ascent = Integer.MIN_VALUE;
        this.descent = Integer.MIN_VALUE;
        this.lastDescent = Integer.MIN_VALUE;
        if ((0.0f <= f2 && f2 <= 1.0f) || f2 == -1.0f) {
            return;
        }
        jxv.c("topRatio should be in [0..1] range or -1");
    }

    private final void calculateTargetMetrics(Paint.FontMetricsInt fontMetricsInt) {
        int ceil = (int) Math.ceil(this.lineHeight);
        int i = ceil - (fontMetricsInt.descent - fontMetricsInt.ascent);
        if (this.mode == 1 && i <= 0) {
            int i2 = fontMetricsInt.ascent;
            this.ascent = i2;
            int i3 = fontMetricsInt.descent;
            this.descent = i3;
            this.firstAscent = i2;
            this.lastDescent = i3;
            this.firstAscentDiff = 0;
            this.lastDescentDiff = 0;
            return;
        }
        float f = this.topRatio;
        if (f == -1.0f) {
            f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
        }
        int ceil2 = (int) (i <= 0 ? Math.ceil(i * f) : Math.ceil((1.0f - f) * i));
        int i4 = fontMetricsInt.descent;
        int i5 = ceil2 + i4;
        this.descent = i5;
        int i6 = i5 - ceil;
        this.ascent = i6;
        int i7 = this.mode;
        if (i7 == 0 || i >= 0) {
            if (this.trimFirstLineTop) {
                i6 = fontMetricsInt.ascent;
            }
            this.firstAscent = i6;
            if (this.trimLastLineBottom) {
                i5 = i4;
            }
            this.lastDescent = i5;
            this.firstAscentDiff = fontMetricsInt.ascent - i6;
            this.lastDescentDiff = i5 - i4;
            return;
        }
        if (i7 == 2) {
            boolean z = this.trimFirstLineTop;
            int i8 = fontMetricsInt.ascent;
            this.firstAscent = z ? Math.max(i8, i6) : Math.min(i8, i6);
            boolean z2 = this.trimLastLineBottom;
            int i9 = fontMetricsInt.descent;
            int i10 = this.descent;
            this.lastDescent = z2 ? Math.min(i9, i10) : Math.max(i9, i10);
            this.firstAscentDiff = 0;
            this.lastDescentDiff = 0;
        }
    }

    public static /* synthetic */ LineHeightStyleSpan copy$ui_text$default(LineHeightStyleSpan lineHeightStyleSpan, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = lineHeightStyleSpan.trimFirstLineTop;
        }
        return lineHeightStyleSpan.copy$ui_text(i, i2, z);
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int start, int end, int spanStartVertical, int lineHeight, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        boolean z = start == this.startIndex;
        boolean z2 = end == this.endIndex;
        if (z && z2 && this.trimFirstLineTop && this.trimLastLineBottom && this.mode != 2) {
            return;
        }
        if (this.firstAscent == Integer.MIN_VALUE) {
            calculateTargetMetrics(fontMetricsInt);
        }
        fontMetricsInt.ascent = z ? this.firstAscent : this.ascent;
        fontMetricsInt.descent = z2 ? this.lastDescent : this.descent;
    }

    public final LineHeightStyleSpan copy$ui_text(int startIndex, int endIndex, boolean trimFirstLineTop) {
        return new LineHeightStyleSpan(this.lineHeight, startIndex, endIndex, trimFirstLineTop, this.trimLastLineBottom, this.topRatio, this.mode, null);
    }

    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    /* renamed from: getMode-lzQqcRY, reason: not valid java name and from getter */
    public final int getMode() {
        return this.mode;
    }

    public final boolean getTrimFirstLineTop() {
        return this.trimFirstLineTop;
    }

    public final boolean getTrimLastLineBottom() {
        return this.trimLastLineBottom;
    }

    public /* synthetic */ LineHeightStyleSpan(float f, int i, int i2, boolean z, boolean z2, float f2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, i, i2, z, z2, f2, i3);
    }
}
