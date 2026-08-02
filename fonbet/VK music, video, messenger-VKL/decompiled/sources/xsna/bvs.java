package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.api.InteractiveData;
import one.video.controls.views.VideoShortActions;
import one.video.transform.TransformController;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class bvs implements View.OnTouchListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bvs(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c2, code lost:
    
        if (r4.c != false) goto L118;
     */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        View view3;
        View view4;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                evs evsVar = (evs) obj;
                if (evsVar.l.u.a && evsVar.B()) {
                    return true;
                }
                bmq bmqVar = (bmq) evsVar.X.getValue();
                if (bmqVar.d.a && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
                    bmqVar.b(false, true);
                }
                InteractiveData interactiveData = evsVar.j;
                if ((interactiveData != null ? interactiveData.d : null) != InteractiveData.From.FULLSCREEN) {
                    if ((interactiveData != null ? interactiveData.d : null) == InteractiveData.From.DISCOVER_VIDEO) {
                        break;
                    }
                    return ((GestureDetector) evsVar.R.getValue()).onTouchEvent(motionEvent);
                }
                xcx xcxVar = (xcx) evsVar.T.getValue();
                if (xcxVar.b) {
                    xcxVar.a.D.getTransformController().d(motionEvent);
                }
                ((TransformController) evsVar.S.getValue()).d(motionEvent);
                return ((GestureDetector) evsVar.R.getValue()).onTouchEvent(motionEvent);
            case 1:
                t9k0 t9k0Var = (t9k0) obj;
                if (!t9k0Var.c) {
                    return false;
                }
                if (!t9k0Var.d.a.onTouchEvent(motionEvent)) {
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return false;
                    }
                    yfc0 yfc0Var = t9k0Var.a;
                    if (t9k0Var.c) {
                        int scrollX = yfc0Var.getScrollX();
                        int measuredWidth = (yfc0Var.getMeasuredWidth() / 2) + scrollX;
                        qor qorVar = t9k0Var.b;
                        if (qorVar.getChildCount() > 0) {
                            view2 = qorVar.getChildAt(0);
                            if (view2 == null) {
                                throw new IndexOutOfBoundsException();
                            }
                            if (1 < qorVar.getChildCount()) {
                                float f = measuredWidth;
                                float abs = Math.abs((view2.getX() + (view2.getMeasuredWidth() / 2)) - f);
                                int i2 = 1;
                                while (true) {
                                    int i3 = i2 + 1;
                                    View childAt = qorVar.getChildAt(i2);
                                    if (childAt == null) {
                                        throw new IndexOutOfBoundsException();
                                    }
                                    float abs2 = Math.abs((childAt.getX() + (childAt.getMeasuredWidth() / 2)) - f);
                                    if (Float.compare(abs, abs2) > 0) {
                                        view2 = childAt;
                                        abs = abs2;
                                    }
                                    if (i3 < qorVar.getChildCount()) {
                                        i2 = i3;
                                    }
                                }
                            }
                        } else {
                            view2 = null;
                        }
                        if (qorVar.getChildCount() > 0) {
                            view3 = qorVar.getChildAt(0);
                            if (view3 == null) {
                                throw new IndexOutOfBoundsException();
                            }
                            int i4 = 1;
                            while (i4 < qorVar.getChildCount()) {
                                int i5 = i4 + 1;
                                View childAt2 = qorVar.getChildAt(i4);
                                if (childAt2 == null) {
                                    throw new IndexOutOfBoundsException();
                                }
                                i4 = i5;
                                view3 = childAt2;
                            }
                        } else {
                            view3 = null;
                        }
                        Integer valueOf = view3 != null ? Integer.valueOf(view3.getMeasuredWidth()) : null;
                        if (qorVar.getChildCount() > 0) {
                            view4 = qorVar.getChildAt(0);
                            if (view4 == null) {
                                throw new IndexOutOfBoundsException();
                            }
                        } else {
                            view4 = null;
                        }
                        if ((view4 != null ? Integer.valueOf(view4.getMeasuredWidth()) : null) != null) {
                            if (view4.getX() + r0.intValue() > uq.a(r0.intValue(), 3.0f, 4.0f, scrollX)) {
                                yfc0Var.smoothScrollTo((int) view4.getX(), 0);
                            }
                        }
                        if (valueOf != null && view3.getX() < (yfc0Var.getMeasuredWidth() + scrollX) - ((valueOf.intValue() * 3.0f) / 4.0f)) {
                            yfc0Var.smoothScrollTo((int) view3.getX(), 0);
                        } else if (view2 != null) {
                            float x = view2.getX() - ((yfc0Var.getMeasuredWidth() - view2.getMeasuredWidth()) / 2);
                            if (x < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                x = 0.0f;
                            }
                            yfc0Var.smoothScrollTo((int) x, 0);
                        }
                    }
                }
                return true;
            case 2:
                VideoShortActions videoShortActions = (VideoShortActions) obj;
                int i6 = VideoShortActions.y;
                if (motionEvent.getAction() != 0 || !videoShortActions.u) {
                    return false;
                }
                VideoShortActions.a aVar = videoShortActions.t;
                if (aVar != null) {
                    aVar.n();
                }
                return true;
            default:
                bu1 bu1Var = (bu1) obj;
                if (motionEvent.getAction() != 4) {
                    return false;
                }
                bu1Var.invoke();
                return true;
        }
    }
}
