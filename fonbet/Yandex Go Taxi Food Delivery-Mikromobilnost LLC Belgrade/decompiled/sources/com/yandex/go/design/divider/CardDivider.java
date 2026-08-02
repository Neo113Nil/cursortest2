package com.yandex.go.design.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bdc;
import defpackage.c4i0;
import defpackage.k4o;
import defpackage.kdc;
import defpackage.kgx;
import defpackage.mrg0;
import defpackage.nwy0;
import defpackage.qje;
import defpackage.s8o;
import defpackage.tje;
import defpackage.ue8;
import defpackage.w511;
import defpackage.xbi0;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001TB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0019\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R+\u00107\u001a\u00020/2\u0006\u00100\u001a\u00020/8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R+\u0010=\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R+\u0010D\u001a\u00020>2\u0006\u00100\u001a\u00020>8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u00102\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR+\u0010K\u001a\u00020E2\u0006\u00100\u001a\u00020E8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u00102\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR+\u0010O\u001a\u00020E2\u0006\u00100\u001a\u00020E8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bL\u00102\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR\u0014\u0010Q\u001a\u00020E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010HR\u0014\u0010S\u001a\u00020E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010H¨\u0006U"}, d2 = {"Lcom/yandex/go/design/divider/CardDivider;", "Landroid/view/View;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "fillFromAttrs", "refreshDividerSize", "()V", "refreshPaintColor", "calculatePath", "Landroid/view/ViewGroup$LayoutParams;", "params", "setLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/Path;", "dividerPath", "Landroid/graphics/Path;", "dividerRadius", CA20Status.STATUS_USER_I, "Lkdc;", "<set-?>", "color$delegate", "Lxbi0;", "getColor", "()Lkdc;", "setColor", "(Lkdc;)V", "color", "dividerHeight$delegate", "getDividerHeight", "()I", "setDividerHeight", "(I)V", "dividerHeight", "Lcom/yandex/go/design/divider/CardDivider$Type;", "type$delegate", "getType", "()Lcom/yandex/go/design/divider/CardDivider$Type;", "setType", "(Lcom/yandex/go/design/divider/CardDivider$Type;)V", "type", "", "updateMargins$delegate", "getUpdateMargins", "()Z", "setUpdateMargins", "(Z)V", "updateMargins", "drawOutSize$delegate", "getDrawOutSize", "setDrawOutSize", "drawOutSize", "getTopRounded", "topRounded", "getBottomRounded", "bottomRounded", "Type", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public class CardDivider extends View implements nwy0 {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new MutablePropertyReference1Impl("color", 0, "getColor()Lru/yandex/taxi/design/utils/Color;", CardDivider.class), new MutablePropertyReference1Impl("dividerHeight", 0, "getDividerHeight()I", CardDivider.class), new MutablePropertyReference1Impl("type", 0, "getType()Lcom/yandex/go/design/divider/CardDivider$Type;", CardDivider.class), new MutablePropertyReference1Impl("updateMargins", 0, "getUpdateMargins()Z", CardDivider.class), new MutablePropertyReference1Impl("drawOutSize", 0, "getDrawOutSize()Z", CardDivider.class)};

    /* renamed from: color$delegate, reason: from kotlin metadata */
    private final xbi0 color;

    /* renamed from: dividerHeight$delegate, reason: from kotlin metadata */
    private final xbi0 dividerHeight;
    private final Path dividerPath;
    private final int dividerRadius;

    /* renamed from: drawOutSize$delegate, reason: from kotlin metadata */
    private final xbi0 drawOutSize;
    private final Paint paint;

    /* renamed from: type$delegate, reason: from kotlin metadata */
    private final xbi0 type;

    /* renamed from: updateMargins$delegate, reason: from kotlin metadata */
    private final xbi0 updateMargins;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/design/divider/CardDivider$Type;", "", "BOTH", "TOP", "BOTTOM", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type BOTH;
        public static final Type BOTTOM;
        public static final Type TOP;

        static {
            Type type = new Type("BOTH", 0);
            BOTH = type;
            Type type2 = new Type("TOP", 1);
            TOP = type2;
            Type type3 = new Type("BOTTOM", 2);
            BOTTOM = type3;
            Type[] typeArr = {type, type2, type3};
            $VALUES = typeArr;
            $ENTRIES = kotlin.enums.a.a(typeArr);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public CardDivider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.paint = new Paint(1);
        this.dividerPath = new Path();
        this.dividerRadius = tje.r(mrg0.go_design_card_divider_radius, getContext());
        this.color = new ue8(new bdc(xng0.cardDivider), this, 0);
        this.dividerHeight = new ue8(Integer.valueOf(tje.r(mrg0.go_design_card_divider_default_size, getContext())), this, 1);
        this.type = new ue8(Type.BOTH, this, 2);
        this.updateMargins = new ue8(this, 3);
        this.drawOutSize = new ue8(this, 4);
        if (attributeSet != null) {
            fillFromAttrs(context, attributeSet, i);
        } else {
            refreshPaintColor();
        }
        setImportantForAccessibility(2);
        setZ(2.0f);
    }

    private final void calculatePath() {
        float f;
        float f2;
        float f3 = this.dividerRadius;
        float f4 = f3 * 2.0f;
        float width = getWidth();
        this.dividerPath.rewind();
        if (getTopRounded()) {
            float f5 = getDrawOutSize() ? 0.0f - f3 : 0.0f;
            this.dividerPath.moveTo(0.0f, f5);
            float f6 = f5;
            float f7 = f6 - f3;
            float f8 = f6 + f3;
            this.dividerPath.arcTo(0.0f, f7, f4, f8, 180.0f, -90.0f, false);
            this.dividerPath.lineTo(width - f3, f8);
            f = width;
            this.dividerPath.arcTo(width - f4, f7, f, f8, 90.0f, -90.0f, false);
            f2 = f8;
        } else {
            f = width;
            this.dividerPath.lineTo(f, 0.0f);
            f2 = 0.0f;
        }
        float dividerHeight = f2 + getDividerHeight();
        boolean bottomRounded = getBottomRounded();
        Path path = this.dividerPath;
        if (bottomRounded) {
            path.lineTo(f, dividerHeight + f3);
            float f9 = dividerHeight + f4;
            this.dividerPath.arcTo(f - f4, dividerHeight, f, f9, 0.0f, -90.0f, false);
            this.dividerPath.lineTo(f3, dividerHeight);
            this.dividerPath.arcTo(0.0f, dividerHeight, f4, f9, -90.0f, -90.0f, false);
        } else {
            path.lineTo(f, dividerHeight);
            this.dividerPath.lineTo(0.0f, dividerHeight);
        }
        this.dividerPath.close();
    }

    private final void fillFromAttrs(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, c4i0.CardDivider, defStyleAttr, 0);
        try {
            kdc T = qje.T(attrs, obtainStyledAttributes, "divider_color", c4i0.CardDivider_divider_color, null);
            if (T == null) {
                T = getColor();
            }
            setColor(T);
            int i = obtainStyledAttributes.getInt(c4i0.CardDivider_divider_type, 0);
            setType(i != 0 ? i != 1 ? i != 2 ? getType() : Type.BOTTOM : Type.TOP : Type.BOTH);
            setDividerHeight(obtainStyledAttributes.getDimensionPixelSize(c4i0.CardDivider_divider_height, getDividerHeight()));
            setUpdateMargins(obtainStyledAttributes.getBoolean(c4i0.CardDivider_update_margins, getUpdateMargins()));
            setDrawOutSize(obtainStyledAttributes.getBoolean(c4i0.CardDivider_draw_outsize, getDrawOutSize()));
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final boolean getBottomRounded() {
        int i = a.a[getType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                w511.b();
                return false;
            }
        }
        return this.dividerRadius > 0;
    }

    private final boolean getTopRounded() {
        int i = a.a[getType().ordinal()];
        if (i == 1 || i == 2) {
            return this.dividerRadius > 0;
        }
        if (i == 3) {
            return false;
        }
        w511.b();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshDividerSize() {
        calculatePath();
        requestLayout();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshPaintColor() {
        this.paint.setColor(s8o.m(getColor(), getContext()));
        invalidate();
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        refreshPaintColor();
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final kdc getColor() {
        return (kdc) this.color.getValue(this, $$delegatedProperties[0]);
    }

    public final int getDividerHeight() {
        return ((Number) this.dividerHeight.getValue(this, $$delegatedProperties[1])).intValue();
    }

    public final boolean getDrawOutSize() {
        return ((Boolean) this.drawOutSize.getValue(this, $$delegatedProperties[4])).booleanValue();
    }

    public final Type getType() {
        return (Type) this.type.getValue(this, $$delegatedProperties[2]);
    }

    public final boolean getUpdateMargins() {
        return ((Boolean) this.updateMargins.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.drawPath(this.dividerPath, this.paint);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);
        int i = 0;
        int dividerHeight = getDividerHeight() + ((!getTopRounded() || getDrawOutSize()) ? 0 : this.dividerRadius);
        if (getBottomRounded() && !getDrawOutSize()) {
            i = this.dividerRadius;
        }
        setMeasuredDimension(defaultSize, View.resolveSize(dividerHeight + i, heightMeasureSpec));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        calculatePath();
    }

    public final void setColor(kdc kdcVar) {
        this.color.setValue(this, $$delegatedProperties[0], kdcVar);
    }

    public final void setDividerHeight(int i) {
        this.dividerHeight.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    public final void setDrawOutSize(boolean z) {
        this.drawOutSize.setValue(this, $$delegatedProperties[4], Boolean.valueOf(z));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams params) {
        if ((params instanceof ViewGroup.MarginLayoutParams) && getUpdateMargins()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) params;
            int i = 0;
            marginLayoutParams.topMargin = (!getTopRounded() || getDrawOutSize()) ? 0 : -this.dividerRadius;
            if (getBottomRounded() && !getDrawOutSize()) {
                i = -this.dividerRadius;
            }
            marginLayoutParams.bottomMargin = i;
        }
        super.setLayoutParams(params);
    }

    public final void setType(Type type) {
        this.type.setValue(this, $$delegatedProperties[2], type);
    }

    public final void setUpdateMargins(boolean z) {
        this.updateMargins.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z));
    }

    public CardDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CardDivider(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ CardDivider(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
