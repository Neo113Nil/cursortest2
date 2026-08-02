package xsna;

import com.vk.clips.sdk.shared.api.recom.ShortVideoMyTargetMapperTracker;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import org.chromium.net.NetError;

/* compiled from: ClipsMyTargetMapperTracker.kt */
/* loaded from: classes17.dex */
public final class ime implements ShortVideoMyTargetMapperTracker {
    public final oxc a;

    public ime(fc fcVar, oxc oxcVar) {
        this.a = oxcVar;
    }

    @Override // com.vk.clips.sdk.shared.api.recom.ShortVideoMyTargetMapperTracker
    public final void a(ShortVideoMyTargetMapperTracker.MyTargetType myTargetType, Throwable th) {
        int i = ClipFeedListFragment.a2;
        fsk0 fsk0Var = qsk0.a;
        if (fsk0Var == null) {
            return;
        }
        l5m l5mVar = new l5m(fsk0Var, null, 2);
        String h = DevNullEventKey.CLIPS_FEED_BAD_RESPONSE.h();
        String str = (String) this.a.invoke();
        String h2 = myTargetType.h();
        StringBuilder sb = new StringBuilder();
        Throwable th2 = th;
        do {
            sb.append(String.valueOf(th2));
            sb.append("\n");
            th2 = th2.getCause();
            if (th2 == null) {
                break;
            }
        } while (!th2.equals(th2.getCause()));
        l5mVar.g = new SchemeStat$TypeDevNullItem(h, erm0.D0(1024, sb.toString()), "mytarget_item_parse_fail", null, str, null, h2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -88, 3, null);
        l5mVar.q();
    }

    @Override // com.vk.clips.sdk.shared.api.recom.ShortVideoMyTargetMapperTracker
    public final void b(long j, String str) {
        int i = ClipFeedListFragment.a2;
        fsk0 fsk0Var = qsk0.a;
        if (fsk0Var == null) {
            return;
        }
        l5m l5mVar = new l5m(fsk0Var, null, 2);
        l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.CLIPS_FEED_BAD_RESPONSE.h(), null, "mytarget_item_empty_video_url", null, (String) this.a.invoke(), null, str, null, String.valueOf(j), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, NetError.ERR_UNEXPECTED_SECURITY_LIBRARY_STATUS, 3, null);
        l5mVar.q();
    }
}
