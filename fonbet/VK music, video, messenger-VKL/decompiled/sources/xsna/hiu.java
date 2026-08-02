package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.groupcalls.GroupCallViewModel;

/* compiled from: GroupCallParticipantView.kt */
/* loaded from: classes7.dex */
public final class hiu extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ giu b;

    public hiu(giu giuVar) {
        this.b = giuVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        CallMemberId P4 = this.b.P4();
        if (P4 == null) {
            GroupCallViewModel.b.getClass();
            GroupCallViewModel.GroupCallViewMode groupCallViewMode = GroupCallViewModel.e;
            GroupCallViewModel.GroupCallViewMode groupCallViewMode2 = GroupCallViewModel.GroupCallViewMode.GridViewMode;
            if (groupCallViewMode == groupCallViewMode2) {
                return false;
            }
            GroupCallViewModel.p(groupCallViewMode2);
            return true;
        }
        GroupCallViewModel.b.getClass();
        liu liuVar = GroupCallViewModel.r;
        if (liuVar.e == null && !P4.equals(liuVar.c)) {
            liuVar.d = null;
            liuVar.c = P4;
            liuVar.f = P4;
            com.vk.voip.ui.c.b.R0(P4);
            liuVar.a();
        }
        GroupCallViewModel.p(GroupCallViewModel.GroupCallViewMode.MainSpeakerAndThumbsViewMode);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        this.b.performLongClick();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        giu giuVar = this.b;
        if (giuVar.isClickable()) {
            giuVar.performClick();
            return false;
        }
        Object parent = giuVar.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }
}
