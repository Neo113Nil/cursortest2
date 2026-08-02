package xsna;

import com.vk.channels.api.Channel;
import com.vk.core.exceptions.DisposableException;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.groups.GroupPrivacy;
import com.vk.im.ui.components.msg_view.header.MsgViewHeaderComponent;
import com.vk.photos.ui.editalbum.domain.e;
import com.vkontakte.android.R;
import xsna.k2a0;
import xsna.tsb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class g9b implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g9b(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                i9b i9bVar = (i9b) this.c;
                Channel channel = i9bVar.v;
                if ((channel != null ? channel.z : null) == ChannelType.COMMUNITY_CHANNEL) {
                    if ((channel != null ? channel.B : null) == GroupPrivacy.CLOSED) {
                        i9bVar.i.c(i9bVar.f.getString(R.string.vkim_channels_subscription_request_sent), null);
                        break;
                    }
                }
                break;
            case 1:
                ((com.vk.photos.ui.editalbum.domain.c) this.c).T(e.b.b);
                break;
            case 2:
                ((MsgViewHeaderComponent) this.c).k.a();
                break;
            case 3:
                ((i340) this.c).c();
                break;
            case 4:
                ((gzs) this.c).invoke();
                break;
            case 5:
                ((yp80) this.c).onError(new DisposableException());
                break;
            case 6:
                h2a0 h2a0Var = (h2a0) this.c;
                h2a0Var.h1 = true;
                h2a0Var.Zn(k2a0.c.a);
                h2a0Var.dismiss();
                break;
            case 7:
                ((lsb0) this.c).U(tsb0.b.a);
                break;
            case 8:
                ((com.vk.newsfeed.impl.items.posting.item.modals.feed_posting.data.b) this.c).a();
                break;
            default:
                ((com.vk.voip.ui.hint.a) this.c).c();
                break;
        }
    }
}
