package com.yandex.div.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.yandex.div.internal.view.OverridableOnPreDrawListener;
import defpackage.e3i0;
import defpackage.hcm;
import defpackage.jl40;
import defpackage.mrn;
import defpackage.ooc;
import defpackage.sls;
import defpackage.w511;
import defpackage.wfx;
import defpackage.xz20;
import defpackage.zq3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 o2\u00020\u0001:\u0001pB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010 \u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0014¢\u0006\u0004\b$\u0010%J/\u0010*\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0006H\u0004¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u000eH\u0002¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b1\u00100J/\u00102\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b2\u0010+J\u000f\u00103\u001a\u00020\nH\u0002¢\u0006\u0004\b3\u0010\fJ\u000f\u00104\u001a\u00020\nH\u0002¢\u0006\u0004\b4\u0010\fJ\u000f\u00105\u001a\u00020\nH\u0002¢\u0006\u0004\b5\u0010\fJ\u000f\u00107\u001a\u000206H\u0002¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000eH\u0002¢\u0006\u0004\b;\u0010<J!\u0010?\u001a\u00020>2\u0006\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010=\u001a\u00020\u0006H\u0002¢\u0006\u0004\b?\u0010@J!\u0010A\u001a\u00020>2\u0006\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010=\u001a\u00020\u0006H\u0003¢\u0006\u0004\bA\u0010@R*\u0010.\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010C\u001a\u0004\bD\u0010\u0010\"\u0004\bE\u00100R*\u0010F\u001a\u0002062\u0006\u0010B\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u00108\"\u0004\bI\u0010JR.\u0010K\u001a\u0004\u0018\u00010\u00192\b\u0010B\u001a\u0004\u0018\u00010\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010\u001cR\u0016\u0010P\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010GR4\u0010Q\u001a\u0004\u0018\u00010\u000e2\b\u0010B\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0087\u000e¢\u0006\u0018\n\u0004\bQ\u0010C\u0012\u0004\bT\u0010\f\u001a\u0004\bR\u0010\u0010\"\u0004\bS\u00100R.\u0010V\u001a\u0004\u0018\u00010\u000e2\b\u0010U\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\bV\u0010C\u0012\u0004\bX\u0010\f\u001a\u0004\bW\u0010\u0010R\"\u0010Y\u001a\u0002068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bY\u0010G\u001a\u0004\bY\u00108\"\u0004\bZ\u0010JR\u0016\u0010[\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\"\u0010]\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b]\u0010\\\u001a\u0004\b^\u0010-\"\u0004\b_\u0010\u0018R\u0018\u0010`\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010CR\u0016\u0010b\u001a\u00020a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010GR\u001a\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bf\u0010g\u0012\u0004\bh\u0010\fR$\u0010n\u001a\u00020i2\u0006\u0010B\u001a\u00020i8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bj\u0010k\"\u0004\bl\u0010m¨\u0006q"}, d2 = {"Lcom/yandex/div/internal/widget/EllipsizedTextView;", "Lcom/yandex/div/internal/widget/SuperLineHeightTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "getText", "()Ljava/lang/CharSequence;", "text", "Landroid/widget/TextView$BufferType;", "type", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "maxLines", "setMaxLines", "(I)V", "Landroid/text/TextUtils$TruncateAt;", "where", "setEllipsize", "(Landroid/text/TextUtils$TruncateAt;)V", "start", "lengthBefore", "lengthAfter", "onTextChanged", "(Ljava/lang/CharSequence;III)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "width", "height", "oldWidth", "oldHeight", "onSizeChanged", "(IIII)V", "availableWidth", "()I", "ellipsis", "onEllipsisChanged", "(Ljava/lang/CharSequence;)V", "setTextInternal", "sizeChangeInternal", "requestEllipsize", "invalidateEllipsis", "ellipsizeIfNeeded", "", "noMaxLines", "()Z", "ellipsize", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "calculateFittedSymbols", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I", "textWidth", "Landroid/text/Layout;", "layoutText", "(Ljava/lang/CharSequence;I)Landroid/text/Layout;", "layoutTextWithHyphenation", "value", "Ljava/lang/CharSequence;", "getEllipsis", "setEllipsis", "autoEllipsize", "Z", "getAutoEllipsize", "setAutoEllipsize", "(Z)V", "ellipsisLocation", "Landroid/text/TextUtils$TruncateAt;", "getEllipsisLocation", "()Landroid/text/TextUtils$TruncateAt;", "setEllipsisLocation", "isRemeasureNeeded", "ellipsizedText", "getEllipsizedText", "setEllipsizedText", "getEllipsizedText$annotations", "<set-?>", "displayText", "getDisplayText", "getDisplayText$annotations", "isInternalTextChange", "setInternalTextChange", "lastMeasuredWidth", CA20Status.STATUS_USER_I, "lastMeasuredHeight", "getLastMeasuredHeight", "setLastMeasuredHeight", "originalText", "", "cachedEllipsisWidth", "F", "isEllipsizeRequested", "Lzq3;", "autoEllipsizeHelper", "Lzq3;", "getAutoEllipsizeHelper$annotations", "Lhcm;", "getDrawingPassOverrideStrategy$div_release", "()Lhcm;", "setDrawingPassOverrideStrategy$div_release", "(Lhcm;)V", "drawingPassOverrideStrategy", "Companion", "mrn", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class EllipsizedTextView extends SuperLineHeightTextView {
    public static final mrn Companion = new mrn();
    private static final boolean DEBUG = false;
    public static final String DEFAULT_ELLIPSIS = "…";
    private static final float ELLIPSIS_WIDTH_UNKNOWN = -1.0f;
    public static final int NOT_SET = -1;
    private static final String TAG = "Ya:EllipsizedTextView";
    private boolean autoEllipsize;
    private final zq3 autoEllipsizeHelper;
    private float cachedEllipsisWidth;
    private CharSequence displayText;
    private CharSequence ellipsis;
    private TextUtils.TruncateAt ellipsisLocation;
    private CharSequence ellipsizedText;
    private boolean isEllipsizeRequested;
    private boolean isInternalTextChange;
    private boolean isRemeasureNeeded;
    private int lastMeasuredHeight;
    private int lastMeasuredWidth;
    private CharSequence originalText;

    public EllipsizedTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        CharSequence charSequence = DEFAULT_ELLIPSIS;
        this.ellipsis = DEFAULT_ELLIPSIS;
        this.ellipsisLocation = TextUtils.TruncateAt.END;
        this.lastMeasuredWidth = -1;
        this.lastMeasuredHeight = -1;
        this.cachedEllipsisWidth = -1.0f;
        this.autoEllipsizeHelper = new zq3(this);
        if (isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e3i0.EllipsizedTextView, i, 0);
            try {
                CharSequence text = obtainStyledAttributes.getText(e3i0.EllipsizedTextView_ellipsis);
                if (text != null) {
                    charSequence = text;
                }
                setEllipsis(charSequence);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        onEllipsisChanged(this.ellipsis);
    }

    private final int calculateFittedSymbols(CharSequence text, CharSequence ellipsis) {
        int availableWidth;
        if (text.length() == 0 || getMaxLines() == 0 || (availableWidth = availableWidth()) <= 0) {
            return 0;
        }
        Layout layoutTextWithHyphenation = getHyphenationFrequency() != 0 ? layoutTextWithHyphenation(text, availableWidth) : layoutText(text, availableWidth);
        int lineCount = layoutTextWithHyphenation.getLineCount();
        float lineWidth = layoutTextWithHyphenation.getLineWidth(lineCount - 1);
        if (lineCount < getMaxLines() || (lineCount == getMaxLines() && lineWidth <= availableWidth)) {
            this.isRemeasureNeeded = true;
            return text.length();
        }
        if (this.cachedEllipsisWidth == -1.0f) {
            this.cachedEllipsisWidth = layoutText$default(this, ellipsis, 0, 2, null).getLineWidth(0);
        }
        this.isRemeasureNeeded = true;
        float f = availableWidth - this.cachedEllipsisWidth;
        int offsetForHorizontal = layoutTextWithHyphenation.getOffsetForHorizontal(getMaxLines() - 1, f);
        while (layoutTextWithHyphenation.getPrimaryHorizontal(offsetForHorizontal) > f && offsetForHorizontal > 0) {
            offsetForHorizontal--;
        }
        return (offsetForHorizontal <= 0 || !Character.isHighSurrogate(text.charAt(offsetForHorizontal + (-1)))) ? offsetForHorizontal : offsetForHorizontal - 1;
    }

    private final CharSequence ellipsize(CharSequence text) {
        CharSequence charSequence;
        int calculateFittedSymbols;
        if (text == null || text.length() == 0 || (calculateFittedSymbols = calculateFittedSymbols(text, (charSequence = this.ellipsis))) <= 0) {
            return null;
        }
        if (calculateFittedSymbols == text.length()) {
            return text;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text, 0, calculateFittedSymbols);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private final void ellipsizeIfNeeded() {
        CharSequence charSequence = this.ellipsizedText;
        boolean z = noMaxLines() || jl40.l(this.ellipsis, DEFAULT_ELLIPSIS);
        if (this.ellipsizedText != null || !z) {
            CharSequence charSequence2 = this.originalText;
            if (z) {
                if (charSequence2 != null) {
                    this.isRemeasureNeeded = !charSequence2.equals(charSequence);
                } else {
                    charSequence2 = null;
                }
                setEllipsizedText(charSequence2);
            } else {
                setEllipsizedText(ellipsize(charSequence2));
            }
        }
        this.isEllipsizeRequested = false;
    }

    private static /* synthetic */ void getAutoEllipsizeHelper$annotations() {
    }

    public static /* synthetic */ void getDisplayText$annotations() {
    }

    public static /* synthetic */ void getEllipsizedText$annotations() {
    }

    private final void invalidateEllipsis() {
        this.cachedEllipsisWidth = -1.0f;
        this.isRemeasureNeeded = false;
    }

    private final Layout layoutText(CharSequence text, int textWidth) {
        return new StaticLayout(text, getPaint(), textWidth, Layout.Alignment.ALIGN_NORMAL, getLineSpacingMultiplier(), getLineSpacingExtra(), true);
    }

    public static /* synthetic */ Layout layoutText$default(EllipsizedTextView ellipsizedTextView, CharSequence charSequence, int i, int i2, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: layoutText");
            return null;
        }
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return ellipsizedTextView.layoutText(charSequence, i);
    }

    private final Layout layoutTextWithHyphenation(CharSequence text, int textWidth) {
        return StaticLayout.Builder.obtain(text, 0, text.length(), getPaint(), textWidth).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(getLineSpacingExtra(), getLineSpacingMultiplier()).setIncludePad(true).setHyphenationFrequency(getHyphenationFrequency()).build();
    }

    public static /* synthetic */ Layout layoutTextWithHyphenation$default(EllipsizedTextView ellipsizedTextView, CharSequence charSequence, int i, int i2, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: layoutTextWithHyphenation");
            return null;
        }
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        return ellipsizedTextView.layoutTextWithHyphenation(charSequence, i);
    }

    private final boolean noMaxLines() {
        return getMaxLines() < 0 || getMaxLines() == Integer.MAX_VALUE;
    }

    private final void onEllipsisChanged(CharSequence ellipsis) {
        if (noMaxLines()) {
            super.setEllipsize(null);
        } else if (jl40.l(ellipsis, DEFAULT_ELLIPSIS)) {
            super.setEllipsize(this.ellipsisLocation);
        } else {
            super.setEllipsize(null);
            requestEllipsize();
            invalidateEllipsis();
        }
        requestLayout();
    }

    private final void requestEllipsize() {
        this.isEllipsizeRequested = true;
    }

    private final void setEllipsizedText(CharSequence charSequence) {
        this.ellipsizedText = charSequence;
        setTextInternal(charSequence);
    }

    private final void setTextInternal(CharSequence text) {
        this.isInternalTextChange = true;
        super.setText(text);
        this.isInternalTextChange = false;
    }

    private final void sizeChangeInternal(int width, int height, int oldWidth, int oldHeight) {
        if (width == oldWidth && height == oldHeight) {
            return;
        }
        requestEllipsize();
    }

    public final int availableWidth() {
        return (getMeasuredWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
    }

    public final boolean getAutoEllipsize() {
        return this.autoEllipsize;
    }

    public final CharSequence getDisplayText() {
        return this.displayText;
    }

    public final hcm getDrawingPassOverrideStrategy$div_release() {
        return this.autoEllipsizeHelper.c;
    }

    public final CharSequence getEllipsis() {
        return this.ellipsis;
    }

    public final TextUtils.TruncateAt getEllipsisLocation() {
        return this.ellipsisLocation;
    }

    public final CharSequence getEllipsizedText() {
        return this.ellipsizedText;
    }

    public final int getLastMeasuredHeight() {
        return this.lastMeasuredHeight;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public CharSequence getText() {
        CharSequence charSequence = this.ellipsizedText;
        if (charSequence != null) {
            return charSequence;
        }
        CharSequence charSequence2 = this.originalText;
        return charSequence2 == null ? "" : charSequence2;
    }

    /* renamed from: isInternalTextChange, reason: from getter */
    public final boolean getIsInternalTextChange() {
        return this.isInternalTextChange;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final zq3 zq3Var = this.autoEllipsizeHelper;
        if (zq3Var.b && zq3Var.d == null) {
            zq3Var.d = new OverridableOnPreDrawListener(new xz20(1, new sls() { // from class: com.yandex.div.internal.widget.AutoEllipsizeHelper$addListener$1
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    zq3 zq3Var2 = zq3.this;
                    if (!zq3Var2.b) {
                        return Boolean.TRUE;
                    }
                    EllipsizedTextView ellipsizedTextView = zq3Var2.a;
                    int height = (ellipsizedTextView.getHeight() - ellipsizedTextView.getCompoundPaddingTop()) - ellipsizedTextView.getCompoundPaddingBottom();
                    boolean z = false;
                    int lineForVertical = ellipsizedTextView.getLayout() == null ? 0 : ellipsizedTextView.getLayout().getLineForVertical(height);
                    int i = lineForVertical + 1;
                    if (height >= ooc.C(ellipsizedTextView, i)) {
                        lineForVertical = i;
                    }
                    if (lineForVertical <= 0 || lineForVertical >= zq3.this.a.getLineCount()) {
                        zq3 zq3Var3 = zq3.this;
                        if (zq3Var3.d != null) {
                            zq3Var3.a.getViewTreeObserver().removeOnPreDrawListener(zq3Var3.d);
                            zq3Var3.d = null;
                        }
                        z = true;
                    } else {
                        int i2 = wfx.a;
                        zq3.this.a.setMaxLines(lineForVertical);
                    }
                    return Boolean.valueOf(z);
                }
            }), zq3Var.c);
            zq3Var.a.getViewTreeObserver().addOnPreDrawListener(zq3Var.d);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zq3 zq3Var = this.autoEllipsizeHelper;
        if (zq3Var.d != null) {
            zq3Var.a.getViewTreeObserver().removeOnPreDrawListener(zq3Var.d);
            zq3Var.d = null;
        }
    }

    @Override // com.yandex.div.internal.widget.SuperLineHeightTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        sizeChangeInternal(getMeasuredWidth(), getMeasuredHeight(), this.lastMeasuredWidth, this.lastMeasuredHeight);
        if (this.isEllipsizeRequested) {
            ellipsizeIfNeeded();
            CharSequence charSequence = this.ellipsizedText;
            if (charSequence != null) {
                if (!this.isRemeasureNeeded) {
                    charSequence = null;
                }
                if (charSequence != null) {
                    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                }
            }
        }
        this.lastMeasuredWidth = getMeasuredWidth();
    }

    @Override // android.view.View
    public void onSizeChanged(int width, int height, int oldWidth, int oldHeight) {
        super.onSizeChanged(width, height, oldWidth, oldHeight);
        sizeChangeInternal(width, height, oldWidth, oldHeight);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void onTextChanged(CharSequence text, int start, int lengthBefore, int lengthAfter) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter);
        if (this.isInternalTextChange) {
            return;
        }
        this.originalText = text;
        requestLayout();
        requestEllipsize();
    }

    public final void setAutoEllipsize(boolean z) {
        this.autoEllipsize = z;
        this.autoEllipsizeHelper.b = z;
    }

    public final void setDrawingPassOverrideStrategy$div_release(hcm hcmVar) {
        this.autoEllipsizeHelper.c = hcmVar;
    }

    public final void setEllipsis(CharSequence charSequence) {
        onEllipsisChanged(charSequence);
        this.ellipsis = charSequence;
    }

    public final void setEllipsisLocation(TextUtils.TruncateAt truncateAt) {
        this.ellipsisLocation = truncateAt;
        if (truncateAt == null) {
            setAutoEllipsize(false);
        }
        onEllipsisChanged(this.ellipsis);
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt where) {
    }

    public final void setInternalTextChange(boolean z) {
        this.isInternalTextChange = z;
    }

    public final void setLastMeasuredHeight(int i) {
        this.lastMeasuredHeight = i;
    }

    @Override // android.widget.TextView
    public void setMaxLines(int maxLines) {
        if (maxLines == getMaxLines()) {
            return;
        }
        super.setMaxLines(maxLines);
        onEllipsisChanged(this.ellipsis);
        requestEllipsize();
        invalidateEllipsis();
    }

    @Override // android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        this.displayText = text;
        super.setText(text, type);
    }

    public EllipsizedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ EllipsizedTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public EllipsizedTextView(Context context) {
        this(context, null, 0, 6, null);
    }
}
