package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.d;
import androidx.constraintlayout.widget.e;
import defpackage.ow8;
import defpackage.uz;
import defpackage.xa30;
import defpackage.z3i0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class Carousel extends MotionHelper {
    private static final boolean DEBUG = false;
    private static final String TAG = "Carousel";
    public static final int TOUCH_UP_CARRY_ON = 2;
    public static final int TOUCH_UP_IMMEDIATE_STOP = 1;
    private ow8 mAdapter;
    private int mAnimateTargetDelay;
    private int mBackwardTransition;
    private float mDampening;
    private int mEmptyViewBehavior;
    private int mFirstViewReference;
    private int mForwardTransition;
    private int mIndex;
    private boolean mInfiniteCarousel;
    int mLastStartId;
    private final ArrayList<View> mList;
    private MotionLayout mMotionLayout;
    private int mNextState;
    private int mPreviousIndex;
    private int mPreviousState;
    private int mStartIndex;
    private int mTargetIndex;
    private int mTouchUpMode;
    Runnable mUpdateRunnable;
    private float mVelocityThreshold;

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mList = new ArrayList<>();
        this.mPreviousIndex = 0;
        this.mIndex = 0;
        this.mFirstViewReference = -1;
        this.mInfiniteCarousel = false;
        this.mBackwardTransition = -1;
        this.mForwardTransition = -1;
        this.mPreviousState = -1;
        this.mNextState = -1;
        this.mDampening = 0.9f;
        this.mStartIndex = 0;
        this.mEmptyViewBehavior = 4;
        this.mTouchUpMode = 1;
        this.mVelocityThreshold = 2.0f;
        this.mTargetIndex = -1;
        this.mAnimateTargetDelay = 200;
        this.mLastStartId = -1;
        this.mUpdateRunnable = new uz(9, this);
        init(context, attributeSet);
    }

    public static /* synthetic */ ow8 access$300(Carousel carousel) {
        carousel.getClass();
        return null;
    }

    private void enableAllTransitions(boolean z) {
        Iterator<xa30> it = this.mMotionLayout.getDefinedTransitions().iterator();
        while (it.hasNext()) {
            it.next().o = !z;
        }
    }

    private boolean enableTransition(int i, boolean z) {
        MotionLayout motionLayout;
        xa30 transition;
        if (i == -1 || (motionLayout = this.mMotionLayout) == null || (transition = motionLayout.getTransition(i)) == null || z == (!transition.o)) {
            return false;
        }
        transition.o = !z;
        return true;
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3i0.Carousel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == z3i0.Carousel_carousel_firstView) {
                    this.mFirstViewReference = obtainStyledAttributes.getResourceId(index, this.mFirstViewReference);
                } else if (index == z3i0.Carousel_carousel_backwardTransition) {
                    this.mBackwardTransition = obtainStyledAttributes.getResourceId(index, this.mBackwardTransition);
                } else if (index == z3i0.Carousel_carousel_forwardTransition) {
                    this.mForwardTransition = obtainStyledAttributes.getResourceId(index, this.mForwardTransition);
                } else if (index == z3i0.Carousel_carousel_emptyViewsBehavior) {
                    this.mEmptyViewBehavior = obtainStyledAttributes.getInt(index, this.mEmptyViewBehavior);
                } else if (index == z3i0.Carousel_carousel_previousState) {
                    this.mPreviousState = obtainStyledAttributes.getResourceId(index, this.mPreviousState);
                } else if (index == z3i0.Carousel_carousel_nextState) {
                    this.mNextState = obtainStyledAttributes.getResourceId(index, this.mNextState);
                } else if (index == z3i0.Carousel_carousel_touchUp_dampeningFactor) {
                    this.mDampening = obtainStyledAttributes.getFloat(index, this.mDampening);
                } else if (index == z3i0.Carousel_carousel_touchUpMode) {
                    this.mTouchUpMode = obtainStyledAttributes.getInt(index, this.mTouchUpMode);
                } else if (index == z3i0.Carousel_carousel_touchUp_velocityThreshold) {
                    this.mVelocityThreshold = obtainStyledAttributes.getFloat(index, this.mVelocityThreshold);
                } else if (index == z3i0.Carousel_carousel_infinite) {
                    this.mInfiniteCarousel = obtainStyledAttributes.getBoolean(index, this.mInfiniteCarousel);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    private /* synthetic */ void lambda$updateItems$0() {
        this.mMotionLayout.setTransitionDuration(this.mAnimateTargetDelay);
        int i = this.mTargetIndex;
        int i2 = this.mIndex;
        MotionLayout motionLayout = this.mMotionLayout;
        if (i < i2) {
            motionLayout.transitionToState(this.mPreviousState, this.mAnimateTargetDelay);
        } else {
            motionLayout.transitionToState(this.mNextState, this.mAnimateTargetDelay);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateItems() {
    }

    private boolean updateViewVisibility(int i, View view, int i2) {
        e.a p;
        e constraintSet = this.mMotionLayout.getConstraintSet(i);
        if (constraintSet == null || (p = constraintSet.p(view.getId())) == null) {
            return false;
        }
        p.c.c = 1;
        view.setVisibility(i2);
        return true;
    }

    public int getCount() {
        return 0;
    }

    public int getCurrentIndex() {
        return this.mIndex;
    }

    public boolean isInfinite() {
        return this.mInfiniteCarousel;
    }

    public void jumpToIndex(int i) {
        this.mIndex = Math.max(0, Math.min(getCount() - 1, i));
        refresh();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        d dVar;
        d dVar2;
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            this.mList.clear();
            for (int i = 0; i < this.mCount; i++) {
                int i2 = this.mIds[i];
                View viewById = motionLayout.getViewById(i2);
                if (this.mFirstViewReference == i2) {
                    this.mStartIndex = i;
                }
                this.mList.add(viewById);
            }
            this.mMotionLayout = motionLayout;
            if (this.mTouchUpMode == 2) {
                xa30 transition = motionLayout.getTransition(this.mForwardTransition);
                if (transition != null && (dVar2 = transition.l) != null) {
                    dVar2.c = 5;
                }
                xa30 transition2 = this.mMotionLayout.getTransition(this.mBackwardTransition);
                if (transition2 != null && (dVar = transition2.l) != null) {
                    dVar.c = 5;
                }
            }
            updateItems();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mList.clear();
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, defpackage.sa30
    public void onTransitionChange(MotionLayout motionLayout, int i, int i2, float f) {
        this.mLastStartId = i;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, defpackage.sa30
    public void onTransitionCompleted(MotionLayout motionLayout, int i) {
        int i2 = this.mIndex;
        this.mPreviousIndex = i2;
        if (i == this.mNextState) {
            this.mIndex = i2 + 1;
        } else if (i == this.mPreviousState) {
            this.mIndex = i2 - 1;
        }
        if (!this.mInfiniteCarousel) {
            throw null;
        }
        throw null;
    }

    public void refresh() {
        if (this.mList.size() > 0) {
            this.mList.get(0);
            throw null;
        }
        this.mMotionLayout.rebuildScene();
        updateItems();
    }

    public void setAdapter(ow8 ow8Var) {
    }

    public void setInfinite(boolean z) {
        this.mInfiniteCarousel = z;
    }

    public void transitionToIndex(int i, int i2) {
        this.mTargetIndex = Math.max(0, Math.min(getCount() - 1, i));
        int max = Math.max(0, i2);
        this.mAnimateTargetDelay = max;
        this.mMotionLayout.setTransitionDuration(max);
        int i3 = this.mIndex;
        MotionLayout motionLayout = this.mMotionLayout;
        if (i < i3) {
            motionLayout.transitionToState(this.mPreviousState, this.mAnimateTargetDelay);
        } else {
            motionLayout.transitionToState(this.mNextState, this.mAnimateTargetDelay);
        }
    }

    private boolean updateViewVisibility(View view, int i) {
        MotionLayout motionLayout = this.mMotionLayout;
        if (motionLayout == null) {
            return false;
        }
        boolean z = false;
        for (int i2 : motionLayout.getConstraintSetIds()) {
            z |= updateViewVisibility(i2, view, i);
        }
        return z;
    }

    public Carousel(Context context) {
        super(context);
        this.mList = new ArrayList<>();
        this.mPreviousIndex = 0;
        this.mIndex = 0;
        this.mFirstViewReference = -1;
        this.mInfiniteCarousel = false;
        this.mBackwardTransition = -1;
        this.mForwardTransition = -1;
        this.mPreviousState = -1;
        this.mNextState = -1;
        this.mDampening = 0.9f;
        this.mStartIndex = 0;
        this.mEmptyViewBehavior = 4;
        this.mTouchUpMode = 1;
        this.mVelocityThreshold = 2.0f;
        this.mTargetIndex = -1;
        this.mAnimateTargetDelay = 200;
        this.mLastStartId = -1;
        this.mUpdateRunnable = new uz(9, this);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mList = new ArrayList<>();
        this.mPreviousIndex = 0;
        this.mIndex = 0;
        this.mFirstViewReference = -1;
        this.mInfiniteCarousel = false;
        this.mBackwardTransition = -1;
        this.mForwardTransition = -1;
        this.mPreviousState = -1;
        this.mNextState = -1;
        this.mDampening = 0.9f;
        this.mStartIndex = 0;
        this.mEmptyViewBehavior = 4;
        this.mTouchUpMode = 1;
        this.mVelocityThreshold = 2.0f;
        this.mTargetIndex = -1;
        this.mAnimateTargetDelay = 200;
        this.mLastStartId = -1;
        this.mUpdateRunnable = new uz(9, this);
        init(context, attributeSet);
    }
}
