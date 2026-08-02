package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import xsna.wtf;

/* compiled from: ClipsWrapperStatisticsMviStateMapper.kt */
/* loaded from: classes17.dex */
public final class xtf {
    public final xne a;
    public final zof b;
    public final boolean c;
    public final jwe d;

    public xtf(xne xneVar, zof zofVar, boolean z, jwe jweVar) {
        this.a = xneVar;
        this.b = zofVar;
        this.c = z;
        this.d = jweVar;
    }

    public final boolean a(ClipFeedTab clipFeedTab) {
        if (clipFeedTab instanceof ClipFeedTab.LikedClips) {
            return false;
        }
        if (clipFeedTab instanceof ClipFeedTab.Profile) {
            return true;
        }
        return (clipFeedTab instanceof ClipFeedTab.SingleClip) && (!this.c || this.b.H().d());
    }

    public final wtf b(wtf wtfVar, zrf zrfVar) {
        if (!this.c || !wtfVar.b) {
            return wtfVar;
        }
        wrf h = zrfVar.h();
        return a(h != null ? h.c() : null) ? wtf.b.i : wtf.c.i;
    }
}
