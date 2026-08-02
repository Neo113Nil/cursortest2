package xsna;

import com.my.tracker.MyTracker;
import com.my.tracker.miniapps.MiniAppEvent;

/* compiled from: MailMyTracker.kt */
/* loaded from: classes3.dex */
public final class tc00 implements gzs<s3q0> {
    public final /* synthetic */ MiniAppEvent b;

    public tc00(MiniAppEvent miniAppEvent) {
        this.b = miniAppEvent;
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        MyTracker.trackMiniAppEvent(this.b);
        return s3q0.a;
    }
}
