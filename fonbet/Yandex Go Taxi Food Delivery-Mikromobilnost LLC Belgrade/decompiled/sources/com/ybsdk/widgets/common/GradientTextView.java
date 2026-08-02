package com.ybsdk.widgets.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.k4o;
import defpackage.t3i0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/ybsdk/widgets/common/GradientTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "w", "h", "", "calculateGradientPositions", "(FF)[F", "oldw", "oldh", "Lzy11;", "onSizeChanged", "(IIII)V", "", "gradientColors", "[I", "Lcom/ybsdk/widgets/common/GradientTextView$Direction;", "gradientDirection", "Lcom/ybsdk/widgets/common/GradientTextView$Direction;", "gradientAngle", CA20Status.STATUS_USER_I, "Direction", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GradientTextView extends AppCompatTextView {
    private int gradientAngle;
    private int[] gradientColors;
    private Direction gradientDirection;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/widgets/common/GradientTextView$Direction;", "", "angle", "", "<init>", "(Ljava/lang/String;IF)V", "getAngle", "()F", "LEFT", "TOP", "RIGHT", "BOTTOM", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Direction {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        private final float angle;
        public static final Direction LEFT = new Direction("LEFT", 0, 0.0f);
        public static final Direction TOP = new Direction("TOP", 1, 90.0f);
        public static final Direction RIGHT = new Direction("RIGHT", 2, 180.0f);
        public static final Direction BOTTOM = new Direction("BOTTOM", 3, 270.0f);

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{LEFT, TOP, RIGHT, BOTTOM};
        }

        static {
            Direction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private Direction(String str, int i, float f) {
            this.angle = f;
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }

        public final float getAngle() {
            return this.angle;
        }
    }

    public GradientTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.gradientDirection = Direction.LEFT;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t3i0.YbSdkGradientTextView, i, 0);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(t3i0.YbSdkGradientTextView_ybsdk_gradientColors, 0);
            if (resourceId != 0) {
                this.gradientColors = getResources().getIntArray(resourceId);
            }
            if (obtainStyledAttributes.hasValue(t3i0.YbSdkGradientTextView_ybsdk_gradientDirection)) {
                this.gradientDirection = Direction.values()[obtainStyledAttributes.getInt(t3i0.YbSdkGradientTextView_ybsdk_gradientDirection, 0)];
            }
            if (obtainStyledAttributes.hasValue(t3i0.YbSdkGradientTextView_ybsdk_gradientAngle)) {
                this.gradientAngle = obtainStyledAttributes.getInt(t3i0.YbSdkGradientTextView_ybsdk_gradientAngle, 0);
            }
            obtainStyledAttributes.recycle();
        } catch (Exception unused) {
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final float[] calculateGradientPositions(float w, float h) {
        Direction direction = this.gradientDirection;
        int i = direction == null ? -1 : f.a[direction.ordinal()];
        if (i == 1) {
            return new float[]{0.0f, h, 0.0f, 0.0f};
        }
        if (i == 2) {
            return new float[]{0.0f, 0.0f, w, 0.0f};
        }
        if (i == 3) {
            return new float[]{0.0f, 0.0f, 0.0f, h};
        }
        if (i == 4) {
            return new float[]{w, 0.0f, 0.0f, 0.0f};
        }
        Direction direction2 = this.gradientDirection;
        String obj = direction2 != null ? direction2.toString() : null;
        if (obj == null) {
            obj = "";
        }
        throw new IllegalStateException("Unknown gradientDirection=".concat(obj));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        int[] iArr = this.gradientColors;
        if (iArr != null) {
            float[] calculateGradientPositions = calculateGradientPositions(w, h);
            getPaint().setShader(new LinearGradient(calculateGradientPositions[0], calculateGradientPositions[1], calculateGradientPositions[2], calculateGradientPositions[3], iArr, (float[]) null, Shader.TileMode.CLAMP));
        }
    }

    public GradientTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GradientTextView(Context context) {
        this(context, null, 0);
    }
}
