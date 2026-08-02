package xsna;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.vk.libvideo.design.view.recommended.RecommendedBottomView;
import com.vk.libvideo.live.impl.views.gifts.LiveBottomSheetBehavior;

/* compiled from: RecommendedBottomView.java */
/* loaded from: classes2.dex */
public final class bcf0 implements View.OnTouchListener {
    public final /* synthetic */ RecommendedBottomView b;

    public bcf0(RecommendedBottomView recommendedBottomView) {
        this.b = recommendedBottomView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        RecommendedBottomView recommendedBottomView = this.b;
        if (fdp0.a(rawX, rawY, (ViewGroup) recommendedBottomView.getParent(), new edp0(true))) {
            return false;
        }
        LiveBottomSheetBehavior liveBottomSheetBehavior = recommendedBottomView.B;
        int i = liveBottomSheetBehavior.e;
        if (i != 5 && i != 1 && i != 2) {
            liveBottomSheetBehavior.F(5);
        }
        return true;
    }
}
