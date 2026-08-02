package androidx.transition;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import defpackage.ny61;

/* loaded from: classes10.dex */
class GhostViewPort extends ViewGroup implements GhostView {
    private Matrix mMatrix;
    private final ViewTreeObserver.OnPreDrawListener mOnPreDrawListener;
    int mReferences;
    ViewGroup mStartParent;
    View mStartView;
    final View mView;

    public GhostViewPort(View view) {
        super(view.getContext());
        this.mOnPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.transition.GhostViewPort.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                View view2;
                GhostViewPort.this.postInvalidateOnAnimation();
                GhostViewPort ghostViewPort = GhostViewPort.this;
                ViewGroup viewGroup = ghostViewPort.mStartParent;
                if (viewGroup == null || (view2 = ghostViewPort.mStartView) == null) {
                    return true;
                }
                viewGroup.endViewTransition(view2);
                GhostViewPort.this.mStartParent.postInvalidateOnAnimation();
                GhostViewPort ghostViewPort2 = GhostViewPort.this;
                ghostViewPort2.mStartParent = null;
                ghostViewPort2.mStartView = null;
                return true;
            }
        };
        this.mView = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    public static GhostViewPort addGhost(View view, ViewGroup viewGroup, Matrix matrix) {
        int i;
        GhostViewHolder ghostViewHolder;
        GhostViewPort ghostViewPort = null;
        if (!(view.getParent() instanceof ViewGroup)) {
            ny61.g("Ghosted views must be parented by a ViewGroup");
            return null;
        }
        GhostViewHolder holder = GhostViewHolder.getHolder(viewGroup);
        GhostViewPort ghostView = getGhostView(view);
        if (ghostView == null || (ghostViewHolder = (GhostViewHolder) ghostView.getParent()) == holder) {
            i = 0;
            ghostViewPort = ghostView;
        } else {
            i = ghostView.mReferences;
            ghostViewHolder.removeView(ghostView);
        }
        if (ghostViewPort == null) {
            if (matrix == null) {
                matrix = new Matrix();
                calculateMatrix(view, viewGroup, matrix);
            }
            ghostViewPort = new GhostViewPort(view);
            ghostViewPort.setMatrix(matrix);
            if (holder == null) {
                holder = new GhostViewHolder(viewGroup);
            } else {
                holder.popToOverlayTop();
            }
            copySize(viewGroup, holder);
            copySize(viewGroup, ghostViewPort);
            holder.addGhostView(ghostViewPort);
            ghostViewPort.mReferences = i;
        } else if (matrix != null) {
            ghostViewPort.setMatrix(matrix);
        }
        ghostViewPort.mReferences++;
        return ghostViewPort;
    }

    public static void calculateMatrix(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        Property property = ViewUtils.a;
        viewGroup2.transformMatrixToGlobal(matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        viewGroup.transformMatrixToLocal(matrix);
    }

    public static void copySize(View view, View view2) {
        int left = view2.getLeft();
        int top = view2.getTop();
        int width = view.getWidth() + view2.getLeft();
        int height = view.getHeight() + view2.getTop();
        Property property = ViewUtils.a;
        view2.setLeftTopRightBottom(left, top, width, height);
    }

    public static GhostViewPort getGhostView(View view) {
        return (GhostViewPort) view.getTag(R.id.ghost_view);
    }

    public static void removeGhost(View view) {
        GhostViewPort ghostView = getGhostView(view);
        if (ghostView != null) {
            int i = ghostView.mReferences - 1;
            ghostView.mReferences = i;
            if (i <= 0) {
                ((GhostViewHolder) ghostView.getParent()).removeView(ghostView);
            }
        }
    }

    public static void setGhostView(View view, GhostViewPort ghostViewPort) {
        view.setTag(R.id.ghost_view, ghostViewPort);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setGhostView(this.mView, this);
        this.mView.getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        View view = this.mView;
        Property property = ViewUtils.a;
        view.setTransitionVisibility(4);
        if (this.mView.getParent() != null) {
            ((View) this.mView.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.mView.getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        View view = this.mView;
        Property property = ViewUtils.a;
        view.setTransitionVisibility(0);
        setGhostView(this.mView, null);
        if (this.mView.getParent() != null) {
            ((View) this.mView.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.enableZ();
        canvas.setMatrix(this.mMatrix);
        View view = this.mView;
        Property property = ViewUtils.a;
        view.setTransitionVisibility(0);
        this.mView.invalidate();
        this.mView.setTransitionVisibility(4);
        drawChild(canvas, this.mView, getDrawingTime());
        canvas.disableZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // androidx.transition.GhostView
    public void reserveEndViewTransition(ViewGroup viewGroup, View view) {
        this.mStartParent = viewGroup;
        this.mStartView = view;
    }

    public void setMatrix(Matrix matrix) {
        this.mMatrix = matrix;
    }

    @Override // android.view.View, androidx.transition.GhostView
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (getGhostView(this.mView) == this) {
            int i2 = i == 0 ? 4 : 0;
            View view = this.mView;
            Property property = ViewUtils.a;
            view.setTransitionVisibility(i2);
        }
    }
}
