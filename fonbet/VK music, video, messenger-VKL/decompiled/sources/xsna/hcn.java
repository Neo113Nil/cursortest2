package xsna;

import android.view.MotionEvent;

/* compiled from: DismissingTouchListener.kt */
/* loaded from: classes3.dex */
public final class hcn extends nqj0 {
    public final /* synthetic */ gcn b;

    public hcn(gcn gcnVar) {
        this.b = gcnVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        gcn gcnVar = this.b;
        com.vk.photoviewer.d dVar = gcnVar.b;
        if (!gcnVar.f || Math.abs(f2) <= 1000.0f || Math.abs(gcnVar.h) <= dVar.a.w.getHeight() / 10) {
            return false;
        }
        if (!gcnVar.e) {
            gcnVar.e = true;
            gcnVar.g = false;
            dVar.a.g(true);
        }
        return true;
    }
}
