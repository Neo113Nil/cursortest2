package one.video.exo.offline;

import android.os.Handler;
import android.os.Looper;
import xsna.mco;

/* compiled from: DownloadsProgressHelper.kt */
/* loaded from: classes11.dex */
public final class g {
    public final a a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final mco c = new mco(this, 0);

    /* compiled from: DownloadsProgressHelper.kt */
    public interface a {
        void a();
    }

    public g(a aVar) {
        this.a = aVar;
    }
}
