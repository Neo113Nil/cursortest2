package xsna;

import android.view.MotionEvent;
import com.vk.stories.design.view.editor.SelectRangeWaveFormView;

/* compiled from: SelectRangeWaveFormView.kt */
/* loaded from: classes6.dex */
public final class o9i0 extends nqj0 {
    public final /* synthetic */ SelectRangeWaveFormView b;

    public o9i0(SelectRangeWaveFormView selectRangeWaveFormView) {
        this.b = selectRangeWaveFormView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        SelectRangeWaveFormView selectRangeWaveFormView = this.b;
        if (selectRangeWaveFormView.K == 0) {
            return true;
        }
        selectRangeWaveFormView.K = 5;
        selectRangeWaveFormView.U = iah0.a((-f) / 50.0f);
        SelectRangeWaveFormView.i(selectRangeWaveFormView);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        float recommendedTimeX;
        float leftBound;
        float rightBound;
        SelectRangeWaveFormView selectRangeWaveFormView = this.b;
        recommendedTimeX = selectRangeWaveFormView.getRecommendedTimeX();
        if (selectRangeWaveFormView.K != 0) {
            return true;
        }
        float f = SelectRangeWaveFormView.G0;
        float f2 = recommendedTimeX - f;
        float f3 = recommendedTimeX + f;
        float x = motionEvent.getX();
        if (f2 > x || x > f3) {
            return true;
        }
        float f4 = selectRangeWaveFormView.V;
        float f5 = f4 - SelectRangeWaveFormView.F0;
        float y = motionEvent.getY();
        if (f5 > y || y > f4) {
            return true;
        }
        float f6 = (selectRangeWaveFormView.L + selectRangeWaveFormView.P) - selectRangeWaveFormView.N;
        leftBound = selectRangeWaveFormView.getLeftBound();
        rightBound = selectRangeWaveFormView.getRightBound();
        selectRangeWaveFormView.setCommonOffset(bn10.b(f6, leftBound, rightBound));
        selectRangeWaveFormView.invalidate();
        m9i0 m9i0Var = selectRangeWaveFormView.b;
        if (m9i0Var != null) {
            m9i0Var.h1();
        }
        selectRangeWaveFormView.o();
        return true;
    }
}
