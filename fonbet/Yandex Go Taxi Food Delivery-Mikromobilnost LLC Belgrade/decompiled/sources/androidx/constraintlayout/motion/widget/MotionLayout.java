package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.ci;
import defpackage.cv31;
import defpackage.ezz0;
import defpackage.ha30;
import defpackage.ia30;
import defpackage.jst0;
import defpackage.k7e;
import defpackage.kih0;
import defpackage.n631;
import defpackage.oyr;
import defpackage.pa30;
import defpackage.pyi;
import defpackage.qa30;
import defpackage.qbn;
import defpackage.qjx;
import defpackage.qv10;
import defpackage.ra30;
import defpackage.rug;
import defpackage.ryh;
import defpackage.sa30;
import defpackage.ta30;
import defpackage.thx;
import defpackage.u5u0;
import defpackage.un50;
import defpackage.unr0;
import defpackage.v5u0;
import defpackage.vmn0;
import defpackage.we6;
import defpackage.ws31;
import defpackage.wv31;
import defpackage.xa30;
import defpackage.yci0;
import defpackage.z33;
import defpackage.z3i0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;

/* loaded from: classes10.dex */
public class MotionLayout extends ConstraintLayout implements un50 {
    private static final boolean DEBUG = false;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    private static final float EPSILON = 1.0E-5f;
    public static boolean IS_IN_EDIT_MODE = false;
    static final int MAX_KEY_FRAMES = 50;
    static final String TAG = "MotionLayout";
    public static final int TOUCH_UP_COMPLETE = 0;
    public static final int TOUCH_UP_COMPLETE_TO_END = 2;
    public static final int TOUCH_UP_COMPLETE_TO_START = 1;
    public static final int TOUCH_UP_DECELERATE = 4;
    public static final int TOUCH_UP_DECELERATE_AND_COMPLETE = 5;
    public static final int TOUCH_UP_NEVER_TO_END = 7;
    public static final int TOUCH_UP_NEVER_TO_START = 6;
    public static final int TOUCH_UP_STOP = 3;
    public static final int VELOCITY_LAYOUT = 1;
    public static final int VELOCITY_POST_LAYOUT = 0;
    public static final int VELOCITY_STATIC_LAYOUT = 3;
    public static final int VELOCITY_STATIC_POST_LAYOUT = 2;
    private long mAnimationStartTime;
    private int mBeginState;
    private RectF mBoundsCheck;
    int mCurrentState;
    int mDebugPath;
    private DecelerateInterpolator mDecelerateLogic;
    private ArrayList<MotionHelper> mDecoratorsHelpers;
    private boolean mDelayedApply;
    private pyi mDesignTool;
    qa30 mDevModeDraw;
    private int mEndState;
    int mEndWrapHeight;
    int mEndWrapWidth;
    boolean mFirstDown;
    HashMap<View, ia30> mFrameArrayList;
    private int mFrames;
    int mHeightMeasureMode;
    private boolean mInLayout;
    private boolean mInRotation;
    boolean mInTransition;
    boolean mIndirectTransition;
    private boolean mInteractionEnabled;
    Interpolator mInterpolator;
    private Matrix mInverseMatrix;
    boolean mIsAnimating;
    private boolean mKeepAnimating;
    private thx mKeyCache;
    private long mLastDrawTime;
    private float mLastFps;
    private int mLastHeightMeasureSpec;
    int mLastLayoutHeight;
    int mLastLayoutWidth;
    private float mLastPos;
    float mLastVelocity;
    private int mLastWidthMeasureSpec;
    private float mLastY;
    private float mListenerPosition;
    private int mListenerState;
    protected boolean mMeasureDuringTransition;
    a mModel;
    private boolean mNeedsFireTransitionCompleted;
    int mOldHeight;
    int mOldWidth;
    private Runnable mOnComplete;
    private ArrayList<MotionHelper> mOnHideHelpers;
    private ArrayList<MotionHelper> mOnShowHelpers;
    float mPostInterpolationPosition;
    HashMap<View, cv31> mPreRotate;
    private int mPreRotateHeight;
    private int mPreRotateWidth;
    private int mPreviouseRotation;
    Interpolator mProgressInterpolator;
    private View mRegionView;
    int mRotatMode;
    c mScene;
    private int[] mScheduledTransitionTo;
    int mScheduledTransitions;
    float mScrollTargetDT;
    float mScrollTargetDX;
    float mScrollTargetDY;
    long mScrollTargetTime;
    int mStartWrapHeight;
    int mStartWrapWidth;
    private b mStateCache;
    private StopLogic mStopLogic;
    Rect mTempRect;
    private boolean mTemporalInterpolator;
    ArrayList<Integer> mTransitionCompleted;
    private float mTransitionDuration;
    float mTransitionGoalPosition;
    private boolean mTransitionInstantly;
    float mTransitionLastPosition;
    private long mTransitionLastTime;
    private sa30 mTransitionListener;
    private CopyOnWriteArrayList<sa30> mTransitionListeners;
    float mTransitionPosition;
    TransitionState mTransitionState;
    boolean mUndergoingMotion;
    int mWidthMeasureMode;

    public class DecelerateInterpolator extends MotionInterpolator {
        float mMaxA;
        float mInitialV = 0.0f;
        float mCurrentP = 0.0f;

        public DecelerateInterpolator() {
        }

        public void config(float f, float f2, float f3) {
            this.mInitialV = f;
            this.mCurrentP = f2;
            this.mMaxA = f3;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = this.mInitialV;
            float f3 = this.mMaxA;
            if (f2 > 0.0f) {
                if (f2 / f3 < f) {
                    f = f2 / f3;
                }
                MotionLayout.this.mLastVelocity = f2 - (f3 * f);
                return ((f2 * f) - (((f3 * f) * f) / 2.0f)) + this.mCurrentP;
            }
            if ((-f2) / f3 < f) {
                f = (-f2) / f3;
            }
            MotionLayout.this.mLastVelocity = (f3 * f) + f2;
            return (((f3 * f) * f) / 2.0f) + (f2 * f) + this.mCurrentP;
        }

        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
        public float getVelocity() {
            return MotionLayout.this.mLastVelocity;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TransitionState {
        private static final /* synthetic */ TransitionState[] $VALUES;
        public static final TransitionState FINISHED;
        public static final TransitionState MOVING;
        public static final TransitionState SETUP;
        public static final TransitionState UNDEFINED;

        static {
            TransitionState transitionState = new TransitionState("UNDEFINED", 0);
            UNDEFINED = transitionState;
            TransitionState transitionState2 = new TransitionState("SETUP", 1);
            SETUP = transitionState2;
            TransitionState transitionState3 = new TransitionState("MOVING", 2);
            MOVING = transitionState3;
            TransitionState transitionState4 = new TransitionState(TlsConstants.TLS_FINISHED, 3);
            FINISHED = transitionState4;
            $VALUES = new TransitionState[]{transitionState, transitionState2, transitionState3, transitionState4};
        }

        public static TransitionState valueOf(String str) {
            return (TransitionState) Enum.valueOf(TransitionState.class, str);
        }

        public static TransitionState[] values() {
            return (TransitionState[]) $VALUES.clone();
        }
    }

    public MotionLayout(Context context) {
        super(context);
        this.mProgressInterpolator = null;
        this.mLastVelocity = 0.0f;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new HashMap<>();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionGoalPosition = 0.0f;
        this.mInTransition = false;
        this.mIndirectTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new StopLogic();
        this.mDecelerateLogic = new DecelerateInterpolator();
        this.mFirstDown = true;
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mDecoratorsHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = 0.0f;
        this.mListenerState = 0;
        this.mListenerPosition = 0.0f;
        this.mIsAnimating = false;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new thx();
        this.mInLayout = false;
        this.mOnComplete = null;
        this.mScheduledTransitionTo = null;
        this.mScheduledTransitions = 0;
        this.mInRotation = false;
        this.mRotatMode = 0;
        this.mPreRotate = new HashMap<>();
        this.mTempRect = new Rect();
        this.mDelayedApply = false;
        this.mTransitionState = TransitionState.UNDEFINED;
        this.mModel = new a(this);
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new RectF();
        this.mRegionView = null;
        this.mInverseMatrix = null;
        this.mTransitionCompleted = new ArrayList<>();
        init(null);
    }

    private boolean callTransformedTouchEvent(View view, MotionEvent motionEvent, float f, float f2) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f, f2);
            boolean onTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f, -f2);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(f, f2);
        if (this.mInverseMatrix == null) {
            this.mInverseMatrix = new Matrix();
        }
        matrix.invert(this.mInverseMatrix);
        obtain.transform(this.mInverseMatrix);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    private void checkStructure() {
        c cVar = this.mScene;
        if (cVar == null) {
            Log.e(TAG, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int h = cVar.h();
        c cVar2 = this.mScene;
        checkStructure(h, cVar2.b(cVar2.h()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator it = this.mScene.e.iterator();
        while (it.hasNext()) {
            xa30 xa30Var = (xa30) it.next();
            xa30 xa30Var2 = this.mScene.c;
            checkStructure(xa30Var);
            int i = xa30Var.d;
            int i2 = xa30Var.c;
            String c = rug.c(i, getContext());
            String c2 = rug.c(i2, getContext());
            if (sparseIntArray.get(i) == i2) {
                Log.e(TAG, "CHECK: two transitions with the same start and end " + c + "->" + c2);
            }
            if (sparseIntArray2.get(i2) == i) {
                Log.e(TAG, "CHECK: you can't have reverse transitions" + c + "->" + c2);
            }
            sparseIntArray.put(i, i2);
            sparseIntArray2.put(i2, i);
            if (this.mScene.b(i) == null) {
                Log.e(TAG, " no such constraintSetStart " + c);
            }
            if (this.mScene.b(i2) == null) {
                Log.e(TAG, " no such constraintSetEnd " + c);
            }
        }
    }

    private void computeCurrentPositions() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            ia30 ia30Var = this.mFrameArrayList.get(childAt);
            if (ia30Var != null) {
                ta30 ta30Var = ia30Var.f;
                ta30Var.c = 0.0f;
                ta30Var.w = 0.0f;
                ta30Var.d(childAt.getX(), childAt.getY(), childAt.getWidth(), childAt.getHeight());
                ha30 ha30Var = ia30Var.h;
                ha30Var.getClass();
                childAt.getX();
                childAt.getY();
                childAt.getWidth();
                childAt.getHeight();
                ha30Var.b(childAt);
            }
        }
    }

    private void debugPos() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            rug.b();
            rug.d(this);
            rug.c(this.mCurrentState, getContext());
            rug.d(childAt);
            childAt.getLeft();
            childAt.getTop();
        }
    }

    private void evaluateLayout() {
        boolean z;
        float signum = Math.signum(this.mTransitionGoalPosition - this.mTransitionLastPosition);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.mInterpolator;
        float f = this.mTransitionLastPosition + (!(interpolator instanceof StopLogic) ? (((nanoTime - this.mTransitionLastTime) * signum) * 1.0E-9f) / this.mTransitionDuration : 0.0f);
        if (this.mTransitionInstantly) {
            f = this.mTransitionGoalPosition;
        }
        if ((signum <= 0.0f || f < this.mTransitionGoalPosition) && (signum > 0.0f || f > this.mTransitionGoalPosition)) {
            z = false;
        } else {
            f = this.mTransitionGoalPosition;
            z = true;
        }
        if (interpolator != null && !z) {
            f = this.mTemporalInterpolator ? interpolator.getInterpolation((nanoTime - this.mAnimationStartTime) * 1.0E-9f) : interpolator.getInterpolation(f);
        }
        if ((signum > 0.0f && f >= this.mTransitionGoalPosition) || (signum <= 0.0f && f <= this.mTransitionGoalPosition)) {
            f = this.mTransitionGoalPosition;
        }
        this.mPostInterpolationPosition = f;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.mProgressInterpolator;
        if (interpolator2 != null) {
            f = interpolator2.getInterpolation(f);
        }
        float f2 = f;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            ia30 ia30Var = this.mFrameArrayList.get(childAt);
            if (ia30Var != null) {
                ia30Var.f(f2, nanoTime2, this.mKeyCache, childAt);
            }
        }
        if (this.mMeasureDuringTransition) {
            requestLayout();
        }
    }

    private void fireTransitionChange() {
        CopyOnWriteArrayList<sa30> copyOnWriteArrayList;
        if ((this.mTransitionListener == null && ((copyOnWriteArrayList = this.mTransitionListeners) == null || copyOnWriteArrayList.isEmpty())) || this.mListenerPosition == this.mTransitionPosition) {
            return;
        }
        if (this.mListenerState != -1) {
            fireTransitionStarted();
            this.mIsAnimating = true;
        }
        this.mListenerState = -1;
        float f = this.mTransitionPosition;
        this.mListenerPosition = f;
        sa30 sa30Var = this.mTransitionListener;
        if (sa30Var != null) {
            sa30Var.onTransitionChange(this, this.mBeginState, this.mEndState, f);
        }
        CopyOnWriteArrayList<sa30> copyOnWriteArrayList2 = this.mTransitionListeners;
        if (copyOnWriteArrayList2 != null) {
            Iterator<sa30> it = copyOnWriteArrayList2.iterator();
            while (it.hasNext()) {
                it.next().onTransitionChange(this, this.mBeginState, this.mEndState, this.mTransitionPosition);
            }
        }
        this.mIsAnimating = true;
    }

    private void fireTransitionStarted() {
        sa30 sa30Var = this.mTransitionListener;
        if (sa30Var != null) {
            sa30Var.onTransitionStarted(this, this.mBeginState, this.mEndState);
        }
        CopyOnWriteArrayList<sa30> copyOnWriteArrayList = this.mTransitionListeners;
        if (copyOnWriteArrayList != null) {
            Iterator<sa30> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionStarted(this, this.mBeginState, this.mEndState);
            }
        }
    }

    private boolean handlesTouchEvent(float f, float f2, View view, MotionEvent motionEvent) {
        boolean z;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (handlesTouchEvent((r3.getLeft() + f) - view.getScrollX(), (r3.getTop() + f2) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            this.mBoundsCheck.set(f, f2, (view.getRight() + f) - view.getLeft(), (view.getBottom() + f2) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY())) && callTransformedTouchEvent(view, motionEvent, -f, -f2)) {
                return true;
            }
        }
        return z;
    }

    private void init(AttributeSet attributeSet) {
        c cVar;
        IS_IN_EDIT_MODE = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, z3i0.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == z3i0.MotionLayout_layoutDescription) {
                    this.mScene = new c(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == z3i0.MotionLayout_currentState) {
                    this.mCurrentState = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == z3i0.MotionLayout_motionProgress) {
                    this.mTransitionGoalPosition = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.mInTransition = true;
                } else if (index == z3i0.MotionLayout_applyMotionScene) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == z3i0.MotionLayout_showPaths) {
                    if (this.mDebugPath == 0) {
                        this.mDebugPath = obtainStyledAttributes.getBoolean(index, false) ? 2 : 0;
                    }
                } else if (index == z3i0.MotionLayout_motionDebug) {
                    this.mDebugPath = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.mScene == null) {
                Log.e(TAG, "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.mScene = null;
            }
        }
        if (this.mDebugPath != 0) {
            checkStructure();
        }
        if (this.mCurrentState != -1 || (cVar = this.mScene) == null) {
            return;
        }
        this.mCurrentState = cVar.h();
        this.mBeginState = this.mScene.h();
        xa30 xa30Var = this.mScene.c;
        this.mEndState = xa30Var != null ? xa30Var.c : -1;
    }

    private void processTransitionCompleted() {
        CopyOnWriteArrayList<sa30> copyOnWriteArrayList;
        if (this.mTransitionListener == null && ((copyOnWriteArrayList = this.mTransitionListeners) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.mIsAnimating = false;
        Iterator<Integer> it = this.mTransitionCompleted.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            sa30 sa30Var = this.mTransitionListener;
            if (sa30Var != null) {
                sa30Var.onTransitionCompleted(this, next.intValue());
            }
            CopyOnWriteArrayList<sa30> copyOnWriteArrayList2 = this.mTransitionListeners;
            if (copyOnWriteArrayList2 != null) {
                Iterator<sa30> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().onTransitionCompleted(this, next.intValue());
                }
            }
        }
        this.mTransitionCompleted.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupMotionViews() {
        int childCount = getChildCount();
        this.mModel.a();
        this.mInTransition = true;
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            sparseArray.put(childAt.getId(), this.mFrameArrayList.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        xa30 xa30Var = this.mScene.c;
        int i3 = xa30Var != null ? xa30Var.p : -1;
        if (i3 != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                ia30 ia30Var = this.mFrameArrayList.get(getChildAt(i4));
                if (ia30Var != null) {
                    ia30Var.B = i3;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.mFrameArrayList.size()];
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            ia30 ia30Var2 = this.mFrameArrayList.get(getChildAt(i6));
            int i7 = ia30Var2.f.D;
            if (i7 != -1) {
                sparseBooleanArray.put(i7, true);
                iArr[i5] = ia30Var2.f.D;
                i5++;
            }
        }
        if (this.mDecoratorsHelpers != null) {
            for (int i8 = 0; i8 < i5; i8++) {
                ia30 ia30Var3 = this.mFrameArrayList.get(findViewById(iArr[i8]));
                if (ia30Var3 != null) {
                    this.mScene.f(ia30Var3);
                }
            }
            Iterator<MotionHelper> it = this.mDecoratorsHelpers.iterator();
            while (it.hasNext()) {
                it.next().onPreSetup(this, this.mFrameArrayList);
            }
            for (int i9 = 0; i9 < i5; i9++) {
                ia30 ia30Var4 = this.mFrameArrayList.get(findViewById(iArr[i9]));
                if (ia30Var4 != null) {
                    ia30Var4.i(width, height, getNanoTime());
                }
            }
        } else {
            for (int i10 = 0; i10 < i5; i10++) {
                ia30 ia30Var5 = this.mFrameArrayList.get(findViewById(iArr[i10]));
                if (ia30Var5 != null) {
                    this.mScene.f(ia30Var5);
                    ia30Var5.i(width, height, getNanoTime());
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            ia30 ia30Var6 = this.mFrameArrayList.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && ia30Var6 != null) {
                this.mScene.f(ia30Var6);
                ia30Var6.i(width, height, getNanoTime());
            }
        }
        xa30 xa30Var2 = this.mScene.c;
        float f = xa30Var2 != null ? xa30Var2.i : 0.0f;
        if (f != 0.0f) {
            boolean z = ((double) f) < 0.0d;
            float abs = Math.abs(f);
            float f2 = -3.4028235E38f;
            float f3 = Float.MAX_VALUE;
            float f4 = -3.4028235E38f;
            float f5 = Float.MAX_VALUE;
            for (int i12 = 0; i12 < childCount; i12++) {
                ia30 ia30Var7 = this.mFrameArrayList.get(getChildAt(i12));
                if (!Float.isNaN(ia30Var7.l)) {
                    for (int i13 = 0; i13 < childCount; i13++) {
                        ia30 ia30Var8 = this.mFrameArrayList.get(getChildAt(i13));
                        if (!Float.isNaN(ia30Var8.l)) {
                            f3 = Math.min(f3, ia30Var8.l);
                            f2 = Math.max(f2, ia30Var8.l);
                        }
                    }
                    while (i < childCount) {
                        ia30 ia30Var9 = this.mFrameArrayList.get(getChildAt(i));
                        if (!Float.isNaN(ia30Var9.l)) {
                            ia30Var9.n = 1.0f / (1.0f - abs);
                            float f6 = ia30Var9.l;
                            if (z) {
                                ia30Var9.m = abs - (((f2 - f6) / (f2 - f3)) * abs);
                            } else {
                                ia30Var9.m = abs - (((f6 - f3) * abs) / (f2 - f3));
                            }
                        }
                        i++;
                    }
                    return;
                }
                ta30 ta30Var = ia30Var7.g;
                float f7 = ta30Var.x;
                float f8 = ta30Var.y;
                float f9 = z ? f8 - f7 : f8 + f7;
                f5 = Math.min(f5, f9);
                f4 = Math.max(f4, f9);
            }
            while (i < childCount) {
                ia30 ia30Var10 = this.mFrameArrayList.get(getChildAt(i));
                ta30 ta30Var2 = ia30Var10.g;
                float f10 = ta30Var2.x;
                float f11 = ta30Var2.y;
                float f12 = z ? f11 - f10 : f11 + f10;
                ia30Var10.n = 1.0f / (1.0f - abs);
                ia30Var10.m = abs - (((f12 - f5) * abs) / (f4 - f5));
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect toRect(ConstraintWidget constraintWidget) {
        this.mTempRect.top = constraintWidget.u();
        this.mTempRect.left = constraintWidget.t();
        Rect rect = this.mTempRect;
        int s = constraintWidget.s();
        Rect rect2 = this.mTempRect;
        rect.right = s + rect2.left;
        int m = constraintWidget.m();
        Rect rect3 = this.mTempRect;
        rect2.bottom = m + rect3.top;
        return rect3;
    }

    private static boolean willJump(float f, float f2, float f3) {
        if (f > 0.0f) {
            float f4 = f / f3;
            return ((f * f4) - (((f3 * f4) * f4) / 2.0f)) + f2 > 1.0f;
        }
        float f5 = (-f) / f3;
        return ((((f3 * f5) * f5) / 2.0f) + (f * f5)) + f2 < 0.0f;
    }

    public void addTransitionListener(sa30 sa30Var) {
        if (this.mTransitionListeners == null) {
            this.mTransitionListeners = new CopyOnWriteArrayList<>();
        }
        this.mTransitionListeners.add(sa30Var);
    }

    public void animateTo(float f) {
        if (this.mScene == null) {
            return;
        }
        float f2 = this.mTransitionLastPosition;
        float f3 = this.mTransitionPosition;
        if (f2 != f3 && this.mTransitionInstantly) {
            this.mTransitionLastPosition = f3;
        }
        float f4 = this.mTransitionLastPosition;
        if (f4 == f) {
            return;
        }
        this.mTemporalInterpolator = false;
        this.mTransitionGoalPosition = f;
        this.mTransitionDuration = r0.c() / 1000.0f;
        setProgress(this.mTransitionGoalPosition);
        this.mInterpolator = null;
        this.mProgressInterpolator = this.mScene.e();
        this.mTransitionInstantly = false;
        this.mAnimationStartTime = getNanoTime();
        this.mInTransition = true;
        this.mTransitionPosition = f4;
        this.mTransitionLastPosition = f4;
        invalidate();
    }

    public boolean applyViewTransition(int i, ia30 ia30Var) {
        c cVar = this.mScene;
        if (cVar == null) {
            return false;
        }
        Iterator it = ((ArrayList) cVar.r.b).iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.a == i) {
                ArrayList arrayList = (ArrayList) eVar.f.a.get(-1);
                if (arrayList == null) {
                    return true;
                }
                ia30Var.w.addAll(arrayList);
                return true;
            }
        }
        return false;
    }

    public androidx.constraintlayout.widget.e cloneConstraintSet(int i) {
        c cVar = this.mScene;
        if (cVar == null) {
            return null;
        }
        androidx.constraintlayout.widget.e b = cVar.b(i);
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.h(b);
        return eVar;
    }

    public void disableAutoTransition(boolean z) {
        c cVar = this.mScene;
        if (cVar == null) {
            return;
        }
        cVar.d = z;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        ArrayList arrayList;
        int i;
        int i2;
        qa30 qa30Var;
        int i3;
        Paint paint;
        Paint paint2;
        int i4;
        ia30 ia30Var;
        qa30 qa30Var2;
        int i5;
        Paint paint3;
        float f;
        Paint paint4;
        int i6;
        double d;
        Paint paint5;
        float f2;
        String resourceEntryName;
        vmn0 vmn0Var;
        ArrayList<MotionHelper> arrayList2 = this.mDecoratorsHelpers;
        if (arrayList2 != null) {
            Iterator<MotionHelper> it = arrayList2.iterator();
            while (it.hasNext()) {
                it.next().onPreDraw(canvas);
            }
        }
        evaluate(false);
        c cVar = this.mScene;
        if (cVar != null && (vmn0Var = cVar.r) != null) {
            ArrayList arrayList3 = (ArrayList) vmn0Var.y;
            ArrayList arrayList4 = (ArrayList) vmn0Var.x;
            if (arrayList4 != null) {
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    ((wv31) it2.next()).a();
                }
                ((ArrayList) vmn0Var.x).removeAll(arrayList3);
                arrayList3.clear();
                if (((ArrayList) vmn0Var.x).isEmpty()) {
                    vmn0Var.x = null;
                }
            }
        }
        super.dispatchDraw(canvas);
        if (this.mScene == null) {
            return;
        }
        if ((this.mDebugPath & 1) == 1 && !isInEditMode()) {
            this.mFrames++;
            long nanoTime = getNanoTime();
            long j = this.mLastDrawTime;
            if (j != -1) {
                if (nanoTime - j > 200000000) {
                    this.mLastFps = ((int) ((this.mFrames / (r10 * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.mFrames = 0;
                    this.mLastDrawTime = nanoTime;
                }
            } else {
                this.mLastDrawTime = nanoTime;
            }
            Paint paint6 = new Paint();
            paint6.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.mLastFps);
            sb.append(" fps ");
            int i7 = this.mBeginState;
            StringBuilder t = qv10.t(oyr.t(sb, i7 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i7), " -> "));
            int i8 = this.mEndState;
            t.append(i8 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i8));
            t.append(" (progress: ");
            t.append(progress);
            t.append(" ) state=");
            int i9 = this.mCurrentState;
            if (i9 == -1) {
                resourceEntryName = StringUtils.UNDEFINED;
            } else {
                resourceEntryName = i9 != -1 ? getContext().getResources().getResourceEntryName(i9) : "UNDEFINED";
            }
            t.append(resourceEntryName);
            String sb2 = t.toString();
            paint6.setColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
            canvas.drawText(sb2, 11.0f, getHeight() - 29, paint6);
            paint6.setColor(-7864184);
            canvas.drawText(sb2, 10.0f, getHeight() - 30, paint6);
        }
        if (this.mDebugPath > 1) {
            if (this.mDevModeDraw == null) {
                this.mDevModeDraw = new qa30(this);
            }
            qa30 qa30Var3 = this.mDevModeDraw;
            HashMap<View, ia30> hashMap = this.mFrameArrayList;
            int c = this.mScene.c();
            int i10 = this.mDebugPath;
            Paint paint7 = qa30Var3.g;
            Paint paint8 = qa30Var3.f;
            Paint paint9 = qa30Var3.i;
            int i11 = qa30Var3.m;
            Paint paint10 = qa30Var3.e;
            MotionLayout motionLayout = qa30Var3.n;
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!motionLayout.isInEditMode() && (i10 & 1) == 2) {
                    String str = motionLayout.getContext().getResources().getResourceName(motionLayout.mEndState) + ":" + motionLayout.getProgress();
                    canvas.drawText(str, 10.0f, motionLayout.getHeight() - 30, qa30Var3.h);
                    canvas.drawText(str, 11.0f, motionLayout.getHeight() - 29, paint10);
                }
                Iterator<ia30> it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    ia30 next = it3.next();
                    ta30 ta30Var = next.f;
                    ArrayList arrayList5 = next.u;
                    int i12 = ta30Var.b;
                    Iterator it4 = arrayList5.iterator();
                    while (it4.hasNext()) {
                        i12 = Math.max(i12, ((ta30) it4.next()).b);
                        it3 = it3;
                    }
                    Iterator<ia30> it5 = it3;
                    int max = Math.max(i12, next.g.b);
                    if (i10 > 0 && max == 0) {
                        max = 1;
                    }
                    if (max == 0) {
                        it3 = it5;
                    } else {
                        float[] fArr = qa30Var3.c;
                        int[] iArr = qa30Var3.b;
                        if (fArr != null) {
                            arrayList = arrayList5;
                            double[] g = next.j[0].g();
                            if (iArr != null) {
                                Iterator it6 = arrayList.iterator();
                                int i13 = 0;
                                while (it6.hasNext()) {
                                    iArr[i13] = ((ta30) it6.next()).H;
                                    i13++;
                                    fArr = fArr;
                                }
                            }
                            float[] fArr2 = fArr;
                            int i14 = 0;
                            int i15 = 0;
                            while (i14 < g.length) {
                                double[] dArr = g;
                                int i16 = i14;
                                next.j[0].c(dArr[i16], next.p);
                                next.f.c(dArr[i16], next.o, next.p, fArr2, i15);
                                i15 += 2;
                                i14 = i16 + 1;
                                g = dArr;
                                c = c;
                            }
                            i = c;
                            i2 = i15 / 2;
                        } else {
                            arrayList = arrayList5;
                            i = c;
                            i2 = 0;
                        }
                        qa30Var3.k = i2;
                        if (max >= 1) {
                            int i17 = i / 16;
                            float[] fArr3 = qa30Var3.a;
                            if (fArr3 == null || fArr3.length != i17 * 2) {
                                qa30Var3.a = new float[i17 * 2];
                                qa30Var3.d = new Path();
                            }
                            float f3 = i11;
                            canvas.translate(f3, f3);
                            paint10.setColor(1996488704);
                            paint9.setColor(1996488704);
                            paint8.setColor(1996488704);
                            paint7.setColor(1996488704);
                            float[] fArr4 = qa30Var3.a;
                            float f4 = 1.0f / (i17 - 1);
                            float f5 = 1.0f;
                            HashMap hashMap2 = next.y;
                            jst0 jst0Var = hashMap2 == null ? null : (jst0) hashMap2.get("translationX");
                            HashMap hashMap3 = next.y;
                            i3 = i10;
                            jst0 jst0Var2 = hashMap3 == null ? null : (jst0) hashMap3.get("translationY");
                            HashMap hashMap4 = next.z;
                            ws31 ws31Var = hashMap4 == null ? null : (ws31) hashMap4.get("translationX");
                            HashMap hashMap5 = next.z;
                            ws31 ws31Var2 = hashMap5 == null ? null : (ws31) hashMap5.get("translationY");
                            int i18 = 0;
                            while (true) {
                                float f6 = Float.NaN;
                                float f7 = 0.0f;
                                if (i18 >= i17) {
                                    break;
                                }
                                int i19 = i17;
                                float f8 = i18 * f4;
                                float f9 = next.n;
                                if (f9 != f5) {
                                    float f10 = next.m;
                                    if (f8 < f10) {
                                        f2 = f10;
                                        f = 0.0f;
                                    } else {
                                        f2 = f10;
                                        f = f8;
                                    }
                                    i5 = i18;
                                    paint3 = paint7;
                                    if (f > f2 && f < 1.0d) {
                                        f = Math.min((f - f2) * f9, f5);
                                    }
                                } else {
                                    i5 = i18;
                                    paint3 = paint7;
                                    f = f8;
                                }
                                double d2 = f;
                                qbn qbnVar = ta30Var.a;
                                Iterator it7 = arrayList.iterator();
                                while (it7.hasNext()) {
                                    Iterator it8 = it7;
                                    ta30 ta30Var2 = (ta30) it7.next();
                                    ta30 ta30Var3 = ta30Var;
                                    qbn qbnVar2 = ta30Var2.a;
                                    if (qbnVar2 != null) {
                                        float f11 = ta30Var2.c;
                                        if (f11 < f) {
                                            f7 = f11;
                                            qbnVar = qbnVar2;
                                        } else if (Float.isNaN(f6)) {
                                            f6 = ta30Var2.c;
                                        }
                                    }
                                    it7 = it8;
                                    ta30Var = ta30Var3;
                                }
                                ta30 ta30Var4 = ta30Var;
                                if (qbnVar != null) {
                                    if (Float.isNaN(f6)) {
                                        f6 = 1.0f;
                                    }
                                    paint4 = paint9;
                                    i6 = i11;
                                    d = (((float) qbnVar.a((f - f7) / r22)) * (f6 - f7)) + f7;
                                } else {
                                    paint4 = paint9;
                                    i6 = i11;
                                    d = d2;
                                }
                                next.j[0].c(d, next.p);
                                z33 z33Var = next.k;
                                if (z33Var != null) {
                                    double[] dArr2 = next.p;
                                    paint5 = paint4;
                                    if (dArr2.length > 0) {
                                        z33Var.c(d, dArr2);
                                    }
                                } else {
                                    paint5 = paint4;
                                }
                                int i20 = i5 * 2;
                                next.f.c(d, next.o, next.p, fArr4, i20);
                                if (ws31Var != null) {
                                    fArr4[i20] = ws31Var.a(f) + fArr4[i20];
                                } else if (jst0Var != null) {
                                    fArr4[i20] = jst0Var.a(f) + fArr4[i20];
                                }
                                if (ws31Var2 != null) {
                                    int i21 = i20 + 1;
                                    fArr4[i21] = ws31Var2.a(f) + fArr4[i21];
                                } else if (jst0Var2 != null) {
                                    int i22 = i20 + 1;
                                    fArr4[i22] = jst0Var2.a(f) + fArr4[i22];
                                }
                                i18 = i5 + 1;
                                i17 = i19;
                                paint7 = paint3;
                                ta30Var = ta30Var4;
                                i11 = i6;
                                paint9 = paint5;
                                f5 = 1.0f;
                            }
                            ta30 ta30Var5 = ta30Var;
                            Paint paint11 = paint7;
                            qa30Var3.a(canvas, max, qa30Var3.k, next);
                            paint10.setColor(-21965);
                            paint8.setColor(-2067046);
                            paint2 = paint9;
                            paint2.setColor(-2067046);
                            Paint paint12 = paint11;
                            paint12.setColor(-13391360);
                            int i23 = i11;
                            float f12 = -i23;
                            canvas.translate(f12, f12);
                            qa30Var3.a(canvas, max, qa30Var3.k, next);
                            char c2 = 5;
                            if (max == 5) {
                                float[] fArr5 = qa30Var3.j;
                                qa30Var3.d.reset();
                                int i24 = 0;
                                while (i24 <= 50) {
                                    char c3 = c2;
                                    int i25 = i24;
                                    next.j[0].c(next.b(null, i24 / 50.0f), next.p);
                                    int[] iArr2 = next.o;
                                    double[] dArr3 = next.p;
                                    ta30 ta30Var6 = ta30Var5;
                                    float f13 = ta30Var6.x;
                                    float f14 = ta30Var6.y;
                                    float f15 = ta30Var6.z;
                                    float f16 = ta30Var6.A;
                                    int i26 = i23;
                                    float[] fArr6 = fArr5;
                                    int i27 = 0;
                                    while (true) {
                                        ia30Var = next;
                                        if (i27 >= iArr2.length) {
                                            break;
                                        }
                                        Paint paint13 = paint12;
                                        float f17 = (float) dArr3[i27];
                                        int i28 = iArr2[i27];
                                        if (i28 == 1) {
                                            f13 = f17;
                                        } else if (i28 == 2) {
                                            f14 = f17;
                                        } else if (i28 == 3) {
                                            f15 = f17;
                                        } else if (i28 == 4) {
                                            f16 = f17;
                                        }
                                        i27++;
                                        next = ia30Var;
                                        paint12 = paint13;
                                    }
                                    Paint paint14 = paint12;
                                    if (ta30Var6.F != null) {
                                        double d3 = f13;
                                        double d4 = f14;
                                        qa30Var2 = qa30Var3;
                                        f13 = (float) (((Math.sin(d4) * d3) + 0.0d) - (f15 / 2.0f));
                                        f14 = (float) ((0.0d - (Math.cos(d4) * d3)) - (f16 / 2.0f));
                                    } else {
                                        qa30Var2 = qa30Var3;
                                    }
                                    float f18 = f15 + f13;
                                    float f19 = f16 + f14;
                                    Float.isNaN(Float.NaN);
                                    Float.isNaN(Float.NaN);
                                    float f20 = f13 + 0.0f;
                                    float f21 = f14 + 0.0f;
                                    float f22 = f18 + 0.0f;
                                    float f23 = f19 + 0.0f;
                                    fArr6[0] = f20;
                                    fArr6[1] = f21;
                                    fArr6[2] = f22;
                                    fArr6[3] = f21;
                                    fArr6[4] = f22;
                                    fArr6[c3] = f23;
                                    fArr6[6] = f20;
                                    fArr6[7] = f23;
                                    qa30 qa30Var4 = qa30Var2;
                                    qa30Var4.d.moveTo(f20, f21);
                                    qa30Var4.d.lineTo(fArr6[2], fArr6[3]);
                                    qa30Var4.d.lineTo(fArr6[4], fArr6[c3]);
                                    qa30Var4.d.lineTo(fArr6[6], fArr6[7]);
                                    qa30Var4.d.close();
                                    i24 = i25 + 1;
                                    qa30Var3 = qa30Var4;
                                    ta30Var5 = ta30Var6;
                                    c2 = c3;
                                    fArr5 = fArr6;
                                    next = ia30Var;
                                    paint12 = paint14;
                                    i23 = i26;
                                }
                                i4 = i23;
                                qa30Var = qa30Var3;
                                paint = paint12;
                                paint10.setColor(1140850688);
                                canvas.translate(2.0f, 2.0f);
                                canvas.drawPath(qa30Var.d, paint10);
                                canvas.translate(-2.0f, -2.0f);
                                paint10.setColor(-65536);
                                canvas.drawPath(qa30Var.d, paint10);
                                qa30Var3 = qa30Var;
                                paint9 = paint2;
                                it3 = it5;
                                c = i;
                                i10 = i3;
                                paint7 = paint;
                                i11 = i4;
                            } else {
                                i4 = i23;
                                qa30Var = qa30Var3;
                                paint = paint12;
                            }
                        } else {
                            qa30Var = qa30Var3;
                            i3 = i10;
                            paint = paint7;
                            paint2 = paint9;
                            i4 = i11;
                        }
                        qa30Var3 = qa30Var;
                        paint9 = paint2;
                        it3 = it5;
                        c = i;
                        i10 = i3;
                        paint7 = paint;
                        i11 = i4;
                    }
                }
                canvas.restore();
            }
        }
        ArrayList<MotionHelper> arrayList6 = this.mDecoratorsHelpers;
        if (arrayList6 != null) {
            Iterator<MotionHelper> it9 = arrayList6.iterator();
            while (it9.hasNext()) {
                it9.next().onPostDraw(canvas);
            }
        }
    }

    public void enableTransition(int i, boolean z) {
        xa30 transition = getTransition(i);
        if (z) {
            transition.o = false;
            return;
        }
        c cVar = this.mScene;
        if (transition == cVar.c) {
            Iterator it = cVar.i(this.mCurrentState).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                xa30 xa30Var = (xa30) it.next();
                if (!xa30Var.o) {
                    this.mScene.c = xa30Var;
                    break;
                }
            }
        }
        transition.o = true;
    }

    public void enableViewTransition(int i, boolean z) {
        c cVar = this.mScene;
        if (cVar != null) {
            Iterator it = ((ArrayList) cVar.r.b).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar.a == i) {
                    eVar.c = !z;
                    return;
                }
            }
        }
    }

    public void endTrigger(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ia30 ia30Var = this.mFrameArrayList.get(getChildAt(i));
            if (ia30Var != null && "button".equals(rug.d(ia30Var.b)) && ia30Var.A != null) {
                int i2 = 0;
                while (true) {
                    qjx[] qjxVarArr = ia30Var.A;
                    if (i2 < qjxVarArr.length) {
                        qjxVarArr[i2].h(z ? -100.0f : 100.0f, ia30Var.b);
                        i2++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void evaluate(boolean z) {
        boolean z2;
        char c;
        int childCount;
        Interpolator interpolator;
        int i;
        int i2;
        boolean z3;
        if (this.mTransitionLastTime == -1) {
            this.mTransitionLastTime = getNanoTime();
        }
        float f = this.mTransitionLastPosition;
        if (f > 0.0f && f < 1.0f) {
            this.mCurrentState = -1;
        }
        boolean z4 = false;
        if (this.mKeepAnimating || (this.mInTransition && (z || this.mTransitionGoalPosition != f))) {
            float signum = Math.signum(this.mTransitionGoalPosition - f);
            long nanoTime = getNanoTime();
            Interpolator interpolator2 = this.mInterpolator;
            float f2 = !(interpolator2 instanceof MotionInterpolator) ? (((nanoTime - this.mTransitionLastTime) * signum) * 1.0E-9f) / this.mTransitionDuration : 0.0f;
            float f3 = this.mTransitionLastPosition + f2;
            if (this.mTransitionInstantly) {
                f3 = this.mTransitionGoalPosition;
            }
            if ((signum <= 0.0f || f3 < this.mTransitionGoalPosition) && (signum > 0.0f || f3 > this.mTransitionGoalPosition)) {
                z2 = false;
            } else {
                f3 = this.mTransitionGoalPosition;
                this.mInTransition = false;
                z2 = true;
            }
            this.mTransitionLastPosition = f3;
            this.mTransitionPosition = f3;
            this.mTransitionLastTime = nanoTime;
            if (interpolator2 == null || z2) {
                this.mLastVelocity = f2;
            } else if (this.mTemporalInterpolator) {
                float interpolation = interpolator2.getInterpolation((nanoTime - this.mAnimationStartTime) * 1.0E-9f);
                Interpolator interpolator3 = this.mInterpolator;
                StopLogic stopLogic = this.mStopLogic;
                c = interpolator3 == stopLogic ? stopLogic.isStopped() ? (char) 2 : (char) 1 : (char) 0;
                this.mTransitionLastPosition = interpolation;
                this.mTransitionLastTime = nanoTime;
                Interpolator interpolator4 = this.mInterpolator;
                if (interpolator4 instanceof MotionInterpolator) {
                    float velocity = ((MotionInterpolator) interpolator4).getVelocity();
                    this.mLastVelocity = velocity;
                    if (Math.abs(velocity) * this.mTransitionDuration <= EPSILON && c == 2) {
                        this.mInTransition = false;
                    }
                    if (velocity > 0.0f && interpolation >= 1.0f) {
                        this.mTransitionLastPosition = 1.0f;
                        this.mInTransition = false;
                        interpolation = 1.0f;
                    }
                    if (velocity < 0.0f && interpolation <= 0.0f) {
                        this.mTransitionLastPosition = 0.0f;
                        this.mInTransition = false;
                        f3 = 0.0f;
                        if (Math.abs(this.mLastVelocity) > EPSILON) {
                            setState(TransitionState.MOVING);
                        }
                        if (c != 1) {
                            if ((signum > 0.0f && f3 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f3 <= this.mTransitionGoalPosition)) {
                                f3 = this.mTransitionGoalPosition;
                                this.mInTransition = false;
                            }
                            if (f3 >= 1.0f || f3 <= 0.0f) {
                                this.mInTransition = false;
                                setState(TransitionState.FINISHED);
                            }
                        }
                        childCount = getChildCount();
                        this.mKeepAnimating = false;
                        long nanoTime2 = getNanoTime();
                        this.mPostInterpolationPosition = f3;
                        Interpolator interpolator5 = this.mProgressInterpolator;
                        float interpolation2 = interpolator5 == null ? f3 : interpolator5.getInterpolation(f3);
                        interpolator = this.mProgressInterpolator;
                        if (interpolator != null) {
                            float interpolation3 = interpolator.getInterpolation((signum / this.mTransitionDuration) + f3);
                            this.mLastVelocity = interpolation3;
                            this.mLastVelocity = interpolation3 - this.mProgressInterpolator.getInterpolation(f3);
                        }
                        for (i = 0; i < childCount; i++) {
                            View childAt = getChildAt(i);
                            ia30 ia30Var = this.mFrameArrayList.get(childAt);
                            if (ia30Var != null) {
                                this.mKeepAnimating = ia30Var.f(interpolation2, nanoTime2, this.mKeyCache, childAt) | this.mKeepAnimating;
                            }
                        }
                        boolean z5 = (signum <= 0.0f && f3 >= this.mTransitionGoalPosition) || (signum <= 0.0f && f3 <= this.mTransitionGoalPosition);
                        if (!this.mKeepAnimating && !this.mInTransition && z5) {
                            setState(TransitionState.FINISHED);
                        }
                        if (this.mMeasureDuringTransition) {
                            requestLayout();
                        }
                        this.mKeepAnimating = (!z5) | this.mKeepAnimating;
                        if (f3 <= 0.0f && (i2 = this.mBeginState) != -1 && this.mCurrentState != i2) {
                            this.mCurrentState = i2;
                            this.mScene.b(i2).a(this);
                            setState(TransitionState.FINISHED);
                            z4 = true;
                        }
                        if (f3 >= 1.0d) {
                            int i3 = this.mCurrentState;
                            int i4 = this.mEndState;
                            if (i3 != i4) {
                                this.mCurrentState = i4;
                                this.mScene.b(i4).a(this);
                                setState(TransitionState.FINISHED);
                                z4 = true;
                            }
                        }
                        if (!this.mKeepAnimating || this.mInTransition) {
                            invalidate();
                        } else if ((signum > 0.0f && f3 == 1.0f) || (signum < 0.0f && f3 == 0.0f)) {
                            setState(TransitionState.FINISHED);
                        }
                        if (!this.mKeepAnimating && !this.mInTransition && ((signum > 0.0f && f3 == 1.0f) || (signum < 0.0f && f3 == 0.0f))) {
                            onNewStateAttachHandlers();
                        }
                    }
                }
                f3 = interpolation;
                if (Math.abs(this.mLastVelocity) > EPSILON) {
                }
                if (c != 1) {
                }
                childCount = getChildCount();
                this.mKeepAnimating = false;
                long nanoTime22 = getNanoTime();
                this.mPostInterpolationPosition = f3;
                Interpolator interpolator52 = this.mProgressInterpolator;
                if (interpolator52 == null) {
                }
                interpolator = this.mProgressInterpolator;
                if (interpolator != null) {
                }
                while (i < childCount) {
                }
                if (signum <= 0.0f) {
                }
                if (!this.mKeepAnimating) {
                    setState(TransitionState.FINISHED);
                }
                if (this.mMeasureDuringTransition) {
                }
                this.mKeepAnimating = (!z5) | this.mKeepAnimating;
                if (f3 <= 0.0f) {
                    this.mCurrentState = i2;
                    this.mScene.b(i2).a(this);
                    setState(TransitionState.FINISHED);
                    z4 = true;
                }
                if (f3 >= 1.0d) {
                }
                if (this.mKeepAnimating) {
                }
                invalidate();
                if (!this.mKeepAnimating) {
                    onNewStateAttachHandlers();
                }
            } else {
                float interpolation4 = interpolator2.getInterpolation(f3);
                Interpolator interpolator6 = this.mInterpolator;
                if (interpolator6 instanceof MotionInterpolator) {
                    this.mLastVelocity = ((MotionInterpolator) interpolator6).getVelocity();
                } else {
                    this.mLastVelocity = ((interpolator6.getInterpolation(f3 + f2) - interpolation4) * signum) / f2;
                }
                f3 = interpolation4;
            }
            c = 0;
            if (Math.abs(this.mLastVelocity) > EPSILON) {
            }
            if (c != 1) {
            }
            childCount = getChildCount();
            this.mKeepAnimating = false;
            long nanoTime222 = getNanoTime();
            this.mPostInterpolationPosition = f3;
            Interpolator interpolator522 = this.mProgressInterpolator;
            if (interpolator522 == null) {
            }
            interpolator = this.mProgressInterpolator;
            if (interpolator != null) {
            }
            while (i < childCount) {
            }
            if (signum <= 0.0f) {
            }
            if (!this.mKeepAnimating) {
            }
            if (this.mMeasureDuringTransition) {
            }
            this.mKeepAnimating = (!z5) | this.mKeepAnimating;
            if (f3 <= 0.0f) {
            }
            if (f3 >= 1.0d) {
            }
            if (this.mKeepAnimating) {
            }
            invalidate();
            if (!this.mKeepAnimating) {
            }
        }
        float f4 = this.mTransitionLastPosition;
        if (f4 < 1.0f) {
            if (f4 <= 0.0f) {
                int i5 = this.mCurrentState;
                int i6 = this.mBeginState;
                z3 = i5 == i6 ? z4 : true;
                this.mCurrentState = i6;
            }
            this.mNeedsFireTransitionCompleted |= z4;
            if (z4 && !this.mInLayout) {
                requestLayout();
            }
            this.mTransitionPosition = this.mTransitionLastPosition;
        }
        int i7 = this.mCurrentState;
        int i8 = this.mEndState;
        z3 = i7 == i8 ? z4 : true;
        this.mCurrentState = i8;
        z4 = z3;
        this.mNeedsFireTransitionCompleted |= z4;
        if (z4) {
            requestLayout();
        }
        this.mTransitionPosition = this.mTransitionLastPosition;
    }

    public void fireTransitionCompleted() {
        CopyOnWriteArrayList<sa30> copyOnWriteArrayList;
        if ((this.mTransitionListener != null || ((copyOnWriteArrayList = this.mTransitionListeners) != null && !copyOnWriteArrayList.isEmpty())) && this.mListenerState == -1) {
            this.mListenerState = this.mCurrentState;
            int intValue = !this.mTransitionCompleted.isEmpty() ? ((Integer) unr0.k(1, this.mTransitionCompleted)).intValue() : -1;
            int i = this.mCurrentState;
            if (intValue != i && i != -1) {
                this.mTransitionCompleted.add(Integer.valueOf(i));
            }
        }
        processTransitionCompleted();
        Runnable runnable = this.mOnComplete;
        if (runnable != null) {
            runnable.run();
            this.mOnComplete = null;
        }
        int[] iArr = this.mScheduledTransitionTo;
        if (iArr == null || this.mScheduledTransitions <= 0) {
            return;
        }
        transitionToState(iArr[0]);
        int[] iArr2 = this.mScheduledTransitionTo;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.mScheduledTransitions--;
    }

    public void fireTrigger(int i, boolean z, float f) {
        sa30 sa30Var = this.mTransitionListener;
        if (sa30Var != null) {
            sa30Var.onTransitionTrigger(this, i, z, f);
        }
        CopyOnWriteArrayList<sa30> copyOnWriteArrayList = this.mTransitionListeners;
        if (copyOnWriteArrayList != null) {
            Iterator<sa30> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().onTransitionTrigger(this, i, z, f);
            }
        }
    }

    public void getAnchorDpDt(int i, float f, float f2, float f3, float[] fArr) {
        HashMap<View, ia30> hashMap = this.mFrameArrayList;
        View viewById = getViewById(i);
        ia30 ia30Var = hashMap.get(viewById);
        if (ia30Var != null) {
            ia30Var.d(f, f2, f3, fArr);
            float y = viewById.getY();
            this.mLastPos = f;
            this.mLastY = y;
            return;
        }
        if (viewById == null) {
            new StringBuilder("").append(i);
        } else {
            viewById.getContext().getResources().getResourceName(i);
        }
    }

    public androidx.constraintlayout.widget.e getConstraintSet(int i) {
        c cVar = this.mScene;
        if (cVar == null) {
            return null;
        }
        return cVar.b(i);
    }

    public int[] getConstraintSetIds() {
        c cVar = this.mScene;
        if (cVar == null) {
            return null;
        }
        SparseArray sparseArray = cVar.h;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = sparseArray.keyAt(i);
        }
        return iArr;
    }

    public String getConstraintSetNames(int i) {
        c cVar = this.mScene;
        if (cVar == null) {
            return null;
        }
        for (Map.Entry entry : cVar.i.entrySet()) {
            Integer num = (Integer) entry.getValue();
            if (num != null && num.intValue() == i) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    public int getCurrentState() {
        return this.mCurrentState;
    }

    public ArrayList<xa30> getDefinedTransitions() {
        c cVar = this.mScene;
        if (cVar == null) {
            return null;
        }
        return cVar.e;
    }

    public pyi getDesignTool() {
        if (this.mDesignTool == null) {
            this.mDesignTool = new pyi();
        }
        return this.mDesignTool;
    }

    public int getEndState() {
        return this.mEndState;
    }

    public int[] getMatchingConstraintSetIds(String... strArr) {
        c cVar = this.mScene;
        if (cVar == null) {
            return null;
        }
        SparseArray sparseArray = cVar.h;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.constraintlayout.widget.e eVar = (androidx.constraintlayout.widget.e) sparseArray.valueAt(i2);
            int keyAt = sparseArray.keyAt(i2);
            eVar.getClass();
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    String[] strArr2 = eVar.c;
                    iArr[i] = keyAt;
                    i++;
                    break;
                }
                String str = strArr[i3];
                for (String str2 : eVar.c) {
                    if (str2.equals(str)) {
                        break;
                    }
                }
                i3++;
            }
        }
        return Arrays.copyOf(iArr, i);
    }

    public ia30 getMotionController(int i) {
        return this.mFrameArrayList.get(findViewById(i));
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.mTransitionLastPosition;
    }

    public c getScene() {
        return this.mScene;
    }

    public int getStartState() {
        return this.mBeginState;
    }

    public float getTargetPosition() {
        return this.mTransitionGoalPosition;
    }

    public xa30 getTransition(int i) {
        Iterator it = this.mScene.e.iterator();
        while (it.hasNext()) {
            xa30 xa30Var = (xa30) it.next();
            if (xa30Var.a == i) {
                return xa30Var;
            }
        }
        return null;
    }

    public Bundle getTransitionState() {
        if (this.mStateCache == null) {
            this.mStateCache = new b(this);
        }
        b bVar = this.mStateCache;
        MotionLayout motionLayout = bVar.e;
        bVar.d = motionLayout.mEndState;
        bVar.c = motionLayout.mBeginState;
        bVar.b = motionLayout.getVelocity();
        bVar.a = motionLayout.getProgress();
        b bVar2 = this.mStateCache;
        bVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", bVar2.a);
        bundle.putFloat("motion.velocity", bVar2.b);
        bundle.putInt("motion.StartState", bVar2.c);
        bundle.putInt("motion.EndState", bVar2.d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        if (this.mScene != null) {
            this.mTransitionDuration = r0.c() / 1000.0f;
        }
        return (long) (this.mTransitionDuration * 1000.0f);
    }

    public float getVelocity() {
        return this.mLastVelocity;
    }

    public void getViewVelocity(View view, float f, float f2, float[] fArr, int i) {
        float[] fArr2;
        float f3;
        char c;
        char c2;
        ia30 ia30Var;
        float[] fArr3;
        ta30 ta30Var;
        jst0 jst0Var;
        int i2;
        double[] dArr;
        float f4 = this.mLastVelocity;
        float f5 = this.mTransitionLastPosition;
        if (this.mInterpolator != null) {
            float signum = Math.signum(this.mTransitionGoalPosition - f5);
            float interpolation = this.mInterpolator.getInterpolation(this.mTransitionLastPosition + EPSILON);
            float interpolation2 = this.mInterpolator.getInterpolation(this.mTransitionLastPosition);
            f4 = (((interpolation - interpolation2) / EPSILON) * signum) / this.mTransitionDuration;
            f5 = interpolation2;
        }
        Interpolator interpolator = this.mInterpolator;
        if (interpolator instanceof MotionInterpolator) {
            f4 = ((MotionInterpolator) interpolator).getVelocity();
        }
        float f6 = f4;
        ia30 ia30Var2 = this.mFrameArrayList.get(view);
        if ((i & 1) == 0) {
            int width = view.getWidth();
            int height = view.getHeight();
            float[] fArr4 = ia30Var2.v;
            ta30 ta30Var2 = ia30Var2.f;
            float b = ia30Var2.b(fArr4, f5);
            HashMap hashMap = ia30Var2.y;
            jst0 jst0Var2 = hashMap == null ? null : (jst0) hashMap.get("translationX");
            HashMap hashMap2 = ia30Var2.y;
            jst0 jst0Var3 = hashMap2 == null ? null : (jst0) hashMap2.get("translationY");
            HashMap hashMap3 = ia30Var2.y;
            c = 0;
            jst0 jst0Var4 = hashMap3 == null ? null : (jst0) hashMap3.get("rotation");
            c2 = 1;
            HashMap hashMap4 = ia30Var2.y;
            jst0 jst0Var5 = hashMap4 == null ? null : (jst0) hashMap4.get("scaleX");
            f3 = f6;
            HashMap hashMap5 = ia30Var2.y;
            jst0 jst0Var6 = hashMap5 == null ? null : (jst0) hashMap5.get("scaleY");
            HashMap hashMap6 = ia30Var2.z;
            ws31 ws31Var = hashMap6 == null ? null : (ws31) hashMap6.get("translationX");
            HashMap hashMap7 = ia30Var2.z;
            ws31 ws31Var2 = hashMap7 == null ? null : (ws31) hashMap7.get("translationY");
            HashMap hashMap8 = ia30Var2.z;
            ws31 ws31Var3 = hashMap8 == null ? null : (ws31) hashMap8.get("rotation");
            HashMap hashMap9 = ia30Var2.z;
            ws31 ws31Var4 = hashMap9 == null ? null : (ws31) hashMap9.get("scaleX");
            HashMap hashMap10 = ia30Var2.z;
            ws31 ws31Var5 = hashMap10 == null ? null : (ws31) hashMap10.get("scaleY");
            n631 n631Var = new n631();
            n631Var.e = 0.0f;
            n631Var.d = 0.0f;
            n631Var.c = 0.0f;
            n631Var.b = 0.0f;
            n631Var.a = 0.0f;
            if (jst0Var4 != null) {
                ia30Var = ia30Var2;
                fArr3 = fArr4;
                n631Var.e = (float) jst0Var4.a.e(b);
                n631Var.f = jst0Var4.a(b);
            } else {
                ia30Var = ia30Var2;
                fArr3 = fArr4;
            }
            if (jst0Var2 != null) {
                ta30Var = ta30Var2;
                jst0Var = jst0Var2;
                n631Var.c = (float) jst0Var2.a.e(b);
            } else {
                ta30Var = ta30Var2;
                jst0Var = jst0Var2;
            }
            if (jst0Var3 != null) {
                n631Var.d = (float) jst0Var3.a.e(b);
            }
            if (jst0Var5 != null) {
                n631Var.a = (float) jst0Var5.a.e(b);
            }
            if (jst0Var6 != null) {
                n631Var.b = (float) jst0Var6.a.e(b);
            }
            if (ws31Var3 != null) {
                n631Var.e = ws31Var3.b(b);
            }
            if (ws31Var != null) {
                n631Var.c = ws31Var.b(b);
            }
            if (ws31Var2 != null) {
                n631Var.d = ws31Var2.b(b);
            }
            if (ws31Var4 != null) {
                n631Var.a = ws31Var4.b(b);
            }
            if (ws31Var5 != null) {
                n631Var.b = ws31Var5.b(b);
            }
            ia30 ia30Var3 = ia30Var;
            z33 z33Var = ia30Var3.k;
            if (z33Var != null) {
                double[] dArr2 = ia30Var3.p;
                if (dArr2.length > 0) {
                    double d = b;
                    z33Var.c(d, dArr2);
                    ia30Var3.k.f(d, ia30Var3.q);
                    int[] iArr = ia30Var3.o;
                    double[] dArr3 = ia30Var3.q;
                    double[] dArr4 = ia30Var3.p;
                    ta30Var.getClass();
                    ta30.e(f, f2, fArr, iArr, dArr3, dArr4);
                }
                n631Var.a(f, f2, width, height, fArr);
            } else if (ia30Var3.j != null) {
                float[] fArr5 = fArr3;
                double b2 = ia30Var3.b(fArr5, b);
                ia30Var3.j[0].f(b2, ia30Var3.q);
                ia30Var3.j[0].c(b2, ia30Var3.p);
                float f7 = fArr5[0];
                int i3 = 0;
                while (true) {
                    dArr = ia30Var3.q;
                    if (i3 >= dArr.length) {
                        break;
                    }
                    dArr[i3] = dArr[i3] * f7;
                    i3++;
                }
                int[] iArr2 = ia30Var3.o;
                double[] dArr5 = ia30Var3.p;
                ta30Var.getClass();
                ta30.e(f, f2, fArr, iArr2, dArr, dArr5);
                n631Var.a(f, f2, width, height, fArr);
            } else {
                ta30 ta30Var3 = ia30Var3.g;
                ta30 ta30Var4 = ta30Var;
                float f8 = ta30Var3.x - ta30Var4.x;
                float f9 = ta30Var3.y - ta30Var4.y;
                float f10 = ta30Var3.z - ta30Var4.z;
                float f11 = f9 + (ta30Var3.A - ta30Var4.A);
                fArr[0] = ((f8 + f10) * f) + ((1.0f - f) * f8);
                fArr[1] = (f11 * f2) + ((1.0f - f2) * f9);
                n631Var.e = 0.0f;
                n631Var.d = 0.0f;
                n631Var.c = 0.0f;
                n631Var.b = 0.0f;
                n631Var.a = 0.0f;
                if (jst0Var4 != null) {
                    i2 = height;
                    n631Var.e = (float) jst0Var4.a.e(b);
                    n631Var.f = jst0Var4.a(b);
                } else {
                    i2 = height;
                }
                if (jst0Var != null) {
                    n631Var.c = (float) jst0Var.a.e(b);
                }
                if (jst0Var3 != null) {
                    n631Var.d = (float) jst0Var3.a.e(b);
                }
                if (jst0Var5 != null) {
                    n631Var.a = (float) jst0Var5.a.e(b);
                }
                if (jst0Var6 != null) {
                    n631Var.b = (float) jst0Var6.a.e(b);
                }
                if (ws31Var3 != null) {
                    n631Var.e = ws31Var3.b(b);
                }
                if (ws31Var != null) {
                    n631Var.c = ws31Var.b(b);
                }
                if (ws31Var2 != null) {
                    n631Var.d = ws31Var2.b(b);
                }
                if (ws31Var4 != null) {
                    n631Var.a = ws31Var4.b(b);
                }
                if (ws31Var5 != null) {
                    n631Var.b = ws31Var5.b(b);
                }
                fArr2 = fArr;
                n631Var.a(f, f2, width, i2, fArr2);
            }
            fArr2 = fArr;
        } else {
            fArr2 = fArr;
            f3 = f6;
            c = 0;
            c2 = 1;
            ia30Var2.d(f5, f, f2, fArr2);
        }
        if (i < 2) {
            fArr2[c] = fArr2[c] * f3;
            fArr2[c2] = fArr2[c2] * f3;
        }
    }

    public boolean isDelayedApplicationOfInitialState() {
        return this.mDelayedApply;
    }

    public boolean isInRotation() {
        return this.mInRotation;
    }

    public boolean isInteractionEnabled() {
        return this.mInteractionEnabled;
    }

    public boolean isViewTransitionEnabled(int i) {
        c cVar = this.mScene;
        if (cVar != null) {
            Iterator it = ((ArrayList) cVar.r.b).iterator();
            while (it.hasNext()) {
                if (((e) it.next()).a == i) {
                    return !r1.c;
                }
            }
        }
        return false;
    }

    public void jumpToState(int i) {
        if (!isAttachedToWindow()) {
            this.mCurrentState = i;
        }
        if (this.mBeginState == i) {
            setProgress(0.0f);
        } else if (this.mEndState == i) {
            setProgress(1.0f);
        } else {
            setTransition(i, i);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void loadLayoutDescription(int i) {
        xa30 xa30Var;
        if (i == 0) {
            this.mScene = null;
            return;
        }
        try {
            c cVar = new c(getContext(), this, i);
            this.mScene = cVar;
            int i2 = -1;
            if (this.mCurrentState == -1) {
                this.mCurrentState = cVar.h();
                this.mBeginState = this.mScene.h();
                xa30 xa30Var2 = this.mScene.c;
                if (xa30Var2 != null) {
                    i2 = xa30Var2.c;
                }
                this.mEndState = i2;
            }
            if (!isAttachedToWindow()) {
                this.mScene = null;
                return;
            }
            try {
                Display display = getDisplay();
                int i3 = 0;
                this.mPreviouseRotation = display == null ? 0 : display.getRotation();
                c cVar2 = this.mScene;
                if (cVar2 != null) {
                    androidx.constraintlayout.widget.e b = cVar2.b(this.mCurrentState);
                    this.mScene.o(this);
                    ArrayList<MotionHelper> arrayList = this.mDecoratorsHelpers;
                    if (arrayList != null) {
                        Iterator<MotionHelper> it = arrayList.iterator();
                        while (it.hasNext()) {
                            it.next().onFinishedMotionScene(this);
                        }
                    }
                    if (b != null) {
                        b.b(this);
                    }
                    this.mBeginState = this.mCurrentState;
                }
                onNewStateAttachHandlers();
                b bVar = this.mStateCache;
                if (bVar != null) {
                    if (this.mDelayedApply) {
                        post(new pa30(this, i3));
                        return;
                    } else {
                        bVar.a();
                        return;
                    }
                }
                c cVar3 = this.mScene;
                if (cVar3 == null || (xa30Var = cVar3.c) == null || xa30Var.n != 4) {
                    return;
                }
                transitionToEnd();
                setState(TransitionState.SETUP);
                setState(TransitionState.MOVING);
            } catch (Exception e) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e);
            }
        } catch (Exception e2) {
            yci0.p("unable to parse MotionScene file", e2);
        }
    }

    public int lookUpConstraintId(String str) {
        Integer num;
        c cVar = this.mScene;
        if (cVar == null || (num = (Integer) cVar.i.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public ra30 obtainVelocityTracker() {
        ryh ryhVar = ryh.c;
        ryhVar.b = VelocityTracker.obtain();
        return ryhVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        xa30 xa30Var;
        int i;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.mPreviouseRotation = display.getRotation();
        }
        c cVar = this.mScene;
        if (cVar != null && (i = this.mCurrentState) != -1) {
            androidx.constraintlayout.widget.e b = cVar.b(i);
            this.mScene.o(this);
            ArrayList<MotionHelper> arrayList = this.mDecoratorsHelpers;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().onFinishedMotionScene(this);
                }
            }
            if (b != null) {
                b.b(this);
            }
            this.mBeginState = this.mCurrentState;
        }
        onNewStateAttachHandlers();
        b bVar = this.mStateCache;
        if (bVar != null) {
            if (this.mDelayedApply) {
                post(new pa30(this, 2));
                return;
            } else {
                bVar.a();
                return;
            }
        }
        c cVar2 = this.mScene;
        if (cVar2 == null || (xa30Var = cVar2.c) == null || xa30Var.n != 4) {
            return;
        }
        transitionToEnd();
        setState(TransitionState.SETUP);
        setState(TransitionState.MOVING);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x00f9  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        xa30 xa30Var;
        d dVar;
        int i;
        RectF b;
        Iterator it;
        c cVar = this.mScene;
        if (cVar == null || !this.mInteractionEnabled) {
            return false;
        }
        vmn0 vmn0Var = cVar.r;
        if (vmn0Var != null) {
            ArrayList arrayList = (ArrayList) vmn0Var.b;
            MotionLayout motionLayout = (MotionLayout) vmn0Var.a;
            int currentState = motionLayout.getCurrentState();
            if (currentState != -1) {
                if (((HashSet) vmn0Var.c) == null) {
                    vmn0Var.c = new HashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        e eVar = (e) it2.next();
                        int childCount = motionLayout.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = motionLayout.getChildAt(i2);
                            if (eVar.c(childAt)) {
                                childAt.getId();
                                ((HashSet) vmn0Var.c).add(childAt);
                            }
                        }
                    }
                }
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList arrayList2 = (ArrayList) vmn0Var.x;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    Iterator it3 = ((ArrayList) vmn0Var.x).iterator();
                    while (it3.hasNext()) {
                        wv31 wv31Var = (wv31) it3.next();
                        Rect rect2 = wv31Var.l;
                        if (action != 1) {
                            if (action == 2) {
                                wv31Var.c.b.getHitRect(rect2);
                                if (!rect2.contains((int) x, (int) y) && !wv31Var.h) {
                                    wv31Var.b();
                                }
                            }
                        } else if (!wv31Var.h) {
                            wv31Var.b();
                        }
                    }
                }
                z = false;
                if (action == 0 || action == 1) {
                    androidx.constraintlayout.widget.e constraintSet = motionLayout.getConstraintSet(currentState);
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        e eVar2 = (e) it4.next();
                        int i3 = eVar2.b;
                        if (i3 == 1) {
                            if (action == 0) {
                                it = ((HashSet) vmn0Var.c).iterator();
                                while (it.hasNext()) {
                                    View view = (View) it.next();
                                    if (eVar2.c(view)) {
                                        view.getHitRect(rect);
                                        if (rect.contains((int) x, (int) y)) {
                                            eVar2.a(vmn0Var, (MotionLayout) vmn0Var.a, currentState, constraintSet, view);
                                        }
                                    }
                                }
                            }
                        } else if (i3 == 2) {
                            if (action == 1) {
                                it = ((HashSet) vmn0Var.c).iterator();
                                while (it.hasNext()) {
                                }
                            }
                        } else if (i3 == 3 && action == 0) {
                            it = ((HashSet) vmn0Var.c).iterator();
                            while (it.hasNext()) {
                            }
                        }
                    }
                }
                xa30Var = this.mScene.c;
                if (xa30Var != null || xa30Var.o || (dVar = xa30Var.l) == null) {
                    return z;
                }
                if ((motionEvent.getAction() == 0 && (b = dVar.b(this, new RectF())) != null && !b.contains(motionEvent.getX(), motionEvent.getY())) || (i = dVar.e) == -1) {
                    return z;
                }
                View view2 = this.mRegionView;
                if (view2 == null || view2.getId() != i) {
                    this.mRegionView = findViewById(i);
                }
                if (this.mRegionView == null) {
                    return z;
                }
                this.mBoundsCheck.set(r1.getLeft(), this.mRegionView.getTop(), this.mRegionView.getRight(), this.mRegionView.getBottom());
                return (!this.mBoundsCheck.contains(motionEvent.getX(), motionEvent.getY()) || handlesTouchEvent((float) this.mRegionView.getLeft(), (float) this.mRegionView.getTop(), this.mRegionView, motionEvent)) ? z : onTouchEvent(motionEvent);
            }
        }
        z = false;
        xa30Var = this.mScene.c;
        return xa30Var != null ? z : z;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.mInLayout = true;
        try {
            if (this.mScene == null) {
                super.onLayout(z, i, i2, i3, i4);
                this.mInLayout = false;
                return;
            }
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.mLastLayoutWidth != i5 || this.mLastLayoutHeight != i6) {
                rebuildScene();
                evaluate(true);
            }
            this.mLastLayoutWidth = i5;
            this.mLastLayoutHeight = i6;
            this.mOldWidth = i5;
            this.mOldHeight = i6;
            this.mInLayout = false;
        } catch (Throwable th) {
            this.mInLayout = false;
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        if (r4 == r6.f) goto L31;
     */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.mScene == null) {
            super.onMeasure(i, i2);
            return;
        }
        boolean z = false;
        boolean z2 = (this.mLastWidthMeasureSpec == i && this.mLastHeightMeasureSpec == i2) ? false : true;
        if (this.mNeedsFireTransitionCompleted) {
            this.mNeedsFireTransitionCompleted = false;
            onNewStateAttachHandlers();
            processTransitionCompleted();
            z2 = true;
        }
        if (this.mDirtyHierarchy) {
            z2 = true;
        }
        this.mLastWidthMeasureSpec = i;
        this.mLastHeightMeasureSpec = i2;
        int h = this.mScene.h();
        xa30 xa30Var = this.mScene.c;
        int i5 = xa30Var == null ? -1 : xa30Var.c;
        if (!z2) {
            a aVar = this.mModel;
            if (h == aVar.e) {
            }
        }
        if (this.mBeginState != -1) {
            super.onMeasure(i, i2);
            this.mModel.e(this.mScene.b(h), this.mScene.b(i5));
            this.mModel.f();
            a aVar2 = this.mModel;
            aVar2.e = h;
            aVar2.f = i5;
            if (!this.mMeasureDuringTransition || z) {
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int s = this.mLayoutWidget.s() + getPaddingRight() + getPaddingLeft();
                int m = this.mLayoutWidget.m() + paddingBottom;
                i3 = this.mWidthMeasureMode;
                if (i3 != Integer.MIN_VALUE || i3 == 0) {
                    s = (int) ((this.mPostInterpolationPosition * (this.mEndWrapWidth - r9)) + this.mStartWrapWidth);
                    requestLayout();
                }
                i4 = this.mHeightMeasureMode;
                if (i4 != Integer.MIN_VALUE || i4 == 0) {
                    m = (int) ((this.mPostInterpolationPosition * (this.mEndWrapHeight - r10)) + this.mStartWrapHeight);
                    requestLayout();
                }
                setMeasuredDimension(s, m);
            }
            evaluateLayout();
        }
        if (z2) {
            super.onMeasure(i, i2);
        }
        z = true;
        if (!this.mMeasureDuringTransition) {
        }
        int paddingBottom2 = getPaddingBottom() + getPaddingTop();
        int s2 = this.mLayoutWidget.s() + getPaddingRight() + getPaddingLeft();
        int m2 = this.mLayoutWidget.m() + paddingBottom2;
        i3 = this.mWidthMeasureMode;
        if (i3 != Integer.MIN_VALUE) {
        }
        s2 = (int) ((this.mPostInterpolationPosition * (this.mEndWrapWidth - r9)) + this.mStartWrapWidth);
        requestLayout();
        i4 = this.mHeightMeasureMode;
        if (i4 != Integer.MIN_VALUE) {
        }
        m2 = (int) ((this.mPostInterpolationPosition * (this.mEndWrapHeight - r10)) + this.mStartWrapHeight);
        requestLayout();
        setMeasuredDimension(s2, m2);
        evaluateLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // defpackage.tn50
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        xa30 xa30Var;
        boolean z;
        float f;
        d dVar;
        float f2;
        d dVar2;
        d dVar3;
        d dVar4;
        int i4;
        c cVar = this.mScene;
        if (cVar == null || (xa30Var = cVar.c) == null || (z = xa30Var.o)) {
            return;
        }
        int i5 = -1;
        if (z || (dVar4 = xa30Var.l) == null || (i4 = dVar4.e) == -1 || view.getId() == i4) {
            xa30 xa30Var2 = cVar.c;
            if ((xa30Var2 == null || (dVar3 = xa30Var2.l) == null) ? false : dVar3.u) {
                d dVar5 = xa30Var.l;
                if (dVar5 != null && (dVar5.w & 4) != 0) {
                    i5 = i2;
                }
                float f3 = this.mTransitionPosition;
                if ((f3 == 1.0f || f3 == 0.0f) && view.canScrollVertically(i5)) {
                    return;
                }
            }
            d dVar6 = xa30Var.l;
            if (dVar6 == null || (dVar6.w & 1) == 0) {
                f = 0.0f;
            } else {
                float f4 = i;
                float f5 = i2;
                xa30 xa30Var3 = cVar.c;
                if (xa30Var3 == null || (dVar2 = xa30Var3.l) == null) {
                    f = 0.0f;
                    f2 = 0.0f;
                } else {
                    float[] fArr = dVar2.n;
                    f = 0.0f;
                    dVar2.r.getAnchorDpDt(dVar2.d, dVar2.r.getProgress(), dVar2.h, dVar2.g, fArr);
                    float f6 = dVar2.k;
                    if (f6 != 0.0f) {
                        if (fArr[0] == 0.0f) {
                            fArr[0] = 1.0E-7f;
                        }
                        f2 = (f4 * f6) / fArr[0];
                    } else {
                        if (fArr[1] == 0.0f) {
                            fArr[1] = 1.0E-7f;
                        }
                        f2 = (f5 * dVar2.l) / fArr[1];
                    }
                }
                float f7 = this.mTransitionLastPosition;
                if ((f7 <= f && f2 < f) || (f7 >= 1.0f && f2 > f)) {
                    view.setNestedScrollingEnabled(false);
                    view.post(new ci(view, 3));
                    return;
                }
            }
            float f8 = this.mTransitionPosition;
            long nanoTime = getNanoTime();
            float f9 = i;
            this.mScrollTargetDX = f9;
            float f10 = i2;
            this.mScrollTargetDY = f10;
            this.mScrollTargetDT = (float) ((nanoTime - this.mScrollTargetTime) * 1.0E-9d);
            this.mScrollTargetTime = nanoTime;
            xa30 xa30Var4 = cVar.c;
            if (xa30Var4 != null && (dVar = xa30Var4.l) != null) {
                float[] fArr2 = dVar.n;
                MotionLayout motionLayout = dVar.r;
                float progress = motionLayout.getProgress();
                if (!dVar.m) {
                    dVar.m = true;
                    motionLayout.setProgress(progress);
                }
                dVar.r.getAnchorDpDt(dVar.d, progress, dVar.h, dVar.g, fArr2);
                if (Math.abs((dVar.l * fArr2[1]) + (dVar.k * fArr2[0])) < 0.01d) {
                    fArr2[0] = 0.01f;
                    fArr2[1] = 0.01f;
                }
                float f11 = dVar.k;
                float max = Math.max(Math.min(progress + (f11 != f ? (f9 * f11) / fArr2[0] : (f10 * dVar.l) / fArr2[1]), 1.0f), f);
                if (max != motionLayout.getProgress()) {
                    motionLayout.setProgress(max);
                }
            }
            if (f8 != this.mTransitionPosition) {
                iArr[0] = i;
                iArr[1] = i2;
            }
            evaluate(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.mUndergoingMotion = true;
        }
    }

    @Override // defpackage.un50
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (this.mUndergoingMotion || i != 0 || i2 != 0) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }
        this.mUndergoingMotion = false;
    }

    @Override // defpackage.tn50
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.mScrollTargetTime = getNanoTime();
        this.mScrollTargetDT = 0.0f;
        this.mScrollTargetDX = 0.0f;
        this.mScrollTargetDY = 0.0f;
    }

    public void onNewStateAttachHandlers() {
        xa30 xa30Var;
        final d dVar;
        View view;
        c cVar = this.mScene;
        if (cVar == null) {
            return;
        }
        if (cVar.a(this, this.mCurrentState)) {
            requestLayout();
            return;
        }
        int i = this.mCurrentState;
        if (i != -1) {
            c cVar2 = this.mScene;
            ArrayList arrayList = cVar2.g;
            ArrayList arrayList2 = cVar2.e;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                xa30 xa30Var2 = (xa30) it.next();
                if (xa30Var2.m.size() > 0) {
                    Iterator it2 = xa30Var2.m.iterator();
                    while (it2.hasNext()) {
                        ((MotionScene$Transition$TransitionOnClick) it2.next()).removeOnClickListeners(this);
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                xa30 xa30Var3 = (xa30) it3.next();
                if (xa30Var3.m.size() > 0) {
                    Iterator it4 = xa30Var3.m.iterator();
                    while (it4.hasNext()) {
                        ((MotionScene$Transition$TransitionOnClick) it4.next()).removeOnClickListeners(this);
                    }
                }
            }
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                xa30 xa30Var4 = (xa30) it5.next();
                if (xa30Var4.m.size() > 0) {
                    Iterator it6 = xa30Var4.m.iterator();
                    while (it6.hasNext()) {
                        ((MotionScene$Transition$TransitionOnClick) it6.next()).addOnClickListeners(this, i, xa30Var4);
                    }
                }
            }
            Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                xa30 xa30Var5 = (xa30) it7.next();
                if (xa30Var5.m.size() > 0) {
                    Iterator it8 = xa30Var5.m.iterator();
                    while (it8.hasNext()) {
                        ((MotionScene$Transition$TransitionOnClick) it8.next()).addOnClickListeners(this, i, xa30Var5);
                    }
                }
            }
        }
        if (!this.mScene.q() || (xa30Var = this.mScene.c) == null || (dVar = xa30Var.l) == null) {
            return;
        }
        MotionLayout motionLayout = dVar.r;
        int i2 = dVar.d;
        if (i2 != -1) {
            view = motionLayout.findViewById(i2);
            if (view == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + rug.c(dVar.d, motionLayout.getContext()));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new View.OnTouchListener() { // from class: androidx.constraintlayout.motion.widget.TouchResponse$1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    return false;
                }
            });
            nestedScrollView.setOnScrollChangeListener(new ezz0());
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        d dVar;
        c cVar = this.mScene;
        if (cVar != null) {
            boolean isRtl = isRtl();
            cVar.q = isRtl;
            xa30 xa30Var = cVar.c;
            if (xa30Var == null || (dVar = xa30Var.l) == null) {
                return;
            }
            dVar.c(isRtl);
        }
    }

    @Override // defpackage.tn50
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        xa30 xa30Var;
        d dVar;
        c cVar = this.mScene;
        return (cVar == null || (xa30Var = cVar.c) == null || (dVar = xa30Var.l) == null || (dVar.w & 2) != 0) ? false : true;
    }

    @Override // defpackage.tn50
    public void onStopNestedScroll(View view, int i) {
        d dVar;
        int i2;
        c cVar = this.mScene;
        if (cVar != null) {
            float f = this.mScrollTargetDT;
            if (f == 0.0f) {
                return;
            }
            float f2 = this.mScrollTargetDX / f;
            float f3 = this.mScrollTargetDY / f;
            xa30 xa30Var = cVar.c;
            if (xa30Var == null || (dVar = xa30Var.l) == null) {
                return;
            }
            float[] fArr = dVar.n;
            dVar.m = false;
            MotionLayout motionLayout = dVar.r;
            float progress = motionLayout.getProgress();
            dVar.r.getAnchorDpDt(dVar.d, progress, dVar.h, dVar.g, fArr);
            float f4 = dVar.k;
            float f5 = f4 != 0.0f ? (f2 * f4) / fArr[0] : (f3 * dVar.l) / fArr[1];
            if (!Float.isNaN(f5)) {
                progress += f5 / 3.0f;
            }
            if (progress == 0.0f || progress == 1.0f || (i2 = dVar.c) == 3) {
                return;
            }
            motionLayout.touchAnimateTo(i2, ((double) progress) >= 0.5d ? 1.0f : 0.0f, f5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x07bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x07c0 A[RETURN] */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v20 */
    /* JADX WARN: Type inference failed for: r20v21 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ra30 ra30Var;
        ra30 ra30Var2;
        d dVar;
        char c;
        char c2;
        int i;
        float f;
        int i2;
        char c3;
        char c4;
        float right;
        float f2;
        int top;
        int bottom;
        int i3;
        float f3;
        float f4;
        int i4;
        boolean z;
        float f5;
        float[] fArr;
        ?? r20;
        xa30 xa30Var;
        MotionEvent motionEvent2;
        xa30 xa30Var2;
        float f6;
        float f7;
        MotionEvent motionEvent3;
        RectF a;
        c cVar = this.mScene;
        if (cVar == null || !this.mInteractionEnabled || !cVar.q()) {
            return super.onTouchEvent(motionEvent);
        }
        c cVar2 = this.mScene;
        xa30 xa30Var3 = cVar2.c;
        if (xa30Var3 != null && xa30Var3.o) {
            return super.onTouchEvent(motionEvent);
        }
        int currentState = getCurrentState();
        MotionLayout motionLayout = cVar2.a;
        RectF rectF = new RectF();
        if (cVar2.p == null) {
            cVar2.p = motionLayout.obtainVelocityTracker();
        }
        VelocityTracker velocityTracker = (VelocityTracker) ((ryh) cVar2.p).b;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (currentState != -1) {
            int action = motionEvent.getAction();
            if (action == 0) {
                cVar2.s = motionEvent.getRawX();
                cVar2.t = motionEvent.getRawY();
                cVar2.m = motionEvent;
                cVar2.n = false;
                d dVar2 = cVar2.c.l;
                if (dVar2 != null) {
                    RectF a2 = dVar2.a(motionLayout, rectF);
                    if (a2 == null || a2.contains(cVar2.m.getX(), cVar2.m.getY())) {
                        RectF b = cVar2.c.l.b(motionLayout, rectF);
                        if (b == null || b.contains(cVar2.m.getX(), cVar2.m.getY())) {
                            cVar2.o = false;
                        } else {
                            cVar2.o = true;
                        }
                        d dVar3 = cVar2.c.l;
                        float f8 = cVar2.s;
                        float f9 = cVar2.t;
                        dVar3.p = f8;
                        dVar3.q = f9;
                    } else {
                        cVar2.m = null;
                        cVar2.n = true;
                    }
                }
            } else if (action == 2 && !cVar2.n) {
                float rawY = motionEvent.getRawY() - cVar2.t;
                float rawX = motionEvent.getRawX() - cVar2.s;
                if ((rawX != 0.0d || rawY != 0.0d) && (motionEvent2 = cVar2.m) != null) {
                    if (currentState != -1) {
                        ArrayList i5 = cVar2.i(currentState);
                        RectF rectF2 = new RectF();
                        Iterator it = i5.iterator();
                        float f10 = 0.0f;
                        xa30 xa30Var4 = null;
                        while (it.hasNext()) {
                            xa30 xa30Var5 = (xa30) it.next();
                            if (!xa30Var5.o) {
                                d dVar4 = xa30Var5.l;
                                if (dVar4 != null) {
                                    dVar4.c(cVar2.q);
                                    RectF b2 = xa30Var5.l.b(motionLayout, rectF2);
                                    if ((b2 == null || b2.contains(motionEvent2.getX(), motionEvent2.getY())) && ((a = xa30Var5.l.a(motionLayout, rectF2)) == null || a.contains(motionEvent2.getX(), motionEvent2.getY()))) {
                                        d dVar5 = xa30Var5.l;
                                        float f11 = (dVar5.l * rawY) + (dVar5.k * rawX);
                                        if (dVar5.j) {
                                            float x = motionEvent2.getX();
                                            xa30Var5.l.getClass();
                                            float y = motionEvent2.getY();
                                            xa30Var5.l.getClass();
                                            f6 = rawY;
                                            f7 = rawX;
                                            motionEvent3 = motionEvent2;
                                            f11 = ((float) (Math.atan2(rawY + r9, rawX + r7) - Math.atan2(x - 0.5f, y - 0.5f))) * 10.0f;
                                        } else {
                                            f6 = rawY;
                                            f7 = rawX;
                                            motionEvent3 = motionEvent2;
                                        }
                                        float f12 = f11 * (xa30Var5.c == currentState ? -1.0f : 1.1f);
                                        if (f12 > f10) {
                                            f10 = f12;
                                            xa30Var4 = xa30Var5;
                                        }
                                    }
                                } else {
                                    f6 = rawY;
                                    f7 = rawX;
                                    motionEvent3 = motionEvent2;
                                }
                                rawY = f6;
                                rawX = f7;
                                motionEvent2 = motionEvent3;
                            }
                        }
                        xa30Var2 = xa30Var4;
                    } else {
                        xa30Var2 = cVar2.c;
                    }
                    if (xa30Var2 != null) {
                        setTransition(xa30Var2);
                        RectF b3 = cVar2.c.l.b(motionLayout, rectF);
                        cVar2.o = (b3 == null || b3.contains(cVar2.m.getX(), cVar2.m.getY())) ? false : true;
                        d dVar6 = cVar2.c.l;
                        float f13 = cVar2.s;
                        float f14 = cVar2.t;
                        dVar6.p = f13;
                        dVar6.q = f14;
                        dVar6.m = false;
                    }
                }
            }
            xa30Var = this.mScene.c;
            if ((xa30Var.r & 4) == 0) {
                return xa30Var.l.m;
            }
            return true;
        }
        if (!cVar2.n) {
            xa30 xa30Var6 = cVar2.c;
            if (xa30Var6 != null && (dVar = xa30Var6.l) != null) {
                float[] fArr2 = dVar.n;
                if (!cVar2.o) {
                    ra30 ra30Var3 = cVar2.p;
                    MotionLayout motionLayout2 = dVar.r;
                    if (dVar.j) {
                        int[] iArr = dVar.o;
                        ryh ryhVar = (ryh) ra30Var3;
                        VelocityTracker velocityTracker2 = (VelocityTracker) ryhVar.b;
                        if (velocityTracker2 != null) {
                            velocityTracker2.addMovement(motionEvent);
                        }
                        int action2 = motionEvent.getAction();
                        if (action2 == 0) {
                            dVar.p = motionEvent.getRawX();
                            dVar.q = motionEvent.getRawY();
                            dVar.m = false;
                        } else if (action2 == 1) {
                            dVar.m = false;
                            VelocityTracker velocityTracker3 = (VelocityTracker) ryhVar.b;
                            if (velocityTracker3 != null) {
                                velocityTracker3.computeCurrentVelocity(16);
                            }
                            VelocityTracker velocityTracker4 = (VelocityTracker) ryhVar.b;
                            float xVelocity = velocityTracker4 != null ? velocityTracker4.getXVelocity() : 0.0f;
                            VelocityTracker velocityTracker5 = (VelocityTracker) ryhVar.b;
                            float yVelocity = velocityTracker5 != null ? velocityTracker5.getYVelocity() : 0.0f;
                            float progress = motionLayout2.getProgress();
                            float width = motionLayout2.getWidth() / 2.0f;
                            float height = motionLayout2.getHeight() / 2.0f;
                            int i6 = dVar.i;
                            if (i6 != -1) {
                                View findViewById = motionLayout2.findViewById(i6);
                                motionLayout2.getLocationOnScreen(iArr);
                                right = iArr[0] + ((findViewById.getRight() + findViewById.getLeft()) / 2.0f);
                                f2 = iArr[1];
                                top = findViewById.getTop();
                                bottom = findViewById.getBottom();
                            } else {
                                int i7 = dVar.d;
                                if (i7 != -1) {
                                    View findViewById2 = motionLayout2.findViewById(motionLayout2.getMotionController(i7).f.D);
                                    motionLayout2.getLocationOnScreen(iArr);
                                    right = iArr[0] + ((findViewById2.getRight() + findViewById2.getLeft()) / 2.0f);
                                    f2 = iArr[1];
                                    top = findViewById2.getTop();
                                    bottom = findViewById2.getBottom();
                                }
                                float rawX2 = motionEvent.getRawX() - width;
                                float rawY2 = motionEvent.getRawY() - height;
                                float f15 = yVelocity;
                                double degrees = Math.toDegrees(Math.atan2(rawY2, rawX2));
                                i3 = dVar.d;
                                if (i3 == -1) {
                                    f3 = rawY2;
                                    dVar.r.getAnchorDpDt(i3, progress, dVar.h, dVar.g, fArr2);
                                    fArr2[1] = (float) Math.toDegrees(fArr2[1]);
                                } else {
                                    f3 = rawY2;
                                    fArr2[1] = 360.0f;
                                }
                                float degrees2 = ((float) (Math.toDegrees(Math.atan2(f15 + f3, xVelocity + rawX2)) - degrees)) * 62.5f;
                                f4 = Float.isNaN(degrees2) ? (((degrees2 * 3.0f) * dVar.v) / fArr2[1]) + progress : progress;
                                if (f4 == 0.0f && f4 != 1.0f && (i4 = dVar.c) != 3) {
                                    float f16 = (degrees2 * dVar.v) / fArr2[1];
                                    float f17 = ((double) f4) < 0.5d ? 0.0f : 1.0f;
                                    if (i4 == 6) {
                                        if (progress + f16 < 0.0f) {
                                            f16 = Math.abs(f16);
                                        }
                                        f17 = 1.0f;
                                    }
                                    if (dVar.c == 7) {
                                        if (progress + f16 > 1.0f) {
                                            f16 = -Math.abs(f16);
                                        }
                                        f17 = 0.0f;
                                    }
                                    motionLayout2.touchAnimateTo(dVar.c, f17, f16 * 3.0f);
                                    if (0.0f >= progress || 1.0f <= progress) {
                                        motionLayout2.setState(TransitionState.FINISHED);
                                    }
                                } else if (0.0f < f4 || 1.0f <= f4) {
                                    motionLayout2.setState(TransitionState.FINISHED);
                                }
                            }
                            height = ((bottom + top) / 2.0f) + f2;
                            width = right;
                            float rawX22 = motionEvent.getRawX() - width;
                            float rawY22 = motionEvent.getRawY() - height;
                            float f152 = yVelocity;
                            double degrees3 = Math.toDegrees(Math.atan2(rawY22, rawX22));
                            i3 = dVar.d;
                            if (i3 == -1) {
                            }
                            float degrees22 = ((float) (Math.toDegrees(Math.atan2(f152 + f3, xVelocity + rawX22)) - degrees3)) * 62.5f;
                            if (Float.isNaN(degrees22)) {
                            }
                            if (f4 == 0.0f) {
                            }
                            if (0.0f < f4) {
                            }
                            motionLayout2.setState(TransitionState.FINISHED);
                        } else if (action2 == 2) {
                            motionEvent.getRawY();
                            motionEvent.getRawX();
                            float width2 = motionLayout2.getWidth() / 2.0f;
                            float height2 = motionLayout2.getHeight() / 2.0f;
                            int i8 = dVar.i;
                            if (i8 != -1) {
                                View findViewById3 = motionLayout2.findViewById(i8);
                                motionLayout2.getLocationOnScreen(iArr);
                                height2 = ((findViewById3.getBottom() + findViewById3.getTop()) / 2.0f) + iArr[1];
                                width2 = iArr[0] + ((findViewById3.getRight() + findViewById3.getLeft()) / 2.0f);
                            } else {
                                int i9 = dVar.d;
                                if (i9 != -1) {
                                    if (motionLayout2.findViewById(motionLayout2.getMotionController(i9).f.D) == null) {
                                        Log.e("TouchResponse", "could not find view to animate to");
                                    } else {
                                        motionLayout2.getLocationOnScreen(iArr);
                                        width2 = iArr[0] + ((r7.getRight() + r7.getLeft()) / 2.0f);
                                        height2 = ((r7.getBottom() + r7.getTop()) / 2.0f) + iArr[1];
                                    }
                                }
                            }
                            float rawX3 = motionEvent.getRawX() - width2;
                            float rawY3 = motionEvent.getRawY() - height2;
                            float atan2 = (float) (((Math.atan2(motionEvent.getRawY() - height2, motionEvent.getRawX() - width2) - Math.atan2(dVar.q - height2, dVar.p - width2)) * 180.0d) / 3.141592653589793d);
                            if (atan2 > 330.0f) {
                                atan2 -= 360.0f;
                            } else if (atan2 < -330.0f) {
                                atan2 += 360.0f;
                            }
                            float f18 = atan2;
                            if (Math.abs(f18) > 0.01d || dVar.m) {
                                float progress2 = motionLayout2.getProgress();
                                if (dVar.m) {
                                    z = true;
                                } else {
                                    z = true;
                                    dVar.m = true;
                                    motionLayout2.setProgress(progress2);
                                }
                                int i10 = dVar.d;
                                if (i10 != -1) {
                                    boolean z2 = z;
                                    f5 = rawY3;
                                    fArr = fArr2;
                                    dVar.r.getAnchorDpDt(i10, progress2, dVar.h, dVar.g, fArr);
                                    fArr[z2 ? 1 : 0] = (float) Math.toDegrees(fArr[z2 ? 1 : 0]);
                                    r20 = z2;
                                } else {
                                    boolean z3 = z;
                                    f5 = rawY3;
                                    fArr = fArr2;
                                    fArr[z3 ? 1 : 0] = 360.0f;
                                    r20 = z3;
                                }
                                float max = Math.max(Math.min(((f18 * dVar.v) / fArr[r20]) + progress2, 1.0f), 0.0f);
                                float progress3 = motionLayout2.getProgress();
                                if (max != progress3) {
                                    if (progress3 == 0.0f || progress3 == 1.0f) {
                                        motionLayout2.endTrigger(progress3 == 0.0f);
                                    }
                                    motionLayout2.setProgress(max);
                                    VelocityTracker velocityTracker6 = (VelocityTracker) ryhVar.b;
                                    if (velocityTracker6 != null) {
                                        velocityTracker6.computeCurrentVelocity(1000);
                                    }
                                    VelocityTracker velocityTracker7 = (VelocityTracker) ryhVar.b;
                                    float xVelocity2 = velocityTracker7 != null ? velocityTracker7.getXVelocity() : 0.0f;
                                    VelocityTracker velocityTracker8 = (VelocityTracker) ryhVar.b;
                                    double yVelocity2 = velocityTracker8 != null ? velocityTracker8.getYVelocity() : 0.0f;
                                    double d = xVelocity2;
                                    motionLayout2.mLastVelocity = (float) Math.toDegrees((float) ((Math.sin(Math.atan2(yVelocity2, d) - r14) * Math.hypot(yVelocity2, d)) / Math.hypot(rawX3, f5)));
                                } else {
                                    motionLayout2.mLastVelocity = 0.0f;
                                }
                                dVar.p = motionEvent.getRawX();
                                dVar.q = motionEvent.getRawY();
                            }
                        }
                    } else {
                        ryh ryhVar2 = (ryh) ra30Var3;
                        VelocityTracker velocityTracker9 = (VelocityTracker) ryhVar2.b;
                        if (velocityTracker9 != null) {
                            velocityTracker9.addMovement(motionEvent);
                        }
                        int action3 = motionEvent.getAction();
                        if (action3 == 0) {
                            dVar.p = motionEvent.getRawX();
                            dVar.q = motionEvent.getRawY();
                            dVar.m = false;
                        } else if (action3 == 1) {
                            dVar.m = false;
                            VelocityTracker velocityTracker10 = (VelocityTracker) ryhVar2.b;
                            if (velocityTracker10 != null) {
                                velocityTracker10.computeCurrentVelocity(1000);
                            }
                            VelocityTracker velocityTracker11 = (VelocityTracker) ryhVar2.b;
                            float xVelocity3 = velocityTracker11 != null ? velocityTracker11.getXVelocity() : 0.0f;
                            VelocityTracker velocityTracker12 = (VelocityTracker) ryhVar2.b;
                            float yVelocity3 = velocityTracker12 != null ? velocityTracker12.getYVelocity() : 0.0f;
                            float progress4 = motionLayout2.getProgress();
                            int i11 = dVar.d;
                            MotionLayout motionLayout3 = dVar.r;
                            if (i11 != -1) {
                                motionLayout3.getAnchorDpDt(i11, progress4, dVar.h, dVar.g, fArr2);
                                c = 1;
                                c2 = 0;
                            } else {
                                float min = Math.min(motionLayout3.getWidth(), motionLayout2.getHeight());
                                c = 1;
                                fArr2[1] = dVar.l * min;
                                c2 = 0;
                                fArr2[0] = min * dVar.k;
                            }
                            float f19 = dVar.k != 0.0f ? xVelocity3 / fArr2[c2] : yVelocity3 / fArr2[c];
                            float f20 = !Float.isNaN(f19) ? (f19 / 3.0f) + progress4 : progress4;
                            if (f20 != 0.0f && f20 != 1.0f && (i = dVar.c) != 3) {
                                float f21 = ((double) f20) < 0.5d ? 0.0f : 1.0f;
                                if (i == 6) {
                                    if (progress4 + f19 < 0.0f) {
                                        f19 = Math.abs(f19);
                                    }
                                    f21 = 1.0f;
                                }
                                if (dVar.c == 7) {
                                    if (progress4 + f19 > 1.0f) {
                                        f19 = -Math.abs(f19);
                                    }
                                    f21 = 0.0f;
                                }
                                motionLayout2.touchAnimateTo(dVar.c, f21, f19);
                                if (0.0f >= progress4 || 1.0f <= progress4) {
                                    motionLayout2.setState(TransitionState.FINISHED);
                                }
                            } else if (0.0f >= f20 || 1.0f <= f20) {
                                motionLayout2.setState(TransitionState.FINISHED);
                            }
                        } else if (action3 == 2) {
                            float rawY4 = motionEvent.getRawY() - dVar.q;
                            float rawX4 = motionEvent.getRawX() - dVar.p;
                            if (Math.abs((dVar.l * rawY4) + (dVar.k * rawX4)) > dVar.x || dVar.m) {
                                float progress5 = motionLayout2.getProgress();
                                if (!dVar.m) {
                                    dVar.m = true;
                                    motionLayout2.setProgress(progress5);
                                }
                                int i12 = dVar.d;
                                MotionLayout motionLayout4 = dVar.r;
                                if (i12 != -1) {
                                    f = rawY4;
                                    i2 = 1000;
                                    motionLayout4.getAnchorDpDt(i12, progress5, dVar.h, dVar.g, fArr2);
                                    c3 = 1;
                                    c4 = 0;
                                } else {
                                    f = rawY4;
                                    i2 = 1000;
                                    float min2 = Math.min(motionLayout4.getWidth(), motionLayout2.getHeight());
                                    c3 = 1;
                                    fArr2[1] = dVar.l * min2;
                                    c4 = 0;
                                    fArr2[0] = min2 * dVar.k;
                                }
                                if (Math.abs(((dVar.l * fArr2[c3]) + (dVar.k * fArr2[c4])) * dVar.v) < 0.01d) {
                                    fArr2[0] = 0.01f;
                                    fArr2[c3] = 0.01f;
                                }
                                float max2 = Math.max(Math.min(progress5 + (dVar.k != 0.0f ? rawX4 / fArr2[0] : f / fArr2[c3]), 1.0f), 0.0f);
                                if (dVar.c == 6) {
                                    max2 = Math.max(max2, 0.01f);
                                }
                                if (dVar.c == 7) {
                                    max2 = Math.min(max2, 0.99f);
                                }
                                float progress6 = motionLayout2.getProgress();
                                if (max2 != progress6) {
                                    if (progress6 == 0.0f || progress6 == 1.0f) {
                                        motionLayout2.endTrigger(progress6 == 0.0f);
                                    }
                                    motionLayout2.setProgress(max2);
                                    VelocityTracker velocityTracker13 = (VelocityTracker) ryhVar2.b;
                                    if (velocityTracker13 != null) {
                                        velocityTracker13.computeCurrentVelocity(i2);
                                    }
                                    VelocityTracker velocityTracker14 = (VelocityTracker) ryhVar2.b;
                                    float xVelocity4 = velocityTracker14 != null ? velocityTracker14.getXVelocity() : 0.0f;
                                    VelocityTracker velocityTracker15 = (VelocityTracker) ryhVar2.b;
                                    motionLayout2.mLastVelocity = dVar.k != 0.0f ? xVelocity4 / fArr2[0] : (velocityTracker15 != null ? velocityTracker15.getYVelocity() : 0.0f) / fArr2[1];
                                } else {
                                    motionLayout2.mLastVelocity = 0.0f;
                                }
                                dVar.p = motionEvent.getRawX();
                                dVar.q = motionEvent.getRawY();
                            }
                        }
                    }
                }
            }
            cVar2.s = motionEvent.getRawX();
            cVar2.t = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (ra30Var = cVar2.p) != null) {
                ryh ryhVar3 = (ryh) ra30Var;
                VelocityTracker velocityTracker16 = (VelocityTracker) ryhVar3.b;
                if (velocityTracker16 != null) {
                    velocityTracker16.recycle();
                    ra30Var2 = null;
                    ryhVar3.b = null;
                } else {
                    ra30Var2 = null;
                }
                cVar2.p = ra30Var2;
                int i13 = this.mCurrentState;
                if (i13 != -1) {
                    cVar2.a(this, i13);
                }
            }
        }
        xa30Var = this.mScene.c;
        if ((xa30Var.r & 4) == 0) {
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.mTransitionListeners == null) {
                this.mTransitionListeners = new CopyOnWriteArrayList<>();
            }
            this.mTransitionListeners.add(motionHelper);
            if (motionHelper.isUsedOnShow()) {
                if (this.mOnShowHelpers == null) {
                    this.mOnShowHelpers = new ArrayList<>();
                }
                this.mOnShowHelpers.add(motionHelper);
            }
            if (motionHelper.isUseOnHide()) {
                if (this.mOnHideHelpers == null) {
                    this.mOnHideHelpers = new ArrayList<>();
                }
                this.mOnHideHelpers.add(motionHelper);
            }
            if (motionHelper.isDecorator()) {
                if (this.mDecoratorsHelpers == null) {
                    this.mDecoratorsHelpers = new ArrayList<>();
                }
                this.mDecoratorsHelpers.add(motionHelper);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.mOnHideHelpers;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = null;
    }

    @Deprecated
    public void rebuildMotion() {
        Log.e(TAG, "This method is deprecated. Please call rebuildScene() instead.");
        rebuildScene();
    }

    public void rebuildScene() {
        this.mModel.f();
        invalidate();
    }

    public boolean removeTransitionListener(sa30 sa30Var) {
        CopyOnWriteArrayList<sa30> copyOnWriteArrayList = this.mTransitionListeners;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(sa30Var);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        c cVar;
        xa30 xa30Var;
        if (!this.mMeasureDuringTransition && this.mCurrentState == -1 && (cVar = this.mScene) != null && (xa30Var = cVar.c) != null) {
            int i = xa30Var.q;
            if (i == 0) {
                return;
            }
            if (i == 2) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    this.mFrameArrayList.get(getChildAt(i2)).d = true;
                }
                return;
            }
        }
        super.requestLayout();
    }

    public void rotateTo(int i, int i2) {
        int i3 = 1;
        this.mInRotation = true;
        this.mPreRotateWidth = getWidth();
        this.mPreRotateHeight = getHeight();
        int rotation = getDisplay().getRotation();
        this.mRotatMode = (rotation + 1) % 4 > (this.mPreviouseRotation + 1) % 4 ? 1 : 2;
        this.mPreviouseRotation = rotation;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            cv31 cv31Var = this.mPreRotate.get(childAt);
            if (cv31Var == null) {
                cv31Var = new cv31();
                this.mPreRotate.put(childAt, cv31Var);
            }
            cv31Var.b = childAt.getLeft();
            cv31Var.c = childAt.getTop();
            cv31Var.d = childAt.getRight();
            cv31Var.e = childAt.getBottom();
            cv31Var.a = childAt.getRotation();
        }
        this.mBeginState = -1;
        this.mEndState = i;
        this.mScene.p(-1, i);
        this.mModel.e(null, this.mScene.b(this.mEndState));
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        invalidate();
        transitionToEnd(new pa30(this, i3));
        if (i2 > 0) {
            this.mTransitionDuration = i2 / 1000.0f;
        }
    }

    public void scheduleTransitionTo(int i) {
        if (getCurrentState() == -1) {
            transitionToState(i);
            return;
        }
        int[] iArr = this.mScheduledTransitionTo;
        if (iArr == null) {
            this.mScheduledTransitionTo = new int[4];
        } else if (iArr.length <= this.mScheduledTransitions) {
            this.mScheduledTransitionTo = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.mScheduledTransitionTo;
        int i2 = this.mScheduledTransitions;
        this.mScheduledTransitions = i2 + 1;
        iArr2[i2] = i;
    }

    public void setDebugMode(int i) {
        this.mDebugPath = i;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.mDelayedApply = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.mInteractionEnabled = z;
    }

    public void setInterpolatedProgress(float f) {
        if (this.mScene != null) {
            setState(TransitionState.MOVING);
            Interpolator e = this.mScene.e();
            if (e != null) {
                setProgress(e.getInterpolation(f));
                return;
            }
        }
        setProgress(f);
    }

    public void setOnHide(float f) {
        ArrayList<MotionHelper> arrayList = this.mOnHideHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mOnHideHelpers.get(i).setProgress(f);
            }
        }
    }

    public void setOnShow(float f) {
        ArrayList<MotionHelper> arrayList = this.mOnShowHelpers;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.mOnShowHelpers.get(i).setProgress(f);
            }
        }
    }

    public void setProgress(float f) {
        if (f >= 0.0f) {
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        }
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new b(this);
            }
            this.mStateCache.a = f;
            return;
        }
        if (f <= 0.0f) {
            if (this.mTransitionLastPosition == 1.0f && this.mCurrentState == this.mEndState) {
                setState(TransitionState.MOVING);
            }
            this.mCurrentState = this.mBeginState;
            if (this.mTransitionLastPosition == 0.0f) {
                setState(TransitionState.FINISHED);
            }
        } else if (f >= 1.0f) {
            if (this.mTransitionLastPosition == 0.0f && this.mCurrentState == this.mBeginState) {
                setState(TransitionState.MOVING);
            }
            this.mCurrentState = this.mEndState;
            if (this.mTransitionLastPosition == 1.0f) {
                setState(TransitionState.FINISHED);
            }
        } else {
            this.mCurrentState = -1;
            setState(TransitionState.MOVING);
        }
        if (this.mScene == null) {
            return;
        }
        this.mTransitionInstantly = true;
        this.mTransitionGoalPosition = f;
        this.mTransitionPosition = f;
        this.mTransitionLastTime = -1L;
        this.mAnimationStartTime = -1L;
        this.mInterpolator = null;
        this.mInTransition = true;
        invalidate();
    }

    public void setScene(c cVar) {
        d dVar;
        this.mScene = cVar;
        boolean isRtl = isRtl();
        cVar.q = isRtl;
        xa30 xa30Var = cVar.c;
        if (xa30Var != null && (dVar = xa30Var.l) != null) {
            dVar.c(isRtl);
        }
        rebuildScene();
    }

    public void setStartState(int i) {
        if (isAttachedToWindow()) {
            this.mCurrentState = i;
            return;
        }
        if (this.mStateCache == null) {
            this.mStateCache = new b(this);
        }
        b bVar = this.mStateCache;
        bVar.c = i;
        bVar.d = i;
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.FINISHED;
        if (transitionState == transitionState2 && this.mCurrentState == -1) {
            return;
        }
        TransitionState transitionState3 = this.mTransitionState;
        this.mTransitionState = transitionState;
        TransitionState transitionState4 = TransitionState.MOVING;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            fireTransitionChange();
        }
        int ordinal = transitionState3.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 && transitionState == transitionState2) {
                fireTransitionCompleted();
                return;
            }
            return;
        }
        if (transitionState == transitionState4) {
            fireTransitionChange();
        }
        if (transitionState == transitionState2) {
            fireTransitionCompleted();
        }
    }

    public void setTransition(int i) {
        if (this.mScene != null) {
            xa30 transition = getTransition(i);
            this.mBeginState = transition.d;
            this.mEndState = transition.c;
            if (!isAttachedToWindow()) {
                if (this.mStateCache == null) {
                    this.mStateCache = new b(this);
                }
                b bVar = this.mStateCache;
                bVar.c = this.mBeginState;
                bVar.d = this.mEndState;
                return;
            }
            int i2 = this.mCurrentState;
            float f = i2 == this.mBeginState ? 0.0f : i2 == this.mEndState ? 1.0f : Float.NaN;
            c cVar = this.mScene;
            cVar.c = transition;
            d dVar = transition.l;
            if (dVar != null) {
                dVar.c(cVar.q);
            }
            this.mModel.e(this.mScene.b(this.mBeginState), this.mScene.b(this.mEndState));
            rebuildScene();
            if (this.mTransitionLastPosition != f) {
                if (f == 0.0f) {
                    endTrigger(true);
                    this.mScene.b(this.mBeginState).b(this);
                } else if (f == 1.0f) {
                    endTrigger(false);
                    this.mScene.b(this.mEndState).b(this);
                }
            }
            this.mTransitionLastPosition = Float.isNaN(f) ? 0.0f : f;
            if (!Float.isNaN(f)) {
                setProgress(f);
            } else {
                rug.b();
                transitionToStart();
            }
        }
    }

    public void setTransitionDuration(int i) {
        c cVar = this.mScene;
        if (cVar == null) {
            Log.e(TAG, "MotionScene not defined");
            return;
        }
        xa30 xa30Var = cVar.c;
        if (xa30Var != null) {
            xa30Var.h = Math.max(i, 8);
        } else {
            cVar.k = i;
        }
    }

    public void setTransitionListener(sa30 sa30Var) {
        this.mTransitionListener = sa30Var;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.mStateCache == null) {
            this.mStateCache = new b(this);
        }
        b bVar = this.mStateCache;
        bVar.getClass();
        bVar.a = bundle.getFloat("motion.progress");
        bVar.b = bundle.getFloat("motion.velocity");
        bVar.c = bundle.getInt("motion.StartState");
        bVar.d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.mStateCache.a();
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return rug.c(this.mBeginState, context) + "->" + rug.c(this.mEndState, context) + " (pos:" + this.mTransitionLastPosition + " Dpos/Dt:" + this.mLastVelocity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r12 != 7) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void touchAnimateTo(int i, float f, float f2) {
        float f3;
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        d dVar5;
        d dVar6;
        d dVar7;
        d dVar8;
        if (this.mScene == null || this.mTransitionLastPosition == f) {
            return;
        }
        this.mTemporalInterpolator = true;
        this.mAnimationStartTime = getNanoTime();
        float c = this.mScene.c() / 1000.0f;
        this.mTransitionDuration = c;
        this.mTransitionGoalPosition = f;
        this.mInTransition = true;
        float f4 = 0.0f;
        if (i != 0 && i != 1 && i != 2) {
            if (i == 4) {
                this.mDecelerateLogic.config(f2, this.mTransitionLastPosition, this.mScene.g());
                this.mInterpolator = this.mDecelerateLogic;
            } else if (i != 5) {
                if (i != 6) {
                }
            } else if (willJump(f2, this.mTransitionLastPosition, this.mScene.g())) {
                this.mDecelerateLogic.config(f2, this.mTransitionLastPosition, this.mScene.g());
                this.mInterpolator = this.mDecelerateLogic;
            } else {
                StopLogic stopLogic = this.mStopLogic;
                float f5 = this.mTransitionLastPosition;
                float f6 = this.mTransitionDuration;
                float g = this.mScene.g();
                xa30 xa30Var = this.mScene.c;
                stopLogic.config(f5, f, f2, f6, g, (xa30Var == null || (dVar8 = xa30Var.l) == null) ? 0.0f : dVar8.s);
                this.mLastVelocity = 0.0f;
                int i2 = this.mCurrentState;
                this.mTransitionGoalPosition = f;
                this.mCurrentState = i2;
                this.mInterpolator = this.mStopLogic;
            }
            this.mTransitionInstantly = false;
            this.mAnimationStartTime = getNanoTime();
            invalidate();
        }
        if (i == 1 || i == 7) {
            f3 = 0.0f;
        } else {
            if (i == 2 || i == 6) {
                f = 1.0f;
            }
            f3 = f;
        }
        c cVar = this.mScene;
        xa30 xa30Var2 = cVar.c;
        int i3 = (xa30Var2 == null || (dVar7 = xa30Var2.l) == null) ? 0 : dVar7.D;
        StopLogic stopLogic2 = this.mStopLogic;
        float f7 = f3;
        float f8 = this.mTransitionLastPosition;
        if (i3 == 0) {
            float g2 = cVar.g();
            xa30 xa30Var3 = this.mScene.c;
            if (xa30Var3 != null && (dVar6 = xa30Var3.l) != null) {
                f4 = dVar6.s;
            }
            stopLogic2.config(f8, f7, f2, c, g2, f4);
        } else {
            float f9 = (xa30Var2 == null || (dVar5 = xa30Var2.l) == null) ? 0.0f : dVar5.z;
            float f10 = (xa30Var2 == null || (dVar4 = xa30Var2.l) == null) ? 0.0f : dVar4.A;
            float f11 = (xa30Var2 == null || (dVar3 = xa30Var2.l) == null) ? 0.0f : dVar3.y;
            if (xa30Var2 != null && (dVar2 = xa30Var2.l) != null) {
                f4 = dVar2.B;
            }
            stopLogic2.springConfig(f8, f7, f2, f9, f10, f11, f4, (xa30Var2 == null || (dVar = xa30Var2.l) == null) ? 0 : dVar.C);
            f7 = f7;
        }
        int i4 = this.mCurrentState;
        this.mTransitionGoalPosition = f7;
        this.mCurrentState = i4;
        this.mInterpolator = this.mStopLogic;
        this.mTransitionInstantly = false;
        this.mAnimationStartTime = getNanoTime();
        invalidate();
    }

    public void touchSpringTo(float f, float f2) {
        d dVar;
        d dVar2;
        d dVar3;
        d dVar4;
        d dVar5;
        if (this.mScene == null || this.mTransitionLastPosition == f) {
            return;
        }
        this.mTemporalInterpolator = true;
        this.mAnimationStartTime = getNanoTime();
        this.mTransitionDuration = this.mScene.c() / 1000.0f;
        this.mTransitionGoalPosition = f;
        this.mInTransition = true;
        StopLogic stopLogic = this.mStopLogic;
        float f3 = this.mTransitionLastPosition;
        xa30 xa30Var = this.mScene.c;
        float f4 = 0.0f;
        float f5 = (xa30Var == null || (dVar5 = xa30Var.l) == null) ? 0.0f : dVar5.z;
        float f6 = (xa30Var == null || (dVar4 = xa30Var.l) == null) ? 0.0f : dVar4.A;
        float f7 = (xa30Var == null || (dVar3 = xa30Var.l) == null) ? 0.0f : dVar3.y;
        if (xa30Var != null && (dVar2 = xa30Var.l) != null) {
            f4 = dVar2.B;
        }
        stopLogic.springConfig(f3, f, f2, f5, f6, f7, f4, (xa30Var == null || (dVar = xa30Var.l) == null) ? 0 : dVar.C);
        int i = this.mCurrentState;
        this.mTransitionGoalPosition = f;
        this.mCurrentState = i;
        this.mInterpolator = this.mStopLogic;
        this.mTransitionInstantly = false;
        this.mAnimationStartTime = getNanoTime();
        invalidate();
    }

    public void transitionToEnd() {
        animateTo(1.0f);
        this.mOnComplete = null;
    }

    public void transitionToStart(Runnable runnable) {
        animateTo(0.0f);
        this.mOnComplete = runnable;
    }

    public void transitionToState(int i, int i2, int i3, int i4) {
        we6 we6Var;
        c cVar = this.mScene;
        if (cVar != null && (we6Var = cVar.b) != null) {
            int i5 = this.mCurrentState;
            float f = i2;
            float f2 = i3;
            u5u0 u5u0Var = (u5u0) ((SparseArray) we6Var.c).get(i);
            if (u5u0Var == null) {
                i5 = i;
            } else {
                ArrayList arrayList = u5u0Var.b;
                int i6 = u5u0Var.c;
                if (f != -1.0f && f2 != -1.0f) {
                    Iterator it = arrayList.iterator();
                    v5u0 v5u0Var = null;
                    while (true) {
                        if (it.hasNext()) {
                            v5u0 v5u0Var2 = (v5u0) it.next();
                            if (v5u0Var2.a(f, f2)) {
                                if (i5 == v5u0Var2.e) {
                                    break;
                                } else {
                                    v5u0Var = v5u0Var2;
                                }
                            }
                        } else if (v5u0Var != null) {
                            i5 = v5u0Var.e;
                        }
                    }
                } else if (i6 != i5) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (i5 == ((v5u0) it2.next()).e) {
                            break;
                        }
                    }
                    i5 = i6;
                }
            }
            if (i5 != -1) {
                i = i5;
            }
        }
        int i7 = this.mCurrentState;
        if (i7 == i) {
            return;
        }
        if (this.mBeginState == i) {
            animateTo(0.0f);
            if (i4 > 0) {
                this.mTransitionDuration = i4 / 1000.0f;
                return;
            }
            return;
        }
        if (this.mEndState == i) {
            animateTo(1.0f);
            if (i4 > 0) {
                this.mTransitionDuration = i4 / 1000.0f;
                return;
            }
            return;
        }
        this.mEndState = i;
        if (i7 != -1) {
            setTransition(i7, i);
            animateTo(1.0f);
            this.mTransitionLastPosition = 0.0f;
            transitionToEnd();
            if (i4 > 0) {
                this.mTransitionDuration = i4 / 1000.0f;
                return;
            }
            return;
        }
        this.mTemporalInterpolator = false;
        this.mTransitionGoalPosition = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionLastTime = getNanoTime();
        this.mAnimationStartTime = getNanoTime();
        this.mTransitionInstantly = false;
        this.mInterpolator = null;
        if (i4 == -1) {
            this.mTransitionDuration = this.mScene.c() / 1000.0f;
        }
        this.mBeginState = -1;
        this.mScene.p(-1, this.mEndState);
        SparseArray sparseArray = new SparseArray();
        if (i4 == 0) {
            this.mTransitionDuration = this.mScene.c() / 1000.0f;
        } else if (i4 > 0) {
            this.mTransitionDuration = i4 / 1000.0f;
        }
        int childCount = getChildCount();
        this.mFrameArrayList.clear();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            this.mFrameArrayList.put(childAt, new ia30(childAt));
            sparseArray.put(childAt.getId(), this.mFrameArrayList.get(childAt));
        }
        this.mInTransition = true;
        this.mModel.e(null, this.mScene.b(i));
        rebuildScene();
        this.mModel.a();
        computeCurrentPositions();
        int width = getWidth();
        int height = getHeight();
        if (this.mDecoratorsHelpers != null) {
            for (int i9 = 0; i9 < childCount; i9++) {
                ia30 ia30Var = this.mFrameArrayList.get(getChildAt(i9));
                if (ia30Var != null) {
                    this.mScene.f(ia30Var);
                }
            }
            Iterator<MotionHelper> it3 = this.mDecoratorsHelpers.iterator();
            while (it3.hasNext()) {
                it3.next().onPreSetup(this, this.mFrameArrayList);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                ia30 ia30Var2 = this.mFrameArrayList.get(getChildAt(i10));
                if (ia30Var2 != null) {
                    ia30Var2.i(width, height, getNanoTime());
                }
            }
        } else {
            for (int i11 = 0; i11 < childCount; i11++) {
                ia30 ia30Var3 = this.mFrameArrayList.get(getChildAt(i11));
                if (ia30Var3 != null) {
                    this.mScene.f(ia30Var3);
                    ia30Var3.i(width, height, getNanoTime());
                }
            }
        }
        xa30 xa30Var = this.mScene.c;
        float f3 = xa30Var != null ? xa30Var.i : 0.0f;
        if (f3 != 0.0f) {
            float f4 = Float.MAX_VALUE;
            float f5 = -3.4028235E38f;
            for (int i12 = 0; i12 < childCount; i12++) {
                ta30 ta30Var = this.mFrameArrayList.get(getChildAt(i12)).g;
                float f6 = ta30Var.y + ta30Var.x;
                f4 = Math.min(f4, f6);
                f5 = Math.max(f5, f6);
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                ia30 ia30Var4 = this.mFrameArrayList.get(getChildAt(i13));
                ta30 ta30Var2 = ia30Var4.g;
                float f7 = ta30Var2.x;
                float f8 = ta30Var2.y;
                ia30Var4.n = 1.0f / (1.0f - f3);
                ia30Var4.m = f3 - ((((f7 + f8) - f4) * f3) / (f5 - f4));
            }
        }
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mInTransition = true;
        invalidate();
    }

    public void updateState() {
        this.mModel.e(this.mScene.b(this.mBeginState), this.mScene.b(this.mEndState));
        rebuildScene();
    }

    public void updateStateAnimate(int i, androidx.constraintlayout.widget.e eVar, int i2) {
        if (this.mScene != null && this.mCurrentState == i) {
            updateState(kih0.view_transition, getConstraintSet(i));
            setState(kih0.view_transition, -1, -1);
            updateState(i, eVar);
            xa30 xa30Var = new xa30(this.mScene, kih0.view_transition, i);
            xa30Var.h = Math.max(i2, 8);
            setTransition(xa30Var);
            transitionToEnd();
        }
    }

    public void viewTransition(int i, View... viewArr) {
        c cVar = this.mScene;
        if (cVar == null) {
            Log.e(TAG, " no motionScene");
            return;
        }
        vmn0 vmn0Var = cVar.r;
        vmn0Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) vmn0Var.b).iterator();
        e eVar = null;
        while (it.hasNext()) {
            e eVar2 = (e) it.next();
            if (eVar2.a == i) {
                for (View view : viewArr) {
                    if (eVar2.b(view)) {
                        arrayList.add(view);
                    }
                }
                if (arrayList.isEmpty()) {
                    eVar = eVar2;
                } else {
                    View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                    MotionLayout motionLayout = (MotionLayout) vmn0Var.a;
                    int currentState = motionLayout.getCurrentState();
                    if (eVar2.e != 2) {
                        if (currentState == -1) {
                            motionLayout.toString();
                        } else {
                            androidx.constraintlayout.widget.e constraintSet = motionLayout.getConstraintSet(currentState);
                            if (constraintSet != null) {
                                eVar = eVar2;
                                eVar.a(vmn0Var, (MotionLayout) vmn0Var.a, currentState, constraintSet, viewArr2);
                            }
                        }
                        eVar = eVar2;
                    } else {
                        eVar = eVar2;
                        eVar.a(vmn0Var, (MotionLayout) vmn0Var.a, currentState, null, viewArr2);
                    }
                    arrayList.clear();
                }
            }
        }
        if (eVar == null) {
            Log.e((String) vmn0Var.w, " Could not find ViewTransition");
        }
    }

    public void transitionToStart() {
        animateTo(0.0f);
    }

    public void transitionToEnd(Runnable runnable) {
        animateTo(1.0f);
        this.mOnComplete = runnable;
    }

    @Override // defpackage.tn50
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
    }

    public void updateState(int i, androidx.constraintlayout.widget.e eVar) {
        c cVar = this.mScene;
        if (cVar != null) {
            cVar.h.put(i, eVar);
        }
        updateState();
        if (this.mCurrentState == i) {
            eVar.b(this);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void setState(int i, int i2, int i3) {
        setState(TransitionState.SETUP);
        this.mCurrentState = i;
        this.mBeginState = -1;
        this.mEndState = -1;
        k7e k7eVar = this.mConstraintLayoutSpec;
        if (k7eVar != null) {
            k7eVar.b(i2, i3, i);
            return;
        }
        c cVar = this.mScene;
        if (cVar != null) {
            cVar.b(i).b(this);
        }
    }

    public void setProgress(float f, float f2) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new b(this);
            }
            b bVar = this.mStateCache;
            bVar.a = f;
            bVar.b = f2;
            return;
        }
        setProgress(f);
        setState(TransitionState.MOVING);
        this.mLastVelocity = f2;
        if (f2 != 0.0f) {
            animateTo(f2 > 0.0f ? 1.0f : 0.0f);
        } else {
            if (f == 0.0f || f == 1.0f) {
                return;
            }
            animateTo(f > 0.5f ? 1.0f : 0.0f);
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mProgressInterpolator = null;
        this.mLastVelocity = 0.0f;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new HashMap<>();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionGoalPosition = 0.0f;
        this.mInTransition = false;
        this.mIndirectTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new StopLogic();
        this.mDecelerateLogic = new DecelerateInterpolator();
        this.mFirstDown = true;
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mDecoratorsHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = 0.0f;
        this.mListenerState = 0;
        this.mListenerPosition = 0.0f;
        this.mIsAnimating = false;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new thx();
        this.mInLayout = false;
        this.mOnComplete = null;
        this.mScheduledTransitionTo = null;
        this.mScheduledTransitions = 0;
        this.mInRotation = false;
        this.mRotatMode = 0;
        this.mPreRotate = new HashMap<>();
        this.mTempRect = new Rect();
        this.mDelayedApply = false;
        this.mTransitionState = TransitionState.UNDEFINED;
        this.mModel = new a(this);
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new RectF();
        this.mRegionView = null;
        this.mInverseMatrix = null;
        this.mTransitionCompleted = new ArrayList<>();
        init(attributeSet);
    }

    public void setTransition(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new b(this);
            }
            b bVar = this.mStateCache;
            bVar.c = i;
            bVar.d = i2;
            return;
        }
        c cVar = this.mScene;
        if (cVar != null) {
            this.mBeginState = i;
            this.mEndState = i2;
            cVar.p(i, i2);
            this.mModel.e(this.mScene.b(i), this.mScene.b(i2));
            rebuildScene();
            this.mTransitionLastPosition = 0.0f;
            transitionToStart();
        }
    }

    public void setTransition(xa30 xa30Var) {
        d dVar;
        c cVar = this.mScene;
        cVar.c = xa30Var;
        if (xa30Var != null && (dVar = xa30Var.l) != null) {
            dVar.c(cVar.q);
        }
        setState(TransitionState.SETUP);
        int i = this.mCurrentState;
        xa30 xa30Var2 = this.mScene.c;
        if (i == (xa30Var2 == null ? -1 : xa30Var2.c)) {
            this.mTransitionLastPosition = 1.0f;
            this.mTransitionPosition = 1.0f;
            this.mTransitionGoalPosition = 1.0f;
        } else {
            this.mTransitionLastPosition = 0.0f;
            this.mTransitionPosition = 0.0f;
            this.mTransitionGoalPosition = 0.0f;
        }
        this.mTransitionLastTime = (xa30Var.r & 1) != 0 ? -1L : getNanoTime();
        int h = this.mScene.h();
        c cVar2 = this.mScene;
        xa30 xa30Var3 = cVar2.c;
        int i2 = xa30Var3 != null ? xa30Var3.c : -1;
        if (h == this.mBeginState && i2 == this.mEndState) {
            return;
        }
        this.mBeginState = h;
        this.mEndState = i2;
        cVar2.p(h, i2);
        this.mModel.e(this.mScene.b(this.mBeginState), this.mScene.b(this.mEndState));
        a aVar = this.mModel;
        int i3 = this.mBeginState;
        int i4 = this.mEndState;
        aVar.e = i3;
        aVar.f = i4;
        aVar.f();
        rebuildScene();
    }

    private void checkStructure(xa30 xa30Var) {
        if (xa30Var.d == xa30Var.c) {
            Log.e(TAG, "CHECK: start and end constraint set should not be the same!");
        }
    }

    private void checkStructure(int i, androidx.constraintlayout.widget.e eVar) {
        rug.c(i, getContext());
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (eVar.p(childAt.getId()) == null) {
                rug.d(childAt);
            }
        }
        Integer[] numArr = (Integer[]) eVar.g.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = numArr[i3].intValue();
        }
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            rug.c(i5, getContext());
            int i6 = iArr[i4];
            int i7 = eVar.o(i5).e.d;
            int i8 = eVar.o(i5).e.c;
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mProgressInterpolator = null;
        this.mLastVelocity = 0.0f;
        this.mBeginState = -1;
        this.mCurrentState = -1;
        this.mEndState = -1;
        this.mLastWidthMeasureSpec = 0;
        this.mLastHeightMeasureSpec = 0;
        this.mInteractionEnabled = true;
        this.mFrameArrayList = new HashMap<>();
        this.mAnimationStartTime = 0L;
        this.mTransitionDuration = 1.0f;
        this.mTransitionPosition = 0.0f;
        this.mTransitionLastPosition = 0.0f;
        this.mTransitionGoalPosition = 0.0f;
        this.mInTransition = false;
        this.mIndirectTransition = false;
        this.mDebugPath = 0;
        this.mTemporalInterpolator = false;
        this.mStopLogic = new StopLogic();
        this.mDecelerateLogic = new DecelerateInterpolator();
        this.mFirstDown = true;
        this.mUndergoingMotion = false;
        this.mKeepAnimating = false;
        this.mOnShowHelpers = null;
        this.mOnHideHelpers = null;
        this.mDecoratorsHelpers = null;
        this.mTransitionListeners = null;
        this.mFrames = 0;
        this.mLastDrawTime = -1L;
        this.mLastFps = 0.0f;
        this.mListenerState = 0;
        this.mListenerPosition = 0.0f;
        this.mIsAnimating = false;
        this.mMeasureDuringTransition = false;
        this.mKeyCache = new thx();
        this.mInLayout = false;
        this.mOnComplete = null;
        this.mScheduledTransitionTo = null;
        this.mScheduledTransitions = 0;
        this.mInRotation = false;
        this.mRotatMode = 0;
        this.mPreRotate = new HashMap<>();
        this.mTempRect = new Rect();
        this.mDelayedApply = false;
        this.mTransitionState = TransitionState.UNDEFINED;
        this.mModel = new a(this);
        this.mNeedsFireTransitionCompleted = false;
        this.mBoundsCheck = new RectF();
        this.mRegionView = null;
        this.mInverseMatrix = null;
        this.mTransitionCompleted = new ArrayList<>();
        init(attributeSet);
    }

    public void transitionToState(int i, int i2) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new b(this);
            }
            this.mStateCache.d = i;
            return;
        }
        transitionToState(i, -1, -1, i2);
    }

    public void transitionToState(int i, int i2, int i3) {
        transitionToState(i, i2, i3, -1);
    }

    public void transitionToState(int i) {
        if (!isAttachedToWindow()) {
            if (this.mStateCache == null) {
                this.mStateCache = new b(this);
            }
            this.mStateCache.d = i;
            return;
        }
        transitionToState(i, -1, -1);
    }
}
