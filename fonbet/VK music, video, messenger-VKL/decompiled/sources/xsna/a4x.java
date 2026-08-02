package xsna;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;

/* compiled from: InsetDialogOnTouchListener.java */
/* loaded from: classes13.dex */
public final class a4x implements View.OnTouchListener {

    @NonNull
    public final Dialog b;
    public final int c;
    public final int d;

    public a4x(@NonNull Dialog dialog, @NonNull Rect rect) {
        this.b = dialog;
        this.c = rect.left;
        this.d = rect.top;
        ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@NonNull View view, @NonNull MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.c;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.d, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        view.performClick();
        return this.b.onTouchEvent(obtain);
    }
}
