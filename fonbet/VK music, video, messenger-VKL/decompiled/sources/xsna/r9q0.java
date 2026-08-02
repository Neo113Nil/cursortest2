package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: UploadBadgeClipPreview.kt */
/* loaded from: classes16.dex */
public final class r9q0 extends GestureDetector.SimpleOnGestureListener {
    public float b;
    public final /* synthetic */ com.vk.clips.design.view.component.video.preview.b c;

    public r9q0(com.vk.clips.design.view.component.video.preview.b bVar) {
        this.c = bVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.b = motionEvent.getX();
        motionEvent.getY();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(f) < 35.0f && Math.abs(f2) < 35.0f) {
            return false;
        }
        com.vk.clips.design.view.component.video.preview.b bVar = this.c;
        bVar.a();
        bVar.e = false;
        gzs<s3q0> gzsVar = bVar.i;
        if (gzsVar == null) {
            return true;
        }
        gzsVar.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = motionEvent != null ? motionEvent.getX() : this.b;
        com.vk.clips.design.view.component.video.preview.b bVar = this.c;
        float x2 = bVar.getX();
        bVar.getWidth();
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT > x2 || x2 > bVar.getWidth()) {
            return true;
        }
        bVar.setX(bVar.getX() + (motionEvent2.getX() - x));
        return true;
    }
}
