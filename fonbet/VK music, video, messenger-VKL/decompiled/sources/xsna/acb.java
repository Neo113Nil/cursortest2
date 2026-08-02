package xsna;

import android.os.Parcelable;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.channels.api.Channel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.HintId;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.dto.music.Playlist;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import java.util.List;
import xsna.ybb;
import xsna.zbb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class acb implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Parcelable g;
    public final /* synthetic */ Object h;

    public /* synthetic */ acb(int i, qs40 qs40Var, MusicPickerState musicPickerState, MusicPickerList musicPickerList, UserId userId, String str, Playlist playlist) {
        this.c = i;
        this.e = qs40Var;
        this.f = musicPickerList;
        this.g = userId;
        this.d = str;
        this.h = playlist;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        UserId userId;
        int i = this.b;
        Object obj2 = this.h;
        Parcelable parcelable = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                zbb zbbVar = (zbb) obj4;
                zbb.b bVar = (zbb.b) obj3;
                MsgTextFormat msgTextFormat = (MsgTextFormat) parcelable;
                List list = (List) obj2;
                ChannelMsgSendConfig channelMsgSendConfig = (ChannelMsgSendConfig) obj;
                boolean a = ((e4w) zbbVar.t.getValue()).b.b().a(HintId.STORIES_CHANNEL_POST_AUTOSTORY.getId());
                int i2 = this.c;
                if (a && i2 == 0) {
                    Channel b = zbbVar.h.b();
                    if ((b != null ? b.z : null) == ChannelType.COMMUNITY_CHANNEL) {
                        bVar.f(channelMsgSendConfig, false, true);
                        break;
                    }
                }
                Serializer.c<MsgFromChannel> cVar = MsgFromChannel.CREATOR;
                MsgFromChannel b2 = MsgFromChannel.a.b(i2, this.d, msgTextFormat, list);
                com.vk.channels.impl.channel_screen.send_msg.a aVar = zbbVar.q;
                zbbVar.O(new ybb.f(b2, channelMsgSendConfig, (aVar != null ? aVar : null).I()));
            default:
                qs40 qs40Var = (qs40) obj4;
                MusicPickerList musicPickerList = (MusicPickerList) obj3;
                UserId userId2 = (UserId) parcelable;
                Playlist playlist = (Playlist) obj2;
                Throwable th = (Throwable) obj;
                int i3 = this.c;
                if (i3 == 0) {
                    VKApiExecutionException vKApiExecutionException = th instanceof VKApiExecutionException ? (VKApiExecutionException) th : null;
                    if (vKApiExecutionException == null || vKApiExecutionException.s() != 201) {
                        qs40Var.T(new st40(musicPickerList, th));
                    } else {
                        qs40Var.T(new xt40(true));
                        qs40Var.i.a.e.b(qs40Var.g.a((playlist == null || (userId = playlist.c) == null) ? userId2 : userId, this.d, playlist, i3, false).subscribe(new gf0(new bp7(23, qs40Var, musicPickerList), 29), new rkz(new os40(i3, qs40Var, musicPickerList), 7)));
                    }
                } else {
                    qs40Var.T(new yt40(musicPickerList, th));
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ acb(zbb zbbVar, int i, zbb.b bVar, String str, MsgTextFormat msgTextFormat, List list) {
        this.e = zbbVar;
        this.c = i;
        this.f = bVar;
        this.d = str;
        this.g = msgTextFormat;
        this.h = list;
    }
}
