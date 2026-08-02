package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.ChatClipsReplyFragment;
import xsna.rhz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class apb implements View.OnTouchListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ GestureDetector c;

    public /* synthetic */ apb(GestureDetector gestureDetector, int i) {
        this.b = i;
        this.c = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        rhz0 rhz0Var;
        int i = this.b;
        GestureDetector gestureDetector = this.c;
        switch (i) {
            case 0:
                int i2 = ChatClipsReplyFragment.T;
                gestureDetector.onTouchEvent(motionEvent);
                break;
            default:
                rhz0.b bVar = (rhz0.b) gestureDetector;
                int action = motionEvent.getAction();
                if (action == 0) {
                    bVar.onTouchEvent(motionEvent);
                    break;
                } else if (action == 1) {
                    if (bVar.b == null) {
                        gu8.c(null, "MraidWebView$ViewGestureDetector: View's onUserClick() is not registered");
                        break;
                    } else {
                        gu8.c(null, "MraidWebView$ViewGestureDetector: Gestures - user clicked");
                        ((rhz0) bVar.b.c).f = true;
                        break;
                    }
                } else if (action == 2 && (rhz0Var = bVar.a) != null) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (x >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && x <= rhz0Var.getWidth() && y >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && y <= rhz0Var.getHeight()) {
                        bVar.onTouchEvent(motionEvent);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
