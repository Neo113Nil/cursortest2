package xsna;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/* compiled from: WriteBarAudioHolder.kt */
/* loaded from: classes7.dex */
public final class t0y0 implements View.OnTouchListener {
    public final /* synthetic */ com.vk.writebar.g b;

    public t0y0(com.vk.writebar.g gVar) {
        this.b = gVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        com.vk.writebar.g gVar = this.b;
        ImageView sendButton = gVar.b.getSendButton();
        if (bwt0.K(sendButton)) {
            sendButton.performClick();
            return false;
        }
        h1y0 h1y0Var = gVar.d;
        if (h1y0Var != null) {
            return h1y0Var.a(motionEvent);
        }
        return false;
    }
}
