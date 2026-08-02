package xsna;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: MsgPartAudioVc.kt */
/* loaded from: classes2.dex */
public abstract class go30 implements hux0 {
    public ConstraintLayout b;
    public a c;

    /* compiled from: MsgPartAudioVc.kt */
    public interface a {
        void a();
    }

    public final Context a() {
        ConstraintLayout constraintLayout = this.b;
        if (constraintLayout == null) {
            constraintLayout = null;
        }
        return constraintLayout.getContext();
    }

    @Override // xsna.hux0
    public final void X3() {
    }
}
