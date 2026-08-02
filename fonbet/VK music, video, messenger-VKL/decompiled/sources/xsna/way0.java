package xsna;

import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes12.dex */
public final class way0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ way0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((awv) this.c).a.b();
                break;
            case 1:
                ((hnz0) this.c).i.b(new ConnectionResult(4));
                break;
            default:
                ((CastSeekBar) this.c).sendAccessibilityEvent(4);
                break;
        }
    }
}
