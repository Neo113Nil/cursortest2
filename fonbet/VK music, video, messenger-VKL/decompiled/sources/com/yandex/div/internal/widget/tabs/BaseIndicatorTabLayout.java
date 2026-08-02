package com.yandex.div.internal.widget.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.R$dimen;
import com.yandex.div.R$id;
import com.yandex.div.R$style;
import com.yandex.div.R$styleable;
import com.yandex.div.core.font.DivTypefaceProvider;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.internal.Log;
import com.yandex.div.internal.util.NestedHorizontalScrollCompanion;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;
import com.yandex.div.internal.widget.tabs.TabView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.ilq;
import xsna.iut0;
import xsna.svb0;
import xsna.tvb0;
import xsna.ve6;
import xsna.vvb0;

/* loaded from: classes7.dex */
public class BaseIndicatorTabLayout extends HorizontalScrollView {
    private static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new ilq();
    private static final svb0<Tab> sTabPool = new vvb0(16);
    private long mAnimationDuration;
    private int mContentInsetEnd;
    private int mContentInsetStart;

    @Nullable
    private InputFocusTracker mInputFocusTracker;
    private final boolean mIsTabEllipsizeEnabled;
    private int mMode;
    private final NestedHorizontalScrollCompanion mNestedScrollCompanion;
    private OnTabSelectedListener mOnTabSelectedListener;
    private TabLayoutOnPageChangeListener mPageChangeListener;
    private PagerAdapter mPagerAdapter;
    private DataSetObserver mPagerAdapterObserver;
    private final int mRequestedTabMaxWidth;
    private final int mRequestedTabMinWidth;
    private ValueAnimator mScrollAnimator;
    private final int mScrollableTabMinWidth;
    private Tab mSelectedTab;
    private final OvalIndicators mTabIndicators;
    private int mTabMaxWidth;
    private int mTabPaddingBottom;
    private int mTabPaddingEnd;
    private int mTabPaddingStart;
    private int mTabPaddingTop;
    private final int mTabScrollPadding;
    private final boolean mTabScrollPaddingEnabled;
    private int mTabTextAppearance;
    private boolean mTabTextBoldOnSelection;
    private ColorStateList mTabTextColors;
    private final TabTitleDelimitersController mTabTitleDelimitersController;

    @NonNull
    private final svb0<TabView> mTabViewPool;
    private final ArrayList<Tab> mTabs;
    private DivTypefaceProvider mTypefaceProvider;
    private ViewPager mViewPager;

    /* renamed from: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$yandex$div$internal$widget$tabs$BaseIndicatorTabLayout$AnimationType;

        static {
            int[] iArr = new int[AnimationType.values().length];
            $SwitchMap$com$yandex$div$internal$widget$tabs$BaseIndicatorTabLayout$AnimationType = iArr;
            try {
                iArr[AnimationType.FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$yandex$div$internal$widget$tabs$BaseIndicatorTabLayout$AnimationType[AnimationType.SLIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum AnimationType {
        SLIDE,
        FADE,
        NONE
    }

    public interface OnTabSelectedListener {
        void onTabReselected(Tab tab);

        void onTabSelected(Tab tab);

        void onTabUnselected(Tab tab);
    }

    public static class OvalIndicators extends LinearLayout {
        private AnimationType mAnimationType;
        private final Path mClipPath;
        protected float[] mCornerRadii;
        private int mFutureSelectedPosition;
        private boolean mHasDelimiters;
        protected int mIndicatorHeight;
        private final Paint mIndicatorPaint;
        private final RectF mIndicatorRect;
        protected int[] mIndicatorsLeft;
        protected int[] mIndicatorsRight;
        protected int mItemSpacing;
        protected float mOffset;
        private float mOpacity;
        private final int mPaddingBottom;
        private final int mPaddingTop;
        protected int mSelectedColor;
        protected ValueAnimator mSelectedIndicatorAnimator;
        protected int mSelectedIndicatorLeft;
        protected int mSelectedIndicatorRight;
        protected int mSelectedPosition;
        private int mSize;
        protected int mUnselectedColor;

        public /* synthetic */ OvalIndicators(Context context, int i, int i2, AnonymousClass1 anonymousClass1) {
            this(context, i, i2);
        }

        private static float clampCornerRadius(float f, float f2, float f3) {
            if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            float min = Math.min(f3, f2) / 2.0f;
            if (f == -1.0f) {
                return min;
            }
            if (f > min) {
                Log.e("BaseIndicatorTabLayout", "Corner radius is too big");
            }
            return Math.min(f, min);
        }

        private void drawRoundRect(Canvas canvas, int i, int i2, float f, int i3, float f2) {
            if (i < 0 || i2 <= i) {
                return;
            }
            this.mIndicatorRect.set(i, this.mPaddingTop, i2, f - this.mPaddingBottom);
            float width = this.mIndicatorRect.width();
            float height = this.mIndicatorRect.height();
            float[] fArr = new float[8];
            for (int i4 = 0; i4 < 8; i4++) {
                fArr[i4] = clampCornerRadius(this.mCornerRadii[i4], width, height);
            }
            this.mClipPath.reset();
            this.mClipPath.addRoundRect(this.mIndicatorRect, fArr, Path.Direction.CW);
            this.mClipPath.close();
            this.mIndicatorPaint.setColor(i3);
            this.mIndicatorPaint.setAlpha(Math.round(this.mIndicatorPaint.getAlpha() * f2));
            canvas.drawPath(this.mClipPath, this.mIndicatorPaint);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getTabPositionInLayout(int i) {
            return (!this.mHasDelimiters || i == -1) ? i : i * 2;
        }

        private void initIndicatorArrays(int i) {
            this.mSize = i;
            this.mIndicatorsLeft = new int[i];
            this.mIndicatorsRight = new int[i];
            for (int i2 = 0; i2 < this.mSize; i2++) {
                this.mIndicatorsLeft[i2] = -1;
                this.mIndicatorsRight[i2] = -1;
            }
        }

        private static boolean isTransparentColor(int i) {
            return (i >> 24) == 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$startSelectedIndicatorFadeAnimation$1(ValueAnimator valueAnimator) {
            this.mOpacity = 1.0f - valueAnimator.getAnimatedFraction();
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            postInvalidateOnAnimation();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void lambda$startSelectedIndicatorSlideAnimation$0(int i, int i2, int i3, int i4, ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            setSelectedIndicatorPosition(lerp(i, i2, animatedFraction), lerp(i3, i4, animatedFraction));
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            postInvalidateOnAnimation();
        }

        private static int lerp(int i, int i2, float f) {
            return Math.round(f * (i2 - i)) + i;
        }

        private ViewGroup.MarginLayoutParams setLeftMargin(ViewGroup.LayoutParams layoutParams, int i) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = i;
            return marginLayoutParams;
        }

        @Override // android.view.ViewGroup
        public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
            int childCount = getChildCount();
            if (i < 0) {
                i = childCount;
            }
            if (i != 0) {
                super.addView(view, i, setLeftMargin(layoutParams, this.mItemSpacing));
                return;
            }
            if (childCount != 0) {
                View childAt = getChildAt(0);
                updateViewLayout(childAt, setLeftMargin(childAt.getLayoutParams(), this.mItemSpacing));
            }
            super.addView(view, i, setLeftMargin(layoutParams, 0));
        }

        public void animateSelectedIndicatorToPosition(int i, long j) {
            ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mSelectedIndicatorAnimator.cancel();
                j = Math.round((1.0f - this.mSelectedIndicatorAnimator.getAnimatedFraction()) * this.mSelectedIndicatorAnimator.getDuration());
            }
            long j2 = j;
            View tab = getTab(i);
            if (tab == null) {
                updateIndicatorsPosition();
                return;
            }
            int i2 = AnonymousClass1.$SwitchMap$com$yandex$div$internal$widget$tabs$BaseIndicatorTabLayout$AnimationType[this.mAnimationType.ordinal()];
            if (i2 == 1) {
                startSelectedIndicatorFadeAnimation(i, j2);
            } else if (i2 != 2) {
                setSelectedIndicatorPositionFromTabPosition(i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                startSelectedIndicatorSlideAnimation(i, j2, this.mSelectedIndicatorLeft, this.mSelectedIndicatorRight, tab.getLeft(), tab.getRight());
            }
        }

        public boolean childrenNeedLayout() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            float height = getHeight();
            if (this.mUnselectedColor != -1) {
                int i = this.mSize;
                for (int i2 = 0; i2 < i; i2++) {
                    drawRoundRect(canvas, this.mIndicatorsLeft[i2], this.mIndicatorsRight[i2], height, this.mUnselectedColor, 1.0f);
                }
            }
            if (this.mSelectedColor != -1) {
                int tabPositionInLayout = getTabPositionInLayout(this.mSelectedPosition);
                int tabPositionInLayout2 = getTabPositionInLayout(this.mFutureSelectedPosition);
                int i3 = AnonymousClass1.$SwitchMap$com$yandex$div$internal$widget$tabs$BaseIndicatorTabLayout$AnimationType[this.mAnimationType.ordinal()];
                if (i3 == 1) {
                    drawRoundRect(canvas, this.mIndicatorsLeft[tabPositionInLayout], this.mIndicatorsRight[tabPositionInLayout], height, this.mSelectedColor, this.mOpacity);
                    if (this.mFutureSelectedPosition != -1) {
                        drawRoundRect(canvas, this.mIndicatorsLeft[tabPositionInLayout2], this.mIndicatorsRight[tabPositionInLayout2], height, this.mSelectedColor, 1.0f - this.mOpacity);
                    }
                } else if (i3 != 2) {
                    drawRoundRect(canvas, this.mIndicatorsLeft[tabPositionInLayout], this.mIndicatorsRight[tabPositionInLayout], height, this.mSelectedColor, 1.0f);
                } else {
                    drawRoundRect(canvas, this.mSelectedIndicatorLeft, this.mSelectedIndicatorRight, height, this.mSelectedColor, 1.0f);
                }
            }
            super.draw(canvas);
        }

        public View getTab(int i) {
            return getChildAt(getTabPositionInLayout(i));
        }

        public boolean hasDelimiters() {
            return this.mHasDelimiters;
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            updateIndicatorsPosition();
            ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                return;
            }
            this.mSelectedIndicatorAnimator.cancel();
            animateSelectedIndicatorToPosition(this.mFutureSelectedPosition, Math.round((1.0f - this.mSelectedIndicatorAnimator.getAnimatedFraction()) * this.mSelectedIndicatorAnimator.getDuration()));
        }

        public void setAnimationType(AnimationType animationType) {
            if (this.mAnimationType != animationType) {
                this.mAnimationType = animationType;
                ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.mSelectedIndicatorAnimator.cancel();
            }
        }

        public void setContainsDelimiters(boolean z) {
            if (this.mHasDelimiters != z) {
                this.mHasDelimiters = z;
                updateOpacity();
                updateIndicatorsPosition();
            }
        }

        public void setIndicatorColor(int i) {
            if (this.mUnselectedColor != i) {
                if (isTransparentColor(i)) {
                    this.mUnselectedColor = -1;
                } else {
                    this.mUnselectedColor = i;
                }
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                postInvalidateOnAnimation();
            }
        }

        public void setIndicatorCornersRadii(@NonNull float[] fArr) {
            if (Arrays.equals(this.mCornerRadii, fArr)) {
                return;
            }
            this.mCornerRadii = fArr;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            postInvalidateOnAnimation();
        }

        public void setIndicatorHeight(int i) {
            if (this.mIndicatorHeight != i) {
                this.mIndicatorHeight = i;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                postInvalidateOnAnimation();
            }
        }

        public void setItemSpacing(int i) {
            if (i != this.mItemSpacing) {
                this.mItemSpacing = i;
                int childCount = getChildCount();
                for (int i2 = 1; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    updateViewLayout(childAt, setLeftMargin(childAt.getLayoutParams(), this.mItemSpacing));
                }
            }
        }

        public void setSelectedIndicatorColor(int i) {
            if (this.mSelectedColor != i) {
                if (isTransparentColor(i)) {
                    this.mSelectedColor = -1;
                } else {
                    this.mSelectedColor = i;
                }
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                postInvalidateOnAnimation();
            }
        }

        public void setSelectedIndicatorPosition(int i, int i2) {
            if (i == this.mSelectedIndicatorLeft && i2 == this.mSelectedIndicatorRight) {
                return;
            }
            this.mSelectedIndicatorLeft = i;
            this.mSelectedIndicatorRight = i2;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            postInvalidateOnAnimation();
        }

        public void setSelectedIndicatorPositionFromTabPosition(int i, float f) {
            ValueAnimator valueAnimator = this.mSelectedIndicatorAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.mSelectedIndicatorAnimator.cancel();
            }
            this.mSelectedPosition = i;
            this.mOffset = f;
            updateIndicatorsPosition();
            updateOpacity();
        }

        public void setUnselectedIndicatorPosition(int i, int i2, int i3) {
            int[] iArr = this.mIndicatorsLeft;
            int i4 = iArr[i];
            int[] iArr2 = this.mIndicatorsRight;
            int i5 = iArr2[i];
            if (i2 == i4 && i3 == i5) {
                return;
            }
            iArr[i] = i2;
            iArr2[i] = i3;
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            postInvalidateOnAnimation();
        }

        public void startSelectedIndicatorFadeAnimation(int i, long j) {
            if (i != this.mSelectedPosition) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.setInterpolator(BaseIndicatorTabLayout.FAST_OUT_SLOW_IN_INTERPOLATOR);
                ofFloat.setDuration(j);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.tabs.e
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        BaseIndicatorTabLayout.OvalIndicators.this.lambda$startSelectedIndicatorFadeAnimation$1(valueAnimator);
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OvalIndicators.2
                    private boolean mHasCancel = false;

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                        this.mHasCancel = true;
                        OvalIndicators.this.mOpacity = 1.0f;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        if (this.mHasCancel) {
                            return;
                        }
                        OvalIndicators ovalIndicators = OvalIndicators.this;
                        ovalIndicators.mSelectedPosition = ovalIndicators.mFutureSelectedPosition;
                        OvalIndicators.this.mOffset = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    }
                });
                this.mFutureSelectedPosition = i;
                this.mSelectedIndicatorAnimator = ofFloat;
                ofFloat.start();
            }
        }

        public void startSelectedIndicatorSlideAnimation(int i, long j, final int i2, final int i3, final int i4, final int i5) {
            if (i2 == i4 && i3 == i5) {
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
            ofFloat.setInterpolator(BaseIndicatorTabLayout.FAST_OUT_SLOW_IN_INTERPOLATOR);
            ofFloat.setDuration(j);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.yandex.div.internal.widget.tabs.d
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BaseIndicatorTabLayout.OvalIndicators.this.lambda$startSelectedIndicatorSlideAnimation$0(i2, i4, i3, i5, valueAnimator);
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OvalIndicators.1
                private boolean mHasCancel = false;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    this.mHasCancel = true;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    if (this.mHasCancel) {
                        return;
                    }
                    OvalIndicators ovalIndicators = OvalIndicators.this;
                    ovalIndicators.mSelectedPosition = ovalIndicators.mFutureSelectedPosition;
                    OvalIndicators.this.mOffset = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
            });
            this.mFutureSelectedPosition = i;
            this.mSelectedIndicatorAnimator = ofFloat;
            ofFloat.start();
        }

        public void updateIndicatorsPosition() {
            int i;
            int i2;
            int i3;
            int i4;
            int childCount = getChildCount();
            if (childCount != this.mSize) {
                initIndicatorArrays(childCount);
            }
            int tabPositionInLayout = getTabPositionInLayout(this.mSelectedPosition);
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt instanceof TabView) {
                    if (childAt.getWidth() > 0) {
                        int left = childAt.getLeft();
                        i2 = childAt.getRight();
                        if (this.mAnimationType != AnimationType.SLIDE || i5 != tabPositionInLayout || this.mOffset <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || i5 >= childCount - 1) {
                            i3 = left;
                            i4 = i3;
                            i = i2;
                        } else {
                            View childAt2 = getChildAt(this.mHasDelimiters ? i5 + 2 : i5 + 1);
                            float left2 = this.mOffset * childAt2.getLeft();
                            float f = this.mOffset;
                            i4 = (int) (((1.0f - f) * left) + left2);
                            int right = (int) (((1.0f - this.mOffset) * i2) + (f * childAt2.getRight()));
                            i3 = left;
                            i = right;
                        }
                    } else {
                        i = -1;
                        i2 = -1;
                        i3 = -1;
                        i4 = -1;
                    }
                    setUnselectedIndicatorPosition(i5, i3, i2);
                    if (i5 == tabPositionInLayout) {
                        setSelectedIndicatorPosition(i4, i);
                    }
                }
            }
        }

        public void updateOpacity() {
            float f = 1.0f - this.mOffset;
            if (f != this.mOpacity) {
                this.mOpacity = f;
                int i = this.mSelectedPosition + 1;
                if (i >= this.mSize) {
                    i = -1;
                }
                this.mFutureSelectedPosition = i;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                postInvalidateOnAnimation();
            }
        }

        private OvalIndicators(Context context, int i, int i2) {
            super(context);
            this.mSelectedColor = -1;
            this.mUnselectedColor = -1;
            this.mSelectedPosition = -1;
            this.mItemSpacing = 0;
            this.mSelectedIndicatorLeft = -1;
            this.mSelectedIndicatorRight = -1;
            this.mOpacity = 1.0f;
            this.mFutureSelectedPosition = -1;
            this.mAnimationType = AnimationType.SLIDE;
            setId(R$id.tab_sliding_oval_indicator);
            setWillNotDraw(false);
            int childCount = getChildCount();
            this.mSize = childCount;
            if (this.mHasDelimiters) {
                this.mSize = (childCount + 1) / 2;
            }
            initIndicatorArrays(this.mSize);
            Paint paint = new Paint();
            this.mIndicatorPaint = paint;
            paint.setAntiAlias(true);
            this.mIndicatorRect = new RectF();
            this.mPaddingTop = i;
            this.mPaddingBottom = i2;
            this.mClipPath = new Path();
            this.mCornerRadii = new float[8];
        }
    }

    public class PagerAdapterObserver extends DataSetObserver {
        private PagerAdapterObserver() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            BaseIndicatorTabLayout.this.populateFromPagerAdapter();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            BaseIndicatorTabLayout.this.populateFromPagerAdapter();
        }

        public /* synthetic */ PagerAdapterObserver(BaseIndicatorTabLayout baseIndicatorTabLayout, AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static final class Tab {
        private BaseIndicatorTabLayout mParent;
        private int mPosition;

        @Nullable
        private CharSequence mText;
        private TabView mView;

        public /* synthetic */ Tab(AnonymousClass1 anonymousClass1) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reset() {
            this.mParent = null;
            this.mView = null;
            this.mText = null;
            this.mPosition = -1;
        }

        private void updateView() {
            TabView tabView = this.mView;
            if (tabView != null) {
                tabView.update();
            }
        }

        public int getPosition() {
            return this.mPosition;
        }

        @Nullable
        public TabView getTabView() {
            return this.mView;
        }

        @Nullable
        public CharSequence getText() {
            return this.mText;
        }

        public void select() {
            BaseIndicatorTabLayout baseIndicatorTabLayout = this.mParent;
            if (baseIndicatorTabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            baseIndicatorTabLayout.selectTab(this);
        }

        public void setPosition(int i) {
            this.mPosition = i;
        }

        @NonNull
        public Tab setText(@Nullable CharSequence charSequence) {
            this.mText = charSequence;
            updateView();
            return this;
        }

        private Tab() {
            this.mPosition = -1;
        }
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.j {
        private int mPreviousScrollState;
        private int mScrollState;
        private final WeakReference<BaseIndicatorTabLayout> mTabLayoutRef;

        public TabLayoutOnPageChangeListener(BaseIndicatorTabLayout baseIndicatorTabLayout) {
            this.mTabLayoutRef = new WeakReference<>(baseIndicatorTabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i) {
            this.mPreviousScrollState = this.mScrollState;
            this.mScrollState = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i, float f, int i2) {
            BaseIndicatorTabLayout baseIndicatorTabLayout = this.mTabLayoutRef.get();
            if (baseIndicatorTabLayout != null) {
                if (this.mScrollState != 2 || this.mPreviousScrollState == 1) {
                    baseIndicatorTabLayout.setScrollPosition(i, f, true, true);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i) {
            BaseIndicatorTabLayout baseIndicatorTabLayout = this.mTabLayoutRef.get();
            if (baseIndicatorTabLayout == null || baseIndicatorTabLayout.getSelectedTabPosition() == i) {
                return;
            }
            int i2 = this.mScrollState;
            baseIndicatorTabLayout.selectTab(baseIndicatorTabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.mPreviousScrollState == 0));
        }

        public void reset() {
            this.mScrollState = 0;
            this.mPreviousScrollState = 0;
        }
    }

    @SuppressLint({"PrivateResource"})
    public BaseIndicatorTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTabs = new ArrayList<>();
        this.mAnimationDuration = 300L;
        this.mTypefaceProvider = DivTypefaceProvider.DEFAULT;
        this.mTabMaxWidth = Integer.MAX_VALUE;
        this.mNestedScrollCompanion = new NestedHorizontalScrollCompanion(this);
        this.mTabViewPool = new tvb0(12);
        setHorizontalScrollBarEnabled(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TabLayout, i, R$style.Div_Tabs_IndicatorTabLayout);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.BaseIndicatorTabLayout, 0, 0);
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(R$styleable.BaseIndicatorTabLayout_tabIndicatorPaddingTop, 0);
        int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(R$styleable.BaseIndicatorTabLayout_tabIndicatorPaddingBottom, 0);
        this.mTabTextBoldOnSelection = obtainStyledAttributes2.getBoolean(R$styleable.BaseIndicatorTabLayout_tabTextBoldOnSelection, false);
        this.mContentInsetEnd = obtainStyledAttributes2.getDimensionPixelSize(R$styleable.BaseIndicatorTabLayout_tabContentEnd, 0);
        this.mIsTabEllipsizeEnabled = obtainStyledAttributes2.getBoolean(R$styleable.BaseIndicatorTabLayout_tabEllipsizeEnabled, true);
        this.mTabScrollPaddingEnabled = obtainStyledAttributes2.getBoolean(R$styleable.BaseIndicatorTabLayout_tabScrollPaddingEnabled, false);
        this.mTabScrollPadding = obtainStyledAttributes2.getDimensionPixelSize(R$styleable.BaseIndicatorTabLayout_tabScrollPadding, 0);
        obtainStyledAttributes2.recycle();
        OvalIndicators ovalIndicators = new OvalIndicators(context, dimensionPixelSize, dimensionPixelSize2, null);
        this.mTabIndicators = ovalIndicators;
        super.addView(ovalIndicators, 0, new FrameLayout.LayoutParams(-2, -1));
        ovalIndicators.setIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabIndicatorHeight, 0));
        ovalIndicators.setSelectedIndicatorColor(obtainStyledAttributes.getColor(R$styleable.TabLayout_tabIndicatorColor, 0));
        ovalIndicators.setIndicatorColor(obtainStyledAttributes.getColor(R$styleable.TabLayout_tabBackground, 0));
        this.mTabTitleDelimitersController = new TabTitleDelimitersController(getContext(), ovalIndicators);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPadding, 0);
        this.mTabPaddingBottom = dimensionPixelSize3;
        this.mTabPaddingEnd = dimensionPixelSize3;
        this.mTabPaddingTop = dimensionPixelSize3;
        this.mTabPaddingStart = dimensionPixelSize3;
        this.mTabPaddingStart = obtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingStart, dimensionPixelSize3);
        this.mTabPaddingTop = obtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingTop, this.mTabPaddingTop);
        this.mTabPaddingEnd = obtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingEnd, this.mTabPaddingEnd);
        this.mTabPaddingBottom = obtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingBottom, this.mTabPaddingBottom);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.TabLayout_tabTextAppearance, R$style.Div_Tabs_IndicatorTabLayout_Text);
        this.mTabTextAppearance = resourceId;
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(resourceId, androidx.appcompat.R$styleable.w);
        try {
            this.mTabTextColors = obtainStyledAttributes3.getColorStateList(3);
            obtainStyledAttributes3.recycle();
            if (obtainStyledAttributes.hasValue(R$styleable.TabLayout_tabTextColor)) {
                this.mTabTextColors = obtainStyledAttributes.getColorStateList(R$styleable.TabLayout_tabTextColor);
            }
            if (obtainStyledAttributes.hasValue(R$styleable.TabLayout_tabSelectedTextColor)) {
                this.mTabTextColors = createColorStateList(this.mTabTextColors.getDefaultColor(), obtainStyledAttributes.getColor(R$styleable.TabLayout_tabSelectedTextColor, 0));
            }
            this.mRequestedTabMinWidth = obtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabMinWidth, -1);
            this.mRequestedTabMaxWidth = obtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabMaxWidth, -1);
            this.mContentInsetStart = obtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabContentStart, 0);
            this.mMode = obtainStyledAttributes.getInt(R$styleable.TabLayout_tabMode, 1);
            obtainStyledAttributes.recycle();
            this.mScrollableTabMinWidth = getResources().getDimensionPixelSize(R$dimen.tab_scrollable_min_width);
            applyModeAndGravity();
        } catch (Throwable th) {
            obtainStyledAttributes3.recycle();
            throw th;
        }
    }

    private void addTabFromItemView(@NonNull TabItem tabItem) {
        Tab newTab = newTab();
        CharSequence charSequence = tabItem.text;
        if (charSequence != null) {
            newTab.setText(charSequence);
        }
        addTab(newTab);
    }

    private void addTabView(Tab tab, boolean z) {
        TabView tabView = tab.mView;
        this.mTabIndicators.addView(tabView, createLayoutParamsForTabs());
        this.mTabTitleDelimitersController.tabAdded(this.mTabIndicators.getChildCount() - 1);
        if (z) {
            tabView.setSelected(true);
        }
    }

    private void addViewInternal(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        addTabFromItemView((TabItem) view);
    }

    private void animateToTab(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() == null || !ViewsKt.isActuallyLaidOut(this) || this.mTabIndicators.childrenNeedLayout()) {
            setScrollPosition(i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
            return;
        }
        int scrollX = getScrollX();
        int calculateScrollXForTab = calculateScrollXForTab(i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        if (scrollX != calculateScrollXForTab) {
            if (this.mScrollAnimator == null) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[0]);
                this.mScrollAnimator = ofInt;
                ofInt.setInterpolator(FAST_OUT_SLOW_IN_INTERPOLATOR);
                this.mScrollAnimator.setDuration(this.mAnimationDuration);
                this.mScrollAnimator.addUpdateListener(new ve6(this, 0));
            }
            this.mScrollAnimator.setIntValues(scrollX, calculateScrollXForTab);
            this.mScrollAnimator.start();
        }
        this.mTabIndicators.animateSelectedIndicatorToPosition(i, this.mAnimationDuration);
    }

    private void applyModeAndGravity() {
        int i;
        int i2;
        if (this.mMode == 0) {
            i = Math.max(0, this.mContentInsetStart - this.mTabPaddingStart);
            i2 = Math.max(0, this.mContentInsetEnd - this.mTabPaddingEnd);
        } else {
            i = 0;
            i2 = 0;
        }
        OvalIndicators ovalIndicators = this.mTabIndicators;
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        ovalIndicators.setPaddingRelative(i, 0, i2, 0);
        if (this.mMode != 1) {
            this.mTabIndicators.setGravity(8388611);
        } else {
            this.mTabIndicators.setGravity(1);
        }
        updateTabViews(true);
    }

    private int calculateScrollXForTab(int i, float f) {
        View tab;
        if (this.mMode != 0 || (tab = this.mTabIndicators.getTab(i)) == null) {
            return 0;
        }
        int width = tab.getWidth();
        if (this.mTabScrollPaddingEnabled) {
            return tab.getLeft() - this.mTabScrollPadding;
        }
        int i2 = i + 1;
        return ((tab.getWidth() / 2) + (tab.getLeft() + ((int) (((width + ((i2 < this.mTabIndicators.getChildCount() ? this.mTabIndicators.getChildAt(i2) : null) != null ? r5.getWidth() : 0)) * f) * 0.5f)))) - (getWidth() / 2);
    }

    private void configureTab(Tab tab, int i) {
        tab.setPosition(i);
        this.mTabs.add(i, tab);
        int size = this.mTabs.size();
        while (true) {
            i++;
            if (i >= size) {
                return;
            } else {
                this.mTabs.get(i).setPosition(i);
            }
        }
    }

    private void configureTabView(@NonNull TabView tabView) {
        tabView.setTabPadding(this.mTabPaddingStart, this.mTabPaddingTop, this.mTabPaddingEnd, this.mTabPaddingBottom);
        tabView.setTextTypeface(this.mTypefaceProvider, this.mTabTextAppearance);
        tabView.setInputFocusTracker(this.mInputFocusTracker);
        tabView.setTextColorList(this.mTabTextColors);
        tabView.setBoldTextOnSelection(this.mTabTextBoldOnSelection);
        tabView.setEllipsizeEnabled(this.mIsTabEllipsizeEnabled);
        tabView.setMaxWidthProvider(new TabView.MaxWidthProvider() { // from class: com.yandex.div.internal.widget.tabs.b
            @Override // com.yandex.div.internal.widget.tabs.TabView.MaxWidthProvider
            public final int getMaxWidth() {
                int tabMaxWidth;
                tabMaxWidth = BaseIndicatorTabLayout.this.getTabMaxWidth();
                return tabMaxWidth;
            }
        });
        tabView.setOnUpdateListener(new c(this));
    }

    private static ColorStateList createColorStateList(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTabMaxWidth() {
        return this.mTabMaxWidth;
    }

    private int getTabMinWidth() {
        int i = this.mRequestedTabMinWidth;
        if (i != -1) {
            return i;
        }
        if (this.mMode == 0) {
            return this.mScrollableTabMinWidth;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.mTabIndicators.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private TabView getTabView(@NonNull Tab tab) {
        TabView c = this.mTabViewPool.c();
        if (c == null) {
            c = createTabView(getContext());
            configureTabView(c);
            onTabViewCreated(c);
        }
        c.setTab(tab);
        c.setFocusable(true);
        c.setMinimumWidth(getTabMinWidth());
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$animateToTab$0(ValueAnimator valueAnimator) {
        scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void populateFromPagerAdapter() {
        int currentItem;
        removeAllTabs();
        PagerAdapter pagerAdapter = this.mPagerAdapter;
        if (pagerAdapter == null) {
            removeAllTabs();
            return;
        }
        int count = pagerAdapter.getCount();
        for (int i = 0; i < count; i++) {
            addTab(newTab().setText(this.mPagerAdapter.getPageTitle(i)), false);
        }
        ViewPager viewPager = this.mViewPager;
        if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
            return;
        }
        selectTab(getTabAt(currentItem));
    }

    private void removeTabViewAt(int i) {
        TabView tabView = (TabView) this.mTabIndicators.getChildAt(i);
        int tabPositionInLayout = this.mTabIndicators.getTabPositionInLayout(i);
        this.mTabIndicators.removeViewAt(tabPositionInLayout);
        this.mTabTitleDelimitersController.tabRemoved(tabPositionInLayout);
        if (tabView != null) {
            tabView.reset();
            this.mTabViewPool.a(tabView);
        }
        requestLayout();
    }

    private void setPagerAdapter(@Nullable PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.mPagerAdapter;
        if (pagerAdapter2 != null && (dataSetObserver = this.mPagerAdapterObserver) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.mPagerAdapter = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.mPagerAdapterObserver == null) {
                this.mPagerAdapterObserver = new PagerAdapterObserver(this, null);
            }
            pagerAdapter.registerDataSetObserver(this.mPagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    private void setScrollToSelectedTab() {
        int position;
        Tab tab = this.mSelectedTab;
        if (tab == null || (position = tab.getPosition()) == -1) {
            return;
        }
        setScrollPosition(position, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
    }

    private void setSelectedTabView(int i) {
        int childCount = this.mTabIndicators.getChildCount();
        int tabPositionInLayout = this.mTabIndicators.getTabPositionInLayout(i);
        if (tabPositionInLayout >= childCount || this.mTabIndicators.getChildAt(tabPositionInLayout).isSelected()) {
            return;
        }
        int i2 = 0;
        while (i2 < childCount) {
            this.mTabIndicators.getChildAt(i2).setSelected(i2 == tabPositionInLayout);
            i2++;
        }
    }

    private void updateTabViewLayoutParams(LinearLayout.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    private void updateTabViews(boolean z) {
        for (int i = 0; i < this.mTabIndicators.getChildCount(); i++) {
            View childAt = this.mTabIndicators.getChildAt(i);
            if (childAt instanceof TabView) {
                childAt.setMinimumWidth(getTabMinWidth());
                updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams());
                if (z) {
                    childAt.requestLayout();
                }
            }
        }
    }

    public void addTab(@NonNull Tab tab) {
        addTab(tab, this.mTabs.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        addViewInternal(view);
    }

    @NonNull
    public void bindTypefaceProvider(@NonNull DivTypefaceProvider divTypefaceProvider) {
        this.mTypefaceProvider = divTypefaceProvider;
    }

    public TabView createTabView(@NonNull Context context) {
        return new TabView(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        this.mNestedScrollCompanion.dispatchTouchEventAfterSuperCall(motionEvent);
        return dispatchTouchEvent;
    }

    @NonNull
    public TabLayoutOnPageChangeListener getPageChangeListener() {
        if (this.mPageChangeListener == null) {
            this.mPageChangeListener = new TabLayoutOnPageChangeListener(this);
        }
        return this.mPageChangeListener;
    }

    public int getSelectedTabPosition() {
        Tab tab = this.mSelectedTab;
        if (tab != null) {
            return tab.getPosition();
        }
        return -1;
    }

    public int getSelectedTabTextColor() {
        return this.mTabTextColors.getColorForState(HorizontalScrollView.SELECTED_STATE_SET, -1);
    }

    @Nullable
    public Tab getTabAt(int i) {
        return this.mTabs.get(i);
    }

    public int getTabCount() {
        return this.mTabs.size();
    }

    public int getTabMode() {
        return this.mMode;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.mTabTextColors;
    }

    @NonNull
    public Tab newTab() {
        Tab c = sTabPool.c();
        if (c == null) {
            c = new Tab(null);
        }
        c.mParent = this;
        c.mView = getTabView(c);
        return c;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    @SuppressLint({"SwitchIntDef"})
    public void onMeasure(int i, int i2) {
        int paddingBottom = getPaddingBottom() + getPaddingTop() + BaseDivViewExtensionsKt.dpToPx(44, getResources().getDisplayMetrics());
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(paddingBottom, View.MeasureSpec.getSize(i2)), 1073741824);
        } else if (mode == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.mRequestedTabMaxWidth;
            if (i3 <= 0) {
                i3 = size - BaseDivViewExtensionsKt.dpToPx(56, getResources().getDisplayMetrics());
            }
            this.mTabMaxWidth = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            if (this.mMode != 1) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.onOverScrolled(i, i2, z, z2);
        this.mNestedScrollCompanion.dispatchOnOverScrolled(z);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.mNestedScrollCompanion.dispatchOnScrollChanged();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 == 0 || i3 == i) {
            return;
        }
        setScrollToSelectedTab();
    }

    public void removeAllTabs() {
        for (int size = this.mTabs.size() - 1; size >= 0; size--) {
            removeTabViewAt(size);
        }
        Iterator<Tab> it = this.mTabs.iterator();
        while (it.hasNext()) {
            Tab next = it.next();
            it.remove();
            next.reset();
            sTabPool.a(next);
        }
        this.mSelectedTab = null;
    }

    public void selectTab(Tab tab) {
        selectTab(tab, true);
    }

    public void setAnimationDuration(long j) {
        this.mAnimationDuration = j;
    }

    public void setAnimationType(AnimationType animationType) {
        this.mTabIndicators.setAnimationType(animationType);
    }

    public void setFocusTracker(InputFocusTracker inputFocusTracker) {
        this.mInputFocusTracker = inputFocusTracker;
    }

    public void setOnTabSelectedListener(OnTabSelectedListener onTabSelectedListener) {
        this.mOnTabSelectedListener = onTabSelectedListener;
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.mTabIndicators.setSelectedIndicatorColor(i);
    }

    public void setTabBackgroundColor(int i) {
        this.mTabIndicators.setIndicatorColor(i);
    }

    public void setTabDelimiter(Bitmap bitmap, int i, int i2) {
        this.mTabTitleDelimitersController.updateTitleDelimiters(bitmap, i, i2);
    }

    public void setTabIndicatorCornersRadii(@NonNull float[] fArr) {
        this.mTabIndicators.setIndicatorCornersRadii(fArr);
    }

    public void setTabIndicatorHeight(int i) {
        this.mTabIndicators.setIndicatorHeight(i);
    }

    public void setTabItemSpacing(int i) {
        this.mTabIndicators.setItemSpacing(i);
    }

    public void setTabMode(int i) {
        if (i != this.mMode) {
            this.mMode = i;
            applyModeAndGravity();
        }
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.mTabTextColors != colorStateList) {
            this.mTabTextColors = colorStateList;
            int size = this.mTabs.size();
            for (int i = 0; i < size; i++) {
                TabView tabView = this.mTabs.get(i).getTabView();
                if (tabView != null) {
                    tabView.setTextColorList(this.mTabTextColors);
                }
            }
        }
    }

    public void setTabsEnabled(boolean z) {
        for (int i = 0; i < this.mTabs.size(); i++) {
            this.mTabs.get(i).mView.setEnabled(z);
        }
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        TabLayoutOnPageChangeListener tabLayoutOnPageChangeListener;
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 != null && (tabLayoutOnPageChangeListener = this.mPageChangeListener) != null) {
            viewPager2.removeOnPageChangeListener(tabLayoutOnPageChangeListener);
        }
        if (viewPager == null) {
            this.mViewPager = null;
            setOnTabSelectedListener(null);
            setPagerAdapter(null, true);
            return;
        }
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter == null) {
            throw new IllegalArgumentException("ViewPager does not have a PagerAdapter set");
        }
        this.mViewPager = viewPager;
        if (this.mPageChangeListener == null) {
            this.mPageChangeListener = new TabLayoutOnPageChangeListener(this);
        }
        this.mPageChangeListener.reset();
        viewPager.addOnPageChangeListener(this.mPageChangeListener);
        setOnTabSelectedListener(new ViewPagerOnTabSelectedListener(viewPager));
        setPagerAdapter(adapter, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.mTabIndicators.getChildCount()) {
            return;
        }
        if (z2) {
            this.mTabIndicators.setSelectedIndicatorPositionFromTabPosition(i, f);
        }
        ValueAnimator valueAnimator = this.mScrollAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.mScrollAnimator.cancel();
        }
        scrollTo(calculateScrollXForTab(i, f), 0);
        if (z) {
            setSelectedTabView(round);
        }
    }

    public void addTab(@NonNull Tab tab, boolean z) {
        if (tab.mParent != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        addTabView(tab, z);
        configureTab(tab, this.mTabs.size());
        if (z) {
            tab.select();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        addViewInternal(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void selectTab(int i) {
        Tab tabAt;
        if (getSelectedTabPosition() == i || (tabAt = getTabAt(i)) == null) {
            return;
        }
        tabAt.select();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    public void selectTab(Tab tab, boolean z) {
        OnTabSelectedListener onTabSelectedListener;
        OnTabSelectedListener onTabSelectedListener2;
        Tab tab2 = this.mSelectedTab;
        if (tab2 == tab) {
            if (tab2 != null) {
                OnTabSelectedListener onTabSelectedListener3 = this.mOnTabSelectedListener;
                if (onTabSelectedListener3 != null) {
                    onTabSelectedListener3.onTabReselected(tab2);
                }
                animateToTab(tab.getPosition());
                return;
            }
            return;
        }
        if (z) {
            int position = tab != null ? tab.getPosition() : -1;
            if (position != -1) {
                setSelectedTabView(position);
            }
            Tab tab3 = this.mSelectedTab;
            if ((tab3 == null || tab3.getPosition() == -1) && position != -1) {
                setScrollPosition(position, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
            } else {
                animateToTab(position);
            }
        }
        Tab tab4 = this.mSelectedTab;
        if (tab4 != null && (onTabSelectedListener2 = this.mOnTabSelectedListener) != null) {
            onTabSelectedListener2.onTabUnselected(tab4);
        }
        this.mSelectedTab = tab;
        if (tab == null || (onTabSelectedListener = this.mOnTabSelectedListener) == null) {
            return;
        }
        onTabSelectedListener.onTabSelected(tab);
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(createColorStateList(i, i2));
    }

    public static class ViewPagerOnTabSelectedListener implements OnTabSelectedListener {
        private final ViewPager mViewPager;

        public ViewPagerOnTabSelectedListener(ViewPager viewPager) {
            this.mViewPager = viewPager;
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
        public void onTabSelected(Tab tab) {
            this.mViewPager.setCurrentItem(tab.getPosition());
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
        public void onTabReselected(Tab tab) {
        }

        @Override // com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout.OnTabSelectedListener
        public void onTabUnselected(Tab tab) {
        }
    }

    public void onTabViewCreated(@NonNull TextView textView) {
    }

    public void onTabViewUpdated(@NonNull TextView textView) {
    }
}
