package com.yandex.div.internal.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.hardware.common.CarZone;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.lhg;
import xsna.zcl;

/* compiled from: DivViewGroup.kt */
/* loaded from: classes7.dex */
public abstract class DivViewGroup extends ViewGroup {
    public static final Companion Companion = new Companion(null);
    private int gravity;

    /* compiled from: DivViewGroup.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
        
            if (r12 == Integer.MAX_VALUE) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        
            r10 = r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            r10 = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
        
            if (r12 == Integer.MAX_VALUE) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        
            if (r12 == Integer.MAX_VALUE) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int getChildMeasureSpec(int i, int i2, int i3, int i4, int i5) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i) - i2;
            int i6 = 0;
            int max = Math.max(0, size);
            if (mode == Integer.MIN_VALUE) {
                if (i3 < 0 || i3 > Integer.MAX_VALUE) {
                    if (i3 == -1) {
                        i3 = Math.min(Math.max(max, i4), i5);
                    } else if (i3 != -2) {
                        if (i3 == -3) {
                            i3 = Math.min(Math.max(max, i4), i5);
                        }
                        i3 = 0;
                    }
                    i6 = Integer.MIN_VALUE;
                }
                i6 = 1073741824;
            } else if (mode != 0) {
                if (mode == 1073741824) {
                    if (i3 < 0 || i3 > Integer.MAX_VALUE) {
                        if (i3 == -1) {
                            i3 = Math.min(Math.max(max, i4), i5);
                        } else if (i3 != -2) {
                            if (i3 == -3) {
                                i3 = Math.min(Math.max(max, i4), i5);
                                i6 = Integer.MIN_VALUE;
                            }
                        }
                    }
                    i6 = 1073741824;
                }
                i3 = 0;
            } else {
                if (i3 < 0) {
                }
                i6 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(i3, i6);
        }

        public final float getSpaceAroundPart$div_release(float f, int i) {
            return f / (i * 2);
        }

        public final float getSpaceBetweenPart$div_release(float f, int i) {
            return i == 1 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : f / (i - 1);
        }

        public final float getSpaceEvenlyPart$div_release(float f, int i) {
            return f / (i + 1);
        }

        @SuppressLint({"WrongConstant"})
        public final int toHorizontalGravity(int i) {
            return i & 125829127;
        }

        @SuppressLint({"WrongConstant"})
        public final int toVerticalGravity(int i) {
            return i & 1879048304;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DivViewGroup(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void baseMeasureChild(View view, int i, int i2) {
        super.measureChild(view, i, i2);
    }

    public final void baseMeasureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof DivLayoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DivLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new DivLayoutParams(getContext(), attributeSet);
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getHorizontalGravity$div_release() {
        return Companion.toHorizontalGravity(this.gravity);
    }

    public final int getHorizontalPaddings$div_release() {
        return getPaddingRight() + getPaddingLeft();
    }

    public final int getVerticalGravity$div_release() {
        return Companion.toVerticalGravity(this.gravity);
    }

    public final int getVerticalPaddings$div_release() {
        return getPaddingBottom() + getPaddingTop();
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        Companion companion = Companion;
        view.measure(companion.getChildMeasureSpec(i, getHorizontalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view.getMinimumWidth(), divLayoutParams.getMaxWidth()), companion.getChildMeasureSpec(i2, getVerticalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view.getMinimumHeight(), divLayoutParams.getMaxHeight()));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        Companion companion = Companion;
        view.measure(companion.getChildMeasureSpec(i, divLayoutParams.getHorizontalMargins$div_release() + getHorizontalPaddings$div_release() + i2, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view.getMinimumWidth(), divLayoutParams.getMaxWidth()), companion.getChildMeasureSpec(i3, divLayoutParams.getVerticalMargins$div_release() + getVerticalPaddings$div_release() + i4, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view.getMinimumHeight(), divLayoutParams.getMaxHeight()));
    }

    public final void setGravity(int i) {
        if (this.gravity == i) {
            return;
        }
        Companion companion = Companion;
        if (companion.toHorizontalGravity(i) == 0) {
            i |= 8388611;
        }
        if (companion.toVerticalGravity(i) == 0) {
            i |= 48;
        }
        this.gravity = i;
        requestLayout();
    }

    public DivViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.gravity = 8388659;
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof DivLayoutParams ? new DivLayoutParams((DivLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new DivLayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new DivLayoutParams(layoutParams);
    }

    /* compiled from: DivViewGroup.kt */
    public final class OffsetsHolder {
        private int edgeDividerOffset;
        private float firstChildOffset;
        private float spaceBetweenChildren;

        public OffsetsHolder(float f, float f2, int i) {
            this.firstChildOffset = f;
            this.spaceBetweenChildren = f2;
            this.edgeDividerOffset = i;
        }

        public final int getEdgeDividerOffset() {
            return this.edgeDividerOffset;
        }

        public final float getFirstChildOffset() {
            return this.firstChildOffset;
        }

        public final float getSpaceBetweenChildren() {
            return this.spaceBetweenChildren;
        }

        public final void update(float f, int i, int i2) {
            this.firstChildOffset = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.spaceBetweenChildren = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.edgeDividerOffset = 0;
            switch (i) {
                case 1:
                case 16:
                    this.firstChildOffset = f / 2;
                    return;
                case 3:
                case 48:
                    return;
                case 5:
                case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                    this.firstChildOffset = f;
                    return;
                case C.DEFAULT_MUXED_BUFFER_SIZE /* 16777216 */:
                case 268435456:
                    float spaceAroundPart$div_release = DivViewGroup.Companion.getSpaceAroundPart$div_release(f, i2);
                    this.firstChildOffset = spaceAroundPart$div_release;
                    float f2 = 2;
                    this.spaceBetweenChildren = spaceAroundPart$div_release * f2;
                    this.edgeDividerOffset = (int) (spaceAroundPart$div_release / f2);
                    return;
                case 33554432:
                case SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING /* 536870912 */:
                    this.spaceBetweenChildren = DivViewGroup.Companion.getSpaceBetweenPart$div_release(f, i2);
                    return;
                case 67108864:
                case 1073741824:
                    float spaceEvenlyPart$div_release = DivViewGroup.Companion.getSpaceEvenlyPart$div_release(f, i2);
                    this.firstChildOffset = spaceEvenlyPart$div_release;
                    this.spaceBetweenChildren = spaceEvenlyPart$div_release;
                    this.edgeDividerOffset = (int) (spaceEvenlyPart$div_release / 2);
                    return;
                default:
                    throw new IllegalStateException(lhg.a(i, "Invalid gravity is set: "));
            }
        }

        public /* synthetic */ OffsetsHolder(DivViewGroup divViewGroup, float f, float f2, int i, int i2, zcl zclVar) {
            this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 0 : i);
        }
    }

    public static /* synthetic */ void getGravity$annotations() {
    }
}
