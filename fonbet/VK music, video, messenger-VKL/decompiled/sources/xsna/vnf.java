package xsna;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.vk.clips.design.view.feed.item.owner.ClipSubscribeBtnView;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vkontakte.android.R;

/* compiled from: ClipsViewProviderImpl.kt */
/* loaded from: classes17.dex */
public final class vnf implements unf {
    @Override // xsna.unf
    public final vcd a(Context context) {
        KeyEvent.Callback inflate = e3m.b(context).inflate(R.layout.clips_feed_item_live_subscribe_button, (ViewGroup) null, false);
        if (inflate instanceof vcd) {
            return (vcd) inflate;
        }
        return null;
    }

    @Override // xsna.unf
    public final uoc b(Context context) {
        ClipFeedSideControlsView clipFeedSideControlsView = new ClipFeedSideControlsView(context, null, 6);
        clipFeedSideControlsView.n(ClipFeedSideControlsView.t);
        return clipFeedSideControlsView;
    }

    @Override // xsna.unf
    public final ucd c(vcd vcdVar, wmf wmfVar) {
        return new ClipSubscribeBtnView.a(wmfVar != null ? wmfVar.Me() : null, vcdVar);
    }
}
