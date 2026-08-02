package xsna;

import android.view.View;
import com.vk.libvideo.design.view.live.LiveView;

/* compiled from: LiveView.java */
/* loaded from: classes2.dex */
public final class unz implements View.OnClickListener {
    public final /* synthetic */ LiveView b;

    public unz(LiveView liveView) {
        this.b = liveView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        oiz oizVar = this.b.Q;
        if (oizVar != null) {
            oizVar.close();
        }
    }
}
