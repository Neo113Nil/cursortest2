package xsna;

import android.graphics.SurfaceTexture;
import android.os.Message;
import android.view.Surface;
import xsna.jhu0;

/* compiled from: RenderUtils.java */
/* loaded from: classes3.dex */
public final class syf0 extends czx0 {
    @Override // xsna.czx0, android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        tyf0 tyf0Var = (tyf0) this.a.get();
        if (tyf0Var == null) {
            return;
        }
        if (i == 0) {
            tyf0Var.m((Surface) message.obj);
            return;
        }
        if (i == 1) {
            tyf0Var.p((SurfaceTexture) message.obj);
            return;
        }
        if (i == 2) {
            tyf0Var.l(message.arg1, message.arg2);
            return;
        }
        if (i == 3) {
            tyf0Var.o();
            return;
        }
        if (i == 4) {
            tyf0Var.k((message.arg1 << 32) | (message.arg2 & 4294967295L));
        } else if (i != 5) {
            super.handleMessage(message);
        } else {
            tyf0Var.q((jhu0.b) message.obj);
        }
    }
}
