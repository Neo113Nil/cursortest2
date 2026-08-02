package ru.ok.android.webrtc;

import android.util.DisplayMetrics;
import org.webrtc.Size;
import xsna.ux3;

/* loaded from: classes9.dex */
public final class n implements Runnable {
    public final /* synthetic */ o a;

    public n(o oVar) {
        this.a = oVar;
    }

    public final void a() {
        LocalMediaStreamAdapter localMediaStreamAdapter;
        DisplayMetrics displayMetrics;
        int i;
        Size size;
        o oVar = this.a;
        if (oVar.a == null) {
            return;
        }
        try {
            oVar.d.b();
            localMediaStreamAdapter = oVar.d;
            displayMetrics = localMediaStreamAdapter.A;
            i = displayMetrics.widthPixels;
            size = localMediaStreamAdapter.B;
        } catch (Throwable th) {
            oVar.d.n.reportException("OKRTCLmsAdapter", "Error on screen share size update", th);
        }
        if (i == size.width) {
            if (displayMetrics.heightPixels != size.height) {
            }
            oVar.d.a(oVar.a);
        }
        localMediaStreamAdapter.n.log("OKRTCLmsAdapter", "Screen size did change" + oVar.d.B.width + "x" + oVar.d.B.height + "->" + oVar.d.A.widthPixels + "x" + oVar.d.A.heightPixels);
        LocalMediaStreamAdapter localMediaStreamAdapter2 = oVar.d;
        Size size2 = localMediaStreamAdapter2.B;
        DisplayMetrics displayMetrics2 = localMediaStreamAdapter2.A;
        int i2 = displayMetrics2.widthPixels;
        size2.width = i2;
        int i3 = displayMetrics2.heightPixels;
        size2.height = i3;
        oVar.a.onScreenSizeChanged(i2, i3);
        oVar.d.a(oVar.a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.d.g.execute(new ux3(this, 11));
        } catch (Throwable th) {
            this.a.d.n.logException("OKRTCLmsAdapter", "Unexpected executor usage error", th);
        }
    }
}
