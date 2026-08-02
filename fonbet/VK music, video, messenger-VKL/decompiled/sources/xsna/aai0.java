package xsna;

import android.content.Context;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.newsfeed.common.helpers.SelectTextActionModeCallback;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SelectTextTouchDelegate.kt */
/* loaded from: classes4.dex */
public final class aai0 extends GestureDetector.SimpleOnGestureListener implements RecyclerView.s {
    public final gzs<ActionMode.Callback> b;
    public final FunctionReferenceImpl c;
    public final GestureDetector d;
    public Long e;

    /* JADX WARN: Multi-variable type inference failed */
    public aai0(Context context, gzs<? extends ActionMode.Callback> gzsVar, gzs<s3q0> gzsVar2) {
        this.b = gzsVar;
        this.c = (FunctionReferenceImpl) gzsVar2;
        this.d = new GestureDetector(context, this);
    }

    public final boolean a() {
        ActionMode actionMode;
        ActionMode.Callback invoke = this.b.invoke();
        SelectTextActionModeCallback selectTextActionModeCallback = invoke instanceof SelectTextActionModeCallback ? (SelectTextActionModeCallback) invoke : null;
        if (selectTextActionModeCallback != null && (actionMode = selectTextActionModeCallback.d) != null) {
            actionMode.finish();
            return true;
        }
        Long l = this.e;
        if (l == null) {
            return false;
        }
        if (System.currentTimeMillis() - l.longValue() <= ViewConfiguration.getDoubleTapTimeout()) {
            return true;
        }
        this.e = null;
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        ActionMode actionMode;
        if (!mnh0.q(motionEvent)) {
            return false;
        }
        ActionMode.Callback invoke = this.b.invoke();
        SelectTextActionModeCallback selectTextActionModeCallback = invoke instanceof SelectTextActionModeCallback ? (SelectTextActionModeCallback) invoke : null;
        if (selectTextActionModeCallback == null || (actionMode = selectTextActionModeCallback.d) == null) {
            return false;
        }
        actionMode.finish();
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        this.c.invoke();
        this.e = Long.valueOf(System.currentTimeMillis());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return a();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void h(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void f(RecyclerView recyclerView, MotionEvent motionEvent) {
    }
}
