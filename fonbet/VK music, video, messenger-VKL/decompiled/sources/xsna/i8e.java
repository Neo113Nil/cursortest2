package xsna;

import android.os.SystemClock;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: ClipsFeedPaginationAnalyticsDelegate.kt */
/* loaded from: classes17.dex */
public final class i8e {
    public final vxc a;
    public final wxc b;
    public final fsk0 c;
    public vzm d;
    public Integer e;
    public Long f;

    public i8e() {
        throw null;
    }

    public i8e(androidx.lifecycle.m mVar, vxc vxcVar, wxc wxcVar) {
        fsk0 fsk0Var = qsk0.a;
        this.a = vxcVar;
        this.b = wxcVar;
        this.c = fsk0Var;
        mVar.addObserver(new h8e(this, mVar));
    }

    public final void a(int i, FeedItem feedItem) {
        if (feedItem instanceof vzm) {
            this.d = (vzm) feedItem;
            this.e = Integer.valueOf(i);
            this.f = Long.valueOf(SystemClock.elapsedRealtime());
            return;
        }
        vzm vzmVar = this.d;
        Integer num = this.e;
        Long l = this.f;
        if (vzmVar != null && num != null && l != null) {
            if (num.intValue() == i) {
                b(vzmVar, num.intValue(), Integer.valueOf((int) (SystemClock.elapsedRealtime() - l.longValue())));
            } else {
                b(vzmVar, num.intValue(), null);
            }
        }
        this.d = null;
        this.e = null;
        this.f = null;
    }

    public final void b(vzm vzmVar, int i, Integer num) {
        l5m l5mVar = new l5m(this.c, null, 2);
        l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.CLIPS_END_OF_FEED_REACHED.h(), null, (String) this.a.invoke(), Integer.valueOf(vzmVar.n() ? 1 : 0), (String) this.b.invoke(), Integer.valueOf(i), null, num, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -190, 3, null);
        l5mVar.q();
    }
}
