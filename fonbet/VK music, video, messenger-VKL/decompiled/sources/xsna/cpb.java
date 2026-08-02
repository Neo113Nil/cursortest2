package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.ChatClipsReplyFragment;

/* compiled from: ChatClipsReplyFragment.kt */
/* loaded from: classes2.dex */
public final class cpb extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ ChatClipsReplyFragment b;

    public cpb(ChatClipsReplyFragment chatClipsReplyFragment) {
        this.b = chatClipsReplyFragment;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = motionEvent2.getX();
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float pow = (float) Math.pow(x - (motionEvent != null ? motionEvent.getX() : 0.0f), 2);
        float y = motionEvent2.getY();
        if (motionEvent != null) {
            f3 = motionEvent.getY();
        }
        float sqrt = (float) Math.sqrt(pow + ((float) Math.pow(y - f3, r4)));
        if ((Math.abs(f) <= 1500.0f && Math.abs(f2) <= 1500.0f) || sqrt <= 100.0f) {
            return false;
        }
        try {
            this.b.tn();
            s3q0 s3q0Var = s3q0.a;
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        try {
            this.b.tn();
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
        return super.onSingleTapConfirmed(motionEvent);
    }
}
